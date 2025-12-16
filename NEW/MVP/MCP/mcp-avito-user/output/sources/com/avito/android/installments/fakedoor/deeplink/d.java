package com.avito.android.installments.fakedoor.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsFakedoorDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f172512a;

    public d(dv.b bVar) {
        this.f172512a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.d) this.f172512a.get());
    }
}
