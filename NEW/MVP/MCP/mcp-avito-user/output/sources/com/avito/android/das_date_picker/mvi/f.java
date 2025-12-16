package com.avito.android.das_date_picker.mvi;

import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarBootstrap_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f132400a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f132401b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f132402c;

    public f(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f132400a = lVar;
        this.f132401b = uVar;
        this.f132402c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((DasCalendarInitParameters) this.f132400a.f393949a, (n) this.f132401b.get(), this.f132402c.get());
    }
}
