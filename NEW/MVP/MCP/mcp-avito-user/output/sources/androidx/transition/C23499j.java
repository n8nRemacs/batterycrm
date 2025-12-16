package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.C22823h0;
import androidx.transition.C23498i;
import com.avito.android.R;

/* compiled from: ChangeTransform.java */
/* renamed from: androidx.transition.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23499j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f54791a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f54792b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f54793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f54794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f54795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C23498i.e f54796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C23498i.d f54797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C23498i f54798h;

    public C23499j(C23498i c23498i, boolean z12, Matrix matrix, View view, C23498i.e eVar, C23498i.d dVar) {
        this.f54798h = c23498i;
        this.f54793c = z12;
        this.f54794d = matrix;
        this.f54795e = view;
        this.f54796f = eVar;
        this.f54797g = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f54791a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z12 = this.f54791a;
        C23498i.e eVar = this.f54796f;
        View view = this.f54795e;
        if (!z12) {
            if (this.f54793c && this.f54798h.f54772B) {
                Matrix matrix = this.f54794d;
                Matrix matrix2 = this.f54792b;
                matrix2.set(matrix);
                view.setTag(R.id.transition_transform, matrix2);
                eVar.getClass();
                String[] strArr = C23498i.f54768E;
                view.setTranslationX(eVar.f54782a);
                view.setTranslationY(eVar.f54783b);
                C22823h0.Q(view, eVar.f54784c);
                view.setScaleX(eVar.f54785d);
                view.setScaleY(eVar.f54786e);
                view.setRotationX(eVar.f54787f);
                view.setRotationY(eVar.f54788g);
                view.setRotation(eVar.f54789h);
            } else {
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
            }
        }
        h0.f54765a.d(view, null);
        eVar.getClass();
        String[] strArr2 = C23498i.f54768E;
        view.setTranslationX(eVar.f54782a);
        view.setTranslationY(eVar.f54783b);
        C22823h0.Q(view, eVar.f54784c);
        view.setScaleX(eVar.f54785d);
        view.setScaleY(eVar.f54786e);
        view.setRotationX(eVar.f54787f);
        view.setRotationY(eVar.f54788g);
        view.setRotation(eVar.f54789h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f54797g.f54777a;
        Matrix matrix2 = this.f54792b;
        matrix2.set(matrix);
        View view = this.f54795e;
        view.setTag(R.id.transition_transform, matrix2);
        C23498i.e eVar = this.f54796f;
        eVar.getClass();
        String[] strArr = C23498i.f54768E;
        view.setTranslationX(eVar.f54782a);
        view.setTranslationY(eVar.f54783b);
        C22823h0.Q(view, eVar.f54784c);
        view.setScaleX(eVar.f54785d);
        view.setScaleY(eVar.f54786e);
        view.setRotationX(eVar.f54787f);
        view.setRotationY(eVar.f54788g);
        view.setRotation(eVar.f54789h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = C23498i.f54768E;
        View view = this.f54795e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C22823h0.Q(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
