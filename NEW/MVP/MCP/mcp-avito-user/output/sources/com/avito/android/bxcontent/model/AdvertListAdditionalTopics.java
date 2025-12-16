package com.avito.android.bxcontent.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertListAdditionalTopics.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/model/AdvertListAdditionalTopics;", "Landroid/os/Parcelable;", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AdvertListAdditionalTopics implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertListAdditionalTopics> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdvertListData f111188b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AdvertListData f111189c;

    /* compiled from: AdvertListAdditionalTopics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertListAdditionalTopics> {
        @Override // android.os.Parcelable.Creator
        public final AdvertListAdditionalTopics createFromParcel(Parcel parcel) {
            Parcelable.Creator<AdvertListData> creator = AdvertListData.CREATOR;
            return new AdvertListAdditionalTopics(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertListAdditionalTopics[] newArray(int i12) {
            return new AdvertListAdditionalTopics[i12];
        }
    }

    public AdvertListAdditionalTopics(@k AdvertListData advertListData, @l AdvertListData advertListData2) {
        this.f111188b = advertListData;
        this.f111189c = advertListData2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertListAdditionalTopics)) {
            return false;
        }
        AdvertListAdditionalTopics advertListAdditionalTopics = (AdvertListAdditionalTopics) obj;
        return L.f(this.f111188b, advertListAdditionalTopics.f111188b) && L.f(this.f111189c, advertListAdditionalTopics.f111189c);
    }

    public final int hashCode() {
        int iHashCode = this.f111188b.hashCode() * 31;
        AdvertListData advertListData = this.f111189c;
        return iHashCode + (advertListData == null ? 0 : advertListData.hashCode());
    }

    @k
    public final String toString() {
        return "AdvertListAdditionalTopics(topic1=" + this.f111188b + ", topic2=" + this.f111189c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f111188b.writeToParcel(parcel, i12);
        AdvertListData advertListData = this.f111189c;
        if (advertListData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertListData.writeToParcel(parcel, i12);
        }
    }
}
