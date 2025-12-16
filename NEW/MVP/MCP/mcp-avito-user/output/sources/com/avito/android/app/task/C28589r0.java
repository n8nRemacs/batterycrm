package com.avito.android.app.task;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32069f0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: LocalMessageSenderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.r0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28589r0 implements dagger.internal.h<C28587q0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f91709a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ru.avito.messenger.A> f91710b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f91711c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f91712d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.F1 f91713e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f91714f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC32200a> f91715g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.B> f91716h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.G> f91717i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91718j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.file_upload.T> f91719k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC32079k0> f91720l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC32069f0> f91721m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.data.f0> f91722n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.u f91723o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.sync.z0> f91724p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.u f91725q;

    public C28589r0(dagger.internal.u uVar, Provider provider, dagger.internal.u uVar2, dagger.internal.u uVar3, com.avito.android.F1 f12, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.u uVar4, Provider provider11, dagger.internal.u uVar5) {
        this.f91709a = uVar;
        this.f91710b = provider;
        this.f91711c = uVar2;
        this.f91712d = uVar3;
        this.f91713e = f12;
        this.f91714f = provider2;
        this.f91715g = provider3;
        this.f91716h = provider4;
        this.f91717i = provider5;
        this.f91718j = provider6;
        this.f91719k = provider7;
        this.f91720l = provider8;
        this.f91721m = provider9;
        this.f91722n = provider10;
        this.f91723o = uVar4;
        this.f91724p = provider11;
        this.f91725q = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28587q0((InterfaceC47842z) this.f91709a.get(), this.f91710b.get(), (InterfaceC32095t) this.f91711c.get(), (InterfaceC32098u0) this.f91712d.get(), (com.avito.android.messenger.service.a) this.f91713e.get(), this.f91714f.get(), this.f91715g.get(), this.f91716h.get(), this.f91717i.get(), this.f91718j.get(), this.f91719k.get(), this.f91720l.get(), this.f91721m.get(), this.f91722n.get(), (C30277e1) this.f91723o.get(), this.f91724p.get(), (InterfaceC28373a) this.f91725q.get());
    }
}
