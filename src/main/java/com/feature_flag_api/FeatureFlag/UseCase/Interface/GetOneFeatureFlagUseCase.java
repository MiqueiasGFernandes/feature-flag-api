package com.feature_flag_api.FeatureFlag.UseCase.Interface;

import java.util.UUID;

public interface GetOneFeatureFlagUseCase {
    void execute(UUID id);
}