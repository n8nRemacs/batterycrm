package com.avito.android.campaigns_sale.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleBlockWithId.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/model/CampaignsSaleBlockWithId;", "Landroid/os/Parcelable;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleBlockWithId implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleBlockWithId> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114053b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f114054c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Long> f114055d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<Image> f114056e;

    /* compiled from: CampaignsSaleBlockWithId.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleBlockWithId> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleBlockWithId createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(CampaignsSaleBlockWithId.class, parcel, arrayList3, iL2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new CampaignsSaleBlockWithId(numValueOf, string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleBlockWithId[] newArray(int i12) {
            return new CampaignsSaleBlockWithId[i12];
        }
    }

    public CampaignsSaleBlockWithId(@l Integer num, @k String str, @l List list, @l List list2) {
        this.f114053b = str;
        this.f114054c = num;
        this.f114055d = list;
        this.f114056e = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleBlockWithId)) {
            return false;
        }
        CampaignsSaleBlockWithId campaignsSaleBlockWithId = (CampaignsSaleBlockWithId) obj;
        return L.f(this.f114053b, campaignsSaleBlockWithId.f114053b) && L.f(this.f114054c, campaignsSaleBlockWithId.f114054c) && L.f(this.f114055d, campaignsSaleBlockWithId.f114055d) && L.f(this.f114056e, campaignsSaleBlockWithId.f114056e);
    }

    public final int hashCode() {
        int iHashCode = this.f114053b.hashCode() * 31;
        Integer num = this.f114054c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Long> list = this.f114055d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.f114056e;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleBlockWithId(uuid=");
        sb2.append(this.f114053b);
        sb2.append(", discount=");
        sb2.append(this.f114054c);
        sb2.append(", itemIds=");
        sb2.append(this.f114055d);
        sb2.append(", images=");
        return H.p(sb2, this.f114056e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f114053b);
        Integer num = this.f114054c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<Long> list = this.f114055d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeLong(((Number) itA.next()).longValue());
            }
        }
        List<Image> list2 = this.f114056e;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }
}
