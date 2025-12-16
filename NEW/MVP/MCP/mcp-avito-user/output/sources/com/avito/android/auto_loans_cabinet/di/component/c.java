package com.avito.android.auto_loans_cabinet.di.component;

import Ge.C13870b;
import Ge.C13871c;
import com.avito.android.auto_loans_cabinet.deeplink.AutoLoanCabinetPageLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutoLoanCabinetPageDeeplinkModule_ProvideAutoLoanCabinetPageDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13870b f95353a;

    public c(C13870b c13870b) {
        this.f95353a = c13870b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C13870b c13870b = this.f95353a;
        b.f95352a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AutoLoanCabinetPageLink.class, new C13871c(), new C43834a.b.C11809b(c13870b));
    }
}
