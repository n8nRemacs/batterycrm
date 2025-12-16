package com.avito.android.advert_details_items.portfolio;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.PortfolioAction;
import com.avito.android.remote.model.PortfolioProject;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/portfolio/AdvertDetailsPortfolioBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsPortfolioBlockItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsPortfolioBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85106b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<PortfolioProject> f85107c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PortfolioAction f85108d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f85109e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f85110f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f85111g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f85112h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f85113i;

    /* renamed from: j, reason: collision with root package name */
    public final int f85114j;

    /* compiled from: PortfolioBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsPortfolioBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPortfolioBlockItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsPortfolioBlockItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsPortfolioBlockItem(string, arrayList, (PortfolioAction) parcel.readParcelable(AdvertDetailsPortfolioBlockItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPortfolioBlockItem[] newArray(int i12) {
            return new AdvertDetailsPortfolioBlockItem[i12];
        }
    }

    public AdvertDetailsPortfolioBlockItem(@k String str, @k List<PortfolioProject> list, @l PortfolioAction portfolioAction, @k String str2, @l String str3, @l String str4, @l String str5, @k String str6, int i12) {
        this.f85106b = str;
        this.f85107c = list;
        this.f85108d = portfolioAction;
        this.f85109e = str2;
        this.f85110f = str3;
        this.f85111g = str4;
        this.f85112h = str5;
        this.f85113i = str6;
        this.f85114j = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsPortfolioBlockItem(this.f85106b, this.f85107c, this.f85108d, this.f85109e, this.f85110f, this.f85111g, this.f85112h, this.f85113i, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsPortfolioBlockItem)) {
            return false;
        }
        AdvertDetailsPortfolioBlockItem advertDetailsPortfolioBlockItem = (AdvertDetailsPortfolioBlockItem) obj;
        return L.f(this.f85106b, advertDetailsPortfolioBlockItem.f85106b) && L.f(this.f85107c, advertDetailsPortfolioBlockItem.f85107c) && L.f(this.f85108d, advertDetailsPortfolioBlockItem.f85108d) && L.f(this.f85109e, advertDetailsPortfolioBlockItem.f85109e) && L.f(this.f85110f, advertDetailsPortfolioBlockItem.f85110f) && L.f(this.f85111g, advertDetailsPortfolioBlockItem.f85111g) && L.f(this.f85112h, advertDetailsPortfolioBlockItem.f85112h) && L.f(this.f85113i, advertDetailsPortfolioBlockItem.f85113i) && this.f85114j == advertDetailsPortfolioBlockItem.f85114j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77564b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75243e() {
        return this.f85114j;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75240b() {
        return this.f85113i;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f85106b.hashCode() * 31, 31, this.f85107c);
        PortfolioAction portfolioAction = this.f85108d;
        int iD2 = H.d((iE2 + (portfolioAction == null ? 0 : portfolioAction.hashCode())) * 31, 31, this.f85109e);
        String str = this.f85110f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85111g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85112h;
        return Integer.hashCode(this.f85114j) + H.d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f85113i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPortfolioBlockItem(title=");
        sb2.append(this.f85106b);
        sb2.append(", projects=");
        sb2.append(this.f85107c);
        sb2.append(", buttonAction=");
        sb2.append(this.f85108d);
        sb2.append(", iid=");
        sb2.append(this.f85109e);
        sb2.append(", categoryId=");
        sb2.append(this.f85110f);
        sb2.append(", microcategoryId=");
        sb2.append(this.f85111g);
        sb2.append(", xHash=");
        sb2.append(this.f85112h);
        sb2.append(", stringId=");
        sb2.append(this.f85113i);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f85114j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85106b);
        Iterator itJ = C0.j(this.f85107c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f85108d, i12);
        parcel.writeString(this.f85109e);
        parcel.writeString(this.f85110f);
        parcel.writeString(this.f85111g);
        parcel.writeString(this.f85112h);
        parcel.writeString(this.f85113i);
        parcel.writeInt(this.f85114j);
    }
}
