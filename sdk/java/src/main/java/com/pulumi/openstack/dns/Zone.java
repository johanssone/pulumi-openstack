// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.openstack.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.openstack.Utilities;
import com.pulumi.openstack.dns.ZoneArgs;
import com.pulumi.openstack.dns.inputs.ZoneState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a DNS zone in the OpenStack DNS Service.
 * 
 * ## Example Usage
 * 
 * ### Automatically detect the correct network
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.openstack.dns.Zone;
 * import com.pulumi.openstack.dns.ZoneArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var exampleCom = new Zone("exampleCom", ZoneArgs.builder()
 *             .name("example.com.")
 *             .email("jdoe}{@literal @}{@code example.com")
 *             .description("An example zone")
 *             .ttl(3000)
 *             .type("PRIMARY")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the zone ID with optional project ID:
 * 
 * ```sh
 * $ pulumi import openstack:dns/zone:Zone zone_1 zone_id
 * ```
 * 
 * ```sh
 * $ pulumi import openstack:dns/zone:Zone zone_1 zone_id/project_id
 * ```
 * 
 */
@ResourceType(type="openstack:dns/zone:Zone")
public class Zone extends com.pulumi.resources.CustomResource {
    /**
     * Attributes for the DNS Service scheduler.
     * Changing this creates a new zone.
     * 
     */
    @Export(name="attributes", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> attributes;

    /**
     * @return Attributes for the DNS Service scheduler.
     * Changing this creates a new zone.
     * 
     */
    public Output<Optional<Map<String,String>>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * A description of the zone.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the zone.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Disable wait for zone to reach ACTIVE
     * status. The check is enabled by default. If this argument is true, zone
     * will be considered as created/updated if OpenStack request returned success.
     * 
     */
    @Export(name="disableStatusCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableStatusCheck;

    /**
     * @return Disable wait for zone to reach ACTIVE
     * status. The check is enabled by default. If this argument is true, zone
     * will be considered as created/updated if OpenStack request returned success.
     * 
     */
    public Output<Optional<Boolean>> disableStatusCheck() {
        return Codegen.optional(this.disableStatusCheck);
    }
    /**
     * The email contact for the zone record.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return The email contact for the zone record.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * An array of master DNS servers. For when `type` is
     * `SECONDARY`.
     * 
     */
    @Export(name="masters", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> masters;

    /**
     * @return An array of master DNS servers. For when `type` is
     * `SECONDARY`.
     * 
     */
    public Output<Optional<List<String>>> masters() {
        return Codegen.optional(this.masters);
    }
    /**
     * The name of the zone. Note the `.` at the end of the name.
     * Changing this creates a new DNS zone.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the zone. Note the `.` at the end of the name.
     * Changing this creates a new DNS zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project DNS zone is created
     * for, sets `X-Auth-Sudo-Tenant-ID` header (requires an assigned
     * user role in target project).
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The ID of the project DNS zone is created
     * for, sets `X-Auth-Sudo-Tenant-ID` header (requires an assigned
     * user role in target project).
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The region in which to obtain the V2 DNS client.
     * If omitted, the `region` argument of the provider is used.
     * Changing this creates a new DNS zone.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region in which to obtain the V2 DNS client.
     * If omitted, the `region` argument of the provider is used.
     * Changing this creates a new DNS zone.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The time to live (TTL) of the zone.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    /**
     * @return The time to live (TTL) of the zone.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * The type of zone. Can either be `PRIMARY` or `SECONDARY`.
     * Changing this creates a new zone.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of zone. Can either be `PRIMARY` or `SECONDARY`.
     * Changing this creates a new zone.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Map of additional options. Changing this creates a
     * new zone.
     * 
     */
    @Export(name="valueSpecs", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> valueSpecs;

    /**
     * @return Map of additional options. Changing this creates a
     * new zone.
     * 
     */
    public Output<Optional<Map<String,String>>> valueSpecs() {
        return Codegen.optional(this.valueSpecs);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Zone(java.lang.String name) {
        this(name, ZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Zone(java.lang.String name, @Nullable ZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Zone(java.lang.String name, @Nullable ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("openstack:dns/zone:Zone", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Zone(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("openstack:dns/zone:Zone", name, state, makeResourceOptions(options, id), false);
    }

    private static ZoneArgs makeArgs(@Nullable ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZoneArgs.Empty : args;
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
    public static Zone get(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, state, options);
    }
}
