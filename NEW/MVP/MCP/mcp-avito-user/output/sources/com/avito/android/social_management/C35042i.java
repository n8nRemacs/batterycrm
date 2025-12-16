package com.avito.android.social_management;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: SocialManagementIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.social_management.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35042i implements dagger.internal.h<C35041h> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f284680a;

    public C35042i(C30102l3 c30102l3) {
        this.f284680a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35041h((Context) this.f284680a.get());
    }
}
