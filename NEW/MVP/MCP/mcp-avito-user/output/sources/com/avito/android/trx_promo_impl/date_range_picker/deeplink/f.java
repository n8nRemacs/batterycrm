package com.avito.android.trx_promo_impl.date_range_picker.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoConfigureDateRangePickerDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f303996a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f303997b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f303998c;

    public f(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f303996a = bVar;
        this.f303997b = bVar2;
        this.f303998c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.d) this.f303997b.get(), (a.f) this.f303996a.get(), this.f303998c.get());
    }
}
