package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class m41 extends ih {
    public static final /* synthetic */ int C0 = 0;
    public final Object A0;
    public final Object B0;
    public final int u0;
    public final boolean v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final Object z0;

    public m41() {
        this(0, 7, false);
    }

    public static boolean o(View view) {
        return view != null && view.getId() == j0b.c1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ih, defpackage.h54
    public final boolean d() {
        if (((nv4) this.B0.getValue()).a()) {
            return true;
        }
        return this.v0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ih
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        int i;
        boolean zA = ((nv4) this.B0.getValue()).a();
        ?? r1 = this.z0;
        if (!zA && (i = this.u0) != 4) {
            if (o(view2) && i == 2) {
                return ((t61) r1.getValue()).l(viewGroup, view, view2, z, z2);
            }
            boolean zO = o(view2);
            ?? r10 = this.x0;
            if (zO && i == 1) {
                return ((il1) r10.getValue()).l(viewGroup, view, view2, z, z2);
            }
            ?? r8 = this.w0;
            if (view != null && view.getId() == j0b.d1 && o(view2)) {
                return (AnimatorSet) r8.getValue();
            }
            ?? r9 = this.y0;
            if ((view2 != null && view2.getId() == j0b.d1) || (view != null && view.getId() == j0b.d1)) {
                return ((jq1) r9.getValue()).l(viewGroup, view, view2, z, z2);
            }
            if ((view != null && view.getId() == j0b.v0) || (view2 != null && view2.getId() == j0b.v0)) {
                return (AnimatorSet) r8.getValue();
            }
            boolean zO2 = o(view);
            ?? r11 = this.A0;
            if (zO2 && ((hw1) ((tv1) r11.getValue())).t() && ((hw1) ((tv1) r11.getValue())).B()) {
                return ((il1) r10.getValue()).l(viewGroup, view, view2, z, z2);
            }
            if ((!o(view) || !((hw1) ((tv1) r11.getValue())).t()) && !((hw1) ((tv1) r11.getValue())).t()) {
                return ((t61) r1.getValue()).l(viewGroup, view, view2, z, z2);
            }
            return ((jq1) r9.getValue()).l(viewGroup, view, view2, z, z2);
        }
        return ((t61) r1.getValue()).l(viewGroup, view, view2, z, z2);
    }

    @Override // defpackage.ih
    public final void n(View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(int i, int i2, boolean z) {
        super(0);
        i = (i2 & 1) != 0 ? 3 : i;
        z = (i2 & 2) != 0 ? true : z;
        this.u0 = i;
        this.v0 = z;
        this.w0 = ipi.b(3, new g31(2));
        final int i3 = 0;
        this.x0 = ipi.b(3, new cm6(this) { // from class: l41
            public final /* synthetic */ m41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i4 = i3;
                m41 m41Var = this.b;
                switch (i4) {
                    case 0:
                        int i5 = m41.C0;
                        return new il1(250L, m41Var.d());
                    case 1:
                        int i6 = m41.C0;
                        return new jq1(250L, m41Var.d());
                    default:
                        int i7 = m41.C0;
                        return new t61(250L, m41Var.d());
                }
            }
        });
        final int i4 = 1;
        this.y0 = ipi.b(3, new cm6(this) { // from class: l41
            public final /* synthetic */ m41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i42 = i4;
                m41 m41Var = this.b;
                switch (i42) {
                    case 0:
                        int i5 = m41.C0;
                        return new il1(250L, m41Var.d());
                    case 1:
                        int i6 = m41.C0;
                        return new jq1(250L, m41Var.d());
                    default:
                        int i7 = m41.C0;
                        return new t61(250L, m41Var.d());
                }
            }
        });
        final int i5 = 2;
        this.z0 = ipi.b(3, new cm6(this) { // from class: l41
            public final /* synthetic */ m41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i42 = i5;
                m41 m41Var = this.b;
                switch (i42) {
                    case 0:
                        int i52 = m41.C0;
                        return new il1(250L, m41Var.d());
                    case 1:
                        int i6 = m41.C0;
                        return new jq1(250L, m41Var.d());
                    default:
                        int i7 = m41.C0;
                        return new t61(250L, m41Var.d());
                }
            }
        });
        this.A0 = ipi.b(3, new g31(3));
        this.B0 = ipi.b(3, new g31(4));
    }
}
