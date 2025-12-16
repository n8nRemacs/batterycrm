package com.avito.android.active_orders.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.active_orders_common.items.common.ActiveOrderItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: HomeActiveOrdersItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/active_orders/adapter/HomeActiveOrdersItemImpl;", "Lcom/avito/android/active_orders/adapter/HomeActiveOrdersItem;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HomeActiveOrdersItemImpl implements HomeActiveOrdersItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<HomeActiveOrdersItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f68254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68255c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f68256d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<ActiveOrderItem> f68257e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Analytics f68258f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Settings f68259g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h.b f68260h;

    /* renamed from: i, reason: collision with root package name */
    public final long f68261i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f68262j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f68263k;

    /* compiled from: HomeActiveOrdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HomeActiveOrdersItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final HomeActiveOrdersItemImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(HomeActiveOrdersItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(HomeActiveOrdersItemImpl.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new HomeActiveOrdersItemImpl(string, i12, deepLink, arrayList, (Analytics) parcel.readParcelable(HomeActiveOrdersItemImpl.class.getClassLoader()), (Settings) parcel.readParcelable(HomeActiveOrdersItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HomeActiveOrdersItemImpl[] newArray(int i12) {
            return new HomeActiveOrdersItemImpl[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeActiveOrdersItemImpl(@Y61.k String str, int i12, @Y61.l DeepLink deepLink, @Y61.l List<? extends ActiveOrderItem> list, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f68254b = str;
        this.f68255c = i12;
        this.f68256d = deepLink;
        this.f68257e = list;
        this.f68258f = analytics;
        this.f68259g = settings;
        this.f68260h = new h.b("activeOrdersWidget", null, null, null, null, analytics, 30, null);
        this.f68261i = a.C10492a.a(this);
        this.f68262j = SerpViewType.f268585e;
        this.f68263k = true;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272743j() {
        return this.f68263k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74860b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272740g() {
        return this.f68259g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74870l() {
        return this.f68255c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155493b() {
        return this.f68254b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF74873o() {
        return this.f68261i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF74872n() {
        return this.f68262j;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272744k() {
        return this.f68260h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f68254b);
        parcel.writeInt(this.f68255c);
        parcel.writeParcelable(this.f68256d, i12);
        List<ActiveOrderItem> list = this.f68257e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f68258f, i12);
        parcel.writeParcelable(this.f68259g, i12);
    }

    public /* synthetic */ HomeActiveOrdersItemImpl(String str, int i12, DeepLink deepLink, List list, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "home_active_orders_item_id" : str, i12, deepLink, list, analytics, settings);
    }
}
