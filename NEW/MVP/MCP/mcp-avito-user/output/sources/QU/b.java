package QU;

import Y61.k;
import android.animation.Animator;
import android.view.View;
import com.avito.android.lib.design.accordion.Accordion;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Accordion.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQU/b;", "Landroid/animation/Animator$AnimatorListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Accordion f13728b;

    public b(View view, Accordion accordion) {
        this.f13727a = view;
        this.f13728b = accordion;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        this.f13727a.setVisibility(8);
        this.f13728b.f178188l = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@k Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@k Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@k Animator animator) {
    }
}
