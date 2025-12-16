package com.avito.android.comparison;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f123827a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f123828b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f123829c;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f123827a = c30102l3;
        this.f123828b = bVar;
        this.f123829c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f123827a.get(), (a.InterfaceC4053a) this.f123828b.get(), (a.b) this.f123829c.get());
    }
}
