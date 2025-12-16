package com.avito.android.advert_core.offers.analytics;

import Y61.k;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OffersAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/offers/analytics/d;", "Lcom/avito/android/advert_core/offers/analytics/c;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f83809a = new ArrayList();

    @Inject
    public d() {
    }

    @Override // com.avito.android.advert_core.offers.analytics.c
    public final boolean a(long j12) {
        ArrayList arrayList = this.f83809a;
        if (arrayList.contains(Long.valueOf(j12))) {
            return false;
        }
        arrayList.add(Long.valueOf(j12));
        return true;
    }
}
