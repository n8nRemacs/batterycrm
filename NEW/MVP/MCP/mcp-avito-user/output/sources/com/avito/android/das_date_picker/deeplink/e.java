package com.avito.android.das_date_picker.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCardDatePickerLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f132259a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f132260b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f132261c;

    public e(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f132259a = bVar;
        this.f132260b = bVar2;
        this.f132261c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.d) this.f132259a.get(), (a.f) this.f132260b.get(), this.f132261c.get());
    }
}
