package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class d1i extends ImageView implements AnimatedFileDrawable.OnNextFrameRenderedListener, pk8 {
    public String a;
    public boolean b;
    public c1i c;
    public boolean d;
    public AnimatedFileDrawable o;
    public final qi s0;

    public d1i(Context context) {
        super(context, null);
        this.s0 = new qi(6, this);
    }

    @Override // defpackage.pk8
    public final void b() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.o == null) {
            return;
        }
        this.d = false;
        if (!isAttachedToWindow() || (animatedFileDrawable = this.o) == null) {
            return;
        }
        animatedFileDrawable.stop();
    }

    @Override // defpackage.pk8
    public final void c() {
        AnimatedFileDrawable animatedFileDrawable;
        this.d = true;
        if (!isAttachedToWindow() || (animatedFileDrawable = this.o) == null) {
            return;
        }
        animatedFileDrawable.start();
    }

    @Override // defpackage.pk8
    public final void f() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.o != null) {
            this.d = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.o) != null) {
                animatedFileDrawable.stop();
            }
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.o;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.recycle();
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.o;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.stop();
        }
        this.o = null;
        setImageDrawable(null);
        this.a = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        AnimatedFileDrawable animatedFileDrawable;
        super.onAttachedToWindow();
        AnimatedFileDrawable animatedFileDrawable2 = this.o;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.setCallback(this);
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.o;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.addParent(this.s0);
        }
        if (!this.d || (animatedFileDrawable = this.o) == null) {
            return;
        }
        animatedFileDrawable.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedFileDrawable animatedFileDrawable = this.o;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.stop();
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.o;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.removeParent(this.s0);
        }
    }

    @Override // one.me.sdk.media.ffmpeg.AnimatedFileDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable) {
        if (this.b) {
            c1i c1iVar = this.c;
            if (c1iVar != null) {
                e1i e1iVar = (e1i) ((ehg) c1iVar).b;
                ((OneMeDraweeView) e1iVar.a.b).setVisibility(8);
                if (e1iVar.c) {
                    e1iVar.d = true;
                }
            }
            this.b = false;
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            this.o = animatedFileDrawable;
            AnimatedFileDrawable animatedFileDrawable2 = drawable != null ? animatedFileDrawable : null;
            qi qiVar = this.s0;
            if (animatedFileDrawable2 != null) {
                animatedFileDrawable2.removeParent(qiVar);
            }
            animatedFileDrawable.addParent(qiVar);
            this.d = true;
        } else {
            this.d = false;
        }
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.o = null;
    }

    public final void setOnFirstFrameListener(c1i c1iVar) {
        this.c = c1iVar;
        this.b = true;
    }
}
