package com.avito.android.user_address_public.api;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiAddressesItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_address_public/api/AddressComponents;", "Landroid/os/Parcelable;", "", "house", "locality", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddressComponents implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressComponents> CREATOR = new a();

    @c("house")
    @l
    private final String house;

    @c("locality")
    @k
    private final String locality;

    /* compiled from: MultiAddressesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressComponents> {
        @Override // android.os.Parcelable.Creator
        public final AddressComponents createFromParcel(Parcel parcel) {
            return new AddressComponents(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressComponents[] newArray(int i12) {
            return new AddressComponents[i12];
        }
    }

    public AddressComponents(@l String str, @k String str2) {
        this.house = str;
        this.locality = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getHouse() {
        return this.house;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressComponents)) {
            return false;
        }
        AddressComponents addressComponents = (AddressComponents) obj;
        return L.f(this.house, addressComponents.house) && L.f(this.locality, addressComponents.locality);
    }

    public final int hashCode() {
        String str = this.house;
        return this.locality.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressComponents(house=");
        sb2.append(this.house);
        sb2.append(", locality=");
        return C22026a.c(sb2, this.locality, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.house);
        parcel.writeString(this.locality);
    }
}
