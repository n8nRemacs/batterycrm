package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.hr6;
import defpackage.kx0;
import defpackage.oe8;
import defpackage.tyd;
import defpackage.w7i;

/* loaded from: classes2.dex */
public class LocalPhotoView extends w7i {
    public static final /* synthetic */ int F0 = 0;
    public final GestureDetector D0;
    public oe8 E0;

    public LocalPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GestureDetector gestureDetector = new GestureDetector(context, new kx0(9, this));
        this.D0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        hr6 hr6Var = new hr6(getResources());
        hr6Var.l = tyd.f;
        hr6Var.b = 0;
        setHierarchy(hr6Var.a());
    }

    @Override // defpackage.w7i, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // defpackage.w7i, defpackage.o45, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.D0.onTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setListener(oe8 oe8Var) {
        this.E0 = oe8Var;
    }
}
