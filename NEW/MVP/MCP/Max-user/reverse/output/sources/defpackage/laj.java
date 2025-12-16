package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.ArrayMap;
import java.util.ArrayList;
import one.me.sdk.richvector.AnimationTarget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;

/* loaded from: classes.dex */
public abstract class laj {
    public static final Animator c(Animator animator, String str, EnhancedVectorDrawable enhancedVectorDrawable) {
        Animator animatorClone = animator.clone();
        AnimationTarget animationTargetFindTarget$rich_vector_release = str != null ? enhancedVectorDrawable.findTarget$rich_vector_release(str) : null;
        if (animationTargetFindTarget$rich_vector_release == null) {
            throw new IllegalStateException(("Target with the name \"" + str + "\" cannot be found in the VectorDrawable to be animated.").toString());
        }
        if ((animationTargetFindTarget$rich_vector_release instanceof GroupElement) || (animationTargetFindTarget$rich_vector_release instanceof PathElement)) {
            animatorClone.setTarget(animationTargetFindTarget$rich_vector_release);
            return animatorClone;
        }
        throw new IllegalStateException(("Target should be either GroupElement or PathElement, " + animationTargetFindTarget$rich_vector_release.getClass() + " is not supported").toString());
    }

    public static final void d(EnhancedVectorDrawable enhancedVectorDrawable, AnimatorSet animatorSet, ArrayList arrayList, ArrayMap arrayMap) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(c((Animator) arrayList.get(0), (String) arrayMap.get(arrayList.get(0)), enhancedVectorDrawable));
        for (int i = 1; i < size; i++) {
            builderPlay.with(c((Animator) arrayList.get(i), (String) arrayMap.get(arrayList.get(i)), enhancedVectorDrawable));
        }
    }

    public abstract s5g a();

    public abstract Integer b();
}
