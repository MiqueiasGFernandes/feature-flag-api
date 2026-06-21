package com.feature_flag_api.FeatureFlag.Dto;

public record ListFeatureFlagOptionsDto (
    int page,
    int perPage,
    FeatureFlagSortByEnum sortBy,
    FeatureFlagSortByDirectionEnum sortDirection,
    FeatureFlagSearchBy searchBy,
    String searchValue
) {}
