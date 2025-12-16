package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class so extends SeekBar {
    public final to a;

    public so(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fvc.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        to toVar = this.a;
        so soVar = toVar.o;
        Drawable drawable = toVar.X;
        if (drawable != null && drawable.isStateful() && drawable.setState(soVar.getDrawableState())) {
            soVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.X;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.Q(canvas);
    }

    public so(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j7g.a(this, getContext());
        to toVar = new to(this);
        this.a = toVar;
        toVar.F(attributeSet, i);
    }
}
