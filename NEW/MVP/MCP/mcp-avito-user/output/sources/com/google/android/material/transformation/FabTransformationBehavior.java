package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j.InterfaceC42153i;
import j.N;
import j.P;
import lY0.C43707b;
import lY0.i;
import lY0.j;
import lY0.k;

@Deprecated
/* loaded from: classes6.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f357722c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f357723d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f357724e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f357725f;

    /* renamed from: g, reason: collision with root package name */
    public float f357726g;

    /* renamed from: h, reason: collision with root package name */
    public float f357727h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f357728a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f357729b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f357730c;

        public a(View view, View view2, boolean z12) {
            this.f357728a = z12;
            this.f357729b = view;
            this.f357730c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f357728a) {
                return;
            }
            this.f357729b.setVisibility(4);
            View view = this.f357730c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f357728a) {
                this.f357729b.setVisibility(0);
                View view = this.f357730c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public i f357731a;

        /* renamed from: b, reason: collision with root package name */
        public k f357732b;
    }

    public FabTransformationBehavior() {
        this.f357722c = new Rect();
        this.f357723d = new RectF();
        this.f357724e = new RectF();
        this.f357725f = new int[2];
    }

    public static float A(@N b bVar, @N j jVar, float f12) {
        long j12 = jVar.f413893a;
        j jVarD = bVar.f357731a.d("expansion");
        return C43707b.a(f12, 0.0f, jVar.b().getInterpolation((((jVarD.f413893a + jVarD.f413894b) + 17) - j12) / jVar.f413894b));
    }

    @N
    public static Pair x(float f12, float f13, boolean z12, @N b bVar) {
        j jVarD;
        j jVarD2;
        if (f12 == 0.0f || f13 == 0.0f) {
            jVarD = bVar.f357731a.d("translationXLinear");
            jVarD2 = bVar.f357731a.d("translationYLinear");
        } else if ((!z12 || f13 >= 0.0f) && (z12 || f13 <= 0.0f)) {
            jVarD = bVar.f357731a.d("translationXCurveDownwards");
            jVarD2 = bVar.f357731a.d("translationYCurveDownwards");
        } else {
            jVarD = bVar.f357731a.d("translationXCurveUpwards");
            jVarD2 = bVar.f357731a.d("translationYCurveUpwards");
        }
        return new Pair(jVarD, jVarD2);
    }

    public final void B(@N View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f357725f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b C(Context context, boolean z12);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC42153i
    public final boolean d(@N View view, @N View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC42153i
    public final void e(@N CoordinatorLayout.g gVar) {
        if (gVar.f44454h == 0) {
            gVar.f44454h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0357  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet w(@j.N android.view.View r24, @j.N android.view.View r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.w(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float y(@N View view, @N View view2, @N k kVar) {
        RectF rectF = this.f357723d;
        RectF rectF2 = this.f357724e;
        B(view, rectF);
        rectF.offset(this.f357726g, this.f357727h);
        B(view2, rectF2);
        kVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float z(@N View view, @N View view2, @N k kVar) {
        RectF rectF = this.f357723d;
        RectF rectF2 = this.f357724e;
        B(view, rectF);
        rectF.offset(this.f357726g, this.f357727h);
        B(view2, rectF2);
        kVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f357722c = new Rect();
        this.f357723d = new RectF();
        this.f357724e = new RectF();
        this.f357725f = new int[2];
    }
}
