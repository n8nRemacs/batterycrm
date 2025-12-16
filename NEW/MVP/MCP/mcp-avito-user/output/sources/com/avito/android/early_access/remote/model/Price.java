package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/early_access/remote/model/Price;", "Landroid/os/Parcelable;", "", DeliverySubsidiesSlotKt.AMOUNT, "", "title", "<init>", "(JLjava/lang/String;)V", "J", "getAmount", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Price implements Parcelable {

    @k
    public static final Parcelable.Creator<Price> CREATOR = new a();

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    private final long amount;

    @c("title")
    @k
    private final String title;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Price> {
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            return new Price(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i12) {
            return new Price[i12];
        }
    }

    public Price(long j12, @k String str) {
        this.amount = j12;
        this.title = str;
    }

    @k
    public final ReEarlyAccessData.Price c() {
        return new ReEarlyAccessData.Price(this.amount, this.title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return this.amount == price.amount && L.f(this.title, price.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Price(amount=");
        sb2.append(this.amount);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.amount);
        parcel.writeString(this.title);
    }
}
