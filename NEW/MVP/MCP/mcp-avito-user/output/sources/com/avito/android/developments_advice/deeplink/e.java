package com.avito.android.developments_advice.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.phone_confirmation.P;
import com.avito.android.phone_confirmation.S;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lw.InterfaceC43836a;
import ow.InterfaceC44946a;

/* compiled from: ConsultationStartLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136051a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f136052b;

    /* renamed from: c, reason: collision with root package name */
    public final S f136053c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC44946a> f136054d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f136055e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f136056f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f136057g;

    /* renamed from: h, reason: collision with root package name */
    public final u f136058h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f136059i;

    public e(dv.b bVar, dv.b bVar2, S s5, Provider provider, Provider provider2, dv.b bVar3, dv.b bVar4, u uVar, dagger.internal.f fVar) {
        this.f136051a = bVar;
        this.f136052b = bVar2;
        this.f136053c = s5;
        this.f136054d = provider;
        this.f136055e = provider2;
        this.f136056f = bVar3;
        this.f136057g = bVar4;
        this.f136058h = uVar;
        this.f136059i = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.InterfaceC4053a) this.f136051a.get(), (a.b) this.f136052b.get(), (P) this.f136053c.get(), this.f136054d.get(), this.f136055e.get(), (a.i) this.f136056f.get(), (a.g) this.f136057g.get(), (InterfaceC43836a) this.f136058h.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f136059i.get());
    }
}
