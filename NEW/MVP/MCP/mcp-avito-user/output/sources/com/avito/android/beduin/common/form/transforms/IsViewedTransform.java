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

/* compiled from: IsViewedTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/IsViewedTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "isViewed", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/avito/android/beduin/common/form/transforms/IsViewedTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IsViewedTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<IsViewedTransform> CREATOR = new a();
    private final boolean isViewed;

    /* compiled from: IsViewedTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IsViewedTransform> {
        @Override // android.os.Parcelable.Creator
        public final IsViewedTransform createFromParcel(Parcel parcel) {
            return new IsViewedTransform(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IsViewedTransform[] newArray(int i12) {
            return new IsViewedTransform[i12];
        }
    }

    public IsViewedTransform(boolean z12) {
        this.isViewed = z12;
    }

    public static /* synthetic */ IsViewedTransform copy$default(IsViewedTransform isViewedTransform, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = isViewedTransform.isViewed;
        }
        return isViewedTransform.copy(z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }

    @k
    public final IsViewedTransform copy(boolean isViewed) {
        return new IsViewedTransform(isViewed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsViewedTransform) && this.isViewed == ((IsViewedTransform) other).isViewed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isViewed);
    }

    public final boolean isViewed() {
        return this.isViewed;
    }

    @k
    public String toString() {
        return r.x(new StringBuilder("IsViewedTransform(isViewed="), this.isViewed, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isViewed ? 1 : 0);
    }
}
