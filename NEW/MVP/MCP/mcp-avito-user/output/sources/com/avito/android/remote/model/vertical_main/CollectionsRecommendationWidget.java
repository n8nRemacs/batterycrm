package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CollectionsRecommendationWidget.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002DEB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u00106R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010:R(\u0010<\u001a\u00020;8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010C\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;", "badgeInfo", "", "Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$CollectionItem;", "items", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component5", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;", "getBadgeInfo", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "BadgeInfo", "CollectionItem", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CollectionsRecommendationWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<CollectionsRecommendationWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c("badge")
    @l
    private final BadgeInfo badgeInfo;

    @c("items")
    @k
    private final List<CollectionItem> items;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @k
    private final String title;
    private long uniqueId;

    /* compiled from: CollectionsRecommendationWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$BadgeInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BadgeInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<BadgeInfo> CREATOR = new Creator();

        @c("preset")
        @k
        private final String style;

        @c("text")
        @k
        private final String text;

        /* compiled from: CollectionsRecommendationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BadgeInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BadgeInfo createFromParcel(@k Parcel parcel) {
                return new BadgeInfo(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BadgeInfo[] newArray(int i12) {
                return new BadgeInfo[i12];
            }
        }

        public BadgeInfo(@k String str, @k String str2) {
            this.text = str;
            this.style = str2;
        }

        public static /* synthetic */ BadgeInfo copy$default(BadgeInfo badgeInfo, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = badgeInfo.text;
            }
            if ((i12 & 2) != 0) {
                str2 = badgeInfo.style;
            }
            return badgeInfo.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final BadgeInfo copy(@k String text, @k String style) {
            return new BadgeInfo(text, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeInfo)) {
                return false;
            }
            BadgeInfo badgeInfo = (BadgeInfo) other;
            return L.f(this.text, badgeInfo.text) && L.f(this.style, badgeInfo.style);
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.style.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BadgeInfo(text=");
            sb2.append(this.text);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.style);
        }
    }

    /* compiled from: CollectionsRecommendationWidget.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$CollectionItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/vertical_main/CollectionsRecommendationWidget$CollectionItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/Image;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollectionItem implements Parcelable {

        @k
        public static final Parcelable.Creator<CollectionItem> CREATOR = new Creator();

        @c(ContextActionHandler.Link.URL)
        @k
        private final DeepLink deepLink;

        @c("image")
        @l
        private final Image image;

        @c("title")
        @k
        private final String title;

        /* compiled from: CollectionsRecommendationWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CollectionItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CollectionItem createFromParcel(@k Parcel parcel) {
                return new CollectionItem(parcel.readString(), (DeepLink) parcel.readParcelable(CollectionItem.class.getClassLoader()), (Image) parcel.readParcelable(CollectionItem.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final CollectionItem[] newArray(int i12) {
                return new CollectionItem[i12];
            }
        }

        public CollectionItem(@k String str, @k DeepLink deepLink, @l Image image) {
            this.title = str;
            this.deepLink = deepLink;
            this.image = image;
        }

        public static /* synthetic */ CollectionItem copy$default(CollectionItem collectionItem, String str, DeepLink deepLink, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = collectionItem.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = collectionItem.deepLink;
            }
            if ((i12 & 4) != 0) {
                image = collectionItem.image;
            }
            return collectionItem.copy(str, deepLink, image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final CollectionItem copy(@k String title, @k DeepLink deepLink, @l Image image) {
            return new CollectionItem(title, deepLink, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CollectionItem)) {
                return false;
            }
            CollectionItem collectionItem = (CollectionItem) other;
            return L.f(this.title, collectionItem.title) && L.f(this.deepLink, collectionItem.deepLink) && L.f(this.image, collectionItem.image);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iE2 = a.e(this.deepLink, this.title.hashCode() * 31, 31);
            Image image = this.image;
            return iE2 + (image == null ? 0 : image.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CollectionItem(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", image=");
            return AK.c.o(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: CollectionsRecommendationWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CollectionsRecommendationWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CollectionsRecommendationWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            BadgeInfo badgeInfoCreateFromParcel = parcel.readInt() == 0 ? null : BadgeInfo.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(CollectionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CollectionsRecommendationWidget(string, badgeInfoCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CollectionsRecommendationWidget[] newArray(int i12) {
            return new CollectionsRecommendationWidget[i12];
        }
    }

    public CollectionsRecommendationWidget(@k String str, @l BadgeInfo badgeInfo, @k List<CollectionItem> list, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.badgeInfo = badgeInfo;
        this.items = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ CollectionsRecommendationWidget copy$default(CollectionsRecommendationWidget collectionsRecommendationWidget, String str, BadgeInfo badgeInfo, List list, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = collectionsRecommendationWidget.title;
        }
        if ((i12 & 2) != 0) {
            badgeInfo = collectionsRecommendationWidget.badgeInfo;
        }
        BadgeInfo badgeInfo2 = badgeInfo;
        if ((i12 & 4) != 0) {
            list = collectionsRecommendationWidget.items;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            analytics = collectionsRecommendationWidget.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i12 & 16) != 0) {
            settings = collectionsRecommendationWidget.settings;
        }
        return collectionsRecommendationWidget.copy(str, badgeInfo2, list2, analytics2, settings);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BadgeInfo getBadgeInfo() {
        return this.badgeInfo;
    }

    @k
    public final List<CollectionItem> component3() {
        return this.items;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final CollectionsRecommendationWidget copy(@k String title, @l BadgeInfo badgeInfo, @k List<CollectionItem> items, @l Analytics analytics, @l Settings settings) {
        return new CollectionsRecommendationWidget(title, badgeInfo, items, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionsRecommendationWidget)) {
            return false;
        }
        CollectionsRecommendationWidget collectionsRecommendationWidget = (CollectionsRecommendationWidget) other;
        return L.f(this.title, collectionsRecommendationWidget.title) && L.f(this.badgeInfo, collectionsRecommendationWidget.badgeInfo) && L.f(this.items, collectionsRecommendationWidget.items) && L.f(this.analytics, collectionsRecommendationWidget.analytics) && L.f(this.settings, collectionsRecommendationWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final BadgeInfo getBadgeInfo() {
        return this.badgeInfo;
    }

    @k
    public final List<CollectionItem> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        BadgeInfo badgeInfo = this.badgeInfo;
        int iE2 = H.e((iHashCode + (badgeInfo == null ? 0 : badgeInfo.hashCode())) * 31, 31, this.items);
        Analytics analytics = this.analytics;
        int iHashCode2 = (iE2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("CollectionsRecommendationWidget(title=");
        sb2.append(this.title);
        sb2.append(", badgeInfo=");
        sb2.append(this.badgeInfo);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        BadgeInfo badgeInfo = this.badgeInfo;
        if (badgeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeInfo.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((CollectionItem) itJ.next()).writeToParcel(parcel, flags);
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

    public /* synthetic */ CollectionsRecommendationWidget(String str, BadgeInfo badgeInfo, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, badgeInfo, list, (i12 & 8) != 0 ? null : analytics, (i12 & 16) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
