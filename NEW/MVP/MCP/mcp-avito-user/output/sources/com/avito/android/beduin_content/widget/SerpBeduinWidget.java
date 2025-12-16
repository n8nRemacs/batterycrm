package com.avito.android.beduin_content.widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinModel;
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
import kotlin.jvm.internal.L;

/* compiled from: SerpBeduinWidget.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB9\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/beduin_content/widget/SerpBeduinWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "Lcom/avito/android/beduin_models/BeduinModel;", "freeForm", "", "id", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/util/List;", "getFreeForm", "()Ljava/util/List;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SerpBeduinWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<SerpBeduinWidget> CREATOR;

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f105229b;

    @c("freeForm")
    @l
    private final List<BeduinModel> freeForm;

    @c("formId")
    @l
    private final String id;

    @c("settings")
    @l
    private Settings settings;

    /* compiled from: SerpBeduinWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin_content/widget/SerpBeduinWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SerpBeduinWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SerpBeduinWidget> {
        @Override // android.os.Parcelable.Creator
        public final SerpBeduinWidget createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SerpBeduinWidget.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new SerpBeduinWidget(arrayList, parcel.readString(), (Analytics) parcel.readParcelable(SerpBeduinWidget.class.getClassLoader()), (Settings) parcel.readParcelable(SerpBeduinWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SerpBeduinWidget[] newArray(int i12) {
            return new SerpBeduinWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpBeduinWidget(@l List<? extends BeduinModel> list, @l String str, @l Analytics analytics, @l Settings settings) {
        this.freeForm = list;
        this.id = str;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerpBeduinWidget)) {
            return false;
        }
        SerpBeduinWidget serpBeduinWidget = (SerpBeduinWidget) obj;
        return L.f(this.freeForm, serpBeduinWidget.freeForm) && L.f(this.id, serpBeduinWidget.id) && L.f(this.analytics, serpBeduinWidget.analytics) && L.f(this.settings, serpBeduinWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final List<BeduinModel> getFreeForm() {
        return this.freeForm;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public final Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF162603b() {
        return this.f105229b;
    }

    public final int hashCode() {
        List<BeduinModel> list = this.freeForm;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode3 = (iHashCode2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode3 + (settings != null ? settings.hashCode() : 0);
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
        this.f105229b = j12;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SerpBeduinWidget(freeForm=");
        sb2.append(this.freeForm);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<BeduinModel> list = this.freeForm;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.id);
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ SerpBeduinWidget(List list, String str, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(list, str, (i12 & 4) != 0 ? null : analytics, (i12 & 8) != 0 ? null : settings);
    }
}
