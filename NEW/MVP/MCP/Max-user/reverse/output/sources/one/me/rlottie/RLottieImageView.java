package one.me.rlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ho7;
import defpackage.ie;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class RLottieImageView extends AppCompatImageView {
    public boolean cached;
    public HashMap d;
    public RLottieDrawable o;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    public RLottieImageView(Context context) {
        this(context, null);
    }

    public void b() {
        stopAnimation();
    }

    public void c() {
        playAnimation();
    }

    public void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        this.o = null;
        setImageDrawable(null);
    }

    public void clearLayerColors() {
        this.d.clear();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.o;
    }

    public ImageReceiver getImageReceiver() {
        return null;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.o;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0 = true;
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.u0) {
                this.o.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0 = false;
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable == null) {
            return;
        }
        this.u0 = true;
        if (!this.t0 || rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.start();
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, null);
    }

    public void setAutoRepeat(boolean z) {
        this.s0 = z;
        this.v0 = true;
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable == null || !z) {
            return;
        }
        rLottieDrawable.setAutoRepeat(1);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            this.o = rLottieDrawable;
            if (this.v0) {
                if (this.s0) {
                    rLottieDrawable.setAutoRepeat(1);
                } else {
                    rLottieDrawable.setAutoRepeat(0);
                }
            }
            this.o.setMasterParent(this);
            if (this.s0) {
                this.o.setAutoRepeat(1);
            }
            if (this.d != null) {
                this.o.beginApplyLayerColors();
                for (Map.Entry entry : this.d.entrySet()) {
                    this.o.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.o.commitApplyLayerColors();
            }
            this.o.setAllowDecodeSingleFrame(true);
            this.u0 = this.o.a1;
        } else {
            this.u0 = false;
        }
        super.setImageDrawable(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.o = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
    }

    public void setProgress(float f) throws InterruptedException {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() throws InterruptedException {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.o;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.o.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.o;
        if (rLottieDrawable == null) {
            return;
        }
        this.u0 = false;
        if (!this.t0 || rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.stop();
    }

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v0 = false;
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, ho7.f(i, ""), ie.a(i2), ie.a(i3), false, iArr));
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.o == rLottieDrawable) {
            return;
        }
        this.o = rLottieDrawable;
        rLottieDrawable.setMasterParent(this);
        if (this.s0) {
            this.o.setAutoRepeat(1);
        }
        if (this.d != null) {
            this.o.beginApplyLayerColors();
            for (Map.Entry entry : this.d.entrySet()) {
                this.o.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            this.o.commitApplyLayerColors();
        }
        this.o.setAllowDecodeSingleFrame(true);
        setImageDrawable(this.o);
    }
}
