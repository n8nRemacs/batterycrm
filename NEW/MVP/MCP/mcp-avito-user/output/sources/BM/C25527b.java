package bM;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hM.C40851c;
import hM.InterfaceC40849a;
import javax.inject.Provider;
import pM.InterfaceC46977a;

/* compiled from: IacProblemBannerInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: bM.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25527b implements h<C25526a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f57045a;

    /* renamed from: b, reason: collision with root package name */
    public final C40851c f57046b;

    /* renamed from: c, reason: collision with root package name */
    public final f f57047c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f57048d;

    public C25527b(Provider provider, C40851c c40851c, f fVar, Provider provider2) {
        this.f57045a = provider;
        this.f57046b = c40851c;
        this.f57047c = fVar;
        this.f57048d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C25526a(this.f57045a.get(), (InterfaceC40849a) this.f57046b.get(), (InterfaceC28373a) this.f57047c.get(), this.f57048d.get());
    }
}
