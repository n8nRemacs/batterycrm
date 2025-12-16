package com.avito.android.player.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PlayerActor_Factory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<com.avito.android.player.mvi.a> {

    /* compiled from: PlayerActor_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f220138a = new b();
    }

    public static b a() {
        return a.f220138a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.player.mvi.a();
    }
}
