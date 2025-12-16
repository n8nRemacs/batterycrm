package com.avito.android.favorite_sellers.adapter.advert_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertListItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/AdvertListItem;", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/favorite_sellers/SubscribableItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class AdvertListItem implements FavoriteSellersItem, com.avito.conveyor_item.a, SubscribableItem {

    @k
    public static final Parcelable.Creator<AdvertListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155493b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f155494c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<PersistableSerpItem> f155495d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f155497f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Boolean f155498g;

    /* compiled from: AdvertListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertListItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertListItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertListItem.class, parcel, arrayList, iL2, 1);
            }
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertListItem(string, string2, arrayList, z12, z13, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertListItem[] newArray(int i12) {
            return new AdvertListItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertListItem(@k String str, @k String str2, @k List<? extends PersistableSerpItem> list, boolean z12, boolean z13, @l Boolean bool) {
        this.f155493b = str;
        this.f155494c = str2;
        this.f155495d = list;
        this.f155496e = z12;
        this.f155497f = z13;
        this.f155498g = bool;
    }

    @Override // com.avito.android.InterfaceC32897n0
    @k
    /* renamed from: L, reason: from getter */
    public final String getF294217b() {
        return this.f155494c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.InterfaceC32897n0
    /* renamed from: f, reason: from getter */
    public final boolean getF294218c() {
        return this.f155497f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF440286b() {
        return this.f155493b;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem, com.avito.android.InterfaceC32897n0
    @l
    /* renamed from: isNotificationsActivated, reason: from getter */
    public final Boolean getF294219d() {
        return this.f155498g;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void setNotificationsActivated(@l Boolean bool) {
        this.f155498g = bool;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void setSubscribed(boolean z12) {
        this.f155497f = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155493b);
        parcel.writeString(this.f155494c);
        Iterator itJ = C0.j(this.f155495d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f155496e ? 1 : 0);
        parcel.writeInt(this.f155497f ? 1 : 0);
        Boolean bool = this.f155498g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ AdvertListItem(String str, String str2, List list, boolean z12, boolean z13, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, list, z12, (i12 & 16) != 0 ? true : z13, (i12 & 32) != 0 ? null : bool);
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void V0(boolean z12) {
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void u3(boolean z12) {
    }
}
