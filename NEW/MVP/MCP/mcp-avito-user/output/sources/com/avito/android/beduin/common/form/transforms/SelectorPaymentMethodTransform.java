package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: BeduinModelTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/SelectorPaymentMethodTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "selectedPosition", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/beduin/common/form/transforms/SelectorPaymentMethodTransform;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getSelectedPosition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectorPaymentMethodTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<SelectorPaymentMethodTransform> CREATOR = new a();
    private final int selectedPosition;

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectorPaymentMethodTransform> {
        @Override // android.os.Parcelable.Creator
        public final SelectorPaymentMethodTransform createFromParcel(Parcel parcel) {
            return new SelectorPaymentMethodTransform(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectorPaymentMethodTransform[] newArray(int i12) {
            return new SelectorPaymentMethodTransform[i12];
        }
    }

    public SelectorPaymentMethodTransform(int i12) {
        this.selectedPosition = i12;
    }

    public static /* synthetic */ SelectorPaymentMethodTransform copy$default(SelectorPaymentMethodTransform selectorPaymentMethodTransform, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = selectorPaymentMethodTransform.selectedPosition;
        }
        return selectorPaymentMethodTransform.copy(i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    @k
    public final SelectorPaymentMethodTransform copy(int selectedPosition) {
        return new SelectorPaymentMethodTransform(selectedPosition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectorPaymentMethodTransform) && this.selectedPosition == ((SelectorPaymentMethodTransform) other).selectedPosition;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public int hashCode() {
        return Integer.hashCode(this.selectedPosition);
    }

    @k
    public String toString() {
        return r.t(new StringBuilder("SelectorPaymentMethodTransform(selectedPosition="), this.selectedPosition, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.selectedPosition);
    }
}
