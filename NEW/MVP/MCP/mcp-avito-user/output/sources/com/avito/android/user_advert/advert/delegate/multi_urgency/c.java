package com.avito.android.user_advert.advert.delegate.multi_urgency;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiUrgencyConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308684a;

    public c(u uVar) {
        this.f308684a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC35863o4) this.f308684a.get());
    }
}
