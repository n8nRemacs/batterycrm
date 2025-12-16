package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.d;
import com.google.android.exoplayer2.video.spherical.k;
import j.InterfaceC42151g;

/* compiled from: TouchTracker.java */
/* loaded from: classes6.dex */
final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: d, reason: collision with root package name */
    public final a f348405d;

    /* renamed from: f, reason: collision with root package name */
    public final GestureDetector f348407f;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f348403b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    public final PointF f348404c = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final float f348406e = 25.0f;

    /* renamed from: g, reason: collision with root package name */
    public volatile float f348408g = 3.1415927f;

    /* compiled from: TouchTracker.java */
    public interface a {
    }

    public l(Context context, a aVar) {
        this.f348405d = aVar;
        this.f348407f = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.d.a
    @InterfaceC42151g
    public final void a(float[] fArr, float f12) {
        this.f348408g = -f12;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f348403b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f12, float f13) {
        float x12 = (motionEvent2.getX() - this.f348403b.x) / this.f348406e;
        float y12 = motionEvent2.getY();
        PointF pointF = this.f348403b;
        float f14 = (y12 - pointF.y) / this.f348406e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d12 = this.f348408g;
        float fCos = (float) Math.cos(d12);
        float fSin = (float) Math.sin(d12);
        PointF pointF2 = this.f348404c;
        pointF2.x -= (fCos * x12) - (fSin * f14);
        float f15 = (fCos * f14) + (fSin * x12) + pointF2.y;
        pointF2.y = f15;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f15));
        a aVar = this.f348405d;
        PointF pointF3 = this.f348404c;
        k.a aVar2 = (k.a) aVar;
        synchronized (aVar2) {
            float f16 = pointF3.y;
            aVar2.f348398h = f16;
            Matrix.setRotateM(aVar2.f348396f, 0, -f16, (float) Math.cos(aVar2.f348399i), (float) Math.sin(aVar2.f348399i), 0.0f);
            Matrix.setRotateM(aVar2.f348397g, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return k.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f348407f.onTouchEvent(motionEvent);
    }
}
