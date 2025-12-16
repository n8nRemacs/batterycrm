package com.avito.android.publish.vinsuggest.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VinSuggestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.vinsuggest.g f245770a;

    public d(com.avito.android.publish.vinsuggest.g gVar) {
        this.f245770a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.publish.vinsuggest.c) this.f245770a.get());
    }
}
