package com.avito.android.persistence.messenger;

import io.reactivex.rxjava3.internal.operators.single.C42006d;

/* compiled from: LastKnownUserDao_Impl.java */
/* loaded from: classes15.dex */
public final class W0 extends S0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215330a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<X0> f215331b;

    public W0(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215330a = messengerDatabase_Impl;
        this.f215331b = new T0(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.S0
    public final C42006d a() {
        return androidx.room.rxjava3.g.b(new V0(this, androidx.room.F0.c(0, "SELECT * FROM last_known_user")));
    }

    @Override // com.avito.android.persistence.messenger.S0
    public final io.reactivex.rxjava3.internal.operators.completable.r b(X0 x02) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new U0(this, x02));
    }
}
