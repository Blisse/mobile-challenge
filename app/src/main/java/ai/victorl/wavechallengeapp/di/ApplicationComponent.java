package ai.victorl.wavechallengeapp.di;

import javax.inject.Singleton;

import ai.victorl.wavechallengeapp.WaveChallengeApplication;
import ai.victorl.wavechallengeapp.ui.ProductsActivity;
import dagger.Component;

/**
 * Dagger Component to specify injectable targets.
 */
@Singleton
@Component(
        modules = ApplicationModule.class
)
public interface ApplicationComponent extends ApplicationModule.Graph {
    void inject(WaveChallengeApplication target);
    void inject(ProductsActivity target);
}
