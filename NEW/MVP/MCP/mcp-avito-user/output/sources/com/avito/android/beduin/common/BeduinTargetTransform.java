package com.avito.android.beduin.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: BeduinTargetTransform.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/BeduinTargetTransform;", "Landroid/os/Parcelable;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinTargetTransform implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinTargetTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f99950b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f99951c;

    /* compiled from: BeduinTargetTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTargetTransform> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTargetTransform createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinTargetTransform.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinTargetTransform(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTargetTransform[] newArray(int i12) {
            return new BeduinTargetTransform[i12];
        }
    }

    public BeduinTargetTransform(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f99950b = str;
        this.f99951c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f99950b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f99951c, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
    }
}
