package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.permissions.z;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacPermissionMicAskLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f168268a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f168269b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f168270c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f168271d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<z> f168272e;

    /* renamed from: f, reason: collision with root package name */
    public final C35868p2 f168273f;

    public f(dv.b bVar, dv.b bVar2, dv.b bVar3, dagger.internal.f fVar, Provider provider, C35868p2 c35868p2) {
        this.f168268a = bVar;
        this.f168269b = bVar2;
        this.f168270c = bVar3;
        this.f168271d = fVar;
        this.f168272e = provider;
        this.f168273f = c35868p2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f168268a.get(), (a.d) this.f168269b.get(), (a.h) this.f168270c.get(), (InterfaceC28373a) this.f168271d.get(), this.f168272e.get(), (InterfaceC35845m2) this.f168273f.get());
    }
}
