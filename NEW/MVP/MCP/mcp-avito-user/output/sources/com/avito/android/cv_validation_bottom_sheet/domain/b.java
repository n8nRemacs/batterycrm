package com.avito.android.cv_validation_bottom_sheet.domain;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import iQ.InterfaceC41332a;
import javax.inject.Provider;

/* compiled from: CvValidationEnrichInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41332a> f131854a;

    public b(Provider<InterfaceC41332a> provider) {
        this.f131854a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(g.a(w.a(this.f131854a)));
    }
}
