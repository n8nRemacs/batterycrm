package com.avito.android.lf_levels.mvi;

import dagger.internal.x;
import dagger.internal.y;
import vR.C49257c;
import vR.InterfaceC49255a;

/* compiled from: LfLevelsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final C49257c f175397a;

    public m(C49257c c49257c) {
        this.f175397a = c49257c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC49255a) this.f175397a.get());
    }
}
