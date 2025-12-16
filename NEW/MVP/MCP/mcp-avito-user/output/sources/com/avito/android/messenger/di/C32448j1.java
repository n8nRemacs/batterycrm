package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.C32561o;
import com.avito.android.messenger.C32573v;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.util.InterfaceC35745a5;
import id.C41383a;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideHashIdChangeUiControllerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.j1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32448j1 implements dagger.internal.h<InterfaceC32572u> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195806a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f195807b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195808c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195809d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C41383a> f195810e;

    /* renamed from: f, reason: collision with root package name */
    public final C30713g1 f195811f;

    public C32448j1(U0 u02, com.avito.android.O o12, Provider provider, Provider provider2, Provider provider3, C30713g1 c30713g1) {
        this.f195806a = u02;
        this.f195807b = o12;
        this.f195808c = provider;
        this.f195809d = provider2;
        this.f195810e = provider3;
        this.f195811f = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.L l12 = (com.avito.android.L) this.f195807b.get();
        com.avito.android.messenger.w0 w0Var = this.f195808c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195809d.get();
        C41383a c41383a = this.f195810e.get();
        C30277e1 c30277e1 = (C30277e1) this.f195811f.get();
        this.f195806a.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[35];
        return ((Boolean) c30277e1.f144963I.a().invoke()).booleanValue() ? new C32561o() : new C32573v(l12, c41383a, interfaceC35745a5, w0Var);
    }
}
