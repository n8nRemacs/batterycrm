package com.avito.android.rating_form.item.singleLineInput;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SingleLineInputItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248619a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248620b;

    public c(l lVar, u uVar) {
        this.f248619a = uVar;
        this.f248620b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f248619a.get(), ((Boolean) this.f248620b.f393949a).booleanValue());
    }
}
