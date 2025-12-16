package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ContactInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/Phone;", "Landroid/os/Parcelable;", "", "phone", "", "isDefault", "isConfirmed", "<init>", "(Ljava/lang/String;ZZ)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "e", "()Z", "d", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Phone implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Phone> CREATOR = new a();

    @com.google.gson.annotations.c("isConfirmed")
    private final boolean isConfirmed;

    @com.google.gson.annotations.c("isDefault")
    private final boolean isDefault;

    @com.google.gson.annotations.c("phone")
    @Y61.k
    private final String phone;

    /* compiled from: ContactInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Phone> {
        @Override // android.os.Parcelable.Creator
        public final Phone createFromParcel(Parcel parcel) {
            return new Phone(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Phone[] newArray(int i12) {
            return new Phone[i12];
        }
    }

    public Phone(@Y61.k String str, boolean z12, boolean z13) {
        this.phone = str;
        this.isDefault = z12;
        this.isConfirmed = z13;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        return kotlin.jvm.internal.L.f(this.phone, phone.phone) && this.isDefault == phone.isDefault && this.isConfirmed == phone.isConfirmed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isConfirmed) + androidx.appcompat.app.r.i(this.phone.hashCode() * 31, 31, this.isDefault);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Phone(phone=");
        sb2.append(this.phone);
        sb2.append(", isDefault=");
        sb2.append(this.isDefault);
        sb2.append(", isConfirmed=");
        return androidx.appcompat.app.r.x(sb2, this.isConfirmed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.phone);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeInt(this.isConfirmed ? 1 : 0);
    }
}
