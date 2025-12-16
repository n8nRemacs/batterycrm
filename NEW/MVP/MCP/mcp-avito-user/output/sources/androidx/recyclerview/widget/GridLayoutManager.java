package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public boolean f53661G;

    /* renamed from: H, reason: collision with root package name */
    public int f53662H;

    /* renamed from: I, reason: collision with root package name */
    public int[] f53663I;

    /* renamed from: J, reason: collision with root package name */
    public View[] f53664J;

    /* renamed from: K, reason: collision with root package name */
    public final SparseIntArray f53665K;

    /* renamed from: L, reason: collision with root package name */
    public final SparseIntArray f53666L;

    /* renamed from: M, reason: collision with root package name */
    public c f53667M;

    /* renamed from: N, reason: collision with root package name */
    public final Rect f53668N;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int e(int i12, int i13) {
            return i12 % i13;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int f(int i12) {
            return 1;
        }
    }

    public static class b extends RecyclerView.n {

        /* renamed from: f, reason: collision with root package name */
        public int f53669f;

        /* renamed from: g, reason: collision with root package name */
        public int f53670g;

        public b(int i12, int i13) {
            super(i12, i13);
            this.f53669f = -1;
            this.f53670g = 0;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f53671a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f53672b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f53673c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f53674d = false;

        public static int a(SparseIntArray sparseIntArray, int i12) {
            int size = sparseIntArray.size() - 1;
            int i13 = 0;
            while (i13 <= size) {
                int i14 = (i13 + size) >>> 1;
                if (sparseIntArray.keyAt(i14) < i12) {
                    i13 = i14 + 1;
                } else {
                    size = i14 - 1;
                }
            }
            int i15 = i13 - 1;
            if (i15 < 0 || i15 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i15);
        }

        public final int b(int i12, int i13) {
            if (!this.f53674d) {
                return d(i12, i13);
            }
            SparseIntArray sparseIntArray = this.f53672b;
            int i14 = sparseIntArray.get(i12, -1);
            if (i14 != -1) {
                return i14;
            }
            int iD2 = d(i12, i13);
            sparseIntArray.put(i12, iD2);
            return iD2;
        }

        public final int c(int i12, int i13) {
            if (!this.f53673c) {
                return e(i12, i13);
            }
            SparseIntArray sparseIntArray = this.f53671a;
            int i14 = sparseIntArray.get(i12, -1);
            if (i14 != -1) {
                return i14;
            }
            int iE2 = e(i12, i13);
            sparseIntArray.put(i12, iE2);
            return iE2;
        }

        public final int d(int i12, int i13) {
            int i14;
            int iF2;
            int i15;
            SparseIntArray sparseIntArray;
            int iA2;
            if (!this.f53674d || (iA2 = a((sparseIntArray = this.f53672b), i12)) == -1) {
                i14 = 0;
                iF2 = 0;
                i15 = 0;
            } else {
                i14 = sparseIntArray.get(iA2);
                i15 = iA2 + 1;
                iF2 = f(iA2) + c(iA2, i13);
                if (iF2 == i13) {
                    i14++;
                    iF2 = 0;
                }
            }
            int iF3 = f(i12);
            while (i15 < i12) {
                int iF4 = f(i15);
                iF2 += iF4;
                if (iF2 == i13) {
                    i14++;
                    iF2 = 0;
                } else if (iF2 > i13) {
                    i14++;
                    iF2 = iF4;
                }
                i15++;
            }
            return iF2 + iF3 > i13 ? i14 + 1 : i14;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:17:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002b -> B:17:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:17:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f53673c
                if (r2 == 0) goto L1e
                android.util.SparseIntArray r2 = r5.f53671a
                int r3 = a(r2, r6)
                if (r3 < 0) goto L1e
                int r2 = r2.get(r3)
                int r4 = r5.f(r3)
                int r4 = r4 + r2
                goto L2e
            L1e:
                r3 = r1
                r4 = r3
            L20:
                if (r3 >= r6) goto L31
                int r2 = r5.f(r3)
                int r4 = r4 + r2
                if (r4 != r7) goto L2b
                r4 = r1
                goto L2e
            L2b:
                if (r4 <= r7) goto L2e
                r4 = r2
            L2e:
                int r3 = r3 + 1
                goto L20
            L31:
                int r0 = r0 + r4
                if (r0 > r7) goto L35
                return r4
            L35:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i12);

        public final void g() {
            this.f53672b.clear();
        }

        public final void h() {
            this.f53671a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f53661G = false;
        this.f53662H = -1;
        this.f53665K = new SparseIntArray();
        this.f53666L = new SparseIntArray();
        this.f53667M = new a();
        this.f53668N = new Rect();
        o2(RecyclerView.m.u0(context, attributeSet, i12, i13).f53855b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i12;
        int iF2 = this.f53662H;
        for (int i13 = 0; i13 < this.f53662H && (i12 = cVar.f53714d) >= 0 && i12 < zVar.b() && iF2 > 0; i13++) {
            int i14 = cVar.f53714d;
            ((r.b) cVar2).a(i14, Math.max(0, cVar.f53717g));
            iF2 -= this.f53667M.f(i14);
            cVar.f53714d += cVar.f53715e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        if (r13 == (r2 > r15)) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View J0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.u r25, androidx.recyclerview.widget.RecyclerView.z r26) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void N0(RecyclerView.u uVar, RecyclerView.z zVar, View view, androidx.core.view.accessibility.f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            M0(view, fVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iK2 = k2(bVar.f53858b.getLayoutPosition(), uVar, zVar);
        if (this.f53690r == 0) {
            fVar.n(f.g.a(bVar.f53669f, bVar.f53670g, iK2, 1, false));
        } else {
            fVar.n(f.g.a(iK2, 1, bVar.f53669f, bVar.f53670g, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void O0(int i12, int i13) {
        this.f53667M.h();
        this.f53667M.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int P(RecyclerView.z zVar) {
        return C1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void P0() {
        this.f53667M.h();
        this.f53667M.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P1(RecyclerView.u uVar, RecyclerView.z zVar, boolean z12, boolean z13) {
        int i12;
        int iE02;
        int iE03 = e0();
        int i13 = 1;
        if (z13) {
            iE02 = e0() - 1;
            i12 = -1;
            i13 = -1;
        } else {
            i12 = iE03;
            iE02 = 0;
        }
        int iB2 = zVar.b();
        F1();
        int iM2 = this.f53692t.m();
        int i14 = this.f53692t.i();
        View view = null;
        View view2 = null;
        while (iE02 != i12) {
            View viewD0 = d0(iE02);
            int iT02 = RecyclerView.m.t0(viewD0);
            if (iT02 >= 0 && iT02 < iB2 && l2(iT02, uVar, zVar) == 0) {
                if (((RecyclerView.n) viewD0.getLayoutParams()).f53858b.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewD0;
                    }
                } else {
                    if (this.f53692t.g(viewD0) < i14 && this.f53692t.d(viewD0) >= iM2) {
                        return viewD0;
                    }
                    if (view == null) {
                        view = viewD0;
                    }
                }
            }
            iE02 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int Q(RecyclerView.z zVar) {
        return D1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Q0(int i12, int i13) {
        this.f53667M.h();
        this.f53667M.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R0(int i12, int i13) {
        this.f53667M.h();
        this.f53667M.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int S(RecyclerView.z zVar) {
        return C1(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int T(RecyclerView.z zVar) {
        return D1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void T0(RecyclerView recyclerView, int i12, int i13) {
        this.f53667M.h();
        this.f53667M.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void U0(RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z12 = zVar.f53897g;
        SparseIntArray sparseIntArray = this.f53666L;
        SparseIntArray sparseIntArray2 = this.f53665K;
        if (z12) {
            int iE02 = e0();
            for (int i12 = 0; i12 < iE02; i12++) {
                b bVar = (b) d0(i12).getLayoutParams();
                int layoutPosition = bVar.f53858b.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, bVar.f53670g);
                sparseIntArray.put(layoutPosition, bVar.f53669f);
            }
        }
        super.U0(uVar, zVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void V0(RecyclerView.z zVar) {
        super.V0(zVar);
        this.f53661G = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V1(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iF2;
        int iF3;
        int i19;
        int iF4;
        int iF02;
        int iF03;
        boolean z12;
        int i22;
        View viewB;
        int iL2 = this.f53692t.l();
        boolean z13 = iL2 != 1073741824;
        int i23 = e0() > 0 ? this.f53663I[this.f53662H] : 0;
        if (z13) {
            p2();
        }
        boolean z14 = cVar.f53715e == 1;
        int iL22 = this.f53662H;
        if (!z14) {
            iL22 = l2(cVar.f53714d, uVar, zVar) + m2(cVar.f53714d, uVar, zVar);
        }
        int i24 = 0;
        while (i24 < this.f53662H && (i22 = cVar.f53714d) >= 0 && i22 < zVar.b() && iL22 > 0) {
            int i25 = cVar.f53714d;
            int iM2 = m2(i25, uVar, zVar);
            if (iM2 > this.f53662H) {
                throw new IllegalArgumentException(AK.c.i(this.f53662H, " spans.", androidx.appcompat.app.r.y(i25, iM2, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            iL22 -= iM2;
            if (iL22 < 0 || (viewB = cVar.b(uVar)) == null) {
                break;
            }
            this.f53664J[i24] = viewB;
            i24++;
        }
        if (i24 == 0) {
            bVar.f53708b = true;
            return;
        }
        if (z14) {
            i14 = 1;
            i13 = i24;
            i12 = 0;
        } else {
            i12 = i24 - 1;
            i13 = -1;
            i14 = -1;
        }
        int i26 = 0;
        while (i12 != i13) {
            View view = this.f53664J[i12];
            b bVar2 = (b) view.getLayoutParams();
            int iM22 = m2(RecyclerView.m.t0(view), uVar, zVar);
            bVar2.f53670g = iM22;
            bVar2.f53669f = i26;
            i26 += iM22;
            i12 += i14;
        }
        float f12 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i24; i28++) {
            View view2 = this.f53664J[i28];
            if (cVar.f53721k != null) {
                z12 = false;
                if (z14) {
                    E(view2, -1, true);
                } else {
                    E(view2, 0, true);
                }
            } else if (z14) {
                D(view2);
                z12 = false;
            } else {
                z12 = false;
                E(view2, 0, false);
            }
            H(view2, this.f53668N);
            n2(view2, iL2, z12);
            int iE2 = this.f53692t.e(view2);
            if (iE2 > i27) {
                i27 = iE2;
            }
            float f13 = (this.f53692t.f(view2) * 1.0f) / ((b) view2.getLayoutParams()).f53670g;
            if (f13 > f12) {
                f12 = f13;
            }
        }
        if (z13) {
            h2(Math.max(Math.round(f12 * this.f53662H), i23));
            i27 = 0;
            for (int i29 = 0; i29 < i24; i29++) {
                View view3 = this.f53664J[i29];
                n2(view3, 1073741824, true);
                int iE3 = this.f53692t.e(view3);
                if (iE3 > i27) {
                    i27 = iE3;
                }
            }
        }
        for (int i32 = 0; i32 < i24; i32++) {
            View view4 = this.f53664J[i32];
            if (this.f53692t.e(view4) != i27) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f53859c;
                int i33 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i34 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int iJ2 = j2(bVar3.f53669f, bVar3.f53670g);
                if (this.f53690r == 1) {
                    iF03 = RecyclerView.m.f0(iJ2, 1073741824, i34, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    iF02 = View.MeasureSpec.makeMeasureSpec(i27 - i33, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i34, 1073741824);
                    iF02 = RecyclerView.m.f0(iJ2, 1073741824, i33, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    iF03 = iMakeMeasureSpec;
                }
                if (v1(view4, iF03, iF02, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(iF03, iF02);
                }
            }
        }
        int i35 = 0;
        bVar.f53707a = i27;
        if (this.f53690r != 1) {
            if (cVar.f53716f == -1) {
                int i36 = cVar.f53712b;
                i16 = i36 - i27;
                i15 = i36;
            } else {
                int i37 = cVar.f53712b;
                i15 = i37 + i27;
                i16 = i37;
            }
            i17 = 0;
            i18 = 0;
        } else if (cVar.f53716f == -1) {
            i18 = cVar.f53712b;
            i17 = i18 - i27;
            i16 = 0;
            i15 = 0;
        } else {
            int i38 = cVar.f53712b;
            i17 = i38;
            i15 = 0;
            i18 = i38 + i27;
            i16 = 0;
        }
        while (i35 < i24) {
            View view5 = this.f53664J[i35];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f53690r != 1) {
                int paddingTop = getPaddingTop() + this.f53663I[bVar4.f53669f];
                iF2 = i16;
                iF3 = i15;
                i19 = paddingTop;
                iF4 = this.f53692t.f(view5) + paddingTop;
            } else if (U1()) {
                int paddingLeft = getPaddingLeft() + this.f53663I[this.f53662H - bVar4.f53669f];
                iF3 = paddingLeft;
                i19 = i17;
                iF4 = i18;
                iF2 = paddingLeft - this.f53692t.f(view5);
            } else {
                int paddingLeft2 = getPaddingLeft() + this.f53663I[bVar4.f53669f];
                iF3 = this.f53692t.f(view5) + paddingLeft2;
                i19 = i17;
                iF4 = i18;
                iF2 = paddingLeft2;
            }
            C0(view5, iF2, i19, iF3, iF4);
            if (bVar4.f53858b.isRemoved() || bVar4.f53858b.isUpdated()) {
                bVar.f53709c = true;
            }
            bVar.f53710d |= view5.hasFocusable();
            i35++;
            i16 = iF2;
            i15 = iF3;
            i17 = i19;
            i18 = iF4;
        }
        Arrays.fill(this.f53664J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W1(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i12) {
        p2();
        if (zVar.b() > 0 && !zVar.f53897g) {
            boolean z12 = i12 == 1;
            int iL2 = l2(aVar.f53703b, uVar, zVar);
            if (z12) {
                while (iL2 > 0) {
                    int i13 = aVar.f53703b;
                    if (i13 <= 0) {
                        break;
                    }
                    int i14 = i13 - 1;
                    aVar.f53703b = i14;
                    iL2 = l2(i14, uVar, zVar);
                }
            } else {
                int iB2 = zVar.b() - 1;
                int i15 = aVar.f53703b;
                while (i15 < iB2) {
                    int i16 = i15 + 1;
                    int iL22 = l2(i16, uVar, zVar);
                    if (iL22 <= iL2) {
                        break;
                    }
                    i15 = i16;
                    iL2 = iL22;
                }
                aVar.f53703b = i15;
            }
        }
        i2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n a0() {
        return this.f53690r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n b0(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f53669f = -1;
        bVar.f53670g = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n c0(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f53669f = -1;
            bVar.f53670g = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f53669f = -1;
        bVar2.f53670g = 0;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d2(boolean z12) {
        if (z12) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int g0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f53690r == 1) {
            return this.f53662H;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return k2(zVar.b() - 1, uVar, zVar) + 1;
    }

    public final void h2(int i12) {
        int i13;
        int[] iArr = this.f53663I;
        int i14 = this.f53662H;
        if (iArr == null || iArr.length != i14 + 1 || iArr[iArr.length - 1] != i12) {
            iArr = new int[i14 + 1];
        }
        int i15 = 0;
        iArr[0] = 0;
        int i16 = i12 / i14;
        int i17 = i12 % i14;
        int i18 = 0;
        for (int i19 = 1; i19 <= i14; i19++) {
            i15 += i17;
            if (i15 <= 0 || i14 - i15 >= i17) {
                i13 = i16;
            } else {
                i13 = i16 + 1;
                i15 -= i14;
            }
            i18 += i13;
            iArr[i19] = i18;
        }
        this.f53663I = iArr;
    }

    public final void i2() {
        View[] viewArr = this.f53664J;
        if (viewArr == null || viewArr.length != this.f53662H) {
            this.f53664J = new View[this.f53662H];
        }
    }

    public final int j2(int i12, int i13) {
        if (this.f53690r != 1 || !U1()) {
            int[] iArr = this.f53663I;
            return iArr[i13 + i12] - iArr[i12];
        }
        int[] iArr2 = this.f53663I;
        int i14 = this.f53662H;
        return iArr2[i14 - i12] - iArr2[(i14 - i12) - i13];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int k1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        p2();
        i2();
        return super.k1(i12, uVar, zVar);
    }

    public final int k2(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!zVar.f53897g) {
            return this.f53667M.b(i12, this.f53662H);
        }
        int iB2 = uVar.b(i12);
        if (iB2 == -1) {
            return 0;
        }
        return this.f53667M.b(iB2, this.f53662H);
    }

    public final int l2(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!zVar.f53897g) {
            return this.f53667M.c(i12, this.f53662H);
        }
        int i13 = this.f53666L.get(i12, -1);
        if (i13 != -1) {
            return i13;
        }
        int iB2 = uVar.b(i12);
        if (iB2 == -1) {
            return 0;
        }
        return this.f53667M.c(iB2, this.f53662H);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int m1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        p2();
        i2();
        return super.m1(i12, uVar, zVar);
    }

    public final int m2(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!zVar.f53897g) {
            return this.f53667M.f(i12);
        }
        int i13 = this.f53665K.get(i12, -1);
        if (i13 != -1) {
            return i13;
        }
        int iB2 = uVar.b(i12);
        if (iB2 == -1) {
            return 1;
        }
        return this.f53667M.f(iB2);
    }

    public final void n2(View view, int i12, boolean z12) {
        int iF02;
        int iF03;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f53859c;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iJ2 = j2(bVar.f53669f, bVar.f53670g);
        if (this.f53690r == 1) {
            iF03 = RecyclerView.m.f0(iJ2, i12, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iF02 = RecyclerView.m.f0(this.f53692t.n(), this.f53849o, i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iF04 = RecyclerView.m.f0(iJ2, i12, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iF05 = RecyclerView.m.f0(this.f53692t.n(), this.f53848n, i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iF02 = iF04;
            iF03 = iF05;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z12 ? v1(view, iF03, iF02, nVar) : t1(view, iF03, iF02, nVar)) {
            view.measure(iF03, iF02);
        }
    }

    public final void o2(int i12) {
        if (i12 == this.f53662H) {
            return;
        }
        this.f53661G = true;
        if (i12 < 1) {
            throw new IllegalArgumentException(AK.c.g(i12, "Span count should be at least 1. Provided "));
        }
        this.f53662H = i12;
        this.f53667M.h();
        i1();
    }

    public final void p2() {
        int paddingBottom;
        int paddingTop;
        if (this.f53690r == 1) {
            paddingBottom = this.f53850p - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f53851q - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        h2(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q1(Rect rect, int i12, int i13) {
        int iL2;
        int iL3;
        if (this.f53663I == null) {
            super.q1(rect, i12, i13);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f53690r == 1) {
            iL3 = RecyclerView.m.L(i13, rect.height() + paddingBottom, r0());
            int[] iArr = this.f53663I;
            iL2 = RecyclerView.m.L(i12, iArr[iArr.length - 1] + paddingRight, s0());
        } else {
            iL2 = RecyclerView.m.L(i12, rect.width() + paddingRight, s0());
            int[] iArr2 = this.f53663I;
            iL3 = RecyclerView.m.L(i13, iArr2[iArr2.length - 1] + paddingBottom, r0());
        }
        this.f53837c.setMeasuredDimension(iL2, iL3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int v0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f53690r == 0) {
            return this.f53662H;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return k2(zVar.b() - 1, uVar, zVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean y1() {
        return this.f53685B == null && !this.f53661G;
    }

    public GridLayoutManager(int i12) {
        this.f53661G = false;
        this.f53662H = -1;
        this.f53665K = new SparseIntArray();
        this.f53666L = new SparseIntArray();
        this.f53667M = new a();
        this.f53668N = new Rect();
        o2(i12);
    }

    public GridLayoutManager(int i12, int i13) {
        super(i13, false);
        this.f53661G = false;
        this.f53662H = -1;
        this.f53665K = new SparseIntArray();
        this.f53666L = new SparseIntArray();
        this.f53667M = new a();
        this.f53668N = new Rect();
        o2(i12);
    }
}
