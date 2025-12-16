package com.avito.android.publish.input_imei;

import com.avito.android.publish.input_imei.mvi.p;
import com.avito.android.publish.input_imei.mvi.q;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: InputImeiViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final q f236367a;

    public l(q qVar) {
        this.f236367a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f236367a.get();
        i2.f411430a.getClass();
        return new k(pVar, i2.a.f411433c);
    }
}
