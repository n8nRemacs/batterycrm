package com.avito.android.code_check.phone_list.adapter.phone;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f118958a;

    /* renamed from: b, reason: collision with root package name */
    public final u f118959b;

    public f(l lVar, u uVar) {
        this.f118958a = lVar;
        this.f118959b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f118958a.f393949a, ((Boolean) this.f118959b.get()).booleanValue());
    }
}
