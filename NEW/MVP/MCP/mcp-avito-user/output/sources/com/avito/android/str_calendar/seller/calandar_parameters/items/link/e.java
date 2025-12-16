package com.avito.android.str_calendar.seller.calandar_parameters.items.link;

import com.avito.android.str_calendar.seller.calandar_parameters.t;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LinkFormItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f287233a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<t> f287234b;

    public e(l lVar, Provider provider) {
        this.f287233a = lVar;
        this.f287234b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f287233a.f393949a, this.f287234b.get());
    }
}
