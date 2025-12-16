package pl;

import com.avito.android.onboarding_manager.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReplaceMainWidgetDeps_Factory.java */
@e
@y
@x
/* renamed from: pl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47108b implements h<C47107a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<U20.e> f428756a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<f> f428757b;

    public C47108b(Provider<U20.e> provider, Provider<f> provider2) {
        this.f428756a = provider;
        this.f428757b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47107a(this.f428756a.get(), this.f428757b.get());
    }
}
