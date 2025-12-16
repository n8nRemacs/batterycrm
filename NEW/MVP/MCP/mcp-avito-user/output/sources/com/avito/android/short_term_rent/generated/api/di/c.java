package com.avito.android.short_term_rent.generated.api.di;

import com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get.BookingFormPageBlockTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: ShortTermRentJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes3.dex */
public final class c implements h<Set<r>> {

    /* compiled from: ShortTermRentJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f282389a = new c();
    }

    public static c a() {
        return a.f282389a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.short_term_rent.generated.api.di.a.f282387a.getClass();
        return Collections.singleton(new BookingFormPageBlockTypeAdapterFactory());
    }
}
