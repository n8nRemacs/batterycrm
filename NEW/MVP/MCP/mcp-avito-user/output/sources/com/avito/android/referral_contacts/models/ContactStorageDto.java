package com.avito.android.referral_contacts.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsStorageDto.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ContactStorageDto;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContactStorageDto implements Parcelable, Serializable {

    @k
    public static final Parcelable.Creator<ContactStorageDto> CREATOR;
    private static final long serialVersionUID;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252506b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f252507c;

    /* compiled from: ReferralContactsStorageDto.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ContactStorageDto$a;", "", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralContactsStorageDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ContactStorageDto> {
        @Override // android.os.Parcelable.Creator
        public final ContactStorageDto createFromParcel(Parcel parcel) {
            return new ContactStorageDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactStorageDto[] newArray(int i12) {
            return new ContactStorageDto[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        serialVersionUID = 1L;
    }

    public ContactStorageDto(@k String str, @k String str2) {
        this.f252506b = str;
        this.f252507c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactStorageDto)) {
            return false;
        }
        ContactStorageDto contactStorageDto = (ContactStorageDto) obj;
        return L.f(this.f252506b, contactStorageDto.f252506b) && L.f(this.f252507c, contactStorageDto.f252507c);
    }

    public final int hashCode() {
        return this.f252507c.hashCode() + (this.f252506b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactStorageDto(name=");
        sb2.append(this.f252506b);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.f252507c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f252506b);
        parcel.writeString(this.f252507c);
    }
}
