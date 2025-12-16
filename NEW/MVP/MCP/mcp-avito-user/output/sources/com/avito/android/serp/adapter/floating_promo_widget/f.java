package com.avito.android.serp.adapter.floating_promo_widget;

import com.avito.android.di.module.C30194t8;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FloatingPromoWidgetConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C30194t8 f269985a;

    public f(C30194t8 c30194t8) {
        this.f269985a = c30194t8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(((Boolean) this.f269985a.get()).booleanValue());
    }
}
