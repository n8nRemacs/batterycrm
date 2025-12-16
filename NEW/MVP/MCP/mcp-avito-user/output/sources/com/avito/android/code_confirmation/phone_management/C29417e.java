package com.avito.android.code_confirmation.phone_management;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: PhoneManagementIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.code_confirmation.phone_management.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29417e implements dagger.internal.h<C29416d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f119689a;

    public C29417e(C30102l3 c30102l3) {
        this.f119689a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29416d((Context) this.f119689a.get());
    }
}
