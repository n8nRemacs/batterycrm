package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.HeaderToolbarElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MiniSearchWidget.kt */
@d
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BQ\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b!\u0010\"Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020(HÖ\u0001¢\u0006\u0004\b/\u0010*J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020(HÖ\u0001¢\u0006\u0004\b4\u00105R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010\u001eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010 \"\u0004\bB\u0010CR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010GR(\u0010I\u001a\u00020H8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010P\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/MiniSearchWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/HeaderToolbarElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;", "action", "", "showInHeaderToolbar", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;", "recentSearches", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;ZLcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;", "component3", "()Z", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;", "component6", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component7", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;ZLcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/vertical_main/MiniSearchWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;", "getAction", "Z", "getShowInHeaderToolbar", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetRecentSearchesDto;", "getRecentSearches", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MiniSearchWidget implements SerpElement, AnalyticsElement, HeaderToolbarElement, SettingsElement {

    @k
    public static final Parcelable.Creator<MiniSearchWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final MiniSearchWidgetAction action;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("image")
    @l
    private final UniversalImage image;

    @c("recentSearches")
    @l
    private final MiniSearchWidgetRecentSearchesDto recentSearches;

    @c("settings")
    @l
    private Settings settings;

    @c("headerToolbar")
    private final boolean showInHeaderToolbar;

    @c("title")
    @l
    private final AttributedText title;
    private long uniqueId;

    /* compiled from: MiniSearchWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniSearchWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniSearchWidget createFromParcel(@k Parcel parcel) {
            return new MiniSearchWidget((AttributedText) parcel.readParcelable(MiniSearchWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : MiniSearchWidgetAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (UniversalImage) parcel.readParcelable(MiniSearchWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : MiniSearchWidgetRecentSearchesDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniSearchWidget[] newArray(int i12) {
            return new MiniSearchWidget[i12];
        }
    }

    public MiniSearchWidget(@l AttributedText attributedText, @l MiniSearchWidgetAction miniSearchWidgetAction, boolean z12, @l UniversalImage universalImage, @l MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto, @l Analytics analytics, @l Settings settings) {
        this.title = attributedText;
        this.action = miniSearchWidgetAction;
        this.showInHeaderToolbar = z12;
        this.image = universalImage;
        this.recentSearches = miniSearchWidgetRecentSearchesDto;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ MiniSearchWidget copy$default(MiniSearchWidget miniSearchWidget, AttributedText attributedText, MiniSearchWidgetAction miniSearchWidgetAction, boolean z12, UniversalImage universalImage, MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = miniSearchWidget.title;
        }
        if ((i12 & 2) != 0) {
            miniSearchWidgetAction = miniSearchWidget.action;
        }
        MiniSearchWidgetAction miniSearchWidgetAction2 = miniSearchWidgetAction;
        if ((i12 & 4) != 0) {
            z12 = miniSearchWidget.showInHeaderToolbar;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            universalImage = miniSearchWidget.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 16) != 0) {
            miniSearchWidgetRecentSearchesDto = miniSearchWidget.recentSearches;
        }
        MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto2 = miniSearchWidgetRecentSearchesDto;
        if ((i12 & 32) != 0) {
            analytics = miniSearchWidget.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i12 & 64) != 0) {
            settings = miniSearchWidget.settings;
        }
        return miniSearchWidget.copy(attributedText, miniSearchWidgetAction2, z13, universalImage2, miniSearchWidgetRecentSearchesDto2, analytics2, settings);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final MiniSearchWidgetAction getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowInHeaderToolbar() {
        return this.showInHeaderToolbar;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final MiniSearchWidgetRecentSearchesDto getRecentSearches() {
        return this.recentSearches;
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
    public final MiniSearchWidget copy(@l AttributedText title, @l MiniSearchWidgetAction action, boolean showInHeaderToolbar, @l UniversalImage image, @l MiniSearchWidgetRecentSearchesDto recentSearches, @l Analytics analytics, @l Settings settings) {
        return new MiniSearchWidget(title, action, showInHeaderToolbar, image, recentSearches, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniSearchWidget)) {
            return false;
        }
        MiniSearchWidget miniSearchWidget = (MiniSearchWidget) other;
        return L.f(this.title, miniSearchWidget.title) && L.f(this.action, miniSearchWidget.action) && this.showInHeaderToolbar == miniSearchWidget.showInHeaderToolbar && L.f(this.image, miniSearchWidget.image) && L.f(this.recentSearches, miniSearchWidget.recentSearches) && L.f(this.analytics, miniSearchWidget.analytics) && L.f(this.settings, miniSearchWidget.settings);
    }

    @l
    public final MiniSearchWidgetAction getAction() {
        return this.action;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final MiniSearchWidgetRecentSearchesDto getRecentSearches() {
        return this.recentSearches;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.HeaderToolbarElement
    public boolean getShowInHeaderToolbar() {
        return this.showInHeaderToolbar;
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
        MiniSearchWidgetAction miniSearchWidgetAction = this.action;
        int i12 = r.i((iHashCode + (miniSearchWidgetAction == null ? 0 : miniSearchWidgetAction.hashCode())) * 31, 31, this.showInHeaderToolbar);
        UniversalImage universalImage = this.image;
        int iHashCode2 = (i12 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto = this.recentSearches;
        int iHashCode3 = (iHashCode2 + (miniSearchWidgetRecentSearchesDto == null ? 0 : miniSearchWidgetRecentSearchesDto.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode4 = (iHashCode3 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode4 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("MiniSearchWidget(title=");
        sb2.append(this.title);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", showInHeaderToolbar=");
        sb2.append(this.showInHeaderToolbar);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", recentSearches=");
        sb2.append(this.recentSearches);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        MiniSearchWidgetAction miniSearchWidgetAction = this.action;
        if (miniSearchWidgetAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            miniSearchWidgetAction.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.showInHeaderToolbar ? 1 : 0);
        parcel.writeParcelable(this.image, flags);
        MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto = this.recentSearches;
        if (miniSearchWidgetRecentSearchesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            miniSearchWidgetRecentSearchesDto.writeToParcel(parcel, flags);
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

    public /* synthetic */ MiniSearchWidget(AttributedText attributedText, MiniSearchWidgetAction miniSearchWidgetAction, boolean z12, UniversalImage universalImage, MiniSearchWidgetRecentSearchesDto miniSearchWidgetRecentSearchesDto, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, miniSearchWidgetAction, (i12 & 4) != 0 ? false : z12, universalImage, miniSearchWidgetRecentSearchesDto, (i12 & 32) != 0 ? null : analytics, (i12 & 64) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
