package ru.ok.messages.video.widgets.doubleTap;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.pz4;
import defpackage.q0d;
import defpackage.rw4;
import defpackage.uaa;
import defpackage.ue3;
import defpackage.uz4;
import defpackage.vw4;
import defpackage.w9a;
import defpackage.wz4;
import java.util.Set;

/* loaded from: classes2.dex */
public class DoubleTapVideoViewWrapper extends FrameLayout {
    public uz4 a;

    public DoubleTapVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        rw4 rw4VarA = rw4.a();
        View pz4Var = new pz4(getContext(), 1);
        pz4Var.setId(q0d.double_tap_video_view_wrapper__arrows_view_left);
        pz4Var.setVisibility(8);
        int i = rw4VarA.s;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i * 2);
        layoutParams.gravity = 8388627;
        super.addView(pz4Var, layoutParams);
        View pz4Var2 = new pz4(getContext(), 2);
        pz4Var2.setId(q0d.double_tap_video_view_wrapper__arrows_view_right);
        pz4Var2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(vw4.b((int) 100.0f), vw4.b((int) 200.0f));
        layoutParams2.gravity = 8388629;
        super.addView(pz4Var2, layoutParams2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view, getChildCount() - 2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() <= 1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uaa uaaVar = (uaa) this.a;
        w9a w9aVar = (w9a) ue3.H((Set) uaaVar.a);
        if (w9aVar != null) {
            View view = (View) uaaVar.c;
            Rect rect = w9aVar.Y;
            view.getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                wz4 wz4Var = w9aVar.c;
                wz4Var.b.onTouchEvent(motionEvent);
                if (wz4Var.c > 0) {
                    return true;
                }
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                w9aVar.o.onTouchEvent(motionEvent);
            } else {
                wz4 wz4Var2 = w9aVar.d;
                wz4Var2.b.onTouchEvent(motionEvent);
                if (wz4Var2.c > 0) {
                    return true;
                }
            }
        }
        getChildAt(0).dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setTouchEventListener(uz4 uz4Var) {
        this.a = uz4Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, getChildCount() - 2, layoutParams);
    }
}
