package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new a();

    public class a implements Parcelable.Creator<ParcelableSparseIntArray> {
        @Override // android.os.Parcelable.Creator
        @j.N
        public final ParcelableSparseIntArray createFromParcel(@j.N Parcel parcel) {
            int i12 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i12);
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i13 = 0; i13 < i12; i13++) {
                parcelableSparseIntArray.put(iArr[i13], iArr2[i13]);
            }
            return parcelableSparseIntArray;
        }

        @Override // android.os.Parcelable.Creator
        @j.N
        public final ParcelableSparseIntArray[] newArray(int i12) {
            return new ParcelableSparseIntArray[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i13 = 0; i13 < size(); i13++) {
            iArr[i13] = keyAt(i13);
            iArr2[i13] = valueAt(i13);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
