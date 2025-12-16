package com.avito.android.mortgage.landing.list.items.offers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import com.avito.conveyor_item.a;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OffersItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/OffersItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OffersItem implements LandingItem {

    @Y61.k
    public static final Parcelable.Creator<OffersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f199793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199794c;

    /* renamed from: d, reason: collision with root package name */
    public final int f199795d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<OfferItem> f199796e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f199797f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f199798g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f199799h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f199800i;

    /* compiled from: OffersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OffersItem> {
        @Override // android.os.Parcelable.Creator
        public final OffersItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = com.avito.android.actions_sheet.a.c(OfferItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new OffersItem(string, i12, i13, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OffersItem[] newArray(int i12) {
            return new OffersItem[i12];
        }
    }

    public OffersItem(@Y61.k String str, @e0 int i12, @e0 int i13, @Y61.l List<OfferItem> list, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f199793b = str;
        this.f199794c = i12;
        this.f199795d = i13;
        this.f199796e = list;
        this.f199797f = z12;
        this.f199798g = z13;
        this.f199799h = z14;
        this.f199800i = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OffersItem a(OffersItem offersItem, ArrayList arrayList, boolean z12, int i12) {
        String str = offersItem.f199793b;
        int i13 = offersItem.f199794c;
        int i14 = offersItem.f199795d;
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = offersItem.f199796e;
        }
        List list2 = list;
        boolean z13 = (i12 & 16) != 0 ? offersItem.f199797f : true;
        boolean z14 = offersItem.f199798g;
        if ((i12 & 64) != 0) {
            z12 = offersItem.f199799h;
        }
        boolean z15 = z12;
        boolean z16 = (i12 & 128) != 0 ? offersItem.f199800i : false;
        offersItem.getClass();
        return new OffersItem(str, i13, i14, list2, z13, z14, z15, z16);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @Y61.k
    public final LandingItem N() {
        return a(this, null, false, 127);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersItem)) {
            return false;
        }
        OffersItem offersItem = (OffersItem) obj;
        return L.f(this.f199793b, offersItem.f199793b) && this.f199794c == offersItem.f199794c && this.f199795d == offersItem.f199795d && L.f(this.f199796e, offersItem.f199796e) && this.f199797f == offersItem.f199797f && this.f199798g == offersItem.f199798g && this.f199799h == offersItem.f199799h && this.f199800i == offersItem.f199800i;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130376b() {
        return this.f199793b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f199795d, r.e(this.f199794c, this.f199793b.hashCode() * 31, 31), 31);
        List<OfferItem> list = this.f199796e;
        return Boolean.hashCode(this.f199800i) + r.i(r.i(r.i((iE2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f199797f), 31, this.f199798g), 31, this.f199799h);
    }

    public final boolean isEmpty() {
        List<OfferItem> list = this.f199796e;
        return list == null || list.isEmpty();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffersItem(stringId=");
        sb2.append(this.f199793b);
        sb2.append(", title=");
        sb2.append(this.f199794c);
        sb2.append(", description=");
        sb2.append(this.f199795d);
        sb2.append(", offers=");
        sb2.append(this.f199796e);
        sb2.append(", isLoading=");
        sb2.append(this.f199797f);
        sb2.append(", showMkbBanner=");
        sb2.append(this.f199798g);
        sb2.append(", buttonLoaderShown=");
        sb2.append(this.f199799h);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199800i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f199793b);
        parcel.writeInt(this.f199794c);
        parcel.writeInt(this.f199795d);
        List<OfferItem> list = this.f199796e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((OfferItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f199797f ? 1 : 0);
        parcel.writeInt(this.f199798g ? 1 : 0);
        parcel.writeInt(this.f199799h ? 1 : 0);
        parcel.writeInt(this.f199800i ? 1 : 0);
    }

    public /* synthetic */ OffersItem(String str, int i12, int i13, List list, boolean z12, boolean z13, boolean z14, boolean z15, int i14, C42822w c42822w) {
        this(str, i12, i13, list, z12, z13, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? true : z15);
    }
}
