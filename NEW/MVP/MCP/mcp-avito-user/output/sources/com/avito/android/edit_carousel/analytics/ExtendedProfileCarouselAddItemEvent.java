package com.avito.android.edit_carousel.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ExtendedProfileCarouselAddItemEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/analytics/ExtendedProfileCarouselAddItemEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "FromPage", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileCarouselAddItemEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f146332b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileCarouselAddItemEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/analytics/ExtendedProfileCarouselAddItemEvent$FromPage;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: c, reason: collision with root package name */
        public static final FromPage f146333c;

        /* renamed from: d, reason: collision with root package name */
        public static final FromPage f146334d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f146335e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f146336f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f146337b;

        static {
            FromPage fromPage = new FromPage("PROFILE_SETTINGS", 0, "profile_settings");
            f146333c = fromPage;
            FromPage fromPage2 = new FromPage("ITEMS_SELECTION", 1, "items_selection");
            f146334d = fromPage2;
            FromPage[] fromPageArr = {fromPage, fromPage2};
            f146335e = fromPageArr;
            f146336f = c.a(fromPageArr);
        }

        public FromPage(String str, int i12, String str2) {
            this.f146337b = str2;
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f146335e.clone();
        }
    }

    public ExtendedProfileCarouselAddItemEvent(@k FromPage fromPage, int i12, @k CarouselAnalyticsScenario carouselAnalyticsScenario) {
        this.f146332b = new ParametrizedClickStreamEvent(5948, 3, "ext_profile_window_add_item", P0.g(new Q("page_from", fromPage.f146337b), new Q("items_count", Integer.valueOf(i12)), new Q("window_scenario", carouselAnalyticsScenario.f146325b)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f146332b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f146332b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f146332b.f90248c;
    }
}
