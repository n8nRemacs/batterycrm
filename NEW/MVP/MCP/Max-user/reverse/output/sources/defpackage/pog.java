package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class pog extends LinearLayout implements u6g, iq3 {
    public final ShapeDrawable a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout o;
    public final veb s0;
    public final Object t0;
    public final Object u0;
    public final Object v0;
    public oog w0;

    public pog(final Context context) {
        super(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.a = shapeDrawable;
        ImageView imageView = new ImageView(context);
        float f = 88;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        int iD = kti.d(28 * vw4.d().getDisplayMetrics().density);
        imageView.setPadding(iD, iD, iD, iD);
        imageView.setBackground(shapeDrawable);
        this.b = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 24;
        layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        dpg.D.b(textView, t75.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        float f3 = 12;
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f3);
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        dpg.i.b(textView2, t75.b);
        this.d = textView2;
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        frameLayout.setLayoutParams(layoutParams3);
        this.o = frameLayout;
        veb vebVar = new veb(context);
        vebVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.M));
        mgb.a(vebVar, new thg(vebVar, 1, vebVar));
        final int i = 0;
        vebVar.f(new mog(this, 0));
        this.s0 = vebVar;
        this.t0 = ipi.b(3, new cm6() { // from class: nog
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        veb vebVar2 = new veb(context);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        layoutParams4.bottomMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        vebVar2.setLayoutParams(layoutParams4);
                        vebVar2.setBackgroundColorAttr(Integer.valueOf(w9b.M));
                        vebVar2.setTypingMode(teb.b);
                        vebVar2.f(new mog(this, 1));
                        return vebVar2;
                    default:
                        mq3 mq3Var = new mq3(context, 0);
                        pog pogVar = this;
                        mq3Var.setListener(pogVar);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams5.topMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        mq3Var.setLayoutParams(layoutParams5);
                        mgb.a(mq3Var, new ip3(mq3Var, mq3Var, 2));
                        mq3Var.setKeyboardOpen(new q8g(3));
                        pogVar.setGravity(17);
                        return mq3Var;
                }
            }
        });
        final int i2 = 1;
        this.u0 = ipi.b(3, new cm6() { // from class: nog
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        veb vebVar2 = new veb(context);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        layoutParams4.bottomMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        vebVar2.setLayoutParams(layoutParams4);
                        vebVar2.setBackgroundColorAttr(Integer.valueOf(w9b.M));
                        vebVar2.setTypingMode(teb.b);
                        vebVar2.f(new mog(this, 1));
                        return vebVar2;
                    default:
                        mq3 mq3Var = new mq3(context, 0);
                        pog pogVar = this;
                        mq3Var.setListener(pogVar);
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams5.topMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        mq3Var.setLayoutParams(layoutParams5);
                        mgb.a(mq3Var, new ip3(mq3Var, mq3Var, 2));
                        mq3Var.setKeyboardOpen(new q8g(3));
                        pogVar.setGravity(17);
                        return mq3Var;
                }
            }
        });
        this.v0 = ipi.b(3, new p2f(context, 9));
        setOrientation(1);
        setGravity(1);
        setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f3), getPaddingTop(), kti.d(f3 * vw4.d().getDisplayMetrics().density), getPaddingBottom());
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(frameLayout);
        frameLayout.addView(vebVar);
        onThemeChanged(a93.s0.y(this));
    }

    public static void e(veb vebVar, jog jogVar) {
        boolean z = jogVar.g;
        int i = jogVar.f;
        if (z) {
            vebVar.setTypingMode(teb.b);
        } else {
            vebVar.setTypingMode(teb.a);
            vebVar.setEndIconDrawable(null);
        }
        if (jogVar.d && i > 0) {
            vebVar.setMaxLengthForLabel(i);
        }
        s5g s5gVar = jogVar.c;
        if (s5gVar != null) {
            vebVar.h(String.valueOf(s5gVar.d(vebVar)), seb.a);
        } else {
            s5g s5gVar2 = jogVar.b;
            if (s5gVar2 != null) {
                vebVar.h(String.valueOf(s5gVar2.d(vebVar)), seb.c);
            } else {
                vebVar.e();
            }
        }
        vebVar.setHint(String.valueOf(jogVar.a.d(vebVar)));
        if (i > 0) {
            vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getConfirmCodeErrorView() {
        return (TextView) this.v0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final mq3 getConfirmCodeView() {
        return (mq3) this.u0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final veb getSecondTextInputView() {
        return (veb) this.t0.getValue();
    }

    @Override // defpackage.iq3
    public final void a(String str) {
        oog oogVar = this.w0;
        if (oogVar != null) {
            oogVar.a(str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    public final void c(s5g s5gVar) {
        if (s5gVar != null) {
            dqi.a(this, getConfirmCodeErrorView(), -1);
            getConfirmCodeErrorView().setText(s5gVar.d(this));
            getConfirmCodeErrorView().setVisibility(0);
        } else {
            ?? r2 = this.v0;
            if (r2.e()) {
                ((TextView) r2.getValue()).setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void d(jq3 jq3Var) {
        if (dqi.r(this.u0)) {
            getConfirmCodeView().setState(jq3Var);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    public final void f(log logVar) {
        this.b.setImageResource(logVar.getIcon());
        this.c.setText(logVar.getTitle().d(this));
        s5g s5gVarA = logVar.a();
        TextView textView = this.d;
        if (s5gVarA == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(s5gVarA.d(this));
        }
        boolean z = logVar instanceof iog;
        veb vebVar = this.s0;
        if (z) {
            iog iogVar = (iog) logVar;
            e(vebVar, iogVar.b);
            jog jogVar = iogVar.c;
            dqi.a(this.o, getSecondTextInputView(), -1);
            mgb.a(vebVar, new owf(vebVar, this, false, 3));
            e(getSecondTextInputView(), jogVar);
        } else {
            boolean z2 = logVar instanceof hog;
            ?? r5 = this.t0;
            if (z2) {
                e(vebVar, ((hog) logVar).c);
                if (r5.e()) {
                    ((veb) r5.getValue()).setVisibility(8);
                }
            } else if (logVar instanceof fog) {
                e(vebVar, ((fog) logVar).c);
                if (r5.e()) {
                    ((veb) r5.getValue()).setVisibility(8);
                }
            } else if (logVar instanceof kog) {
                vebVar.setVisibility(8);
                if (r5.e()) {
                    ((veb) r5.getValue()).setVisibility(8);
                }
                dqi.a(this, getConfirmCodeView(), -1);
                getConfirmCodeView().setCountCells(((kog) logVar).c);
            } else {
                if (!(logVar instanceof gog)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(vebVar, ((gog) logVar).c);
            }
        }
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        if ((logVar instanceof kog) || z) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = vebVar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != iD) {
            ViewGroup.LayoutParams layoutParams2 = vebVar.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.bottomMargin = iD;
            vebVar.setLayoutParams(marginLayoutParams2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final imb getInputTexts() {
        boolean zR = dqi.r(this.t0);
        veb vebVar = this.s0;
        return zR ? new imb(vebVar.getText(), getSecondTextInputView().getText()) : new imb(vebVar.getText(), null);
    }

    public final oog getListener() {
        return this.w0;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setColorFilter(new PorterDuffColorFilter(yebVar.b().a.i, PorterDuff.Mode.SRC_IN));
        this.b.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().j));
        this.c.setTextColor(yebVar.getText().e);
        this.d.setTextColor(yebVar.getText().g);
        v1a v1aVar = a93.s0;
        this.s0.onThemeChanged(v1aVar.y(this));
        ?? r1 = this.t0;
        if (r1.e()) {
            ((veb) r1.getValue()).onThemeChanged(yebVar);
        }
        ?? r12 = this.u0;
        if (r12.e()) {
            ((mq3) r12.getValue()).onThemeChanged(yebVar);
        }
        ?? r4 = this.v0;
        if (r4.e()) {
            TextView textView = (TextView) r4.getValue();
            textView.setTextColor(v1aVar.y(textView).getText().b);
        }
    }

    public final void setListener(oog oogVar) {
        this.w0 = oogVar;
    }
}
