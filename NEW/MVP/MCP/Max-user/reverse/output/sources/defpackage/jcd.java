package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class jcd extends LinearLayout implements u6g {
    public final uxa a;
    public final TextView b;

    public jcd(Context context) {
        super(context, null);
        uxa uxaVar = new uxa(context);
        uxaVar.setId(View.generateViewId());
        float f = 64;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, kti.d(8 * vw4.d().getDisplayMetrics().density));
        uxaVar.setLayoutParams(layoutParams);
        uxaVar.setAvatarShape(kxa.a);
        this.a = uxaVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setHorizontalGravity(17);
        textView.setLayoutParams(layoutParams2);
        float f2 = 82;
        textView.setMaxWidth(kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        dpg.p.b(textView, t75.b);
        textView.setTextColor(a93.s0.y(textView).getText().e);
        this.b = textView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(kti.d(f2 * vw4.d().getDisplayMetrics().density), -2));
        addView(uxaVar);
        addView(textView);
    }

    public final uxa getAvatar() {
        return this.a;
    }

    public final TextView getName() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (b6g.c(this.b)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b.setTextColor(yebVar.getText().e);
    }

    public final void setAbbreviation(mc0 mc0Var) {
        this.a.l(mc0Var, true);
    }

    public final void setAvatar(String str) {
        this.a.setAvatarUrl(str);
    }

    public final void setAvatarShape(nxa nxaVar) {
        this.a.setAvatarShape(nxaVar);
    }

    public final void setName(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.b
            float r1 = defpackage.b6g.e(r0)
            int r1 = defpackage.kpi.r(r1)
            r2 = 0
            if (r5 == 0) goto L1a
            xzg r3 = defpackage.b6g.a(r0)
            if (r3 == 0) goto L16
            int r3 = r3.a
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != r1) goto L1a
            return
        L1a:
            if (r5 == 0) goto L32
            xzg r5 = defpackage.b6g.a(r0)
            if (r5 == 0) goto L24
            int r2 = r5.a
        L24:
            if (r2 == r1) goto L32
            xzg r5 = new xzg
            android.content.Context r2 = r4.getContext()
            uha r3 = defpackage.uha.z0
            r5.<init>(r2, r1, r3)
            goto L33
        L32:
            r5 = 0
        L33:
            defpackage.b6g.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcd.setVerified(boolean):void");
    }
}
