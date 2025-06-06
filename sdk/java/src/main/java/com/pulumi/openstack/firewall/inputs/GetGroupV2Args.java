// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.openstack.firewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupV2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupV2Args Empty = new GetGroupV2Args();

    /**
     * Administrative up/down status for the firewall group.
     * 
     */
    @Import(name="adminStateUp")
    private @Nullable Output<Boolean> adminStateUp;

    /**
     * @return Administrative up/down status for the firewall group.
     * 
     */
    public Optional<Output<Boolean>> adminStateUp() {
        return Optional.ofNullable(this.adminStateUp);
    }

    /**
     * Human-readable description of the firewall group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human-readable description of the firewall group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The egress policy ID of the firewall group.
     * 
     */
    @Import(name="egressFirewallPolicyId")
    private @Nullable Output<String> egressFirewallPolicyId;

    /**
     * @return The egress policy ID of the firewall group.
     * 
     */
    public Optional<Output<String>> egressFirewallPolicyId() {
        return Optional.ofNullable(this.egressFirewallPolicyId);
    }

    /**
     * The ID of the firewall group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The ID of the firewall group.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The ingress policy ID of the firewall group.
     * 
     */
    @Import(name="ingressFirewallPolicyId")
    private @Nullable Output<String> ingressFirewallPolicyId;

    /**
     * @return The ingress policy ID of the firewall group.
     * 
     */
    public Optional<Output<String>> ingressFirewallPolicyId() {
        return Optional.ofNullable(this.ingressFirewallPolicyId);
    }

    /**
     * The name of the firewall group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the firewall group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This argument conflicts and is interchangeable
     * with `tenant_id`. The owner of the firewall group.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return This argument conflicts and is interchangeable
     * with `tenant_id`. The owner of the firewall group.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The region in which to obtain the V2 Neutron client.
     * A Neutron client is needed to retrieve firewall group ids. If omitted, the
     * `region` argument of the provider is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which to obtain the V2 Neutron client.
     * A Neutron client is needed to retrieve firewall group ids. If omitted, the
     * `region` argument of the provider is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The sharing status of the firewall group.
     * 
     */
    @Import(name="shared")
    private @Nullable Output<Boolean> shared;

    /**
     * @return The sharing status of the firewall group.
     * 
     */
    public Optional<Output<Boolean>> shared() {
        return Optional.ofNullable(this.shared);
    }

    /**
     * Enabled status for the firewall group.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Enabled status for the firewall group.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * This argument conflicts and is interchangeable
     * with `project_id`. The owner of the firewall group.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return This argument conflicts and is interchangeable
     * with `project_id`. The owner of the firewall group.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private GetGroupV2Args() {}

    private GetGroupV2Args(GetGroupV2Args $) {
        this.adminStateUp = $.adminStateUp;
        this.description = $.description;
        this.egressFirewallPolicyId = $.egressFirewallPolicyId;
        this.groupId = $.groupId;
        this.ingressFirewallPolicyId = $.ingressFirewallPolicyId;
        this.name = $.name;
        this.projectId = $.projectId;
        this.region = $.region;
        this.shared = $.shared;
        this.status = $.status;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupV2Args $;

        public Builder() {
            $ = new GetGroupV2Args();
        }

        public Builder(GetGroupV2Args defaults) {
            $ = new GetGroupV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminStateUp Administrative up/down status for the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder adminStateUp(@Nullable Output<Boolean> adminStateUp) {
            $.adminStateUp = adminStateUp;
            return this;
        }

        /**
         * @param adminStateUp Administrative up/down status for the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder adminStateUp(Boolean adminStateUp) {
            return adminStateUp(Output.of(adminStateUp));
        }

        /**
         * @param description Human-readable description of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human-readable description of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param egressFirewallPolicyId The egress policy ID of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder egressFirewallPolicyId(@Nullable Output<String> egressFirewallPolicyId) {
            $.egressFirewallPolicyId = egressFirewallPolicyId;
            return this;
        }

        /**
         * @param egressFirewallPolicyId The egress policy ID of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder egressFirewallPolicyId(String egressFirewallPolicyId) {
            return egressFirewallPolicyId(Output.of(egressFirewallPolicyId));
        }

        /**
         * @param groupId The ID of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The ID of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param ingressFirewallPolicyId The ingress policy ID of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder ingressFirewallPolicyId(@Nullable Output<String> ingressFirewallPolicyId) {
            $.ingressFirewallPolicyId = ingressFirewallPolicyId;
            return this;
        }

        /**
         * @param ingressFirewallPolicyId The ingress policy ID of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder ingressFirewallPolicyId(String ingressFirewallPolicyId) {
            return ingressFirewallPolicyId(Output.of(ingressFirewallPolicyId));
        }

        /**
         * @param name The name of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId This argument conflicts and is interchangeable
         * with `tenant_id`. The owner of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId This argument conflicts and is interchangeable
         * with `tenant_id`. The owner of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region The region in which to obtain the V2 Neutron client.
         * A Neutron client is needed to retrieve firewall group ids. If omitted, the
         * `region` argument of the provider is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which to obtain the V2 Neutron client.
         * A Neutron client is needed to retrieve firewall group ids. If omitted, the
         * `region` argument of the provider is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param shared The sharing status of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder shared(@Nullable Output<Boolean> shared) {
            $.shared = shared;
            return this;
        }

        /**
         * @param shared The sharing status of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder shared(Boolean shared) {
            return shared(Output.of(shared));
        }

        /**
         * @param status Enabled status for the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Enabled status for the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tenantId This argument conflicts and is interchangeable
         * with `project_id`. The owner of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId This argument conflicts and is interchangeable
         * with `project_id`. The owner of the firewall group.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public GetGroupV2Args build() {
            return $;
        }
    }

}
