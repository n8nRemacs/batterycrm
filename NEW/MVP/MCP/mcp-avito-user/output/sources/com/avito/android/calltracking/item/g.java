package com.avito.android.calltracking.item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalltrackingItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final k f113723a;

    public g(k kVar) {
        this.f113723a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((j) this.f113723a.get());
    }
}
