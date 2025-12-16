package com.avito.android.profile.pro.impl.screen;

import com.avito.android.profile.pro.impl.screen.A;

/* compiled from: ProfileProServiceBookingViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class C implements A.a {

    /* renamed from: a, reason: collision with root package name */
    public final B f222850a;

    public C(B b12) {
        this.f222850a = b12;
    }

    @Override // com.avito.android.profile.pro.impl.screen.A.a
    public final A create() {
        return new A(this.f222850a.f222849a.get(), null, 2, null);
    }
}
