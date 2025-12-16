package com.avito.android.extended_profile.di;

import android.content.res.Resources;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.extended_profile.di.C30397b;
import com.avito.android.serp.adapter.A0;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.b1;
import javax.inject.Provider;

/* compiled from: ExtendedProfileModule_ProvideAdvertConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<InterfaceC34904z0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149952a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f149953b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.serp.adapter.P f149954c;

    public y(dagger.internal.l lVar, Provider provider, com.avito.android.serp.adapter.P p12) {
        this.f149952a = lVar;
        this.f149953b = provider;
        this.f149954c = p12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f149952a.f393949a;
        C36135w2 c36135w2 = (C36135w2) ((C30397b.C4388b.d0) this.f149953b).get();
        com.avito.android.serp.adapter.N n12 = (com.avito.android.serp.adapter.N) this.f149954c.get();
        r rVar = r.f149945a;
        return new A0(new b1(resources.getInteger(R.integer.serp_item_span_count)), new b1(resources.getInteger(R.integer.serp_item_span_count)), resources.getBoolean(R.bool.is_tablet), c36135w2, n12);
    }
}
