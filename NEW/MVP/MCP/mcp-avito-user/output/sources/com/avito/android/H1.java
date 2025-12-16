package com.avito.android;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.C28582o1;
import com.avito.android.app.task.C28589r0;
import com.avito.android.app.task.InterfaceC28601v0;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: PendingMessageHandlerModule_ProvidePendingMessageHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class H1 implements dagger.internal.h<com.avito.android.app.task.P0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f67265a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f67266b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f67267c;

    /* renamed from: d, reason: collision with root package name */
    public final C28589r0 f67268d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f67269e;

    /* renamed from: f, reason: collision with root package name */
    public final G1 f67270f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f67271g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f67272h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f67273i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f67274j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.H> f67275k;

    public H1(Provider provider, dagger.internal.u uVar, Provider provider2, C28589r0 c28589r0, Provider provider3, G1 g12, dagger.internal.u uVar2, Provider provider4, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider5) {
        this.f67265a = provider;
        this.f67266b = uVar;
        this.f67267c = provider2;
        this.f67268d = c28589r0;
        this.f67269e = provider3;
        this.f67270f = g12;
        this.f67271g = uVar2;
        this.f67272h = provider4;
        this.f67273i = uVar3;
        this.f67274j = uVar4;
        this.f67275k = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.w0 w0Var = this.f67265a.get();
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f67266b.get();
        InterfaceC32024m interfaceC32024m = this.f67267c.get();
        com.avito.android.app.task.T t12 = (com.avito.android.app.task.T) this.f67268d.get();
        com.avito.android.server_time.h hVar = this.f67269e.get();
        InterfaceC28601v0 interfaceC28601v0 = (InterfaceC28601v0) this.f67270f.get();
        C31667x c31667x = (C31667x) this.f67271g.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f67272h.get();
        C30277e1 c30277e1 = (C30277e1) this.f67273i.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f67274j.get();
        com.avito.android.analytics.H h12 = this.f67275k.get();
        int i12 = E1.f67255a;
        return new C28582o1(interfaceC47842z, w0Var, interfaceC32024m, t12, hVar, interfaceC28601v0, c31667x, interfaceC35745a5, interfaceC28373a, h12, c30277e1);
    }
}
