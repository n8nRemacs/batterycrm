package com.avito.android.profile_phones.phones_list.actions;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneActionsResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/PhoneActionsResult;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PhoneActionsResult implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneActionsResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f227466b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PhoneListItem.Action f227467c;

    /* compiled from: PhoneActionsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneActionsResult> {
        @Override // android.os.Parcelable.Creator
        public final PhoneActionsResult createFromParcel(Parcel parcel) {
            return new PhoneActionsResult(parcel.readString(), PhoneListItem.Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneActionsResult[] newArray(int i12) {
            return new PhoneActionsResult[i12];
        }
    }

    public PhoneActionsResult(@k String str, @k PhoneListItem.Action action) {
        this.f227466b = str;
        this.f227467c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneActionsResult)) {
            return false;
        }
        PhoneActionsResult phoneActionsResult = (PhoneActionsResult) obj;
        return L.f(this.f227466b, phoneActionsResult.f227466b) && L.f(this.f227467c, phoneActionsResult.f227467c);
    }

    public final int hashCode() {
        return this.f227467c.hashCode() + (this.f227466b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PhoneActionsResult(phone=" + this.f227466b + ", action=" + this.f227467c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f227466b);
        this.f227467c.writeToParcel(parcel, i12);
    }
}
