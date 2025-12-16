package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class s27 implements eih {
    public final Rect a = new Rect();
    public final /* synthetic */ rid b;
    public final /* synthetic */ Path c;
    public final /* synthetic */ Path d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ Rect f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ Rect h;
    public final /* synthetic */ RectF i;
    public final /* synthetic */ Float j;
    public final /* synthetic */ float[] k;
    public final /* synthetic */ RectF l;
    public final /* synthetic */ View m;

    public s27(rid ridVar, Path path, Path path2, Rect rect, Rect rect2, Integer num, Rect rect3, RectF rectF, Float f, float[] fArr, RectF rectF2, View view) {
        this.b = ridVar;
        this.c = path;
        this.d = path2;
        this.e = rect;
        this.f = rect2;
        this.g = num;
        this.h = rect3;
        this.i = rectF;
        this.j = f;
        this.k = fArr;
        this.l = rectF2;
        this.m = view;
    }

    @Override // defpackage.eih
    public final void a() {
        this.c.reset();
        this.d.reset();
        this.b.a = false;
        Drawable background = this.m.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }

    @Override // defpackage.eih
    public final void c(Rect rect, View view) {
        View viewF;
        Rect rect2 = this.a;
        if (fni.a(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        this.b.a = true;
        Path path = this.c;
        path.reset();
        Path path2 = this.d;
        path2.reset();
        Rect rect3 = this.e;
        rect3.set(rect);
        WeakHashMap weakHashMap = hfh.a;
        g4i g4iVarA = weh.a(view);
        co7 co7VarF = g4iVarA != null ? g4iVarA.a.f(7) : null;
        jy4 jy4VarE = g4iVarA != null ? g4iVarA.a.e() : null;
        int iMax = Math.max(co7VarF != null ? co7VarF.a : 0, jy4VarE != null ? jy4VarE.a() : 0);
        if (iMax != 0) {
            rect3.left -= iMax;
            rect3.right -= iMax;
        }
        Rect rect4 = t27.b;
        Rect rect5 = this.f;
        if (rect5 != rect4) {
            rect3.left += rect5.left;
            rect3.top += rect5.top;
            rect3.right -= rect5.right;
            rect3.bottom -= rect5.bottom;
        }
        Integer num = this.g;
        if (num == null || (viewF = dqi.f(view, num.intValue())) == null) {
            viewF = (View) view.getParent();
        }
        shh.d(this.h, viewF);
        RectF rectF = this.i;
        rectF.set(rect3);
        rectF.top = Math.max(rect3.top, r8.top);
        rectF.bottom = Math.max(rect3.bottom, r8.top);
        if (this.j != null) {
            Path.Direction direction = Path.Direction.CCW;
            path2.addRect(rectF, direction);
            RectF rectF2 = this.l;
            rectF2.set(rect3);
            path.addRoundRect(rectF2, this.k, direction);
            path.op(path2, Path.Op.INTERSECT);
        } else {
            path.addRect(rectF, Path.Direction.CCW);
        }
        Drawable background = this.m.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }
}
