package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;

/* compiled from: BeduinModelTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/LabelExpandTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LabelExpandTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<LabelExpandTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f103385b;

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LabelExpandTransform> {
        @Override // android.os.Parcelable.Creator
        public final LabelExpandTransform createFromParcel(Parcel parcel) {
            return new LabelExpandTransform(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LabelExpandTransform[] newArray(int i12) {
            return new LabelExpandTransform[i12];
        }
    }

    public LabelExpandTransform(boolean z12) {
        this.f103385b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LabelExpandTransform) && this.f103385b == ((LabelExpandTransform) obj).f103385b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103385b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("LabelExpandTransform(expanded="), this.f103385b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f103385b ? 1 : 0);
    }
}
