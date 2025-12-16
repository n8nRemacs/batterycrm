package com.avito.android.code_confirmation.code_confirmation.phone_confirm;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneConfirmResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f119613a;

    public h(l lVar) {
        this.f119613a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Resources) this.f119613a.f393949a);
    }
}
