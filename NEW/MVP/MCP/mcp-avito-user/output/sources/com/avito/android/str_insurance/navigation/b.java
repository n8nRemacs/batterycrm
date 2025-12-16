package com.avito.android.str_insurance.navigation;

import Xy0.InterfaceC17065e;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f288615a;

    /* renamed from: b, reason: collision with root package name */
    public final Xy0.f f288616b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f288617c;

    public b(dv.b bVar, Xy0.f fVar, dv.b bVar2) {
        this.f288615a = bVar;
        this.f288616b = fVar;
        this.f288617c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f288615a.get(), (InterfaceC17065e) this.f288616b.get(), (a.InterfaceC4053a) this.f288617c.get());
    }
}
