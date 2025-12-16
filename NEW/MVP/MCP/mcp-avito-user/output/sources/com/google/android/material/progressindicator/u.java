package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.R;
import j.N;
import java.util.Arrays;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes6.dex */
final class u extends n<ObjectAnimator> {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f356971l = {533, 567, 850, 750};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f356972m = {1267, 1000, 333, 0};

    /* renamed from: n, reason: collision with root package name */
    public static final Property<u, Float> f356973n = new a(Float.class, "animationFraction");

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f356974d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f356975e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator[] f356976f;

    /* renamed from: g, reason: collision with root package name */
    public final w f356977g;

    /* renamed from: h, reason: collision with root package name */
    public int f356978h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356979i;

    /* renamed from: j, reason: collision with root package name */
    public float f356980j;

    /* renamed from: k, reason: collision with root package name */
    public b.a f356981k;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class a extends Property<u, Float> {
        @Override // android.util.Property
        public final Float get(u uVar) {
            return Float.valueOf(uVar.f356980j);
        }

        @Override // android.util.Property
        public final void set(u uVar, Float f12) {
            u uVar2 = uVar;
            float fFloatValue = f12.floatValue();
            uVar2.f356980j = fFloatValue;
            int i12 = (int) (fFloatValue * 1800.0f);
            for (int i13 = 0; i13 < 4; i13++) {
                uVar2.f356957b[i13] = Math.max(0.0f, Math.min(1.0f, uVar2.f356976f[i13].getInterpolation((i12 - u.f356972m[i13]) / u.f356971l[i13])));
            }
            if (uVar2.f356979i) {
                Arrays.fill(uVar2.f356958c, com.google.android.material.color.k.a(uVar2.f356977g.f356909c[uVar2.f356978h], uVar2.f356956a.f356953k));
                uVar2.f356979i = false;
            }
            uVar2.f356956a.invalidateSelf();
        }
    }

    public u(@N Context context, @N w wVar) {
        super(2);
        this.f356978h = 0;
        this.f356981k = null;
        this.f356977g = wVar;
        this.f356976f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // com.google.android.material.progressindicator.n
    public final void a() {
        ObjectAnimator objectAnimator = this.f356974d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.n
    public final void b() {
        this.f356978h = 0;
        int iA2 = com.google.android.material.color.k.a(this.f356977g.f356909c[0], this.f356956a.f356953k);
        int[] iArr = this.f356958c;
        iArr[0] = iA2;
        iArr[1] = iA2;
    }

    @Override // com.google.android.material.progressindicator.n
    public final void c(@N b.a aVar) {
        this.f356981k = aVar;
    }

    @Override // com.google.android.material.progressindicator.n
    public final void d() {
        ObjectAnimator objectAnimator = this.f356975e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f356956a.isVisible()) {
            this.f356975e.setFloatValues(this.f356980j, 1.0f);
            this.f356975e.setDuration((long) ((1.0f - this.f356980j) * 1800.0f));
            this.f356975e.start();
        }
    }

    @Override // com.google.android.material.progressindicator.n
    public final void e() {
        ObjectAnimator objectAnimator = this.f356974d;
        Property<u, Float> property = f356973n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
            this.f356974d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f356974d.setInterpolator(null);
            this.f356974d.setRepeatCount(-1);
            this.f356974d.addListener(new s(this));
        }
        if (this.f356975e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, property, 1.0f);
            this.f356975e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f356975e.setInterpolator(null);
            this.f356975e.addListener(new t(this));
        }
        this.f356978h = 0;
        int iA2 = com.google.android.material.color.k.a(this.f356977g.f356909c[0], this.f356956a.f356953k);
        int[] iArr = this.f356958c;
        iArr[0] = iA2;
        iArr[1] = iA2;
        this.f356974d.start();
    }

    @Override // com.google.android.material.progressindicator.n
    public final void f() {
        this.f356981k = null;
    }
}
