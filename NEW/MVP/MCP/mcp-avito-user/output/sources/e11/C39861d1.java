package e11;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e11.d1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39861d1 extends androidx.recyclerview.widget.A {

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public androidx.recyclerview.widget.I f394570k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public androidx.recyclerview.widget.I f394571l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public RecyclerView f394572m;

    /* renamed from: h, reason: collision with root package name */
    public final float f394567h = 60.0f;

    /* renamed from: i, reason: collision with root package name */
    public final int f394568i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final float f394569j = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f394566g = 17;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final DecelerateInterpolator f394565f = new DecelerateInterpolator(1.7f);

    /* renamed from: e11.d1$a */
    public class a extends C23434z {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C23434z, androidx.recyclerview.widget.RecyclerView.y
        public final void e(View view, RecyclerView.y.a aVar) {
            C39861d1 c39861d1 = C39861d1.this;
            RecyclerView recyclerView = c39861d1.f394572m;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            int[] iArrC = c39861d1.c(c39861d1.f394572m.getLayoutManager(), view);
            int i12 = iArrC[0];
            int i13 = iArrC[1];
            int iK2 = k(Math.max(Math.abs(i12), Math.abs(i13)));
            if (iK2 > 0) {
                aVar.b(i12, i13, iK2, c39861d1.f394565f);
            }
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final float j(DisplayMetrics displayMetrics) {
            return C39861d1.this.f394567h / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C23434z
        public final int k(int i12) {
            return (int) Math.ceil(l(i12) / 0.3d);
        }
    }

    @Override // androidx.recyclerview.widget.P
    public final void b(@j.P RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            this.f394572m = recyclerView;
        } else {
            this.f394572m = null;
        }
        try {
            super.b(recyclerView);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @j.N
    public final int[] c(@j.N RecyclerView.m mVar, @j.N View view) {
        int i12 = this.f394566g;
        if (i12 == 17) {
            return super.c(mVar, view);
        }
        int[] iArr = new int[2];
        if (!(mVar instanceof LinearLayoutManager)) {
            return iArr;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        if (i12 == 8388611) {
            androidx.recyclerview.widget.I iP2 = p(linearLayoutManager);
            int iG2 = iP2.g(view);
            if (iG2 >= iP2.m() / 2) {
                iG2 -= iP2.m();
            }
            iArr[0] = iG2;
        } else {
            androidx.recyclerview.widget.I iP3 = p(linearLayoutManager);
            int iD2 = iP3.d(view);
            iArr[0] = iD2 >= iP3.h() - ((iP3.h() - iP3.i()) / 2) ? iP3.d(view) - iP3.h() : iD2 - iP3.i();
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // androidx.recyclerview.widget.P
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] d(int r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            androidx.recyclerview.widget.RecyclerView r1 = r0.f394572m
            if (r1 == 0) goto L6b
            androidx.recyclerview.widget.I r1 = r0.f394570k
            if (r1 != 0) goto Ld
            androidx.recyclerview.widget.I r1 = r0.f394571l
            if (r1 == 0) goto L6b
        Ld:
            float r1 = r0.f394569j
            int r2 = r0.f394568i
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = -1
            if (r2 != r4) goto L1b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1b
            goto L6b
        L1b:
            android.widget.Scroller r5 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r6 = r0.f394572m
            android.content.Context r6 = r6.getContext()
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r5.<init>(r6, r7)
            androidx.recyclerview.widget.RecyclerView r6 = r0.f394572m
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != 0) goto L34
        L32:
            r14 = r7
            goto L51
        L34:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L4e
            androidx.recyclerview.widget.I r2 = r0.f394570k
            if (r2 == 0) goto L45
            int r2 = r6.getHeight()
        L40:
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
        L43:
            r14 = r2
            goto L51
        L45:
            androidx.recyclerview.widget.I r2 = r0.f394571l
            if (r2 == 0) goto L32
            int r2 = r6.getWidth()
            goto L40
        L4e:
            if (r2 == r4) goto L32
            goto L43
        L51:
            int r13 = -r14
            r7 = 0
            r8 = 0
            r6 = r5
            r9 = r16
            r10 = r17
            r11 = r13
            r12 = r14
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            int r1 = r5.getFinalX()
            int r2 = r5.getFinalY()
            int[] r1 = new int[]{r1, r2}
            return r1
        L6b:
            int[] r1 = super.d(r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39861d1.d(int, int):int[]");
    }

    @Override // androidx.recyclerview.widget.P
    @j.P
    public final RecyclerView.y e(RecyclerView.m mVar) {
        RecyclerView recyclerView;
        if (!(mVar instanceof RecyclerView.y.b) || (recyclerView = this.f394572m) == null) {
            return null;
        }
        return new a(recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @j.P
    public final View f(@j.N RecyclerView.m mVar) {
        return n(mVar, true);
    }

    @j.P
    public final View m(@j.N RecyclerView.m mVar, @j.N androidx.recyclerview.widget.I i12, int i13, boolean z12) {
        boolean z13;
        View view = null;
        if (mVar.e0() != 0 && (mVar instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
            if (z12 && (((z13 = linearLayoutManager.f53694v) || this.f394566g != 8388611) && (!(z13 && this.f394566g == 8388613) && ((z13 || this.f394566g != 48) && !(z13 && this.f394566g == 80))) ? !(this.f394566g != 17 ? linearLayoutManager.H1() != 0 : !(linearLayoutManager.H1() == 0 || linearLayoutManager.L1() == linearLayoutManager.o0() - 1)) : linearLayoutManager.L1() == linearLayoutManager.o0() - 1)) {
                return null;
            }
            RecyclerView recyclerView = mVar.f53837c;
            int iN2 = recyclerView != null && recyclerView.f53775h ? (i12.n() / 2) + i12.m() : i12.h() / 2;
            boolean z14 = i13 == 8388611;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < linearLayoutManager.e0(); i15++) {
                View viewD0 = linearLayoutManager.d0(i15);
                int iG2 = i12.g(viewD0);
                int iAbs = z14 ? Math.abs(iG2) : Math.abs(((i12.e(viewD0) / 2) + iG2) - iN2);
                if (iAbs < i14) {
                    view = viewD0;
                    i14 = iAbs;
                }
            }
        }
        return view;
    }

    @j.P
    public final View n(@j.N RecyclerView.m mVar, boolean z12) {
        int i12 = this.f394566g;
        if (i12 == 17) {
            return m(mVar, p(mVar), 17, z12);
        }
        if (i12 == 48) {
            androidx.recyclerview.widget.I i13 = this.f394570k;
            if (i13 == null || i13.f53676a != mVar) {
                this.f394570k = androidx.recyclerview.widget.I.c(mVar);
            }
            return m(mVar, this.f394570k, 8388611, z12);
        }
        if (i12 != 80) {
            if (i12 == 8388611) {
                return m(mVar, p(mVar), 8388611, z12);
            }
            if (i12 != 8388613) {
                return null;
            }
            return m(mVar, p(mVar), 8388613, z12);
        }
        androidx.recyclerview.widget.I i14 = this.f394570k;
        if (i14 == null || i14.f53676a != mVar) {
            this.f394570k = androidx.recyclerview.widget.I.c(mVar);
        }
        return m(mVar, this.f394570k, 8388613, z12);
    }

    public final void o(int i12) {
        RecyclerView.m layoutManager;
        View viewN;
        if (this.f394566g != i12) {
            this.f394566g = i12;
            RecyclerView recyclerView = this.f394572m;
            if (recyclerView == null || recyclerView.getLayoutManager() == null || (viewN = n((layoutManager = this.f394572m.getLayoutManager()), false)) == null) {
                return;
            }
            int[] iArrC = c(layoutManager, viewN);
            this.f394572m.C0(iArrC[0], iArrC[1]);
        }
    }

    public final androidx.recyclerview.widget.I p(RecyclerView.m mVar) {
        androidx.recyclerview.widget.I i12 = this.f394571l;
        if (i12 == null || i12.f53676a != mVar) {
            this.f394571l = androidx.recyclerview.widget.I.a(mVar);
        }
        return this.f394571l;
    }
}
