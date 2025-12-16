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
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FeaturedWidget.kt */
@d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0099\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b1\u0010%R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b4\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010C\u001a\u00020B8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u0010J\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/FeaturedWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "displayType", "", "items", "Lcom/avito/android/remote/model/vertical_main/FeaturedAction;", "action", "type", "", "isRichSmallGallerySize", "additionalTabs", "Lcom/avito/android/remote/model/vertical_main/DisplayConfig;", "displayConfig", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/FeaturedAction;Ljava/lang/String;ZLjava/util/List;Lcom/avito/android/remote/model/vertical_main/DisplayConfig;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDisplayType", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/model/vertical_main/FeaturedAction;", "getAction", "()Lcom/avito/android/remote/model/vertical_main/FeaturedAction;", "getType", "Z", "()Z", "getAdditionalTabs", "Lcom/avito/android/remote/model/vertical_main/DisplayConfig;", "getDisplayConfig", "()Lcom/avito/android/remote/model/vertical_main/DisplayConfig;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeaturedWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<FeaturedWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final FeaturedAction action;

    @c("additionalTabs")
    @k
    private final List<FeaturedWidget> additionalTabs;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    @c("displayConfig")
    @l
    private final DisplayConfig displayConfig;

    @c("displayType")
    @l
    private final String displayType;

    @c("isRichSmallGallerySize")
    private final boolean isRichSmallGallerySize;

    @c("items")
    @k
    private final List<SerpElement> items;

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

    /* compiled from: FeaturedWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeaturedWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FeaturedWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FeaturedWidget.class.getClassLoader());
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(FeaturedWidget.class, parcel, arrayList, iL2, 1);
            }
            FeaturedAction featuredActionCreateFromParcel = parcel.readInt() == 0 ? null : FeaturedAction.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(FeaturedWidget.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new FeaturedWidget(string, string2, attributedText, string3, arrayList, featuredActionCreateFromParcel, string4, z12, arrayList2, parcel.readInt() == 0 ? null : DisplayConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FeaturedWidget[] newArray(int i12) {
            return new FeaturedWidget[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedWidget(@l String str, @l String str2, @l AttributedText attributedText, @l String str3, @k List<? extends SerpElement> list, @l FeaturedAction featuredAction, @l String str4, boolean z12, @k List<FeaturedWidget> list2, @l DisplayConfig displayConfig, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.subtitle = str2;
        this.attributedSubtitle = attributedText;
        this.displayType = str3;
        this.items = list;
        this.action = featuredAction;
        this.type = str4;
        this.isRichSmallGallerySize = z12;
        this.additionalTabs = list2;
        this.displayConfig = displayConfig;
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

    @k
    public final List<FeaturedWidget> getAdditionalTabs() {
        return this.additionalTabs;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final DisplayConfig getDisplayConfig() {
        return this.displayConfig;
    }

    @l
    public final String getDisplayType() {
        return this.displayType;
    }

    @k
    public final List<SerpElement> getItems() {
        return this.items;
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
        parcel.writeParcelable(this.attributedSubtitle, flags);
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
        parcel.writeString(this.type);
        parcel.writeInt(this.isRichSmallGallerySize ? 1 : 0);
        Iterator itJ2 = C0.j(this.additionalTabs, parcel);
        while (itJ2.hasNext()) {
            ((FeaturedWidget) itJ2.next()).writeToParcel(parcel, flags);
        }
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayConfig.writeToParcel(parcel, flags);
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

    public FeaturedWidget(String str, String str2, AttributedText attributedText, String str3, List list, FeaturedAction featuredAction, String str4, boolean z12, List list2, DisplayConfig displayConfig, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : attributedText, str3, (i12 & 16) != 0 ? C42784z0.f406748b : list, featuredAction, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? C42784z0.f406748b : list2, (i12 & 512) != 0 ? null : displayConfig, (i12 & 1024) != 0 ? null : analytics, (i12 & 2048) != 0 ? null : settings);
    }
}
