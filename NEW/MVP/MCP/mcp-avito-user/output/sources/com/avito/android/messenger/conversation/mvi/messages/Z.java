package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessageListInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Z implements dagger.internal.h<C32141e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f192113a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.K> f192114b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f192115c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f192116d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f192117e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C30277e1> f192118f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f192119g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f192120h;

    public Z(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f192113a = provider;
        this.f192114b = provider2;
        this.f192115c = provider3;
        this.f192116d = uVar;
        this.f192117e = provider4;
        this.f192118f = provider5;
        this.f192119g = lVar;
        this.f192120h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32141e(this.f192113a.get(), this.f192114b.get(), this.f192115c.get(), (com.avito.android.analytics.timer.a) this.f192116d.get(), this.f192117e.get(), this.f192118f.get(), (W1) this.f192119g.f393949a, this.f192120h.get());
    }
}
