package com.avito.android.screens.bbip_v2.di;

import com.avito.android.screens.bbip.deep_linking.BbipV2DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: BbipV2FragmentMappingsModule_ProvideBbipV2FragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<A50.a> {

    /* compiled from: BbipV2FragmentMappingsModule_ProvideBbipV2FragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f261437a = new c();
    }

    public static c a() {
        return a.f261437a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b.f261436a.getClass();
        return new A50.a(m0.f406844a.b(BbipV2DeepLink.class), new com.avito.android.screens.bbip_v2.d());
    }
}
