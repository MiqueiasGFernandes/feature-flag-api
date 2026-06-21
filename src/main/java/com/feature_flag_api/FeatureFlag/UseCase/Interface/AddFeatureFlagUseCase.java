package com.feature_flag_api.FeatureFlag.UseCase.Interface;

import com.feature_flag_api.FeatureFlag.Dto.FeatureFlagDto;

public interface AddFeatureFlagUseCase {
    void execute(FeatureFlagDto featureFlagInput);
}
