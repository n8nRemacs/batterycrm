package D40;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingBottomSheetAdapter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f2893a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2894b;

    public c(l lVar, Provider provider) {
        this.f2893a = provider;
        this.f2894b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f2893a.get(), (Y41.l) this.f2894b.f393949a);
    }
}
