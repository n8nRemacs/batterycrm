package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.t;
import com.google.android.material.internal.ParcelableSparseArray;
import j.N;
import j.P;

@RestrictTo
/* loaded from: classes6.dex */
public class NavigationBarPresenter implements o {

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f356843b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public ParcelableSparseArray f356844c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @N
            public final SavedState createFromParcel(@N Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f356843b = parcel.readInt();
                savedState.f356844c = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            parcel.writeInt(this.f356843b);
            parcel.writeParcelable(this.f356844c, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public final void c(boolean z12) {
        if (!z12) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean e(@P k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean f(@P t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean g(@P k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void i(@N Context context, @N androidx.appcompat.view.menu.h hVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void b(@P androidx.appcompat.view.menu.h hVar, boolean z12) {
    }
}
