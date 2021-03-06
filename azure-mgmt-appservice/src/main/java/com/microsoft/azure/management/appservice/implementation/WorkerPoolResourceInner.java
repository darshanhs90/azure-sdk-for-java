/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.microsoft.azure.management.appservice.ComputeModeOptions;
import java.util.List;
import com.microsoft.azure.management.appservice.SkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Worker pool of an App Service Environment ARM resource.
 */
@JsonFlatten
public class WorkerPoolResourceInner extends Resource {
    /**
     * Worker size ID for referencing this worker pool.
     */
    @JsonProperty(value = "properties.workerSizeId")
    private Integer workerSizeId;

    /**
     * Shared or dedicated app hosting. Possible values include: 'Shared',
     * 'Dedicated', 'Dynamic'.
     */
    @JsonProperty(value = "properties.computeMode")
    private ComputeModeOptions computeMode;

    /**
     * VM size of the worker pool instances.
     */
    @JsonProperty(value = "properties.workerSize")
    private String workerSize;

    /**
     * Number of instances in the worker pool.
     */
    @JsonProperty(value = "properties.workerCount")
    private Integer workerCount;

    /**
     * Names of all instances in the worker pool (read only).
     */
    @JsonProperty(value = "properties.instanceNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> instanceNames;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /**
     * Get the workerSizeId value.
     *
     * @return the workerSizeId value
     */
    public Integer workerSizeId() {
        return this.workerSizeId;
    }

    /**
     * Set the workerSizeId value.
     *
     * @param workerSizeId the workerSizeId value to set
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withWorkerSizeId(Integer workerSizeId) {
        this.workerSizeId = workerSizeId;
        return this;
    }

    /**
     * Get the computeMode value.
     *
     * @return the computeMode value
     */
    public ComputeModeOptions computeMode() {
        return this.computeMode;
    }

    /**
     * Set the computeMode value.
     *
     * @param computeMode the computeMode value to set
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
        return this;
    }

    /**
     * Get the workerSize value.
     *
     * @return the workerSize value
     */
    public String workerSize() {
        return this.workerSize;
    }

    /**
     * Set the workerSize value.
     *
     * @param workerSize the workerSize value to set
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withWorkerSize(String workerSize) {
        this.workerSize = workerSize;
        return this;
    }

    /**
     * Get the workerCount value.
     *
     * @return the workerCount value
     */
    public Integer workerCount() {
        return this.workerCount;
    }

    /**
     * Set the workerCount value.
     *
     * @param workerCount the workerCount value to set
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }

    /**
     * Get the instanceNames value.
     *
     * @return the instanceNames value
     */
    public List<String> instanceNames() {
        return this.instanceNames;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

}
