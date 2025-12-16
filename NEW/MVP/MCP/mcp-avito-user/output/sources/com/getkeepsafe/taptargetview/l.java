package com.getkeepsafe.taptargetview;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.getkeepsafe.taptargetview.d;

/* compiled from: TapTargetView.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public class l extends View {

    /* renamed from: b, reason: collision with root package name */
    public boolean f342850b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f342851c;

    /* renamed from: d, reason: collision with root package name */
    public float f342852d;

    /* compiled from: TapTargetView.java */
    public class a implements d.b {
        @Override // com.getkeepsafe.taptargetview.d.b
        public final void a(float f12) {
            throw null;
        }
    }

    /* compiled from: TapTargetView.java */
    public class b implements d.a {
    }

    /* compiled from: TapTargetView.java */
    public class c implements d.b {
        @Override // com.getkeepsafe.taptargetview.d.b
        public final void a(float f12) {
            throw null;
        }
    }

    /* compiled from: TapTargetView.java */
    public class d implements d.b {
        @Override // com.getkeepsafe.taptargetview.d.b
        public final void a(float f12) {
            throw null;
        }
    }

    /* compiled from: TapTargetView.java */
    public class e implements d.a {
    }

    /* compiled from: TapTargetView.java */
    public class f implements d.b {
        @Override // com.getkeepsafe.taptargetview.d.b
        public final void a(float f12) {
            throw null;
        }
    }

    /* compiled from: TapTargetView.java */
    public class g implements d.a {
    }

    /* compiled from: TapTargetView.java */
    public class h implements d.b {
        @Override // com.getkeepsafe.taptargetview.d.b
        public final void a(float f12) {
            Math.min(1.0f, f12 * 2.0f);
            throw null;
        }
    }

    /* compiled from: TapTargetView.java */
    public static class i {
    }

    public int[] getOuterCircleCenterPoint() {
        throw null;
    }

    public Rect getTextBounds() {
        getTotalTextHeight();
        getTotalTextWidth();
        throw null;
    }

    public int getTotalTextHeight() {
        return 0;
    }

    public int getTotalTextWidth() {
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f342850b) {
            return;
        }
        this.f342850b = true;
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i12, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i12, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public void setDrawDebug(boolean z12) {
        if (this.f342851c != z12) {
            this.f342851c = z12;
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
