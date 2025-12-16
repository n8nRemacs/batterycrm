package com.avito.android.version_conflict.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.version_conflict.analytics.ForceUpdateShowCloseAnalytics;
import com.my.tracker.ads.AdFormat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ForceUpdateShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/analytics/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f325892b;

    /* compiled from: ForceUpdateShownEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ForceUpdateShowCloseAnalytics.FromPage.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ForceUpdateShowCloseAnalytics.FromPage fromPage = ForceUpdateShowCloseAnalytics.FromPage.f325870b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ForceUpdateShowCloseAnalytics.FromPage fromPage2 = ForceUpdateShowCloseAnalytics.FromPage.f325870b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(@k ForceUpdateShowCloseAnalytics.FromPage fromPage, @k String str) {
        String str2;
        int iOrdinal = fromPage.ordinal();
        if (iOrdinal == 0) {
            str2 = "dialog";
        } else if (iOrdinal == 1) {
            str2 = AdFormat.BANNER;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "blocking";
        }
        this.f325892b = new ParametrizedClickStreamEvent(8518, 1, P0.g(new Q("from_page", str2), new Q("uuid", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f325892b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f325892b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f325892b.f90248c;
    }
}
