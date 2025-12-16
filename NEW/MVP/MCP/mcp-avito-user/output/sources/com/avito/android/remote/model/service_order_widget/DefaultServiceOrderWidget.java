package com.avito.android.remote.model.service_order_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderWidget.kt */
@d
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0092\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020/HÖ\u0001¢\u0006\u0004\b7\u00101J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020/HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\bG\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bI\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bJ\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bM\u0010&R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010)\"\u0004\bP\u0010QR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010R\u001a\u0004\bS\u0010+\"\u0004\bT\u0010UR(\u0010W\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b]\u0010^\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/DefaultServiceOrderWidget;", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget;", "", "title", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "layoutType", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "primaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "analyticParams", "secondaryAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectDeeplink", "descriptionPromoLink", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "component3", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Lcom/avito/android/remote/model/UniversalImage;", "component6", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "component7", "component8", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component9", "component10", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component11", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/service_order_widget/DefaultServiceOrderWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "getLayoutType", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "getPrimaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "getAnalyticParams", "getSecondaryAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "getRedirectDeeplink", "getDescriptionPromoLink", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DefaultServiceOrderWidget implements ServiceOrderWidget {

    @k
    public static final Parcelable.Creator<DefaultServiceOrderWidget> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final ServiceOrderWidget.AnalyticsParams analyticParams;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("description")
    @l
    private final AttributedText description;

    @c("descriptionPromoLink")
    @l
    private final DeepLink descriptionPromoLink;

    @c("image")
    @l
    private final UniversalImage image;

    @c("layoutType")
    @l
    private final ServiceOrderWidget.ServiceOrderWidgetLayoutType layoutType;

    @c("primaryAction")
    @l
    private final ServiceOrderWidget.ServiceOrderWidgetAction primaryAction;

    @c("redirectDeeplink")
    @l
    private final DeepLink redirectDeeplink;

    @c("secondaryAction")
    @l
    private final ServiceOrderWidget.ServiceOrderWidgetAction secondaryAction;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @k
    private final String title;
    private transient long uniqueId;

    /* compiled from: ServiceOrderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DefaultServiceOrderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DefaultServiceOrderWidget createFromParcel(@k Parcel parcel) {
            return new DefaultServiceOrderWidget(parcel.readString(), parcel.readInt() == 0 ? null : ServiceOrderWidget.ServiceOrderWidgetLayoutType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ServiceOrderWidget.ServiceOrderWidgetAction.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(DefaultServiceOrderWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(DefaultServiceOrderWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : ServiceOrderWidget.AnalyticsParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ServiceOrderWidget.ServiceOrderWidgetAction.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(DefaultServiceOrderWidget.class.getClassLoader()), (DeepLink) parcel.readParcelable(DefaultServiceOrderWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DefaultServiceOrderWidget[] newArray(int i12) {
            return new DefaultServiceOrderWidget[i12];
        }
    }

    public DefaultServiceOrderWidget(@k String str, @l ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType, @l ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction, @l AttributedText attributedText, @l UniversalImage universalImage, @l ServiceOrderWidget.AnalyticsParams analyticsParams, @l ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2, @l DeepLink deepLink, @l DeepLink deepLink2, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.layoutType = serviceOrderWidgetLayoutType;
        this.primaryAction = serviceOrderWidgetAction;
        this.description = attributedText;
        this.image = universalImage;
        this.analyticParams = analyticsParams;
        this.secondaryAction = serviceOrderWidgetAction2;
        this.redirectDeeplink = deepLink;
        this.descriptionPromoLink = deepLink2;
        this.analytics = analytics;
        this.settings = settings;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ServiceOrderWidget.ServiceOrderWidgetLayoutType getLayoutType() {
        return this.layoutType;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ServiceOrderWidget.ServiceOrderWidgetAction getPrimaryAction() {
        return this.primaryAction;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final ServiceOrderWidget.AnalyticsParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ServiceOrderWidget.ServiceOrderWidgetAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DeepLink getRedirectDeeplink() {
        return this.redirectDeeplink;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getDescriptionPromoLink() {
        return this.descriptionPromoLink;
    }

    @k
    public final DefaultServiceOrderWidget copy(@k String title, @l ServiceOrderWidget.ServiceOrderWidgetLayoutType layoutType, @l ServiceOrderWidget.ServiceOrderWidgetAction primaryAction, @l AttributedText description, @l UniversalImage image, @l ServiceOrderWidget.AnalyticsParams analyticParams, @l ServiceOrderWidget.ServiceOrderWidgetAction secondaryAction, @l DeepLink redirectDeeplink, @l DeepLink descriptionPromoLink, @l Analytics analytics, @l Settings settings) {
        return new DefaultServiceOrderWidget(title, layoutType, primaryAction, description, image, analyticParams, secondaryAction, redirectDeeplink, descriptionPromoLink, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultServiceOrderWidget)) {
            return false;
        }
        DefaultServiceOrderWidget defaultServiceOrderWidget = (DefaultServiceOrderWidget) other;
        return L.f(this.title, defaultServiceOrderWidget.title) && this.layoutType == defaultServiceOrderWidget.layoutType && L.f(this.primaryAction, defaultServiceOrderWidget.primaryAction) && L.f(this.description, defaultServiceOrderWidget.description) && L.f(this.image, defaultServiceOrderWidget.image) && L.f(this.analyticParams, defaultServiceOrderWidget.analyticParams) && L.f(this.secondaryAction, defaultServiceOrderWidget.secondaryAction) && L.f(this.redirectDeeplink, defaultServiceOrderWidget.redirectDeeplink) && L.f(this.descriptionPromoLink, defaultServiceOrderWidget.descriptionPromoLink) && L.f(this.analytics, defaultServiceOrderWidget.analytics) && L.f(this.settings, defaultServiceOrderWidget.settings);
    }

    @Override // com.avito.android.remote.model.service_order_widget.ServiceOrderWidget
    @l
    public ServiceOrderWidget.AnalyticsParams getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @Override // com.avito.android.remote.model.service_order_widget.ServiceOrderWidget
    @l
    public AttributedText getDescription() {
        return this.description;
    }

    @l
    public final DeepLink getDescriptionPromoLink() {
        return this.descriptionPromoLink;
    }

    @Override // com.avito.android.remote.model.service_order_widget.ServiceOrderWidget
    @l
    public UniversalImage getImage() {
        return this.image;
    }

    @Override // com.avito.android.remote.model.service_order_widget.ServiceOrderWidget
    @l
    public ServiceOrderWidget.ServiceOrderWidgetLayoutType getLayoutType() {
        return this.layoutType;
    }

    @Override // com.avito.android.remote.model.service_order_widget.ServiceOrderWidget
    @l
    public ServiceOrderWidget.ServiceOrderWidgetAction getPrimaryAction() {
        return this.primaryAction;
    }

    @l
    public final DeepLink getRedirectDeeplink() {
        return this.redirectDeeplink;
    }

    @l
    public final ServiceOrderWidget.ServiceOrderWidgetAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.service_order_widget.ServiceOrderWidget
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType = this.layoutType;
        int iHashCode2 = (iHashCode + (serviceOrderWidgetLayoutType == null ? 0 : serviceOrderWidgetLayoutType.hashCode())) * 31;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = this.primaryAction;
        int iHashCode3 = (iHashCode2 + (serviceOrderWidgetAction == null ? 0 : serviceOrderWidgetAction.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.analyticParams;
        int iHashCode6 = (iHashCode5 + (analyticsParams == null ? 0 : analyticsParams.hashCode())) * 31;
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2 = this.secondaryAction;
        int iHashCode7 = (iHashCode6 + (serviceOrderWidgetAction2 == null ? 0 : serviceOrderWidgetAction2.hashCode())) * 31;
        DeepLink deepLink = this.redirectDeeplink;
        int iHashCode8 = (iHashCode7 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.descriptionPromoLink;
        int iHashCode9 = (iHashCode8 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode10 = (iHashCode9 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode10 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("DefaultServiceOrderWidget(title=");
        sb2.append(this.title);
        sb2.append(", layoutType=");
        sb2.append(this.layoutType);
        sb2.append(", primaryAction=");
        sb2.append(this.primaryAction);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", secondaryAction=");
        sb2.append(this.secondaryAction);
        sb2.append(", redirectDeeplink=");
        sb2.append(this.redirectDeeplink);
        sb2.append(", descriptionPromoLink=");
        sb2.append(this.descriptionPromoLink);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType = this.layoutType;
        if (serviceOrderWidgetLayoutType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serviceOrderWidgetLayoutType.name());
        }
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = this.primaryAction;
        if (serviceOrderWidgetAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceOrderWidgetAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.description, flags);
        parcel.writeParcelable(this.image, flags);
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.analyticParams;
        if (analyticsParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsParams.writeToParcel(parcel, flags);
        }
        ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2 = this.secondaryAction;
        if (serviceOrderWidgetAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceOrderWidgetAction2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.redirectDeeplink, flags);
        parcel.writeParcelable(this.descriptionPromoLink, flags);
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

    public /* synthetic */ DefaultServiceOrderWidget(String str, ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType, ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction, AttributedText attributedText, UniversalImage universalImage, ServiceOrderWidget.AnalyticsParams analyticsParams, ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction2, DeepLink deepLink, DeepLink deepLink2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, serviceOrderWidgetLayoutType, serviceOrderWidgetAction, attributedText, universalImage, analyticsParams, serviceOrderWidgetAction2, deepLink, deepLink2, (i12 & 512) != 0 ? null : analytics, (i12 & 1024) != 0 ? null : settings);
    }
}
