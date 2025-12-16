package com.avito.android.recent_query_search.widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecentQuerySearchWidget.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"BO\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/avito/android/recent_query_search/widget/RecentQuerySearchWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "query", "description", "Lcom/avito/android/recent_query_search/widget/RecentQuerySearchAction;", "action", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/recent_query_search/widget/RecentQuerySearchAction;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getQuery", "getDescription", "Lcom/avito/android/recent_query_search/widget/RecentQuerySearchAction;", "c", "()Lcom/avito/android/recent_query_search/widget/RecentQuerySearchAction;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecentQuerySearchWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<RecentQuerySearchWidget> CREATOR;

    @c("action")
    @l
    private final RecentQuerySearchAction action;

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f252275b;

    @c("description")
    @l
    private final String description;

    @c("query")
    @l
    private final String query;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @l
    private final String title;

    /* compiled from: RecentQuerySearchWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/recent_query_search/widget/RecentQuerySearchWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecentQuerySearchWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RecentQuerySearchWidget> {
        @Override // android.os.Parcelable.Creator
        public final RecentQuerySearchWidget createFromParcel(Parcel parcel) {
            return new RecentQuerySearchWidget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RecentQuerySearchAction.CREATOR.createFromParcel(parcel), (Analytics) parcel.readParcelable(RecentQuerySearchWidget.class.getClassLoader()), (Settings) parcel.readParcelable(RecentQuerySearchWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecentQuerySearchWidget[] newArray(int i12) {
            return new RecentQuerySearchWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public RecentQuerySearchWidget() {
        this(null, null, null, null, null, null, 63, null);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final RecentQuerySearchAction getAction() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentQuerySearchWidget)) {
            return false;
        }
        RecentQuerySearchWidget recentQuerySearchWidget = (RecentQuerySearchWidget) obj;
        return L.f(this.title, recentQuerySearchWidget.title) && L.f(this.query, recentQuerySearchWidget.query) && L.f(this.description, recentQuerySearchWidget.description) && L.f(this.action, recentQuerySearchWidget.action) && L.f(this.analytics, recentQuerySearchWidget.analytics) && L.f(this.settings, recentQuerySearchWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getQuery() {
        return this.query;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF252275b() {
        return this.f252275b;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.query;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RecentQuerySearchAction recentQuerySearchAction = this.action;
        int iHashCode4 = (iHashCode3 + (recentQuerySearchAction == null ? 0 : recentQuerySearchAction.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode5 = (iHashCode4 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode5 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f252275b = j12;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecentQuerySearchWidget(title=");
        sb2.append(this.title);
        sb2.append(", query=");
        sb2.append(this.query);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.query);
        parcel.writeString(this.description);
        RecentQuerySearchAction recentQuerySearchAction = this.action;
        if (recentQuerySearchAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recentQuerySearchAction.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public RecentQuerySearchWidget(@l String str, @l String str2, @l String str3, @l RecentQuerySearchAction recentQuerySearchAction, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.query = str2;
        this.description = str3;
        this.action = recentQuerySearchAction;
        this.analytics = analytics;
        this.settings = settings;
    }

    public /* synthetic */ RecentQuerySearchWidget(String str, String str2, String str3, RecentQuerySearchAction recentQuerySearchAction, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : recentQuerySearchAction, (i12 & 16) != 0 ? null : analytics, (i12 & 32) != 0 ? null : settings);
    }
}
