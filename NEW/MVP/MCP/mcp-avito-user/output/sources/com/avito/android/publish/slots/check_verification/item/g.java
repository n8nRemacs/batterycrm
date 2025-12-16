package com.avito.android.publish.slots.check_verification.item;

import com.avito.android.publish.analytics.C33525k;
import com.avito.android.publish.analytics.C33526l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C33526l f243193a;

    public g(C33526l c33526l) {
        this.f243193a = c33526l;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((C33525k) this.f243193a.get());
    }
}
