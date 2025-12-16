package com.avito.android.publish.drafts;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: PublishMessageHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f235327a;

    public M(C30102l3 c30102l3) {
        this.f235327a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L((Context) this.f235327a.get());
    }
}
