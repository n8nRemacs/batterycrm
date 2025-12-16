package com.avito.android.verification.links.open;

import com.avito.android.account.G;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationOpenLinkSyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324328a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324329b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G> f324330c;

    /* renamed from: d, reason: collision with root package name */
    public final C35868p2 f324331d;

    /* renamed from: e, reason: collision with root package name */
    public final b f324332e;

    public e(dv.b bVar, com.avito.android.verification.storage.c cVar, Provider provider, C35868p2 c35868p2, b bVar2) {
        this.f324328a = bVar;
        this.f324329b = cVar;
        this.f324330c = provider;
        this.f324331d = c35868p2;
        this.f324332e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f324328a.get();
        com.avito.android.verification.storage.a aVar = (com.avito.android.verification.storage.a) this.f324329b.get();
        G g12 = this.f324330c.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f324331d.get();
        this.f324332e.getClass();
        return new d(interfaceC4053a, aVar, g12, interfaceC35845m2, new a());
    }
}
