package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;

/* loaded from: classes10.dex */
public class LinearLayoutManager extends RecyclerView.m implements C23427s.h, RecyclerView.y.b {

    /* renamed from: A, reason: collision with root package name */
    public int f53684A;

    /* renamed from: B, reason: collision with root package name */
    public SavedState f53685B;

    /* renamed from: C, reason: collision with root package name */
    public final a f53686C;

    /* renamed from: D, reason: collision with root package name */
    public final b f53687D;

    /* renamed from: E, reason: collision with root package name */
    public int f53688E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f53689F;

    /* renamed from: r, reason: collision with root package name */
    public int f53690r;

    /* renamed from: s, reason: collision with root package name */
    public c f53691s;

    /* renamed from: t, reason: collision with root package name */
    public I f53692t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f53693u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f53694v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f53695w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f53696x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f53697y;

    /* renamed from: z, reason: collision with root package name */
    public int f53698z;

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f53699b;

        /* renamed from: c, reason: collision with root package name */
        public int f53700c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53701d;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f53699b = parcel.readInt();
                savedState.f53700c = parcel.readInt();
                savedState.f53701d = parcel.readInt() == 1;
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
            parcel.writeInt(this.f53699b);
            parcel.writeInt(this.f53700c);
            parcel.writeInt(this.f53701d ? 1 : 0);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public I f53702a;

        /* renamed from: b, reason: collision with root package name */
        public int f53703b;

        /* renamed from: c, reason: collision with root package name */
        public int f53704c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53705d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f53706e;

        public a() {
            d();
        }

        public final void a() {
            this.f53704c = this.f53705d ? this.f53702a.i() : this.f53702a.m();
        }

        public final void b(View view, int i12) {
            if (this.f53705d) {
                this.f53704c = this.f53702a.o() + this.f53702a.d(view);
            } else {
                this.f53704c = this.f53702a.g(view);
            }
            this.f53703b = i12;
        }

        public final void c(View view, int i12) {
            int iO2 = this.f53702a.o();
            if (iO2 >= 0) {
                b(view, i12);
                return;
            }
            this.f53703b = i12;
            if (!this.f53705d) {
                int iG2 = this.f53702a.g(view);
                int iM2 = iG2 - this.f53702a.m();
                this.f53704c = iG2;
                if (iM2 > 0) {
                    int i13 = (this.f53702a.i() - Math.min(0, (this.f53702a.i() - iO2) - this.f53702a.d(view))) - (this.f53702a.e(view) + iG2);
                    if (i13 < 0) {
                        this.f53704c -= Math.min(iM2, -i13);
                        return;
                    }
                    return;
                }
                return;
            }
            int i14 = (this.f53702a.i() - iO2) - this.f53702a.d(view);
            this.f53704c = this.f53702a.i() - i14;
            if (i14 > 0) {
                int iE2 = this.f53704c - this.f53702a.e(view);
                int iM3 = this.f53702a.m();
                int iMin = iE2 - (Math.min(this.f53702a.g(view) - iM3, 0) + iM3);
                if (iMin < 0) {
                    this.f53704c = Math.min(i14, -iMin) + this.f53704c;
                }
            }
        }

        public final void d() {
            this.f53703b = -1;
            this.f53704c = BeduinInputModel.MIN_TEXT_VERSION;
            this.f53705d = false;
            this.f53706e = false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f53703b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f53704c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f53705d);
            sb2.append(", mValid=");
            return androidx.appcompat.app.r.x(sb2, this.f53706e, '}');
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f53707a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f53708b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f53709c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53710d;
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f53712b;

        /* renamed from: c, reason: collision with root package name */
        public int f53713c;

        /* renamed from: d, reason: collision with root package name */
        public int f53714d;

        /* renamed from: e, reason: collision with root package name */
        public int f53715e;

        /* renamed from: f, reason: collision with root package name */
        public int f53716f;

        /* renamed from: g, reason: collision with root package name */
        public int f53717g;

        /* renamed from: j, reason: collision with root package name */
        public int f53720j;

        /* renamed from: l, reason: collision with root package name */
        public boolean f53722l;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53711a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f53718h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f53719i = 0;

        /* renamed from: k, reason: collision with root package name */
        public List<RecyclerView.C> f53721k = null;

        public final void a(View view) {
            int layoutPosition;
            int size = this.f53721k.size();
            View view2 = null;
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < size; i13++) {
                View view3 = this.f53721k.get(i13).itemView;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.f53858b.isRemoved() && (layoutPosition = (nVar.f53858b.getLayoutPosition() - this.f53714d) * this.f53715e) >= 0 && layoutPosition < i12) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i12 = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f53714d = -1;
            } else {
                this.f53714d = ((RecyclerView.n) view2.getLayoutParams()).f53858b.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.u uVar) {
            List<RecyclerView.C> list = this.f53721k;
            if (list == null) {
                View viewD = uVar.d(this.f53714d);
                this.f53714d += this.f53715e;
                return viewD;
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = this.f53721k.get(i12).itemView;
                RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                if (!nVar.f53858b.isRemoved() && this.f53714d == nVar.f53858b.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public void A1(RecyclerView.z zVar, c cVar, RecyclerView.m.c cVar2) {
        int i12 = cVar.f53714d;
        if (i12 < 0 || i12 >= zVar.b()) {
            return;
        }
        ((r.b) cVar2).a(i12, Math.max(0, cVar.f53717g));
    }

    public final int B1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        F1();
        I i12 = this.f53692t;
        boolean z12 = !this.f53697y;
        return N.a(zVar, i12, J1(z12), I1(z12), this, this.f53697y);
    }

    public final int C1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        F1();
        I i12 = this.f53692t;
        boolean z12 = !this.f53697y;
        return N.b(zVar, i12, J1(z12), I1(z12), this, this.f53697y, this.f53695w);
    }

    public final int D1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        F1();
        I i12 = this.f53692t;
        boolean z12 = !this.f53697y;
        return N.c(zVar, i12, J1(z12), I1(z12), this, this.f53697y);
    }

    public final int E1(int i12) {
        if (i12 == 1) {
            return (this.f53690r != 1 && U1()) ? 1 : -1;
        }
        if (i12 == 2) {
            return (this.f53690r != 1 && U1()) ? -1 : 1;
        }
        if (i12 == 17) {
            if (this.f53690r == 0) {
                return -1;
            }
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (i12 == 33) {
            if (this.f53690r == 1) {
                return -1;
            }
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (i12 == 66) {
            if (this.f53690r == 0) {
                return 1;
            }
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (i12 == 130 && this.f53690r == 1) {
            return 1;
        }
        return BeduinInputModel.MIN_TEXT_VERSION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void F(String str) {
        if (this.f53685B == null) {
            super.F(str);
        }
    }

    public final void F1() {
        if (this.f53691s == null) {
            this.f53691s = new c();
        }
    }

    public final int G1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z12) {
        int i12;
        int i13 = cVar.f53713c;
        int i14 = cVar.f53717g;
        if (i14 != Integer.MIN_VALUE) {
            if (i13 < 0) {
                cVar.f53717g = i14 + i13;
            }
            X1(uVar, cVar);
        }
        int i15 = cVar.f53713c + cVar.f53718h;
        while (true) {
            if ((!cVar.f53722l && i15 <= 0) || (i12 = cVar.f53714d) < 0 || i12 >= zVar.b()) {
                break;
            }
            b bVar = this.f53687D;
            bVar.f53707a = 0;
            bVar.f53708b = false;
            bVar.f53709c = false;
            bVar.f53710d = false;
            V1(uVar, zVar, cVar, bVar);
            if (!bVar.f53708b) {
                int i16 = cVar.f53712b;
                int i17 = bVar.f53707a;
                cVar.f53712b = (cVar.f53716f * i17) + i16;
                if (!bVar.f53709c || cVar.f53721k != null || !zVar.f53897g) {
                    cVar.f53713c -= i17;
                    i15 -= i17;
                }
                int i18 = cVar.f53717g;
                if (i18 != Integer.MIN_VALUE) {
                    int i19 = i18 + i17;
                    cVar.f53717g = i19;
                    int i22 = cVar.f53713c;
                    if (i22 < 0) {
                        cVar.f53717g = i19 + i22;
                    }
                    X1(uVar, cVar);
                }
                if (z12 && bVar.f53710d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i13 - cVar.f53713c;
    }

    public final int H1() {
        View viewO1 = O1(0, e0(), true, false);
        if (viewO1 == null) {
            return -1;
        }
        return RecyclerView.m.t0(viewO1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean I() {
        return this.f53690r == 0;
    }

    public final View I1(boolean z12) {
        return this.f53695w ? O1(0, e0(), z12, true) : O1(e0() - 1, -1, z12, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean J() {
        return this.f53690r == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View J0(View view, int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iE1;
        Z1();
        if (e0() == 0 || (iE1 = E1(i12)) == Integer.MIN_VALUE) {
            return null;
        }
        F1();
        e2(iE1, (int) (this.f53692t.n() * 0.33333334f), false, zVar);
        c cVar = this.f53691s;
        cVar.f53717g = BeduinInputModel.MIN_TEXT_VERSION;
        cVar.f53711a = false;
        G1(uVar, cVar, zVar, true);
        View viewN1 = iE1 == -1 ? this.f53695w ? N1(e0() - 1, -1) : N1(0, e0()) : this.f53695w ? N1(0, e0()) : N1(e0() - 1, -1);
        View viewT1 = iE1 == -1 ? T1() : S1();
        if (!viewT1.hasFocusable()) {
            return viewN1;
        }
        if (viewN1 == null) {
            return null;
        }
        return viewT1;
    }

    public final View J1(boolean z12) {
        return this.f53695w ? O1(e0() - 1, -1, z12, true) : O1(0, e0(), z12, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (e0() > 0) {
            accessibilityEvent.setFromIndex(K1());
            accessibilityEvent.setToIndex(M1());
        }
    }

    public final int K1() {
        View viewO1 = O1(0, e0(), false, true);
        if (viewO1 == null) {
            return -1;
        }
        return RecyclerView.m.t0(viewO1);
    }

    public final int L1() {
        View viewO1 = O1(e0() - 1, -1, true, false);
        if (viewO1 == null) {
            return -1;
        }
        return RecyclerView.m.t0(viewO1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void M(int i12, int i13, RecyclerView.z zVar, RecyclerView.m.c cVar) {
        if (this.f53690r != 0) {
            i12 = i13;
        }
        if (e0() == 0 || i12 == 0) {
            return;
        }
        F1();
        e2(i12 > 0 ? 1 : -1, Math.abs(i12), true, zVar);
        A1(zVar, this.f53691s, cVar);
    }

    public final int M1() {
        View viewO1 = O1(e0() - 1, -1, false, true);
        if (viewO1 == null) {
            return -1;
        }
        return RecyclerView.m.t0(viewO1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void N(int i12, RecyclerView.m.c cVar) {
        boolean z12;
        int i13;
        SavedState savedState = this.f53685B;
        if (savedState == null || (i13 = savedState.f53699b) < 0) {
            Z1();
            z12 = this.f53695w;
            i13 = this.f53698z;
            if (i13 == -1) {
                i13 = z12 ? i12 - 1 : 0;
            }
        } else {
            z12 = savedState.f53701d;
        }
        int i14 = z12 ? -1 : 1;
        for (int i15 = 0; i15 < this.f53688E && i13 >= 0 && i13 < i12; i15++) {
            ((r.b) cVar).a(i13, 0);
            i13 += i14;
        }
    }

    public final View N1(int i12, int i13) {
        int i14;
        int i15;
        F1();
        if (i13 <= i12 && i13 >= i12) {
            return d0(i12);
        }
        if (this.f53692t.g(d0(i12)) < this.f53692t.m()) {
            i14 = 16644;
            i15 = 16388;
        } else {
            i14 = 4161;
            i15 = 4097;
        }
        return this.f53690r == 0 ? this.f53838d.a(i12, i13, i14, i15) : this.f53839e.a(i12, i13, i14, i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int O(RecyclerView.z zVar) {
        return B1(zVar);
    }

    public final View O1(int i12, int i13, boolean z12, boolean z13) {
        F1();
        int i14 = z12 ? 24579 : 320;
        int i15 = z13 ? 320 : 0;
        return this.f53690r == 0 ? this.f53838d.a(i12, i13, i14, i15) : this.f53839e.a(i12, i13, i14, i15);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int P(RecyclerView.z zVar) {
        return C1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View P1(androidx.recyclerview.widget.RecyclerView.u r17, androidx.recyclerview.widget.RecyclerView.z r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.F1()
            int r1 = r16.e0()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.e0()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.I r7 = r0.f53692t
            int r7 = r7.m()
            androidx.recyclerview.widget.I r8 = r0.f53692t
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.d0(r1)
            int r13 = androidx.recyclerview.widget.RecyclerView.m.t0(r12)
            androidx.recyclerview.widget.I r14 = r0.f53692t
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.I r15 = r0.f53692t
            int r15 = r15.d(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r13 = (androidx.recyclerview.widget.RecyclerView.n) r13
            androidx.recyclerview.widget.RecyclerView$C r13 = r13.f53858b
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            goto L84
        L7f:
            if (r10 == 0) goto L83
            r9 = r10
            goto L84
        L83:
            r9 = r11
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.P1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int Q(RecyclerView.z zVar) {
        return D1(zVar);
    }

    public final int Q1(int i12, RecyclerView.u uVar, RecyclerView.z zVar, boolean z12) {
        int i13;
        int i14 = this.f53692t.i() - i12;
        if (i14 <= 0) {
            return 0;
        }
        int i15 = -a2(-i14, uVar, zVar);
        int i16 = i12 + i15;
        if (!z12 || (i13 = this.f53692t.i() - i16) <= 0) {
            return i15;
        }
        this.f53692t.r(i13);
        return i13 + i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int R(RecyclerView.z zVar) {
        return B1(zVar);
    }

    public final int R1(int i12, RecyclerView.u uVar, RecyclerView.z zVar, boolean z12) {
        int iM2;
        int iM3 = i12 - this.f53692t.m();
        if (iM3 <= 0) {
            return 0;
        }
        int i13 = -a2(iM3, uVar, zVar);
        int i14 = i12 + i13;
        if (!z12 || (iM2 = i14 - this.f53692t.m()) <= 0) {
            return i13;
        }
        this.f53692t.r(-iM2);
        return i13 - iM2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int S(RecyclerView.z zVar) {
        return C1(zVar);
    }

    public final View S1() {
        return d0(this.f53695w ? 0 : e0() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int T(RecyclerView.z zVar) {
        return D1(zVar);
    }

    public final View T1() {
        return d0(this.f53695w ? e0() - 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U0(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.U0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public final boolean U1() {
        return q0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void V0(RecyclerView.z zVar) {
        this.f53685B = null;
        this.f53698z = -1;
        this.f53684A = BeduinInputModel.MIN_TEXT_VERSION;
        this.f53686C.d();
    }

    public void V1(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i12;
        int i13;
        int i14;
        int paddingLeft;
        int iF2;
        View viewB = cVar.b(uVar);
        if (viewB == null) {
            bVar.f53708b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) viewB.getLayoutParams();
        if (cVar.f53721k == null) {
            if (this.f53695w == (cVar.f53716f == -1)) {
                D(viewB);
            } else {
                E(viewB, 0, false);
            }
        } else {
            if (this.f53695w == (cVar.f53716f == -1)) {
                E(viewB, -1, true);
            } else {
                E(viewB, 0, true);
            }
        }
        D0(viewB);
        bVar.f53707a = this.f53692t.e(viewB);
        if (this.f53690r == 1) {
            if (U1()) {
                iF2 = this.f53850p - getPaddingRight();
                paddingLeft = iF2 - this.f53692t.f(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iF2 = this.f53692t.f(viewB) + paddingLeft;
            }
            if (cVar.f53716f == -1) {
                int i15 = cVar.f53712b;
                i14 = i15;
                i13 = iF2;
                i12 = i15 - bVar.f53707a;
            } else {
                int i16 = cVar.f53712b;
                i12 = i16;
                i13 = iF2;
                i14 = bVar.f53707a + i16;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF3 = this.f53692t.f(viewB) + paddingTop;
            if (cVar.f53716f == -1) {
                int i17 = cVar.f53712b;
                i13 = i17;
                i12 = paddingTop;
                i14 = iF3;
                paddingLeft = i17 - bVar.f53707a;
            } else {
                int i18 = cVar.f53712b;
                i12 = paddingTop;
                i13 = bVar.f53707a + i18;
                i14 = iF3;
                paddingLeft = i18;
            }
        }
        C0(viewB, paddingLeft, i12, i13, i14);
        if (nVar.f53858b.isRemoved() || nVar.f53858b.isUpdated()) {
            bVar.f53709c = true;
        }
        bVar.f53710d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f53685B = savedState;
            if (this.f53698z != -1) {
                savedState.f53699b = -1;
            }
            i1();
        }
    }

    public final void X1(RecyclerView.u uVar, c cVar) {
        if (!cVar.f53711a || cVar.f53722l) {
            return;
        }
        int i12 = cVar.f53717g;
        int i13 = cVar.f53719i;
        if (cVar.f53716f == -1) {
            int iE02 = e0();
            if (i12 < 0) {
                return;
            }
            int iH2 = (this.f53692t.h() - i12) + i13;
            if (this.f53695w) {
                for (int i14 = 0; i14 < iE02; i14++) {
                    View viewD0 = d0(i14);
                    if (this.f53692t.g(viewD0) < iH2 || this.f53692t.q(viewD0) < iH2) {
                        Y1(uVar, 0, i14);
                        return;
                    }
                }
                return;
            }
            int i15 = iE02 - 1;
            for (int i16 = i15; i16 >= 0; i16--) {
                View viewD02 = d0(i16);
                if (this.f53692t.g(viewD02) < iH2 || this.f53692t.q(viewD02) < iH2) {
                    Y1(uVar, i15, i16);
                    return;
                }
            }
            return;
        }
        if (i12 < 0) {
            return;
        }
        int i17 = i12 - i13;
        int iE03 = e0();
        if (!this.f53695w) {
            for (int i18 = 0; i18 < iE03; i18++) {
                View viewD03 = d0(i18);
                if (this.f53692t.d(viewD03) > i17 || this.f53692t.p(viewD03) > i17) {
                    Y1(uVar, 0, i18);
                    return;
                }
            }
            return;
        }
        int i19 = iE03 - 1;
        for (int i22 = i19; i22 >= 0; i22--) {
            View viewD04 = d0(i22);
            if (this.f53692t.d(viewD04) > i17 || this.f53692t.p(viewD04) > i17) {
                Y1(uVar, i19, i22);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable Y0() {
        if (this.f53685B != null) {
            SavedState savedState = this.f53685B;
            SavedState savedState2 = new SavedState();
            savedState2.f53699b = savedState.f53699b;
            savedState2.f53700c = savedState.f53700c;
            savedState2.f53701d = savedState.f53701d;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (e0() > 0) {
            F1();
            boolean z12 = this.f53693u ^ this.f53695w;
            savedState3.f53701d = z12;
            if (z12) {
                View viewS1 = S1();
                savedState3.f53700c = this.f53692t.i() - this.f53692t.d(viewS1);
                savedState3.f53699b = RecyclerView.m.t0(viewS1);
            } else {
                View viewT1 = T1();
                savedState3.f53699b = RecyclerView.m.t0(viewT1);
                savedState3.f53700c = this.f53692t.g(viewT1) - this.f53692t.m();
            }
        } else {
            savedState3.f53699b = -1;
        }
        return savedState3;
    }

    public final void Y1(RecyclerView.u uVar, int i12, int i13) {
        if (i12 == i13) {
            return;
        }
        if (i13 <= i12) {
            while (i12 > i13) {
                View viewD0 = d0(i12);
                g1(i12);
                uVar.g(viewD0);
                i12--;
            }
            return;
        }
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            View viewD02 = d0(i14);
            g1(i14);
            uVar.g(viewD02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final View Z(int i12) {
        int iE02 = e0();
        if (iE02 == 0) {
            return null;
        }
        int iT02 = i12 - RecyclerView.m.t0(d0(0));
        if (iT02 >= 0 && iT02 < iE02) {
            View viewD0 = d0(iT02);
            if (RecyclerView.m.t0(viewD0) == i12) {
                return viewD0;
            }
        }
        return super.Z(i12);
    }

    public final void Z1() {
        if (this.f53690r == 1 || !U1()) {
            this.f53695w = this.f53694v;
        } else {
            this.f53695w = !this.f53694v;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n a0() {
        return new RecyclerView.n(-2, -2);
    }

    public final int a2(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (e0() == 0 || i12 == 0) {
            return 0;
        }
        F1();
        this.f53691s.f53711a = true;
        int i13 = i12 > 0 ? 1 : -1;
        int iAbs = Math.abs(i12);
        e2(i13, iAbs, true, zVar);
        c cVar = this.f53691s;
        int iG1 = G1(uVar, cVar, zVar, false) + cVar.f53717g;
        if (iG1 < 0) {
            return 0;
        }
        if (iAbs > iG1) {
            i12 = i13 * iG1;
        }
        this.f53692t.r(-i12);
        this.f53691s.f53720j = i12;
        return i12;
    }

    public final void b2(int i12, int i13) {
        this.f53698z = i12;
        this.f53684A = i13;
        SavedState savedState = this.f53685B;
        if (savedState != null) {
            savedState.f53699b = -1;
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.C23427s.h
    public final void c(@j.N View view, @j.N View view2) {
        F("Cannot drop a view during a scroll or layout calculation");
        F1();
        Z1();
        int iT02 = RecyclerView.m.t0(view);
        int iT03 = RecyclerView.m.t0(view2);
        char c12 = iT02 < iT03 ? (char) 1 : (char) 65535;
        if (this.f53695w) {
            if (c12 == 1) {
                b2(iT03, this.f53692t.i() - (this.f53692t.e(view) + this.f53692t.g(view2)));
                return;
            } else {
                b2(iT03, this.f53692t.i() - this.f53692t.d(view2));
                return;
            }
        }
        if (c12 == 65535) {
            b2(iT03, this.f53692t.g(view2));
        } else {
            b2(iT03, this.f53692t.d(view2) - this.f53692t.e(view));
        }
    }

    public final void c2(int i12) {
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException(AK.c.g(i12, "invalid orientation:"));
        }
        F(null);
        if (i12 != this.f53690r || this.f53692t == null) {
            I iB2 = I.b(this, i12);
            this.f53692t = iB2;
            this.f53686C.f53702a = iB2;
            this.f53690r = i12;
            i1();
        }
    }

    public void d2(boolean z12) {
        F(null);
        if (this.f53696x == z12) {
            return;
        }
        this.f53696x = z12;
        i1();
    }

    public final void e2(int i12, int i13, boolean z12, RecyclerView.z zVar) {
        int iM2;
        this.f53691s.f53722l = this.f53692t.k() == 0 && this.f53692t.h() == 0;
        this.f53691s.f53716f = i12;
        int[] iArr = this.f53689F;
        iArr[0] = 0;
        iArr[1] = 0;
        z1(zVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z13 = i12 == 1;
        c cVar = this.f53691s;
        int i14 = z13 ? iMax2 : iMax;
        cVar.f53718h = i14;
        if (!z13) {
            iMax = iMax2;
        }
        cVar.f53719i = iMax;
        if (z13) {
            cVar.f53718h = this.f53692t.j() + i14;
            View viewS1 = S1();
            c cVar2 = this.f53691s;
            cVar2.f53715e = this.f53695w ? -1 : 1;
            int iT02 = RecyclerView.m.t0(viewS1);
            c cVar3 = this.f53691s;
            cVar2.f53714d = iT02 + cVar3.f53715e;
            cVar3.f53712b = this.f53692t.d(viewS1);
            iM2 = this.f53692t.d(viewS1) - this.f53692t.i();
        } else {
            View viewT1 = T1();
            c cVar4 = this.f53691s;
            cVar4.f53718h = this.f53692t.m() + cVar4.f53718h;
            c cVar5 = this.f53691s;
            cVar5.f53715e = this.f53695w ? 1 : -1;
            int iT03 = RecyclerView.m.t0(viewT1);
            c cVar6 = this.f53691s;
            cVar5.f53714d = iT03 + cVar6.f53715e;
            cVar6.f53712b = this.f53692t.g(viewT1);
            iM2 = (-this.f53692t.g(viewT1)) + this.f53692t.m();
        }
        c cVar7 = this.f53691s;
        cVar7.f53713c = i13;
        if (z12) {
            cVar7.f53713c = i13 - iM2;
        }
        cVar7.f53717g = iM2;
    }

    public int f() {
        return K1();
    }

    public final void f2(int i12, int i13) {
        this.f53691s.f53713c = this.f53692t.i() - i13;
        c cVar = this.f53691s;
        cVar.f53715e = this.f53695w ? -1 : 1;
        cVar.f53714d = i12;
        cVar.f53716f = 1;
        cVar.f53712b = i13;
        cVar.f53717g = BeduinInputModel.MIN_TEXT_VERSION;
    }

    public final void g2(int i12, int i13) {
        this.f53691s.f53713c = i13 - this.f53692t.m();
        c cVar = this.f53691s;
        cVar.f53714d = i12;
        cVar.f53715e = this.f53695w ? 1 : -1;
        cVar.f53716f = -1;
        cVar.f53712b = i13;
        cVar.f53717g = BeduinInputModel.MIN_TEXT_VERSION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int k1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f53690r == 1) {
            return 0;
        }
        return a2(i12, uVar, zVar);
    }

    public int l() {
        return M1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l1(int i12) {
        this.f53698z = i12;
        this.f53684A = BeduinInputModel.MIN_TEXT_VERSION;
        SavedState savedState = this.f53685B;
        if (savedState != null) {
            savedState.f53699b = -1;
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f53690r == 0) {
            return 0;
        }
        return a2(i12, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF o(int i12) {
        if (e0() == 0) {
            return null;
        }
        int i13 = (i12 < RecyclerView.m.t0(d0(0))) != this.f53695w ? -1 : 1;
        return this.f53690r == 0 ? new PointF(i13, 0.0f) : new PointF(0.0f, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean u1() {
        if (this.f53849o == 1073741824 || this.f53848n == 1073741824) {
            return false;
        }
        int iE02 = e0();
        for (int i12 = 0; i12 < iE02; i12++) {
            ViewGroup.LayoutParams layoutParams = d0(i12).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void w1(int i12, RecyclerView recyclerView) {
        C23434z c23434z = new C23434z(recyclerView.getContext());
        c23434z.f53878a = i12;
        x1(c23434z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean y1() {
        return this.f53685B == null && this.f53693u == this.f53696x;
    }

    public void z1(@j.N RecyclerView.z zVar, @j.N int[] iArr) {
        int i12;
        int iN2 = zVar.f53891a != -1 ? this.f53692t.n() : 0;
        if (this.f53691s.f53716f == -1) {
            i12 = 0;
        } else {
            i12 = iN2;
            iN2 = 0;
        }
        iArr[0] = iN2;
        iArr[1] = i12;
    }

    public LinearLayoutManager(int i12, boolean z12) {
        this.f53690r = 1;
        this.f53694v = false;
        this.f53695w = false;
        this.f53696x = false;
        this.f53697y = true;
        this.f53698z = -1;
        this.f53684A = BeduinInputModel.MIN_TEXT_VERSION;
        this.f53685B = null;
        this.f53686C = new a();
        this.f53687D = new b();
        this.f53688E = 2;
        this.f53689F = new int[2];
        c2(i12);
        F(null);
        if (z12 == this.f53694v) {
            return;
        }
        this.f53694v = z12;
        i1();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i12, int i13) {
        this.f53690r = 1;
        this.f53694v = false;
        this.f53695w = false;
        this.f53696x = false;
        this.f53697y = true;
        this.f53698z = -1;
        this.f53684A = BeduinInputModel.MIN_TEXT_VERSION;
        this.f53685B = null;
        this.f53686C = new a();
        this.f53687D = new b();
        this.f53688E = 2;
        this.f53689F = new int[2];
        RecyclerView.m.d dVarU0 = RecyclerView.m.u0(context, attributeSet, i12, i13);
        c2(dVarU0.f53854a);
        boolean z12 = dVarU0.f53856c;
        F(null);
        if (z12 != this.f53694v) {
            this.f53694v = z12;
            i1();
        }
        d2(dVarU0.f53857d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
    }

    public void W1(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i12) {
    }
}
