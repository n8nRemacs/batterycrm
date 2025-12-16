package com.avito.android.str_calendar.seller.calandar_parameters.domain.children;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChildrenAgesGroupParameterHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f286935a;

    public i(Provider<a> provider) {
        this.f286935a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f286935a.get());
    }
}
