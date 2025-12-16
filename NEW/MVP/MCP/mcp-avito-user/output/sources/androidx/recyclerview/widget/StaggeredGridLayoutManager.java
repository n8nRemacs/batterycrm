package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes10.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.y.b {

    /* renamed from: A, reason: collision with root package name */
    public BitSet f53905A;

    /* renamed from: B, reason: collision with root package name */
    public int f53906B;

    /* renamed from: C, reason: collision with root package name */
    public int f53907C;

    /* renamed from: D, reason: collision with root package name */
    public final LazySpanLookup f53908D;

    /* renamed from: E, reason: collision with root package name */
    public final int f53909E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f53910F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f53911G;

    /* renamed from: H, reason: collision with root package name */
    public SavedState f53912H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f53913I;

    /* renamed from: J, reason: collision with root package name */
    public final b f53914J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f53915K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f53916L;

    /* renamed from: M, reason: collision with root package name */
    public final Runnable f53917M;

    /* renamed from: r, reason: collision with root package name */
    public int f53918r;

    /* renamed from: s, reason: collision with root package name */
    public d[] f53919s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    public final I f53920t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    public final I f53921u;

    /* renamed from: v, reason: collision with root package name */
    public final int f53922v;

    /* renamed from: w, reason: collision with root package name */
    public int f53923w;

    /* renamed from: x, reason: collision with root package name */
    @j.N
    public final C23433y f53924x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f53925y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f53926z;

    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f53927a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f53928b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public int f53929b;

            /* renamed from: c, reason: collision with root package name */
            public int f53930c;

            /* renamed from: d, reason: collision with root package name */
            public int[] f53931d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f53932e;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.f53929b = parcel.readInt();
                    fullSpanItem.f53930c = parcel.readInt();
                    fullSpanItem.f53932e = parcel.readInt() == 1;
                    int i12 = parcel.readInt();
                    if (i12 > 0) {
                        int[] iArr = new int[i12];
                        fullSpanItem.f53931d = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i12) {
                    return new FullSpanItem[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f53929b + ", mGapDir=" + this.f53930c + ", mHasUnwantedGapAfter=" + this.f53932e + ", mGapPerSpan=" + Arrays.toString(this.f53931d) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i12) {
                parcel.writeInt(this.f53929b);
                parcel.writeInt(this.f53930c);
                parcel.writeInt(this.f53932e ? 1 : 0);
                int[] iArr = this.f53931d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f53931d);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f53927a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f53928b = null;
        }

        public final void b(int i12) {
            int[] iArr = this.f53927a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i12, 10) + 1];
                this.f53927a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int length = iArr.length;
                while (length <= i12) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f53927a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f53927a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i12, int i13) {
            int[] iArr = this.f53927a;
            if (iArr == null || i12 >= iArr.length) {
                return;
            }
            int i14 = i12 + i13;
            b(i14);
            int[] iArr2 = this.f53927a;
            System.arraycopy(iArr2, i12, iArr2, i14, (iArr2.length - i12) - i13);
            Arrays.fill(this.f53927a, i12, i14, -1);
            ArrayList arrayList = this.f53928b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f53928b.get(size);
                int i15 = fullSpanItem.f53929b;
                if (i15 >= i12) {
                    fullSpanItem.f53929b = i15 + i13;
                }
            }
        }

        public final void d(int i12, int i13) {
            int[] iArr = this.f53927a;
            if (iArr == null || i12 >= iArr.length) {
                return;
            }
            int i14 = i12 + i13;
            b(i14);
            int[] iArr2 = this.f53927a;
            System.arraycopy(iArr2, i14, iArr2, i12, (iArr2.length - i12) - i13);
            int[] iArr3 = this.f53927a;
            Arrays.fill(iArr3, iArr3.length - i13, iArr3.length, -1);
            ArrayList arrayList = this.f53928b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f53928b.get(size);
                int i15 = fullSpanItem.f53929b;
                if (i15 >= i12) {
                    if (i15 < i14) {
                        this.f53928b.remove(size);
                    } else {
                        fullSpanItem.f53929b = i15 - i13;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f53933b;

        /* renamed from: c, reason: collision with root package name */
        public int f53934c;

        /* renamed from: d, reason: collision with root package name */
        public int f53935d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f53936e;

        /* renamed from: f, reason: collision with root package name */
        public int f53937f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f53938g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f53939h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f53940i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f53941j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f53942k;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f53933b = parcel.readInt();
                savedState.f53934c = parcel.readInt();
                int i12 = parcel.readInt();
                savedState.f53935d = i12;
                if (i12 > 0) {
                    int[] iArr = new int[i12];
                    savedState.f53936e = iArr;
                    parcel.readIntArray(iArr);
                }
                int i13 = parcel.readInt();
                savedState.f53937f = i13;
                if (i13 > 0) {
                    int[] iArr2 = new int[i13];
                    savedState.f53938g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.f53940i = parcel.readInt() == 1;
                savedState.f53941j = parcel.readInt() == 1;
                savedState.f53942k = parcel.readInt() == 1;
                savedState.f53939h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeInt(this.f53933b);
            parcel.writeInt(this.f53934c);
            parcel.writeInt(this.f53935d);
            if (this.f53935d > 0) {
                parcel.writeIntArray(this.f53936e);
            }
            parcel.writeInt(this.f53937f);
            if (this.f53937f > 0) {
                parcel.writeIntArray(this.f53938g);
            }
            parcel.writeInt(this.f53940i ? 1 : 0);
            parcel.writeInt(this.f53941j ? 1 : 0);
            parcel.writeInt(this.f53942k ? 1 : 0);
            parcel.writeList(this.f53939h);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.A1();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f53944a;

        /* renamed from: b, reason: collision with root package name */
        public int f53945b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f53946c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53947d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f53948e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f53949f;

        public b() {
            a();
        }

        public final void a() {
            this.f53944a = -1;
            this.f53945b = BeduinInputModel.MIN_TEXT_VERSION;
            this.f53946c = false;
            this.f53947d = false;
            this.f53948e = false;
            int[] iArr = this.f53949f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {

        /* renamed from: f, reason: collision with root package name */
        public d f53951f;
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f53952a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f53953b = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: c, reason: collision with root package name */
        public int f53954c = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: d, reason: collision with root package name */
        public int f53955d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f53956e;

        public d(int i12) {
            this.f53956e = i12;
        }

        public final void a() {
            View view = (View) androidx.appcompat.app.r.j(1, this.f53952a);
            c cVar = (c) view.getLayoutParams();
            this.f53954c = StaggeredGridLayoutManager.this.f53920t.d(view);
            cVar.getClass();
        }

        public final void b() {
            this.f53952a.clear();
            this.f53953b = BeduinInputModel.MIN_TEXT_VERSION;
            this.f53954c = BeduinInputModel.MIN_TEXT_VERSION;
            this.f53955d = 0;
        }

        public final int c() {
            boolean z12 = StaggeredGridLayoutManager.this.f53925y;
            ArrayList<View> arrayList = this.f53952a;
            return z12 ? e(arrayList.size() - 1, -1, false, true) : e(0, arrayList.size(), false, true);
        }

        public final int d() {
            boolean z12 = StaggeredGridLayoutManager.this.f53925y;
            ArrayList<View> arrayList = this.f53952a;
            return z12 ? e(0, arrayList.size(), false, true) : e(arrayList.size() - 1, -1, false, true);
        }

        public final int e(int i12, int i13, boolean z12, boolean z13) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iM2 = staggeredGridLayoutManager.f53920t.m();
            int i14 = staggeredGridLayoutManager.f53920t.i();
            int i15 = i13 > i12 ? 1 : -1;
            while (i12 != i13) {
                View view = this.f53952a.get(i12);
                int iG2 = staggeredGridLayoutManager.f53920t.g(view);
                int iD2 = staggeredGridLayoutManager.f53920t.d(view);
                boolean z14 = false;
                boolean z15 = !z13 ? iG2 >= i14 : iG2 > i14;
                if (!z13 ? iD2 > iM2 : iD2 >= iM2) {
                    z14 = true;
                }
                if (z15 && z14) {
                    if (z12) {
                        return RecyclerView.m.t0(view);
                    }
                    if (iG2 < iM2 || iD2 > i14) {
                        return RecyclerView.m.t0(view);
                    }
                }
                i12 += i15;
            }
            return -1;
        }

        public final int f(int i12) {
            int i13 = this.f53954c;
            if (i13 != Integer.MIN_VALUE) {
                return i13;
            }
            if (this.f53952a.size() == 0) {
                return i12;
            }
            a();
            return this.f53954c;
        }

        public final View g(int i12, int i13) {
            ArrayList<View> arrayList = this.f53952a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i13 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f53925y && RecyclerView.m.t0(view2) >= i12) || ((!staggeredGridLayoutManager.f53925y && RecyclerView.m.t0(view2) <= i12) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    View view3 = arrayList.get(i14);
                    if ((staggeredGridLayoutManager.f53925y && RecyclerView.m.t0(view3) <= i12) || ((!staggeredGridLayoutManager.f53925y && RecyclerView.m.t0(view3) >= i12) || !view3.hasFocusable())) {
                        break;
                    }
                    i14++;
                    view = view3;
                }
            }
            return view;
        }

        public final int h(int i12) {
            int i13 = this.f53953b;
            if (i13 != Integer.MIN_VALUE) {
                return i13;
            }
            if (this.f53952a.size() == 0) {
                return i12;
            }
            View view = this.f53952a.get(0);
            c cVar = (c) view.getLayoutParams();
            this.f53953b = StaggeredGridLayoutManager.this.f53920t.g(view);
            cVar.getClass();
            return this.f53953b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i12, int i13) {
        this.f53918r = -1;
        this.f53925y = false;
        this.f53926z = false;
        this.f53906B = -1;
        this.f53907C = BeduinInputModel.MIN_TEXT_VERSION;
        this.f53908D = new LazySpanLookup();
        this.f53909E = 2;
        this.f53913I = new Rect();
        this.f53914J = new b();
        this.f53915K = true;
        this.f53917M = new a();
        RecyclerView.m.d dVarU0 = RecyclerView.m.u0(context, attributeSet, i12, i13);
        int i14 = dVarU0.f53854a;
        if (i14 != 0 && i14 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        F(null);
        if (i14 != this.f53922v) {
            this.f53922v = i14;
            I i15 = this.f53920t;
            this.f53920t = this.f53921u;
            this.f53921u = i15;
            i1();
        }
        c2(dVarU0.f53855b);
        boolean z12 = dVarU0.f53856c;
        F(null);
        SavedState savedState = this.f53912H;
        if (savedState != null && savedState.f53940i != z12) {
            savedState.f53940i = z12;
        }
        this.f53925y = z12;
        i1();
        this.f53924x = new C23433y();
        this.f53920t = I.b(this, this.f53922v);
        this.f53921u = I.b(this, 1 - this.f53922v);
    }

    public static int f2(int i12, int i13, int i14) {
        if (i13 == 0 && i14 == 0) {
            return i12;
        }
        int mode = View.MeasureSpec.getMode(i12);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - i13) - i14), mode) : i12;
    }

    public final boolean A1() {
        int iL1;
        if (e0() != 0 && this.f53909E != 0 && this.f53842h) {
            if (this.f53926z) {
                iL1 = M1();
                L1();
            } else {
                iL1 = L1();
                M1();
            }
            LazySpanLookup lazySpanLookup = this.f53908D;
            if (iL1 == 0 && Q1() != null) {
                lazySpanLookup.a();
                this.f53841g = true;
                i1();
                return true;
            }
        }
        return false;
    }

    public final int B1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        I i12 = this.f53920t;
        boolean z12 = !this.f53915K;
        return N.a(zVar, i12, G1(z12), F1(z12), this, this.f53915K);
    }

    public final int C1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        I i12 = this.f53920t;
        boolean z12 = !this.f53915K;
        return N.b(zVar, i12, G1(z12), F1(z12), this, this.f53915K, this.f53926z);
    }

    public final int D1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        I i12 = this.f53920t;
        boolean z12 = !this.f53915K;
        return N.c(zVar, i12, G1(z12), F1(z12), this, this.f53915K);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void E0(int i12) {
        super.E0(i12);
        for (int i13 = 0; i13 < this.f53918r; i13++) {
            d dVar = this.f53919s[i13];
            int i14 = dVar.f53953b;
            if (i14 != Integer.MIN_VALUE) {
                dVar.f53953b = i14 + i12;
            }
            int i15 = dVar.f53954c;
            if (i15 != Integer.MIN_VALUE) {
                dVar.f53954c = i15 + i12;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v56 */
    public final int E1(RecyclerView.u uVar, C23433y c23433y, RecyclerView.z zVar) {
        d dVar;
        ?? r12;
        int i12;
        int iE2;
        int iE3;
        int iM2;
        int iE4;
        View view;
        int i13;
        int i14;
        int i15;
        RecyclerView.u uVar2 = uVar;
        int i16 = 0;
        int i17 = 1;
        this.f53905A.set(0, this.f53918r, true);
        C23433y c23433y2 = this.f53924x;
        int i18 = c23433y2.f54208i ? c23433y.f54204e == 1 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION : c23433y.f54204e == 1 ? c23433y.f54206g + c23433y.f54201b : c23433y.f54205f - c23433y.f54201b;
        int i19 = c23433y.f54204e;
        for (int i22 = 0; i22 < this.f53918r; i22++) {
            if (!this.f53919s[i22].f53952a.isEmpty()) {
                e2(this.f53919s[i22], i19, i18);
            }
        }
        int i23 = this.f53926z ? this.f53920t.i() : this.f53920t.m();
        boolean z12 = false;
        while (true) {
            int i24 = c23433y.f54202c;
            int i25 = -1;
            if (((i24 < 0 || i24 >= zVar.b()) ? i16 : i17) == 0 || (!c23433y2.f54208i && this.f53905A.isEmpty())) {
                break;
            }
            View viewD = uVar2.d(c23433y.f54202c);
            c23433y.f54202c += c23433y.f54203d;
            c cVar = (c) viewD.getLayoutParams();
            int layoutPosition = cVar.f53858b.getLayoutPosition();
            LazySpanLookup lazySpanLookup = this.f53908D;
            int[] iArr = lazySpanLookup.f53927a;
            int i26 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i26 == -1) {
                if (U1(c23433y.f54204e)) {
                    i14 = this.f53918r - i17;
                    i15 = -1;
                } else {
                    i25 = this.f53918r;
                    i14 = i16;
                    i15 = i17;
                }
                d dVar2 = null;
                if (c23433y.f54204e == i17) {
                    int iM3 = this.f53920t.m();
                    int i27 = Integer.MAX_VALUE;
                    while (i14 != i25) {
                        d dVar3 = this.f53919s[i14];
                        int iF2 = dVar3.f(iM3);
                        if (iF2 < i27) {
                            i27 = iF2;
                            dVar2 = dVar3;
                        }
                        i14 += i15;
                    }
                } else {
                    int i28 = this.f53920t.i();
                    int i29 = BeduinInputModel.MIN_TEXT_VERSION;
                    while (i14 != i25) {
                        d dVar4 = this.f53919s[i14];
                        int iH2 = dVar4.h(i28);
                        if (iH2 > i29) {
                            dVar2 = dVar4;
                            i29 = iH2;
                        }
                        i14 += i15;
                    }
                }
                dVar = dVar2;
                lazySpanLookup.b(layoutPosition);
                lazySpanLookup.f53927a[layoutPosition] = dVar.f53956e;
            } else {
                dVar = this.f53919s[i26];
            }
            d dVar5 = dVar;
            cVar.f53951f = dVar5;
            if (c23433y.f54204e == 1) {
                D(viewD);
                r12 = 0;
            } else {
                r12 = 0;
                E(viewD, 0, false);
            }
            if (this.f53922v == 1) {
                i12 = 1;
                S1(viewD, RecyclerView.m.f0(this.f53923w, this.f53848n, r12, ((ViewGroup.MarginLayoutParams) cVar).width, r12), RecyclerView.m.f0(this.f53851q, this.f53849o, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true));
            } else {
                i12 = 1;
                S1(viewD, RecyclerView.m.f0(this.f53850p, this.f53848n, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.m.f0(this.f53923w, this.f53849o, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false));
            }
            if (c23433y.f54204e == i12) {
                int iF3 = dVar5.f(i23);
                iE3 = iF3;
                iE2 = this.f53920t.e(viewD) + iF3;
            } else {
                int iH3 = dVar5.h(i23);
                iE2 = iH3;
                iE3 = iH3 - this.f53920t.e(viewD);
            }
            if (c23433y.f54204e == 1) {
                d dVar6 = cVar.f53951f;
                dVar6.getClass();
                c cVar2 = (c) viewD.getLayoutParams();
                cVar2.f53951f = dVar6;
                ArrayList<View> arrayList = dVar6.f53952a;
                arrayList.add(viewD);
                dVar6.f53954c = BeduinInputModel.MIN_TEXT_VERSION;
                if (arrayList.size() == 1) {
                    dVar6.f53953b = BeduinInputModel.MIN_TEXT_VERSION;
                }
                if (cVar2.f53858b.isRemoved() || cVar2.f53858b.isUpdated()) {
                    dVar6.f53955d = StaggeredGridLayoutManager.this.f53920t.e(viewD) + dVar6.f53955d;
                }
            } else {
                d dVar7 = cVar.f53951f;
                dVar7.getClass();
                c cVar3 = (c) viewD.getLayoutParams();
                cVar3.f53951f = dVar7;
                ArrayList<View> arrayList2 = dVar7.f53952a;
                arrayList2.add(0, viewD);
                dVar7.f53953b = BeduinInputModel.MIN_TEXT_VERSION;
                if (arrayList2.size() == 1) {
                    dVar7.f53954c = BeduinInputModel.MIN_TEXT_VERSION;
                }
                if (cVar3.f53858b.isRemoved() || cVar3.f53858b.isUpdated()) {
                    dVar7.f53955d = StaggeredGridLayoutManager.this.f53920t.e(viewD) + dVar7.f53955d;
                }
            }
            if (R1() && this.f53922v == 1) {
                iE4 = this.f53921u.i() - (((this.f53918r - 1) - dVar5.f53956e) * this.f53923w);
                iM2 = iE4 - this.f53921u.e(viewD);
            } else {
                iM2 = this.f53921u.m() + (dVar5.f53956e * this.f53923w);
                iE4 = this.f53921u.e(viewD) + iM2;
            }
            int i32 = iE4;
            int i33 = iM2;
            if (this.f53922v == 1) {
                view = viewD;
                C0(viewD, i33, iE3, i32, iE2);
            } else {
                view = viewD;
                C0(view, iE3, i33, iE2, i32);
            }
            e2(dVar5, c23433y2.f54204e, i18);
            W1(uVar, c23433y2);
            if (c23433y2.f54207h && view.hasFocusable()) {
                i13 = 0;
                this.f53905A.set(dVar5.f53956e, false);
            } else {
                i13 = 0;
            }
            uVar2 = uVar;
            i16 = i13;
            z12 = true;
            i17 = 1;
        }
        RecyclerView.u uVar3 = uVar2;
        int i34 = i16;
        if (!z12) {
            W1(uVar3, c23433y2);
        }
        int iM4 = c23433y2.f54204e == -1 ? this.f53920t.m() - O1(this.f53920t.m()) : N1(this.f53920t.i()) - this.f53920t.i();
        return iM4 > 0 ? Math.min(c23433y.f54201b, iM4) : i34;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void F(String str) {
        if (this.f53912H == null) {
            super.F(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void F0(int i12) {
        super.F0(i12);
        for (int i13 = 0; i13 < this.f53918r; i13++) {
            d dVar = this.f53919s[i13];
            int i14 = dVar.f53953b;
            if (i14 != Integer.MIN_VALUE) {
                dVar.f53953b = i14 + i12;
            }
            int i15 = dVar.f53954c;
            if (i15 != Integer.MIN_VALUE) {
                dVar.f53954c = i15 + i12;
            }
        }
    }

    public final View F1(boolean z12) {
        int iM2 = this.f53920t.m();
        int i12 = this.f53920t.i();
        View view = null;
        for (int iE02 = e0() - 1; iE02 >= 0; iE02--) {
            View viewD0 = d0(iE02);
            int iG2 = this.f53920t.g(viewD0);
            int iD2 = this.f53920t.d(viewD0);
            if (iD2 > iM2 && iG2 < i12) {
                if (iD2 <= i12 || !z12) {
                    return viewD0;
                }
                if (view == null) {
                    view = viewD0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void G0() {
        this.f53908D.a();
        for (int i12 = 0; i12 < this.f53918r; i12++) {
            this.f53919s[i12].b();
        }
    }

    public final View G1(boolean z12) {
        int iM2 = this.f53920t.m();
        int i12 = this.f53920t.i();
        int iE02 = e0();
        View view = null;
        for (int i13 = 0; i13 < iE02; i13++) {
            View viewD0 = d0(i13);
            int iG2 = this.f53920t.g(viewD0);
            if (this.f53920t.d(viewD0) > iM2 && iG2 < i12) {
                if (iG2 >= iM2 || !z12) {
                    return viewD0;
                }
                if (view == null) {
                    view = viewD0;
                }
            }
        }
        return view;
    }

    public final void H1(int[] iArr) {
        if (iArr.length < this.f53918r) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f53918r + ", array size:" + iArr.length);
        }
        for (int i12 = 0; i12 < this.f53918r; i12++) {
            d dVar = this.f53919s[i12];
            boolean z12 = StaggeredGridLayoutManager.this.f53925y;
            ArrayList<View> arrayList = dVar.f53952a;
            iArr[i12] = z12 ? dVar.e(arrayList.size() - 1, -1, true, false) : dVar.e(0, arrayList.size(), true, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean I() {
        return this.f53922v == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        Runnable runnable = this.f53917M;
        RecyclerView recyclerView2 = this.f53837c;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i12 = 0; i12 < this.f53918r; i12++) {
            this.f53919s[i12].b();
        }
        recyclerView.requestLayout();
    }

    public final void I1(int[] iArr) {
        if (iArr.length < this.f53918r) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f53918r + ", array size:" + iArr.length);
        }
        for (int i12 = 0; i12 < this.f53918r; i12++) {
            d dVar = this.f53919s[i12];
            boolean z12 = StaggeredGridLayoutManager.this.f53925y;
            ArrayList<View> arrayList = dVar.f53952a;
            iArr[i12] = z12 ? dVar.e(0, arrayList.size(), true, false) : dVar.e(arrayList.size() - 1, -1, true, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        return this.f53922v == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View J0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.u r11, androidx.recyclerview.widget.RecyclerView.z r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public final void J1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z12) {
        int i12;
        int iN1 = N1(BeduinInputModel.MIN_TEXT_VERSION);
        if (iN1 != Integer.MIN_VALUE && (i12 = this.f53920t.i() - iN1) > 0) {
            int i13 = i12 - (-a2(-i12, uVar, zVar));
            if (!z12 || i13 <= 0) {
                return;
            }
            this.f53920t.r(i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (e0() > 0) {
            View viewG1 = G1(false);
            View viewF1 = F1(false);
            if (viewG1 == null || viewF1 == null) {
                return;
            }
            int iT02 = RecyclerView.m.t0(viewG1);
            int iT03 = RecyclerView.m.t0(viewF1);
            if (iT02 < iT03) {
                accessibilityEvent.setFromIndex(iT02);
                accessibilityEvent.setToIndex(iT03);
            } else {
                accessibilityEvent.setFromIndex(iT03);
                accessibilityEvent.setToIndex(iT02);
            }
        }
    }

    public final void K1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z12) {
        int iM2;
        int iO1 = O1(Integer.MAX_VALUE);
        if (iO1 != Integer.MAX_VALUE && (iM2 = iO1 - this.f53920t.m()) > 0) {
            int iA2 = iM2 - a2(iM2, uVar, zVar);
            if (!z12 || iA2 <= 0) {
                return;
            }
            this.f53920t.r(-iA2);
        }
    }

    public final int L1() {
        if (e0() == 0) {
            return 0;
        }
        return RecyclerView.m.t0(d0(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @RestrictTo
    public final void M(int i12, int i13, RecyclerView.z zVar, RecyclerView.m.c cVar) {
        C23433y c23433y;
        int iF2;
        int iH2;
        if (this.f53922v != 0) {
            i12 = i13;
        }
        if (e0() == 0 || i12 == 0) {
            return;
        }
        V1(i12, zVar);
        int[] iArr = this.f53916L;
        if (iArr == null || iArr.length < this.f53918r) {
            this.f53916L = new int[this.f53918r];
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = this.f53918r;
            c23433y = this.f53924x;
            if (i14 >= i16) {
                break;
            }
            if (c23433y.f54203d == -1) {
                iF2 = c23433y.f54205f;
                iH2 = this.f53919s[i14].h(iF2);
            } else {
                iF2 = this.f53919s[i14].f(c23433y.f54206g);
                iH2 = c23433y.f54206g;
            }
            int i17 = iF2 - iH2;
            if (i17 >= 0) {
                this.f53916L[i15] = i17;
                i15++;
            }
            i14++;
        }
        Arrays.sort(this.f53916L, 0, i15);
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = c23433y.f54202c;
            if (i19 < 0 || i19 >= zVar.b()) {
                return;
            }
            ((r.b) cVar).a(c23433y.f54202c, this.f53916L[i18]);
            c23433y.f54202c += c23433y.f54203d;
        }
    }

    public final int M1() {
        int iE02 = e0();
        if (iE02 == 0) {
            return 0;
        }
        return RecyclerView.m.t0(d0(iE02 - 1));
    }

    public final int N1(int i12) {
        int iF2 = this.f53919s[0].f(i12);
        for (int i13 = 1; i13 < this.f53918r; i13++) {
            int iF3 = this.f53919s[i13].f(i12);
            if (iF3 > iF2) {
                iF2 = iF3;
            }
        }
        return iF2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int O(RecyclerView.z zVar) {
        return B1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void O0(int i12, int i13) {
        P1(i12, i13, 1);
    }

    public final int O1(int i12) {
        int iH2 = this.f53919s[0].h(i12);
        for (int i13 = 1; i13 < this.f53918r; i13++) {
            int iH3 = this.f53919s[i13].h(i12);
            if (iH3 < iH2) {
                iH2 = iH3;
            }
        }
        return iH2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int P(RecyclerView.z zVar) {
        return C1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void P0() {
        this.f53908D.a();
        i1();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P1(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int Q(RecyclerView.z zVar) {
        return D1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Q0(int i12, int i13) {
        P1(i12, i13, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q1() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int R(RecyclerView.z zVar) {
        return B1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R0(int i12, int i13) {
        P1(i12, i13, 2);
    }

    public final boolean R1() {
        return q0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int S(RecyclerView.z zVar) {
        return C1(zVar);
    }

    public final void S1(View view, int i12, int i13) {
        Rect rect = this.f53913I;
        H(view, rect);
        c cVar = (c) view.getLayoutParams();
        int iF2 = f2(i12, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iF22 = f2(i13, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (t1(view, iF2, iF22, cVar)) {
            view.measure(iF2, iF22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int T(RecyclerView.z zVar) {
        return D1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void T0(RecyclerView recyclerView, int i12, int i13) {
        P1(i12, i13, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(androidx.recyclerview.widget.RecyclerView.u r17, androidx.recyclerview.widget.RecyclerView.z r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U0(RecyclerView.u uVar, RecyclerView.z zVar) {
        T1(uVar, zVar, true);
    }

    public final boolean U1(int i12) {
        if (this.f53922v == 0) {
            return (i12 == -1) != this.f53926z;
        }
        return ((i12 == -1) == this.f53926z) == R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void V0(RecyclerView.z zVar) {
        this.f53906B = -1;
        this.f53907C = BeduinInputModel.MIN_TEXT_VERSION;
        this.f53912H = null;
        this.f53914J.a();
    }

    public final void V1(int i12, RecyclerView.z zVar) {
        int iL1;
        int i13;
        if (i12 > 0) {
            iL1 = M1();
            i13 = 1;
        } else {
            iL1 = L1();
            i13 = -1;
        }
        C23433y c23433y = this.f53924x;
        c23433y.f54200a = true;
        d2(iL1, zVar);
        b2(i13);
        c23433y.f54202c = iL1 + c23433y.f54203d;
        c23433y.f54201b = Math.abs(i12);
    }

    public final void W1(RecyclerView.u uVar, C23433y c23433y) {
        if (!c23433y.f54200a || c23433y.f54208i) {
            return;
        }
        if (c23433y.f54201b == 0) {
            if (c23433y.f54204e == -1) {
                X1(uVar, c23433y.f54206g);
                return;
            } else {
                Y1(uVar, c23433y.f54205f);
                return;
            }
        }
        int i12 = 1;
        if (c23433y.f54204e == -1) {
            int i13 = c23433y.f54205f;
            int iH2 = this.f53919s[0].h(i13);
            while (i12 < this.f53918r) {
                int iH3 = this.f53919s[i12].h(i13);
                if (iH3 > iH2) {
                    iH2 = iH3;
                }
                i12++;
            }
            int i14 = i13 - iH2;
            X1(uVar, i14 < 0 ? c23433y.f54206g : c23433y.f54206g - Math.min(i14, c23433y.f54201b));
            return;
        }
        int i15 = c23433y.f54206g;
        int iF2 = this.f53919s[0].f(i15);
        while (i12 < this.f53918r) {
            int iF3 = this.f53919s[i12].f(i15);
            if (iF3 < iF2) {
                iF2 = iF3;
            }
            i12++;
        }
        int i16 = iF2 - c23433y.f54206g;
        Y1(uVar, i16 < 0 ? c23433y.f54205f : Math.min(i16, c23433y.f54201b) + c23433y.f54205f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f53912H = savedState;
            if (this.f53906B != -1) {
                savedState.f53936e = null;
                savedState.f53935d = 0;
                savedState.f53933b = -1;
                savedState.f53934c = -1;
                savedState.f53936e = null;
                savedState.f53935d = 0;
                savedState.f53937f = 0;
                savedState.f53938g = null;
                savedState.f53939h = null;
            }
            i1();
        }
    }

    public final void X1(RecyclerView.u uVar, int i12) {
        for (int iE02 = e0() - 1; iE02 >= 0; iE02--) {
            View viewD0 = d0(iE02);
            if (this.f53920t.g(viewD0) < i12 || this.f53920t.q(viewD0) < i12) {
                return;
            }
            c cVar = (c) viewD0.getLayoutParams();
            cVar.getClass();
            if (cVar.f53951f.f53952a.size() == 1) {
                return;
            }
            d dVar = cVar.f53951f;
            ArrayList<View> arrayList = dVar.f53952a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f53951f = null;
            if (cVar2.f53858b.isRemoved() || cVar2.f53858b.isUpdated()) {
                dVar.f53955d -= StaggeredGridLayoutManager.this.f53920t.e(viewRemove);
            }
            if (size == 1) {
                dVar.f53953b = BeduinInputModel.MIN_TEXT_VERSION;
            }
            dVar.f53954c = BeduinInputModel.MIN_TEXT_VERSION;
            e1(viewD0, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable Y0() {
        int iH2;
        int iM2;
        int[] iArr;
        if (this.f53912H != null) {
            SavedState savedState = this.f53912H;
            SavedState savedState2 = new SavedState();
            savedState2.f53935d = savedState.f53935d;
            savedState2.f53933b = savedState.f53933b;
            savedState2.f53934c = savedState.f53934c;
            savedState2.f53936e = savedState.f53936e;
            savedState2.f53937f = savedState.f53937f;
            savedState2.f53938g = savedState.f53938g;
            savedState2.f53940i = savedState.f53940i;
            savedState2.f53941j = savedState.f53941j;
            savedState2.f53942k = savedState.f53942k;
            savedState2.f53939h = savedState.f53939h;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f53940i = this.f53925y;
        savedState3.f53941j = this.f53910F;
        savedState3.f53942k = this.f53911G;
        LazySpanLookup lazySpanLookup = this.f53908D;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f53927a) == null) {
            savedState3.f53937f = 0;
        } else {
            savedState3.f53938g = iArr;
            savedState3.f53937f = iArr.length;
            savedState3.f53939h = lazySpanLookup.f53928b;
        }
        if (e0() > 0) {
            savedState3.f53933b = this.f53910F ? M1() : L1();
            View viewF1 = this.f53926z ? F1(true) : G1(true);
            savedState3.f53934c = viewF1 != null ? RecyclerView.m.t0(viewF1) : -1;
            int i12 = this.f53918r;
            savedState3.f53935d = i12;
            savedState3.f53936e = new int[i12];
            for (int i13 = 0; i13 < this.f53918r; i13++) {
                if (this.f53910F) {
                    iH2 = this.f53919s[i13].f(BeduinInputModel.MIN_TEXT_VERSION);
                    if (iH2 != Integer.MIN_VALUE) {
                        iM2 = this.f53920t.i();
                        iH2 -= iM2;
                    }
                } else {
                    iH2 = this.f53919s[i13].h(BeduinInputModel.MIN_TEXT_VERSION);
                    if (iH2 != Integer.MIN_VALUE) {
                        iM2 = this.f53920t.m();
                        iH2 -= iM2;
                    }
                }
                savedState3.f53936e[i13] = iH2;
            }
        } else {
            savedState3.f53933b = -1;
            savedState3.f53934c = -1;
            savedState3.f53935d = 0;
        }
        return savedState3;
    }

    public final void Y1(RecyclerView.u uVar, int i12) {
        while (e0() > 0) {
            View viewD0 = d0(0);
            if (this.f53920t.d(viewD0) > i12 || this.f53920t.p(viewD0) > i12) {
                return;
            }
            c cVar = (c) viewD0.getLayoutParams();
            cVar.getClass();
            if (cVar.f53951f.f53952a.size() == 1) {
                return;
            }
            d dVar = cVar.f53951f;
            ArrayList<View> arrayList = dVar.f53952a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f53951f = null;
            if (arrayList.size() == 0) {
                dVar.f53954c = BeduinInputModel.MIN_TEXT_VERSION;
            }
            if (cVar2.f53858b.isRemoved() || cVar2.f53858b.isUpdated()) {
                dVar.f53955d -= StaggeredGridLayoutManager.this.f53920t.e(viewRemove);
            }
            dVar.f53953b = BeduinInputModel.MIN_TEXT_VERSION;
            e1(viewD0, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Z0(int i12) {
        if (i12 == 0) {
            A1();
        }
    }

    public final void Z1() {
        if (this.f53922v == 1 || !R1()) {
            this.f53926z = this.f53925y;
        } else {
            this.f53926z = !this.f53925y;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n a0() {
        return this.f53922v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final int a2(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (e0() == 0 || i12 == 0) {
            return 0;
        }
        V1(i12, zVar);
        C23433y c23433y = this.f53924x;
        int iE1 = E1(uVar, c23433y, zVar);
        if (c23433y.f54201b >= iE1) {
            i12 = i12 < 0 ? -iE1 : iE1;
        }
        this.f53920t.r(-i12);
        this.f53910F = this.f53926z;
        c23433y.f54201b = 0;
        W1(uVar, c23433y);
        return i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n b0(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final void b2(int i12) {
        C23433y c23433y = this.f53924x;
        c23433y.f54204e = i12;
        c23433y.f54203d = this.f53926z != (i12 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n c0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void c2(int i12) {
        F(null);
        if (i12 != this.f53918r) {
            this.f53908D.a();
            i1();
            this.f53918r = i12;
            this.f53905A = new BitSet(this.f53918r);
            this.f53919s = new d[this.f53918r];
            for (int i13 = 0; i13 < this.f53918r; i13++) {
                this.f53919s[i13] = new d(i13);
            }
            i1();
        }
    }

    public final void d2(int i12, RecyclerView.z zVar) {
        int iN2;
        int iN3;
        int i13;
        C23433y c23433y = this.f53924x;
        boolean z12 = false;
        c23433y.f54201b = 0;
        c23433y.f54202c = i12;
        if (!z0() || (i13 = zVar.f53891a) == -1) {
            iN2 = 0;
            iN3 = 0;
        } else {
            if (this.f53926z == (i13 < i12)) {
                iN2 = this.f53920t.n();
                iN3 = 0;
            } else {
                iN3 = this.f53920t.n();
                iN2 = 0;
            }
        }
        RecyclerView recyclerView = this.f53837c;
        if (recyclerView == null || !recyclerView.f53775h) {
            c23433y.f54206g = this.f53920t.h() + iN2;
            c23433y.f54205f = -iN3;
        } else {
            c23433y.f54205f = this.f53920t.m() - iN3;
            c23433y.f54206g = this.f53920t.i() + iN2;
        }
        c23433y.f54207h = false;
        c23433y.f54200a = true;
        if (this.f53920t.k() == 0 && this.f53920t.h() == 0) {
            z12 = true;
        }
        c23433y.f54208i = z12;
    }

    public final void e2(d dVar, int i12, int i13) {
        int i14 = dVar.f53955d;
        int i15 = dVar.f53956e;
        if (i12 != -1) {
            int i16 = dVar.f53954c;
            if (i16 == Integer.MIN_VALUE) {
                dVar.a();
                i16 = dVar.f53954c;
            }
            if (i16 - i14 >= i13) {
                this.f53905A.set(i15, false);
                return;
            }
            return;
        }
        int i17 = dVar.f53953b;
        if (i17 == Integer.MIN_VALUE) {
            View view = dVar.f53952a.get(0);
            c cVar = (c) view.getLayoutParams();
            dVar.f53953b = StaggeredGridLayoutManager.this.f53920t.g(view);
            cVar.getClass();
            i17 = dVar.f53953b;
        }
        if (i17 + i14 <= i13) {
            this.f53905A.set(i15, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        return a2(i12, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l1(int i12) {
        SavedState savedState = this.f53912H;
        if (savedState != null && savedState.f53933b != i12) {
            savedState.f53936e = null;
            savedState.f53935d = 0;
            savedState.f53933b = -1;
            savedState.f53934c = -1;
        }
        this.f53906B = i12;
        this.f53907C = BeduinInputModel.MIN_TEXT_VERSION;
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        return a2(i12, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF o(int i12) {
        int iZ1 = z1(i12);
        PointF pointF = new PointF();
        if (iZ1 == 0) {
            return null;
        }
        if (this.f53922v == 0) {
            pointF.x = iZ1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iZ1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q1(Rect rect, int i12, int i13) {
        int iL2;
        int iL3;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f53922v == 1) {
            iL3 = RecyclerView.m.L(i13, rect.height() + paddingBottom, r0());
            iL2 = RecyclerView.m.L(i12, (this.f53923w * this.f53918r) + paddingRight, s0());
        } else {
            iL2 = RecyclerView.m.L(i12, rect.width() + paddingRight, s0());
            iL3 = RecyclerView.m.L(i13, (this.f53923w * this.f53918r) + paddingBottom, r0());
        }
        this.f53837c.setMeasuredDimension(iL2, iL3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void w1(int i12, RecyclerView recyclerView) {
        C23434z c23434z = new C23434z(recyclerView.getContext());
        c23434z.f53878a = i12;
        x1(c23434z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean x0() {
        return this.f53909E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean y1() {
        return this.f53912H == null;
    }

    public final int z1(int i12) {
        if (e0() == 0) {
            return this.f53926z ? 1 : -1;
        }
        return (i12 < L1()) != this.f53926z ? -1 : 1;
    }

    public StaggeredGridLayoutManager(int i12, int i13) {
        this.f53918r = -1;
        this.f53925y = false;
        this.f53926z = false;
        this.f53906B = -1;
        this.f53907C = BeduinInputModel.MIN_TEXT_VERSION;
        this.f53908D = new LazySpanLookup();
        this.f53909E = 2;
        this.f53913I = new Rect();
        this.f53914J = new b();
        this.f53915K = true;
        this.f53917M = new a();
        this.f53922v = i13;
        c2(i12);
        this.f53924x = new C23433y();
        this.f53920t = I.b(this, this.f53922v);
        this.f53921u = I.b(this, 1 - this.f53922v);
    }
}
