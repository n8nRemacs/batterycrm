package com.avito.android.permissions;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: PermissionCheckerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f215146a;

    public w(C30102l3 c30102l3) {
        this.f215146a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((Context) this.f215146a.get());
    }
}
