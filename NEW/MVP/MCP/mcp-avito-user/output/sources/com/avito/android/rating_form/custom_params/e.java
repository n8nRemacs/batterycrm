package com.avito.android.rating_form.custom_params;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: CustomParamsHelper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final A f248017a;

    public e(A a12) {
        this.f248017a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Set) this.f248017a.get());
    }
}
