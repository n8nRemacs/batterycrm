package com.avito.android.profile.user_profile.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.remote.model.UserTypeCode;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: ProfileWidgetClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/analytics/ProfileWidgetClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "TargetPage", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileWidgetClickEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f224270b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileWidgetClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/analytics/ProfileWidgetClickEvent$TargetPage;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TargetPage {

        /* renamed from: c, reason: collision with root package name */
        public static final TargetPage f224271c;

        /* renamed from: d, reason: collision with root package name */
        public static final TargetPage f224272d;

        /* renamed from: e, reason: collision with root package name */
        public static final TargetPage f224273e;

        /* renamed from: f, reason: collision with root package name */
        public static final TargetPage f224274f;

        /* renamed from: g, reason: collision with root package name */
        public static final TargetPage f224275g;

        /* renamed from: h, reason: collision with root package name */
        public static final TargetPage f224276h;

        /* renamed from: i, reason: collision with root package name */
        public static final TargetPage f224277i;

        /* renamed from: j, reason: collision with root package name */
        public static final TargetPage f224278j;

        /* renamed from: k, reason: collision with root package name */
        public static final TargetPage f224279k;

        /* renamed from: l, reason: collision with root package name */
        public static final TargetPage f224280l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ TargetPage[] f224281m;

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f224282n;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f224283b;

        static {
            TargetPage targetPage = new TargetPage("PHONES", 0, "phones");
            f224271c = targetPage;
            TargetPage targetPage2 = new TargetPage("SOCIAL", 1, "social");
            f224272d = targetPage2;
            TargetPage targetPage3 = new TargetPage("TARIFF", 2, "tariff");
            f224273e = targetPage3;
            TargetPage targetPage4 = new TargetPage("DELIVERY", 3, NotificationsSettings.Section.SECTION_DELIVERY);
            f224274f = targetPage4;
            TargetPage targetPage5 = new TargetPage("AUCTION", 4, "auction");
            f224275g = targetPage5;
            TargetPage targetPage6 = new TargetPage("INCOME", 5, "income");
            f224276h = targetPage6;
            TargetPage targetPage7 = new TargetPage("HELP", 6, "help_center");
            f224277i = targetPage7;
            TargetPage targetPage8 = new TargetPage("VOIP_SESSIONS", 7, "voip_sessions");
            f224278j = targetPage8;
            TargetPage targetPage9 = new TargetPage("SAFETY", 8, "safety");
            f224279k = targetPage9;
            TargetPage targetPage10 = new TargetPage("LOGOUT", 9, "settings/logout");
            f224280l = targetPage10;
            TargetPage[] targetPageArr = {targetPage, targetPage2, targetPage3, targetPage4, targetPage5, targetPage6, targetPage7, targetPage8, targetPage9, targetPage10};
            f224281m = targetPageArr;
            f224282n = c.a(targetPageArr);
        }

        public TargetPage(String str, int i12, String str2) {
            this.f224283b = str2;
        }

        public static TargetPage valueOf(String str) {
            return (TargetPage) Enum.valueOf(TargetPage.class, str);
        }

        public static TargetPage[] values() {
            return (TargetPage[]) f224281m.clone();
        }
    }

    public ProfileWidgetClickEvent(@k String str, @k TargetPage targetPage) {
        this.f224270b = new ParametrizedClickStreamEvent(16296, 1, P0.g(new Q("uid", str), new Q("from_page", "profile"), new Q("target_page", targetPage.f224283b), new Q("lk_type", UserTypeCode.PRIVATE)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f224270b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f224270b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f224270b.f90248c;
    }
}
