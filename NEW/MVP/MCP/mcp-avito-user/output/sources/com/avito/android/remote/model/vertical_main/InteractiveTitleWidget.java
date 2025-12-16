package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.FavoriteElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InteractiveTitleWidget.kt */
@d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jb\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b;\u0010\u0015R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010?R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010 \"\u0004\bB\u0010CR(\u0010E\u001a\u00020D8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010L\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/InteractiveTitleWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/FavoriteElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/vertical_main/VerticalInsets;", "verticalInsets", "Lcom/avito/android/remote/model/vertical_main/HorizontalInsets;", "horizontalInsets", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/vertical_main/VerticalInsets;Lcom/avito/android/remote/model/vertical_main/HorizontalInsets;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/vertical_main/VerticalInsets;", "component4", "()Lcom/avito/android/remote/model/vertical_main/HorizontalInsets;", "component5", "component6", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component7", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/vertical_main/VerticalInsets;Lcom/avito/android/remote/model/vertical_main/HorizontalInsets;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/vertical_main/InteractiveTitleWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/vertical_main/VerticalInsets;", "getVerticalInsets", "Lcom/avito/android/remote/model/vertical_main/HorizontalInsets;", "getHorizontalInsets", "getStyle", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InteractiveTitleWidget implements SerpElement, AnalyticsElement, FavoriteElement, SettingsElement {

    @k
    public static final Parcelable.Creator<InteractiveTitleWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("horizontalInsets")
    @l
    private final HorizontalInsets horizontalInsets;

    @c("settings")
    @l
    private Settings settings;

    @c("textStyle")
    @l
    private final String style;

    @c("title")
    @k
    private final String title;
    private long uniqueId;

    @c("verticalInsets")
    @l
    private final VerticalInsets verticalInsets;

    /* compiled from: InteractiveTitleWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InteractiveTitleWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InteractiveTitleWidget createFromParcel(@k Parcel parcel) {
            return new InteractiveTitleWidget(parcel.readString(), (DeepLink) parcel.readParcelable(InteractiveTitleWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : VerticalInsets.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : HorizontalInsets.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InteractiveTitleWidget[] newArray(int i12) {
            return new InteractiveTitleWidget[i12];
        }
    }

    public InteractiveTitleWidget(@k String str, @l DeepLink deepLink, @l VerticalInsets verticalInsets, @l HorizontalInsets horizontalInsets, @l String str2, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.deeplink = deepLink;
        this.verticalInsets = verticalInsets;
        this.horizontalInsets = horizontalInsets;
        this.style = str2;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ InteractiveTitleWidget copy$default(InteractiveTitleWidget interactiveTitleWidget, String str, DeepLink deepLink, VerticalInsets verticalInsets, HorizontalInsets horizontalInsets, String str2, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = interactiveTitleWidget.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = interactiveTitleWidget.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            verticalInsets = interactiveTitleWidget.verticalInsets;
        }
        VerticalInsets verticalInsets2 = verticalInsets;
        if ((i12 & 8) != 0) {
            horizontalInsets = interactiveTitleWidget.horizontalInsets;
        }
        HorizontalInsets horizontalInsets2 = horizontalInsets;
        if ((i12 & 16) != 0) {
            str2 = interactiveTitleWidget.style;
        }
        String str3 = str2;
        if ((i12 & 32) != 0) {
            analytics = interactiveTitleWidget.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i12 & 64) != 0) {
            settings = interactiveTitleWidget.settings;
        }
        return interactiveTitleWidget.copy(str, deepLink2, verticalInsets2, horizontalInsets2, str3, analytics2, settings);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final VerticalInsets getVerticalInsets() {
        return this.verticalInsets;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final HorizontalInsets getHorizontalInsets() {
        return this.horizontalInsets;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final InteractiveTitleWidget copy(@k String title, @l DeepLink deeplink, @l VerticalInsets verticalInsets, @l HorizontalInsets horizontalInsets, @l String style, @l Analytics analytics, @l Settings settings) {
        return new InteractiveTitleWidget(title, deeplink, verticalInsets, horizontalInsets, style, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractiveTitleWidget)) {
            return false;
        }
        InteractiveTitleWidget interactiveTitleWidget = (InteractiveTitleWidget) other;
        return L.f(this.title, interactiveTitleWidget.title) && L.f(this.deeplink, interactiveTitleWidget.deeplink) && L.f(this.verticalInsets, interactiveTitleWidget.verticalInsets) && L.f(this.horizontalInsets, interactiveTitleWidget.horizontalInsets) && L.f(this.style, interactiveTitleWidget.style) && L.f(this.analytics, interactiveTitleWidget.analytics) && L.f(this.settings, interactiveTitleWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final HorizontalInsets getHorizontalInsets() {
        return this.horizontalInsets;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @l
    public final VerticalInsets getVerticalInsets() {
        return this.verticalInsets;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        VerticalInsets verticalInsets = this.verticalInsets;
        int iHashCode3 = (iHashCode2 + (verticalInsets == null ? 0 : verticalInsets.hashCode())) * 31;
        HorizontalInsets horizontalInsets = this.horizontalInsets;
        int iHashCode4 = (iHashCode3 + (horizontalInsets == null ? 0 : horizontalInsets.hashCode())) * 31;
        String str = this.style;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode6 = (iHashCode5 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode6 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public void setAnalytics(@l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public void setSettings(@l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InteractiveTitleWidget(title=");
        sb2.append(this.title);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", verticalInsets=");
        sb2.append(this.verticalInsets);
        sb2.append(", horizontalInsets=");
        sb2.append(this.horizontalInsets);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deeplink, flags);
        VerticalInsets verticalInsets = this.verticalInsets;
        if (verticalInsets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verticalInsets.writeToParcel(parcel, flags);
        }
        HorizontalInsets horizontalInsets = this.horizontalInsets;
        if (horizontalInsets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalInsets.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.style);
        Analytics analytics = this.analytics;
        if (analytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics.writeToParcel(parcel, flags);
        }
        Settings settings = this.settings;
        if (settings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            settings.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ InteractiveTitleWidget(String str, DeepLink deepLink, VerticalInsets verticalInsets, HorizontalInsets horizontalInsets, String str2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, deepLink, verticalInsets, horizontalInsets, str2, (i12 & 32) != 0 ? null : analytics, (i12 & 64) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
