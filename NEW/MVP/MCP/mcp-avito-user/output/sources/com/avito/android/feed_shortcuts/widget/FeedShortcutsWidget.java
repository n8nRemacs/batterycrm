package com.avito.android.feed_shortcuts.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.feed_shortcuts.element.FeedShortcut;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FeedShortcutsWidget.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB/\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "Lcom/avito/android/feed_shortcuts/element/FeedShortcut;", "elements", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_feed-shortcuts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedShortcutsWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @Y61.k
    public static final Parcelable.Creator<FeedShortcutsWidget> CREATOR;

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f157691b;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<FeedShortcut> elements;

    @com.google.gson.annotations.c("settings")
    @Y61.l
    private Settings settings;

    /* compiled from: FeedShortcutsWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_feed-shortcuts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FeedShortcutsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FeedShortcutsWidget> {
        @Override // android.os.Parcelable.Creator
        public final FeedShortcutsWidget createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(FeedShortcut.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new FeedShortcutsWidget(arrayList, (Analytics) parcel.readParcelable(FeedShortcutsWidget.class.getClassLoader()), (Settings) parcel.readParcelable(FeedShortcutsWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeedShortcutsWidget[] newArray(int i12) {
            return new FeedShortcutsWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FeedShortcutsWidget(@Y61.l List<FeedShortcut> list, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.elements = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Y61.l
    public final List<FeedShortcut> c() {
        return this.elements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedShortcutsWidget)) {
            return false;
        }
        FeedShortcutsWidget feedShortcutsWidget = (FeedShortcutsWidget) obj;
        return L.f(this.elements, feedShortcutsWidget.elements) && L.f(this.analytics, feedShortcutsWidget.analytics) && L.f(this.settings, feedShortcutsWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @Y61.l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @Y61.l
    public final Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF157691b() {
        return this.f157691b;
    }

    public final int hashCode() {
        List<FeedShortcut> list = this.elements;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Analytics analytics = this.analytics;
        int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@Y61.l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@Y61.l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f157691b = j12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedShortcutsWidget(elements=");
        sb2.append(this.elements);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        List<FeedShortcut> list = this.elements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FeedShortcut) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ FeedShortcutsWidget(List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : analytics, (i12 & 4) != 0 ? null : settings);
    }
}
