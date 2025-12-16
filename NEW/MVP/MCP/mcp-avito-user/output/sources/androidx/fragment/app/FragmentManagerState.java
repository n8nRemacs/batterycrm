package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<String> f46414b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<String> f46415c;

    /* renamed from: d, reason: collision with root package name */
    public BackStackRecordState[] f46416d;

    /* renamed from: e, reason: collision with root package name */
    public int f46417e;

    /* renamed from: f, reason: collision with root package name */
    public String f46418f = null;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<String> f46419g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<BackStackState> f46420h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f46421i;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f46418f = null;
            fragmentManagerState.f46419g = new ArrayList<>();
            fragmentManagerState.f46420h = new ArrayList<>();
            fragmentManagerState.f46414b = parcel.createStringArrayList();
            fragmentManagerState.f46415c = parcel.createStringArrayList();
            fragmentManagerState.f46416d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.f46417e = parcel.readInt();
            fragmentManagerState.f46418f = parcel.readString();
            fragmentManagerState.f46419g = parcel.createStringArrayList();
            fragmentManagerState.f46420h = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.f46421i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i12) {
            return new FragmentManagerState[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeStringList(this.f46414b);
        parcel.writeStringList(this.f46415c);
        parcel.writeTypedArray(this.f46416d, i12);
        parcel.writeInt(this.f46417e);
        parcel.writeString(this.f46418f);
        parcel.writeStringList(this.f46419g);
        parcel.writeTypedList(this.f46420h);
        parcel.writeTypedList(this.f46421i);
    }
}
