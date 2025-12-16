package com.avito.android.service_booking_common.di;

import com.avito.android.util.InterfaceC35945t1;
import java.util.Locale;

/* compiled from: ServiceBookingTimeslotItemModule_ProvideTimeslotFormatFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class E implements dagger.internal.h<InterfaceC35945t1<Long>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f276512a;

    public E(dagger.internal.u uVar) {
        this.f276512a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.j jVar = (com.avito.android.server_time.j) this.f276512a.get();
        w.f276556a.getClass();
        return new com.avito.android.date_time_formatter.r("HH:mm", new Locale("ru", "RU"), jVar);
    }
}
