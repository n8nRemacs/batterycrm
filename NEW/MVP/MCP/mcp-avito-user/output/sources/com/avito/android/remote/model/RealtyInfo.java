package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RealtyInfo.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/RealtyInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/RealtyCategory;", "categoryType", "Lcom/avito/android/remote/model/TransactionType;", "transactionType", "<init>", "(Lcom/avito/android/remote/model/RealtyCategory;Lcom/avito/android/remote/model/TransactionType;)V", "component1", "()Lcom/avito/android/remote/model/RealtyCategory;", "component2", "()Lcom/avito/android/remote/model/TransactionType;", "copy", "(Lcom/avito/android/remote/model/RealtyCategory;Lcom/avito/android/remote/model/TransactionType;)Lcom/avito/android/remote/model/RealtyInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/RealtyCategory;", "getCategoryType", "Lcom/avito/android/remote/model/TransactionType;", "getTransactionType", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RealtyInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyInfo> CREATOR = new Creator();

    @c("categoryType")
    @k
    private final RealtyCategory categoryType;

    @c("transactionType")
    @k
    private final TransactionType transactionType;

    /* compiled from: RealtyInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyInfo createFromParcel(@k Parcel parcel) {
            return new RealtyInfo(RealtyCategory.valueOf(parcel.readString()), TransactionType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyInfo[] newArray(int i12) {
            return new RealtyInfo[i12];
        }
    }

    public RealtyInfo(@k RealtyCategory realtyCategory, @k TransactionType transactionType) {
        this.categoryType = realtyCategory;
        this.transactionType = transactionType;
    }

    public static /* synthetic */ RealtyInfo copy$default(RealtyInfo realtyInfo, RealtyCategory realtyCategory, TransactionType transactionType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            realtyCategory = realtyInfo.categoryType;
        }
        if ((i12 & 2) != 0) {
            transactionType = realtyInfo.transactionType;
        }
        return realtyInfo.copy(realtyCategory, transactionType);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final RealtyCategory getCategoryType() {
        return this.categoryType;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    @k
    public final RealtyInfo copy(@k RealtyCategory categoryType, @k TransactionType transactionType) {
        return new RealtyInfo(categoryType, transactionType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtyInfo)) {
            return false;
        }
        RealtyInfo realtyInfo = (RealtyInfo) other;
        return this.categoryType == realtyInfo.categoryType && this.transactionType == realtyInfo.transactionType;
    }

    @k
    public final RealtyCategory getCategoryType() {
        return this.categoryType;
    }

    @k
    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return this.transactionType.hashCode() + (this.categoryType.hashCode() * 31);
    }

    @k
    public String toString() {
        return "RealtyInfo(categoryType=" + this.categoryType + ", transactionType=" + this.transactionType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.categoryType.name());
        parcel.writeString(this.transactionType.name());
    }
}
