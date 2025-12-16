package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class ncg extends PopupWindow implements u6g {
    public final int X;
    public final ImageView Y;
    public final TextView Z;
    public final View a;
    public final cm6 b;
    public final cm6 c;
    public final cm6 d;
    public final int o;
    public final TextView s0;
    public final ImageView t0;
    public final Handler u0;
    public bee v0;
    public final Object w0;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ncg(android.content.Context r9, android.view.View r10, defpackage.cm6 r11, defpackage.g31 r12, int r13, int r14, int r15) {
        /*
            r8 = this;
            r0 = r15 & 8
            if (r0 == 0) goto Lc
            kcg r0 = new kcg
            r1 = 0
            r0.<init>()
            r4 = r0
            goto Ld
        Lc:
            r4 = r12
        Ld:
            r0 = r15 & 16
            if (r0 == 0) goto L19
            kcg r0 = new kcg
            r1 = 1
            r0.<init>()
        L17:
            r5 = r0
            goto L1b
        L19:
            r0 = 0
            goto L17
        L1b:
            r0 = r15 & 32
            r1 = 2
            if (r0 == 0) goto L22
            r6 = r1
            goto L23
        L22:
            r6 = r13
        L23:
            r0 = r15 & 64
            if (r0 == 0) goto L2d
            r7 = r1
            r0 = r8
            r2 = r10
            r3 = r11
            r1 = r9
            goto L32
        L2d:
            r7 = r14
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L32:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncg.<init>(android.content.Context, android.view.View, cm6, g31, int, int, int):void");
    }

    public static void b(ncg ncgVar, View view, boolean z, lcg lcgVar, int i) {
        lcg lcgVar2 = (i & 4) != 0 ? null : lcgVar;
        Object tag = view.getTag(zud.V0);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (lcgVar2 != null) {
                    lcgVar2.invoke();
                    return;
                }
                return;
            }
        }
        boolean zA = fni.a(tag, "fade_in");
        boolean zA2 = fni.a(tag, "fade_out");
        if (zA && z) {
            return;
        }
        if (!zA2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float alpha = view.getAlpha();
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? vw4.d().getDisplayMetrics().density * 24.0f : vw4.d().getDisplayMetrics().density * 0.0f;
            float f3 = z ? vw4.d().getDisplayMetrics().density * 0.0f : 24.0f * vw4.d().getDisplayMetrics().density;
            if (z) {
                view.setTranslationY(f2);
            }
            view.animate().setDuration(150L).alpha(f).translationY(f3).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new mcg(view, str, alpha, f, z, f3, lcgVar2)).start();
        }
    }

    public final void a() {
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, false, new lcg(this, 0), 2);
        }
    }

    public final void c(s5g s5gVar) {
        TextView textView = this.Z;
        textView.setText(s5gVar.b(textView.getContext()));
    }

    public final void d(Point point, int i, long j) {
        bee beeVar = this.v0;
        Handler handler = this.u0;
        if (beeVar != null) {
            handler.removeCallbacks(beeVar);
            this.v0 = null;
        }
        showAtLocation(this.a, i, point.x - (getWidth() / 2), point.y);
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, true, null, 6);
        }
        bee beeVar2 = new bee(22, this);
        handler.postDelayed(beeVar2, j);
        this.v0 = beeVar2;
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        try {
            bee beeVar = this.v0;
            if (beeVar != null) {
                this.u0.removeCallbacks(beeVar);
            }
        } catch (Exception e) {
            wqi.p(ncg.class.getName(), e.getMessage(), e);
        }
        this.v0 = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        cm6 cm6Var = this.b;
        yeb yebVar2 = (yeb) cm6Var.invoke();
        cm6 cm6Var2 = this.d;
        this.Y.setImageTintList(cm6Var2 != null ? ColorStateList.valueOf(((Number) cm6Var2.invoke()).intValue()) : null);
        this.Z.setTextColor(ColorStateList.valueOf(yebVar2.getText().e));
        ((hcg) this.w0.getValue()).onThemeChanged(yebVar);
        ((yeb) cm6Var.invoke()).getIcon();
        this.t0.setImageTintList(ColorStateList.valueOf(-1));
    }

    public ncg(Context context, View view, cm6 cm6Var, cm6 cm6Var2, cm6 cm6Var3, int i, int i2) {
        this.a = view;
        this.b = cm6Var;
        this.c = cm6Var2;
        this.d = cm6Var3;
        this.o = i;
        this.X = i2;
        this.u0 = new Handler(Looper.getMainLooper());
        k18 k18VarB = ipi.b(3, new lcg(this, 1));
        this.w0 = k18VarB;
        yeb yebVar = (yeb) cm6Var.invoke();
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        ImageView imageView = new ImageView(context);
        imageView.setId(zud.X0);
        imageView.setLayoutParams(new kt3(-2, -2));
        imageView.setVisibility(8);
        this.Y = imageView;
        TextView textView = new TextView(context);
        textView.setId(zud.Z0);
        textView.setLayoutParams(new kt3(-1, -2));
        textView.setGravity(17);
        textView.setMaxLines(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(ColorStateList.valueOf(yebVar.getText().e));
        dpg.l.b(textView, t75.b);
        this.Z = textView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(zud.W0);
        float f = 20;
        imageView2.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        imageView2.setImageResource(yud.k0);
        ((yeb) cm6Var.invoke()).getIcon();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        f8j.d(imageView2, 300L, new pcc(22, this));
        imageView2.setVisibility(8);
        this.t0 = imageView2;
        TextView textView2 = new TextView(context);
        textView2.setId(zud.Y0);
        textView2.setLayoutParams(new kt3(-1, -2));
        textView2.setGravity(17);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(ColorStateList.valueOf(yebVar.getText().g));
        dpg.o.b(textView2, t75.b);
        textView2.setVisibility(8);
        this.s0 = textView2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        float f2 = 10;
        float f3 = 12;
        constraintLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f2) + (i == 1 ? kti.d(8 * vw4.d().getDisplayMetrics().density) : 0), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density) + (i == 2 ? kti.d(8 * vw4.d().getDisplayMetrics().density) : 0));
        constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        constraintLayout.setBackground((hcg) k18VarB.getValue());
        constraintLayout.addView(imageView2);
        constraintLayout.addView(imageView);
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.setVisibility(8);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = imageView2.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, textView.getId(), 3);
        ut3VarG.g(id2).d.W = 2;
        int id3 = textView.getId();
        ut3VarG.d(id3, 3, imageView.getId(), 4);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, imageView2.getId(), 6);
        ut3VarG.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        ut3VarG.d(id4, 3, textView.getId(), 4);
        new fua(ut3VarG, 3, id4, 5).e(kti.d(4 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id4, 7, textView.getId(), 7);
        ut3VarG.d(id4, 6, textView.getId(), 6);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.a(constraintLayout);
        setContentView(constraintLayout);
    }
}
