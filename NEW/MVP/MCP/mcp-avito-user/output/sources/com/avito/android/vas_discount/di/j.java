package com.avito.android.vas_discount.di;

import com.avito.android.vas_discount.remote.model.DiscountResponse;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PickerModule_ProvideDiscountResponseFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<DiscountResponse> {

    /* renamed from: a, reason: collision with root package name */
    public final i f319663a;

    public j(i iVar) {
        this.f319663a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f319663a.f319662b;
    }
}
