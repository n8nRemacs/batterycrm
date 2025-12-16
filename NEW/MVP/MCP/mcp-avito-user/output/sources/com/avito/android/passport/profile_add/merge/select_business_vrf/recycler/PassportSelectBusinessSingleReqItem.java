package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportSelectBusinessSingleReqItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/PassportSelectBusinessSingleReqItem;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/PassportSelectBusinessListItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportSelectBusinessSingleReqItem implements PassportSelectBusinessListItem {

    @Y61.k
    public static final Parcelable.Creator<PassportSelectBusinessSingleReqItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f213505b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f213506c;

    /* compiled from: PassportSelectBusinessSingleReqItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportSelectBusinessSingleReqItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportSelectBusinessSingleReqItem createFromParcel(Parcel parcel) {
            return new PassportSelectBusinessSingleReqItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportSelectBusinessSingleReqItem[] newArray(int i12) {
            return new PassportSelectBusinessSingleReqItem[i12];
        }
    }

    public PassportSelectBusinessSingleReqItem(@Y61.k String str, @Y61.k String str2) {
        this.f213505b = str;
        this.f213506c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportSelectBusinessSingleReqItem)) {
            return false;
        }
        PassportSelectBusinessSingleReqItem passportSelectBusinessSingleReqItem = (PassportSelectBusinessSingleReqItem) obj;
        return L.f(this.f213505b, passportSelectBusinessSingleReqItem.f213505b) && L.f(this.f213506c, passportSelectBusinessSingleReqItem.f213506c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF213336d() {
        return this.f213506c;
    }

    public final int hashCode() {
        return this.f213506c.hashCode() + (this.f213505b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportSelectBusinessSingleReqItem(reqText=");
        sb2.append(this.f213505b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f213506c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f213505b);
        parcel.writeString(this.f213506c);
    }
}
