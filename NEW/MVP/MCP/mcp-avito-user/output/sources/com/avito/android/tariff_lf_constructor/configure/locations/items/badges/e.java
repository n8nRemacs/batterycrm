package com.avito.android.tariff_lf_constructor.configure.locations.items.badges;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationBadgesItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/items/badges/e;", "Lcom/avito/android/tariff_lf_constructor/configure/locations/items/badges/c;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f299933b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f299934c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f299933b = cVar;
        this.f299934c = cVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.items.badges.c
    @k
    /* renamed from: G5, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF299934c() {
        return this.f299934c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        LocationBadgesItem locationBadgesItem = (LocationBadgesItem) aVar;
        ((g) eVar).RY(new d(this), locationBadgesItem.f299926c, locationBadgesItem.f299927d);
    }
}
