package com.avito.android.details;

import com.avito.android.Q1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemDetailsSelectResultHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f135903a;

    public d(u uVar) {
        this.f135903a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Q1) this.f135903a.get());
    }
}
