package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class ig5 {
    public final jg5 a;
    public final AnimatorSet b;
    public final bwf c;
    public final bwf d;
    public float e;

    public ig5(jg5 jg5Var, AnimatorSet animatorSet) {
        this.a = jg5Var;
        this.b = animatorSet.clone();
        final int i = 0;
        this.c = new bwf(new cm6(this) { // from class: hg5
            public final /* synthetic */ ig5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AnimatorSet animatorSet2 = this.b.b;
                        long totalDuration = 0;
                        if (animatorSet2 != null && !animatorSet2.getChildAnimations().isEmpty()) {
                            Iterator<T> it = animatorSet2.getChildAnimations().iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            Animator animator = (Animator) it.next();
                            totalDuration = animator.getTotalDuration() + animator.getStartDelay();
                            while (it.hasNext()) {
                                Animator animator2 = (Animator) it.next();
                                long totalDuration2 = animator2.getTotalDuration() + animator2.getStartDelay();
                                if (totalDuration < totalDuration2) {
                                    totalDuration = totalDuration2;
                                }
                            }
                        }
                        return Long.valueOf(totalDuration);
                    default:
                        AnimatorSet animatorSet3 = this.b.b;
                        ArrayList arrayList = new ArrayList();
                        ig5.a(animatorSet3, arrayList, 0L);
                        List listX = ue3.X(arrayList, new s55(28));
                        ArrayList arrayList2 = new ArrayList(we3.q(listX, 10));
                        Iterator it2 = listX.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((ValueAnimator) ((imb) it2.next()).a);
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.d = new bwf(new cm6(this) { // from class: hg5
            public final /* synthetic */ ig5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AnimatorSet animatorSet2 = this.b.b;
                        long totalDuration = 0;
                        if (animatorSet2 != null && !animatorSet2.getChildAnimations().isEmpty()) {
                            Iterator<T> it = animatorSet2.getChildAnimations().iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            Animator animator = (Animator) it.next();
                            totalDuration = animator.getTotalDuration() + animator.getStartDelay();
                            while (it.hasNext()) {
                                Animator animator2 = (Animator) it.next();
                                long totalDuration2 = animator2.getTotalDuration() + animator2.getStartDelay();
                                if (totalDuration < totalDuration2) {
                                    totalDuration = totalDuration2;
                                }
                            }
                        }
                        return Long.valueOf(totalDuration);
                    default:
                        AnimatorSet animatorSet3 = this.b.b;
                        ArrayList arrayList = new ArrayList();
                        ig5.a(animatorSet3, arrayList, 0L);
                        List listX = ue3.X(arrayList, new s55(28));
                        ArrayList arrayList2 = new ArrayList(we3.q(listX, 10));
                        Iterator it2 = listX.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((ValueAnimator) ((imb) it2.next()).a);
                        }
                        return arrayList2;
                }
            }
        });
    }

    public static final void a(Animator animator, ArrayList arrayList, long j) {
        if (!(animator instanceof AnimatorSet)) {
            if (animator instanceof ValueAnimator) {
                arrayList.add(new imb(animator, Long.valueOf(((ValueAnimator) animator).getStartDelay() + j)));
            }
        } else {
            AnimatorSet animatorSet = (AnimatorSet) animator;
            long startDelay = animatorSet.getStartDelay() + j;
            Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, startDelay);
            }
        }
    }
}
