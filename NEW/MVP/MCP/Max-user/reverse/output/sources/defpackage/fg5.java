package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public abstract class fg5 extends h45 implements Animatable {
    public final EnhancedAnimatedVectorDrawable b;
    public eg5 c;

    public fg5(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        super(enhancedAnimatedVectorDrawable);
        this.b = enhancedAnimatedVectorDrawable;
    }

    public void a() {
    }

    public void b() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.c == null) {
            eg5 eg5Var = new eg5(this, 0);
            this.c = eg5Var;
            this.b.registerAnimationCallback(eg5Var);
        }
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        if (callback == null) {
            eg5 eg5Var = this.c;
            if (eg5Var != null) {
                enhancedAnimatedVectorDrawable.unregisterAnimationCallback(eg5Var);
            }
            this.c = null;
        }
        if (this.c != null) {
            enhancedAnimatedVectorDrawable.start();
        }
    }

    public void stop() {
        this.b.stop();
    }
}
