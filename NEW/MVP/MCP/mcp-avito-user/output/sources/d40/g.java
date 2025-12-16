package D40;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingViewRouterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.dialog.view.quiz.a> f2906a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.dialog.view.carousel.f> f2907b;

    /* renamed from: c, reason: collision with root package name */
    public final u f2908c;

    /* renamed from: d, reason: collision with root package name */
    public final c f2909d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f2910e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2911f;

    public g(Provider provider, Provider provider2, u uVar, c cVar, Provider provider3, l lVar) {
        this.f2906a = provider;
        this.f2907b = provider2;
        this.f2908c = uVar;
        this.f2909d = cVar;
        this.f2910e = provider3;
        this.f2911f = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f2906a.get(), this.f2907b.get(), (E40.c) this.f2908c.get(), (a) this.f2909d.get(), this.f2910e.get(), (Y41.l) this.f2911f.f393949a);
    }
}
