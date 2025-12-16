package com.avito.android.screens.bbip_private.di;

import com.avito.android.screens.bbip_private.deeplink.BbipPrivateDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: BbipPrivateFragmentMappingsModule_ProvideBbipPrivateFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<A50.a> {

    /* compiled from: BbipPrivateFragmentMappingsModule_ProvideBbipPrivateFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f260488a = new e();
    }

    public static e a() {
        return a.f260488a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f260487a.getClass();
        return new A50.a(m0.f406844a.b(BbipPrivateDeepLink.class), new com.avito.android.screens.bbip_private.f());
    }
}
