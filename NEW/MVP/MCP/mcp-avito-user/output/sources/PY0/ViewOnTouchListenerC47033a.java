package pY0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import j.N;

/* compiled from: InsetDialogOnTouchListener.java */
@RestrictTo
/* renamed from: pY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ViewOnTouchListenerC47033a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Dialog f428601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f428603d;

    /* renamed from: e, reason: collision with root package name */
    public final int f428604e;

    public ViewOnTouchListenerC47033a(@N Dialog dialog, @N Rect rect) {
        this.f428601b = dialog;
        this.f428602c = rect.left;
        this.f428603d = rect.top;
        this.f428604e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@N View view, @N MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f428602c;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f428603d, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i12 = this.f428604e;
            motionEventObtain.setLocation((-i12) - 1, (-i12) - 1);
        }
        view.performClick();
        return this.f428601b.onTouchEvent(motionEventObtain);
    }
}
