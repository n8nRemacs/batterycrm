package com.avito.android.rating.details.di;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingDetailsModule_ProvideRatingInfoIntentFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<com.avito.android.rating.info_screen.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f247009a;

    public p(C30102l3 c30102l3) {
        this.f247009a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f247009a.get();
        e.f246981a.getClass();
        return new com.avito.android.rating.info_screen.c(context);
    }
}
