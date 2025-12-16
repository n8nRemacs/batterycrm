package com.avito.android.bundles.di;

import Dk.C13408a;
import com.avito.android.bundles.remote.adapter.BenefitColoredIconAdapter;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: VasBundlesJsonModule_ProvideTypeAdaptersFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<Set<X5>> {

    /* compiled from: VasBundlesJsonModule_ProvideTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final p f108311a = new p();
    }

    public static p a() {
        return a.f108311a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = o.f108310a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(C13408a.class, new BenefitColoredIconAdapter()));
        return linkedHashSet;
    }
}
