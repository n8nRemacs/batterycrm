package com.avito.android.serp.adapter.empty_placeholder;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmptyPlaceholderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f269910a;

    public e(u uVar) {
        this.f269910a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((h) this.f269910a.get());
    }
}
