package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f45355b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbsSavedState f45354c = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeParcelable(this.f45355b, i12);
    }

    public AbsSavedState() {
        this.f45355b = null;
    }

    public class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbsSavedState.f45354c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i12) {
            return new AbsSavedState[i12];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f45354c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(@N Parcelable parcelable) {
        if (parcelable != null) {
            this.f45355b = parcelable == f45354c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@N Parcel parcel, @P ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f45355b = parcelable == null ? f45354c : parcelable;
    }
}
