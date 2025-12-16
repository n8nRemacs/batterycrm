package com.avito.android.tariff.cpa.prepaid_expense.di;

import com.avito.android.tariff.cpa.prepaid_expense.n;
import com.avito.android.tariff.deeplink.PublicationAdvanceLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: PublicationAdvanceFragmentMappingsModule_ProvidePublicationAdvanceFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: PublicationAdvanceFragmentMappingsModule_ProvidePublicationAdvanceFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f294997a = new f();
    }

    public static f a() {
        return a.f294997a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f294996a.getClass();
        return new A50.a(m0.f406844a.b(PublicationAdvanceLink.class), new n());
    }
}
