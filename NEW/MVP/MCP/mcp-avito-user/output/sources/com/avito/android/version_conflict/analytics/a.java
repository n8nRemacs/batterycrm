package com.avito.android.version_conflict.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.version_conflict.analytics.ForceUpdateShowCloseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ForceUpdateClosedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/analytics/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f325887b;

    /* compiled from: ForceUpdateClosedEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.version_conflict.analytics.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10070a {
        static {
            int[] iArr = new int[ForceUpdateShowCloseAnalytics.HowClosed.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ForceUpdateShowCloseAnalytics.HowClosed howClosed = ForceUpdateShowCloseAnalytics.HowClosed.f325874b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ForceUpdateShowCloseAnalytics.HowClosed howClosed2 = ForceUpdateShowCloseAnalytics.HowClosed.f325874b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ForceUpdateShowCloseAnalytics.HowClosed howClosed3 = ForceUpdateShowCloseAnalytics.HowClosed.f325874b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ForceUpdateShowCloseAnalytics.HowClosed howClosed4 = ForceUpdateShowCloseAnalytics.HowClosed.f325874b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(@k ForceUpdateShowCloseAnalytics.HowClosed howClosed, @k String str) {
        String str2;
        int iOrdinal = howClosed.ordinal();
        if (iOrdinal == 0) {
            str2 = "update";
        } else if (iOrdinal == 1) {
            str2 = "refuse";
        } else if (iOrdinal == 2) {
            str2 = "x";
        } else if (iOrdinal == 3) {
            str2 = "go_to_mav";
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "no_permission";
        }
        this.f325887b = new ParametrizedClickStreamEvent(8519, 1, P0.g(new Q("how_close_banner", str2), new Q("uuid", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f325887b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f325887b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f325887b.f90248c;
    }
}
