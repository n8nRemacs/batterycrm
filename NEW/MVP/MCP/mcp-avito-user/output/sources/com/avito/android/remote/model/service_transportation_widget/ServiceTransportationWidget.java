package com.avito.android.remote.model.service_transportation_widget;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.HeaderToolbarElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceTransportationWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u000fdefghijklmnopqrB\u0085\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001c\u0010'\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b-\u0010.J\u009e\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000202HÖ\u0001¢\u0006\u0004\b:\u00104J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000202HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bC\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010\"R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010&R&\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010*R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010P\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010SR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010.\"\u0004\bV\u0010WR(\u0010Y\u001a\u00020X8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u0010`\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010c\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006s"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/HeaderToolbarElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "bannerStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;", "analyticParams", "", "queryExtParams", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;", "action", "", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", LocalPublishState.FIELDS, "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;", "searchHeaderConfig", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;Ljava/util/Map;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;Ljava/util/List;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;", "component9", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component10", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;Ljava/util/Map;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;Ljava/util/List;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getBannerStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;", "getAnalyticParams", "Ljava/util/Map;", "getQueryExtParams", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;", "getAction", "Ljava/util/List;", "getFields", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;", "getSearchHeaderConfig", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "getShowInHeaderToolbar", "()Z", "showInHeaderToolbar", "Action", "AnalyticParams", "CardSelectField", "DisclaimerField", "EmptyPriceField", "EmptyValue", "Field", "FieldValue", "InputField", "LocationField", "PriceField", "SearchHeaderConfig", "SelectField", "Size", "SwitchGroupField", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ServiceTransportationWidget implements SerpElement, Parcelable, HeaderToolbarElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<ServiceTransportationWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("analyticParams")
    @l
    private final AnalyticParams analyticParams;

    @c("analytics")
    @l
    private Analytics analytics;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String bannerStyle;

    @c("description")
    @l
    private final AttributedText description;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<Field<?>> fields;

    @c("queryExtParams")
    @l
    private final Map<String, String> queryExtParams;

    @c("searchHeaderConfig")
    @l
    private final SearchHeaderConfig searchHeaderConfig;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @l
    private final String title;
    private transient long uniqueId;

    /* compiled from: ServiceTransportationWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "enabled", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Ljava/lang/Boolean;", "getEnabled", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("enabled")
        @l
        private final Boolean enabled;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Action.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Action(string, deepLink, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @l DeepLink deepLink, @l Boolean bool) {
            this.title = str;
            this.uri = deepLink;
            this.enabled = bool;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, DeepLink deepLink, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = action.uri;
            }
            if ((i12 & 4) != 0) {
                bool = action.enabled;
            }
            return action.copy(str, deepLink, bool);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @k
        public final Action copy(@k String title, @l DeepLink uri, @l Boolean enabled) {
            return new Action(title, uri, enabled);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return L.f(this.title, action.title) && L.f(this.uri, action.uri) && L.f(this.enabled, action.enabled);
        }

        @l
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.uri;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.enabled;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", enabled=");
            return C0.g(sb2, this.enabled, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
            Boolean bool = this.enabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;", "Landroid/os/Parcelable;", "", "mcid", "fromPage", "fromSource", "", "itemId", "q", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$AnalyticParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMcid", "getFromPage", "getFromSource", "Ljava/lang/Long;", "getItemId", "getQ", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticParams implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticParams> CREATOR = new Creator();

        @c("fromPage")
        @l
        private final String fromPage;

        @c("fromSource")
        @l
        private final String fromSource;

        @c("itemId")
        @l
        private final Long itemId;

        @c("mcid")
        @l
        private final String mcid;

        @c("q")
        @l
        private final String q;

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticParams createFromParcel(@k Parcel parcel) {
                return new AnalyticParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticParams[] newArray(int i12) {
                return new AnalyticParams[i12];
            }
        }

        public AnalyticParams(@l String str, @l String str2, @l String str3, @l Long l12, @l String str4) {
            this.mcid = str;
            this.fromPage = str2;
            this.fromSource = str3;
            this.itemId = l12;
            this.q = str4;
        }

        public static /* synthetic */ AnalyticParams copy$default(AnalyticParams analyticParams, String str, String str2, String str3, Long l12, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = analyticParams.mcid;
            }
            if ((i12 & 2) != 0) {
                str2 = analyticParams.fromPage;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = analyticParams.fromSource;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                l12 = analyticParams.itemId;
            }
            Long l13 = l12;
            if ((i12 & 16) != 0) {
                str4 = analyticParams.q;
            }
            return analyticParams.copy(str, str5, str6, l13, str4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getMcid() {
            return this.mcid;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getFromSource() {
            return this.fromSource;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Long getItemId() {
            return this.itemId;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getQ() {
            return this.q;
        }

        @k
        public final AnalyticParams copy(@l String mcid, @l String fromPage, @l String fromSource, @l Long itemId, @l String q12) {
            return new AnalyticParams(mcid, fromPage, fromSource, itemId, q12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticParams)) {
                return false;
            }
            AnalyticParams analyticParams = (AnalyticParams) other;
            return L.f(this.mcid, analyticParams.mcid) && L.f(this.fromPage, analyticParams.fromPage) && L.f(this.fromSource, analyticParams.fromSource) && L.f(this.itemId, analyticParams.itemId) && L.f(this.q, analyticParams.q);
        }

        @l
        public final String getFromPage() {
            return this.fromPage;
        }

        @l
        public final String getFromSource() {
            return this.fromSource;
        }

        @l
        public final Long getItemId() {
            return this.itemId;
        }

        @l
        public final String getMcid() {
            return this.mcid;
        }

        @l
        public final String getQ() {
            return this.q;
        }

        public int hashCode() {
            String str = this.mcid;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fromPage;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fromSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l12 = this.itemId;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str4 = this.q;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AnalyticParams(mcid=");
            sb2.append(this.mcid);
            sb2.append(", fromPage=");
            sb2.append(this.fromPage);
            sb2.append(", fromSource=");
            sb2.append(this.fromSource);
            sb2.append(", itemId=");
            sb2.append(this.itemId);
            sb2.append(", q=");
            return C22026a.c(sb2, this.q, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.mcid);
            parcel.writeString(this.fromPage);
            parcel.writeString(this.fromSource);
            Long l12 = this.itemId;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.q);
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002BABa\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u0013R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010\u001fR\u0014\u0010@\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$InputField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "", "fieldId", "selectedValue", "", "hasError", "icon", "displayTitle", "selectButtonTitle", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "hint", "", "values", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "getSelectedValue", "Ljava/lang/Boolean;", "getHasError", "getIcon", "getDisplayTitle", "getSelectButtonTitle", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "getHint", "Ljava/util/List;", "getValues", "getSpanSize", "spanSize", "Companion", "CardSelectValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CardSelectField implements InputField<CardSelectValue> {

        @k
        public static final String TYPE = "cardSelect";

        @c("displayTitle")
        @l
        private final String displayTitle;

        @c("fieldId")
        @k
        private final String fieldId;

        @c("hasError")
        @l
        private final Boolean hasError;

        @c("hint")
        @l
        private final String hint;

        @c("icon")
        @l
        private final String icon;

        @c("selectButtonTitle")
        @l
        private final String selectButtonTitle;

        @c("selectedValue")
        @l
        private final CardSelectValue selectedValue;

        @c("size")
        @k
        private final Size size;

        @c("values")
        @k
        private final List<CardSelectValue> values;

        @k
        public static final Parcelable.Creator<CardSelectField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @d
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "", "title", "description", "label", "", "valueId", "imageMaxHeight", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "()Ljava/lang/Long;", "component6", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getLabel", "J", "getValueId", "Ljava/lang/Long;", "getImageMaxHeight", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "", "getAnalyticsBody", "()Ljava/util/Map;", "analyticsBody", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CardSelectValue implements FieldValue {

            @k
            public static final Parcelable.Creator<CardSelectValue> CREATOR = new Creator();

            @c("description")
            @l
            private final String description;

            @c("image")
            @l
            private final UniversalImage image;

            @c("imageMaxHeight")
            @l
            private final Long imageMaxHeight;

            @c("label")
            @k
            private final String label;

            @c("title")
            @l
            private final String title;

            @c("valueId")
            private final long valueId;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CardSelectValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final CardSelectValue createFromParcel(@k Parcel parcel) {
                    return new CardSelectValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (UniversalImage) parcel.readParcelable(CardSelectValue.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final CardSelectValue[] newArray(int i12) {
                    return new CardSelectValue[i12];
                }
            }

            public CardSelectValue(@l String str, @l String str2, @k String str3, long j12, @l Long l12, @l UniversalImage universalImage) {
                this.title = str;
                this.description = str2;
                this.label = str3;
                this.valueId = j12;
                this.imageMaxHeight = l12;
                this.image = universalImage;
            }

            public static /* synthetic */ CardSelectValue copy$default(CardSelectValue cardSelectValue, String str, String str2, String str3, long j12, Long l12, UniversalImage universalImage, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = cardSelectValue.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = cardSelectValue.description;
                }
                String str4 = str2;
                if ((i12 & 4) != 0) {
                    str3 = cardSelectValue.label;
                }
                String str5 = str3;
                if ((i12 & 8) != 0) {
                    j12 = cardSelectValue.valueId;
                }
                long j13 = j12;
                if ((i12 & 16) != 0) {
                    l12 = cardSelectValue.imageMaxHeight;
                }
                Long l13 = l12;
                if ((i12 & 32) != 0) {
                    universalImage = cardSelectValue.image;
                }
                return cardSelectValue.copy(str, str4, str5, j13, l13, universalImage);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component4, reason: from getter */
            public final long getValueId() {
                return this.valueId;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final Long getImageMaxHeight() {
                return this.imageMaxHeight;
            }

            @l
            /* renamed from: component6, reason: from getter */
            public final UniversalImage getImage() {
                return this.image;
            }

            @k
            public final CardSelectValue copy(@l String title, @l String description, @k String label, long valueId, @l Long imageMaxHeight, @l UniversalImage image) {
                return new CardSelectValue(title, description, label, valueId, imageMaxHeight, image);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CardSelectValue)) {
                    return false;
                }
                CardSelectValue cardSelectValue = (CardSelectValue) other;
                return L.f(this.title, cardSelectValue.title) && L.f(this.description, cardSelectValue.description) && L.f(this.label, cardSelectValue.label) && this.valueId == cardSelectValue.valueId && L.f(this.imageMaxHeight, cardSelectValue.imageMaxHeight) && L.f(this.image, cardSelectValue.image);
            }

            @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.FieldValue
            @k
            public Map<String, Object> getAnalyticsBody() {
                String str = this.title;
                if (str == null) {
                    str = "";
                }
                return Collections.singletonMap("title", str);
            }

            @l
            public final String getDescription() {
                return this.description;
            }

            @l
            public final UniversalImage getImage() {
                return this.image;
            }

            @l
            public final Long getImageMaxHeight() {
                return this.imageMaxHeight;
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            public final long getValueId() {
                return this.valueId;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.description;
                int iG2 = r.g(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.label), 31, this.valueId);
                Long l12 = this.imageMaxHeight;
                int iHashCode2 = (iG2 + (l12 == null ? 0 : l12.hashCode())) * 31;
                UniversalImage universalImage = this.image;
                return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("CardSelectValue(title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", label=");
                sb2.append(this.label);
                sb2.append(", valueId=");
                sb2.append(this.valueId);
                sb2.append(", imageMaxHeight=");
                sb2.append(this.imageMaxHeight);
                sb2.append(", image=");
                return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeString(this.label);
                parcel.writeLong(this.valueId);
                Long l12 = this.imageMaxHeight;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                parcel.writeParcelable(this.image, flags);
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardSelectField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CardSelectField createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                CardSelectValue cardSelectValueCreateFromParcel = parcel.readInt() == 0 ? null : CardSelectValue.CREATOR.createFromParcel(parcel);
                int iC2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Size sizeValueOf = Size.valueOf(parcel.readString());
                String string5 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(CardSelectValue.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new CardSelectField(string, cardSelectValueCreateFromParcel, boolValueOf, string2, string3, string4, sizeValueOf, string5, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CardSelectField[] newArray(int i12) {
                return new CardSelectField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Full.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Half.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public CardSelectField(@k String str, @l CardSelectValue cardSelectValue, @l Boolean bool, @l String str2, @l String str3, @l String str4, @k Size size, @l String str5, @k List<CardSelectValue> list) {
            this.fieldId = str;
            this.selectedValue = cardSelectValue;
            this.hasError = bool;
            this.icon = str2;
            this.displayTitle = str3;
            this.selectButtonTitle = str4;
            this.size = size;
            this.hint = str5;
            this.values = list;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final CardSelectValue getSelectedValue() {
            return this.selectedValue;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getHasError() {
            return this.hasError;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getSelectButtonTitle() {
            return this.selectButtonTitle;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @k
        public final List<CardSelectValue> component9() {
            return this.values;
        }

        @k
        public final CardSelectField copy(@k String fieldId, @l CardSelectValue selectedValue, @l Boolean hasError, @l String icon, @l String displayTitle, @l String selectButtonTitle, @k Size size, @l String hint, @k List<CardSelectValue> values) {
            return new CardSelectField(fieldId, selectedValue, hasError, icon, displayTitle, selectButtonTitle, size, hint, values);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardSelectField)) {
                return false;
            }
            CardSelectField cardSelectField = (CardSelectField) other;
            return L.f(this.fieldId, cardSelectField.fieldId) && L.f(this.selectedValue, cardSelectField.selectedValue) && L.f(this.hasError, cardSelectField.hasError) && L.f(this.icon, cardSelectField.icon) && L.f(this.displayTitle, cardSelectField.displayTitle) && L.f(this.selectButtonTitle, cardSelectField.selectButtonTitle) && this.size == cardSelectField.size && L.f(this.hint, cardSelectField.hint) && L.f(this.values, cardSelectField.values);
        }

        @l
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.InputField
        @l
        public Boolean getHasError() {
            return this.hasError;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.InputField
        @l
        public String getIcon() {
            return this.icon;
        }

        @l
        public final String getSelectButtonTitle() {
            return this.selectButtonTitle;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            if (i12 == 1) {
                return 2;
            }
            if (i12 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        @k
        public final List<CardSelectValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = this.fieldId.hashCode() * 31;
            CardSelectValue cardSelectValue = this.selectedValue;
            int iHashCode2 = (iHashCode + (cardSelectValue == null ? 0 : cardSelectValue.hashCode())) * 31;
            Boolean bool = this.hasError;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.icon;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.displayTitle;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectButtonTitle;
            int iHashCode6 = (this.size.hashCode() + ((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            String str4 = this.hint;
            return this.values.hashCode() + ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CardSelectField(fieldId=");
            sb2.append(this.fieldId);
            sb2.append(", selectedValue=");
            sb2.append(this.selectedValue);
            sb2.append(", hasError=");
            sb2.append(this.hasError);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", displayTitle=");
            sb2.append(this.displayTitle);
            sb2.append(", selectButtonTitle=");
            sb2.append(this.selectButtonTitle);
            sb2.append(", size=");
            sb2.append(this.size);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            CardSelectValue cardSelectValue = this.selectedValue;
            if (cardSelectValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cardSelectValue.writeToParcel(parcel, flags);
            }
            Boolean bool = this.hasError;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.icon);
            parcel.writeString(this.displayTitle);
            parcel.writeString(this.selectButtonTitle);
            parcel.writeString(this.size.name());
            parcel.writeString(this.hint);
            Iterator itJ = C0.j(this.values, parcel);
            while (itJ.hasNext()) {
                ((CardSelectValue) itJ.next()).writeToParcel(parcel, flags);
            }
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public CardSelectValue getSelectedValue() {
            return this.selectedValue;
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceTransportationWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceTransportationWidget createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ServiceTransportationWidget.class.getClassLoader());
            AnalyticParams analyticParamsCreateFromParcel = parcel.readInt() == 0 ? null : AnalyticParams.CREATOR.createFromParcel(parcel);
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(ServiceTransportationWidget.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ServiceTransportationWidget(string, string2, attributedText, analyticParamsCreateFromParcel, linkedHashMap, actionCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : SearchHeaderConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceTransportationWidget[] newArray(int i12) {
            return new ServiceTransportationWidget[i12];
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003<=>BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001bR\u0014\u0010;\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010!¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "", "fieldId", "selectedValue", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "displayTitle", "disclaimerIcon", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;", "disclaimerSheet", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;", "disclaimerLink", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "component3", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;", "component7", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "getSelectedValue", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "getDisplayTitle", "getDisclaimerIcon", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;", "getDisclaimerSheet", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;", "getDisclaimerLink", "getSpanSize", "spanSize", "Companion", "DisclaimerLink", "DisclaimerSheet", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DisclaimerField implements Field<EmptyValue> {

        @k
        public static final String TYPE = "disclaimer";

        @c("disclaimerIcon")
        @l
        private final String disclaimerIcon;

        @c("disclaimerLink")
        @l
        private final DisclaimerLink disclaimerLink;

        @c("disclaimerSheet")
        @l
        private final DisclaimerSheet disclaimerSheet;

        @c("displayTitle")
        @k
        private final String displayTitle;

        @c("fieldId")
        @k
        private final String fieldId;

        @c("selectedValue")
        @l
        private final EmptyValue selectedValue;

        @c("size")
        @k
        private final Size size;

        @k
        public static final Parcelable.Creator<DisclaimerField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DisclaimerField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisclaimerField createFromParcel(@k Parcel parcel) {
                return new DisclaimerField(parcel.readString(), parcel.readInt() == 0 ? null : EmptyValue.CREATOR.createFromParcel(parcel), Size.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DisclaimerSheet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DisclaimerLink.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DisclaimerField[] newArray(int i12) {
                return new DisclaimerField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerLink;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisclaimerLink implements Parcelable {

            @k
            public static final Parcelable.Creator<DisclaimerLink> CREATOR = new Creator();

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink uri;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisclaimerLink> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerLink createFromParcel(@k Parcel parcel) {
                    return new DisclaimerLink((DeepLink) parcel.readParcelable(DisclaimerLink.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerLink[] newArray(int i12) {
                    return new DisclaimerLink[i12];
                }
            }

            public DisclaimerLink(@k DeepLink deepLink) {
                this.uri = deepLink;
            }

            public static /* synthetic */ DisclaimerLink copy$default(DisclaimerLink disclaimerLink, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    deepLink = disclaimerLink.uri;
                }
                return disclaimerLink.copy(deepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final DeepLink getUri() {
                return this.uri;
            }

            @k
            public final DisclaimerLink copy(@k DeepLink uri) {
                return new DisclaimerLink(uri);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisclaimerLink) && L.f(this.uri, ((DisclaimerLink) other).uri);
            }

            @k
            public final DeepLink getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode();
            }

            @k
            public String toString() {
                return a.v(new StringBuilder("DisclaimerLink(uri="), this.uri, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.uri, flags);
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "buttonTitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField$DisclaimerSheet;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "getButtonTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DisclaimerSheet implements Parcelable {

            @k
            public static final Parcelable.Creator<DisclaimerSheet> CREATOR = new Creator();

            @c("buttonTitle")
            @k
            private final String buttonTitle;

            @c("description")
            @l
            private final AttributedText description;

            @c("title")
            @k
            private final String title;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DisclaimerSheet> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerSheet createFromParcel(@k Parcel parcel) {
                    return new DisclaimerSheet(parcel.readString(), (AttributedText) parcel.readParcelable(DisclaimerSheet.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DisclaimerSheet[] newArray(int i12) {
                    return new DisclaimerSheet[i12];
                }
            }

            public DisclaimerSheet(@k String str, @l AttributedText attributedText, @k String str2) {
                this.title = str;
                this.description = attributedText;
                this.buttonTitle = str2;
            }

            public static /* synthetic */ DisclaimerSheet copy$default(DisclaimerSheet disclaimerSheet, String str, AttributedText attributedText, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = disclaimerSheet.title;
                }
                if ((i12 & 2) != 0) {
                    attributedText = disclaimerSheet.description;
                }
                if ((i12 & 4) != 0) {
                    str2 = disclaimerSheet.buttonTitle;
                }
                return disclaimerSheet.copy(str, attributedText, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final AttributedText getDescription() {
                return this.description;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            @k
            public final DisclaimerSheet copy(@k String title, @l AttributedText description, @k String buttonTitle) {
                return new DisclaimerSheet(title, description, buttonTitle);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisclaimerSheet)) {
                    return false;
                }
                DisclaimerSheet disclaimerSheet = (DisclaimerSheet) other;
                return L.f(this.title, disclaimerSheet.title) && L.f(this.description, disclaimerSheet.description) && L.f(this.buttonTitle, disclaimerSheet.buttonTitle);
            }

            @k
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            @l
            public final AttributedText getDescription() {
                return this.description;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                AttributedText attributedText = this.description;
                return this.buttonTitle.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("DisclaimerSheet(title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", buttonTitle=");
                return C22026a.c(sb2, this.buttonTitle, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.description, flags);
                parcel.writeString(this.buttonTitle);
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Full.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Half.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public DisclaimerField(@k String str, @l EmptyValue emptyValue, @k Size size, @k String str2, @l String str3, @l DisclaimerSheet disclaimerSheet, @l DisclaimerLink disclaimerLink) {
            this.fieldId = str;
            this.selectedValue = emptyValue;
            this.size = size;
            this.displayTitle = str2;
            this.disclaimerIcon = str3;
            this.disclaimerSheet = disclaimerSheet;
            this.disclaimerLink = disclaimerLink;
        }

        public static /* synthetic */ DisclaimerField copy$default(DisclaimerField disclaimerField, String str, EmptyValue emptyValue, Size size, String str2, String str3, DisclaimerSheet disclaimerSheet, DisclaimerLink disclaimerLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = disclaimerField.fieldId;
            }
            if ((i12 & 2) != 0) {
                emptyValue = disclaimerField.selectedValue;
            }
            EmptyValue emptyValue2 = emptyValue;
            if ((i12 & 4) != 0) {
                size = disclaimerField.size;
            }
            Size size2 = size;
            if ((i12 & 8) != 0) {
                str2 = disclaimerField.displayTitle;
            }
            String str4 = str2;
            if ((i12 & 16) != 0) {
                str3 = disclaimerField.disclaimerIcon;
            }
            String str5 = str3;
            if ((i12 & 32) != 0) {
                disclaimerSheet = disclaimerField.disclaimerSheet;
            }
            DisclaimerSheet disclaimerSheet2 = disclaimerSheet;
            if ((i12 & 64) != 0) {
                disclaimerLink = disclaimerField.disclaimerLink;
            }
            return disclaimerField.copy(str, emptyValue2, size2, str4, str5, disclaimerSheet2, disclaimerLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final EmptyValue getSelectedValue() {
            return this.selectedValue;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getDisclaimerIcon() {
            return this.disclaimerIcon;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final DisclaimerSheet getDisclaimerSheet() {
            return this.disclaimerSheet;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final DisclaimerLink getDisclaimerLink() {
            return this.disclaimerLink;
        }

        @k
        public final DisclaimerField copy(@k String fieldId, @l EmptyValue selectedValue, @k Size size, @k String displayTitle, @l String disclaimerIcon, @l DisclaimerSheet disclaimerSheet, @l DisclaimerLink disclaimerLink) {
            return new DisclaimerField(fieldId, selectedValue, size, displayTitle, disclaimerIcon, disclaimerSheet, disclaimerLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerField)) {
                return false;
            }
            DisclaimerField disclaimerField = (DisclaimerField) other;
            return L.f(this.fieldId, disclaimerField.fieldId) && L.f(this.selectedValue, disclaimerField.selectedValue) && this.size == disclaimerField.size && L.f(this.displayTitle, disclaimerField.displayTitle) && L.f(this.disclaimerIcon, disclaimerField.disclaimerIcon) && L.f(this.disclaimerSheet, disclaimerField.disclaimerSheet) && L.f(this.disclaimerLink, disclaimerField.disclaimerLink);
        }

        @l
        public final String getDisclaimerIcon() {
            return this.disclaimerIcon;
        }

        @l
        public final DisclaimerLink getDisclaimerLink() {
            return this.disclaimerLink;
        }

        @l
        public final DisclaimerSheet getDisclaimerSheet() {
            return this.disclaimerSheet;
        }

        @k
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            if (i12 == 1) {
                return 2;
            }
            if (i12 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        public int hashCode() {
            int iHashCode = this.fieldId.hashCode() * 31;
            EmptyValue emptyValue = this.selectedValue;
            int iD2 = H.d((this.size.hashCode() + ((iHashCode + (emptyValue == null ? 0 : emptyValue.hashCode())) * 31)) * 31, 31, this.displayTitle);
            String str = this.disclaimerIcon;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            DisclaimerSheet disclaimerSheet = this.disclaimerSheet;
            int iHashCode3 = (iHashCode2 + (disclaimerSheet == null ? 0 : disclaimerSheet.hashCode())) * 31;
            DisclaimerLink disclaimerLink = this.disclaimerLink;
            return iHashCode3 + (disclaimerLink != null ? disclaimerLink.hashCode() : 0);
        }

        @k
        public String toString() {
            return "DisclaimerField(fieldId=" + this.fieldId + ", selectedValue=" + this.selectedValue + ", size=" + this.size + ", displayTitle=" + this.displayTitle + ", disclaimerIcon=" + this.disclaimerIcon + ", disclaimerSheet=" + this.disclaimerSheet + ", disclaimerLink=" + this.disclaimerLink + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            EmptyValue emptyValue = this.selectedValue;
            if (emptyValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                emptyValue.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.size.name());
            parcel.writeString(this.displayTitle);
            parcel.writeString(this.disclaimerIcon);
            DisclaimerSheet disclaimerSheet = this.disclaimerSheet;
            if (disclaimerSheet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                disclaimerSheet.writeToParcel(parcel, flags);
            }
            DisclaimerLink disclaimerLink = this.disclaimerLink;
            if (disclaimerLink == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                disclaimerLink.writeToParcel(parcel, flags);
            }
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public EmptyValue getSelectedValue() {
            return this.selectedValue;
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b.\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015R\u0014\u00102\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001b¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyPriceField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "", "fieldId", "startText", "endText", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "placeholderColor", "selectedValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component5", "component6", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyPriceField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "getStartText", "getEndText", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "getPlaceholderColor", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "getSelectedValue", "getSpanSize", "spanSize", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class EmptyPriceField implements Field<EmptyValue> {

        @k
        public static final String TYPE = "emptyPrice";

        @c("endText")
        @k
        private final String endText;

        @c("fieldId")
        @k
        private final String fieldId;

        @c("placeholderColor")
        @l
        private final String placeholderColor;

        @l
        private final EmptyValue selectedValue;

        @c("size")
        @l
        private final Size size;

        @c("startText")
        @k
        private final String startText;

        @k
        public static final Parcelable.Creator<EmptyPriceField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EmptyPriceField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EmptyPriceField createFromParcel(@k Parcel parcel) {
                return new EmptyPriceField(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Size.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? EmptyValue.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EmptyPriceField[] newArray(int i12) {
                return new EmptyPriceField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Half.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public EmptyPriceField(@k String str, @k String str2, @k String str3, @l Size size, @l String str4, @l EmptyValue emptyValue) {
            this.fieldId = str;
            this.startText = str2;
            this.endText = str3;
            this.size = size;
            this.placeholderColor = str4;
            this.selectedValue = emptyValue;
        }

        public static /* synthetic */ EmptyPriceField copy$default(EmptyPriceField emptyPriceField, String str, String str2, String str3, Size size, String str4, EmptyValue emptyValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = emptyPriceField.fieldId;
            }
            if ((i12 & 2) != 0) {
                str2 = emptyPriceField.startText;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = emptyPriceField.endText;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                size = emptyPriceField.size;
            }
            Size size2 = size;
            if ((i12 & 16) != 0) {
                str4 = emptyPriceField.placeholderColor;
            }
            String str7 = str4;
            if ((i12 & 32) != 0) {
                emptyValue = emptyPriceField.selectedValue;
            }
            return emptyPriceField.copy(str, str5, str6, size2, str7, emptyValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStartText() {
            return this.startText;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getEndText() {
            return this.endText;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getPlaceholderColor() {
            return this.placeholderColor;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final EmptyValue getSelectedValue() {
            return this.selectedValue;
        }

        @k
        public final EmptyPriceField copy(@k String fieldId, @k String startText, @k String endText, @l Size size, @l String placeholderColor, @l EmptyValue selectedValue) {
            return new EmptyPriceField(fieldId, startText, endText, size, placeholderColor, selectedValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyPriceField)) {
                return false;
            }
            EmptyPriceField emptyPriceField = (EmptyPriceField) other;
            return L.f(this.fieldId, emptyPriceField.fieldId) && L.f(this.startText, emptyPriceField.startText) && L.f(this.endText, emptyPriceField.endText) && this.size == emptyPriceField.size && L.f(this.placeholderColor, emptyPriceField.placeholderColor) && L.f(this.selectedValue, emptyPriceField.selectedValue);
        }

        @k
        public final String getEndText() {
            return this.endText;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @l
        public final String getPlaceholderColor() {
            return this.placeholderColor;
        }

        @l
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            Size size = this.size;
            return (size == null ? -1 : WhenMappings.$EnumSwitchMapping$0[size.ordinal()]) == 1 ? 1 : 2;
        }

        @k
        public final String getStartText() {
            return this.startText;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(this.fieldId.hashCode() * 31, 31, this.startText), 31, this.endText);
            Size size = this.size;
            int iHashCode = (iD2 + (size == null ? 0 : size.hashCode())) * 31;
            String str = this.placeholderColor;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            EmptyValue emptyValue = this.selectedValue;
            return iHashCode2 + (emptyValue != null ? emptyValue.hashCode() : 0);
        }

        @k
        public String toString() {
            return "EmptyPriceField(fieldId=" + this.fieldId + ", startText=" + this.startText + ", endText=" + this.endText + ", size=" + this.size + ", placeholderColor=" + this.placeholderColor + ", selectedValue=" + this.selectedValue + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            parcel.writeString(this.startText);
            parcel.writeString(this.endText);
            Size size = this.size;
            if (size == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(size.name());
            }
            parcel.writeString(this.placeholderColor);
            EmptyValue emptyValue = this.selectedValue;
            if (emptyValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                emptyValue.writeToParcel(parcel, flags);
            }
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public EmptyValue getSelectedValue() {
            return this.selectedValue;
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "getAnalyticsBody", "()Ljava/util/Map;", "analyticsBody", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptyValue implements FieldValue {

        @k
        public static final EmptyValue INSTANCE = new EmptyValue();

        @k
        public static final Parcelable.Creator<EmptyValue> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EmptyValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EmptyValue createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return EmptyValue.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EmptyValue[] newArray(int i12) {
                return new EmptyValue[i12];
            }
        }

        private EmptyValue() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof EmptyValue);
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.FieldValue
        @k
        public Map<String, Object> getAnalyticsBody() {
            return P0.c();
        }

        public int hashCode() {
            return -1306197328;
        }

        @k
        public String toString() {
            return "EmptyValue";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", "T", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "Landroid/os/Parcelable;", "fieldId", "", "getFieldId", "()Ljava/lang/String;", "selectedValue", "getSelectedValue", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "spanSize", "", "getSpanSize", "()I", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$DisclaimerField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyPriceField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$InputField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$PriceField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Field<T extends FieldValue> extends Parcelable {
        @k
        String getFieldId();

        @l
        T getSelectedValue();

        int getSpanSize();
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "Landroid/os/Parcelable;", "analyticsBody", "", "", "", "getAnalyticsBody", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField$CardSelectValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$Switches;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FieldValue extends Parcelable {
        @k
        Map<String, Object> getAnalyticsBody();
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$InputField;", "T", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", "hasError", "", "getHasError", "()Ljava/lang/Boolean;", "icon", "", "getIcon", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$CardSelectField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InputField<T extends FieldValue> extends Field<T> {
        @l
        Boolean getHasError();

        @l
        String getIcon();
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000289BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J`\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b4\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b5\u0010\u0010R\u0014\u00107\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001f¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$InputField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;", "", "fieldId", "", "hasError", "selectedValue", "icon", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "hint", "displayTitle", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;", "component4", "component5", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "Ljava/lang/Boolean;", "getHasError", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;", "getSelectedValue", "getIcon", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "getHint", "getDisplayTitle", "getSpanSize", "spanSize", "Companion", "LocationValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LocationField implements InputField<LocationValue> {

        @k
        public static final String COORDINATES = "coordinates";

        @k
        public static final String TITLE = "title";

        @k
        public static final String TYPE = "location";

        @c("displayTitle")
        @l
        private final String displayTitle;

        @c("fieldId")
        @k
        private final String fieldId;

        @c("hasError")
        @l
        private final Boolean hasError;

        @c("hint")
        @l
        private final String hint;

        @c("icon")
        @l
        private final String icon;

        @c("selectedValue")
        @l
        private final LocationValue selectedValue;

        @c("size")
        @k
        private final Size size;

        @k
        public static final Parcelable.Creator<LocationField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocationField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LocationField createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new LocationField(string, boolValueOf, parcel.readInt() != 0 ? LocationValue.CREATOR.createFromParcel(parcel) : null, parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LocationField[] newArray(int i12) {
                return new LocationField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @d
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000bR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "Lcom/avito/android/remote/model/Coordinates;", LocationField.COORDINATES, "", "title", "<init>", "(Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/Coordinates;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$LocationField$LocationValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "Ljava/lang/String;", "getTitle", "", "getAnalyticsBody", "()Ljava/util/Map;", "analyticsBody", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LocationValue implements FieldValue {

            @k
            public static final Parcelable.Creator<LocationValue> CREATOR = new Creator();

            @c(LocationField.COORDINATES)
            @k
            private final Coordinates coordinates;

            @c("title")
            @k
            private final String title;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LocationValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LocationValue createFromParcel(@k Parcel parcel) {
                    return new LocationValue(Coordinates.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LocationValue[] newArray(int i12) {
                    return new LocationValue[i12];
                }
            }

            public LocationValue(@k Coordinates coordinates, @k String str) {
                this.coordinates = coordinates;
                this.title = str;
            }

            public static /* synthetic */ LocationValue copy$default(LocationValue locationValue, Coordinates coordinates, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    coordinates = locationValue.coordinates;
                }
                if ((i12 & 2) != 0) {
                    str = locationValue.title;
                }
                return locationValue.copy(coordinates, str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Coordinates getCoordinates() {
                return this.coordinates;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            public final LocationValue copy(@k Coordinates coordinates, @k String title) {
                return new LocationValue(coordinates, title);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocationValue)) {
                    return false;
                }
                LocationValue locationValue = (LocationValue) other;
                return L.f(this.coordinates, locationValue.coordinates) && L.f(this.title, locationValue.title);
            }

            @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.FieldValue
            @k
            public Map<String, Object> getAnalyticsBody() {
                return P0.g(new Q("title", this.title), new Q(AddressParameter.Value.LNG, Double.valueOf(this.coordinates.getLongitude())), new Q("lat", Double.valueOf(this.coordinates.getLatitude())));
            }

            @k
            public final Coordinates getCoordinates() {
                return this.coordinates;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode() + (this.coordinates.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("LocationValue(coordinates=");
                sb2.append(this.coordinates);
                sb2.append(", title=");
                return C22026a.c(sb2, this.title, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.coordinates.writeToParcel(parcel, flags);
                parcel.writeString(this.title);
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Full.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Half.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public LocationField(@k String str, @l Boolean bool, @l LocationValue locationValue, @l String str2, @k Size size, @l String str3, @l String str4) {
            this.fieldId = str;
            this.hasError = bool;
            this.selectedValue = locationValue;
            this.icon = str2;
            this.size = size;
            this.hint = str3;
            this.displayTitle = str4;
        }

        public static /* synthetic */ LocationField copy$default(LocationField locationField, String str, Boolean bool, LocationValue locationValue, String str2, Size size, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = locationField.fieldId;
            }
            if ((i12 & 2) != 0) {
                bool = locationField.hasError;
            }
            Boolean bool2 = bool;
            if ((i12 & 4) != 0) {
                locationValue = locationField.selectedValue;
            }
            LocationValue locationValue2 = locationValue;
            if ((i12 & 8) != 0) {
                str2 = locationField.icon;
            }
            String str5 = str2;
            if ((i12 & 16) != 0) {
                size = locationField.size;
            }
            Size size2 = size;
            if ((i12 & 32) != 0) {
                str3 = locationField.hint;
            }
            String str6 = str3;
            if ((i12 & 64) != 0) {
                str4 = locationField.displayTitle;
            }
            return locationField.copy(str, bool2, locationValue2, str5, size2, str6, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getHasError() {
            return this.hasError;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final LocationValue getSelectedValue() {
            return this.selectedValue;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @k
        public final LocationField copy(@k String fieldId, @l Boolean hasError, @l LocationValue selectedValue, @l String icon, @k Size size, @l String hint, @l String displayTitle) {
            return new LocationField(fieldId, hasError, selectedValue, icon, size, hint, displayTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationField)) {
                return false;
            }
            LocationField locationField = (LocationField) other;
            return L.f(this.fieldId, locationField.fieldId) && L.f(this.hasError, locationField.hasError) && L.f(this.selectedValue, locationField.selectedValue) && L.f(this.icon, locationField.icon) && this.size == locationField.size && L.f(this.hint, locationField.hint) && L.f(this.displayTitle, locationField.displayTitle);
        }

        @l
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.InputField
        @l
        public Boolean getHasError() {
            return this.hasError;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.InputField
        @l
        public String getIcon() {
            return this.icon;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            if (i12 == 1) {
                return 2;
            }
            if (i12 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        public int hashCode() {
            int iHashCode = this.fieldId.hashCode() * 31;
            Boolean bool = this.hasError;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            LocationValue locationValue = this.selectedValue;
            int iHashCode3 = (iHashCode2 + (locationValue == null ? 0 : locationValue.hashCode())) * 31;
            String str = this.icon;
            int iHashCode4 = (this.size.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.hint;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.displayTitle;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LocationField(fieldId=");
            sb2.append(this.fieldId);
            sb2.append(", hasError=");
            sb2.append(this.hasError);
            sb2.append(", selectedValue=");
            sb2.append(this.selectedValue);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", size=");
            sb2.append(this.size);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", displayTitle=");
            return C22026a.c(sb2, this.displayTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            Boolean bool = this.hasError;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            LocationValue locationValue = this.selectedValue;
            if (locationValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                locationValue.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.icon);
            parcel.writeString(this.size.name());
            parcel.writeString(this.hint);
            parcel.writeString(this.displayTitle);
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public LocationValue getSelectedValue() {
            return this.selectedValue;
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\fR\u0014\u0010,\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0017¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$PriceField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "", "fieldId", "selectedValue", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "displayTitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "component3", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$PriceField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$EmptyValue;", "getSelectedValue", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "getDisplayTitle", "getSpanSize", "spanSize", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PriceField implements Field<EmptyValue> {

        @k
        public static final String TYPE = "price";

        @c("displayTitle")
        @k
        private final String displayTitle;

        @c("fieldId")
        @k
        private final String fieldId;

        @c("selectedValue")
        @l
        private final EmptyValue selectedValue;

        @c("size")
        @k
        private final Size size;

        @k
        public static final Parcelable.Creator<PriceField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PriceField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceField createFromParcel(@k Parcel parcel) {
                return new PriceField(parcel.readString(), parcel.readInt() == 0 ? null : EmptyValue.CREATOR.createFromParcel(parcel), Size.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceField[] newArray(int i12) {
                return new PriceField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Full.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Half.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public PriceField(@k String str, @l EmptyValue emptyValue, @k Size size, @k String str2) {
            this.fieldId = str;
            this.selectedValue = emptyValue;
            this.size = size;
            this.displayTitle = str2;
        }

        public static /* synthetic */ PriceField copy$default(PriceField priceField, String str, EmptyValue emptyValue, Size size, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = priceField.fieldId;
            }
            if ((i12 & 2) != 0) {
                emptyValue = priceField.selectedValue;
            }
            if ((i12 & 4) != 0) {
                size = priceField.size;
            }
            if ((i12 & 8) != 0) {
                str2 = priceField.displayTitle;
            }
            return priceField.copy(str, emptyValue, size, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final EmptyValue getSelectedValue() {
            return this.selectedValue;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @k
        public final PriceField copy(@k String fieldId, @l EmptyValue selectedValue, @k Size size, @k String displayTitle) {
            return new PriceField(fieldId, selectedValue, size, displayTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceField)) {
                return false;
            }
            PriceField priceField = (PriceField) other;
            return L.f(this.fieldId, priceField.fieldId) && L.f(this.selectedValue, priceField.selectedValue) && this.size == priceField.size && L.f(this.displayTitle, priceField.displayTitle);
        }

        @k
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            if (i12 == 1) {
                return 2;
            }
            if (i12 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        public int hashCode() {
            int iHashCode = this.fieldId.hashCode() * 31;
            EmptyValue emptyValue = this.selectedValue;
            return this.displayTitle.hashCode() + ((this.size.hashCode() + ((iHashCode + (emptyValue == null ? 0 : emptyValue.hashCode())) * 31)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PriceField(fieldId=");
            sb2.append(this.fieldId);
            sb2.append(", selectedValue=");
            sb2.append(this.selectedValue);
            sb2.append(", size=");
            sb2.append(this.size);
            sb2.append(", displayTitle=");
            return C22026a.c(sb2, this.displayTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            EmptyValue emptyValue = this.selectedValue;
            if (emptyValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                emptyValue.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.size.name());
            parcel.writeString(this.displayTitle);
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public EmptyValue getSelectedValue() {
            return this.selectedValue;
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u000e¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "thumbColor", "", "headerTitle", "headerDescription", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SearchHeaderConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getThumbColor", "Ljava/lang/String;", "getHeaderTitle", "getHeaderDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchHeaderConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchHeaderConfig> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("headerDescription")
        @k
        private final String headerDescription;

        @c("headerTitle")
        @k
        private final String headerTitle;

        @c("thumbColor")
        @k
        private final UniversalColor thumbColor;

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchHeaderConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchHeaderConfig createFromParcel(@k Parcel parcel) {
                return new SearchHeaderConfig((UniversalColor) parcel.readParcelable(SearchHeaderConfig.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SearchHeaderConfig.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchHeaderConfig[] newArray(int i12) {
                return new SearchHeaderConfig[i12];
            }
        }

        public SearchHeaderConfig(@k UniversalColor universalColor, @k UniversalColor universalColor2, @k String str, @k String str2) {
            this.backgroundColor = universalColor;
            this.thumbColor = universalColor2;
            this.headerTitle = str;
            this.headerDescription = str2;
        }

        public static /* synthetic */ SearchHeaderConfig copy$default(SearchHeaderConfig searchHeaderConfig, UniversalColor universalColor, UniversalColor universalColor2, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = searchHeaderConfig.backgroundColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = searchHeaderConfig.thumbColor;
            }
            if ((i12 & 4) != 0) {
                str = searchHeaderConfig.headerTitle;
            }
            if ((i12 & 8) != 0) {
                str2 = searchHeaderConfig.headerDescription;
            }
            return searchHeaderConfig.copy(universalColor, universalColor2, str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getThumbColor() {
            return this.thumbColor;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getHeaderTitle() {
            return this.headerTitle;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getHeaderDescription() {
            return this.headerDescription;
        }

        @k
        public final SearchHeaderConfig copy(@k UniversalColor backgroundColor, @k UniversalColor thumbColor, @k String headerTitle, @k String headerDescription) {
            return new SearchHeaderConfig(backgroundColor, thumbColor, headerTitle, headerDescription);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchHeaderConfig)) {
                return false;
            }
            SearchHeaderConfig searchHeaderConfig = (SearchHeaderConfig) other;
            return L.f(this.backgroundColor, searchHeaderConfig.backgroundColor) && L.f(this.thumbColor, searchHeaderConfig.thumbColor) && L.f(this.headerTitle, searchHeaderConfig.headerTitle) && L.f(this.headerDescription, searchHeaderConfig.headerDescription);
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final String getHeaderDescription() {
            return this.headerDescription;
        }

        @k
        public final String getHeaderTitle() {
            return this.headerTitle;
        }

        @k
        public final UniversalColor getThumbColor() {
            return this.thumbColor;
        }

        public int hashCode() {
            return this.headerDescription.hashCode() + H.d(a.i(this.thumbColor, this.backgroundColor.hashCode() * 31, 31), 31, this.headerTitle);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SearchHeaderConfig(backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", thumbColor=");
            sb2.append(this.thumbColor);
            sb2.append(", headerTitle=");
            sb2.append(this.headerTitle);
            sb2.append(", headerDescription=");
            return C22026a.c(sb2, this.headerDescription, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.thumbColor, flags);
            parcel.writeString(this.headerTitle);
            parcel.writeString(this.headerDescription);
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002>?BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJr\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u0012R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001dR\u0014\u0010=\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010#¨\u0006@"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$InputField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "", "fieldId", "selectedValue", "", "hasError", "icon", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "hint", "displayTitle", "", "values", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "getSelectedValue", "Ljava/lang/Boolean;", "getHasError", "getIcon", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "getHint", "getDisplayTitle", "Ljava/util/List;", "getValues", "getSpanSize", "spanSize", "Companion", "SelectValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SelectField implements InputField<SelectValue> {

        @k
        public static final String TYPE = "select";

        @c("displayTitle")
        @l
        private final String displayTitle;

        @c("fieldId")
        @k
        private final String fieldId;

        @c("hasError")
        @l
        private final Boolean hasError;

        @c("hint")
        @l
        private final String hint;

        @c("icon")
        @l
        private final String icon;

        @c("selectedValue")
        @l
        private final SelectValue selectedValue;

        @c("size")
        @k
        private final Size size;

        @c("values")
        @l
        private final List<SelectValue> values;

        @k
        public static final Parcelable.Creator<SelectField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectField createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                ArrayList arrayList = null;
                SelectValue selectValueCreateFromParcel = parcel.readInt() == 0 ? null : SelectValue.CREATOR.createFromParcel(parcel);
                int iC2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string2 = parcel.readString();
                Size sizeValueOf = Size.valueOf(parcel.readString());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    while (iC2 != i12) {
                        iC2 = a.c(SelectValue.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new SelectField(string, selectValueCreateFromParcel, boolValueOf, string2, sizeValueOf, string3, string4, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectField[] newArray(int i12) {
                return new SelectField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @d
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\fR \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "", "id", "", "title", "description", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SelectField$SelectValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getTitle", "getDescription", "", "getAnalyticsBody", "()Ljava/util/Map;", "analyticsBody", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectValue implements FieldValue {

            @k
            public static final Parcelable.Creator<SelectValue> CREATOR = new Creator();

            @c("description")
            @l
            private final String description;

            @c("valueId")
            private final long id;

            @c("title")
            @k
            private final String title;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SelectValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SelectValue createFromParcel(@k Parcel parcel) {
                    return new SelectValue(parcel.readLong(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SelectValue[] newArray(int i12) {
                    return new SelectValue[i12];
                }
            }

            public SelectValue(long j12, @k String str, @l String str2) {
                this.id = j12;
                this.title = str;
                this.description = str2;
            }

            public static /* synthetic */ SelectValue copy$default(SelectValue selectValue, long j12, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = selectValue.id;
                }
                if ((i12 & 2) != 0) {
                    str = selectValue.title;
                }
                if ((i12 & 4) != 0) {
                    str2 = selectValue.description;
                }
                return selectValue.copy(j12, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final long getId() {
                return this.id;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @k
            public final SelectValue copy(long id2, @k String title, @l String description) {
                return new SelectValue(id2, title, description);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectValue)) {
                    return false;
                }
                SelectValue selectValue = (SelectValue) other;
                return this.id == selectValue.id && L.f(this.title, selectValue.title) && L.f(this.description, selectValue.description);
            }

            @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.FieldValue
            @k
            public Map<String, Object> getAnalyticsBody() {
                return Collections.singletonMap("title", this.title);
            }

            @l
            public final String getDescription() {
                return this.description;
            }

            public final long getId() {
                return this.id;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iD2 = H.d(Long.hashCode(this.id) * 31, 31, this.title);
                String str = this.description;
                return iD2 + (str == null ? 0 : str.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SelectValue(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", description=");
                return C22026a.c(sb2, this.description, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeLong(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Full.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Half.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SelectField(@k String str, @l SelectValue selectValue, @l Boolean bool, @l String str2, @k Size size, @l String str3, @l String str4, @l List<SelectValue> list) {
            this.fieldId = str;
            this.selectedValue = selectValue;
            this.hasError = bool;
            this.icon = str2;
            this.size = size;
            this.hint = str3;
            this.displayTitle = str4;
            this.values = list;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final SelectValue getSelectedValue() {
            return this.selectedValue;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getHasError() {
            return this.hasError;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @l
        public final List<SelectValue> component8() {
            return this.values;
        }

        @k
        public final SelectField copy(@k String fieldId, @l SelectValue selectedValue, @l Boolean hasError, @l String icon, @k Size size, @l String hint, @l String displayTitle, @l List<SelectValue> values) {
            return new SelectField(fieldId, selectedValue, hasError, icon, size, hint, displayTitle, values);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectField)) {
                return false;
            }
            SelectField selectField = (SelectField) other;
            return L.f(this.fieldId, selectField.fieldId) && L.f(this.selectedValue, selectField.selectedValue) && L.f(this.hasError, selectField.hasError) && L.f(this.icon, selectField.icon) && this.size == selectField.size && L.f(this.hint, selectField.hint) && L.f(this.displayTitle, selectField.displayTitle) && L.f(this.values, selectField.values);
        }

        @l
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.InputField
        @l
        public Boolean getHasError() {
            return this.hasError;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.InputField
        @l
        public String getIcon() {
            return this.icon;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            if (i12 == 1) {
                return 2;
            }
            if (i12 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        @l
        public final List<SelectValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = this.fieldId.hashCode() * 31;
            SelectValue selectValue = this.selectedValue;
            int iHashCode2 = (iHashCode + (selectValue == null ? 0 : selectValue.hashCode())) * 31;
            Boolean bool = this.hasError;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.icon;
            int iHashCode4 = (this.size.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.hint;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.displayTitle;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<SelectValue> list = this.values;
            return iHashCode6 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SelectField(fieldId=");
            sb2.append(this.fieldId);
            sb2.append(", selectedValue=");
            sb2.append(this.selectedValue);
            sb2.append(", hasError=");
            sb2.append(this.hasError);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", size=");
            sb2.append(this.size);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", displayTitle=");
            sb2.append(this.displayTitle);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            SelectValue selectValue = this.selectedValue;
            if (selectValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selectValue.writeToParcel(parcel, flags);
            }
            Boolean bool = this.hasError;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.icon);
            parcel.writeString(this.size.name());
            parcel.writeString(this.hint);
            parcel.writeString(this.displayTitle);
            List<SelectValue> list = this.values;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SelectValue) itA.next()).writeToParcel(parcel, flags);
            }
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public SelectValue getSelectedValue() {
            return this.selectedValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "", "(Ljava/lang/String;I)V", "Full", "Half", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;

        @c("full")
        public static final Size Full = new Size("Full", 0);

        @c("half")
        public static final Size Half = new Size("Half", 1);

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size$Companion;", "", "()V", "fromString", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final Size fromString(@k String size) {
                return size.equals("half") ? Size.Half : Size.Full;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{Full, Half};
        }

        static {
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = kotlin.enums.c.a(sizeArr$values);
            INSTANCE = new Companion(null);
        }

        private Size(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: ServiceTransportationWidget.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003/01B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0011R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Field;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$Switches;", "", "fieldId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "size", "", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue;", "switches", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;Ljava/util/List;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFieldId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$Size;", "getSize", "Ljava/util/List;", "getSwitches", "getSelectedValue", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$Switches;", "selectedValue", "getSpanSize", "spanSize", "Companion", "SwitchValue", "Switches", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SwitchGroupField implements Field<Switches> {

        @k
        public static final String TYPE = "switchGroup";

        @c("fieldId")
        @k
        private final String fieldId;

        @c("size")
        @k
        private final Size size;

        @c("switches")
        @k
        private final List<SwitchValue> switches;

        @k
        public static final Parcelable.Creator<SwitchGroupField> CREATOR = new Creator();

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SwitchGroupField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SwitchGroupField createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                Size sizeValueOf = Size.valueOf(parcel.readString());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(SwitchValue.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new SwitchGroupField(string, sizeValueOf, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SwitchGroupField[] newArray(int i12) {
                return new SwitchGroupField[i12];
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b\b\u0010\u0011¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;", "size", "title", "", "isSelected", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;Ljava/lang/String;Z)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;", "getSize", "getTitle", "Z", "SwitchSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SwitchValue implements Parcelable {

            @k
            public static final Parcelable.Creator<SwitchValue> CREATOR = new Creator();

            @c("fieldId")
            @k
            private final String id;

            @c("isSelected")
            private final boolean isSelected;

            @c("size")
            @l
            private final SwitchSize size;

            @c("title")
            @k
            private final String title;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SwitchValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SwitchValue createFromParcel(@k Parcel parcel) {
                    return new SwitchValue(parcel.readString(), parcel.readInt() == 0 ? null : SwitchSize.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SwitchValue[] newArray(int i12) {
                    return new SwitchValue[i12];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;", "", "(Ljava/lang/String;I)V", "Content", "Full", "Half", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class SwitchSize {
                private static final /* synthetic */ kotlin.enums.a $ENTRIES;
                private static final /* synthetic */ SwitchSize[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                @k
                public static final Companion INSTANCE;

                @c("content")
                public static final SwitchSize Content = new SwitchSize("Content", 0);

                @c("full")
                public static final SwitchSize Full = new SwitchSize("Full", 1);

                @c("half")
                public static final SwitchSize Half = new SwitchSize("Half", 2);

                /* compiled from: ServiceTransportationWidget.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize$Companion;", "", "()V", "fromString", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue$SwitchSize;", "size", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(C42822w c42822w) {
                        this();
                    }

                    @k
                    public final SwitchSize fromString(@k String size) {
                        return size.equals("full") ? SwitchSize.Full : size.equals("half") ? SwitchSize.Half : SwitchSize.Content;
                    }

                    private Companion() {
                    }
                }

                private static final /* synthetic */ SwitchSize[] $values() {
                    return new SwitchSize[]{Content, Full, Half};
                }

                static {
                    SwitchSize[] switchSizeArr$values = $values();
                    $VALUES = switchSizeArr$values;
                    $ENTRIES = kotlin.enums.c.a(switchSizeArr$values);
                    INSTANCE = new Companion(null);
                }

                private SwitchSize(String str, int i12) {
                }

                @k
                public static kotlin.enums.a<SwitchSize> getEntries() {
                    return $ENTRIES;
                }

                public static SwitchSize valueOf(String str) {
                    return (SwitchSize) Enum.valueOf(SwitchSize.class, str);
                }

                public static SwitchSize[] values() {
                    return (SwitchSize[]) $VALUES.clone();
                }
            }

            public SwitchValue(@k String str, @l SwitchSize switchSize, @k String str2, boolean z12) {
                this.id = str;
                this.size = switchSize;
                this.title = str2;
                this.isSelected = z12;
            }

            public static /* synthetic */ SwitchValue copy$default(SwitchValue switchValue, String str, SwitchSize switchSize, String str2, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = switchValue.id;
                }
                if ((i12 & 2) != 0) {
                    switchSize = switchValue.size;
                }
                if ((i12 & 4) != 0) {
                    str2 = switchValue.title;
                }
                if ((i12 & 8) != 0) {
                    z12 = switchValue.isSelected;
                }
                return switchValue.copy(str, switchSize, str2, z12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final SwitchSize getSize() {
                return this.size;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @k
            public final SwitchValue copy(@k String id2, @l SwitchSize size, @k String title, boolean isSelected) {
                return new SwitchValue(id2, size, title, isSelected);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SwitchValue)) {
                    return false;
                }
                SwitchValue switchValue = (SwitchValue) other;
                return L.f(this.id, switchValue.id) && this.size == switchValue.size && L.f(this.title, switchValue.title) && this.isSelected == switchValue.isSelected;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @l
            public final SwitchSize getSize() {
                return this.size;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                SwitchSize switchSize = this.size;
                return Boolean.hashCode(this.isSelected) + H.d((iHashCode + (switchSize == null ? 0 : switchSize.hashCode())) * 31, 31, this.title);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SwitchValue(id=");
                sb2.append(this.id);
                sb2.append(", size=");
                sb2.append(this.size);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", isSelected=");
                return r.x(sb2, this.isSelected, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.id);
                SwitchSize switchSize = this.size;
                if (switchSize == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(switchSize.name());
                }
                parcel.writeString(this.title);
                parcel.writeInt(this.isSelected ? 1 : 0);
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @s0
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\bR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$Switches;", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$FieldValue;", "", "Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$SwitchValue;", "switches", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/service_transportation_widget/ServiceTransportationWidget$SwitchGroupField$Switches;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSwitches", "", "getAnalyticsBody", "()Ljava/util/Map;", "analyticsBody", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Switches implements FieldValue {

            @k
            public static final Parcelable.Creator<Switches> CREATOR = new Creator();

            @k
            private final List<SwitchValue> switches;

            /* compiled from: ServiceTransportationWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Switches> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Switches createFromParcel(@k Parcel parcel) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(SwitchValue.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Switches(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Switches[] newArray(int i12) {
                    return new Switches[i12];
                }
            }

            public Switches(@k List<SwitchValue> list) {
                this.switches = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Switches copy$default(Switches switches, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = switches.switches;
                }
                return switches.copy(list);
            }

            @k
            public final List<SwitchValue> component1() {
                return this.switches;
            }

            @k
            public final Switches copy(@k List<SwitchValue> switches) {
                return new Switches(switches);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Switches) && L.f(this.switches, ((Switches) other).switches);
            }

            @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.FieldValue
            @k
            public Map<String, Object> getAnalyticsBody() {
                List<SwitchValue> list = this.switches;
                int iF2 = P0.f(C42745f0.q(list, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (SwitchValue switchValue : list) {
                    linkedHashMap.put(switchValue.getId(), Boolean.valueOf(switchValue.isSelected()));
                }
                return linkedHashMap;
            }

            @k
            public final List<SwitchValue> getSwitches() {
                return this.switches;
            }

            public int hashCode() {
                return this.switches.hashCode();
            }

            @k
            public String toString() {
                return H.p(new StringBuilder("Switches(switches="), this.switches, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Iterator itJ = C0.j(this.switches, parcel);
                while (itJ.hasNext()) {
                    ((SwitchValue) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: ServiceTransportationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Full.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.Half.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SwitchGroupField(@k String str, @k Size size, @k List<SwitchValue> list) {
            this.fieldId = str;
            this.size = size;
            this.switches = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SwitchGroupField copy$default(SwitchGroupField switchGroupField, String str, Size size, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = switchGroupField.fieldId;
            }
            if ((i12 & 2) != 0) {
                size = switchGroupField.size;
            }
            if ((i12 & 4) != 0) {
                list = switchGroupField.switches;
            }
            return switchGroupField.copy(str, size, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldId() {
            return this.fieldId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @k
        public final List<SwitchValue> component3() {
            return this.switches;
        }

        @k
        public final SwitchGroupField copy(@k String fieldId, @k Size size, @k List<SwitchValue> switches) {
            return new SwitchGroupField(fieldId, size, switches);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwitchGroupField)) {
                return false;
            }
            SwitchGroupField switchGroupField = (SwitchGroupField) other;
            return L.f(this.fieldId, switchGroupField.fieldId) && this.size == switchGroupField.size && L.f(this.switches, switchGroupField.switches);
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @k
        public String getFieldId() {
            return this.fieldId;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        public int getSpanSize() {
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            if (i12 == 1) {
                return 2;
            }
            if (i12 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        @k
        public final List<SwitchValue> getSwitches() {
            return this.switches;
        }

        public int hashCode() {
            return this.switches.hashCode() + ((this.size.hashCode() + (this.fieldId.hashCode() * 31)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SwitchGroupField(fieldId=");
            sb2.append(this.fieldId);
            sb2.append(", size=");
            sb2.append(this.size);
            sb2.append(", switches=");
            return H.p(sb2, this.switches, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fieldId);
            parcel.writeString(this.size.name());
            Iterator itJ = C0.j(this.switches, parcel);
            while (itJ.hasNext()) {
                ((SwitchValue) itJ.next()).writeToParcel(parcel, flags);
            }
        }

        @Override // com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget.Field
        @l
        public Switches getSelectedValue() {
            return new Switches(this.switches);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceTransportationWidget(@l String str, @l String str2, @l AttributedText attributedText, @l AnalyticParams analyticParams, @l Map<String, String> map, @l Action action, @l List<? extends Field<?>> list, @l SearchHeaderConfig searchHeaderConfig, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.bannerStyle = str2;
        this.description = attributedText;
        this.analyticParams = analyticParams;
        this.queryExtParams = map;
        this.action = action;
        this.fields = list;
        this.searchHeaderConfig = searchHeaderConfig;
        this.analytics = analytics;
        this.settings = settings;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getBannerStyle() {
        return this.bannerStyle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final Map<String, String> component5() {
        return this.queryExtParams;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    public final List<Field<?>> component7() {
        return this.fields;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final SearchHeaderConfig getSearchHeaderConfig() {
        return this.searchHeaderConfig;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final ServiceTransportationWidget copy(@l String title, @l String bannerStyle, @l AttributedText description, @l AnalyticParams analyticParams, @l Map<String, String> queryExtParams, @l Action action, @l List<? extends Field<?>> fields, @l SearchHeaderConfig searchHeaderConfig, @l Analytics analytics, @l Settings settings) {
        return new ServiceTransportationWidget(title, bannerStyle, description, analyticParams, queryExtParams, action, fields, searchHeaderConfig, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceTransportationWidget)) {
            return false;
        }
        ServiceTransportationWidget serviceTransportationWidget = (ServiceTransportationWidget) other;
        return L.f(this.title, serviceTransportationWidget.title) && L.f(this.bannerStyle, serviceTransportationWidget.bannerStyle) && L.f(this.description, serviceTransportationWidget.description) && L.f(this.analyticParams, serviceTransportationWidget.analyticParams) && L.f(this.queryExtParams, serviceTransportationWidget.queryExtParams) && L.f(this.action, serviceTransportationWidget.action) && L.f(this.fields, serviceTransportationWidget.fields) && L.f(this.searchHeaderConfig, serviceTransportationWidget.searchHeaderConfig) && L.f(this.analytics, serviceTransportationWidget.analytics) && L.f(this.settings, serviceTransportationWidget.settings);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final AnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final String getBannerStyle() {
        return this.bannerStyle;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<Field<?>> getFields() {
        return this.fields;
    }

    @l
    public final Map<String, String> getQueryExtParams() {
        return this.queryExtParams;
    }

    @l
    public final SearchHeaderConfig getSearchHeaderConfig() {
        return this.searchHeaderConfig;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.HeaderToolbarElement
    public boolean getShowInHeaderToolbar() {
        return this.searchHeaderConfig != null;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerStyle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.description;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AnalyticParams analyticParams = this.analyticParams;
        int iHashCode4 = (iHashCode3 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        Map<String, String> map = this.queryExtParams;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Action action = this.action;
        int iHashCode6 = (iHashCode5 + (action == null ? 0 : action.hashCode())) * 31;
        List<Field<?>> list = this.fields;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        SearchHeaderConfig searchHeaderConfig = this.searchHeaderConfig;
        int iHashCode8 = (iHashCode7 + (searchHeaderConfig == null ? 0 : searchHeaderConfig.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode9 = (iHashCode8 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode9 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("ServiceTransportationWidget(title=");
        sb2.append(this.title);
        sb2.append(", bannerStyle=");
        sb2.append(this.bannerStyle);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", queryExtParams=");
        sb2.append(this.queryExtParams);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", searchHeaderConfig=");
        sb2.append(this.searchHeaderConfig);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.bannerStyle);
        parcel.writeParcelable(this.description, flags);
        AnalyticParams analyticParams = this.analyticParams;
        if (analyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticParams.writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.queryExtParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
        List<Field<?>> list = this.fields;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        SearchHeaderConfig searchHeaderConfig = this.searchHeaderConfig;
        if (searchHeaderConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchHeaderConfig.writeToParcel(parcel, flags);
        }
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

    public /* synthetic */ ServiceTransportationWidget(String str, String str2, AttributedText attributedText, AnalyticParams analyticParams, Map map, Action action, List list, SearchHeaderConfig searchHeaderConfig, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, attributedText, analyticParams, map, action, list, searchHeaderConfig, (i12 & 256) != 0 ? null : analytics, (i12 & 512) != 0 ? null : settings);
    }
}
