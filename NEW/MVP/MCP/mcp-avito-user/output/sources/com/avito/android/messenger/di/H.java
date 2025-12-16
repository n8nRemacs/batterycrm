package com.avito.android.messenger.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.messenger.di.C32453l0;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideMessageTimeFormatter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H implements dagger.internal.h<LY.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195635a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Locale> f195636b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195637c;

    public H(C32431e c32431e, Provider provider, dagger.internal.l lVar) {
        this.f195635a = c32431e;
        this.f195636b = provider;
        this.f195637c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = (Locale) ((C32453l0.b.E) this.f195636b).get();
        Resources resources = (Resources) this.f195637c.f393949a;
        this.f195635a.getClass();
        return new LY.d(resources.getString(R.string.messenger_message_time_format), locale);
    }
}
