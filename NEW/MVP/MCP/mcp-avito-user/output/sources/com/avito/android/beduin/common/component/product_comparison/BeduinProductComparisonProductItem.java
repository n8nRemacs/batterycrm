package com.avito.android.beduin.common.component.product_comparison;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinProductComparisonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItemHeader;", "header", "", "", "propertyValues", "<init>", "(Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItemHeader;Ljava/util/List;)V", "component1", "()Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItemHeader;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItemHeader;Ljava/util/List;)Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItem;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItemHeader;", "getHeader", "Ljava/util/List;", "getPropertyValues", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinProductComparisonProductItem implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinProductComparisonProductItem> CREATOR = new a();

    @k
    private final BeduinProductComparisonProductItemHeader header;

    @k
    private final List<String> propertyValues;

    /* compiled from: BeduinProductComparisonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinProductComparisonProductItem> {
        @Override // android.os.Parcelable.Creator
        public final BeduinProductComparisonProductItem createFromParcel(Parcel parcel) {
            return new BeduinProductComparisonProductItem(BeduinProductComparisonProductItemHeader.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinProductComparisonProductItem[] newArray(int i12) {
            return new BeduinProductComparisonProductItem[i12];
        }
    }

    public BeduinProductComparisonProductItem(@k BeduinProductComparisonProductItemHeader beduinProductComparisonProductItemHeader, @k List<String> list) {
        this.header = beduinProductComparisonProductItemHeader;
        this.propertyValues = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinProductComparisonProductItem copy$default(BeduinProductComparisonProductItem beduinProductComparisonProductItem, BeduinProductComparisonProductItemHeader beduinProductComparisonProductItemHeader, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            beduinProductComparisonProductItemHeader = beduinProductComparisonProductItem.header;
        }
        if ((i12 & 2) != 0) {
            list = beduinProductComparisonProductItem.propertyValues;
        }
        return beduinProductComparisonProductItem.copy(beduinProductComparisonProductItemHeader, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BeduinProductComparisonProductItemHeader getHeader() {
        return this.header;
    }

    @k
    public final List<String> component2() {
        return this.propertyValues;
    }

    @k
    public final BeduinProductComparisonProductItem copy(@k BeduinProductComparisonProductItemHeader header, @k List<String> propertyValues) {
        return new BeduinProductComparisonProductItem(header, propertyValues);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinProductComparisonProductItem)) {
            return false;
        }
        BeduinProductComparisonProductItem beduinProductComparisonProductItem = (BeduinProductComparisonProductItem) other;
        return L.f(this.header, beduinProductComparisonProductItem.header) && L.f(this.propertyValues, beduinProductComparisonProductItem.propertyValues);
    }

    @k
    public final BeduinProductComparisonProductItemHeader getHeader() {
        return this.header;
    }

    @k
    public final List<String> getPropertyValues() {
        return this.propertyValues;
    }

    public int hashCode() {
        return this.propertyValues.hashCode() + (this.header.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinProductComparisonProductItem(header=");
        sb2.append(this.header);
        sb2.append(", propertyValues=");
        return H.p(sb2, this.propertyValues, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.header.writeToParcel(parcel, flags);
        parcel.writeStringList(this.propertyValues);
    }
}
