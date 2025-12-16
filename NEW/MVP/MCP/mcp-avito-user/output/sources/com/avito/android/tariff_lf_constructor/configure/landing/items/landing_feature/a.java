package com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: LandingFeatureItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/landing/items/landing_feature/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299696b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299697c;

    public a(@k String str, @k String str2) {
        this.f299696b = str;
        this.f299697c = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207385b() {
        return getF298989b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298989b() {
        return this.f299696b;
    }
}
