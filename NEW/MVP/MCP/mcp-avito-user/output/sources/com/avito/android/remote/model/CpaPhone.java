package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpaContactInfoResponse.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\f¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/CpaPhone;", "Landroid/os/Parcelable;", "", "phone", "", "isDefault", "isConfirmed", "<init>", "(Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZZ)Lcom/avito/android/remote/model/CpaPhone;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPhone", "Z", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CpaPhone implements Parcelable {

    @k
    public static final Parcelable.Creator<CpaPhone> CREATOR = new Creator();

    @c("isConfirmed")
    private final boolean isConfirmed;

    @c("isDefault")
    private final boolean isDefault;

    @c("phone")
    @k
    private final String phone;

    /* compiled from: CpaContactInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CpaPhone> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaPhone createFromParcel(@k Parcel parcel) {
            return new CpaPhone(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaPhone[] newArray(int i12) {
            return new CpaPhone[i12];
        }
    }

    public CpaPhone(@k String str, boolean z12, boolean z13) {
        this.phone = str;
        this.isDefault = z12;
        this.isConfirmed = z13;
    }

    public static /* synthetic */ CpaPhone copy$default(CpaPhone cpaPhone, String str, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cpaPhone.phone;
        }
        if ((i12 & 2) != 0) {
            z12 = cpaPhone.isDefault;
        }
        if ((i12 & 4) != 0) {
            z13 = cpaPhone.isConfirmed;
        }
        return cpaPhone.copy(str, z12, z13);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    @k
    public final CpaPhone copy(@k String phone, boolean isDefault, boolean isConfirmed) {
        return new CpaPhone(phone, isDefault, isConfirmed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpaPhone)) {
            return false;
        }
        CpaPhone cpaPhone = (CpaPhone) other;
        return L.f(this.phone, cpaPhone.phone) && this.isDefault == cpaPhone.isDefault && this.isConfirmed == cpaPhone.isConfirmed;
    }

    @k
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConfirmed) + r.i(this.phone.hashCode() * 31, 31, this.isDefault);
    }

    public final boolean isConfirmed() {
        return this.isConfirmed;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CpaPhone(phone=");
        sb2.append(this.phone);
        sb2.append(", isDefault=");
        sb2.append(this.isDefault);
        sb2.append(", isConfirmed=");
        return r.x(sb2, this.isConfirmed, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.phone);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeInt(this.isConfirmed ? 1 : 0);
    }
}
