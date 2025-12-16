package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c7g extends Drawable {
    public final b7g a;
    public final Object b = ipi.b(3, new kvf(5, this));

    public c7g(b7g b7gVar) {
        this.a = b7gVar;
    }

    public final c7g a(float f) {
        wuf wufVarMutate;
        wuf wufVar;
        b7g b7gVar = this.a;
        a7g a7gVar = b7gVar.a;
        a7g a7gVar2 = null;
        if (a7gVar == null || (wufVar = a7gVar.a) == null) {
            wufVarMutate = null;
        } else {
            wufVarMutate = wufVar.mutate();
            wufVarMutate.a.f = f;
        }
        if (wufVarMutate != null) {
            a7gVar.getClass();
            a7gVar2 = new a7g(wufVarMutate);
        }
        y6g y6gVar = b7gVar.b;
        y6g y6gVar2 = b7gVar.c;
        List list = b7gVar.d;
        List list2 = b7gVar.e;
        Integer num = b7gVar.f;
        b7gVar.getClass();
        return new c7g(new b7g(a7gVar2, y6gVar, y6gVar2, list, list2, num));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        uyg uygVar = (uyg) this.b.getValue();
        b7g b7gVar = uygVar.a;
        Integer num = b7gVar.f;
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        if (b7gVar.b != null) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (Paint) uygVar.b.getValue());
        }
        if (b7gVar.e != null) {
            uyg.a(canvas, uygVar.f, uygVar.g, (Paint) uygVar.d.getValue());
        }
        ArrayList arrayList = uygVar.h;
        a7g a7gVar = b7gVar.a;
        y6g y6gVar = b7gVar.c;
        if (a7gVar == null) {
            return;
        }
        wuf wufVar = a7gVar.a;
        if (y6gVar == null && arrayList.isEmpty()) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(null, null);
        if (y6gVar != null) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (Paint) uygVar.c.getValue());
        }
        if (!arrayList.isEmpty()) {
            uyg.a(canvas, arrayList, uygVar.i, (Paint) uygVar.e.getValue());
        }
        s8g s8gVar = wufVar.a;
        s8g s8gVar2 = wufVar.a;
        Xfermode xfermode = s8gVar.g.getXfermode();
        int alpha = wufVar.getAlpha();
        s8gVar2.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        wufVar.setAlpha(255);
        wufVar.draw(canvas);
        s8gVar2.g.setXfermode(xfermode);
        wufVar.setAlpha(alpha);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return a(1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        uyg uygVar = (uyg) this.b.getValue();
        uygVar.getClass();
        int iWidth = rect.width();
        int iHeight = rect.height();
        b7g b7gVar = uygVar.a;
        y6g y6gVar = b7gVar.b;
        if (y6gVar != null) {
            RectF rectFC = uyg.c(iWidth, y6gVar.b, iHeight);
            ((Paint) uygVar.b.getValue()).setShader(new LinearGradient(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom, y6gVar.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        y6g y6gVar2 = b7gVar.c;
        if (y6gVar2 != null) {
            RectF rectFC2 = uyg.c(iWidth, y6gVar2.b, iHeight);
            ((Paint) uygVar.c.getValue()).setShader(new LinearGradient(rectFC2.left, rectFC2.top, rectFC2.right, rectFC2.bottom, y6gVar2.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        List list = b7gVar.d;
        if (list != null) {
            uyg.b(list, uygVar.f, uygVar.g, iWidth, iHeight);
        }
        List list2 = b7gVar.e;
        if (list2 != null) {
            uyg.b(list2, uygVar.h, uygVar.i, iWidth, iHeight);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
