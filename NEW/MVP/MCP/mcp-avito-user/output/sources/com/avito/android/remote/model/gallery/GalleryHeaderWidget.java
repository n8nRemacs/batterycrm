package com.avito.android.remote.model.gallery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
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

/* compiled from: GalleryHeaderWidget.kt */
@d
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006MNOPQRBK\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001bR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010?R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010CR(\u0010E\u001a\u00020D8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010L\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006S"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/ToolbarConfigElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$GalleryItem;", "galleryItems", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/ToolbarConfig;", "toolbarConfig", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/ToolbarConfig;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "()Lcom/avito/android/remote/model/ToolbarConfig;", "component5", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component6", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/ToolbarConfig;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/util/List;", "getGalleryItems", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/ToolbarConfig;", "getToolbarConfig", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "ActiveButton", "Badge", "Button", "GalleryItem", "Icon", "InactiveButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GalleryHeaderWidget implements SerpElement, AnalyticsElement, ToolbarConfigElement, SettingsElement {

    @k
    public static final Parcelable.Creator<GalleryHeaderWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("items")
    @k
    private final List<GalleryItem> galleryItems;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @l
    private final AttributedText title;

    @c("toolbarConfig")
    @l
    private final ToolbarConfig toolbarConfig;
    private transient long uniqueId;

    /* compiled from: GalleryHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$ActiveButton;", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "darkStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$ActiveButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getStyle", "getDarkStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActiveButton implements Button {

        @k
        public static final Parcelable.Creator<ActiveButton> CREATOR = new Creator();

        @c("darkStyle")
        @l
        private final String darkStyle;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("text")
        @k
        private final String text;

        /* compiled from: GalleryHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActiveButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActiveButton createFromParcel(@k Parcel parcel) {
                return new ActiveButton(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ActiveButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActiveButton[] newArray(int i12) {
                return new ActiveButton[i12];
            }
        }

        public ActiveButton(@k String str, @l String str2, @l String str3, @k DeepLink deepLink) {
            this.text = str;
            this.style = str2;
            this.darkStyle = str3;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ ActiveButton copy$default(ActiveButton activeButton, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = activeButton.text;
            }
            if ((i12 & 2) != 0) {
                str2 = activeButton.style;
            }
            if ((i12 & 4) != 0) {
                str3 = activeButton.darkStyle;
            }
            if ((i12 & 8) != 0) {
                deepLink = activeButton.deepLink;
            }
            return activeButton.copy(str, str2, str3, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDarkStyle() {
            return this.darkStyle;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final ActiveButton copy(@k String text, @l String style, @l String darkStyle, @k DeepLink deepLink) {
            return new ActiveButton(text, style, darkStyle, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveButton)) {
                return false;
            }
            ActiveButton activeButton = (ActiveButton) other;
            return L.f(this.text, activeButton.text) && L.f(this.style, activeButton.style) && L.f(this.darkStyle, activeButton.darkStyle) && L.f(this.deepLink, activeButton.deepLink);
        }

        @l
        public final String getDarkStyle() {
            return this.darkStyle;
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
            int iHashCode = this.text.hashCode() * 31;
            String str = this.style;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.darkStyle;
            return this.deepLink.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ActiveButton(text=");
            sb2.append(this.text);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", darkStyle=");
            sb2.append(this.darkStyle);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.style);
            parcel.writeString(this.darkStyle);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: GalleryHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "backgroundColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @k
        public static final Parcelable.Creator<Badge> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("text")
        @k
        private final String text;

        @c("textColor")
        @l
        private final UniversalColor textColor;

        /* compiled from: GalleryHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Badge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge createFromParcel(@k Parcel parcel) {
                return new Badge(parcel.readString(), (UniversalColor) parcel.readParcelable(Badge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Badge.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        public Badge(@k String str, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
            this.text = str;
            this.textColor = universalColor;
            this.backgroundColor = universalColor2;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = badge.text;
            }
            if ((i12 & 2) != 0) {
                universalColor = badge.textColor;
            }
            if ((i12 & 4) != 0) {
                universalColor2 = badge.backgroundColor;
            }
            return badge.copy(str, universalColor, universalColor2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final Badge copy(@k String text, @l UniversalColor textColor, @l UniversalColor backgroundColor) {
            return new Badge(text, textColor, backgroundColor);
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
            return L.f(this.text, badge.text) && L.f(this.textColor, badge.textColor) && L.f(this.backgroundColor, badge.backgroundColor);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            UniversalColor universalColor = this.textColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.backgroundColor;
            return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Badge(text=");
            sb2.append(this.text);
            sb2.append(", textColor=");
            sb2.append(this.textColor);
            sb2.append(", backgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
        }
    }

    /* compiled from: GalleryHeaderWidget.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$ActiveButton;", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$InactiveButton;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Button extends Parcelable {
    }

    /* compiled from: GalleryHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryHeaderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryHeaderWidget createFromParcel(@k Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(GalleryHeaderWidget.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(GalleryItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GalleryHeaderWidget(attributedText, arrayList, (UniversalColor) parcel.readParcelable(GalleryHeaderWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : ToolbarConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryHeaderWidget[] newArray(int i12) {
            return new GalleryHeaderWidget[i12];
        }
    }

    /* compiled from: GalleryHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0015¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$GalleryItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;", "badge", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;", "button", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;)Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$GalleryItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Badge;", "getBadge", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;", "getButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GalleryItem implements Parcelable {

        @k
        public static final Parcelable.Creator<GalleryItem> CREATOR = new Creator();

        @c("badge")
        @l
        private final Badge badge;

        @c("button")
        @l
        private final Button button;

        @c("image")
        @k
        private final UniversalImage image;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @l
        private final AttributedText title;

        /* compiled from: GalleryHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GalleryItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GalleryItem createFromParcel(@k Parcel parcel) {
                return new GalleryItem((UniversalImage) parcel.readParcelable(GalleryItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(GalleryItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(GalleryItem.class.getClassLoader()), (Button) parcel.readParcelable(GalleryItem.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GalleryItem[] newArray(int i12) {
                return new GalleryItem[i12];
            }
        }

        public GalleryItem(@k UniversalImage universalImage, @l Badge badge, @l AttributedText attributedText, @l AttributedText attributedText2, @l Button button) {
            this.image = universalImage;
            this.badge = badge;
            this.title = attributedText;
            this.subtitle = attributedText2;
            this.button = button;
        }

        public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, UniversalImage universalImage, Badge badge, AttributedText attributedText, AttributedText attributedText2, Button button, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = galleryItem.image;
            }
            if ((i12 & 2) != 0) {
                badge = galleryItem.badge;
            }
            Badge badge2 = badge;
            if ((i12 & 4) != 0) {
                attributedText = galleryItem.title;
            }
            AttributedText attributedText3 = attributedText;
            if ((i12 & 8) != 0) {
                attributedText2 = galleryItem.subtitle;
            }
            AttributedText attributedText4 = attributedText2;
            if ((i12 & 16) != 0) {
                button = galleryItem.button;
            }
            return galleryItem.copy(universalImage, badge2, attributedText3, attributedText4, button);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @k
        public final GalleryItem copy(@k UniversalImage image, @l Badge badge, @l AttributedText title, @l AttributedText subtitle, @l Button button) {
            return new GalleryItem(image, badge, title, subtitle, button);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) other;
            return L.f(this.image, galleryItem.image) && L.f(this.badge, galleryItem.badge) && L.f(this.title, galleryItem.title) && L.f(this.subtitle, galleryItem.subtitle) && L.f(this.button, galleryItem.button);
        }

        @l
        public final Badge getBadge() {
            return this.badge;
        }

        @l
        public final Button getButton() {
            return this.button;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        public final AttributedText getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.image.hashCode() * 31;
            Badge badge = this.badge;
            int iHashCode2 = (iHashCode + (badge == null ? 0 : badge.hashCode())) * 31;
            AttributedText attributedText = this.title;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.subtitle;
            int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            Button button = this.button;
            return iHashCode4 + (button != null ? button.hashCode() : 0);
        }

        @k
        public String toString() {
            return "GalleryItem(image=" + this.image + ", badge=" + this.badge + ", title=" + this.title + ", subtitle=" + this.subtitle + ", button=" + this.button + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            Badge badge = this.badge;
            if (badge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badge.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.title, flags);
            parcel.writeParcelable(this.subtitle, flags);
            parcel.writeParcelable(this.button, flags);
        }
    }

    /* compiled from: GalleryHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "backgroundColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("color")
        @l
        private final UniversalColor color;

        /* compiled from: GalleryHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Icon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon createFromParcel(@k Parcel parcel) {
                return new Icon((UniversalColor) parcel.readParcelable(Icon.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Icon.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@l UniversalColor universalColor, @l UniversalColor universalColor2) {
            this.color = universalColor;
            this.backgroundColor = universalColor2;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = icon.color;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = icon.backgroundColor;
            }
            return icon.copy(universalColor, universalColor2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final Icon copy(@l UniversalColor color, @l UniversalColor backgroundColor) {
            return new Icon(color, backgroundColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return L.f(this.color, icon.color) && L.f(this.backgroundColor, icon.backgroundColor);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        public int hashCode() {
            UniversalColor universalColor = this.color;
            int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
            UniversalColor universalColor2 = this.backgroundColor;
            return iHashCode + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(color=");
            sb2.append(this.color);
            sb2.append(", backgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.color, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
        }
    }

    /* compiled from: GalleryHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$InactiveButton;", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Button;", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "backgroundColor", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;", "icon", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "()Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;)Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$InactiveButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackgroundColor", "Lcom/avito/android/remote/model/gallery/GalleryHeaderWidget$Icon;", "getIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InactiveButton implements Button {

        @k
        public static final Parcelable.Creator<InactiveButton> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("icon")
        @l
        private final Icon icon;

        @c("text")
        @k
        private final String text;

        @c("textColor")
        @l
        private final UniversalColor textColor;

        /* compiled from: GalleryHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InactiveButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InactiveButton createFromParcel(@k Parcel parcel) {
                return new InactiveButton(parcel.readString(), (UniversalColor) parcel.readParcelable(InactiveButton.class.getClassLoader()), (UniversalColor) parcel.readParcelable(InactiveButton.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InactiveButton[] newArray(int i12) {
                return new InactiveButton[i12];
            }
        }

        public InactiveButton(@k String str, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l Icon icon) {
            this.text = str;
            this.textColor = universalColor;
            this.backgroundColor = universalColor2;
            this.icon = icon;
        }

        public static /* synthetic */ InactiveButton copy$default(InactiveButton inactiveButton, String str, UniversalColor universalColor, UniversalColor universalColor2, Icon icon, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inactiveButton.text;
            }
            if ((i12 & 2) != 0) {
                universalColor = inactiveButton.textColor;
            }
            if ((i12 & 4) != 0) {
                universalColor2 = inactiveButton.backgroundColor;
            }
            if ((i12 & 8) != 0) {
                icon = inactiveButton.icon;
            }
            return inactiveButton.copy(str, universalColor, universalColor2, icon);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @k
        public final InactiveButton copy(@k String text, @l UniversalColor textColor, @l UniversalColor backgroundColor, @l Icon icon) {
            return new InactiveButton(text, textColor, backgroundColor, icon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InactiveButton)) {
                return false;
            }
            InactiveButton inactiveButton = (InactiveButton) other;
            return L.f(this.text, inactiveButton.text) && L.f(this.textColor, inactiveButton.textColor) && L.f(this.backgroundColor, inactiveButton.backgroundColor) && L.f(this.icon, inactiveButton.icon);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final Icon getIcon() {
            return this.icon;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            UniversalColor universalColor = this.textColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.backgroundColor;
            int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
            Icon icon = this.icon;
            return iHashCode3 + (icon != null ? icon.hashCode() : 0);
        }

        @k
        public String toString() {
            return "InactiveButton(text=" + this.text + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
            Icon icon = this.icon;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, flags);
            }
        }
    }

    public GalleryHeaderWidget(@l AttributedText attributedText, @k List<GalleryItem> list, @l UniversalColor universalColor, @l ToolbarConfig toolbarConfig, @l Analytics analytics, @l Settings settings) {
        this.title = attributedText;
        this.galleryItems = list;
        this.backgroundColor = universalColor;
        this.toolbarConfig = toolbarConfig;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ GalleryHeaderWidget copy$default(GalleryHeaderWidget galleryHeaderWidget, AttributedText attributedText, List list, UniversalColor universalColor, ToolbarConfig toolbarConfig, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = galleryHeaderWidget.title;
        }
        if ((i12 & 2) != 0) {
            list = galleryHeaderWidget.galleryItems;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            universalColor = galleryHeaderWidget.backgroundColor;
        }
        UniversalColor universalColor2 = universalColor;
        if ((i12 & 8) != 0) {
            toolbarConfig = galleryHeaderWidget.toolbarConfig;
        }
        ToolbarConfig toolbarConfig2 = toolbarConfig;
        if ((i12 & 16) != 0) {
            analytics = galleryHeaderWidget.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i12 & 32) != 0) {
            settings = galleryHeaderWidget.settings;
        }
        return galleryHeaderWidget.copy(attributedText, list2, universalColor2, toolbarConfig2, analytics2, settings);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    public final List<GalleryItem> component2() {
        return this.galleryItems;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final GalleryHeaderWidget copy(@l AttributedText title, @k List<GalleryItem> galleryItems, @l UniversalColor backgroundColor, @l ToolbarConfig toolbarConfig, @l Analytics analytics, @l Settings settings) {
        return new GalleryHeaderWidget(title, galleryItems, backgroundColor, toolbarConfig, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryHeaderWidget)) {
            return false;
        }
        GalleryHeaderWidget galleryHeaderWidget = (GalleryHeaderWidget) other;
        return L.f(this.title, galleryHeaderWidget.title) && L.f(this.galleryItems, galleryHeaderWidget.galleryItems) && L.f(this.backgroundColor, galleryHeaderWidget.backgroundColor) && L.f(this.toolbarConfig, galleryHeaderWidget.toolbarConfig) && L.f(this.analytics, galleryHeaderWidget.analytics) && L.f(this.settings, galleryHeaderWidget.settings);
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

    @k
    public final List<GalleryItem> getGalleryItems() {
        return this.galleryItems;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
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
        int iE2 = H.e((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.galleryItems);
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode = (iE2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        int iHashCode2 = (iHashCode + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode3 = (iHashCode2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode3 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("GalleryHeaderWidget(title=");
        sb2.append(this.title);
        sb2.append(", galleryItems=");
        sb2.append(this.galleryItems);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", toolbarConfig=");
        sb2.append(this.toolbarConfig);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        Iterator itJ = C0.j(this.galleryItems, parcel);
        while (itJ.hasNext()) {
            ((GalleryItem) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.backgroundColor, flags);
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        if (toolbarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarConfig.writeToParcel(parcel, flags);
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

    public /* synthetic */ GalleryHeaderWidget(AttributedText attributedText, List list, UniversalColor universalColor, ToolbarConfig toolbarConfig, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, list, universalColor, toolbarConfig, (i12 & 16) != 0 ? null : analytics, (i12 & 32) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
