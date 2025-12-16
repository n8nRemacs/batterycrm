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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ShareStorageDto;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ShareStorageDto implements Parcelable, Serializable {

    @k
    public static final Parcelable.Creator<ShareStorageDto> CREATOR;
    private static final long serialVersionUID;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252519b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f252520c;

    /* compiled from: ReferralContactsStorageDto.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ShareStorageDto$a;", "", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralContactsStorageDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ShareStorageDto> {
        @Override // android.os.Parcelable.Creator
        public final ShareStorageDto createFromParcel(Parcel parcel) {
            return new ShareStorageDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareStorageDto[] newArray(int i12) {
            return new ShareStorageDto[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        serialVersionUID = 1L;
    }

    public ShareStorageDto(@k String str, @k String str2) {
        this.f252519b = str;
        this.f252520c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareStorageDto)) {
            return false;
        }
        ShareStorageDto shareStorageDto = (ShareStorageDto) obj;
        return L.f(this.f252519b, shareStorageDto.f252519b) && L.f(this.f252520c, shareStorageDto.f252520c);
    }

    public final int hashCode() {
        return this.f252520c.hashCode() + (this.f252519b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShareStorageDto(deeplink=");
        sb2.append(this.f252519b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f252520c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f252519b);
        parcel.writeString(this.f252520c);
    }
}
