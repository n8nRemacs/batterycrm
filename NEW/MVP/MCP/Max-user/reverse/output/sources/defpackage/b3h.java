package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public final class b3h extends n2 implements qdh, pdh {
    public m00 X;
    public Long Y;
    public ObjectAnimator Z;
    public sm6 d;
    public sm6 o;
    public final AccelerateDecelerateInterpolator s0;

    public b3h() {
        super(new u7g(6));
        this.s0 = new AccelerateDecelerateInterpolator();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qdh
    public final void c(boolean z) {
        ?? r0 = this.c;
        if (r0.e()) {
            odh odhVar = (odh) r0.getValue();
            odhVar.setVisibility(0);
            if (z) {
                j0();
            } else {
                odhVar.setAlpha(1.0f);
            }
        }
    }

    public final void j0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(T(), (Property<View, Float>) View.ALPHA, ((odh) T()).getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(this.s0);
        objectAnimatorOfFloat.start();
        this.Z = objectAnimatorOfFloat;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qdh
    public final boolean n() {
        return dqi.r(this.c);
    }

    @Override // defpackage.qdh
    public final void p(hdh hdhVar, m00 m00Var, long j, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        this.Y = Long.valueOf(j);
        this.X = m00Var;
        ((odh) T()).a(hdhVar);
        odh odhVar = (odh) T();
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        pdh pdhVar = viewGroup instanceof pdh ? (pdh) viewGroup : null;
        odhVar.setVideoShape(pdhVar != null ? pdhVar.s(z) : s(z));
        ((odh) T()).setVideoContentMode(m00Var instanceof b5h ? idh.b : idh.a);
        f8j.d(T(), 300L, new pcc(24, this));
        ((odh) T()).setOnLongClickListener(new bn0(8, this));
        y();
        if (z2 && ((odh) T()).getAlpha() < 1.0f && ((objectAnimator = this.Z) == null || !objectAnimator.isRunning())) {
            j0();
        }
        View viewT = T();
        if (viewT.isAttachedToWindow()) {
            viewT.addOnAttachStateChangeListener(new r40(viewT, 17, this));
            return;
        }
        odh odhVar2 = (odh) T();
        if (odhVar2.d == null || odhVar2.getChildCount() <= 0) {
            return;
        }
        w();
    }

    @Override // defpackage.pdh
    public final ldh s(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        float[] fArrA = ((qh9) viewGroup.getBackground()).a();
        if (z) {
            fArrA[0] = 0.0f;
            fArrA[1] = 0.0f;
            fArrA[2] = 0.0f;
            fArrA[3] = 0.0f;
        }
        return new kdh(fArrA);
    }

    @Override // defpackage.qdh
    public final void setVideoClickListener(sm6 sm6Var) {
        this.d = sm6Var;
    }

    @Override // defpackage.qdh
    public final void setVideoLongClickListener(sm6 sm6Var) {
        this.o = sm6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qdh
    public final boolean u() {
        ?? r0 = this.c;
        if (!r0.e()) {
            return false;
        }
        odh odhVar = (odh) r0.getValue();
        return odhVar.d != null && odhVar.getChildCount() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qdh
    public final void w() {
        ?? r0 = this.c;
        if (r0.e()) {
            odh odhVar = (odh) r0.getValue();
            ObjectAnimator objectAnimator = this.Z;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            odhVar.setAlpha(0.0f);
            odhVar.setVisibility(8);
            odhVar.b();
        }
    }
}
