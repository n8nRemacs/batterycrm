package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.i61;
import j.InterfaceC42151g;

/* loaded from: classes8.dex */
final class q91 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, gr0.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f389119c;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f389121e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f389117a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f389118b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    private final float f389120d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    private volatile float f389122f = 3.1415927f;

    public interface a {
    }

    public q91(Context context, a aVar) {
        this.f389119c = aVar;
        this.f389121e = new GestureDetector(context, this);
    }

    @Override // com.yandex.mobile.ads.impl.gr0.a
    @InterfaceC42151g
    public final void a(float[] fArr, float f12) {
        this.f389122f = -f12;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f389117a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f12, float f13) {
        float x12 = (motionEvent2.getX() - this.f389117a.x) / this.f389120d;
        float y12 = motionEvent2.getY();
        PointF pointF = this.f389117a;
        float f14 = (y12 - pointF.y) / this.f389120d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d12 = this.f389122f;
        float fCos = (float) Math.cos(d12);
        float fSin = (float) Math.sin(d12);
        PointF pointF2 = this.f389118b;
        pointF2.x -= (fCos * x12) - (fSin * f14);
        float f15 = (fCos * f14) + (fSin * x12) + pointF2.y;
        pointF2.y = f15;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f15));
        ((i61.a) this.f389119c).a(this.f389118b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return i61.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f389121e.onTouchEvent(motionEvent);
    }
}
