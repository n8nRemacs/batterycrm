package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MessageSyncAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32276m0 implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f194819a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f194820b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f194821c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ru.avito.messenger.A> f194822d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<G> f194823e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.B> f194824f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194825g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<O0> f194826h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f194827i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC32291u0> f194828j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC32280o0> f194829k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f> f194830l;

    /* renamed from: m, reason: collision with root package name */
    public final C30713g1 f194831m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f194832n;

    public C32276m0(Provider provider, Provider provider2, dagger.internal.f fVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.f fVar2, Provider provider8, Provider provider9, Provider provider10, C30713g1 c30713g1, dagger.internal.u uVar) {
        this.f194819a = provider;
        this.f194820b = provider2;
        this.f194821c = fVar;
        this.f194822d = provider3;
        this.f194823e = provider4;
        this.f194824f = provider5;
        this.f194825g = provider6;
        this.f194826h = provider7;
        this.f194827i = fVar2;
        this.f194828j = provider8;
        this.f194829k = provider9;
        this.f194830l = provider10;
        this.f194831m = c30713g1;
        this.f194832n = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P(this.f194819a.get(), this.f194820b.get(), (ru.avito.messenger.W) this.f194821c.get(), this.f194822d.get(), this.f194823e.get(), this.f194824f.get(), this.f194825g.get(), this.f194826h.get(), (InterfaceC28373a) this.f194827i.get(), this.f194828j.get(), this.f194829k.get(), this.f194830l.get(), (C30277e1) this.f194831m.get(), (com.avito.android.messenger.channels.mvi.sync.z0) this.f194832n.get());
    }
}
