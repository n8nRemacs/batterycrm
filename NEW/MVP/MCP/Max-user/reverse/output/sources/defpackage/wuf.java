package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class wuf extends Drawable {
    public final s8g a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public wuf(String str, int i, int i2, int i3, s8g s8gVar) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.a = s8gVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wuf mutate() {
        s8g s8gVar = this.a;
        s8gVar.getClass();
        Paint paint = new Paint(s8gVar.g);
        s8g s8gVar2 = new s8g(s8gVar.a, s8gVar.b, s8gVar.c);
        s8gVar2.g = paint;
        s8gVar2.j = true;
        return new wuf(this.b, this.c, this.d, this.e, s8gVar2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        s8g s8gVar = this.a;
        if (!s8gVar.j) {
            wqi.q(s8g.class.getSimpleName(), "error: cant' render svg, incorrect data!", new Object[0]);
            return;
        }
        float f = s8gVar.f;
        int iSave = canvas.save();
        canvas.scale(f, f, 0.0f, 0.0f);
        try {
            canvas.drawPaint(s8gVar.g);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.g.setColorFilter(colorFilter);
    }

    public wuf(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = 1;
        if (vuf.$EnumSwitchMapping$0[az1.v(1)] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        s8g s8gVar = new s8g(str, i, i2);
        this.a = s8gVar;
    }
}
