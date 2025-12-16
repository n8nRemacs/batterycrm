package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class yta extends TextView {
    public kgh a;

    public yta(Context context) {
        super(context, null, 0);
    }

    public final kgh getObserverSpanListener() {
        return this.a;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        kgh kghVar;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (this.a != null) {
                kgh.a(this);
            }
        } else if (i == 8 && (kghVar = this.a) != null) {
            kghVar.onViewDetachedFromWindow(this);
        }
    }

    public final void setObserverSpanListener(kgh kghVar) {
        this.a = kghVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
