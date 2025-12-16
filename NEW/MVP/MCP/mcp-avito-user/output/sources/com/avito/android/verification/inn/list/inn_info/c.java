package com.avito.android.verification.inn.list.inn_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InnInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f324023a;

    public c(u uVar) {
        this.f324023a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f324023a.get());
    }
}
