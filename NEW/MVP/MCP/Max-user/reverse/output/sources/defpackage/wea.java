package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class wea extends ewe {
    public static final /* synthetic */ yy7[] j;
    public final Path g = new Path();
    public final RectF h = new RectF();
    public final nk i = new nk(this);

    static {
        z8a z8aVar = new z8a(wea.class, "cornerRadius", "getCornerRadius()F");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    @Override // defpackage.ewe, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.h;
        rectF.set(bounds);
        Path path = this.g;
        path.reset();
        yy7[] yy7VarArr = j;
        yy7 yy7Var = yy7VarArr[0];
        nk nkVar = this.i;
        float fFloatValue = ((Number) nkVar.b).floatValue();
        yy7 yy7Var2 = yy7VarArr[0];
        path.addRoundRect(rectF, fFloatValue, ((Number) nkVar.b).floatValue(), Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
    }
}
