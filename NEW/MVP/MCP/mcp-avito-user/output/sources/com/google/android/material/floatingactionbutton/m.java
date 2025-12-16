package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.util.z;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.A;
import com.google.android.material.shape.v;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import lY0.C43707b;
import lY0.C43708c;
import wY0.C49576a;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes6.dex */
class m {

    /* renamed from: D, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.a f356633D = C43707b.f413881c;

    /* renamed from: E, reason: collision with root package name */
    public static final int f356634E = R.attr.motionDurationLong2;

    /* renamed from: F, reason: collision with root package name */
    public static final int f356635F = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: G, reason: collision with root package name */
    public static final int f356636G = R.attr.motionDurationMedium1;

    /* renamed from: H, reason: collision with root package name */
    public static final int f356637H = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f356638I = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f356639J = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f356640K = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: L, reason: collision with root package name */
    public static final int[] f356641L = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f356642M = {android.R.attr.state_enabled};

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f356643N = new int[0];

    /* renamed from: C, reason: collision with root package name */
    @P
    public ViewTreeObserver.OnPreDrawListener f356646C;

    /* renamed from: a, reason: collision with root package name */
    @P
    public com.google.android.material.shape.q f356647a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.google.android.material.shape.k f356648b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public Drawable f356649c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public com.google.android.material.floatingactionbutton.d f356650d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public LayerDrawable f356651e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f356652f;

    /* renamed from: h, reason: collision with root package name */
    public float f356654h;

    /* renamed from: i, reason: collision with root package name */
    public float f356655i;

    /* renamed from: j, reason: collision with root package name */
    public float f356656j;

    /* renamed from: k, reason: collision with root package name */
    public int f356657k;

    /* renamed from: l, reason: collision with root package name */
    @N
    public final A f356658l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public Animator f356659m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public lY0.i f356660n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public lY0.i f356661o;

    /* renamed from: p, reason: collision with root package name */
    public float f356662p;

    /* renamed from: r, reason: collision with root package name */
    public int f356664r;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f356666t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f356667u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList<f> f356668v;

    /* renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f356669w;

    /* renamed from: x, reason: collision with root package name */
    public final yY0.c f356670x;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356653g = true;

    /* renamed from: q, reason: collision with root package name */
    public float f356663q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    public int f356665s = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f356671y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f356672z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    public final RectF f356644A = new RectF();

    /* renamed from: B, reason: collision with root package name */
    public final Matrix f356645B = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    public class a extends lY0.h {
        public a() {
        }

        @Override // lY0.h, android.animation.TypeEvaluator
        /* renamed from: a */
        public final Matrix evaluate(float f12, @N Matrix matrix, @N Matrix matrix2) {
            m.this.f356663q = f12;
            return super.evaluate(f12, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f356674a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f356675b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f356676c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f356677d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f356678e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f356679f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f356680g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f356681h;

        public b(float f12, float f13, float f14, float f15, float f16, float f17, float f18, Matrix matrix) {
            this.f356674a = f12;
            this.f356675b = f13;
            this.f356676c = f14;
            this.f356677d = f15;
            this.f356678e = f16;
            this.f356679f = f17;
            this.f356680g = f18;
            this.f356681h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            m mVar = m.this;
            mVar.f356669w.setAlpha(C43707b.b(this.f356674a, this.f356675b, 0.0f, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = mVar.f356669w;
            float f12 = this.f356676c;
            float f13 = this.f356677d;
            floatingActionButton.setScaleX(C43707b.a(f12, f13, fFloatValue));
            mVar.f356669w.setScaleY(C43707b.a(this.f356678e, f13, fFloatValue));
            float f14 = this.f356679f;
            float f15 = this.f356680g;
            mVar.f356663q = C43707b.a(f14, f15, fFloatValue);
            float fA2 = C43707b.a(f14, f15, fFloatValue);
            Matrix matrix = this.f356681h;
            mVar.a(fA2, matrix);
            mVar.f356669w.setImageMatrix(matrix);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class c extends i {
        @Override // com.google.android.material.floatingactionbutton.m.i
        public final float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class d extends i {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f356683e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p pVar) {
            super(null);
            this.f356683e = pVar;
        }

        @Override // com.google.android.material.floatingactionbutton.m.i
        public final float a() {
            p pVar = this.f356683e;
            return pVar.f356654h + pVar.f356655i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class e extends i {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f356684e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(null);
            this.f356684e = pVar;
        }

        @Override // com.google.android.material.floatingactionbutton.m.i
        public final float a() {
            p pVar = this.f356684e;
            return pVar.f356654h + pVar.f356656j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class h extends i {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f356685e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p pVar) {
            super(null);
            this.f356685e = pVar;
        }

        @Override // com.google.android.material.floatingactionbutton.m.i
        public final float a() {
            return this.f356685e.f356654h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f356686a;

        /* renamed from: b, reason: collision with root package name */
        public float f356687b;

        /* renamed from: c, reason: collision with root package name */
        public float f356688c;

        public i(k kVar) {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f12 = (int) this.f356688c;
            com.google.android.material.shape.k kVar = m.this.f356648b;
            if (kVar != null) {
                kVar.m(f12);
            }
            this.f356686a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            boolean z12 = this.f356686a;
            m mVar = m.this;
            if (!z12) {
                com.google.android.material.shape.k kVar = mVar.f356648b;
                this.f356687b = kVar == null ? 0.0f : kVar.f357034b.f357069m;
                this.f356688c = a();
                this.f356686a = true;
            }
            float f12 = this.f356687b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f356688c - f12)) + f12);
            com.google.android.material.shape.k kVar2 = mVar.f356648b;
            if (kVar2 != null) {
                kVar2.m(animatedFraction);
            }
        }
    }

    public m(FloatingActionButton floatingActionButton, yY0.c cVar) {
        this.f356669w = floatingActionButton;
        this.f356670x = cVar;
        A a12 = new A();
        this.f356658l = a12;
        p pVar = (p) this;
        a12.a(f356638I, d(new e(pVar)));
        a12.a(f356639J, d(new d(pVar)));
        a12.a(f356640K, d(new d(pVar)));
        a12.a(f356641L, d(new d(pVar)));
        a12.a(f356642M, d(new h(pVar)));
        a12.a(f356643N, d(new c(null)));
        this.f356662p = floatingActionButton.getRotation();
    }

    @N
    public static ValueAnimator d(@N i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f356633D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f12, @N Matrix matrix) {
        matrix.reset();
        if (this.f356669w.getDrawable() == null || this.f356664r == 0) {
            return;
        }
        RectF rectF = this.f356672z;
        RectF rectF2 = this.f356644A;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f13 = this.f356664r;
        rectF2.set(0.0f, 0.0f, f13, f13);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f14 = this.f356664r / 2.0f;
        matrix.postScale(f12, f12, f14, f14);
    }

    @N
    public final AnimatorSet b(@N lY0.i iVar, float f12, float f13, float f14) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f12};
        FloatingActionButton floatingActionButton = this.f356669w;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        iVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f13);
        iVar.d("scale").a(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f13);
        iVar.d("scale").a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f356645B;
        a(f14, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new lY0.g(), new a(), new Matrix(matrix));
        iVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C43708c.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f12, float f13, float f14, int i12, int i13) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f356669w;
        valueAnimatorOfFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f12, floatingActionButton.getScaleX(), f13, floatingActionButton.getScaleY(), this.f356663q, f14, new Matrix(this.f356645B)));
        arrayList.add(valueAnimatorOfFloat);
        C43708c.a(animatorSet, arrayList);
        animatorSet.setDuration(C49576a.c(floatingActionButton.getContext(), i12, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C49576a.d(floatingActionButton.getContext(), i13, C43707b.f413880b));
        return animatorSet;
    }

    public com.google.android.material.shape.k e() {
        com.google.android.material.shape.q qVar = this.f356647a;
        qVar.getClass();
        return new com.google.android.material.shape.k(qVar);
    }

    public float f() {
        return this.f356654h;
    }

    public void g(@N Rect rect) {
        int sizeDimension = this.f356652f ? (this.f356657k - this.f356669w.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f356653g ? f() + this.f356656j : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public void h(ColorStateList colorStateList, @P PorterDuff.Mode mode, ColorStateList colorStateList2, int i12) {
        com.google.android.material.shape.k kVarE = e();
        this.f356648b = kVarE;
        kVarE.setTintList(colorStateList);
        if (mode != null) {
            this.f356648b.setTintMode(mode);
        }
        this.f356648b.q(-12303292);
        this.f356648b.j(this.f356669w.getContext());
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f356648b.f357034b.f357057a);
        aVar.setTintList(com.google.android.material.ripple.b.c(colorStateList2));
        this.f356649c = aVar;
        com.google.android.material.shape.k kVar = this.f356648b;
        kVar.getClass();
        this.f356651e = new LayerDrawable(new Drawable[]{kVar, aVar});
    }

    public void i() {
        A a12 = this.f356658l;
        ValueAnimator valueAnimator = a12.f356696c;
        if (valueAnimator != null) {
            valueAnimator.end();
            a12.f356696c = null;
        }
    }

    public void k(int[] iArr) {
        this.f356658l.b(iArr);
    }

    public void l(float f12, float f13, float f14) {
        r();
        com.google.android.material.shape.k kVar = this.f356648b;
        if (kVar != null) {
            kVar.m(f12);
        }
    }

    public final void m() {
        ArrayList<f> arrayList = this.f356668v;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void n(@P ColorStateList colorStateList) {
        Drawable drawable = this.f356649c;
        if (drawable != null) {
            drawable.setTintList(com.google.android.material.ripple.b.c(colorStateList));
        }
    }

    public final void o(@N com.google.android.material.shape.q qVar) {
        this.f356647a = qVar;
        com.google.android.material.shape.k kVar = this.f356648b;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(qVar);
        }
        Object obj = this.f356649c;
        if (obj instanceof v) {
            ((v) obj).setShapeAppearanceModel(qVar);
        }
        com.google.android.material.floatingactionbutton.d dVar = this.f356650d;
        if (dVar != null) {
            dVar.f356621o = qVar;
            dVar.invalidateSelf();
        }
    }

    public boolean p() {
        return true;
    }

    public void q() {
        com.google.android.material.shape.k kVar = this.f356648b;
        if (kVar != null) {
            kVar.r((int) this.f356662p);
        }
    }

    public final void r() {
        Rect rect = this.f356671y;
        g(rect);
        z.f(this.f356651e, "Didn't initialize content background");
        boolean zP2 = p();
        yY0.c cVar = this.f356670x;
        if (zP2) {
            ((FloatingActionButton.b) cVar).a(new InsetDrawable((Drawable) this.f356651e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            ((FloatingActionButton.b) cVar).a(this.f356651e);
        }
        int i12 = rect.left;
        int i13 = rect.top;
        int i14 = rect.right;
        int i15 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f356599m.set(i12, i13, i14, i15);
        int i16 = floatingActionButton.f356596j;
        floatingActionButton.setPadding(i12 + i16, i13 + i16, i14 + i16, i15 + i16);
    }

    public void j() {
    }
}
