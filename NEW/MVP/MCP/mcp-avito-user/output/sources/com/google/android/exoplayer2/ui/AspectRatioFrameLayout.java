package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.p;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes6.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final c f347378b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public b f347379c;

    /* renamed from: d, reason: collision with root package name */
    public float f347380d;

    /* renamed from: e, reason: collision with root package name */
    public int f347381e;

    public interface b {
        void a();
    }

    public final class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public boolean f347382b;

        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f347382b = false;
            b bVar = AspectRatioFrameLayout.this.f347379c;
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public AspectRatioFrameLayout(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f347381e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.m.f347537a, 0, 0);
            try {
                this.f347381e = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f347378b = new c(null);
    }

    public int getResizeMode() {
        return this.f347381e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        float f12;
        float f13;
        super.onMeasure(i12, i13);
        if (this.f347380d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f14 = measuredWidth;
        float f15 = measuredHeight;
        float f16 = (this.f347380d / (f14 / f15)) - 1.0f;
        float fAbs = Math.abs(f16);
        c cVar = this.f347378b;
        if (fAbs <= 0.01f) {
            cVar.getClass();
            if (cVar.f347382b) {
                return;
            }
            cVar.f347382b = true;
            AspectRatioFrameLayout.this.post(cVar);
            return;
        }
        int i14 = this.f347381e;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    f12 = this.f347380d;
                } else if (i14 == 4) {
                    if (f16 > 0.0f) {
                        f12 = this.f347380d;
                    } else {
                        f13 = this.f347380d;
                    }
                }
                measuredWidth = (int) (f15 * f12);
            } else {
                f13 = this.f347380d;
            }
            measuredHeight = (int) (f14 / f13);
        } else if (f16 > 0.0f) {
            f13 = this.f347380d;
            measuredHeight = (int) (f14 / f13);
        } else {
            f12 = this.f347380d;
            measuredWidth = (int) (f15 * f12);
        }
        cVar.getClass();
        if (!cVar.f347382b) {
            cVar.f347382b = true;
            AspectRatioFrameLayout.this.post(cVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f12) {
        if (this.f347380d != f12) {
            this.f347380d = f12;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@P b bVar) {
        this.f347379c = bVar;
    }

    public void setResizeMode(int i12) {
        if (this.f347381e != i12) {
            this.f347381e = i12;
            requestLayout();
        }
    }
}
