package com.avito.android.messenger.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.messenger.di.C32453l0;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideMessageDateFormatter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A implements dagger.internal.h<LY.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195596a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f195597b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f195598c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f195599d;

    public A(C32431e c32431e, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f195596a = c32431e;
        this.f195597b = provider;
        this.f195598c = provider2;
        this.f195599d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((C32453l0.b.i0) this.f195597b).get();
        Locale locale = (Locale) ((C32453l0.b.E) this.f195598c).get();
        Resources resources = (Resources) this.f195599d.f393949a;
        this.f195596a.getClass();
        return new LY.b(fVar, locale, resources.getString(R.string.messenger_message_date_today_string), resources.getString(R.string.messenger_message_date_format_week), resources.getString(R.string.messenger_message_date_format_other), resources.getString(R.string.messenger_message_date_format_other_year_postfix));
    }
}
