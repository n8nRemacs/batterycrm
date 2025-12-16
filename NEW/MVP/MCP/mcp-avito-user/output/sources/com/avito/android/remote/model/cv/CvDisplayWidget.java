package com.avito.android.remote.model.cv;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvDisplayWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010-\u001a\u00020,8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/cv/CvDisplayWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "Lcom/avito/android/remote/model/cv/CvSnippet;", "item", "Lcom/avito/android/remote/model/cv/CvDisplayAction;", "action", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/cv/CvSnippet;Lcom/avito/android/remote/model/cv/CvDisplayAction;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/cv/CvSnippet;", "getItem", "()Lcom/avito/android/remote/model/cv/CvSnippet;", "Lcom/avito/android/remote/model/cv/CvDisplayAction;", "getAction", "()Lcom/avito/android/remote/model/cv/CvDisplayAction;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvDisplayWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<CvDisplayWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final CvDisplayAction action;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("item")
    @k
    private final CvSnippet item;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @k
    private final String title;
    private long uniqueId;

    /* compiled from: CvDisplayWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvDisplayWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvDisplayWidget createFromParcel(@k Parcel parcel) {
            return new CvDisplayWidget(parcel.readString(), CvSnippet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CvDisplayAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvDisplayWidget[] newArray(int i12) {
            return new CvDisplayWidget[i12];
        }
    }

    public CvDisplayWidget(@k String str, @k CvSnippet cvSnippet, @l CvDisplayAction cvDisplayAction, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.item = cvSnippet;
        this.action = cvDisplayAction;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final CvDisplayAction getAction() {
        return this.action;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final CvSnippet getItem() {
        return this.item;
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
        this.item.writeToParcel(parcel, flags);
        CvDisplayAction cvDisplayAction = this.action;
        if (cvDisplayAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvDisplayAction.writeToParcel(parcel, flags);
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

    public /* synthetic */ CvDisplayWidget(String str, CvSnippet cvSnippet, CvDisplayAction cvDisplayAction, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, cvSnippet, cvDisplayAction, (i12 & 8) != 0 ? null : analytics, (i12 & 16) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
