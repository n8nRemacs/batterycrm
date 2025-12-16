package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.C22949g;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: DefaultSpecialEffectsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/j;", "Landroid/view/animation/Animation$AnimationListener;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC22952j implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f46562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C22949g f46563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f46564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C22949g.a f46565d;

    public AnimationAnimationListenerC22952j(View view, C22949g.a aVar, C22949g c22949g, SpecialEffectsController.Operation operation) {
        this.f46562a = operation;
        this.f46563b = c22949g;
        this.f46564c = view;
        this.f46565d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@Y61.k Animation animation) {
        C22949g c22949g = this.f46563b;
        c22949g.f46501a.post(new RunnableC22944b(c22949g, this.f46564c, this.f46565d));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f46562a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@Y61.k Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f46562a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@Y61.k Animation animation) {
    }
}
