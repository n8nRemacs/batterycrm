package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.InterfaceC36534o;
import e11.C39907t0;
import e11.C39924z;

/* loaded from: classes7.dex */
public final class U0 extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextureView f364618b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public SurfaceView f364619c;

    /* renamed from: d, reason: collision with root package name */
    public int f364620d;

    /* renamed from: e, reason: collision with root package name */
    public int f364621e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public a f364622f;

    /* renamed from: g, reason: collision with root package name */
    public int f364623g;

    public interface a {
        void p();
    }

    public U0(Context context) {
        super(context);
        this.f364618b = new TextureView(context);
        a();
    }

    public final void a() {
        View view = this.f364618b;
        C39924z.m(view, "ad_video");
        if (getChildAt(0) != null) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (this.f364623g != 0) {
            if (this.f364619c == null) {
                this.f364619c = new SurfaceView(getContext());
            }
            view = this.f364619c;
        }
        addView(view, layoutParams);
    }

    public final void b(int i12, int i13) {
        this.f364620d = i12;
        this.f364621e = i13;
        requestLayout();
        invalidate();
    }

    @j.P
    public Bitmap getScreenShot() {
        if (this.f364623g == 1) {
            return null;
        }
        try {
            return this.f364618b.getBitmap(getWidth(), getHeight());
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    @j.N
    public TextureView getTextureView() {
        return this.f364618b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r0 = r2.f364622f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r2 = this;
            super.onAttachedToWindow()
            int r0 = e11.C39924z.f394913b
            r0 = r2
        L6:
            boolean r1 = r0.isHardwareAccelerated()
            if (r1 == 0) goto L40
            int r1 = r0.getLayerType()
            r1 = r1 & 1
            if (r1 == 0) goto L15
            goto L40
        L15:
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 != 0) goto L39
            android.content.Context r0 = r2.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L47
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L47
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L40
            goto L47
        L39:
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L6
        L40:
            com.my.target.U0$a r0 = r2.f364622f
            if (r0 == 0) goto L47
            r0.p()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.U0.onAttachedToWindow():void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int i15 = this.f364620d;
        if (i15 <= 0 || (i14 = this.f364621e) <= 0) {
            super.onMeasure(i12, i13);
            return;
        }
        float f12 = i15 / i14;
        if (mode == 0 && mode2 == 0) {
            size = i15;
            size2 = i14;
        } else {
            if (mode == 0) {
                size = (int) (size2 * f12);
            } else if (mode2 == 0) {
                size2 = (int) (size / f12);
            } else if (C39907t0.a(f12, 1.0f) != -1) {
                i15 = size;
                i14 = size2;
                size2 = (int) (size / f12);
            } else {
                i15 = size;
                i14 = size2;
                size = (int) (size2 * f12);
            }
            i15 = size;
            i14 = size2;
        }
        this.f364618b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        SurfaceView surfaceView = this.f364619c;
        if (surfaceView != null) {
            surfaceView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(i15, i14);
    }

    public void setAdVideoViewListener(@j.P a aVar) {
        this.f364622f = aVar;
    }

    public void setExoPlayer(@j.P InterfaceC36534o interfaceC36534o) {
        if (interfaceC36534o == null) {
            return;
        }
        int i12 = this.f364623g;
        if (i12 == 0) {
            interfaceC36534o.t(null);
            interfaceC36534o.setVideoTextureView(this.f364618b);
        } else {
            if (i12 != 1) {
                return;
            }
            interfaceC36534o.setVideoTextureView(null);
            interfaceC36534o.t(this.f364619c);
        }
    }

    public void setViewMode(int i12) {
        if (this.f364623g == i12) {
            return;
        }
        this.f364623g = i12;
        a();
    }
}
