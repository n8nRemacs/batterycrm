package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.H;
import androidx.view.Lifecycle;
import java.util.ArrayList;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f46270b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f46271c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f46272d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f46273e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46274f;

    /* renamed from: g, reason: collision with root package name */
    public final String f46275g;

    /* renamed from: h, reason: collision with root package name */
    public final int f46276h;

    /* renamed from: i, reason: collision with root package name */
    public final int f46277i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f46278j;

    /* renamed from: k, reason: collision with root package name */
    public final int f46279k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f46280l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<String> f46281m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f46282n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f46283o;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i12) {
            return new BackStackRecordState[i12];
        }
    }

    public BackStackRecordState(C22943a c22943a) {
        int size = c22943a.f46442a.size();
        this.f46270b = new int[size * 6];
        if (!c22943a.f46448g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f46271c = new ArrayList<>(size);
        this.f46272d = new int[size];
        this.f46273e = new int[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            H.a aVar = c22943a.f46442a.get(i13);
            int i14 = i12 + 1;
            this.f46270b[i12] = aVar.f46458a;
            ArrayList<String> arrayList = this.f46271c;
            Fragment fragment = aVar.f46459b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f46270b;
            iArr[i14] = aVar.f46460c ? 1 : 0;
            iArr[i12 + 2] = aVar.f46461d;
            iArr[i12 + 3] = aVar.f46462e;
            int i15 = i12 + 5;
            iArr[i12 + 4] = aVar.f46463f;
            i12 += 6;
            iArr[i15] = aVar.f46464g;
            this.f46272d[i13] = aVar.f46465h.ordinal();
            this.f46273e[i13] = aVar.f46466i.ordinal();
        }
        this.f46274f = c22943a.f46447f;
        this.f46275g = c22943a.f46450i;
        this.f46276h = c22943a.f46528s;
        this.f46277i = c22943a.f46451j;
        this.f46278j = c22943a.f46452k;
        this.f46279k = c22943a.f46453l;
        this.f46280l = c22943a.f46454m;
        this.f46281m = c22943a.f46455n;
        this.f46282n = c22943a.f46456o;
        this.f46283o = c22943a.f46457p;
    }

    public final void a(@j.N C22943a c22943a) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f46270b;
            boolean z12 = true;
            if (i12 >= iArr.length) {
                c22943a.f46447f = this.f46274f;
                c22943a.f46450i = this.f46275g;
                c22943a.f46448g = true;
                c22943a.f46451j = this.f46277i;
                c22943a.f46452k = this.f46278j;
                c22943a.f46453l = this.f46279k;
                c22943a.f46454m = this.f46280l;
                c22943a.f46455n = this.f46281m;
                c22943a.f46456o = this.f46282n;
                c22943a.f46457p = this.f46283o;
                return;
            }
            H.a aVar = new H.a();
            int i14 = i12 + 1;
            aVar.f46458a = iArr[i12];
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(c22943a);
                int i15 = iArr[i14];
            }
            aVar.f46465h = Lifecycle.State.values()[this.f46272d[i13]];
            aVar.f46466i = Lifecycle.State.values()[this.f46273e[i13]];
            int i16 = i12 + 2;
            if (iArr[i14] == 0) {
                z12 = false;
            }
            aVar.f46460c = z12;
            int i17 = iArr[i16];
            aVar.f46461d = i17;
            int i18 = iArr[i12 + 3];
            aVar.f46462e = i18;
            int i19 = i12 + 5;
            int i22 = iArr[i12 + 4];
            aVar.f46463f = i22;
            i12 += 6;
            int i23 = iArr[i19];
            aVar.f46464g = i23;
            c22943a.f46443b = i17;
            c22943a.f46444c = i18;
            c22943a.f46445d = i22;
            c22943a.f46446e = i23;
            c22943a.b(aVar);
            i13++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeIntArray(this.f46270b);
        parcel.writeStringList(this.f46271c);
        parcel.writeIntArray(this.f46272d);
        parcel.writeIntArray(this.f46273e);
        parcel.writeInt(this.f46274f);
        parcel.writeString(this.f46275g);
        parcel.writeInt(this.f46276h);
        parcel.writeInt(this.f46277i);
        TextUtils.writeToParcel(this.f46278j, parcel, 0);
        parcel.writeInt(this.f46279k);
        TextUtils.writeToParcel(this.f46280l, parcel, 0);
        parcel.writeStringList(this.f46281m);
        parcel.writeStringList(this.f46282n);
        parcel.writeInt(this.f46283o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f46270b = parcel.createIntArray();
        this.f46271c = parcel.createStringArrayList();
        this.f46272d = parcel.createIntArray();
        this.f46273e = parcel.createIntArray();
        this.f46274f = parcel.readInt();
        this.f46275g = parcel.readString();
        this.f46276h = parcel.readInt();
        this.f46277i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f46278j = (CharSequence) creator.createFromParcel(parcel);
        this.f46279k = parcel.readInt();
        this.f46280l = (CharSequence) creator.createFromParcel(parcel);
        this.f46281m = parcel.createStringArrayList();
        this.f46282n = parcel.createStringArrayList();
        this.f46283o = parcel.readInt() != 0;
    }
}
