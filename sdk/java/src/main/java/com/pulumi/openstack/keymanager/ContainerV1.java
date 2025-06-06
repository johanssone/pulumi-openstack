// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.openstack.keymanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.openstack.Utilities;
import com.pulumi.openstack.keymanager.ContainerV1Args;
import com.pulumi.openstack.keymanager.inputs.ContainerV1State;
import com.pulumi.openstack.keymanager.outputs.ContainerV1Acl;
import com.pulumi.openstack.keymanager.outputs.ContainerV1Consumer;
import com.pulumi.openstack.keymanager.outputs.ContainerV1SecretRef;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a V1 Barbican container resource within OpenStack.
 * 
 * ## Example Usage
 * 
 * ### Simple container
 * 
 * A container with the TLS certificates.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.openstack.keymanager.SecretV1;
 * import com.pulumi.openstack.keymanager.SecretV1Args;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.FileArgs;
 * import com.pulumi.openstack.keymanager.ContainerV1;
 * import com.pulumi.openstack.keymanager.ContainerV1Args;
 * import com.pulumi.openstack.keymanager.inputs.ContainerV1SecretRefArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var certificate1 = new SecretV1("certificate1", SecretV1Args.builder()
 *             .name("certificate")
 *             .payload(StdFunctions.file(FileArgs.builder()
 *                 .input("cert.pem")
 *                 .build()).result())
 *             .secretType("certificate")
 *             .payloadContentType("text/plain")
 *             .build());
 * 
 *         var privateKey1 = new SecretV1("privateKey1", SecretV1Args.builder()
 *             .name("private_key")
 *             .payload(StdFunctions.file(FileArgs.builder()
 *                 .input("cert-key.pem")
 *                 .build()).result())
 *             .secretType("private")
 *             .payloadContentType("text/plain")
 *             .build());
 * 
 *         var intermediate1 = new SecretV1("intermediate1", SecretV1Args.builder()
 *             .name("intermediate")
 *             .payload(StdFunctions.file(FileArgs.builder()
 *                 .input("intermediate-ca.pem")
 *                 .build()).result())
 *             .secretType("certificate")
 *             .payloadContentType("text/plain")
 *             .build());
 * 
 *         var tls1 = new ContainerV1("tls1", ContainerV1Args.builder()
 *             .name("tls")
 *             .type("certificate")
 *             .secretRefs(            
 *                 ContainerV1SecretRefArgs.builder()
 *                     .name("certificate")
 *                     .secretRef(certificate1.secretRef())
 *                     .build(),
 *                 ContainerV1SecretRefArgs.builder()
 *                     .name("private_key")
 *                     .secretRef(privateKey1.secretRef())
 *                     .build(),
 *                 ContainerV1SecretRefArgs.builder()
 *                     .name("intermediates")
 *                     .secretRef(intermediate1.secretRef())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Container with the ACL
 * 
 * &gt; **Note** Only read ACLs are supported
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.openstack.keymanager.ContainerV1;
 * import com.pulumi.openstack.keymanager.ContainerV1Args;
 * import com.pulumi.openstack.keymanager.inputs.ContainerV1SecretRefArgs;
 * import com.pulumi.openstack.keymanager.inputs.ContainerV1AclArgs;
 * import com.pulumi.openstack.keymanager.inputs.ContainerV1AclReadArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tls1 = new ContainerV1("tls1", ContainerV1Args.builder()
 *             .name("tls")
 *             .type("certificate")
 *             .secretRefs(            
 *                 ContainerV1SecretRefArgs.builder()
 *                     .name("certificate")
 *                     .secretRef(certificate1.secretRef())
 *                     .build(),
 *                 ContainerV1SecretRefArgs.builder()
 *                     .name("private_key")
 *                     .secretRef(privateKey1.secretRef())
 *                     .build(),
 *                 ContainerV1SecretRefArgs.builder()
 *                     .name("intermediates")
 *                     .secretRef(intermediate1.secretRef())
 *                     .build())
 *             .acl(ContainerV1AclArgs.builder()
 *                 .read(ContainerV1AclReadArgs.builder()
 *                     .projectAccess(false)
 *                     .users(                    
 *                         "userid1",
 *                         "userid2")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Containers can be imported using the container id (the last part of the container reference), e.g.:
 * 
 * ```sh
 * $ pulumi import openstack:keymanager/containerV1:ContainerV1 container_1 0c6cd26a-c012-4d7b-8034-057c0f1c2953
 * ```
 * 
 */
@ResourceType(type="openstack:keymanager/containerV1:ContainerV1")
public class ContainerV1 extends com.pulumi.resources.CustomResource {
    /**
     * Allows to control an access to a container. Currently only
     * the `read` operation is supported. If not specified, the container is
     * accessible project wide. The `read` structure is described below.
     * 
     */
    @Export(name="acl", refs={ContainerV1Acl.class}, tree="[0]")
    private Output<ContainerV1Acl> acl;

    /**
     * @return Allows to control an access to a container. Currently only
     * the `read` operation is supported. If not specified, the container is
     * accessible project wide. The `read` structure is described below.
     * 
     */
    public Output<ContainerV1Acl> acl() {
        return this.acl;
    }
    /**
     * The list of the container consumers. The structure is described below.
     * 
     */
    @Export(name="consumers", refs={List.class,ContainerV1Consumer.class}, tree="[0,1]")
    private Output<List<ContainerV1Consumer>> consumers;

    /**
     * @return The list of the container consumers. The structure is described below.
     * 
     */
    public Output<List<ContainerV1Consumer>> consumers() {
        return this.consumers;
    }
    /**
     * The container reference / where to find the container.
     * 
     */
    @Export(name="containerRef", refs={String.class}, tree="[0]")
    private Output<String> containerRef;

    /**
     * @return The container reference / where to find the container.
     * 
     */
    public Output<String> containerRef() {
        return this.containerRef;
    }
    /**
     * The date the container was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date the container was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The creator of the container.
     * 
     */
    @Export(name="creatorId", refs={String.class}, tree="[0]")
    private Output<String> creatorId;

    /**
     * @return The creator of the container.
     * 
     */
    public Output<String> creatorId() {
        return this.creatorId;
    }
    /**
     * Human-readable name for the Container. Does not have
     * to be unique.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human-readable name for the Container. Does not have
     * to be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The region in which to obtain the V1 KeyManager client.
     * A KeyManager client is needed to create a container. If omitted, the
     * `region` argument of the provider is used. Changing this creates a new
     * V1 container.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region in which to obtain the V1 KeyManager client.
     * A KeyManager client is needed to create a container. If omitted, the
     * `region` argument of the provider is used. Changing this creates a new
     * V1 container.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * A set of dictionaries containing references to secrets. The structure is described
     * below.
     * 
     */
    @Export(name="secretRefs", refs={List.class,ContainerV1SecretRef.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ContainerV1SecretRef>> secretRefs;

    /**
     * @return A set of dictionaries containing references to secrets. The structure is described
     * below.
     * 
     */
    public Output<Optional<List<ContainerV1SecretRef>>> secretRefs() {
        return Codegen.optional(this.secretRefs);
    }
    /**
     * The status of the container.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the container.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Used to indicate the type of container. Must be one of `generic`, `rsa` or `certificate`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Used to indicate the type of container. Must be one of `generic`, `rsa` or `certificate`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The date the container was last updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The date the container was last updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerV1(java.lang.String name) {
        this(name, ContainerV1Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerV1(java.lang.String name, ContainerV1Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerV1(java.lang.String name, ContainerV1Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("openstack:keymanager/containerV1:ContainerV1", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ContainerV1(java.lang.String name, Output<java.lang.String> id, @Nullable ContainerV1State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("openstack:keymanager/containerV1:ContainerV1", name, state, makeResourceOptions(options, id), false);
    }

    private static ContainerV1Args makeArgs(ContainerV1Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ContainerV1Args.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContainerV1 get(java.lang.String name, Output<java.lang.String> id, @Nullable ContainerV1State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerV1(name, id, state, options);
    }
}
