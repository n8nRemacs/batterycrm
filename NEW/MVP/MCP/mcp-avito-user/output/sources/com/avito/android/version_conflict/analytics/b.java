package com.avito.android.version_conflict.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.version_conflict.analytics.ForceUpdateWebViewAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ForceUpdateGoToMavEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/analytics/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f325888b;

    /* compiled from: ForceUpdateGoToMavEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ForceUpdateWebViewAnalytics.FromPage.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ForceUpdateWebViewAnalytics.FromPage fromPage = ForceUpdateWebViewAnalytics.FromPage.f325883b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(@k ForceUpdateWebViewAnalytics.FromPage fromPage, @k String str) {
        String str2;
        Q q12 = new Q("device_id", str);
        int iOrdinal = fromPage.ordinal();
        if (iOrdinal == 0) {
            str2 = "manual";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "force_redirect";
        }
        this.f325888b = new ParametrizedClickStreamEvent(8520, 2, P0.g(q12, new Q("from_page", str2), new Q("platform", "Android")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f325888b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f325888b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f325888b.f90248c;
    }
}
