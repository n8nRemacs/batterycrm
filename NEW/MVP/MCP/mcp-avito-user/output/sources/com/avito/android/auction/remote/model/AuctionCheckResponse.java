package com.avito.android.auction.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionCheckResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/auction/remote/model/AuctionCheckResponse;", "Landroid/os/Parcelable;", "", "isEnable", "<init>", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionCheckResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionCheckResponse> CREATOR = new a();

    @c("isEnable")
    @l
    private final Boolean isEnable;

    /* compiled from: AuctionCheckResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionCheckResponse> {
        @Override // android.os.Parcelable.Creator
        public final AuctionCheckResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuctionCheckResponse(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionCheckResponse[] newArray(int i12) {
            return new AuctionCheckResponse[i12];
        }
    }

    public AuctionCheckResponse(@l Boolean bool) {
        this.isEnable = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsEnable() {
        return this.isEnable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuctionCheckResponse) && L.f(this.isEnable, ((AuctionCheckResponse) obj).isEnable);
    }

    public final int hashCode() {
        Boolean bool = this.isEnable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @k
    public final String toString() {
        return C0.g(new StringBuilder("AuctionCheckResponse(isEnable="), this.isEnable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Boolean bool = this.isEnable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
