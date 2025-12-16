package defpackage;

import android.text.TextPaint;

/* loaded from: classes2.dex */
public final class fr9 extends yk8 {
    public final /* synthetic */ k18 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr9(k18 k18Var) {
        super(6);
        this.g = k18Var;
    }

    @Override // defpackage.yk8
    public final Object a(Object obj) {
        cjg cjgVar = (cjg) obj;
        int iIntValue = ((Number) cjgVar.a).intValue();
        float fFloatValue = ((Number) cjgVar.b).floatValue();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAntiAlias(true);
        textPaint.setColor(iIntValue);
        textPaint.setTextSize(fFloatValue);
        textPaint.linkColor = a93.s0.x(((dza) ((eu0) this.g.getValue())).a).k().a().i().d.b;
        return textPaint;
    }
}
