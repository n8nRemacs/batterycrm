package com.avito.android.beduin.common.actionhandler.contextHolder;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinActionContextHolderImpl_Factory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class b implements h<com.avito.android.beduin.common.actionhandler.contextHolder.a> {

    /* compiled from: BeduinActionContextHolderImpl_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f100206a = new b();
    }

    public static b a() {
        return a.f100206a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.beduin.common.actionhandler.contextHolder.a();
    }
}
