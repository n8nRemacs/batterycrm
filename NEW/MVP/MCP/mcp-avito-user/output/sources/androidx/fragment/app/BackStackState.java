package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f46284b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f46285c;

    public class a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i12) {
            return new BackStackState[i12];
        }
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f46284b = arrayList;
        this.f46285c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        parcel.writeStringList(this.f46284b);
        parcel.writeTypedList(this.f46285c);
    }

    public BackStackState(@j.N Parcel parcel) {
        this.f46284b = parcel.createStringArrayList();
        this.f46285c = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
