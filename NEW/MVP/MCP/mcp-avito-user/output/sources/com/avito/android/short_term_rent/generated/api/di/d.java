package com.avito.android.short_term_rent.generated.api.di;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get.BookingFormPageBlock;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ShortTermRentJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes3.dex */
public final class d implements h<Set<r>> {

    /* compiled from: ShortTermRentJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f282390a = new d();
    }

    public static d a() {
        return a.f282390a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.short_term_rent.generated.api.di.a.f282387a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, BookingFormPageBlock.class);
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.a.class, "badge");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.b.class, "button");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.c.class, "dottedText");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.d.class, "infoBanner");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.e.class, "input");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.f.class, "itemPreview");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.g.class, "loanTerms");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.h.class, "paymentMethods");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.i.class, "paymentSchedule");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.j.class, "refundToggle");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.k.class, "retroBadges");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.l.class, "select");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.m.class, "spacing");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.n.class, "text");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.o.class, "toggle");
        optimalRuntimeTypeAdapterFactoryA.b(BookingFormPageBlock.BookingFormBlockToggleV2.class, "toggleV2");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
