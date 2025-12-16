package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.vertical_main.CollectionsRecommendationWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: CollectionsRecommendationWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/CollectionsRecommendationWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CollectionsRecommendationWidgetItem implements PersistableSerpItem, S2, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<CollectionsRecommendationWidgetItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272687b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272688c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CollectionsRecommendationWidget.BadgeInfo f272689d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<CollectionsRecommendationWidget.CollectionItem> f272690e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Analytics f272691f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f272692g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f272693h;

    /* renamed from: i, reason: collision with root package name */
    public final long f272694i = a.C10492a.a(this);

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f272695j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final int f272696k = 6;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f272697l = true;

    /* compiled from: CollectionsRecommendationWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/CollectionsRecommendationWidgetItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CollectionsRecommendationWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CollectionsRecommendationWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final CollectionsRecommendationWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            CollectionsRecommendationWidget.BadgeInfo badgeInfo = (CollectionsRecommendationWidget.BadgeInfo) parcel.readParcelable(CollectionsRecommendationWidgetItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CollectionsRecommendationWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            return new CollectionsRecommendationWidgetItem(string, string2, badgeInfo, arrayList, (Analytics) parcel.readParcelable(CollectionsRecommendationWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(CollectionsRecommendationWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionsRecommendationWidgetItem[] newArray(int i12) {
            return new CollectionsRecommendationWidgetItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CollectionsRecommendationWidgetItem(@k String str, @k String str2, @l CollectionsRecommendationWidget.BadgeInfo badgeInfo, @k List<CollectionsRecommendationWidget.CollectionItem> list, @l Analytics analytics, @l Settings settings) {
        this.f272687b = str;
        this.f272688c = str2;
        this.f272689d = badgeInfo;
        this.f272690e = list;
        this.f272691f = analytics;
        this.f272692g = settings;
        this.f272693h = new h.b("collectionsRecommendationsWidget", null, null, null, null, analytics, 30, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionsRecommendationWidgetItem)) {
            return false;
        }
        CollectionsRecommendationWidgetItem collectionsRecommendationWidgetItem = (CollectionsRecommendationWidgetItem) obj;
        return L.f(this.f272687b, collectionsRecommendationWidgetItem.f272687b) && L.f(this.f272688c, collectionsRecommendationWidgetItem.f272688c) && L.f(this.f272689d, collectionsRecommendationWidgetItem.f272689d) && L.f(this.f272690e, collectionsRecommendationWidgetItem.f272690e) && L.f(this.f272691f, collectionsRecommendationWidgetItem.f272691f) && L.f(this.f272692g, collectionsRecommendationWidgetItem.f272692g);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF231631p() {
        return this.f272697l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83283e() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f272692g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85114j() {
        return this.f272696k;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85113i() {
        return this.f272687b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f272694i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83286h() {
        return this.f272695j;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f272687b.hashCode() * 31, 31, this.f272688c);
        CollectionsRecommendationWidget.BadgeInfo badgeInfo = this.f272689d;
        int iE2 = H.e((iD2 + (badgeInfo == null ? 0 : badgeInfo.hashCode())) * 31, 31, this.f272690e);
        Analytics analytics = this.f272691f;
        int iHashCode = (iE2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f272692g;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f272693h;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionsRecommendationWidgetItem(stringId=");
        sb2.append(this.f272687b);
        sb2.append(", title=");
        sb2.append(this.f272688c);
        sb2.append(", badgeInfo=");
        sb2.append(this.f272689d);
        sb2.append(", items=");
        sb2.append(this.f272690e);
        sb2.append(", analytics=");
        sb2.append(this.f272691f);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f272692g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272687b);
        parcel.writeString(this.f272688c);
        parcel.writeParcelable(this.f272689d, i12);
        Iterator itJ = C0.j(this.f272690e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f272691f, i12);
        parcel.writeParcelable(this.f272692g, i12);
    }
}
