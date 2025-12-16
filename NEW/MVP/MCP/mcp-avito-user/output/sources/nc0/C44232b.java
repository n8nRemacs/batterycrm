package nC0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLandingDeeplinkHandler_Factory.java */
@e
@y
@x
/* renamed from: nC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44232b implements h<C44231a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f414924a;

    /* renamed from: b, reason: collision with root package name */
    public final hC0.e f414925b;

    public C44232b(dv.b bVar, hC0.e eVar) {
        this.f414924a = bVar;
        this.f414925b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44231a((a.InterfaceC4053a) this.f414924a.get(), (hC0.c) this.f414925b.get());
    }
}
