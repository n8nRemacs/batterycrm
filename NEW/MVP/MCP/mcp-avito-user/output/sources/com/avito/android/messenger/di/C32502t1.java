package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;

/* compiled from: MessengerModule_ProvideMessengerErrorTracker$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.t1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32502t1 implements dagger.internal.h<C31667x> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196291a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f196292b;

    /* renamed from: c, reason: collision with root package name */
    public final C30713g1 f196293c;

    public C32502t1(U0 u02, dagger.internal.f fVar, C30713g1 c30713g1) {
        this.f196291a = u02;
        this.f196292b = fVar;
        this.f196293c = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f196292b.get();
        C30277e1 c30277e1 = (C30277e1) this.f196293c.get();
        this.f196291a.getClass();
        return new C31667x(interfaceC28373a, c30277e1);
    }
}
