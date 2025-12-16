package com.avito.android.str_booking.di;

import com.avito.android.socketEvents.SocketEventParserByClass;
import com.avito.android.str_booking.di.o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingModule_SocketEventModule_ProvideBookingPollingEventMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final o.b f285568a;

    public r(o.b bVar) {
        this.f285568a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f285568a.getClass();
        return new mx0.c(com.avito.android.str_booking.domain.polling.a.class, new mx0.e("str.BookingPageUpdate", null, false, 6, null), new SocketEventParserByClass(com.avito.android.str_booking.domain.polling.a.class));
    }
}
