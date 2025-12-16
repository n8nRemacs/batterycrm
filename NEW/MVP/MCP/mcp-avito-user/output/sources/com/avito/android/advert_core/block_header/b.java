package com.avito.android.advert_core.block_header;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlockHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83005a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83006b;

    public b(u uVar, u uVar2) {
        this.f83005a = uVar;
        this.f83006b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f83005a.get(), (com.avito.android.util.text.a) this.f83006b.get());
    }
}
