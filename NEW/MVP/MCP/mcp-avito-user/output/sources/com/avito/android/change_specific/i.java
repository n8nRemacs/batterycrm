package com.avito.android.change_specific;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileChangeSpecificIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f117980a;

    public i(C30102l3 c30102l3) {
        this.f117980a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Context) this.f117980a.get());
    }
}
