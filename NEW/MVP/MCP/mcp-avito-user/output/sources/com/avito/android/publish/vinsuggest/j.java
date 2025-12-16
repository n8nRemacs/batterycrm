package com.avito.android.publish.vinsuggest;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VinSuggestViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.vinsuggest.mvi.g f245767a;

    public j(com.avito.android.publish.vinsuggest.mvi.g gVar) {
        this.f245767a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.publish.vinsuggest.mvi.f) this.f245767a.get(), null, 2, null);
    }
}
