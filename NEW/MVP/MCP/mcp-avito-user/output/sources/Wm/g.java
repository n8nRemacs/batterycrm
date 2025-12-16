package wM;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.image.enhancement.C30976g;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImageEnhanceAppModule_ProvideImageEnhanceOnboardingManagerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<C30976g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f441419a;

    public g(C30102l3 c30102l3) {
        this.f441419a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f441419a.get();
        C49536a.f441408a.getClass();
        return new C30976g(context);
    }
}
