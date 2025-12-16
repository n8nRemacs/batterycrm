package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BannerEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "a", "b", "c", "d", "e", "FromPage", "f", "g", "h", "i", "j", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$FromPage;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f89907b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f89908c;

        static {
            FromPage[] fromPageArr = {new FromPage()};
            f89907b = fromPageArr;
            f89908c = kotlin.enums.c.a(fromPageArr);
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f89907b.clone();
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$b;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89910b;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
            int i12 = 3207;
            this.f89910b = new ParametrizedClickStreamEvent(i12, 2, kotlin.collections.P0.g(new kotlin.Q("banner_id", str), new kotlin.Q("pagetype", str2), new kotlin.Q("action_type", str3), new kotlin.Q("uid", str5), new kotlin.Q("iid", str4)), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89910b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89910b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89910b.f90248c;
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$c;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89911b;

        public c(String str, String str2, String str3, String str4, String str5, FromPage fromPage, String str6, Integer num, Boolean bool, String str7, String str8, String str9, int i12, C42822w c42822w) {
            String str10 = (i12 & 16) != 0 ? null : str5;
            FromPage fromPage2 = (i12 & 32) != 0 ? null : fromPage;
            String str11 = (i12 & 64) != 0 ? null : str6;
            Integer num2 = (i12 & 128) != 0 ? null : num;
            Boolean bool2 = (i12 & 256) != 0 ? null : bool;
            String str12 = (i12 & 512) != 0 ? null : str7;
            String str13 = (i12 & 1024) != 0 ? null : str8;
            String str14 = (i12 & 2048) != 0 ? null : str9;
            this.f89911b = new ParametrizedClickStreamEvent(3207, 8, C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("iid", str10), new kotlin.Q("pagetype", str), new kotlin.Q("from_page", fromPage2 != null ? "my_profile_items" : null), new kotlin.Q("banner_type", str11), new kotlin.Q("placement", str2), new kotlin.Q("action_type", str3), new kotlin.Q("banner_id", str4), new kotlin.Q("banner_due_date", num2), new kotlin.Q("banner_show_days", bool2), new kotlin.Q("banner_item_id", str12), new kotlin.Q("verification_banner_state", str13), new kotlin.Q("verification_period", str14))), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89911b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89911b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89911b.f90248c;
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$d;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89912b;

        public d() {
            int i12 = 3282;
            this.f89912b = new ParametrizedClickStreamEvent(i12, 1, kotlin.collections.P0.g(new kotlin.Q("banner_id", "notifications"), new kotlin.Q("pagetype", NotificationsSettings.Section.SECTION_MESSENGER), new kotlin.Q("placement", "top")), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89912b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89912b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89912b.f90248c;
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$e;", "", "<init>", "()V", "", "ACTION_BUTTON_CLICK", "Ljava/lang/String;", "ACTION_CLICK", "ACTION_LINK_CLICK", "", "BANNER_ACTION_EVENT_ID", "I", "BANNER_CLOSE_EVENT_ID", "BANNER_PROFILE_CLOSE_EVENT_ID", "BANNER_SHOWN_EVENT_ID", "ID_NOTIFICATIONS", "ID_RE_OWNER_VERIFICATION", "PAGE_TYPE_ITEM_VIEW", "PAGE_TYPE_MESSENGER", "PAGE_TYPE_PROFILE", "PAGE_TYPE_PROFILE_MANAGEMENT", "PAGE_TYPE_SERP", "PLACEMENT_TOP", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$f;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89913b;

        public f(@Y61.k String str) {
            int i12 = 3182;
            this.f89913b = new ParametrizedClickStreamEvent(i12, 1, kotlin.collections.P0.g(new kotlin.Q("banner_id", str), new kotlin.Q("pagetype", "serp"), new kotlin.Q("placement", "top")), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89913b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89913b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89913b.f90248c;
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$g;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89914b;

        public g(String str, String str2, String str3, FromPage fromPage, String str4, Integer num, int i12, C42822w c42822w) {
            this.f89914b = new ParametrizedClickStreamEvent(3182, 5, C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("pagetype", str2), new kotlin.Q("from_page", ((i12 & 8) != 0 ? null : fromPage) != null ? "my_profile_items" : null), new kotlin.Q("banner_type", (i12 & 16) != 0 ? null : str4), new kotlin.Q("placement", str3), new kotlin.Q("banner_id", str), new kotlin.Q("close_timeout", (i12 & 32) != 0 ? null : num))), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89914b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89914b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89914b.f90248c;
        }
    }

    /* compiled from: BannerEvent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$h;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89915b;

        public h(String str, String str2, String str3, int i12, C42822w c42822w) {
            this.f89915b = new ParametrizedClickStreamEvent(3180, 0, kotlin.collections.P0.g(new kotlin.Q("banner_id", str), new kotlin.Q("pagetype", str2), new kotlin.Q("placement", (i12 & 4) != 0 ? "" : str3)), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89915b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89915b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89915b.f90248c;
        }
    }

    /* compiled from: BannerEvent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$i;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89916b;

        public /* synthetic */ i(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89916b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89916b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89916b.f90248c;
        }

        public i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f89916b = new ParametrizedClickStreamEvent(3180, 1, kotlin.collections.P0.g(new kotlin.Q("banner_id", str), new kotlin.Q("pagetype", str2), new kotlin.Q("uid", str4), new kotlin.Q("iid", str3)), null, 8, null);
        }
    }

    /* compiled from: BannerEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$j;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89917b;

        public j(String str, String str2, String str3, String str4, FromPage fromPage, String str5, String str6, int i12, C42822w c42822w) {
            this.f89917b = new ParametrizedClickStreamEvent(3180, 6, C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("iid", (i12 & 8) != 0 ? null : str4), new kotlin.Q("pagetype", str2), new kotlin.Q("from_page", ((i12 & 16) != 0 ? null : fromPage) != null ? "my_profile_items" : null), new kotlin.Q("banner_type", (i12 & 32) != 0 ? null : str5), new kotlin.Q("placement", str3), new kotlin.Q("banner_id", str), new kotlin.Q("verification_period", (i12 & 64) != 0 ? null : str6))), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89917b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89917b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89917b.f90248c;
        }
    }

    static {
        new e(null);
    }

    /* compiled from: BannerEvent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/BannerEvent$a;", "Lcom/avito/android/analytics/event/BannerEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends BannerEvent implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f89909b;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f89909b = new ParametrizedClickStreamEvent(3207, 1, kotlin.collections.P0.g(new kotlin.Q("banner_id", str), new kotlin.Q("pagetype", str2), new kotlin.Q("placement", str3), new kotlin.Q("action_type", str4)), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f89909b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f89909b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f89909b.f90248c;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? "" : str3, str4);
        }
    }
}
