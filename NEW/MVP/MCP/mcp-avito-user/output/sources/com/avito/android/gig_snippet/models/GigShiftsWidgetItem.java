package com.avito.android.gig_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigShiftsWidgetItem.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/gig_snippet/models/GigShiftsWidgetItem;", "Lcom/avito/android/remote/model/SerpElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", TooltipAttribute.PARAM_DEEP_LINK, "", "Lcom/avito/android/gig_snippet/models/GigShiftsWidgetSlot;", "slots", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "_avito_gig_snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftsWidgetItem implements SerpElement, Parcelable, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<GigShiftsWidgetItem> CREATOR = new a();

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public transient long f161073b;

    @c("settings")
    @l
    private Settings settings;

    @c("slots")
    @k
    private final List<GigShiftsWidgetSlot> slots;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final String uri;

    /* compiled from: GigShiftsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftsWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(GigShiftsWidgetSlot.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GigShiftsWidgetItem(string, string2, arrayList, (Analytics) parcel.readParcelable(GigShiftsWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(GigShiftsWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsWidgetItem[] newArray(int i12) {
            return new GigShiftsWidgetItem[i12];
        }
    }

    public GigShiftsWidgetItem(@k String str, @l String str2, @k List<GigShiftsWidgetSlot> list, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.uri = str2;
        this.slots = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    @k
    public final List<GigShiftsWidgetSlot> c() {
        return this.slots;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF161073b() {
        return this.f161073b;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f161073b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.uri);
        Iterator itJ = C0.j(this.slots, parcel);
        while (itJ.hasNext()) {
            ((GigShiftsWidgetSlot) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ GigShiftsWidgetItem(String str, String str2, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? null : analytics, (i12 & 16) != 0 ? null : settings);
    }
}
