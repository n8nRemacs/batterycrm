package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AttributedHeaderWidget.kt */
@d
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B3\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u000eR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u00102R(\u00104\u001a\u0002038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/AttributedHeaderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component4", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/AttributedHeaderWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AttributedHeaderWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<AttributedHeaderWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c("description")
    @l
    private final AttributedText description;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @l
    private final AttributedText title;
    private long uniqueId;

    /* compiled from: AttributedHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AttributedHeaderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttributedHeaderWidget createFromParcel(@k Parcel parcel) {
            return new AttributedHeaderWidget((AttributedText) parcel.readParcelable(AttributedHeaderWidget.class.getClassLoader()), (AttributedText) parcel.readParcelable(AttributedHeaderWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttributedHeaderWidget[] newArray(int i12) {
            return new AttributedHeaderWidget[i12];
        }
    }

    public AttributedHeaderWidget(@l AttributedText attributedText, @l AttributedText attributedText2, @l Analytics analytics, @l Settings settings) {
        this.title = attributedText;
        this.description = attributedText2;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ AttributedHeaderWidget copy$default(AttributedHeaderWidget attributedHeaderWidget, AttributedText attributedText, AttributedText attributedText2, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = attributedHeaderWidget.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = attributedHeaderWidget.description;
        }
        if ((i12 & 4) != 0) {
            analytics = attributedHeaderWidget.analytics;
        }
        if ((i12 & 8) != 0) {
            settings = attributedHeaderWidget.settings;
        }
        return attributedHeaderWidget.copy(attributedText, attributedText2, analytics, settings);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
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
    public final AttributedHeaderWidget copy(@l AttributedText title, @l AttributedText description, @l Analytics analytics, @l Settings settings) {
        return new AttributedHeaderWidget(title, description, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributedHeaderWidget)) {
            return false;
        }
        AttributedHeaderWidget attributedHeaderWidget = (AttributedHeaderWidget) other;
        return L.f(this.title, attributedHeaderWidget.title) && L.f(this.description, attributedHeaderWidget.description) && L.f(this.analytics, attributedHeaderWidget.analytics) && L.f(this.settings, attributedHeaderWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
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

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
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
        StringBuilder sb2 = new StringBuilder("AttributedHeaderWidget(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.description, flags);
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

    public /* synthetic */ AttributedHeaderWidget(AttributedText attributedText, AttributedText attributedText2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, (i12 & 4) != 0 ? null : analytics, (i12 & 8) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
