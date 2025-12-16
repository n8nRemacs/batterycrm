package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinModelTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/UpdateRightIconTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateRightIconTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<UpdateRightIconTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Parcelable f103415b;

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UpdateRightIconTransform> {
        @Override // android.os.Parcelable.Creator
        public final UpdateRightIconTransform createFromParcel(Parcel parcel) {
            return new UpdateRightIconTransform(parcel.readParcelable(UpdateRightIconTransform.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateRightIconTransform[] newArray(int i12) {
            return new UpdateRightIconTransform[i12];
        }
    }

    public UpdateRightIconTransform(@l Parcelable parcelable) {
        this.f103415b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateRightIconTransform) && L.f(this.f103415b, ((UpdateRightIconTransform) obj).f103415b);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f103415b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("UpdateRightIconTransform(rightIcon="), this.f103415b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f103415b, i12);
    }
}
