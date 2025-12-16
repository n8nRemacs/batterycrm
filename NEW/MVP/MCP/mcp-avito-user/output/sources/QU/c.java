package QU;

import Y61.k;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.accordion.Accordion;
import kotlin.Metadata;

/* compiled from: Accordion.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQU/c;", "Landroid/animation/Animator$AnimatorListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Accordion f13729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13730b;

    public c(View view, Accordion accordion) {
        this.f13729a = accordion;
        this.f13730b = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        this.f13729a.f178188l = null;
        View view = this.f13730b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
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
