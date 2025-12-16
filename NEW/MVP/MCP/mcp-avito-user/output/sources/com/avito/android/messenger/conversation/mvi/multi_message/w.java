package com.avito.android.messenger.conversation.mvi.multi_message;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiMessageStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f193769a;

    public w(C30214v6 c30214v6) {
        this.f193769a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((AK0.l) this.f193769a.get());
    }
}
