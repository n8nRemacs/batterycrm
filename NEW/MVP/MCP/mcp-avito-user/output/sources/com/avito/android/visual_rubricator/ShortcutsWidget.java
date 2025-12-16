package com.avito.android.visual_rubricator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
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

/* compiled from: ShortcutsWidget.kt */
@K51.d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB;\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/visual_rubricator/ShortcutsWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "Lcom/avito/android/visual_rubricator/VisualShortcut;", "items", "", "isScrollable", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShortcutsWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @Y61.k
    public static final Parcelable.Creator<ShortcutsWidget> CREATOR;

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f327295b;

    @com.google.gson.annotations.c("isScrollable")
    @Y61.l
    private final Boolean isScrollable;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<VisualShortcut> items;

    @com.google.gson.annotations.c("settings")
    @Y61.l
    private Settings settings;

    /* compiled from: ShortcutsWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/visual_rubricator/ShortcutsWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ShortcutsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ShortcutsWidget> {
        @Override // android.os.Parcelable.Creator
        public final ShortcutsWidget createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(VisualShortcut.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortcutsWidget(arrayList, boolValueOf, (Analytics) parcel.readParcelable(ShortcutsWidget.class.getClassLoader()), (Settings) parcel.readParcelable(ShortcutsWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortcutsWidget[] newArray(int i12) {
            return new ShortcutsWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ShortcutsWidget(@Y61.l List<VisualShortcut> list, @Y61.l Boolean bool, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.items = list;
        this.isScrollable = bool;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsScrollable() {
        return this.isScrollable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @Y61.l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Y61.l
    public final List<VisualShortcut> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @Y61.l
    public final Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF268995d() {
        return this.f327295b;
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
        this.f327295b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        List<VisualShortcut> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((VisualShortcut) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this.isScrollable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ ShortcutsWidget(List list, Boolean bool, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : analytics, (i12 & 8) != 0 ? null : settings);
    }
}
