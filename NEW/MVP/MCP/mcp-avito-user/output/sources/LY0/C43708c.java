package lY0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.RestrictTo;
import j.N;
import java.util.ArrayList;

/* compiled from: AnimatorSetCompat.java */
@RestrictTo
/* renamed from: lY0.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43708c {
    public static void a(@N AnimatorSet animatorSet, @N ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Animator animator = (Animator) arrayList.get(i12);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }
}
