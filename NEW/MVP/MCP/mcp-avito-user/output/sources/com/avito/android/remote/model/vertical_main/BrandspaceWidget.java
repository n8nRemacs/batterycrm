package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BrandspaceWidget.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0091\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010$R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b1\u0010$R\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010B\u001a\u00020A8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010I\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/BrandspaceWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "subtitle", "", "promoEnabled", "displayType", "", "items", "Lcom/avito/android/remote/model/vertical_main/FeaturedAction;", "action", "infoAction", "type", "isRichSmallGallerySize", "Lcom/avito/android/remote/model/UniversalImage;", "logo", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/FeaturedAction;Lcom/avito/android/remote/model/vertical_main/FeaturedAction;Ljava/lang/String;ZLcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/lang/Boolean;", "getPromoEnabled", "()Ljava/lang/Boolean;", "getDisplayType", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/model/vertical_main/FeaturedAction;", "getAction", "()Lcom/avito/android/remote/model/vertical_main/FeaturedAction;", "getInfoAction", "getType", "Z", "()Z", "Lcom/avito/android/remote/model/UniversalImage;", "getLogo", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BrandspaceWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<BrandspaceWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final FeaturedAction action;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("displayType")
    @l
    private final String displayType;

    @c("infoAction")
    @l
    private final FeaturedAction infoAction;

    @c("isRichSmallGallerySize")
    private final boolean isRichSmallGallerySize;

    @c("items")
    @k
    private final List<SerpElement> items;

    @c("logo")
    @l
    private final UniversalImage logo;

    @c("promoEnabled")
    @l
    private final Boolean promoEnabled;

    @c("settings")
    @l
    private Settings settings;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final String type;
    private long uniqueId;

    /* compiled from: BrandspaceWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BrandspaceWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandspaceWidget createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(BrandspaceWidget.class, parcel, arrayList, iL2, 1);
            }
            return new BrandspaceWidget(string, string2, boolValueOf, string3, arrayList, parcel.readInt() == 0 ? null : FeaturedAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FeaturedAction.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, (UniversalImage) parcel.readParcelable(BrandspaceWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandspaceWidget[] newArray(int i12) {
            return new BrandspaceWidget[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrandspaceWidget(@l String str, @l String str2, @l Boolean bool, @l String str3, @k List<? extends SerpElement> list, @l FeaturedAction featuredAction, @l FeaturedAction featuredAction2, @l String str4, boolean z12, @l UniversalImage universalImage, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.subtitle = str2;
        this.promoEnabled = bool;
        this.displayType = str3;
        this.items = list;
        this.action = featuredAction;
        this.infoAction = featuredAction2;
        this.type = str4;
        this.isRichSmallGallerySize = z12;
        this.logo = universalImage;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final FeaturedAction getAction() {
        return this.action;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final String getDisplayType() {
        return this.displayType;
    }

    @l
    public final FeaturedAction getInfoAction() {
        return this.infoAction;
    }

    @k
    public final List<SerpElement> getItems() {
        return this.items;
    }

    @l
    public final UniversalImage getLogo() {
        return this.logo;
    }

    @l
    public final Boolean getPromoEnabled() {
        return this.promoEnabled;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: isRichSmallGallerySize, reason: from getter */
    public final boolean getIsRichSmallGallerySize() {
        return this.isRichSmallGallerySize;
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

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool = this.promoEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.displayType);
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        FeaturedAction featuredAction = this.action;
        if (featuredAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featuredAction.writeToParcel(parcel, flags);
        }
        FeaturedAction featuredAction2 = this.infoAction;
        if (featuredAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featuredAction2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.type);
        parcel.writeInt(this.isRichSmallGallerySize ? 1 : 0);
        parcel.writeParcelable(this.logo, flags);
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

    public BrandspaceWidget(String str, String str2, Boolean bool, String str3, List list, FeaturedAction featuredAction, FeaturedAction featuredAction2, String str4, boolean z12, UniversalImage universalImage, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : bool, str3, (i12 & 16) != 0 ? C42784z0.f406748b : list, featuredAction, featuredAction2, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? false : z12, universalImage, (i12 & 1024) != 0 ? null : analytics, (i12 & 2048) != 0 ? null : settings);
    }
}
