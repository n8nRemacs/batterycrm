package com.avito.android.horizontal_list.widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HorizontalListWidgetNetworkModel.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)BM\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/avito/android/horizontal_list/widget/HorizontalListWidgetNetworkModel;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "Lcom/avito/android/horizontal_list/widget/HorizontalListWidgetListItemNetworkModel;", "horizontalListWidgetListItems", "", "title", "Lcom/avito/android/horizontal_list/widget/HorizontalWidgetType;", "type", "", "isRedesignAb", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/horizontal_list/widget/HorizontalWidgetType;ZLcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/horizontal_list/widget/HorizontalWidgetType;", "d", "()Lcom/avito/android/horizontal_list/widget/HorizontalWidgetType;", "Z", "e", "()Z", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalListWidgetNetworkModel implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<HorizontalListWidgetNetworkModel> CREATOR;

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f162603b;

    @c("list")
    @k
    private final List<HorizontalListWidgetListItemNetworkModel> horizontalListWidgetListItems;

    @c("isRedesignAb")
    private final boolean isRedesignAb;

    @c("settings")
    @l
    private Settings settings;

    @c("titleText")
    @l
    private final String title;

    @c("type")
    @l
    private final HorizontalWidgetType type;

    /* compiled from: HorizontalListWidgetNetworkModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/horizontal_list/widget/HorizontalListWidgetNetworkModel$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HorizontalListWidgetNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<HorizontalListWidgetNetworkModel> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalListWidgetNetworkModel createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(HorizontalListWidgetListItemNetworkModel.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new HorizontalListWidgetNetworkModel(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : HorizontalWidgetType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Analytics) parcel.readParcelable(HorizontalListWidgetNetworkModel.class.getClassLoader()), (Settings) parcel.readParcelable(HorizontalListWidgetNetworkModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalListWidgetNetworkModel[] newArray(int i12) {
            return new HorizontalListWidgetNetworkModel[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public HorizontalListWidgetNetworkModel(@k List<HorizontalListWidgetListItemNetworkModel> list, @l String str, @l HorizontalWidgetType horizontalWidgetType, boolean z12, @l Analytics analytics, @l Settings settings) {
        this.horizontalListWidgetListItems = list;
        this.title = str;
        this.type = horizontalWidgetType;
        this.isRedesignAb = z12;
        this.analytics = analytics;
        this.settings = settings;
    }

    @k
    public final List<HorizontalListWidgetListItemNetworkModel> c() {
        return this.horizontalListWidgetListItems;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final HorizontalWidgetType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsRedesignAb() {
        return this.isRedesignAb;
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

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF162603b() {
        return this.f162603b;
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
        this.f162603b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.horizontalListWidgetListItems, parcel);
        while (itJ.hasNext()) {
            ((HorizontalListWidgetListItemNetworkModel) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.title);
        HorizontalWidgetType horizontalWidgetType = this.type;
        if (horizontalWidgetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalWidgetType.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.isRedesignAb ? 1 : 0);
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ HorizontalListWidgetNetworkModel(List list, String str, HorizontalWidgetType horizontalWidgetType, boolean z12, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(list, str, (i12 & 4) != 0 ? null : horizontalWidgetType, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : analytics, (i12 & 32) != 0 ? null : settings);
    }
}
