package defpackage;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e9d extends ViewGroup {
    public static final /* synthetic */ yy7[] A0;
    public em6 a;
    public y8d b;
    public boolean c;
    public final nk d;
    public final i8a o;
    public cm6 s0;
    public final TransitionSet t0;
    public final d9a u0;
    public final d9a v0;
    public final d9a w0;
    public final int x0;
    public final c9d[] y0;
    public final ov5 z0;

    static {
        z8a z8aVar = new z8a(e9d.class, "isStackFromEnd", "isStackFromEnd()Z");
        vid.a.getClass();
        A0 = new yy7[]{z8aVar};
    }

    public e9d(Context context) {
        super(context);
        this.d = new nk(this);
        this.o = new i8a();
        this.s0 = new hdc(23);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new s9d(new d9d(this, 2)));
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(1);
        transitionSet.addListener((Transition.TransitionListener) new m6(2, this));
        this.t0 = transitionSet;
        this.u0 = new d9a();
        this.v0 = new d9a();
        this.w0 = new d9a();
        int i = t9d.a;
        this.x0 = i;
        c9d[] c9dVarArr = new c9d[i];
        for (int i2 = 0; i2 < i; i2++) {
            c9dVarArr[i2] = null;
        }
        this.y0 = c9dVarArr;
        this.z0 = new ov5(20);
    }

    public final void a(d9a d9aVar) {
        Object[] objArr = d9aVar.b;
        long[] jArr = d9aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        View view = (View) objArr[(i << 3) + i3];
                        this.o.a(view.getId());
                        this.t0.addTarget(view.getId());
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int b(int i) {
        yy7 yy7Var = A0[0];
        if (!((Boolean) this.d.b).booleanValue()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            c9d c9dVar = (c9d) ys.x(i, this.y0);
            if (c9dVar == null) {
                break;
            }
            int measuredWidth = c9dVar.getMeasuredWidth() + (i2 == 0 ? 0 : kti.d(4 * vw4.d().getDisplayMetrics().density)) + i2;
            if (measuredWidth > getMeasuredWidth()) {
                break;
            }
            i++;
            i2 = measuredWidth;
        }
        return getMeasuredWidth() - i2;
    }

    public final void c() {
        this.u0.b();
        this.v0.b();
        this.w0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9d.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r15 = this;
            i8a r0 = r15.o
            int[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L47
            r4 = 0
            r5 = r4
        Ld:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L42
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L27:
            if (r10 >= r8) goto L40
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L3c
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            android.transition.TransitionSet r12 = r15.t0
            r12.removeTarget(r11)
        L3c:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L27
        L40:
            if (r8 != r9) goto L47
        L42:
            if (r5 == r3) goto L47
            int r5 = r5 + 1
            goto Ld
        L47:
            r0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9d.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.xl9 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9d.f(xl9, boolean):void");
    }

    public final y8d getChipObserver() {
        return this.b;
    }

    public final em6 getOnChipClickListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        int childCount = getChildCount();
        int measuredWidth = 0;
        int measuredHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            c9d c9dVar = (c9d) ys.x(i5, this.y0);
            if (c9dVar != null) {
                int iB2 = measuredWidth == 0 ? b(i5) : kti.d(4 * vw4.d().getDisplayMetrics().density);
                if (getMeasuredWidth() - measuredWidth >= c9dVar.getMeasuredWidth() + iB2) {
                    iB = measuredWidth + iB2;
                    cri.c(c9dVar, iB, measuredHeight, 0, 12);
                } else {
                    iB = b(i5);
                    measuredHeight += c9dVar.getMeasuredHeight() + kti.d(8 * vw4.d().getDisplayMetrics().density);
                    cri.c(c9dVar, iB, measuredHeight, 0, 12);
                }
                measuredWidth = iB + c9dVar.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        c9d[] c9dVarArr;
        int i3 = 0;
        while (true) {
            childAt = null;
            c9dVarArr = this.y0;
            if (i3 >= this.x0) {
                break;
            }
            if (i3 < getChildCount()) {
                c9dVarArr[i3] = getChildAt(i3);
            } else {
                c9dVarArr[i3] = 0;
            }
            i3++;
        }
        Arrays.sort(c9dVarArr, this.z0);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int measuredWidth = 0;
        int i4 = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            c9d c9dVar = (c9d) ys.x(i5, c9dVarArr);
            if (c9dVar != null) {
                c9dVar.measure(i, i2);
                int measuredWidth2 = c9dVar.getMeasuredWidth() + measuredWidth + (measuredWidth == 0 ? 0 : kti.d(4 * vw4.d().getDisplayMetrics().density));
                if (measuredWidth2 > size) {
                    i4++;
                    measuredWidth = c9dVar.getMeasuredWidth();
                } else {
                    measuredWidth = measuredWidth2;
                }
                iMax = Math.max(iMax, measuredWidth);
            }
        }
        if (measuredWidth == 0) {
            i4 = 0;
        }
        if ((getChildCount() > 0) && (childAt = getChildAt(0)) == null) {
            throw new IndexOutOfBoundsException();
        }
        setMeasuredDimension(iMax, (kti.d(8 * vw4.d().getDisplayMetrics().density) * i4) + ((i4 + 1) * (childAt != null ? childAt.getMeasuredHeight() : 0)));
    }

    public final void setChipObserver(y8d y8dVar) {
        this.b = y8dVar;
    }

    public final void setIncoming(boolean z) {
        this.c = z;
    }

    public final void setOnChipClickListener(em6 em6Var) {
        this.a = em6Var;
    }

    public final void setStackFromEnd(boolean z) {
        this.d.O(this, A0[0], Boolean.valueOf(z));
    }
}
