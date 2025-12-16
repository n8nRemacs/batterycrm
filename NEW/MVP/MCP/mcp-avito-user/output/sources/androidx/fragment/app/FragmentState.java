package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.Lifecycle;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f46422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46423c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f46424d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46425e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46426f;

    /* renamed from: g, reason: collision with root package name */
    public final String f46427g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f46428h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f46429i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f46430j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f46431k;

    /* renamed from: l, reason: collision with root package name */
    public final int f46432l;

    /* renamed from: m, reason: collision with root package name */
    public final String f46433m;

    /* renamed from: n, reason: collision with root package name */
    public final int f46434n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f46435o;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i12) {
            return new FragmentState[i12];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f46422b = fragment.getClass().getName();
        this.f46423c = fragment.mWho;
        this.f46424d = fragment.mFromLayout;
        this.f46425e = fragment.mFragmentId;
        this.f46426f = fragment.mContainerId;
        this.f46427g = fragment.mTag;
        this.f46428h = fragment.mRetainInstance;
        this.f46429i = fragment.mRemoving;
        this.f46430j = fragment.mDetached;
        this.f46431k = fragment.mHidden;
        this.f46432l = fragment.mMaxState.ordinal();
        this.f46433m = fragment.mTargetWho;
        this.f46434n = fragment.mTargetRequestCode;
        this.f46435o = fragment.mUserVisibleHint;
    }

    @j.N
    public final Fragment a(@j.N C22959q c22959q, @j.N ClassLoader classLoader) {
        Fragment fragmentB = c22959q.b(classLoader, this.f46422b);
        fragmentB.mWho = this.f46423c;
        fragmentB.mFromLayout = this.f46424d;
        fragmentB.mRestored = true;
        fragmentB.mFragmentId = this.f46425e;
        fragmentB.mContainerId = this.f46426f;
        fragmentB.mTag = this.f46427g;
        fragmentB.mRetainInstance = this.f46428h;
        fragmentB.mRemoving = this.f46429i;
        fragmentB.mDetached = this.f46430j;
        fragmentB.mHidden = this.f46431k;
        fragmentB.mMaxState = Lifecycle.State.values()[this.f46432l];
        fragmentB.mTargetWho = this.f46433m;
        fragmentB.mTargetRequestCode = this.f46434n;
        fragmentB.mUserVisibleHint = this.f46435o;
        return fragmentB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @j.N
    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(128, "FragmentState{");
        sbQ.append(this.f46422b);
        sbQ.append(" (");
        sbQ.append(this.f46423c);
        sbQ.append(")}:");
        if (this.f46424d) {
            sbQ.append(" fromLayout");
        }
        int i12 = this.f46426f;
        if (i12 != 0) {
            sbQ.append(" id=0x");
            sbQ.append(Integer.toHexString(i12));
        }
        String str = this.f46427g;
        if (str != null && !str.isEmpty()) {
            sbQ.append(" tag=");
            sbQ.append(str);
        }
        if (this.f46428h) {
            sbQ.append(" retainInstance");
        }
        if (this.f46429i) {
            sbQ.append(" removing");
        }
        if (this.f46430j) {
            sbQ.append(" detached");
        }
        if (this.f46431k) {
            sbQ.append(" hidden");
        }
        String str2 = this.f46433m;
        if (str2 != null) {
            sbQ.append(" targetWho=");
            sbQ.append(str2);
            sbQ.append(" targetRequestCode=");
            sbQ.append(this.f46434n);
        }
        if (this.f46435o) {
            sbQ.append(" userVisibleHint");
        }
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f46422b);
        parcel.writeString(this.f46423c);
        parcel.writeInt(this.f46424d ? 1 : 0);
        parcel.writeInt(this.f46425e);
        parcel.writeInt(this.f46426f);
        parcel.writeString(this.f46427g);
        parcel.writeInt(this.f46428h ? 1 : 0);
        parcel.writeInt(this.f46429i ? 1 : 0);
        parcel.writeInt(this.f46430j ? 1 : 0);
        parcel.writeInt(this.f46431k ? 1 : 0);
        parcel.writeInt(this.f46432l);
        parcel.writeString(this.f46433m);
        parcel.writeInt(this.f46434n);
        parcel.writeInt(this.f46435o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f46422b = parcel.readString();
        this.f46423c = parcel.readString();
        this.f46424d = parcel.readInt() != 0;
        this.f46425e = parcel.readInt();
        this.f46426f = parcel.readInt();
        this.f46427g = parcel.readString();
        this.f46428h = parcel.readInt() != 0;
        this.f46429i = parcel.readInt() != 0;
        this.f46430j = parcel.readInt() != 0;
        this.f46431k = parcel.readInt() != 0;
        this.f46432l = parcel.readInt();
        this.f46433m = parcel.readString();
        this.f46434n = parcel.readInt();
        this.f46435o = parcel.readInt() != 0;
    }
}
