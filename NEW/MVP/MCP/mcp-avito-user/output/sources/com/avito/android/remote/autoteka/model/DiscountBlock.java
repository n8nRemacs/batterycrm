package com.avito.android.remote.autoteka.model;

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

/* compiled from: AutotekaPreviewResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/autoteka/model/DiscountBlock;", "Landroid/os/Parcelable;", "", "title", DeliverySubsidiesSlotKt.AMOUNT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DiscountBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<DiscountBlock> CREATOR = new a();

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    @k
    private final String amount;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaPreviewResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountBlock> {
        @Override // android.os.Parcelable.Creator
        public final DiscountBlock createFromParcel(Parcel parcel) {
            return new DiscountBlock(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountBlock[] newArray(int i12) {
            return new DiscountBlock[i12];
        }
    }

    public DiscountBlock(@k String str, @k String str2) {
        this.title = str;
        this.amount = str2;
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
        if (!(obj instanceof DiscountBlock)) {
            return false;
        }
        DiscountBlock discountBlock = (DiscountBlock) obj;
        return L.f(this.title, discountBlock.title) && L.f(this.amount, discountBlock.amount);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.amount.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountBlock(title=");
        sb2.append(this.title);
        sb2.append(", amount=");
        return C22026a.c(sb2, this.amount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.amount);
    }
}
