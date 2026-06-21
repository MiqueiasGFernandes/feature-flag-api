package com.feature_flag_api.FeatureFlag.UseCase.Interface;

import java.util.List;

import com.feature_flag_api.FeatureFlag.Dto.FeatureFlagDto;
import com.feature_flag_api.FeatureFlag.Dto.ListFeatureFlagOptionsDto;

public interface ListFeatureFlagsUseCase {
    List<FeatureFlagDto> execute(ListFeatureFlagOptionsDto options);
}
