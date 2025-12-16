package com.avito.android.messenger_icebreakers_dialog.deeplink;

import android.content.Context;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.messenger.di.I1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f197629a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f197630b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f197631c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f197632d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f197633e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<A> f197634f;

    /* renamed from: g, reason: collision with root package name */
    public final I1 f197635g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f197636h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197637i;

    /* renamed from: j, reason: collision with root package name */
    public final C25721c f197638j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.f f197639k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.messenger_icebreakers_dialog.c f197640l;

    /* renamed from: m, reason: collision with root package name */
    public final C30102l3 f197641m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.messenger_icebreakers_dialog.features.c f197642n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f197643o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<WL.a> f197644p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<R0> f197645q;

    public s(dv.b bVar, dv.b bVar2, dv.b bVar3, dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider, I1 i12, Provider provider2, Provider provider3, C25721c c25721c, dagger.internal.f fVar3, com.avito.android.messenger_icebreakers_dialog.c cVar, C30102l3 c30102l3, com.avito.android.messenger_icebreakers_dialog.features.c cVar2, Provider provider4, Provider provider5, Provider provider6) {
        this.f197629a = bVar;
        this.f197630b = bVar2;
        this.f197631c = bVar3;
        this.f197632d = fVar;
        this.f197633e = fVar2;
        this.f197634f = provider;
        this.f197635g = i12;
        this.f197636h = provider2;
        this.f197637i = provider3;
        this.f197638j = c25721c;
        this.f197639k = fVar3;
        this.f197640l = cVar;
        this.f197641m = c30102l3;
        this.f197642n = cVar2;
        this.f197643o = provider4;
        this.f197644p = provider5;
        this.f197645q = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.f fVar = (a.f) this.f197629a.get();
        a.d dVar = (a.d) this.f197630b.get();
        a.i iVar = (a.i) this.f197631c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f197632d.get();
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f197633e.get();
        A a12 = this.f197634f.get();
        F0 f02 = (F0) this.f197635g.get();
        InterfaceC35863o4 interfaceC35863o4 = this.f197636h.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f197637i.get();
        C25719a c25719a = (C25719a) this.f197638j.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f197639k.get();
        this.f197640l.getClass();
        return new a(fVar, dVar, iVar, interfaceC28373a, interfaceC47842z, a12, f02, interfaceC35863o4, interfaceC35745a5, c25719a, aVar, new com.avito.android.messenger_icebreakers_dialog.b(), (Context) this.f197641m.get(), (com.avito.android.messenger_icebreakers_dialog.features.a) this.f197642n.get(), this.f197643o.get(), this.f197644p.get(), this.f197645q.get());
    }
}
