package com.avito.android.messenger.conversation.mvi.message_menu;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import javax.inject.Provider;

/* compiled from: MessageMenuPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<List<c>> f191802a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f191803b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Y81.c> f191804c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f191805d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<JY.a> f191806e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191807f;

    public r(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f191802a = provider;
        this.f191803b = uVar;
        this.f191804c = provider2;
        this.f191805d = provider3;
        this.f191806e = provider4;
        this.f191807f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f191802a.get(), (e) this.f191803b.get(), this.f191804c.get(), this.f191805d.get(), this.f191806e.get(), this.f191807f.get());
    }
}
