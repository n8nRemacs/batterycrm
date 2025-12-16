package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.di.M1;
import com.avito.android.messenger.di.O1;
import com.avito.android.messenger.di.S1;
import com.avito.android.persistence.messenger.InterfaceC33095n0;
import com.avito.android.persistence.messenger.Y0;

/* compiled from: MessengerDebugRepo_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class b0 implements dagger.internal.h<a0> {

    /* renamed from: a, reason: collision with root package name */
    public final M1 f187207a;

    /* renamed from: b, reason: collision with root package name */
    public final S1 f187208b;

    /* renamed from: c, reason: collision with root package name */
    public final O1 f187209c;

    public b0(M1 m12, S1 s12, O1 o12) {
        this.f187207a = m12;
        this.f187208b = s12;
        this.f187209c = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f187207a.get();
        return new a0((Y0) this.f187208b.get(), (InterfaceC33095n0) this.f187209c.get());
    }
}
