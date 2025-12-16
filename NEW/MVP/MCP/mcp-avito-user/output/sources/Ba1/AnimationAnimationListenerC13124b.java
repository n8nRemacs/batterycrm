package Ba1;

import android.view.animation.Animation;
import kotlin.jvm.internal.N;

/* renamed from: Ba1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class AnimationAnimationListenerC13124b implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f1497a;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationAnimationListenerC13124b(Y41.a aVar) {
        this.f1497a = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1497a.invoke();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
