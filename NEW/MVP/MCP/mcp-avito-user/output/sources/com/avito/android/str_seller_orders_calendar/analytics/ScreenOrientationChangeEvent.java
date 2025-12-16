package com.avito.android.str_seller_orders_calendar.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenOrientationChangeEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/analytics/ScreenOrientationChangeEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Companion", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenOrientationChangeEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f290365b;

    /* compiled from: ScreenOrientationChangeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/analytics/ScreenOrientationChangeEvent$Companion;", "", "()V", "TargetOrientation", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ScreenOrientationChangeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/analytics/ScreenOrientationChangeEvent$Companion$TargetOrientation;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TargetOrientation {

            /* renamed from: c, reason: collision with root package name */
            public static final TargetOrientation f290366c;

            /* renamed from: d, reason: collision with root package name */
            public static final TargetOrientation f290367d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ TargetOrientation[] f290368e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f290369f;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f290370b;

            static {
                TargetOrientation targetOrientation = new TargetOrientation("TO_VERTICAL", 0, "to_vertical");
                f290366c = targetOrientation;
                TargetOrientation targetOrientation2 = new TargetOrientation("TO_HORIZONTAL", 1, "to_horizontal");
                f290367d = targetOrientation2;
                TargetOrientation[] targetOrientationArr = {targetOrientation, targetOrientation2};
                f290368e = targetOrientationArr;
                f290369f = c.a(targetOrientationArr);
            }

            public TargetOrientation(String str, int i12, String str2) {
                this.f290370b = str2;
            }

            public static TargetOrientation valueOf(String str) {
                return (TargetOrientation) Enum.valueOf(TargetOrientation.class, str);
            }

            public static TargetOrientation[] values() {
                return (TargetOrientation[]) f290368e.clone();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    static {
        new Companion(null);
    }

    public ScreenOrientationChangeEvent(@k String str, @l Companion.TargetOrientation targetOrientation) {
        Q q12 = new Q("uid", str);
        String str2 = targetOrientation != null ? targetOrientation.f290370b : null;
        this.f290365b = new ParametrizedClickStreamEvent(9717, 0, P0.g(q12, new Q("type", str2 == null ? "" : str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f290365b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f290365b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f290365b.f90248c;
    }
}
