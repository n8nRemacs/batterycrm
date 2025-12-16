package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import defpackage.k69;
import defpackage.pkb;
import defpackage.utb;
import defpackage.xo8;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList a;

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pkb pkbVar = (pkb) it.next();
                BitmapDrawable bitmapDrawable = pkbVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                BitmapDrawable bitmapDrawable2 = pkbVar.a;
                Rect rect = pkbVar.c;
                if (pkbVar.k) {
                    z = false;
                } else {
                    float fMax = pkbVar.j ? Math.max(0.0f, Math.min(1.0f, (drawingTime - pkbVar.i) / pkbVar.e)) : 0.0f;
                    Interpolator interpolator = pkbVar.d;
                    float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
                    int i = (int) (pkbVar.g * interpolation);
                    Rect rect2 = pkbVar.f;
                    rect.top = rect2.top + i;
                    rect.bottom = rect2.bottom + i;
                    float fI = utb.i(pkbVar.h, 1.0f, interpolation, 1.0f);
                    pkbVar.b = fI;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (fI * 255.0f));
                        bitmapDrawable2.setBounds(rect);
                    }
                    if (pkbVar.j && fMax >= 1.0f) {
                        pkbVar.k = true;
                        xo8 xo8Var = pkbVar.l;
                        if (xo8Var != null) {
                            d dVar = (d) xo8Var.c;
                            dVar.S0.remove((k69) xo8Var.b);
                            dVar.O0.notifyDataSetChanged();
                        }
                    }
                    z = !pkbVar.k;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
