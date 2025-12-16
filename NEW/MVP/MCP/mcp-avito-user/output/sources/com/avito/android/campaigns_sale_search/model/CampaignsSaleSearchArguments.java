package com.avito.android.campaigns_sale_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/model/CampaignsSaleSearchArguments;", "Landroid/os/Parcelable;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleSearchArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleSearchArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114633b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f114634c;

    /* compiled from: CampaignsSaleSearchArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleSearchArguments> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleSearchArguments createFromParcel(Parcel parcel) {
            return new CampaignsSaleSearchArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleSearchArguments[] newArray(int i12) {
            return new CampaignsSaleSearchArguments[i12];
        }
    }

    public CampaignsSaleSearchArguments(@k String str, @k String str2) {
        this.f114633b = str;
        this.f114634c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleSearchArguments)) {
            return false;
        }
        CampaignsSaleSearchArguments campaignsSaleSearchArguments = (CampaignsSaleSearchArguments) obj;
        return L.f(this.f114633b, campaignsSaleSearchArguments.f114633b) && L.f(this.f114634c, campaignsSaleSearchArguments.f114634c);
    }

    public final int hashCode() {
        return this.f114634c.hashCode() + (this.f114633b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleSearchArguments(saleId=");
        sb2.append(this.f114633b);
        sb2.append(", sessionId=");
        return C22026a.c(sb2, this.f114634c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f114633b);
        parcel.writeString(this.f114634c);
    }
}
