package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C22949g;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: DefaultSpecialEffectsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/i;", "Landroid/animation/AnimatorListenerAdapter;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22951i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C22949g f46557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f46558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f46559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f46560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C22949g.a f46561e;

    public C22951i(C22949g c22949g, View view, boolean z12, SpecialEffectsController.Operation operation, C22949g.a aVar) {
        this.f46557a = c22949g;
        this.f46558b = view;
        this.f46559c = z12;
        this.f46560d = operation;
        this.f46561e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        ViewGroup viewGroup = this.f46557a.f46501a;
        View view = this.f46558b;
        viewGroup.endViewTransition(view);
        boolean z12 = this.f46559c;
        SpecialEffectsController.Operation operation = this.f46560d;
        if (z12) {
            operation.f46506a.a(view);
        }
        this.f46561e.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(operation);
        }
    }
}
