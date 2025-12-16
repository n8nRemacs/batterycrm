package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: QuickRepliesPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f194117a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32188a> f194118b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f194119c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f194120d;

    public p(Provider<InterfaceC31987a> provider, Provider<InterfaceC32188a> provider2, Provider<InterfaceC35741a1> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f194117a = provider;
        this.f194118b = provider2;
        this.f194119c = provider3;
        this.f194120d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f194117a.get(), this.f194118b.get(), this.f194119c.get(), this.f194120d.get());
    }
}
