package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new a();

    public class a implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @j.N
        public final ParcelableSparseArray createFromParcel(@j.N Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @j.N
        public final Object[] newArray(int i12) {
            return new ParcelableSparseArray[i12];
        }

        @Override // android.os.Parcelable.Creator
        @j.P
        public final Object createFromParcel(@j.N Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }
    }

    public ParcelableSparseArray() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = keyAt(i13);
            parcelableArr[i13] = valueAt(i13);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i12);
    }

    public ParcelableSparseArray(@j.N Parcel parcel, @j.P ClassLoader classLoader) {
        int i12 = parcel.readInt();
        int[] iArr = new int[i12];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i13 = 0; i13 < i12; i13++) {
            put(iArr[i13], parcelableArray[i13]);
        }
    }
}
