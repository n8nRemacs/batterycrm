package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.C23427s;

/* compiled from: ItemTouchHelper.java */
/* renamed from: androidx.recyclerview.widget.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23430v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C23427s.f f54198a;

    public C23430v(C23427s.f fVar) {
        this.f54198a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f54198a.f54195m = valueAnimator.getAnimatedFraction();
    }
}
