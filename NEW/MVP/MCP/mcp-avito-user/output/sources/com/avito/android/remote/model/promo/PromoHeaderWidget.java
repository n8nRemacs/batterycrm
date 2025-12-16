package com.avito.android.remote.model.promo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarConfigElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
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

/* compiled from: PromoHeaderWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0007_`abcdeB{\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0094\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u000202HÖ\u0001¢\u0006\u0004\b9\u00104J \u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u000202HÖ\u0001¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bB\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010%R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010'R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bM\u0010'R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010N\u001a\u0004\bO\u0010*\"\u0004\bP\u0010QR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010R\u001a\u0004\bS\u0010,\"\u0004\bT\u0010UR(\u0010W\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b]\u0010^\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006f"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/ToolbarConfigElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;", "button", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/ToolbarConfig;", "toolbarConfig", "", "resetStyleOnScroll", "", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Image;", "images", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Badge;", "badges", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/ToolbarConfig;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "component5", "()Lcom/avito/android/remote/model/ToolbarConfig;", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component10", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/ToolbarConfig;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/promo/PromoHeaderWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;", "getButton", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/ToolbarConfig;", "getToolbarConfig", "Ljava/lang/Boolean;", "getResetStyleOnScroll", "Ljava/util/List;", "getImages", "getBadges", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "Badge", "Button", "Edge", "Image", "Position", "Size", "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoHeaderWidget implements SerpElement, AnalyticsElement, ToolbarConfigElement, SettingsElement {

    @k
    public static final Parcelable.Creator<PromoHeaderWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("badges")
    @l
    private final List<Badge> badges;

    @c("button")
    @l
    private final Button button;

    @c("images")
    @l
    private final List<Image> images;

    @c("resetStyleOnScroll")
    @l
    private final Boolean resetStyleOnScroll;

    @c("settings")
    @l
    private Settings settings;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    @c("toolbarConfig")
    @l
    private final ToolbarConfig toolbarConfig;
    private transient long uniqueId;

    /* compiled from: PromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Badge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;)Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Badge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @k
        public static final Parcelable.Creator<Badge> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final Style style;

        @c("title")
        @k
        private final String title;

        /* compiled from: PromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Badge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge createFromParcel(@k Parcel parcel) {
                return new Badge(parcel.readString(), Style.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        public Badge(@k String str, @k Style style) {
            this.title = str;
            this.style = style;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, Style style, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = badge.title;
            }
            if ((i12 & 2) != 0) {
                style = badge.style;
            }
            return badge.copy(str, style);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Style getStyle() {
            return this.style;
        }

        @k
        public final Badge copy(@k String title, @k Style style) {
            return new Badge(title, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return L.f(this.title, badge.title) && L.f(this.style, badge.style);
        }

        @k
        public final Style getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.style.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Badge(title=" + this.title + ", style=" + this.style + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            this.style.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: PromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String text;

        /* compiled from: PromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k DeepLink deepLink, @l String str2) {
            this.text = str;
            this.deepLink = deepLink;
            this.style = str2;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, DeepLink deepLink, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = button.deepLink;
            }
            if ((i12 & 4) != 0) {
                str2 = button.style;
            }
            return button.copy(str, deepLink, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Button copy(@k String text, @k DeepLink deepLink, @l String style) {
            return new Button(text, deepLink, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.text, button.text) && L.f(this.deepLink, button.deepLink) && L.f(this.style, button.style);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iE2 = a.e(this.deepLink, this.text.hashCode() * 31, 31);
            String str = this.style;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.text);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeString(this.style);
        }
    }

    /* compiled from: PromoHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoHeaderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoHeaderWidget createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PromoHeaderWidget.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(PromoHeaderWidget.class.getClassLoader());
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(PromoHeaderWidget.class.getClassLoader());
            ToolbarConfig toolbarConfigCreateFromParcel = parcel.readInt() == 0 ? null : ToolbarConfig.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Image.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(Badge.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new PromoHeaderWidget(attributedText, attributedText2, buttonCreateFromParcel, universalColor, toolbarConfigCreateFromParcel, boolValueOf, arrayList, arrayList2, parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoHeaderWidget[] newArray(int i12) {
            return new PromoHeaderWidget[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromoHeaderWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;", "", "(Ljava/lang/String;I)V", "SQUARE", "FLAG", "PIPKA", "PYRAMID", "ANTI_PYRAMID", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Edge {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Edge[] $VALUES;

        @c("square")
        public static final Edge SQUARE = new Edge("SQUARE", 0);

        @c("flag")
        public static final Edge FLAG = new Edge("FLAG", 1);

        @c("pipka")
        public static final Edge PIPKA = new Edge("PIPKA", 2);

        @c("pyramid")
        public static final Edge PYRAMID = new Edge("PYRAMID", 3);

        @c("antiPyramid")
        public static final Edge ANTI_PYRAMID = new Edge("ANTI_PYRAMID", 4);

        private static final /* synthetic */ Edge[] $values() {
            return new Edge[]{SQUARE, FLAG, PIPKA, PYRAMID, ANTI_PYRAMID};
        }

        static {
            Edge[] edgeArr$values = $values();
            $VALUES = edgeArr$values;
            $ENTRIES = kotlin.enums.c.a(edgeArr$values);
        }

        private Edge(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Edge> getEntries() {
            return $ENTRIES;
        }

        public static Edge valueOf(String str) {
            return (Edge) Enum.valueOf(Edge.class, str);
        }

        public static Edge[] values() {
            return (Edge[]) $VALUES.clone();
        }
    }

    /* compiled from: PromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Image;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;", "size", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Position;", "position", "<init>", "(Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Position;)V", "component1", "()Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Position;", "copy", "(Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Position;)Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Image;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;", "getSize", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Position;", "getPosition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @c("image")
        @k
        private final UniversalImage image;

        @c("position")
        @l
        private final Position position;

        @c("size")
        @l
        private final Size size;

        /* compiled from: PromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image(parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() != 0 ? Position.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@l Size size, @k UniversalImage universalImage, @l Position position) {
            this.size = size;
            this.image = universalImage;
            this.position = position;
        }

        public static /* synthetic */ Image copy$default(Image image, Size size, UniversalImage universalImage, Position position, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                size = image.size;
            }
            if ((i12 & 2) != 0) {
                universalImage = image.image;
            }
            if ((i12 & 4) != 0) {
                position = image.position;
            }
            return image.copy(size, universalImage, position);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        @k
        public final Image copy(@l Size size, @k UniversalImage image, @l Position position) {
            return new Image(size, image, position);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return L.f(this.size, image.size) && L.f(this.image, image.image) && this.position == image.position;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        public final Position getPosition() {
            return this.position;
        }

        @l
        public final Size getSize() {
            return this.size;
        }

        public int hashCode() {
            Size size = this.size;
            int iA2 = a.a((size == null ? 0 : size.hashCode()) * 31, 31, this.image);
            Position position = this.position;
            return iA2 + (position != null ? position.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Image(size=" + this.size + ", image=" + this.image + ", position=" + this.position + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Size size = this.size;
            if (size == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                size.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.image, flags);
            Position position = this.position;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromoHeaderWidget.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Position;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "LEFT", "RIGHT", "FULL", "CENTER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Position implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;

        @k
        public static final Parcelable.Creator<Position> CREATOR;

        @c("left")
        public static final Position LEFT = new Position("LEFT", 0);

        @c("right")
        public static final Position RIGHT = new Position("RIGHT", 1);

        @c("full")
        public static final Position FULL = new Position("FULL", 2);

        @c("center")
        public static final Position CENTER = new Position("CENTER", 3);

        /* compiled from: PromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position createFromParcel(@k Parcel parcel) {
                return Position.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position[] newArray(int i12) {
                return new Position[i12];
            }
        }

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{LEFT, RIGHT, FULL, CENTER};
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = kotlin.enums.c.a(positionArr$values);
            CREATOR = new Creator();
        }

        private Position(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* compiled from: PromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Size;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "getHeight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Size implements Parcelable {

        @k
        public static final Parcelable.Creator<Size> CREATOR = new Creator();

        @c("height")
        private final int height;

        @c("width")
        private final int width;

        /* compiled from: PromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Size> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Size createFromParcel(@k Parcel parcel) {
                return new Size(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Size[] newArray(int i12) {
                return new Size[i12];
            }
        }

        public Size(int i12, int i13) {
            this.width = i12;
            this.height = i13;
        }

        public static /* synthetic */ Size copy$default(Size size, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = size.width;
            }
            if ((i14 & 2) != 0) {
                i13 = size.height;
            }
            return size.copy(i12, i13);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @k
        public final Size copy(int width, int height) {
            return new Size(width, height);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return r.t(sb2, this.height, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    /* compiled from: PromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u000e¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "backgroundColor", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;", "leftEndType", "rightEndType", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component3", "()Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;", "component4", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;)Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Style;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackgroundColor", "Lcom/avito/android/remote/model/promo/PromoHeaderWidget$Edge;", "getLeftEndType", "getRightEndType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Style implements Parcelable {

        @k
        public static final Parcelable.Creator<Style> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("leftEndType")
        @l
        private final Edge leftEndType;

        @c("rightEndType")
        @l
        private final Edge rightEndType;

        @c("textColor")
        @k
        private final UniversalColor textColor;

        /* compiled from: PromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Style> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Style createFromParcel(@k Parcel parcel) {
                return new Style((UniversalColor) parcel.readParcelable(Style.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Style.class.getClassLoader()), parcel.readInt() == 0 ? null : Edge.valueOf(parcel.readString()), parcel.readInt() != 0 ? Edge.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Style[] newArray(int i12) {
                return new Style[i12];
            }
        }

        public Style(@k UniversalColor universalColor, @k UniversalColor universalColor2, @l Edge edge, @l Edge edge2) {
            this.textColor = universalColor;
            this.backgroundColor = universalColor2;
            this.leftEndType = edge;
            this.rightEndType = edge2;
        }

        public static /* synthetic */ Style copy$default(Style style, UniversalColor universalColor, UniversalColor universalColor2, Edge edge, Edge edge2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = style.textColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = style.backgroundColor;
            }
            if ((i12 & 4) != 0) {
                edge = style.leftEndType;
            }
            if ((i12 & 8) != 0) {
                edge2 = style.rightEndType;
            }
            return style.copy(universalColor, universalColor2, edge, edge2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Edge getLeftEndType() {
            return this.leftEndType;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Edge getRightEndType() {
            return this.rightEndType;
        }

        @k
        public final Style copy(@k UniversalColor textColor, @k UniversalColor backgroundColor, @l Edge leftEndType, @l Edge rightEndType) {
            return new Style(textColor, backgroundColor, leftEndType, rightEndType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return L.f(this.textColor, style.textColor) && L.f(this.backgroundColor, style.backgroundColor) && this.leftEndType == style.leftEndType && this.rightEndType == style.rightEndType;
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final Edge getLeftEndType() {
            return this.leftEndType;
        }

        @l
        public final Edge getRightEndType() {
            return this.rightEndType;
        }

        @k
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int i12 = a.i(this.backgroundColor, this.textColor.hashCode() * 31, 31);
            Edge edge = this.leftEndType;
            int iHashCode = (i12 + (edge == null ? 0 : edge.hashCode())) * 31;
            Edge edge2 = this.rightEndType;
            return iHashCode + (edge2 != null ? edge2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Style(textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", leftEndType=" + this.leftEndType + ", rightEndType=" + this.rightEndType + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
            Edge edge = this.leftEndType;
            if (edge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(edge.name());
            }
            Edge edge2 = this.rightEndType;
            if (edge2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(edge2.name());
            }
        }
    }

    public PromoHeaderWidget(@l AttributedText attributedText, @l AttributedText attributedText2, @l Button button, @l UniversalColor universalColor, @l ToolbarConfig toolbarConfig, @l Boolean bool, @l List<Image> list, @l List<Badge> list2, @l Analytics analytics, @l Settings settings) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.button = button;
        this.backgroundColor = universalColor;
        this.toolbarConfig = toolbarConfig;
        this.resetStyleOnScroll = bool;
        this.images = list;
        this.badges = list2;
        this.analytics = analytics;
        this.settings = settings;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getResetStyleOnScroll() {
        return this.resetStyleOnScroll;
    }

    @l
    public final List<Image> component7() {
        return this.images;
    }

    @l
    public final List<Badge> component8() {
        return this.badges;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final PromoHeaderWidget copy(@l AttributedText title, @l AttributedText subtitle, @l Button button, @l UniversalColor backgroundColor, @l ToolbarConfig toolbarConfig, @l Boolean resetStyleOnScroll, @l List<Image> images, @l List<Badge> badges, @l Analytics analytics, @l Settings settings) {
        return new PromoHeaderWidget(title, subtitle, button, backgroundColor, toolbarConfig, resetStyleOnScroll, images, badges, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoHeaderWidget)) {
            return false;
        }
        PromoHeaderWidget promoHeaderWidget = (PromoHeaderWidget) other;
        return L.f(this.title, promoHeaderWidget.title) && L.f(this.subtitle, promoHeaderWidget.subtitle) && L.f(this.button, promoHeaderWidget.button) && L.f(this.backgroundColor, promoHeaderWidget.backgroundColor) && L.f(this.toolbarConfig, promoHeaderWidget.toolbarConfig) && L.f(this.resetStyleOnScroll, promoHeaderWidget.resetStyleOnScroll) && L.f(this.images, promoHeaderWidget.images) && L.f(this.badges, promoHeaderWidget.badges) && L.f(this.analytics, promoHeaderWidget.analytics) && L.f(this.settings, promoHeaderWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final List<Badge> getBadges() {
        return this.badges;
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    @l
    public final Boolean getResetStyleOnScroll() {
        return this.resetStyleOnScroll;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.ToolbarConfigElement
    @l
    public ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Button button = this.button;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        int iHashCode5 = (iHashCode4 + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31;
        Boolean bool = this.resetStyleOnScroll;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Image> list = this.images;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<Badge> list2 = this.badges;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
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
        StringBuilder sb2 = new StringBuilder("PromoHeaderWidget(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", toolbarConfig=");
        sb2.append(this.toolbarConfig);
        sb2.append(", resetStyleOnScroll=");
        sb2.append(this.resetStyleOnScroll);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", badges=");
        sb2.append(this.badges);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.backgroundColor, flags);
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        if (toolbarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarConfig.writeToParcel(parcel, flags);
        }
        Boolean bool = this.resetStyleOnScroll;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Image) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<Badge> list2 = this.badges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Badge) itA2.next()).writeToParcel(parcel, flags);
            }
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

    public /* synthetic */ PromoHeaderWidget(AttributedText attributedText, AttributedText attributedText2, Button button, UniversalColor universalColor, ToolbarConfig toolbarConfig, Boolean bool, List list, List list2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, button, universalColor, toolbarConfig, bool, list, list2, (i12 & 256) != 0 ? null : analytics, (i12 & 512) != 0 ? null : settings);
    }
}
