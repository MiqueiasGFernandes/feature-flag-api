package com.feature_flag_api.FeatureFlag.UseCase.Interface;

import java.util.Optional;
import com.feature_flag_api.FeatureFlag.Dto.FeatureFlagDto;

interface EditFeatureFlagUseCase {
    void execute(Optional<FeatureFlagDto> featureFlagInput);
}