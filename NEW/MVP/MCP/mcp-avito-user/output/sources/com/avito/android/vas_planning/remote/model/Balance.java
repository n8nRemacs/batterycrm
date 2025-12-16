package com.avito.android.vas_planning.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlannerResult.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/vas_planning/remote/model/Balance;", "Landroid/os/Parcelable;", "", DeliverySubsidiesSlotKt.AMOUNT, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getText", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Balance implements Parcelable {

    @k
    public static final Parcelable.Creator<Balance> CREATOR = new a();

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    @k
    private final String amount;

    @c("text")
    @k
    private final String text;

    /* compiled from: VasPlannerResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Balance> {
        @Override // android.os.Parcelable.Creator
        public final Balance createFromParcel(Parcel parcel) {
            return new Balance(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Balance[] newArray(int i12) {
            return new Balance[i12];
        }
    }

    public Balance(@k String str, @k String str2) {
        this.amount = str;
        this.text = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) obj;
        return L.f(this.amount, balance.amount) && L.f(this.text, balance.text);
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.amount.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Balance(amount=");
        sb2.append(this.amount);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.amount);
        parcel.writeString(this.text);
    }
}
