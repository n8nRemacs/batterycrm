package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.View;

/* loaded from: classes2.dex */
public final class aqf extends ClickableSpan implements UpdateAppearance, u6g {
    public static final /* synthetic */ int o = 0;
    public final fqf a;
    public final sm6 b;
    public int c;
    public int d;

    public aqf(cm6 cm6Var, fqf fqfVar, sm6 sm6Var) {
        this.a = fqfVar;
        this.b = sm6Var;
        this.c = ((yeb) cm6Var.invoke()).e().c;
        this.d = ((yeb) cm6Var.invoke()).e().c;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke(view, this.a);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.c = yebVar.e().c;
        this.d = yebVar.e().c;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.c);
        textPaint.bgColor = rf3.i(this.d, 80);
        textPaint.setUnderlineText(false);
    }
}
