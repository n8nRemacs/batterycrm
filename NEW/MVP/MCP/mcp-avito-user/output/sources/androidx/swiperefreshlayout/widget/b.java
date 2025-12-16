package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import androidx.swiperefreshlayout.widget.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes10.dex */
class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.b f54598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f54599b;

    public b(d dVar, d.b bVar) {
        this.f54599b = dVar;
        this.f54598a = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f54599b;
        dVar.getClass();
        d.b bVar = this.f54598a;
        d.h(fFloatValue, bVar);
        dVar.a(fFloatValue, bVar, false);
        dVar.invalidateSelf();
    }
}
