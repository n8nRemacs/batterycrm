package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelContextInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class U implements dagger.internal.h<C31988b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f190195a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190196b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<w0> f190197c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f190198d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.service.user_last_activity.a> f190199e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f190200f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.service.p> f190201g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f190202h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f190203i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.analytics.b> f190204j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.u f190205k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f190206l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<C30277e1> f190207m;

    public U(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f190195a = provider;
        this.f190196b = provider2;
        this.f190197c = provider3;
        this.f190198d = provider4;
        this.f190199e = provider5;
        this.f190200f = provider6;
        this.f190201g = provider7;
        this.f190202h = lVar;
        this.f190203i = lVar2;
        this.f190204j = provider8;
        this.f190205k = uVar;
        this.f190206l = provider9;
        this.f190207m = provider10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C31988b(this.f190195a.get(), this.f190196b.get(), this.f190197c.get(), this.f190198d.get(), this.f190199e.get(), this.f190200f.get(), this.f190201g.get(), (OpenedFrom) this.f190202h.f393949a, (W1) this.f190203i.f393949a, this.f190204j.get(), (com.avito.android.messenger.channels.mvi.data.r) this.f190205k.get(), this.f190206l.get(), this.f190207m.get());
    }
}
