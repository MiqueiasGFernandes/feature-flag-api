package com.feature_flag_api.FeatureFlag.Dto;

public record FeatureFlagDto(String name, String description, boolean enabled, FeatureFlagTypeEnum type, FeatureFlagEnvironmentEnum environment, String value) {}
