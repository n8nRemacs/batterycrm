package com.avito.android.beduin.di.module;

import dagger.internal.x;
import dagger.internal.y;
import kotlin.InterfaceC49066a;

/* compiled from: BeduinModule_ProvideBeduinFormActionBusFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<InterfaceC49066a> {

    /* compiled from: BeduinModule_ProvideBeduinFormActionBusFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f103950a = new l();
    }

    public static l a() {
        return a.f103950a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k.f103949a.getClass();
        return new com.avito.android.beduin.common.form.actionbus.a();
    }
}
