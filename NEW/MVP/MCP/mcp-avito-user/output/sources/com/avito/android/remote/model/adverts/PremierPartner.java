package com.avito.android.remote.model.adverts;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PremierPartner.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/adverts/PremierPartner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/adverts/PremierPartnerStatus;", "status", "<init>", "(Lcom/avito/android/remote/model/adverts/PremierPartnerStatus;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/PremierPartnerStatus;", "getStatus", "()Lcom/avito/android/remote/model/adverts/PremierPartnerStatus;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PremierPartner implements Parcelable {

    @k
    public static final Parcelable.Creator<PremierPartner> CREATOR = new Creator();

    @c("status")
    @l
    private final PremierPartnerStatus status;

    /* compiled from: PremierPartner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PremierPartner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PremierPartner createFromParcel(@k Parcel parcel) {
            return new PremierPartner(parcel.readInt() == 0 ? null : PremierPartnerStatus.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PremierPartner[] newArray(int i12) {
            return new PremierPartner[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PremierPartner() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final PremierPartnerStatus getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        PremierPartnerStatus premierPartnerStatus = this.status;
        if (premierPartnerStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(premierPartnerStatus.name());
        }
    }

    public PremierPartner(@l PremierPartnerStatus premierPartnerStatus) {
        this.status = premierPartnerStatus;
    }

    public /* synthetic */ PremierPartner(PremierPartnerStatus premierPartnerStatus, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : premierPartnerStatus);
    }
}
