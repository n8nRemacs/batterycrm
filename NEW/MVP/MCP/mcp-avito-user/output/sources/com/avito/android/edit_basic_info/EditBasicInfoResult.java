package com.avito.android.edit_basic_info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditBasicInfoResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/EditBasicInfoResult;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditBasicInfoResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<EditBasicInfoResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f146031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f146032c;

    /* compiled from: EditBasicInfoResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EditBasicInfoResult> {
        @Override // android.os.Parcelable.Creator
        public final EditBasicInfoResult createFromParcel(Parcel parcel) {
            return new EditBasicInfoResult(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditBasicInfoResult[] newArray(int i12) {
            return new EditBasicInfoResult[i12];
        }
    }

    public EditBasicInfoResult(boolean z12, @Y61.l String str) {
        this.f146031b = z12;
        this.f146032c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditBasicInfoResult)) {
            return false;
        }
        EditBasicInfoResult editBasicInfoResult = (EditBasicInfoResult) obj;
        return this.f146031b == editBasicInfoResult.f146031b && L.f(this.f146032c, editBasicInfoResult.f146032c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f146031b) * 31;
        String str = this.f146032c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditBasicInfoResult(changed=");
        sb2.append(this.f146031b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f146032c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f146031b ? 1 : 0);
        parcel.writeString(this.f146032c);
    }
}
