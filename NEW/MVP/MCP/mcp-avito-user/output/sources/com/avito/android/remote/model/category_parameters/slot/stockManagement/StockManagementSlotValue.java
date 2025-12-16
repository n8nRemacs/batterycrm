package com.avito.android.remote.model.category_parameters.slot.stockManagement;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: StockManagementSlotValue.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/stockManagement/StockManagementSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "stockMultiple", "", "stockQuantity", "<init>", "(ZLjava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getStockMultiple", "()Z", "Ljava/lang/Integer;", "getStockQuantity", "()Ljava/lang/Integer;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StockManagementSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<StockManagementSlotValue> CREATOR = new Creator();

    @c("stockMultiple")
    private final boolean stockMultiple;

    @c("stockQuantity")
    @l
    private final Integer stockQuantity;

    /* compiled from: StockManagementSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StockManagementSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StockManagementSlotValue createFromParcel(@k Parcel parcel) {
            return new StockManagementSlotValue(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StockManagementSlotValue[] newArray(int i12) {
            return new StockManagementSlotValue[i12];
        }
    }

    public StockManagementSlotValue(boolean z12, @l Integer num) {
        this.stockMultiple = z12;
        this.stockQuantity = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getStockMultiple() {
        return this.stockMultiple;
    }

    @l
    public final Integer getStockQuantity() {
        return this.stockQuantity;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.stockMultiple ? 1 : 0);
        Integer num = this.stockQuantity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}
