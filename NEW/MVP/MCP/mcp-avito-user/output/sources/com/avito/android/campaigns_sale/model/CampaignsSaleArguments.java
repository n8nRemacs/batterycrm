package com.avito.android.campaigns_sale.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/model/CampaignsSaleArguments;", "Landroid/os/Parcelable;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114050b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f114051c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f114052d;

    /* compiled from: CampaignsSaleArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleArguments> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleArguments createFromParcel(Parcel parcel) {
            return new CampaignsSaleArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleArguments[] newArray(int i12) {
            return new CampaignsSaleArguments[i12];
        }
    }

    public CampaignsSaleArguments(@k String str, @l String str2, @l String str3) {
        this.f114050b = str;
        this.f114051c = str2;
        this.f114052d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleArguments)) {
            return false;
        }
        CampaignsSaleArguments campaignsSaleArguments = (CampaignsSaleArguments) obj;
        return L.f(this.f114050b, campaignsSaleArguments.f114050b) && L.f(this.f114051c, campaignsSaleArguments.f114051c) && L.f(this.f114052d, campaignsSaleArguments.f114052d);
    }

    public final int hashCode() {
        int iHashCode = this.f114050b.hashCode() * 31;
        String str = this.f114051c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114052d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleArguments(saleId=");
        sb2.append(this.f114050b);
        sb2.append(", fromPage=");
        sb2.append(this.f114051c);
        sb2.append(", selectedItemId=");
        return C22026a.c(sb2, this.f114052d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f114050b);
        parcel.writeString(this.f114051c);
        parcel.writeString(this.f114052d);
    }
}
