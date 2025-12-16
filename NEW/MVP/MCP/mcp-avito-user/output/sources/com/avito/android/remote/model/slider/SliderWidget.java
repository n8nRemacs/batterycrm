package com.avito.android.remote.model.slider;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SliderWidget.kt */
@d
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Be\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\"\u0010#J|\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020)HÖ\u0001¢\u0006\u0004\b1\u0010+J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020)HÖ\u0001¢\u0006\u0004\b6\u00107R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b<\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b=\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b>\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010\u001fR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010!\"\u0004\bE\u0010FR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010#\"\u0004\bI\u0010JR(\u0010L\u001a\u00020K8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010S\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/avito/android/remote/model/slider/SliderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/UniversalColor;", "startColor", "endColor", "iconColor", "imageBackgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/UniversalImage;", "component7", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component8", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component9", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/slider/SliderWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getStartColor", "getEndColor", "getIconColor", "getImageBackgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SliderWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<SliderWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("endColor")
    @l
    private final UniversalColor endColor;

    @c("iconColor")
    @l
    private final UniversalColor iconColor;

    @c("image")
    @l
    private final UniversalImage image;

    @c("imageBackgroundColor")
    @l
    private final UniversalColor imageBackgroundColor;

    @c("settings")
    @l
    private Settings settings;

    @c("startColor")
    @l
    private final UniversalColor startColor;

    @c("title")
    @l
    private final AttributedText title;
    private transient long uniqueId;

    /* compiled from: SliderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SliderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SliderWidget createFromParcel(@k Parcel parcel) {
            return new SliderWidget((AttributedText) parcel.readParcelable(SliderWidget.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderWidget.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderWidget.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderWidget.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(SliderWidget.class.getClassLoader()), (DeepLink) parcel.readParcelable(SliderWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SliderWidget[] newArray(int i12) {
            return new SliderWidget[i12];
        }
    }

    public SliderWidget(@l AttributedText attributedText, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l UniversalColor universalColor4, @l UniversalImage universalImage, @l DeepLink deepLink, @l Analytics analytics, @l Settings settings) {
        this.title = attributedText;
        this.startColor = universalColor;
        this.endColor = universalColor2;
        this.iconColor = universalColor3;
        this.imageBackgroundColor = universalColor4;
        this.image = universalImage;
        this.deeplink = deepLink;
        this.analytics = analytics;
        this.settings = settings;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getStartColor() {
        return this.startColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getEndColor() {
        return this.endColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getIconColor() {
        return this.iconColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getImageBackgroundColor() {
        return this.imageBackgroundColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final SliderWidget copy(@l AttributedText title, @l UniversalColor startColor, @l UniversalColor endColor, @l UniversalColor iconColor, @l UniversalColor imageBackgroundColor, @l UniversalImage image, @l DeepLink deeplink, @l Analytics analytics, @l Settings settings) {
        return new SliderWidget(title, startColor, endColor, iconColor, imageBackgroundColor, image, deeplink, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderWidget)) {
            return false;
        }
        SliderWidget sliderWidget = (SliderWidget) other;
        return L.f(this.title, sliderWidget.title) && L.f(this.startColor, sliderWidget.startColor) && L.f(this.endColor, sliderWidget.endColor) && L.f(this.iconColor, sliderWidget.iconColor) && L.f(this.imageBackgroundColor, sliderWidget.imageBackgroundColor) && L.f(this.image, sliderWidget.image) && L.f(this.deeplink, sliderWidget.deeplink) && L.f(this.analytics, sliderWidget.analytics) && L.f(this.settings, sliderWidget.settings);
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
    public final UniversalColor getEndColor() {
        return this.endColor;
    }

    @l
    public final UniversalColor getIconColor() {
        return this.iconColor;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final UniversalColor getImageBackgroundColor() {
        return this.imageBackgroundColor;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final UniversalColor getStartColor() {
        return this.startColor;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        UniversalColor universalColor = this.startColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.endColor;
        int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.iconColor;
        int iHashCode4 = (iHashCode3 + (universalColor3 == null ? 0 : universalColor3.hashCode())) * 31;
        UniversalColor universalColor4 = this.imageBackgroundColor;
        int iHashCode5 = (iHashCode4 + (universalColor4 == null ? 0 : universalColor4.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode6 = (iHashCode5 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode7 = (iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode8 = (iHashCode7 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode8 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("SliderWidget(title=");
        sb2.append(this.title);
        sb2.append(", startColor=");
        sb2.append(this.startColor);
        sb2.append(", endColor=");
        sb2.append(this.endColor);
        sb2.append(", iconColor=");
        sb2.append(this.iconColor);
        sb2.append(", imageBackgroundColor=");
        sb2.append(this.imageBackgroundColor);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.startColor, flags);
        parcel.writeParcelable(this.endColor, flags);
        parcel.writeParcelable(this.iconColor, flags);
        parcel.writeParcelable(this.imageBackgroundColor, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.deeplink, flags);
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

    public static /* synthetic */ void getUniqueId$annotations() {
    }

    public /* synthetic */ SliderWidget(AttributedText attributedText, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, UniversalColor universalColor4, UniversalImage universalImage, DeepLink deepLink, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, universalColor, universalColor2, universalColor3, universalColor4, universalImage, deepLink, (i12 & 128) != 0 ? null : analytics, (i12 & 256) != 0 ? null : settings);
    }
}
