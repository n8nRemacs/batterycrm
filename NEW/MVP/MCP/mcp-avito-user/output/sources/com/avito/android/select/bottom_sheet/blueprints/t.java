package com.avito.android.select.bottom_sheet.blueprints;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RedesignedCheckableImageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f265186a;

    public t(Provider<m> provider) {
        this.f265186a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f265186a.get());
    }
}
