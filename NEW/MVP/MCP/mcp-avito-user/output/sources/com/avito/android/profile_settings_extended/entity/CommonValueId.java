package com.avito.android.profile_settings_extended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonValue.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/CommonValueId;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CommonValueId implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CommonValueId> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f230265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f230266c;

    /* compiled from: CommonValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommonValueId> {
        @Override // android.os.Parcelable.Creator
        public final CommonValueId createFromParcel(Parcel parcel) {
            return new CommonValueId(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonValueId[] newArray(int i12) {
            return new CommonValueId[i12];
        }
    }

    public CommonValueId(@Y61.k String str, @Y61.k String str2) {
        this.f230265b = str;
        this.f230266c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonValueId)) {
            return false;
        }
        CommonValueId commonValueId = (CommonValueId) obj;
        return L.f(this.f230265b, commonValueId.f230265b) && L.f(this.f230266c, commonValueId.f230266c);
    }

    public final int hashCode() {
        return this.f230266c.hashCode() + (this.f230265b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommonValueId(fieldName=");
        sb2.append(this.f230265b);
        sb2.append(", valueId=");
        return C22026a.c(sb2, this.f230266c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f230265b);
        parcel.writeString(this.f230266c);
    }
}
