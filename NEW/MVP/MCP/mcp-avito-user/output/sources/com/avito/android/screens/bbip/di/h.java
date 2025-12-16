package com.avito.android.screens.bbip.di;

import com.avito.android.screens.bbip.deep_linking.BbipDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;
import mp0.C44118a;

/* compiled from: BbipFragmentMappingsModule_ProvideBbipFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<A50.a> {

    /* compiled from: BbipFragmentMappingsModule_ProvideBbipFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f260221a = new h();
    }

    public static h a() {
        return a.f260221a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f260220a.getClass();
        return new A50.a(m0.f406844a.b(BbipDeepLink.class), new C44118a());
    }
}
