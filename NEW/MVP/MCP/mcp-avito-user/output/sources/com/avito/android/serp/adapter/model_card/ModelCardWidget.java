package com.avito.android.serp.adapter.model_card;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.model_card.item.ModelCardWidgetItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: ModelCardWidget.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/ModelCardWidget;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModelCardWidget implements PersistableSerpItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<ModelCardWidget> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f270394b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f270395c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f270396d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f270397e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<ModelCardWidgetItem> f270398f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Analytics f270399g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Settings f270400h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270401i;

    /* renamed from: j, reason: collision with root package name */
    public final int f270402j;

    /* renamed from: k, reason: collision with root package name */
    public final long f270403k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final h.b f270404l;

    /* compiled from: ModelCardWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/ModelCardWidget$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ModelCardWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ModelCardWidget> {
        @Override // android.os.Parcelable.Creator
        public final ModelCardWidget createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ModelCardWidget.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ModelCardWidgetItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ModelCardWidget(string, string2, string3, deepLink, arrayList, (Analytics) parcel.readParcelable(ModelCardWidget.class.getClassLoader()), (Settings) parcel.readParcelable(ModelCardWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ModelCardWidget[] newArray(int i12) {
            return new ModelCardWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ModelCardWidget(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l DeepLink deepLink, @Y61.k List<ModelCardWidgetItem> list, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f270394b = str;
        this.f270395c = str2;
        this.f270396d = str3;
        this.f270397e = deepLink;
        this.f270398f = list;
        this.f270399g = analytics;
        this.f270400h = settings;
        this.f270401i = SerpViewType.f268585e;
        this.f270402j = 6;
        this.f270403k = a.C10492a.a(this);
        this.f270404l = new h.b("catalogEntryPointWidget", str2, null, null, null, analytics, 28, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelCardWidget)) {
            return false;
        }
        ModelCardWidget modelCardWidget = (ModelCardWidget) obj;
        return L.f(this.f270394b, modelCardWidget.f270394b) && L.f(this.f270395c, modelCardWidget.f270395c) && L.f(this.f270396d, modelCardWidget.f270396d) && L.f(this.f270397e, modelCardWidget.f270397e) && L.f(this.f270398f, modelCardWidget.f270398f) && L.f(this.f270399g, modelCardWidget.f270399g) && L.f(this.f270400h, modelCardWidget.f270400h);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272775j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247679b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270700f() {
        return this.f270400h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78040c() {
        return this.f270402j;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266193b() {
        return this.f270394b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF270702h() {
        return this.f270403k;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79109g() {
        return this.f270401i;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f270394b.hashCode() * 31, 31, this.f270395c);
        String str = this.f270396d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f270397e;
        int iE2 = H.e((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f270398f);
        Analytics analytics = this.f270399g;
        int iHashCode2 = (iE2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f270400h;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF270701g() {
        return this.f270404l;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelCardWidget(stringId=");
        sb2.append(this.f270394b);
        sb2.append(", title=");
        sb2.append(this.f270395c);
        sb2.append(", subtitle=");
        sb2.append(this.f270396d);
        sb2.append(", actionDeeplink=");
        sb2.append(this.f270397e);
        sb2.append(", items=");
        sb2.append(this.f270398f);
        sb2.append(", analytics=");
        sb2.append(this.f270399g);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270400h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270394b);
        parcel.writeString(this.f270395c);
        parcel.writeString(this.f270396d);
        parcel.writeParcelable(this.f270397e, i12);
        Iterator itJ = C0.j(this.f270398f, parcel);
        while (itJ.hasNext()) {
            ((ModelCardWidgetItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f270399g, i12);
        parcel.writeParcelable(this.f270400h, i12);
    }

    public /* synthetic */ ModelCardWidget(String str, String str2, String str3, DeepLink deepLink, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, deepLink, list, analytics, settings);
    }
}
