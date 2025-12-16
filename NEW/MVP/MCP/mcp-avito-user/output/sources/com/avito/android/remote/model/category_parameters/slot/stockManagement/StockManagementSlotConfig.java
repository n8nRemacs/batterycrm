package com.avito.android.remote.model.category_parameters.slot.stockManagement;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: StockManagementSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/stockManagement/StockManagementSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "stockMultipleField", "Lcom/avito/android/remote/model/category_parameters/IntParameter;", "stockQuantityField", "<init>", "(Lcom/avito/android/remote/model/category_parameters/BooleanParameter;Lcom/avito/android/remote/model/category_parameters/IntParameter;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "getStockMultipleField", "()Lcom/avito/android/remote/model/category_parameters/BooleanParameter;", "Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getStockQuantityField", "()Lcom/avito/android/remote/model/category_parameters/IntParameter;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StockManagementSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<StockManagementSlotConfig> CREATOR = new Creator();

    @c("stockMultipleField")
    @k
    private final BooleanParameter stockMultipleField;

    @c("stockQuantityField")
    @k
    private final IntParameter stockQuantityField;

    /* compiled from: StockManagementSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StockManagementSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StockManagementSlotConfig createFromParcel(@k Parcel parcel) {
            return new StockManagementSlotConfig((BooleanParameter) parcel.readParcelable(StockManagementSlotConfig.class.getClassLoader()), (IntParameter) parcel.readParcelable(StockManagementSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StockManagementSlotConfig[] newArray(int i12) {
            return new StockManagementSlotConfig[i12];
        }
    }

    public StockManagementSlotConfig(@k BooleanParameter booleanParameter, @k IntParameter intParameter) {
        this.stockMultipleField = booleanParameter;
        this.stockQuantityField = intParameter;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final BooleanParameter getStockMultipleField() {
        return this.stockMultipleField;
    }

    @k
    public final IntParameter getStockQuantityField() {
        return this.stockQuantityField;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.stockMultipleField, flags);
        parcel.writeParcelable(this.stockQuantityField, flags);
    }
}
