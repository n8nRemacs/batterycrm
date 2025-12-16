package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import e11.C39898q;
import e11.C39924z;

/* loaded from: classes7.dex */
public class b1 extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f364716b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final BitmapDrawable f364717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f364718d;

    /* renamed from: e, reason: collision with root package name */
    public final int f364719e;

    /* renamed from: f, reason: collision with root package name */
    public final int f364720f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final Rect f364721g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final Rect f364722h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final Rect f364723i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final Rect f364724j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public a f364725k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364726l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364727m;

    /* renamed from: n, reason: collision with root package name */
    public int f364728n;

    public interface a {
        void d();
    }

    public b1(@j.N Context context) {
        super(context);
        this.f364721g = new Rect();
        this.f364722h = new Rect();
        this.f364723i = new Rect();
        this.f364724j = new Rect();
        this.f364728n = 8388661;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C39898q.a(new C39924z(context).a(30)));
        this.f364717c = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.f364716b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f364718d = C39924z.c(50, context);
        this.f364719e = C39924z.c(30, context);
        this.f364720f = C39924z.c(8, context);
        setWillNotDraw(false);
    }

    @j.k0
    public final boolean a(int i12, int i13, int i14) {
        Rect rect = this.f364722h;
        return i12 >= rect.left - i14 && i13 >= rect.top - i14 && i12 < rect.right + i14 && i13 < rect.bottom + i14;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z12 = this.f364726l;
        BitmapDrawable bitmapDrawable = this.f364717c;
        if (z12) {
            this.f364726l = false;
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.f364721g;
            rect.set(0, 0, width, height);
            int i12 = this.f364728n;
            int i13 = this.f364718d;
            Rect rect2 = this.f364722h;
            Gravity.apply(i12, i13, i13, rect, rect2);
            Rect rect3 = this.f364724j;
            rect3.set(rect2);
            int i14 = this.f364720f;
            rect3.inset(i14, i14);
            int i15 = this.f364728n;
            int i16 = this.f364719e;
            Rect rect4 = this.f364723i;
            Gravity.apply(i15, i16, i16, rect3, rect4);
            bitmapDrawable.setBounds(rect4);
        }
        if (bitmapDrawable.isVisible()) {
            bitmapDrawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        this.f364726l = true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x12 = (int) motionEvent.getX();
        int y12 = (int) motionEvent.getY();
        if (!this.f364717c.isVisible() || !a(x12, y12, this.f364716b)) {
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f364727m = true;
        } else if (action != 1) {
            if (action == 3) {
                this.f364727m = false;
            }
        } else if (this.f364727m) {
            playSoundEffect(0);
            a aVar = this.f364725k;
            if (aVar != null) {
                aVar.d();
            }
            this.f364727m = false;
        }
        return true;
    }

    @j.k0
    public void setCloseBounds(@j.N Rect rect) {
        this.f364722h.set(rect);
    }

    public void setCloseGravity(int i12) {
        this.f364728n = i12;
    }

    public void setCloseVisible(boolean z12) {
        String str = z12 ? "close_button" : "closeable_layout";
        int i12 = C39924z.f394913b;
        setContentDescription(str);
        C39924z.m(this, str);
        if (this.f364717c.setVisible(z12, false)) {
            invalidate(this.f364722h);
        }
    }

    public void setOnCloseListener(@j.P a aVar) {
        this.f364725k = aVar;
    }
}
