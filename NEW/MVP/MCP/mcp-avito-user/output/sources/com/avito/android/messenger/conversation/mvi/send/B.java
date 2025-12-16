package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.InterfaceC32575x;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SendMessageInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f194168a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f194169b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.q0> f194170c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f194171d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC32575x> f194172e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f194173f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC32024m> f194174g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194175h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f194176i;

    public B(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f194168a = provider;
        this.f194169b = provider2;
        this.f194170c = provider3;
        this.f194171d = uVar;
        this.f194172e = provider4;
        this.f194173f = provider5;
        this.f194174g = provider6;
        this.f194175h = provider7;
        this.f194176i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f194168a.get(), this.f194169b.get(), this.f194170c.get(), (InterfaceC32218j) this.f194171d.get(), this.f194172e.get(), this.f194173f.get(), this.f194174g.get(), this.f194175h.get(), (W1) this.f194176i.f393949a);
    }
}
