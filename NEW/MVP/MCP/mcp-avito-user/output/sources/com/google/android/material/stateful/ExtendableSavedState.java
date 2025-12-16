package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.o1;
import androidx.customview.view.AbsSavedState;
import j.N;
import j.P;

/* loaded from: classes6.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @N
    public final o1<String, Bundle> f357349d;

    public class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @N
        public final ExtendableSavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        public final Object[] newArray(int i12) {
            return new ExtendableSavedState[i12];
        }

        @Override // android.os.Parcelable.Creator
        @P
        public final Object createFromParcel(@N Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f357349d = new o1<>();
    }

    @N
    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f357349d + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        super.writeToParcel(parcel, i12);
        o1<String, Bundle> o1Var = this.f357349d;
        int i13 = o1Var.f25790d;
        parcel.writeInt(i13);
        String[] strArr = new String[i13];
        Bundle[] bundleArr = new Bundle[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            strArr[i14] = o1Var.f(i14);
            bundleArr[i14] = o1Var.k(i14);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int i12 = parcel.readInt();
        String[] strArr = new String[i12];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i12];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f357349d = new o1<>(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            this.f357349d.put(strArr[i13], bundleArr[i13]);
        }
    }
}
