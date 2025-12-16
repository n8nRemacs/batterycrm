package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42165v;

/* compiled from: PagerTabStrip.java */
/* loaded from: classes10.dex */
public class d extends e {

    /* renamed from: e, reason: collision with root package name */
    public int f55053e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f55054f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55055g;

    /* renamed from: h, reason: collision with root package name */
    public float f55056h;

    /* renamed from: i, reason: collision with root package name */
    public float f55057i;

    @Override // androidx.viewpager.widget.e
    public final void b(float f12) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.f55054f;
    }

    @Override // androidx.viewpager.widget.e
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    @InterfaceC42156l
    public int getTabIndicatorColor() {
        return this.f55053e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f55055g) {
            return false;
        }
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        if (action == 0) {
            this.f55056h = x12;
            this.f55057i = y12;
            this.f55055g = false;
        } else {
            if (action == 1) {
                throw null;
            }
            if (action == 2) {
                float f12 = 0;
                if (Math.abs(x12 - this.f55056h) > f12 || Math.abs(y12 - this.f55057i) > f12) {
                    this.f55055g = true;
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC42156l int i12) {
        super.setBackgroundColor(i12);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC42165v int i12) {
        super.setBackgroundResource(i12);
    }

    public void setDrawFullUnderline(boolean z12) {
        this.f55054f = z12;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i12, int i13, int i14, int i15) {
        if (i15 < 0) {
            i15 = 0;
        }
        super.setPadding(i12, i13, i14, i15);
    }

    public void setTabIndicatorColor(@InterfaceC42156l int i12) {
        this.f55053e = i12;
        throw null;
    }

    public void setTabIndicatorColorResource(@InterfaceC42158n int i12) {
        setTabIndicatorColor(androidx.core.content.d.getColor(getContext(), i12));
    }

    @Override // androidx.viewpager.widget.e
    public void setTextSpacing(int i12) {
        if (i12 < 0) {
            i12 = 0;
        }
        super.setTextSpacing(i12);
    }
}
