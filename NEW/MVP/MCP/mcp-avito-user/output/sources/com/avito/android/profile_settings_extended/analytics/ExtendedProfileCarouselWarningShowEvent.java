package com.avito.android.profile_settings_extended.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileCarouselWarningShowEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileCarouselWarningShowEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "WarningType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExtendedProfileCarouselWarningShowEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f229979c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f229980b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileCarouselWarningShowEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileCarouselWarningShowEvent$WarningType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WarningType {

        /* renamed from: c, reason: collision with root package name */
        public static final WarningType f229981c;

        /* renamed from: d, reason: collision with root package name */
        public static final WarningType f229982d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ WarningType[] f229983e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229984f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229985b;

        static {
            WarningType warningType = new WarningType("ITEMS_DISABLED", 0, "items_disabled");
            f229981c = warningType;
            WarningType warningType2 = new WarningType("WINDOW_DISABLED", 1, "window_disabled");
            f229982d = warningType2;
            WarningType[] warningTypeArr = {warningType, warningType2};
            f229983e = warningTypeArr;
            f229984f = c.a(warningTypeArr);
        }

        public WarningType(String str, int i12, String str2) {
            this.f229985b = str2;
        }

        public static WarningType valueOf(String str) {
            return (WarningType) Enum.valueOf(WarningType.class, str);
        }

        public static WarningType[] values() {
            return (WarningType[]) f229983e.clone();
        }
    }

    /* compiled from: ExtendedProfileCarouselWarningShowEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/analytics/ExtendedProfileCarouselWarningShowEvent$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ExtendedProfileCarouselWarningShowEvent(WarningType warningType, C42822w c42822w) {
        this.f229980b = new ParametrizedClickStreamEvent(5955, 1, "ext_profile_window_warning_show", Collections.singletonMap("warning_type", warningType.f229985b));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF100588b() {
        return this.f229980b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f229980b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF100589c() {
        return this.f229980b.f90248c;
    }
}
