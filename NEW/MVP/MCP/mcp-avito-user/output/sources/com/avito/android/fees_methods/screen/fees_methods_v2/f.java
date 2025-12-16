package com.avito.android.fees_methods.screen.fees_methods_v2;

import com.avito.android.fees_methods.screen.fees_methods_v2.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FeesMethodsV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f158268a;

    public f(i iVar) {
        this.f158268a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.fees_methods.screen.fees_methods_v2.mvi.h hVar = (com.avito.android.fees_methods.screen.fees_methods_v2.mvi.h) this.f158268a.get();
        i2.f411430a.getClass();
        return new e(hVar, i2.a.f411433c);
    }
}
