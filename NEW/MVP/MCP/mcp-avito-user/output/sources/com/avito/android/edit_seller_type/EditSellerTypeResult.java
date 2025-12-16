package com.avito.android.edit_seller_type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: EditSellerTypeResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/EditSellerTypeResult;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditSellerTypeResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<EditSellerTypeResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f146690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f146691c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f146692d;

    /* compiled from: EditSellerTypeResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EditSellerTypeResult> {
        @Override // android.os.Parcelable.Creator
        public final EditSellerTypeResult createFromParcel(Parcel parcel) {
            return new EditSellerTypeResult(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditSellerTypeResult[] newArray(int i12) {
            return new EditSellerTypeResult[i12];
        }
    }

    public EditSellerTypeResult(int i12, @Y61.l Integer num, @Y61.k String str) {
        this.f146690b = i12;
        this.f146691c = str;
        this.f146692d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditSellerTypeResult)) {
            return false;
        }
        EditSellerTypeResult editSellerTypeResult = (EditSellerTypeResult) obj;
        return this.f146690b == editSellerTypeResult.f146690b && kotlin.jvm.internal.L.f(this.f146691c, editSellerTypeResult.f146691c) && kotlin.jvm.internal.L.f(this.f146692d, editSellerTypeResult.f146692d);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(Integer.hashCode(this.f146690b) * 31, 31, this.f146691c);
        Integer num = this.f146692d;
        return iD2 + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditSellerTypeResult(sellerType=");
        sb2.append(this.f146690b);
        sb2.append(", sellerTypeTitle=");
        sb2.append(this.f146691c);
        sb2.append(", sellerSubtype=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f146692d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f146690b);
        parcel.writeString(this.f146691c);
        Integer num = this.f146692d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
