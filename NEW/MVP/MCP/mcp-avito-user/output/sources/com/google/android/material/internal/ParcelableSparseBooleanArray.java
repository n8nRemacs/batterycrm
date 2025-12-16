package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new a();

    public class a implements Parcelable.Creator<ParcelableSparseBooleanArray> {
        @Override // android.os.Parcelable.Creator
        @j.N
        public final ParcelableSparseBooleanArray createFromParcel(@j.N Parcel parcel) {
            int i12 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i12);
            int[] iArr = new int[i12];
            boolean[] zArr = new boolean[i12];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i13 = 0; i13 < i12; i13++) {
                parcelableSparseBooleanArray.put(iArr[i13], zArr[i13]);
            }
            return parcelableSparseBooleanArray;
        }

        @Override // android.os.Parcelable.Creator
        @j.N
        public final ParcelableSparseBooleanArray[] newArray(int i12) {
            return new ParcelableSparseBooleanArray[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i13 = 0; i13 < size(); i13++) {
            iArr[i13] = keyAt(i13);
            zArr[i13] = valueAt(i13);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
