package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class iwe extends TextView {
    public final Paint a;
    public final ewe b;
    public boolean c;

    public iwe(Context context) {
        super(context, null);
        this.a = new Paint();
        ewe eweVar = new ewe();
        this.b = eweVar;
        this.c = true;
        setWillNotDraw(false);
        eweVar.setCallback(this);
        ulc ulcVar = new ulc(4);
        bwe bweVar = (bwe) ulcVar.b;
        bweVar.j = false;
        v1a v1aVar = a93.s0;
        ulcVar.q(v1aVar.y(this).getText().h);
        v1aVar.y(this).getText();
        bweVar.d = -1;
        ulcVar.p(1.0f);
        ulcVar.s(kti.d(360 * vw4.d().getDisplayMetrics().density));
        a(ulcVar.k());
    }

    public final void a(bwe bweVar) {
        this.b.b(bweVar);
        if (bweVar.i) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
