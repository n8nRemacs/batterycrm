package com.avito.android.short_term_rent.di.module;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.short_term_rent.di.module.k;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingFragmentModule_Data_ProvideValidationPlaceholdersFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.avito.android.short_term_rent.utils.q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f282344a;

    public m(Provider<Context> provider) {
        this.f282344a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f282344a.get();
        k.b.f282342a.getClass();
        return new com.avito.android.short_term_rent.utils.q(context.getString(R.string.soft_booking_insert_name), context.getString(R.string.soft_booking_insert_phone), context.getString(R.string.soft_booking_insert_email), context.getString(R.string.empty_required_parameter_error));
    }
}
