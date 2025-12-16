package defpackage;

import android.animation.AnimatorSet;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final class bg5 {
    public final EnhancedAnimatedVectorDrawable a;
    public final AnimatorSet b;
    public final boolean c;

    public bg5(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, AnimatorSet animatorSet) {
        this.a = enhancedAnimatedVectorDrawable;
        AnimatorSet animatorSetClone = animatorSet.clone();
        this.b = animatorSetClone;
        this.c = animatorSetClone.getTotalDuration() == -1;
    }
}
