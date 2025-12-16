package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class vq1 extends ConstraintLayout implements z54, jn1, hn1, g1c {
    public final vs1 F0;
    public final k18 G0;
    public final Object H0;
    public b I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final Object M0;
    public PointF N0;
    public final ViewStub O0;
    public final ViewStub P0;
    public x4h Q0;
    public a64 R0;
    public final Object S0;
    public oq1 T0;
    public bn8 U0;
    public xib V0;
    public boolean W0;
    public tq1 X0;
    public j1c Y0;
    public AnimatorSet Z0;

    public vq1(final Context context) {
        super(context, null);
        this.G0 = gm1.a.getAccessor().d(HttpStatus.SC_INSUFFICIENT_STORAGE);
        this.H0 = ipi.b(3, new rq1(this, 2));
        final int i = 0;
        this.J0 = ipi.b(3, new cm6() { // from class: sq1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return vq1.w(context, this);
                    default:
                        qj1 qj1Var = new qj1(context);
                        qj1Var.setPipTheme(a93.s0.B(qj1Var).c);
                        qj1Var.setPipMode(nj1.b);
                        qj1Var.setId(View.generateViewId());
                        vq1 vq1Var = this;
                        qj1Var.setListener(new y6i(7, vq1Var));
                        qj1Var.setVisibility(8);
                        qj1Var.setVideoLayoutUpdatesControllerProvider(new rq1(vq1Var, 1));
                        return qj1Var;
                }
            }
        });
        final int i2 = 1;
        this.K0 = ipi.b(3, new cm6() { // from class: sq1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return vq1.w(context, this);
                    default:
                        qj1 qj1Var = new qj1(context);
                        qj1Var.setPipTheme(a93.s0.B(qj1Var).c);
                        qj1Var.setPipMode(nj1.b);
                        qj1Var.setId(View.generateViewId());
                        vq1 vq1Var = this;
                        qj1Var.setListener(new y6i(7, vq1Var));
                        qj1Var.setVisibility(8);
                        qj1Var.setVideoLayoutUpdatesControllerProvider(new rq1(vq1Var, 1));
                        return qj1Var;
                }
            }
        });
        this.L0 = ipi.b(3, new o40(context, 13));
        this.M0 = ipi.b(3, new o40(context, 14));
        this.S0 = ipi.b(3, new jl1(10));
        setLayoutParams(new kt3(-1, -1));
        vs1 vs1Var = new vs1(context, 0);
        vs1Var.setId(eyc.call_user_full_avatar);
        vs1Var.setVideoLayoutUpdatesControllerProvider(new rq1(this, 3));
        this.F0 = vs1Var;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(eyc.call_speaker_opponents_view);
        this.O0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(j0b.S1);
        this.P0 = viewStub2;
        addView(vs1Var, -1, -1);
        addView(viewStub2);
        addView(viewStub);
        addView(getBottomSpaceView());
        addView(getTopSpaceView());
        setClipChildren(false);
        ut3 ut3VarG = l5j.g(this);
        int id = getTopSpaceView().getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = viewStub2.getId();
        ut3VarG.d(id2, 7, 0, 7);
        az1.q(16, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id2, 5));
        ut3VarG.d(id2, 4, 0, 4);
        int id3 = vs1Var.getId();
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        ut3VarG.d(id4, 4, getBottomSpaceView().getId(), 3);
        az1.q(4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.d(id4, 7, 0, 7);
        int id5 = getBottomSpaceView().getId();
        ut3VarG.d(id5, 4, 0, 4);
        ut3VarG.d(id5, 6, 0, 6);
        ut3VarG.d(id5, 7, 0, 7);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Space getBottomSpaceView() {
        return (Space) this.M0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final qj1 getFakePipView() {
        return (qj1) this.K0.getValue();
    }

    private final y54 getMarginBottom() {
        y54 y54Var;
        a64 a64Var = this.R0;
        return (a64Var == null || (y54Var = ((e64) a64Var).k) == null) ? y54.d : y54Var;
    }

    private final y54 getMarginTop() {
        y54 y54Var;
        a64 a64Var = this.R0;
        return (a64Var == null || (y54Var = ((e64) a64Var).j) == null) ? y54.d : y54Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final lh1 getOpponentsAdapter() {
        return (lh1) this.H0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final RecyclerView getOpponentsView() {
        return (RecyclerView) this.J0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final m1c getPipAnimation() {
        return (m1c) this.S0.getValue();
    }

    private final lc1 getPipPositionMediator() {
        return (lc1) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Space getTopSpaceView() {
        return (Space) this.L0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setMainSpeaker(defpackage.bn8 r8) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq1.setMainSpeaker(bn8):void");
    }

    public static void v(vq1 vq1Var, bn8 bn8Var) {
        vq1Var.setMainSpeaker(bn8Var);
    }

    public static RecyclerView w(Context context, vq1 vq1Var) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(eyc.call_speaker_opponents_view);
        recyclerView.setAdapter(vq1Var.getOpponentsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.j(new e91(kti.d(4 * vw4.d().getDisplayMetrics().density), 1));
        recyclerView.setLayoutParams(new kt3(-1, -2));
        b bVar = vq1Var.I0;
        if (bVar != null) {
            recyclerView.setRecycledViewPool(bVar);
        }
        return recyclerView;
    }

    public static void x(boolean z, vq1 vq1Var, List list) {
        if (z) {
            vq1Var.getOpponentsAdapter().F(list, null);
        } else {
            vq1Var.getOpponentsView().post(new ud(vq1Var, 20, list));
        }
    }

    public static void z(vq1 vq1Var, List list) {
        vq1Var.getOpponentsAdapter().F(list, null);
    }

    public final void A(boolean z) {
        y54 y54Var;
        AnimatorSet animatorSet = this.Z0;
        boolean z2 = false;
        boolean z3 = animatorSet != null && animatorSet.isRunning();
        if (z && !z3 && isAttachedToWindow()) {
            float f = Resources.getSystem().getDisplayMetrics().widthPixels;
            o98 o98VarD = ve3.d();
            if (dqi.q(this.P0) && getFakePipView().getVisibility() == 0) {
                AnimatorSet animatorSetL = hqi.l(getFakePipView(), false, getFakePipView().getTranslationX(), getFakePipView().getTranslationX() + (getFakePipView().getX() + ((float) (getFakePipView().getWidth() / 2)) < f / ((float) 2) ? -(getFakePipView().getX() + getFakePipView().getWidth()) : f - getFakePipView().getX()));
                if (animatorSetL != null) {
                    o98VarD.add(animatorSetL);
                }
            }
            RecyclerView opponentsView = getOpponentsView();
            a64 a64Var = this.R0;
            if (a64Var != null && (y54Var = ((e64) a64Var).k) != null && y54Var.c) {
                z2 = true;
            }
            AnimatorSet animatorSetL2 = hqi.l(opponentsView, z2, f, 0.0f);
            if (animatorSetL2 != null) {
                o98VarD.add(animatorSetL2);
            }
            o98 o98VarA = ve3.a(o98VarD);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(o98VarA);
            this.Z0 = animatorSet2;
            animatorSet2.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.qj1 r5, android.graphics.PointF r6) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getContext()
            android.graphics.PointF r0 = defpackage.mfh.e(r0)
            y54 r1 = r4.getMarginBottom()
            int r1 = r1.b()
            if (r1 != 0) goto L18
            if (r6 != 0) goto L15
            r6 = r0
        L15:
            r4.N0 = r6
            return
        L18:
            r1 = 0
            r4.N0 = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r0.x
            float r0 = r0.y
            y54 r3 = r4.getMarginBottom()
            int r3 = r3.a
            float r3 = (float) r3
            float r0 = r0 - r3
            r1.<init>(r2, r0)
            if (r6 == 0) goto L55
            float r0 = r6.x
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L36
            goto L3c
        L36:
            float r0 = r6.y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3e
        L3c:
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L42
            goto L55
        L42:
            float r0 = r6.y
            float r2 = r1.y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L56
            android.graphics.PointF r0 = new android.graphics.PointF
            float r6 = r6.x
            float r1 = r1.y
            r0.<init>(r6, r1)
            r6 = r0
            goto L56
        L55:
            r6 = r1
        L56:
            r5.setStartPosition(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq1.B(qj1, android.graphics.PointF):void");
    }

    public final void C(j1c j1cVar) {
        this.Y0 = j1cVar;
        if (dqi.q(this.P0)) {
            getFakePipView().setBoundariesOffset(j1cVar);
        }
    }

    public final void D(bn8 bn8Var, xib xibVar, boolean z) {
        xib xibVar2 = this.V0;
        boolean z2 = (xibVar2 == null || xibVar == null || fni.a(xibVar2.c, xibVar.c)) ? false : true;
        if (!dqi.q(this.P0) || !z2) {
            setMainSpeaker(bn8Var);
            G(xibVar, z);
            return;
        }
        G(xibVar, false);
        m1c pipAnimation = getPipAnimation();
        qj1 fakePipView = getFakePipView();
        m3 m3Var = new m3(this, 18, bn8Var);
        pipAnimation.getClass();
        vs1 vs1Var = this.F0;
        l3b l3bVar = new l3b(m3Var, pipAnimation, vs1Var);
        RectF rectF = new RectF(vs1Var.getX(), vs1Var.getY(), vs1Var.getX() + vs1Var.getMeasuredWidth(), vs1Var.getY() + vs1Var.getMeasuredHeight());
        RectF rectF2 = new RectF(fakePipView.getX(), fakePipView.getY(), fakePipView.getX() + fakePipView.getMeasuredWidth(), fakePipView.getY() + fakePipView.getMeasuredHeight());
        float fWidth = rectF2.width() / rectF.width();
        float fHeight = rectF2.height() / rectF.height();
        vs1Var.setPivotX(rectF.top);
        vs1Var.setPivotY(rectF.left);
        if (m1c.b()) {
            vs1Var.setLayerType(2, null);
            fakePipView.setLayerType(2, null);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vs1Var, (Property<vs1, Float>) View.X, rectF.left, rectF2.left);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(vs1Var, (Property<vs1, Float>) View.Y, rectF.top, rectF2.top);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(vs1Var, (Property<vs1, Float>) View.SCALE_X, 1.0f, fWidth);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(vs1Var, (Property<vs1, Float>) View.SCALE_Y, 1.0f, fHeight);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, vw4.d().getDisplayMetrics().density * 16.0f);
        valueAnimatorOfFloat.addUpdateListener(new dg(vs1Var, 3));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfFloat, ObjectAnimator.ofFloat(fakePipView, (Property<qj1, Float>) View.ALPHA, 1.0f, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new l1c(pipAnimation, vs1Var, fakePipView, rectF, l3bVar));
        animatorSet.start();
    }

    @Override // defpackage.z54
    public final void E(y54 y54Var) {
        mfh.n(getTopSpaceView(), y54Var.b());
        this.F0.E(y54Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [qq1] */
    public final void F(List list, boolean z) {
        zib zibVar = (zib) ue3.I(list);
        final List list2 = zibVar != null ? zibVar.c : null;
        if (list2 == null) {
            list2 = hd5.a;
        }
        boolean zIsEmpty = list2.isEmpty();
        ViewStub viewStub = this.O0;
        if (!zIsEmpty || dqi.q(viewStub)) {
            AnimatorSet animatorSet = this.Z0;
            if (animatorSet == null || !animatorSet.isRunning()) {
                RecyclerView opponentsView = getOpponentsView();
                if (!dqi.q(viewStub)) {
                    ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                    viewGroup.removeViewInLayout(viewStub);
                    ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                    layoutParams.height = opponentsView.getLayoutParams().height;
                    layoutParams.width = opponentsView.getLayoutParams().width;
                    opponentsView.setId(viewStub.getId());
                    viewGroup.addView(opponentsView, iIndexOfChild, layoutParams);
                    E(getMarginTop());
                    y(getMarginBottom());
                }
                if (z) {
                    getOpponentsAdapter().F(list2, null);
                    getOpponentsView().setVisibility(8);
                } else {
                    boolean z2 = !list2.isEmpty();
                    final boolean z3 = getOpponentsView().getVisibility() == 0;
                    this.W0 = z2;
                    H(z2, new em6() { // from class: qq1
                        @Override // defpackage.em6
                        public final Object invoke(Object obj) {
                            ((Boolean) obj).getClass();
                            vq1.x(z3, this, list2);
                            return qqg.a;
                        }
                    });
                }
            }
        }
    }

    public final void G(xib xibVar, boolean z) {
        ViewStub viewStub = this.P0;
        if ((xibVar != null || dqi.q(viewStub)) && !fni.a(this.V0, xibVar)) {
            this.V0 = xibVar;
            rid ridVar = new rid();
            qj1 fakePipView = getFakePipView();
            if (!dqi.q(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = fakePipView.getLayoutParams().height;
                layoutParams.width = fakePipView.getLayoutParams().width;
                fakePipView.setId(viewStub.getId());
                viewGroup.addView(fakePipView, iIndexOfChild, layoutParams);
                ridVar.a = true;
                qj1 fakePipView2 = getFakePipView();
                PointF pointF = ((mc1) getPipPositionMediator()).b;
                B(fakePipView2, new PointF(pointF.x, pointF.y));
                j1c j1cVar = this.Y0;
                if (j1cVar != null) {
                    getFakePipView().setBoundariesOffset(j1cVar);
                }
            }
            if (xibVar != null) {
                getFakePipView().d(xibVar);
            }
            AnimatorSet animatorSet = this.Z0;
            if ((animatorSet == null || !animatorSet.isRunning()) && !z) {
                hqi.g(getFakePipView(), xibVar != null, ridVar.a ? 0L : 150L, null, 4);
            }
        }
    }

    public final void H(boolean z, qq1 qq1Var) {
        y54 y54Var;
        if (dqi.q(this.O0)) {
            a64 a64Var = this.R0;
            if (a64Var != null && (y54Var = ((e64) a64Var).k) != null && !y54Var.c) {
                z = false;
            }
            hqi.g(getOpponentsView(), z, 0L, qq1Var, 2);
        }
    }

    @Override // defpackage.z54
    public final List I(x54 x54Var, x54 x54Var2) {
        o98 o98VarD = ve3.d();
        o98VarD.add(dqi.k(getTopSpaceView(), x54Var, null, 2));
        o98VarD.add(dqi.k(getBottomSpaceView(), null, x54Var2, 1));
        if (dqi.q(this.O0)) {
            o98VarD.add(dqi.i(getOpponentsView(), x54Var2.a));
        }
        o98VarD.addAll(this.F0.I(x54Var, x54Var2));
        return ve3.a(o98VarD);
    }

    @Override // defpackage.jn1
    public final void a(boolean z) {
        if (z) {
            this.F0.a(z);
        }
    }

    @Override // defpackage.hn1
    public final void d(RectF rectF, boolean z) {
        if (hqi.k(this, z)) {
            float f = rectF.left;
            vs1 vs1Var = this.F0;
            vs1Var.setX(f);
            vs1Var.setY(rectF.top);
            vs1Var.setPivotX(0.0f);
            vs1Var.setPivotY(0.0f);
            vs1Var.setScaleX(rectF.width() / vs1Var.getWidth());
            vs1Var.setScaleY(rectF.height() / vs1Var.getHeight());
        }
    }

    @Override // defpackage.hn1
    public final void e(boolean z) {
        if (dqi.q(this.P0)) {
            qj1 fakePipView = getFakePipView();
            if (hqi.k(fakePipView, z) && getShouldScaleMainOpponent()) {
                fakePipView.setAlpha(0.0f);
            }
        }
    }

    @Override // defpackage.hn1
    public final void f(o98 o98Var, boolean z, long j) {
        this.F0.f(o98Var, z, j);
    }

    @Override // defpackage.jn1
    public final void g(o98 o98Var, boolean z, long j) {
        this.F0.g(o98Var, z, j);
    }

    @Override // defpackage.hn1
    public boolean getShouldScaleMainOpponent() {
        txg txgVar;
        txg txgVar2;
        bn8 bn8Var = this.U0;
        xib xibVar = this.V0;
        boolean z = (bn8Var == null || (txgVar2 = bn8Var.h) == null || !txgVar2.c) ? false : true;
        boolean z2 = (xibVar == null || (txgVar = xibVar.g) == null || !txgVar.c) ? false : true;
        if (bn8Var == null || bn8Var.i || !z) {
            return (xibVar == null || xibVar.i || !z2) && bn8Var != null && bn8Var.i && z;
        }
        return true;
    }

    @Override // defpackage.hn1
    public final void o(boolean z) {
        if (z) {
            vs1 vs1Var = this.F0;
            vs1Var.o(z);
            vs1Var.setX(0.0f);
            vs1Var.setY(0.0f);
            vs1Var.setPivotX(0.0f);
            vs1Var.setPivotY(0.0f);
            vs1Var.setScaleX(1.0f);
            vs1Var.setScaleY(1.0f);
            if (dqi.q(this.P0)) {
                getFakePipView().setAlpha(1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.Z0;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.Z0 = null;
    }

    public final void setCallSpeakerMediator(oq1 oq1Var) {
        this.T0 = oq1Var;
    }

    public final void setControlsMediator(a64 a64Var) {
        this.R0 = a64Var;
        this.F0.setControlsMediator(a64Var);
    }

    public final void setListener(tq1 tq1Var) {
        this.X0 = tq1Var;
        this.F0.setListener(tq1Var);
    }

    public final void setOpponentsViewPool(b bVar) {
        if (dqi.q(this.O0)) {
            getOpponentsView().setRecycledViewPool(bVar);
        }
        this.I0 = bVar;
    }

    public final void setStatus(CharSequence charSequence) {
        this.F0.setStatus(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.F0.setName(charSequence);
    }

    public final void setVideoLayoutUpdatesController(x4h x4hVar) {
        this.Q0 = x4hVar;
    }

    @Override // defpackage.z54
    public final void y(y54 y54Var) {
        mfh.m(getBottomSpaceView(), y54Var.c ? y54Var.b() : y54Var.b);
        if (dqi.q(this.P0) && this.N0 != null) {
            B(getFakePipView(), this.N0);
        }
        this.F0.getClass();
    }
}
