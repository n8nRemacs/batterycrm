package lw;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConsultationAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: lw.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43838c implements h<C43837b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f414244a;

    /* renamed from: b, reason: collision with root package name */
    public final u f414245b;

    public C43838c(u uVar, u uVar2) {
        this.f414244a = uVar;
        this.f414245b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C43837b((InterfaceC28373a) this.f414244a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f414245b.get());
    }
}
