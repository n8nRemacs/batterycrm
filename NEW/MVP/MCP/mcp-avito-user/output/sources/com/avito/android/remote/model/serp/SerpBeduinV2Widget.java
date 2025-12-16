package com.avito.android.remote.model.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SerpBeduinV2Widget.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B3\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u00103R(\u00105\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/serp/SerpBeduinV2Widget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/BeduinV2;", "beduinV2", "", "id", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/BeduinV2;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/BeduinV2;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component4", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/BeduinV2;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/serp/SerpBeduinV2Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/BeduinV2;", "getBeduinV2", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SerpBeduinV2Widget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<SerpBeduinV2Widget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c("freeForm")
    @l
    private final BeduinV2 beduinV2;

    @c("formId")
    @l
    private final String id;

    @c("settings")
    @l
    private Settings settings;
    private long uniqueId;

    /* compiled from: SerpBeduinV2Widget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpBeduinV2Widget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBeduinV2Widget createFromParcel(@k Parcel parcel) {
            return new SerpBeduinV2Widget(parcel.readInt() == 0 ? null : BeduinV2.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBeduinV2Widget[] newArray(int i12) {
            return new SerpBeduinV2Widget[i12];
        }
    }

    public SerpBeduinV2Widget(@l BeduinV2 beduinV2, @l String str, @l Analytics analytics, @l Settings settings) {
        this.beduinV2 = beduinV2;
        this.id = str;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ SerpBeduinV2Widget copy$default(SerpBeduinV2Widget serpBeduinV2Widget, BeduinV2 beduinV2, String str, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinV2 = serpBeduinV2Widget.beduinV2;
        }
        if ((i12 & 2) != 0) {
            str = serpBeduinV2Widget.id;
        }
        if ((i12 & 4) != 0) {
            analytics = serpBeduinV2Widget.analytics;
        }
        if ((i12 & 8) != 0) {
            settings = serpBeduinV2Widget.settings;
        }
        return serpBeduinV2Widget.copy(beduinV2, str, analytics, settings);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BeduinV2 getBeduinV2() {
        return this.beduinV2;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final SerpBeduinV2Widget copy(@l BeduinV2 beduinV2, @l String id2, @l Analytics analytics, @l Settings settings) {
        return new SerpBeduinV2Widget(beduinV2, id2, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerpBeduinV2Widget)) {
            return false;
        }
        SerpBeduinV2Widget serpBeduinV2Widget = (SerpBeduinV2Widget) other;
        return L.f(this.beduinV2, serpBeduinV2Widget.beduinV2) && L.f(this.id, serpBeduinV2Widget.id) && L.f(this.analytics, serpBeduinV2Widget.analytics) && L.f(this.settings, serpBeduinV2Widget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final BeduinV2 getBeduinV2() {
        return this.beduinV2;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        BeduinV2 beduinV2 = this.beduinV2;
        int iHashCode = (beduinV2 == null ? 0 : beduinV2.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
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
        StringBuilder sb2 = new StringBuilder("SerpBeduinV2Widget(beduinV2=");
        sb2.append(this.beduinV2);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        BeduinV2 beduinV2 = this.beduinV2;
        if (beduinV2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinV2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.id);
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

    public /* synthetic */ SerpBeduinV2Widget(BeduinV2 beduinV2, String str, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(beduinV2, str, (i12 & 4) != 0 ? null : analytics, (i12 & 8) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
