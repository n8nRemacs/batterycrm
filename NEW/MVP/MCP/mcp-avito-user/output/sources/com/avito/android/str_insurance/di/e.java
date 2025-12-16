package com.avito.android.str_insurance.di;

import com.avito.android.str_insurance.StrInsuranceLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrInsuranceLinkHandlerModule_ProvideStrInsuranceLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_insurance.navigation.b f288556a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.str_insurance.navigation.f f288557b;

    public e(com.avito.android.str_insurance.navigation.b bVar, com.avito.android.str_insurance.navigation.f fVar) {
        this.f288556a = bVar;
        this.f288557b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f288557b.getClass();
        com.avito.android.str_insurance.navigation.e eVar = new com.avito.android.str_insurance.navigation.e();
        com.avito.android.str_insurance.navigation.b bVar = this.f288556a;
        d.f288555a.getClass();
        return new C43834a(StrInsuranceLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrInsuranceLink.class), bVar));
    }
}
