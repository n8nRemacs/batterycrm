package com.avito.android.di.module;

import com.avito.android.analytics.clickstream.H;
import com.avito.android.analytics.clickstream.InterfaceC28377b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamSendingModule_ProvideClickStreamSenderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M2 implements dagger.internal.h<com.avito.android.analytics.clickstream.H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28377b> f144055a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event>> f144056b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.H> f144057c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f144058d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144059e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144060f;

    public M2(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f144055a = provider;
        this.f144056b = provider2;
        this.f144057c = provider3;
        this.f144058d = uVar;
        this.f144059e = provider4;
        this.f144060f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28377b interfaceC28377b = this.f144055a.get();
        com.avito.android.analytics.inhouse_transport.u<EventOuterClass.Event> uVar = this.f144056b.get();
        com.avito.android.remote.H h12 = this.f144057c.get();
        H.a aVar = (H.a) this.f144058d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144059e.get();
        com.avito.android.util.C c12 = this.f144060f.get();
        J2 j22 = J2.f144015a;
        return new com.avito.android.analytics.clickstream.Q(h12, interfaceC28377b, uVar, interfaceC35745a5, aVar, c12);
    }
}
