package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import j.N;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes10.dex */
final class h extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public ViewPager2.i f55145b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final ViewPager2 f55146c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final RecyclerView f55147d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final LinearLayoutManager f55148e;

    /* renamed from: f, reason: collision with root package name */
    public int f55149f;

    /* renamed from: g, reason: collision with root package name */
    public int f55150g;

    /* renamed from: h, reason: collision with root package name */
    public final a f55151h;

    /* renamed from: i, reason: collision with root package name */
    public int f55152i;

    /* renamed from: j, reason: collision with root package name */
    public int f55153j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f55154k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f55155l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f55156m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f55157n;

    /* compiled from: ScrollEventAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f55158a;

        /* renamed from: b, reason: collision with root package name */
        public float f55159b;

        /* renamed from: c, reason: collision with root package name */
        public int f55160c;
    }

    public h(@N ViewPager2 viewPager2) {
        this.f55146c = viewPager2;
        RecyclerView recyclerView = viewPager2.f55103k;
        this.f55147d = recyclerView;
        this.f55148e = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f55151h = new a();
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @N RecyclerView recyclerView) {
        ViewPager2.i iVar;
        int i13 = this.f55149f;
        boolean z12 = true;
        if (!(i13 == 1 && this.f55150g == 1) && i12 == 1) {
            o(false);
            return;
        }
        if ((i13 == 1 || i13 == 4) && i12 == 2) {
            if (this.f55155l) {
                m(2);
                this.f55154k = true;
                return;
            }
            return;
        }
        if (i13 != 1 && i13 != 4) {
            z12 = false;
        }
        a aVar = this.f55151h;
        if (z12 && i12 == 0) {
            p();
            if (!this.f55155l) {
                int i14 = aVar.f55158a;
                if (i14 != -1 && (iVar = this.f55145b) != null) {
                    iVar.onPageScrolled(i14, 0.0f, 0);
                }
            } else if (aVar.f55160c == 0) {
                int i15 = this.f55152i;
                int i16 = aVar.f55158a;
                if (i15 != i16) {
                    l(i16);
                }
            }
            m(0);
            n();
        }
        if (this.f55149f == 2 && i12 == 0 && this.f55156m) {
            p();
            if (aVar.f55160c == 0) {
                int i17 = this.f55153j;
                int i18 = aVar.f55158a;
                if (i17 != i18) {
                    if (i18 == -1) {
                        i18 = 0;
                    }
                    l(i18);
                }
                m(0);
                n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@j.N androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f55155l = r6
            r5.p()
            boolean r0 = r5.f55154k
            androidx.viewpager2.widget.h$a r1 = r5.f55151h
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L3c
            r5.f55154k = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f55146c
            androidx.recyclerview.widget.LinearLayoutManager r8 = r8.f55100h
            int r8 = r8.q0()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r1.f55160c
            if (r7 == 0) goto L30
            int r7 = r1.f55158a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r1.f55158a
        L32:
            r5.f55153j = r7
            int r8 = r5.f55152i
            if (r8 == r7) goto L48
            r5.l(r7)
            goto L48
        L3c:
            int r7 = r5.f55149f
            if (r7 != 0) goto L48
            int r7 = r1.f55158a
            if (r7 != r2) goto L45
            r7 = r3
        L45:
            r5.l(r7)
        L48:
            int r7 = r1.f55158a
            if (r7 != r2) goto L4d
            r7 = r3
        L4d:
            float r8 = r1.f55159b
            int r0 = r1.f55160c
            androidx.viewpager2.widget.ViewPager2$i r4 = r5.f55145b
            if (r4 == 0) goto L58
            r4.onPageScrolled(r7, r8, r0)
        L58:
            int r7 = r1.f55158a
            int r8 = r5.f55153j
            if (r7 == r8) goto L60
            if (r8 != r2) goto L6e
        L60:
            int r7 = r1.f55160c
            if (r7 != 0) goto L6e
            int r7 = r5.f55150g
            if (r7 == r6) goto L6e
            r5.m(r3)
            r5.n()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.h.k(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void l(int i12) {
        ViewPager2.i iVar = this.f55145b;
        if (iVar != null) {
            iVar.onPageSelected(i12);
        }
    }

    public final void m(int i12) {
        if ((this.f55149f == 3 && this.f55150g == 0) || this.f55150g == i12) {
            return;
        }
        this.f55150g = i12;
        ViewPager2.i iVar = this.f55145b;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i12);
        }
    }

    public final void n() {
        this.f55149f = 0;
        this.f55150g = 0;
        a aVar = this.f55151h;
        aVar.f55158a = -1;
        aVar.f55159b = 0.0f;
        aVar.f55160c = 0;
        this.f55152i = -1;
        this.f55153j = -1;
        this.f55154k = false;
        this.f55155l = false;
        this.f55157n = false;
        this.f55156m = false;
    }

    public final void o(boolean z12) {
        this.f55157n = z12;
        this.f55149f = z12 ? 4 : 1;
        int i12 = this.f55153j;
        if (i12 != -1) {
            this.f55152i = i12;
            this.f55153j = -1;
        } else if (this.f55152i == -1) {
            this.f55152i = this.f55148e.K1();
        }
        m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.h.p():void");
    }
}
