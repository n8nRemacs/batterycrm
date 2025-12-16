package com.avito.android.screens.bbip_private_v2.ui;

import com.avito.android.screens.bbip_private_v2.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BbipPrivateV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final i f261404a;

    public g(i iVar) {
        this.f261404a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.screens.bbip_private_v2.mvi.h hVar = (com.avito.android.screens.bbip_private_v2.mvi.h) this.f261404a.get();
        i2.f411430a.getClass();
        return new f(hVar, i2.a.f411433c);
    }
}
