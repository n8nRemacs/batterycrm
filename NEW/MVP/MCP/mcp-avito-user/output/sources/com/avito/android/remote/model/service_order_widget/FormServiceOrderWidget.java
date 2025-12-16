package com.avito.android.remote.model.service_order_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001iB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b1\u00102J¤\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001dJ\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000206HÖ\u0001¢\u0006\u0004\b>\u00108J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u000206HÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bL\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bP\u0010'R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bR\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\bT\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bV\u0010-R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\bW\u0010-R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u00100\"\u0004\bZ\u0010[R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\\\u001a\u0004\b]\u00102\"\u0004\b^\u0010_R(\u0010a\u001a\u00020`8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u0010h\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006j"}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/FormServiceOrderWidget;", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget;", "", "title", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "layoutType", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "primaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "analyticParams", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "Lcom/avito/android/remote/model/service_order_widget/FormServiceOrderWidget$FormOption;", "formOptions", "", "progress", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectDeeplink", "descriptionPromoLink", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Ljava/lang/Float;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "component3", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "()Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "component6", "()Lcom/avito/android/remote/model/UniversalImage;", "component7", "()Ljava/util/List;", "component8", "()Ljava/lang/Float;", "component9", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component10", "component11", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component12", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Ljava/lang/Float;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/service_order_widget/FormServiceOrderWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetLayoutType;", "getLayoutType", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$ServiceOrderWidgetAction;", "getPrimaryAction", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/service_order_widget/ServiceOrderWidget$AnalyticsParams;", "getAnalyticParams", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/util/List;", "getFormOptions", "Ljava/lang/Float;", "getProgress", "Lcom/avito/android/deep_linking/links/DeepLink;", "getRedirectDeeplink", "getDescriptionPromoLink", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "FormOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FormServiceOrderWidget implements ServiceOrderWidget {

    @k
    public static final Parcelable.Creator<FormServiceOrderWidget> CREATOR = new Creator();

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

    @c("formOptions")
    @l
    private final List<FormOption> formOptions;

    @c("image")
    @l
    private final UniversalImage image;

    @c("layoutType")
    @l
    private final ServiceOrderWidget.ServiceOrderWidgetLayoutType layoutType;

    @c("primaryAction")
    @l
    private final ServiceOrderWidget.ServiceOrderWidgetAction primaryAction;

    @c("progress")
    @l
    private final Float progress;

    @c("redirectDeeplink")
    @l
    private final DeepLink redirectDeeplink;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @k
    private final String title;
    private transient long uniqueId;

    /* compiled from: ServiceOrderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FormServiceOrderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FormServiceOrderWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutTypeValueOf = parcel.readInt() == 0 ? null : ServiceOrderWidget.ServiceOrderWidgetLayoutType.valueOf(parcel.readString());
            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetActionCreateFromParcel = parcel.readInt() == 0 ? null : ServiceOrderWidget.ServiceOrderWidgetAction.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FormServiceOrderWidget.class.getClassLoader());
            ServiceOrderWidget.AnalyticsParams analyticsParamsCreateFromParcel = parcel.readInt() == 0 ? null : ServiceOrderWidget.AnalyticsParams.CREATOR.createFromParcel(parcel);
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(FormServiceOrderWidget.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(FormOption.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new FormServiceOrderWidget(string, serviceOrderWidgetLayoutTypeValueOf, serviceOrderWidgetActionCreateFromParcel, attributedText, analyticsParamsCreateFromParcel, universalImage, arrayList, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (DeepLink) parcel.readParcelable(FormServiceOrderWidget.class.getClassLoader()), (DeepLink) parcel.readParcelable(FormServiceOrderWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FormServiceOrderWidget[] newArray(int i12) {
            return new FormServiceOrderWidget[i12];
        }
    }

    /* compiled from: ServiceOrderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/service_order_widget/FormServiceOrderWidget$FormOption;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/service_order_widget/FormServiceOrderWidget$FormOption;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormOption implements Parcelable {

        @k
        public static final Parcelable.Creator<FormOption> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ServiceOrderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormOption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FormOption createFromParcel(@k Parcel parcel) {
                return new FormOption(parcel.readString(), (DeepLink) parcel.readParcelable(FormOption.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FormOption[] newArray(int i12) {
                return new FormOption[i12];
            }
        }

        public FormOption(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        public static /* synthetic */ FormOption copy$default(FormOption formOption, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = formOption.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = formOption.uri;
            }
            return formOption.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final FormOption copy(@k String title, @k DeepLink uri) {
            return new FormOption(title, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormOption)) {
                return false;
            }
            FormOption formOption = (FormOption) other;
            return L.f(this.title, formOption.title) && L.f(this.uri, formOption.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FormOption(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    public FormServiceOrderWidget(@k String str, @l ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType, @l ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction, @l AttributedText attributedText, @l ServiceOrderWidget.AnalyticsParams analyticsParams, @l UniversalImage universalImage, @l List<FormOption> list, @l Float f12, @l DeepLink deepLink, @l DeepLink deepLink2, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.layoutType = serviceOrderWidgetLayoutType;
        this.primaryAction = serviceOrderWidgetAction;
        this.description = attributedText;
        this.analyticParams = analyticsParams;
        this.image = universalImage;
        this.formOptions = list;
        this.progress = f12;
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
    public final DeepLink getDescriptionPromoLink() {
        return this.descriptionPromoLink;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component12, reason: from getter */
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
    public final ServiceOrderWidget.AnalyticsParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final List<FormOption> component7() {
        return this.formOptions;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getRedirectDeeplink() {
        return this.redirectDeeplink;
    }

    @k
    public final FormServiceOrderWidget copy(@k String title, @l ServiceOrderWidget.ServiceOrderWidgetLayoutType layoutType, @l ServiceOrderWidget.ServiceOrderWidgetAction primaryAction, @l AttributedText description, @l ServiceOrderWidget.AnalyticsParams analyticParams, @l UniversalImage image, @l List<FormOption> formOptions, @l Float progress, @l DeepLink redirectDeeplink, @l DeepLink descriptionPromoLink, @l Analytics analytics, @l Settings settings) {
        return new FormServiceOrderWidget(title, layoutType, primaryAction, description, analyticParams, image, formOptions, progress, redirectDeeplink, descriptionPromoLink, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormServiceOrderWidget)) {
            return false;
        }
        FormServiceOrderWidget formServiceOrderWidget = (FormServiceOrderWidget) other;
        return L.f(this.title, formServiceOrderWidget.title) && this.layoutType == formServiceOrderWidget.layoutType && L.f(this.primaryAction, formServiceOrderWidget.primaryAction) && L.f(this.description, formServiceOrderWidget.description) && L.f(this.analyticParams, formServiceOrderWidget.analyticParams) && L.f(this.image, formServiceOrderWidget.image) && L.f(this.formOptions, formServiceOrderWidget.formOptions) && L.f(this.progress, formServiceOrderWidget.progress) && L.f(this.redirectDeeplink, formServiceOrderWidget.redirectDeeplink) && L.f(this.descriptionPromoLink, formServiceOrderWidget.descriptionPromoLink) && L.f(this.analytics, formServiceOrderWidget.analytics) && L.f(this.settings, formServiceOrderWidget.settings);
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

    @l
    public final List<FormOption> getFormOptions() {
        return this.formOptions;
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
    public final Float getProgress() {
        return this.progress;
    }

    @l
    public final DeepLink getRedirectDeeplink() {
        return this.redirectDeeplink;
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
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.analyticParams;
        int iHashCode5 = (iHashCode4 + (analyticsParams == null ? 0 : analyticsParams.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode6 = (iHashCode5 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        List<FormOption> list = this.formOptions;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Float f12 = this.progress;
        int iHashCode8 = (iHashCode7 + (f12 == null ? 0 : f12.hashCode())) * 31;
        DeepLink deepLink = this.redirectDeeplink;
        int iHashCode9 = (iHashCode8 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.descriptionPromoLink;
        int iHashCode10 = (iHashCode9 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode11 = (iHashCode10 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode11 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("FormServiceOrderWidget(title=");
        sb2.append(this.title);
        sb2.append(", layoutType=");
        sb2.append(this.layoutType);
        sb2.append(", primaryAction=");
        sb2.append(this.primaryAction);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", formOptions=");
        sb2.append(this.formOptions);
        sb2.append(", progress=");
        sb2.append(this.progress);
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
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.analyticParams;
        if (analyticsParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsParams.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        List<FormOption> list = this.formOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FormOption) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Float f12 = this.progress;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
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

    public /* synthetic */ FormServiceOrderWidget(String str, ServiceOrderWidget.ServiceOrderWidgetLayoutType serviceOrderWidgetLayoutType, ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction, AttributedText attributedText, ServiceOrderWidget.AnalyticsParams analyticsParams, UniversalImage universalImage, List list, Float f12, DeepLink deepLink, DeepLink deepLink2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, serviceOrderWidgetLayoutType, serviceOrderWidgetAction, attributedText, analyticsParams, universalImage, list, f12, deepLink, deepLink2, (i12 & 1024) != 0 ? null : analytics, (i12 & 2048) != 0 ? null : settings);
    }
}
