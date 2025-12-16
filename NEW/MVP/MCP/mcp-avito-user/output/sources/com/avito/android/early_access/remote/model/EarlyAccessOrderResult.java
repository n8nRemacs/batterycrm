package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessOrderResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/early_access/remote/model/EarlyAccessOrderResult;", "Landroid/os/Parcelable;", "", "orderId", "", "message", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "getOrderId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessOrderResult implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessOrderResult> CREATOR = new a();

    @c("message")
    @l
    private final String message;

    @c("orderId")
    @l
    private final Long orderId;

    /* compiled from: EarlyAccessOrderResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessOrderResult> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessOrderResult createFromParcel(Parcel parcel) {
            return new EarlyAccessOrderResult(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessOrderResult[] newArray(int i12) {
            return new EarlyAccessOrderResult[i12];
        }
    }

    public EarlyAccessOrderResult(@l Long l12, @l String str) {
        this.orderId = l12;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessOrderResult)) {
            return false;
        }
        EarlyAccessOrderResult earlyAccessOrderResult = (EarlyAccessOrderResult) obj;
        return L.f(this.orderId, earlyAccessOrderResult.orderId) && L.f(this.message, earlyAccessOrderResult.message);
    }

    public final int hashCode() {
        Long l12 = this.orderId;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessOrderResult(orderId=");
        sb2.append(this.orderId);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.orderId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.message);
    }
}
