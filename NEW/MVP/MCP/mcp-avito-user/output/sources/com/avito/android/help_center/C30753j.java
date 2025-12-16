package com.avito.android.help_center;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: HelpCenterIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.help_center.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30753j implements dagger.internal.h<C30752i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f161838a;

    public C30753j(C30102l3 c30102l3) {
        this.f161838a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30752i((Context) this.f161838a.get());
    }
}
