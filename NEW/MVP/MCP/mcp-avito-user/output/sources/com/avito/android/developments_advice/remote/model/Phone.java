package com.avito.android.developments_advice.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactInfoResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/developments_advice/remote/model/Phone;", "Landroid/os/Parcelable;", "", "phone", "", "isDefault", "isConfirmed", "<init>", "(Ljava/lang/String;ZZ)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "()Z", "d", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Phone implements Parcelable {

    @k
    public static final Parcelable.Creator<Phone> CREATOR = new a();

    @c("isConfirmed")
    private final boolean isConfirmed;

    @c("isDefault")
    private final boolean isDefault;

    @c("phone")
    @k
    private final String phone;

    /* compiled from: ContactInfoResponse.kt */
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

    public Phone(@k String str, boolean z12, boolean z13) {
        this.phone = str;
        this.isDefault = z12;
        this.isConfirmed = z13;
    }

    @k
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

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        return L.f(this.phone, phone.phone) && this.isDefault == phone.isDefault && this.isConfirmed == phone.isConfirmed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isConfirmed) + r.i(this.phone.hashCode() * 31, 31, this.isDefault);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Phone(phone=");
        sb2.append(this.phone);
        sb2.append(", isDefault=");
        sb2.append(this.isDefault);
        sb2.append(", isConfirmed=");
        return r.x(sb2, this.isConfirmed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.phone);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeInt(this.isConfirmed ? 1 : 0);
    }
}
