package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: BeduinModelTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/SelectDatesTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectDatesTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<SelectDatesTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f103404b;

    /* compiled from: BeduinModelTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDatesTransform> {
        @Override // android.os.Parcelable.Creator
        public final SelectDatesTransform createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readSerializable());
            }
            return new SelectDatesTransform(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDatesTransform[] newArray(int i12) {
            return new SelectDatesTransform[i12];
        }
    }

    public SelectDatesTransform(@k ArrayList arrayList) {
        this.f103404b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectDatesTransform) && this.f103404b.equals(((SelectDatesTransform) obj).f103404b);
    }

    public final int hashCode() {
        return this.f103404b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("SelectDatesTransform(selectedDates="), this.f103404b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f103404b, parcel);
        while (itZ.hasNext()) {
            parcel.writeSerializable((Serializable) itZ.next());
        }
    }
}
