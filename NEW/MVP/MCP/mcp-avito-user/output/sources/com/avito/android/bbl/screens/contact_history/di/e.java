package com.avito.android.bbl.screens.contact_history.di;

import com.avito.android.bbl.screens.contact_history.deeplink.BblContactHistoryLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: BblContactHistoryFragmentMappingsModule_ProvideBblContactHistoryMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<A50.a> {

    /* compiled from: BblContactHistoryFragmentMappingsModule_ProvideBblContactHistoryMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f99641a = new e();
    }

    public static e a() {
        return a.f99641a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f99640a.getClass();
        return new A50.a(m0.f406844a.b(BblContactHistoryLink.class), new com.avito.android.bbl.screens.contact_history.f());
    }
}
