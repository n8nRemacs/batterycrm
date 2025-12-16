package com.avito.android.verification.verification_confirm_requisites;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationConfirmRequisitesLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324940a;

    /* renamed from: b, reason: collision with root package name */
    public final vM0.d f324941b;

    public e(dv.b bVar, vM0.d dVar) {
        this.f324940a = bVar;
        this.f324941b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.InterfaceC4053a) this.f324940a.get(), (InterfaceC49236c) this.f324941b.get());
    }
}
