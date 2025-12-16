package com.avito.android.comfortable_deal.client_room.seller_recall.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerRecallArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/model/SellerRecallArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerRecallArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerRecallArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119975b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PartnerStatus f119976c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f119977d;

    /* compiled from: SellerRecallArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerRecallArguments> {
        @Override // android.os.Parcelable.Creator
        public final SellerRecallArguments createFromParcel(Parcel parcel) {
            return new SellerRecallArguments(parcel.readString(), (PartnerStatus) parcel.readParcelable(SellerRecallArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerRecallArguments[] newArray(int i12) {
            return new SellerRecallArguments[i12];
        }
    }

    public SellerRecallArguments(@k String str, @k PartnerStatus partnerStatus, @l String str2) {
        this.f119975b = str;
        this.f119976c = partnerStatus;
        this.f119977d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerRecallArguments)) {
            return false;
        }
        SellerRecallArguments sellerRecallArguments = (SellerRecallArguments) obj;
        return L.f(this.f119975b, sellerRecallArguments.f119975b) && L.f(this.f119976c, sellerRecallArguments.f119976c) && L.f(this.f119977d, sellerRecallArguments.f119977d);
    }

    public final int hashCode() {
        int iHashCode = (this.f119976c.hashCode() + (this.f119975b.hashCode() * 31)) * 31;
        String str = this.f119977d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerRecallArguments(leadId=");
        sb2.append(this.f119975b);
        sb2.append(", partner=");
        sb2.append(this.f119976c);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f119977d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f119975b);
        parcel.writeParcelable(this.f119976c, i12);
        parcel.writeString(this.f119977d);
    }
}
