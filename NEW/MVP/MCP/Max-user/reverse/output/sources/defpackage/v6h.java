package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class v6h extends ViewGroup implements jf4, wad, zk9, nkb, qdh, pdh, z5h {
    public static final /* synthetic */ yy7[] M0;
    public final Object A0;
    public final Object B0;
    public final int C0;
    public final int D0;
    public final w4g E0;
    public boolean F0;
    public r40 G0;
    public ldf H0;
    public x9f I0;
    public x9f J0;
    public ValueAnimator K0;
    public int L0;
    public final em6 a;
    public final u9d b;
    public final uk9 c;
    public final okb d;
    public final b3h o;
    public final ShapeDrawable s0;
    public final f9h t0;
    public final zd7 u0;
    public final l1h v0;
    public final if4 w0;
    public final Object x0;
    public final Rect y0;
    public final n6h z0;

    static {
        z8a z8aVar = new z8a(v6h.class, "model", "getModel()Lone/me/messages/list/loader/model/VideoMessageAttach;");
        vid.a.getClass();
        M0 = new yy7[]{z8aVar};
    }

    public v6h(Context context, ts9 ts9Var) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        okb okbVar = new okb();
        b3h b3hVar = new b3h();
        super(context);
        this.a = ts9Var;
        this.b = u9dVar;
        this.c = uk9Var;
        this.d = okbVar;
        this.o = b3hVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.setCallback(this);
        this.s0 = shapeDrawable;
        this.t0 = new f9h();
        zd7 zd7Var = new zd7(context);
        ((gr6) zd7Var.getHierarchy()).m(vtd.a());
        f8j.d(zd7Var, 300L, new pcc(25, this));
        zd7Var.setOnLongClickListener(new bn0(9, this));
        this.u0 = zd7Var;
        l1h l1hVar = new l1h(context);
        l1hVar.setBackgroundEnabled(true);
        l1hVar.setDrawableEnabled(false);
        l1hVar.setCapsuleInside(false);
        this.v0 = l1hVar;
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(true);
        if4Var.setBackgroundColor(getColorBubbleOutside());
        this.w0 = if4Var;
        final int i = 0;
        this.x0 = ipi.b(3, new cm6(this) { // from class: m6h
            public final /* synthetic */ v6h b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return v6h.e(this.b);
                    default:
                        return v6h.a(this.b);
                }
            }
        });
        this.y0 = new Rect();
        n6h n6hVar = new n6h();
        n6hVar.b(getIconBackgroundColor(), Integer.valueOf(kti.d(24 * vw4.d().getDisplayMetrics().density)));
        Drawable drawableMutate = r34.b(getContext(), yud.L0).mutate();
        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
        int iconColor = getIconColor();
        n6hVar.addLayer(drawableMutate);
        drawableMutate.setTint(iconColor);
        n6hVar.setLayerSize(1, iD, iD);
        n6hVar.setLayerGravity(1, 17);
        this.z0 = n6hVar;
        final int i2 = 1;
        this.A0 = ipi.b(3, new cm6(this) { // from class: m6h
            public final /* synthetic */ v6h b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return v6h.e(this.b);
                    default:
                        return v6h.a(this.b);
                }
            }
        });
        this.B0 = ipi.b(3, new sue(context, 12, this));
        float f = 4;
        this.C0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.D0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        this.E0 = new w4g(this);
        u9dVar.b = this;
        uk9Var.b = this;
        b3hVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(zd7Var, new ViewGroup.LayoutParams(-1, -1));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        addView(l1hVar, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.L0 = kti.d(228 * vw4.d().getDisplayMetrics().density);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static final void E(v6h v6hVar, b5h b5hVar, boolean z) {
        ?? r0 = v6hVar.B0;
        int i = 8;
        if (r0.e()) {
            b6h b6hVar = (b6h) r0.getValue();
            b6hVar.setVisibility(8);
            b6hVar.k();
        }
        l1h l1hVar = v6hVar.v0;
        long jG = s65.g(b5hVar.c.f);
        String[] strArr = l6g.b;
        l1hVar.setContent(z7i.a(jG));
        v6hVar.o.w();
        if (!z) {
            v6hVar.L0 = kti.d(228 * vw4.d().getDisplayMetrics().density);
            v6hVar.requestLayout();
            return;
        }
        int i2 = v6hVar.L0;
        int iD = kti.d(228 * vw4.d().getDisplayMetrics().density);
        ValueAnimator valueAnimator = v6hVar.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, iD);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new wk0(i, v6hVar));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new r6h(v6hVar, 2));
        valueAnimatorOfInt.start();
        v6hVar.K0 = valueAnimatorOfInt;
    }

    public static n6h a(v6h v6hVar) {
        n6h n6hVar = new n6h();
        n6hVar.b(v6hVar.getIconBackgroundColor(), Integer.valueOf(kti.d(52 * vw4.d().getDisplayMetrics().density)));
        r00 r00Var = new r00();
        r00Var.a = r34.b(v6hVar.getContext(), yud.p0).mutate();
        r00Var.invalidateSelf();
        r00Var.b(v6hVar.getIconColor());
        r00Var.e = true;
        r00Var.invalidateSelf();
        int iD = kti.d(44 * vw4.d().getDisplayMetrics().density);
        int iconColor = v6hVar.getIconColor();
        n6hVar.addLayer(r00Var);
        r00Var.setTint(iconColor);
        n6hVar.setLayerSize(1, iD, iD);
        n6hVar.setLayerGravity(1, 17);
        return n6hVar;
    }

    public static void b(v6h v6hVar) {
        b5h model = v6hVar.getModel();
        if (model != null) {
            v6hVar.a.invoke(new bq9(model.a, model));
        }
    }

    public static n6h e(v6h v6hVar) {
        n6h n6hVar = new n6h();
        n6hVar.b(v6hVar.getIconBackgroundColor(), Integer.valueOf(kti.d(52 * vw4.d().getDisplayMetrics().density)));
        Drawable drawableMutate = r34.b(v6hVar.getContext(), yud.w0).mutate();
        int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
        int iconColor = v6hVar.getIconColor();
        n6hVar.addLayer(drawableMutate);
        drawableMutate.setTint(iconColor);
        n6hVar.setLayerSize(1, iD, iD);
        n6hVar.setLayerGravity(1, 17);
        return n6hVar;
    }

    public static final void f(v6h v6hVar, b5h b5hVar, w8h w8hVar) {
        v6hVar.getClass();
        if (w8hVar.b != b5hVar.a) {
            return;
        }
        int orientationBasedWidth = v6hVar.getOrientationBasedWidth();
        v6hVar.o.p(w8hVar, b5hVar, w8hVar.b, false, false);
        v6hVar.u0.setOverlayDrawable(null);
        int i = v6hVar.L0;
        ValueAnimator valueAnimator = v6hVar.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, orientationBasedWidth);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new wk0(8, v6hVar));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new r6h(v6hVar, 0));
        valueAnimatorOfInt.start();
        v6hVar.K0 = valueAnimatorOfInt;
    }

    private final int getBorderColor() {
        return a93.s0.y(this).a().r().a.h;
    }

    private final boolean getCanDrawMuteIcon() {
        return getMeasuredWidth() == kti.d(((float) 228) * vw4.d().getDisplayMetrics().density) && this.u0.getOverlayDrawable() == null;
    }

    private final int getColorBubbleOutside() {
        return a93.s0.y(this).a().G().b.g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final b6h getDurationSlider() {
        return (b6h) this.B0.getValue();
    }

    private final int getIconBackgroundColor() {
        a93.s0.y(this).a();
        return 1543503872;
    }

    private final int getIconColor() {
        a93.s0.y(this).a();
        return -1;
    }

    private final b5h getModel() {
        yy7 yy7Var = M0[0];
        return (b5h) this.E0.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final n6h getNeedDownloadDrawable() {
        return (n6h) this.x0.getValue();
    }

    private final int getOrientationBasedWidth() {
        if (j9j.d(this)) {
            return kti.d(228 * vw4.d().getDisplayMetrics().density);
        }
        ViewParent parent = getParent();
        uh9 uh9Var = parent instanceof uh9 ? (uh9) parent : null;
        if (uh9Var != null) {
            return uh9Var.getMaxAvailableWidth$message_list_release();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final n6h getProgressDownloadDrawable() {
        return (n6h) this.A0.getValue();
    }

    public static final void i(v6h v6hVar) {
        b5h model = v6hVar.getModel();
        if (model != null) {
            v6hVar.a.invoke(new cq9(model.a, model));
        }
    }

    public static final boolean j(v6h v6hVar) {
        w8h w8hVarE;
        b5h model = v6hVar.getModel();
        if (model == null || (w8hVarE = model.e()) == null || w8hVarE.b != model.a) {
            return false;
        }
        int iOrdinal = w8hVarE.o.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    public static final void o(v6h v6hVar) {
        b5h model = v6hVar.getModel();
        if (model == null) {
            return;
        }
        s0h s0hVar = model.c;
        v6hVar.u0.setImageAttach(new od7(0L, s0hVar.b, s0hVar.c, s0hVar.d, false, s0hVar.e, false, s0hVar.h, s0hVar.i, null, null, null, 7680));
        l1h l1hVar = v6hVar.v0;
        long jG = s65.g(s0hVar.f);
        String[] strArr = l6g.b;
        l1hVar.setContent(z7i.a(jG));
        v6hVar.C((xz) model.d.a.getValue());
        v6hVar.requestLayout();
        v6hVar.invalidate();
    }

    public static final void q(v6h v6hVar, b5h b5hVar, w8h w8hVar) {
        b5h model = v6hVar.getModel();
        if (!fni.a(model != null ? Long.valueOf(model.a) : null, w8hVar != null ? Long.valueOf(w8hVar.b) : null)) {
            if (v6hVar.L0 != kti.d(228 * vw4.d().getDisplayMetrics().density)) {
                E(v6hVar, b5hVar, false);
            }
            return;
        }
        View viewU = v6hVar.o.U();
        if (viewU != null) {
            viewU.setForeground(null);
        }
        v8h v8hVar = w8hVar != null ? w8hVar.o : null;
        switch (v8hVar == null ? -1 : o6h.$EnumSwitchMapping$0[v8hVar.ordinal()]) {
            case 1:
                v6hVar.o.p(w8hVar, b5hVar, w8hVar.b, false, false);
                break;
            case 2:
                int orientationBasedWidth = v6hVar.getOrientationBasedWidth();
                v6hVar.u0.setOverlayDrawable(null);
                int i = v6hVar.L0;
                ValueAnimator valueAnimator = v6hVar.K0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, orientationBasedWidth);
                valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                valueAnimatorOfInt.addUpdateListener(new wk0(8, v6hVar));
                valueAnimatorOfInt.setDuration(250L);
                valueAnimatorOfInt.addListener(new r6h(v6hVar, 1));
                valueAnimatorOfInt.start();
                v6hVar.K0 = valueAnimatorOfInt;
                break;
            case 3:
                mgb.a(v6hVar, new u6h(v6hVar, v6hVar, b5hVar, w8hVar, 0));
                fqi.c(v6hVar, v6hVar.getDurationSlider(), -1);
                v6hVar.getDurationSlider().setVisibility(0);
                b6h.l(v6hVar.getDurationSlider(), w8hVar.X);
                long j = w8hVar.Y;
                String[] strArr = l6g.b;
                v6hVar.v0.setContent(z7i.a(j));
                break;
            case 4:
                mgb.a(v6hVar, new u6h(v6hVar, v6hVar, b5hVar, w8hVar, 1));
                fqi.c(v6hVar, v6hVar.getDurationSlider(), -1);
                v6hVar.getDurationSlider().setVisibility(0);
                v6hVar.getDurationSlider().j();
                v6hVar.getDurationSlider().setProgressForced(w8hVar.X);
                break;
            case 5:
            case 6:
                E(v6hVar, b5hVar, true);
                break;
        }
    }

    private final void setModel(b5h b5hVar) {
        this.E0.O(this, M0[0], b5hVar);
    }

    public final void A(float f) {
        b5h model = getModel();
        if (model != null) {
            this.a.invoke(new aq9(model.a, model, f));
        }
    }

    public final void B(float f) {
        zd7 zd7Var = this.u0;
        Drawable overlayDrawable = zd7Var.getOverlayDrawable();
        n6h n6hVar = overlayDrawable instanceof n6h ? (n6h) overlayDrawable : null;
        Drawable drawable = n6hVar != null ? n6hVar.getDrawable(1) : null;
        if (!(drawable instanceof r00)) {
            zd7Var.setOverlayDrawable(getProgressDownloadDrawable());
            drawable = zd7Var.getOverlayDrawable();
        }
        if (drawable != null) {
            drawable.setLevel((int) (f * 100));
        }
    }

    public final void C(xz xzVar) {
        b5h model = getModel();
        if (!fni.a(model != null ? Long.valueOf(model.a) : null, xzVar != null ? Long.valueOf(xzVar.a()) : null) || xzVar == null) {
            return;
        }
        if (xzVar instanceof tz) {
            B(((tz) xzVar).b);
            return;
        }
        if (xzVar instanceof wz) {
            B(((wz) xzVar).b);
            return;
        }
        boolean z = xzVar instanceof uz;
        zd7 zd7Var = this.u0;
        if (z) {
            zd7Var.setOverlayDrawable(getNeedDownloadDrawable());
        } else {
            if (!(xzVar instanceof vz)) {
                throw new NoWhenBranchMatchedException();
            }
            zd7Var.setOverlayDrawable(null);
        }
    }

    public final void D(b5h b5hVar) {
        w8h w8hVarE = b5hVar.e();
        if (w8hVarE == null || w8hVarE.b != b5hVar.a) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.L0 = kti.d(228 * vw4.d().getDisplayMetrics().density);
            requestLayout();
        }
        setModel(b5hVar);
        if (isAttachedToWindow()) {
            t();
        }
    }

    @Override // defpackage.qdh
    public final void c(boolean z) {
        this.o.c(true);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.c.d(yt0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.s0.draw(canvas);
        if (getCanDrawMuteIcon()) {
            Rect rect = this.y0;
            n6h n6hVar = this.z0;
            n6hVar.setBounds(rect);
            n6hVar.draw(canvas);
        }
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.b.g(xl9Var, z);
    }

    public boolean getDependOnOutsideView() {
        return this.d.a;
    }

    @Override // defpackage.qdh
    public View getPreviewView() {
        return this.u0;
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        this.w0.c(charSequence, z);
    }

    @Override // defpackage.qdh
    public final boolean k() {
        return this.o.k();
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.b.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.c.m();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qdh
    public final boolean n() {
        return dqi.r(this.o.c);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f9h f9hVar = this.t0;
        Region region = (Region) f9hVar.d;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Region region2 = (Region) f9hVar.e;
        if (region2.isEmpty() || region.isEmpty() || region2.contains(x, y) || !region.contains(x, y)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Exception {
        float f = 4;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        if (dqi.r(this.c.c)) {
            int iC = u45.c(f, vw4.d().getDisplayMetrics().density, iD);
            this.c.W(this.F0 ? 0 : this.u0.getRight() - this.c.N(), iC);
            iD = utb.j(f, vw4.d().getDisplayMetrics().density, this.c.M(), iC);
        }
        cri.c(this.u0, 0, iD, 0, 12);
        if (getCanDrawMuteIcon()) {
            int measuredWidth = ((this.u0.getMeasuredWidth() / 2) + this.u0.getLeft()) - (this.z0.getIntrinsicWidth() / 2);
            int iQ = u45.q(12, vw4.d().getDisplayMetrics().density, this.u0.getBottom() - this.z0.getIntrinsicHeight());
            this.y0.set(measuredWidth, iQ, this.z0.getIntrinsicWidth() + measuredWidth, this.z0.getIntrinsicHeight() + iQ);
        }
        ?? r10 = this.B0;
        if (r10.e()) {
            cri.c((b6h) r10.getValue(), 0, iD, 0, 12);
        }
        if (dqi.r(this.o.c)) {
            this.o.W(0, iD);
            View viewU = this.o.U();
            if (viewU != null) {
                int x = (int) viewU.getX();
                int y = (int) viewU.getY();
                this.s0.setBounds(x, y, viewU.getMeasuredWidth() + x, viewU.getMeasuredHeight() + y);
                f9h f9hVar = this.t0;
                f9hVar.getClass();
                int measuredWidth2 = viewU.getMeasuredWidth();
                int measuredHeight = viewU.getMeasuredHeight();
                if (measuredWidth2 != f9hVar.a || measuredHeight != f9hVar.b) {
                    f9hVar.a = measuredWidth2;
                    f9hVar.b = measuredHeight;
                    if (viewU.getMeasuredWidth() != viewU.getMeasuredHeight()) {
                        String name = f9h.class.getName();
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.X;
                            if (l6bVar.b(lg8Var)) {
                                l6bVar.c(lg8Var, name, ho7.g("Cannot calculate a video msg clickable area: w=", viewU.getMeasuredWidth(), viewU.getMeasuredHeight(), ", h="), null);
                            }
                        }
                    } else {
                        float measuredWidth3 = viewU.getMeasuredWidth() / 2.0f;
                        float left = viewU.getLeft() + measuredWidth3;
                        float top = viewU.getTop() + measuredWidth3;
                        try {
                            ((Path) f9hVar.c).reset();
                            ((Path) f9hVar.c).addCircle(left, top, measuredWidth3, Path.Direction.CW);
                            ((Region) f9hVar.d).set(viewU.getLeft(), viewU.getTop(), viewU.getRight(), viewU.getBottom());
                            ((Region) f9hVar.e).setPath((Path) f9hVar.c, (Region) f9hVar.d);
                        } catch (Exception e) {
                            String name2 = f9h.class.getName();
                            l6b l6bVar2 = wqi.a;
                            if (l6bVar2 != null) {
                                lg8 lg8Var2 = lg8.Y;
                                if (l6bVar2.b(lg8Var2)) {
                                    int left2 = viewU.getLeft();
                                    int top2 = viewU.getTop();
                                    int right = viewU.getRight();
                                    int bottom = viewU.getBottom();
                                    StringBuilder sbK = wy1.k("calculateClickableArea: EXCEPTION during setPath - view.left=", left2, ", view.top=", top2, ", view.right=");
                                    hf3.g(sbK, right, ", view.bottom=", bottom, ", radius=");
                                    sbK.append(measuredWidth3);
                                    sbK.append(", centerX=");
                                    sbK.append(left);
                                    sbK.append(", centerY=");
                                    sbK.append(top);
                                    l6bVar2.c(lg8Var2, name2, sbK.toString(), e);
                                }
                            }
                            throw e;
                        }
                    }
                }
            }
        } else {
            zd7 zd7Var = this.u0;
            int x2 = (int) zd7Var.getX();
            int y2 = (int) zd7Var.getY();
            this.s0.setBounds(x2, y2, zd7Var.getMeasuredWidth() + x2, zd7Var.getMeasuredHeight() + y2);
            f9h f9hVar2 = this.t0;
            ((Region) f9hVar2.e).setEmpty();
            ((Region) f9hVar2.d).setEmpty();
            f9hVar2.a = -1;
            f9hVar2.b = -1;
        }
        int iQ2 = dqi.r(this.b.c) ? u45.q(10, vw4.d().getDisplayMetrics().density, u45.q(8, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - this.b.M())) : getMeasuredHeight();
        cri.c(this.w0, (getMeasuredWidth() - this.w0.getMeasuredWidth()) - this.D0, (iQ2 - this.w0.getMeasuredHeight()) - this.C0, 0, 12);
        cri.c(this.v0, 0, (iQ2 - this.v0.getMeasuredHeight()) - this.C0, 0, 12);
        if (dqi.r(this.b.c)) {
            int iC2 = u45.c(10, vw4.d().getDisplayMetrics().density, iQ2);
            u9d u9dVar = this.b;
            u9dVar.W(u9dVar.Y ? getMeasuredWidth() - this.b.N() : 0, iC2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : u45.d(10, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iMax = getDependOnOutsideView() ? size : 0;
        float f = 4;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        uk9 uk9Var = this.c;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, uk9Var.N());
            iD += (kti.d(f * vw4.d().getDisplayMetrics().density) * 2) + uk9Var.M();
        }
        if4 if4Var = this.w0;
        if4Var.measure(i, i2);
        l1h l1hVar = this.v0;
        l1hVar.measure(i, i2);
        int iMax2 = Math.max(if4Var.getMeasuredHeight(), l1hVar.getMeasuredHeight()) + iD;
        int i3 = this.L0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        zd7 zd7Var = this.u0;
        zd7Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ?? r7 = this.B0;
        if (r7.e()) {
            ((b6h) r7.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        int iMax3 = Math.max(iMax, Math.max(zd7Var.getMeasuredWidth(), l1hVar.getMeasuredWidth() + if4Var.getMeasuredWidth()));
        int measuredHeight = zd7Var.getMeasuredHeight() + iMax2;
        b3h b3hVar = this.o;
        if (dqi.r(b3hVar.c)) {
            b3hVar.Y(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        u9d u9dVar = this.b;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iMax3 = Math.max(iMax3, u9dVar.N());
            measuredHeight = utb.j(8, vw4.d().getDisplayMetrics().density, u9dVar.M() + kti.d(10 * vw4.d().getDisplayMetrics().density), measuredHeight);
        }
        setMeasuredDimension(iMax3, measuredHeight);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        this.o.w();
        int i = this.L0;
        int iD = kti.d(228 * vw4.d().getDisplayMetrics().density);
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iD);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new wk0(8, this));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new q6h(1));
        valueAnimatorOfInt.start();
        this.K0 = valueAnimatorOfInt;
        super.onStartTemporaryDetach();
    }

    @Override // defpackage.qdh
    public final void p(hdh hdhVar, m00 m00Var, long j, boolean z, boolean z2) {
        this.o.p(hdhVar, m00Var, j, z, z2);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.b.r(z);
    }

    @Override // defpackage.pdh
    public final /* bridge */ /* synthetic */ ldh s(boolean z) {
        return jdh.a;
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.b.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.w0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.w0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.nkb
    public void setDependOnOutsideView(boolean z) {
        this.d.a = z;
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.c.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.w0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.b.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.c.setLink(tk9Var);
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.b.o = em6Var;
    }

    @Override // defpackage.zk9
    public void setReplyClickListener(sm6 sm6Var) {
        this.c.d = sm6Var;
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.b.Y = z;
    }

    @Override // defpackage.qdh
    public void setVideoClickListener(sm6 sm6Var) {
        this.o.d = sm6Var;
    }

    @Override // defpackage.qdh
    public void setVideoLongClickListener(sm6 sm6Var) {
        this.o.o = sm6Var;
    }

    public final void t() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new p6h(this, 0));
            return;
        }
        ViewParent parent = getParent();
        uh9 uh9Var = parent instanceof uh9 ? (uh9) parent : null;
        if (uh9Var == null) {
            return;
        }
        boolean zJ = j(this);
        int maxAvailableWidth$message_list_release = uh9Var.getMaxAvailableWidth$message_list_release();
        if (!zJ || j9j.d(this)) {
            maxAvailableWidth$message_list_release = kti.d(228 * vw4.d().getDisplayMetrics().density);
        }
        if (maxAvailableWidth$message_list_release == this.L0) {
            return;
        }
        if (zJ && !j9j.d(this)) {
            this.o.c(false);
        }
        int i = this.L0;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, maxAvailableWidth$message_list_release);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new wk0(8, this));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new q6h(0));
        valueAnimatorOfInt.start();
        this.K0 = valueAnimatorOfInt;
    }

    @Override // defpackage.qdh
    public final boolean u() {
        return this.o.u();
    }

    public final void v(b5h b5hVar, boolean z) {
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setModel(b5hVar);
        this.F0 = z;
        w8h w8hVarE = b5hVar.e();
        if (w8hVarE == null || w8hVarE.b != b5hVar.a) {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.L0 = kti.d(228 * vw4.d().getDisplayMetrics().density);
            requestLayout();
        }
        this.G0 = new r40(this, 19, b5hVar);
        if (isAttachedToWindow()) {
            r40 r40Var = this.G0;
            if (r40Var != null) {
                r40Var.onViewAttachedToWindow(this);
            }
        } else {
            t();
        }
        addOnAttachStateChangeListener(this.G0);
    }

    @Override // defpackage.qdh
    public final void w() {
        this.o.w();
    }

    public final void x(th3 th3Var) {
        int i = th3Var.g.a;
        kg3 kg3Var = th3Var.b;
        Drawable foreground = this.u0.getForeground();
        n6h n6hVar = foreground instanceof n6h ? (n6h) foreground : null;
        if (n6hVar != null) {
            n6hVar.a();
        }
        this.z0.a();
        ShapeDrawable shapeDrawable = this.s0;
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.invalidateSelf();
        this.v0.invalidate();
        if4 if4Var = this.w0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
        if4Var.setBackgroundColor(kg3Var.g);
    }

    public final void y() {
        b5h model = getModel();
        if (model != null) {
            this.a.invoke(new yp9(model.a, model));
        }
    }

    public final void z() {
        b5h model = getModel();
        if (model != null) {
            this.a.invoke(new zp9(model.a, model));
        }
    }
}
