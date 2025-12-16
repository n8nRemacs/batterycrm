package com.avito.android.messenger.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.avito.android.util.D1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AnimExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {
    @Y61.k
    public static final AnimatorSet a(@Y61.k View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 3.0f, 3.0f, 3.0f);
        objectAnimatorOfFloat.setDuration(3000L);
        D1.a(objectAnimatorOfFloat, -1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 3.0f, 3.0f, 3.0f);
        objectAnimatorOfFloat2.setDuration(3000L);
        D1.a(objectAnimatorOfFloat2, -1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 0.0f, 0.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(3000L);
        D1.a(objectAnimatorOfFloat3, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }
}
