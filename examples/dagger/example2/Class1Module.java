package examples.dagger.example2;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
class Class1Module {
  @Provides @Singleton Class1Interface provideAImpl() {
    return new Class1Impl();
  }
}