package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ca9 {
    public final bvf a;
    public final kce b;
    public final String c = ca9.class.getName();
    public final oj7 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public int h;
    public final Object i;

    public ca9(bvf bvfVar, kce kceVar) {
        this.a = bvfVar;
        this.b = kceVar;
        oj7 oj7Var = new oj7();
        oj7Var.b = new int[]{0, a93.s0.z(bvfVar.getContext()).b.d().e.a.a};
        this.d = oj7Var;
        final int i = 0;
        this.e = ipi.b(3, new cm6(this) { // from class: ba9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        bvf bvfVar2 = this.b.a;
                        Context context = bvfVar2.getContext();
                        int i2 = yud.I1;
                        yeb yebVar = a93.s0.z(bvfVar2.getContext()).c;
                        return cei.h(i2, -1, context);
                    case 1:
                        bvf bvfVar3 = this.b.a;
                        Context context2 = bvfVar3.getContext();
                        int i3 = yud.H0;
                        yeb yebVar2 = a93.s0.z(bvfVar3.getContext()).c;
                        return cei.h(i3, -1, context2);
                    case 2:
                        bvf bvfVar4 = this.b.a;
                        Context context3 = bvfVar4.getContext();
                        int i4 = yud.E0;
                        yeb yebVar3 = a93.s0.z(bvfVar4.getContext()).c;
                        return cei.h(i4, -1, context3);
                    default:
                        ca9 ca9Var = this.b;
                        ImageView imageView = new ImageView(ca9Var.a.getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), 17));
                        v1a v1aVar = a93.s0;
                        int i5 = v1aVar.B(imageView).c.c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        yeb yebVar4 = v1aVar.B(imageView).c;
                        cei.k(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ca9Var.f.getValue());
                        f8j.d(imageView, 300L, new ye6(16, ca9Var));
                        return imageView;
                }
            }
        });
        final int i2 = 1;
        this.f = ipi.b(3, new cm6(this) { // from class: ba9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        bvf bvfVar2 = this.b.a;
                        Context context = bvfVar2.getContext();
                        int i22 = yud.I1;
                        yeb yebVar = a93.s0.z(bvfVar2.getContext()).c;
                        return cei.h(i22, -1, context);
                    case 1:
                        bvf bvfVar3 = this.b.a;
                        Context context2 = bvfVar3.getContext();
                        int i3 = yud.H0;
                        yeb yebVar2 = a93.s0.z(bvfVar3.getContext()).c;
                        return cei.h(i3, -1, context2);
                    case 2:
                        bvf bvfVar4 = this.b.a;
                        Context context3 = bvfVar4.getContext();
                        int i4 = yud.E0;
                        yeb yebVar3 = a93.s0.z(bvfVar4.getContext()).c;
                        return cei.h(i4, -1, context3);
                    default:
                        ca9 ca9Var = this.b;
                        ImageView imageView = new ImageView(ca9Var.a.getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), 17));
                        v1a v1aVar = a93.s0;
                        int i5 = v1aVar.B(imageView).c.c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        yeb yebVar4 = v1aVar.B(imageView).c;
                        cei.k(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ca9Var.f.getValue());
                        f8j.d(imageView, 300L, new ye6(16, ca9Var));
                        return imageView;
                }
            }
        });
        final int i3 = 2;
        this.g = ipi.b(3, new cm6(this) { // from class: ba9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        bvf bvfVar2 = this.b.a;
                        Context context = bvfVar2.getContext();
                        int i22 = yud.I1;
                        yeb yebVar = a93.s0.z(bvfVar2.getContext()).c;
                        return cei.h(i22, -1, context);
                    case 1:
                        bvf bvfVar3 = this.b.a;
                        Context context2 = bvfVar3.getContext();
                        int i32 = yud.H0;
                        yeb yebVar2 = a93.s0.z(bvfVar3.getContext()).c;
                        return cei.h(i32, -1, context2);
                    case 2:
                        bvf bvfVar4 = this.b.a;
                        Context context3 = bvfVar4.getContext();
                        int i4 = yud.E0;
                        yeb yebVar3 = a93.s0.z(bvfVar4.getContext()).c;
                        return cei.h(i4, -1, context3);
                    default:
                        ca9 ca9Var = this.b;
                        ImageView imageView = new ImageView(ca9Var.a.getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), 17));
                        v1a v1aVar = a93.s0;
                        int i5 = v1aVar.B(imageView).c.c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        yeb yebVar4 = v1aVar.B(imageView).c;
                        cei.k(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ca9Var.f.getValue());
                        f8j.d(imageView, 300L, new ye6(16, ca9Var));
                        return imageView;
                }
            }
        });
        this.h = 1;
        final int i4 = 3;
        this.i = ipi.b(3, new cm6(this) { // from class: ba9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        bvf bvfVar2 = this.b.a;
                        Context context = bvfVar2.getContext();
                        int i22 = yud.I1;
                        yeb yebVar = a93.s0.z(bvfVar2.getContext()).c;
                        return cei.h(i22, -1, context);
                    case 1:
                        bvf bvfVar3 = this.b.a;
                        Context context2 = bvfVar3.getContext();
                        int i32 = yud.H0;
                        yeb yebVar2 = a93.s0.z(bvfVar3.getContext()).c;
                        return cei.h(i32, -1, context2);
                    case 2:
                        bvf bvfVar4 = this.b.a;
                        Context context3 = bvfVar4.getContext();
                        int i42 = yud.E0;
                        yeb yebVar3 = a93.s0.z(bvfVar4.getContext()).c;
                        return cei.h(i42, -1, context3);
                    default:
                        ca9 ca9Var = this.b;
                        ImageView imageView = new ImageView(ca9Var.a.getContext());
                        float f = 52;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), 17));
                        v1a v1aVar = a93.s0;
                        int i5 = v1aVar.B(imageView).c.c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        yeb yebVar4 = v1aVar.B(imageView).c;
                        cei.k(shapeDrawable, -1728053248);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i5), shapeDrawable, null));
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setImageDrawable((Drawable) ca9Var.f.getValue());
                        f8j.d(imageView, 300L, new ye6(16, ca9Var));
                        return imageView;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final ImageView a() {
        return (ImageView) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    public final void b(int i) {
        ImageView imageViewA;
        float f;
        float f2;
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Media viewer. New state media page: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REFRESH" : "LOADING" : "PAUSE" : "PLAY" : "NONE"), null);
            }
        }
        if (i != 1) {
            dqi.a(this.a, a(), 1);
            c(true);
            if (i == 4) {
                imageViewA = a();
                f = 4;
                f2 = vw4.d().getDisplayMetrics().density;
            } else {
                imageViewA = a();
                f = 14;
                f2 = vw4.d().getDisplayMetrics().density;
            }
            u45.n(f, f2, imageViewA);
        }
        int iV = az1.v(i);
        if (iV == 0) {
            c(false);
        } else if (iV == 1) {
            a().setImageDrawable((Drawable) this.f.getValue());
        } else if (iV == 2) {
            a().setImageDrawable((Drawable) this.g.getValue());
        } else if (iV == 3) {
            a().setImageDrawable(this.d);
        } else {
            if (iV != 4) {
                throw new NoWhenBranchMatchedException();
            }
            a().setImageDrawable((Drawable) this.e.getValue());
        }
        this.h = i;
    }

    public final void c(boolean z) {
        a().setVisibility(z ? 0 : 8);
    }
}
