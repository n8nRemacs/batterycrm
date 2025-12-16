package com.avito.android.gig_apply.ui;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: GigApplyIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f160014a;

    public j(C30102l3 c30102l3) {
        this.f160014a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f160014a.get());
    }
}
