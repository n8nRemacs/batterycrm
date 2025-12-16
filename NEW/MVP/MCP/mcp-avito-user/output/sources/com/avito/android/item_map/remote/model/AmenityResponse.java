package com.avito.android.item_map.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.developments_catalog.AmenityPin;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AmenityResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/item_map/remote/model/AmenityResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/developments_catalog/AmenityPin;", "pins", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_item-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AmenityResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AmenityResponse> CREATOR = new a();

    @c("pins")
    @l
    private final List<AmenityPin> pins;

    /* compiled from: AmenityResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmenityResponse> {
        @Override // android.os.Parcelable.Creator
        public final AmenityResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AmenityResponse.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new AmenityResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AmenityResponse[] newArray(int i12) {
            return new AmenityResponse[i12];
        }
    }

    public AmenityResponse(@l List<AmenityPin> list) {
        this.pins = list;
    }

    @l
    public final List<AmenityPin> c() {
        return this.pins;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmenityResponse) && L.f(this.pins, ((AmenityResponse) obj).pins);
    }

    public final int hashCode() {
        List<AmenityPin> list = this.pins;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("AmenityResponse(pins="), this.pins, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<AmenityPin> list = this.pins;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
