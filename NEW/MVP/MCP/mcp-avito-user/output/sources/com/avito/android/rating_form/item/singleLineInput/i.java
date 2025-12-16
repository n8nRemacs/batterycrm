package com.avito.android.rating_form.item.singleLineInput;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SingleLineInputItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248629a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248630b;

    public i(l lVar, u uVar) {
        this.f248629a = uVar;
        this.f248630b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((d) this.f248629a.get(), ((Boolean) this.f248630b.f393949a).booleanValue());
    }
}
