package com.avito.android.comfortable_deal.client_room.seller_recall.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReasonEntity.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/model/ReasonEntity;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReasonEntity implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<ReasonEntity> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119974b;

    /* compiled from: ReasonEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReasonEntity> {
        @Override // android.os.Parcelable.Creator
        public final ReasonEntity createFromParcel(Parcel parcel) {
            return new ReasonEntity(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReasonEntity[] newArray(int i12) {
            return new ReasonEntity[i12];
        }
    }

    public ReasonEntity(@k String str) {
        this.f119974b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReasonEntity) && L.f(this.f119974b, ((ReasonEntity) obj).f119974b);
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f119974b;
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF119974b() {
        return this.f119974b;
    }

    public final int hashCode() {
        return this.f119974b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ReasonEntity(reason="), this.f119974b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f119974b);
    }
}
