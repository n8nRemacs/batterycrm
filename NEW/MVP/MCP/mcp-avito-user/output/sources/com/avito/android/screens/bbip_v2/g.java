package com.avito.android.screens.bbip_v2;

import com.avito.android.screens.bbip_v2.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BbipV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final i f261499a;

    public g(i iVar) {
        this.f261499a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.screens.bbip_v2.mvi.h hVar = (com.avito.android.screens.bbip_v2.mvi.h) this.f261499a.get();
        i2.f411430a.getClass();
        return new f(hVar, i2.a.f411433c);
    }
}
