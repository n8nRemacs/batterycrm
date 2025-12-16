package com.avito.android.rating_form.select_item.adapter.loading_error;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadingErrorItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248951a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248952b;

    public c(dagger.internal.l lVar, u uVar) {
        this.f248951a = uVar;
        this.f248952b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f248951a.get(), ((Boolean) this.f248952b.f393949a).booleanValue());
    }
}
