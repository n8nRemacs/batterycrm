package ru.tinkoff.scrollingpagerindicator;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* compiled from: RecyclerViewAttacher.java */
/* loaded from: classes9.dex */
public class e implements ScrollingPagerIndicator.b<RecyclerView> {

    /* renamed from: a, reason: collision with root package name */
    public ScrollingPagerIndicator f437135a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f437136b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayoutManager f437137c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView.Adapter<?> f437138d;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView.r f437139e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView.g f437140f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f437141g;

    /* renamed from: h, reason: collision with root package name */
    public final int f437142h;

    /* renamed from: i, reason: collision with root package name */
    public int f437143i;

    /* renamed from: j, reason: collision with root package name */
    public int f437144j;

    public e() {
        this.f437142h = 0;
        this.f437141g = true;
    }

    public final int a() {
        float measuredWidth;
        float fC2;
        RecyclerView.C cL2;
        for (int i12 = 0; i12 < this.f437136b.getChildCount(); i12++) {
            View childAt = this.f437136b.getChildAt(i12);
            float x12 = childAt.getX();
            int measuredWidth2 = childAt.getMeasuredWidth();
            float fE2 = e();
            int i13 = this.f437142h;
            boolean z12 = this.f437141g;
            if (z12) {
                measuredWidth = (this.f437136b.getMeasuredWidth() - c()) / 2.0f;
                fC2 = c();
            } else {
                measuredWidth = i13;
                fC2 = c();
            }
            float fD2 = fC2 + measuredWidth;
            if (this.f437137c.f53690r == 1) {
                x12 = childAt.getY();
                measuredWidth2 = childAt.getMeasuredHeight();
                fE2 = z12 ? (this.f437136b.getMeasuredHeight() - b()) / 2.0f : i13;
                fD2 = d();
            }
            if (x12 >= fE2 && x12 + measuredWidth2 <= fD2 && (cL2 = this.f437136b.L(childAt)) != null && cL2.getAdapterPosition() != -1) {
                return cL2.getAdapterPosition();
            }
        }
        return -1;
    }

    public final float b() {
        int measuredHeight;
        if (this.f437144j == 0) {
            for (int i12 = 0; i12 < this.f437136b.getChildCount(); i12++) {
                View childAt = this.f437136b.getChildAt(i12);
                if (childAt.getMeasuredHeight() != 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                    this.f437144j = measuredHeight;
                    break;
                }
            }
            measuredHeight = this.f437144j;
        } else {
            measuredHeight = this.f437144j;
        }
        return measuredHeight;
    }

    public final float c() {
        int measuredWidth;
        if (this.f437143i == 0) {
            for (int i12 = 0; i12 < this.f437136b.getChildCount(); i12++) {
                View childAt = this.f437136b.getChildAt(i12);
                if (childAt.getMeasuredWidth() != 0) {
                    measuredWidth = childAt.getMeasuredWidth();
                    this.f437143i = measuredWidth;
                    break;
                }
            }
            measuredWidth = this.f437143i;
        } else {
            measuredWidth = this.f437143i;
        }
        return measuredWidth;
    }

    public final float d() {
        float measuredHeight;
        float fB2;
        if (this.f437141g) {
            measuredHeight = (this.f437136b.getMeasuredHeight() - b()) / 2.0f;
            fB2 = b();
        } else {
            measuredHeight = this.f437142h;
            fB2 = b();
        }
        return fB2 + measuredHeight;
    }

    public final float e() {
        return this.f437141g ? (this.f437136b.getMeasuredWidth() - c()) / 2.0f : this.f437142h;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[PHI: r5
  0x0051: PHI (r5v4 int) = (r5v3 int), (r5v6 int) binds: [B:17:0x004f, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r8 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r8.f437137c
            int r0 = r0.e0()
            r1 = 0
            if (r0 != 0) goto La
            goto L56
        La:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
        Le:
            if (r3 >= r0) goto L56
            androidx.recyclerview.widget.LinearLayoutManager r4 = r8.f437137c
            android.view.View r4 = r4.d0(r3)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r8.f437137c
            int r5 = r5.f53690r
            if (r5 != 0) goto L37
            float r5 = r4.getX()
            int r5 = (int) r5
            int r6 = r4.getMeasuredWidth()
            int r6 = r6 + r5
            if (r6 >= r2) goto L53
            int r6 = r4.getMeasuredWidth()
            int r6 = r6 + r5
            float r6 = (float) r6
            float r7 = r8.e()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L53
            goto L51
        L37:
            float r5 = r4.getY()
            int r5 = (int) r5
            int r6 = r4.getMeasuredHeight()
            int r6 = r6 + r5
            if (r6 >= r2) goto L53
            int r6 = r4.getMeasuredHeight()
            int r6 = r6 + r5
            float r6 = (float) r6
            float r7 = r8.d()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L53
        L51:
            r1 = r4
            r2 = r5
        L53:
            int r3 = r3 + 1
            goto Le
        L56:
            if (r1 != 0) goto L59
            return
        L59:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f437136b
            r0.getClass()
            int r0 = androidx.recyclerview.widget.RecyclerView.U(r1)
            r2 = -1
            if (r0 != r2) goto L66
            return
        L66:
            androidx.recyclerview.widget.RecyclerView$Adapter<?> r2 = r8.f437138d
            int r2 = r2.getItemCount()
            if (r0 < r2) goto L71
            if (r2 == 0) goto L71
            int r0 = r0 % r2
        L71:
            androidx.recyclerview.widget.LinearLayoutManager r3 = r8.f437137c
            int r3 = r3.f53690r
            if (r3 != 0) goto L87
            float r3 = r8.e()
            float r4 = r1.getX()
            float r3 = r3 - r4
            int r1 = r1.getMeasuredWidth()
        L84:
            float r1 = (float) r1
            float r3 = r3 / r1
            goto L95
        L87:
            float r3 = r8.d()
            float r4 = r1.getY()
            float r3 = r3 - r4
            int r1 = r1.getMeasuredHeight()
            goto L84
        L95:
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto La7
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto La7
            if (r0 >= r2) goto La7
            ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator r1 = r8.f437135a
            r1.d(r3, r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.e.f():void");
    }

    public e(int i12) {
        this.f437142h = i12;
        this.f437141g = false;
    }
}
