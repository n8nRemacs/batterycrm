package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: LocallyDeletedChannelsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f187635a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f187636b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f187637c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f187638d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f187639e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f187640f;

    public I(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5, dagger.internal.u uVar6) {
        this.f187635a = uVar;
        this.f187636b = uVar2;
        this.f187637c = uVar3;
        this.f187638d = uVar4;
        this.f187639e = uVar5;
        this.f187640f = uVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H((InterfaceC31700h) this.f187635a.get(), (InterfaceC35741a1) this.f187636b.get(), (InterfaceC28373a) this.f187637c.get(), (InterfaceC35745a5) this.f187638d.get(), (InterfaceC31857r0) this.f187639e.get(), (w0) this.f187640f.get());
    }
}
