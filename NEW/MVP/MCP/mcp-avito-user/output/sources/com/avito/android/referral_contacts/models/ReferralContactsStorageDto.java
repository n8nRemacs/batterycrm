package com.avito.android.referral_contacts.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsStorageDto.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsStorageDto;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReferralContactsStorageDto implements Parcelable, Serializable {

    @k
    public static final Parcelable.Creator<ReferralContactsStorageDto> CREATOR;
    private static final long serialVersionUID;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f252517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShareStorageDto f252518c;

    /* compiled from: ReferralContactsStorageDto.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/models/ReferralContactsStorageDto$a;", "", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralContactsStorageDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ReferralContactsStorageDto> {
        @Override // android.os.Parcelable.Creator
        public final ReferralContactsStorageDto createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ContactStorageDto.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ReferralContactsStorageDto(arrayList, ShareStorageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReferralContactsStorageDto[] newArray(int i12) {
            return new ReferralContactsStorageDto[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        serialVersionUID = 1L;
    }

    public ReferralContactsStorageDto(@k ArrayList arrayList, @k ShareStorageDto shareStorageDto) {
        this.f252517b = arrayList;
        this.f252518c = shareStorageDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralContactsStorageDto)) {
            return false;
        }
        ReferralContactsStorageDto referralContactsStorageDto = (ReferralContactsStorageDto) obj;
        return this.f252517b.equals(referralContactsStorageDto.f252517b) && L.f(this.f252518c, referralContactsStorageDto.f252518c);
    }

    public final int hashCode() {
        return this.f252518c.hashCode() + (this.f252517b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ReferralContactsStorageDto(contacts=" + this.f252517b + ", share=" + this.f252518c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f252517b, parcel);
        while (itZ.hasNext()) {
            ((ContactStorageDto) itZ.next()).writeToParcel(parcel, i12);
        }
        this.f252518c.writeToParcel(parcel, i12);
    }
}
