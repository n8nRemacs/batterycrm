package com.avito.android.cross_category;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CrossCategoryWidget.kt */
@K51.d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*BQ\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/avito/android/cross_category/CrossCategoryWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "query", "Lcom/avito/android/cross_category/Action;", "action", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/cross_category/AnalyticParams;", "analyticParams", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/cross_category/Action;Lcom/avito/android/remote/model/Image;Lcom/avito/android/cross_category/AnalyticParams;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getQuery", "Lcom/avito/android/cross_category/Action;", "getAction", "()Lcom/avito/android/cross_category/Action;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/cross_category/AnalyticParams;", "getAnalyticParams", "()Lcom/avito/android/cross_category/AnalyticParams;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_cross-category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CrossCategoryWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @Y61.k
    public static final Parcelable.Creator<CrossCategoryWidget> CREATOR;

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final Action action;

    @com.google.gson.annotations.c("analyticParams")
    @Y61.l
    private final AnalyticParams analyticParams;

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f131042b;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("query")
    @Y61.l
    private final String query;

    @com.google.gson.annotations.c("settings")
    @Y61.l
    private Settings settings;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: CrossCategoryWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cross_category/CrossCategoryWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_cross-category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CrossCategoryWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CrossCategoryWidget> {
        @Override // android.os.Parcelable.Creator
        public final CrossCategoryWidget createFromParcel(Parcel parcel) {
            return new CrossCategoryWidget(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), (Image) parcel.readParcelable(CrossCategoryWidget.class.getClassLoader()), parcel.readInt() != 0 ? AnalyticParams.CREATOR.createFromParcel(parcel) : null, (Analytics) parcel.readParcelable(CrossCategoryWidget.class.getClassLoader()), (Settings) parcel.readParcelable(CrossCategoryWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CrossCategoryWidget[] newArray(int i12) {
            return new CrossCategoryWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CrossCategoryWidget(@Y61.l String str, @Y61.l String str2, @Y61.l Action action, @Y61.l Image image, @Y61.l AnalyticParams analyticParams, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.title = str;
        this.query = str2;
        this.action = action;
        this.image = image;
        this.analyticParams = analyticParams;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossCategoryWidget)) {
            return false;
        }
        CrossCategoryWidget crossCategoryWidget = (CrossCategoryWidget) obj;
        return L.f(this.title, crossCategoryWidget.title) && L.f(this.query, crossCategoryWidget.query) && L.f(this.action, crossCategoryWidget.action) && L.f(this.image, crossCategoryWidget.image) && L.f(this.analyticParams, crossCategoryWidget.analyticParams) && L.f(this.analytics, crossCategoryWidget.analytics) && L.f(this.settings, crossCategoryWidget.settings);
    }

    @Y61.l
    public final Action getAction() {
        return this.action;
    }

    @Y61.l
    public final AnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @Y61.l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Y61.l
    public final Image getImage() {
        return this.image;
    }

    @Y61.l
    public final String getQuery() {
        return this.query;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @Y61.l
    public final Settings getSettings() {
        return this.settings;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final long getUniqueId() {
        return this.f131042b;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.query;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.action;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        Image image = this.image;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        AnalyticParams analyticParams = this.analyticParams;
        int iHashCode5 = (iHashCode4 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode6 = (iHashCode5 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode6 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@Y61.l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@Y61.l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f131042b = j12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CrossCategoryWidget(title=");
        sb2.append(this.title);
        sb2.append(", query=");
        sb2.append(this.query);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.query);
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.image, i12);
        AnalyticParams analyticParams = this.analyticParams;
        if (analyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticParams.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ CrossCategoryWidget(String str, String str2, Action action, Image image, AnalyticParams analyticParams, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, action, image, analyticParams, (i12 & 32) != 0 ? null : analytics, (i12 & 64) != 0 ? null : settings);
    }
}
