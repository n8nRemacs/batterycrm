package com.avito.android.analytics.coverage;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ScreenCoverageEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/coverage/ScreenCoverageEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ScreenType", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenCoverageEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f89848b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenCoverageEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/coverage/ScreenCoverageEvent$ScreenType;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScreenType {

        /* renamed from: c, reason: collision with root package name */
        public static final ScreenType f89849c;

        /* renamed from: d, reason: collision with root package name */
        public static final ScreenType f89850d;

        /* renamed from: e, reason: collision with root package name */
        public static final ScreenType f89851e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ScreenType[] f89852f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f89853g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f89854b;

        static {
            ScreenType screenType = new ScreenType("Screen", 0, "screen");
            f89849c = screenType;
            ScreenType screenType2 = new ScreenType("NotScreen", 1, "not_screen");
            f89850d = screenType2;
            ScreenType screenType3 = new ScreenType("Unknown", 2, "unknown");
            f89851e = screenType3;
            ScreenType[] screenTypeArr = {screenType, screenType2, screenType3};
            f89852f = screenTypeArr;
            f89853g = kotlin.enums.c.a(screenTypeArr);
        }

        public ScreenType(String str, int i12, String str2) {
            this.f89854b = str2;
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) f89852f.clone();
        }
    }

    public ScreenCoverageEvent(@k String str, @l String str2, @k ScreenType screenType) {
        this.f89848b = new ParametrizedClickStreamEvent(4944, 3, P0.g(new Q("physic_view_name", str), new Q("logic_tracker_name", str2 == null ? "" : str2), new Q("screen_status", screenType.f89854b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f89848b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f89848b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f89848b.f90248c;
    }
}
