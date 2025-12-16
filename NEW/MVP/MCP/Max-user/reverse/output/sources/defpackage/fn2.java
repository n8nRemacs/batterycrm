package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class fn2 extends ConstraintLayout implements u6g {
    public static final /* synthetic */ int M0 = 0;
    public final TextView F0;
    public final TextView G0;
    public final o8b H0;
    public r40 I0;
    public x9f J0;
    public Long K0;
    public v8h L0;

    public fn2(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        kt3 kt3Var = new kt3(-1, -2);
        float f = 4;
        ((ViewGroup.MarginLayoutParams) kt3Var).bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(kt3Var);
        dpg.f.b(textView, t75.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.F0 = textView;
        TextView textView2 = new TextView(context);
        kt3 kt3Var2 = new kt3(-1, -2);
        ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(kt3Var2);
        dpg.j.b(textView2, t75.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.G0 = textView2;
        o8b o8bVar = new o8b(context);
        o8bVar.setId(v8b.m0);
        float f2 = 40;
        o8bVar.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        o8bVar.setScaleType(ImageView.ScaleType.CENTER);
        this.H0 = o8bVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(v8b.l0);
        linearLayout.setLayoutParams(new kt3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new kt3(-1, -2));
        float f3 = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f3);
        setPadding(iD, iD, iD, iD);
        v1a v1aVar = a93.s0;
        setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(this).c().a.a.i), null, new ColorDrawable(-1)));
        addView(o8bVar);
        addView(linearLayout);
        ut3 ut3VarG = l5j.g(this);
        int id = o8bVar.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 6, o8bVar.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
        onThemeChanged(v1aVar.y(this));
    }

    private final void setButtonState(v8h v8hVar) {
        int iOrdinal = v8hVar.ordinal();
        o8b o8bVar = this.H0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                o8bVar.setPlaying(true);
                return;
            } else if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        o8bVar.setPlaying(false);
    }

    private final void setState(x26 x26Var) {
        r40 r40Var;
        this.I0 = new r40(this, 4, x26Var);
        if (isAttachedToWindow() && (r40Var = this.I0) != null) {
            r40Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.I0);
    }

    private final void setSubtitle(CharSequence charSequence) {
        int i = charSequence == null || charSequence.length() == 0 ? 8 : 0;
        TextView textView = this.G0;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.F0.setTextColor(yebVar.getText().e);
        this.G0.setTextColor(yebVar.getText().g);
    }

    public final void setupVideo(xb9 xb9Var) {
        this.K0 = Long.valueOf(xb9Var.b);
        this.H0.setCover(xb9Var.o);
        setTitle(xb9Var.X);
        setSubtitle(xb9Var.Y);
        fve fveVar = xb9Var.Z;
        if (fveVar.b().isEmpty()) {
            v(null);
        }
        setState(fveVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.w8h r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5
            v8h r0 = r6.o
            goto L6
        L5:
            r0 = 0
        L6:
            v8h r1 = r5.L0
            if (r0 != r1) goto Lc
            if (r1 != 0) goto L27
        Lc:
            if (r0 == 0) goto L22
            long r1 = r6.b
            java.lang.Long r3 = r5.K0
            if (r3 != 0) goto L15
            goto L22
        L15:
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1e
            goto L22
        L1e:
            r5.setButtonState(r0)
            goto L27
        L22:
            v8h r1 = defpackage.v8h.a
            r5.setButtonState(r1)
        L27:
            r5.L0 = r0
            if (r6 == 0) goto L2e
            float r6 = r6.X
            goto L2f
        L2e:
            r6 = 0
        L2f:
            o8b r0 = r5.H0
            r0.setProgress(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn2.v(w8h):void");
    }
}
