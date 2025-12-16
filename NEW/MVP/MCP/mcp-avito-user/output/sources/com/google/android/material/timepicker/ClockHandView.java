package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.R;
import com.google.android.material.internal.O;
import j.InterfaceC42167x;
import j.P;
import j.U;
import j.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import lY0.C43707b;
import vY0.C49285a;
import wY0.C49576a;

/* loaded from: classes6.dex */
class ClockHandView extends View {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f357592w = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f357593b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f357594c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f357595d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f357596e;

    /* renamed from: f, reason: collision with root package name */
    public float f357597f;

    /* renamed from: g, reason: collision with root package name */
    public float f357598g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f357599h;

    /* renamed from: i, reason: collision with root package name */
    public final int f357600i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f357601j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f357602k;

    /* renamed from: l, reason: collision with root package name */
    public final int f357603l;

    /* renamed from: m, reason: collision with root package name */
    public final float f357604m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f357605n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f357606o;

    /* renamed from: p, reason: collision with root package name */
    @U
    public final int f357607p;

    /* renamed from: q, reason: collision with root package name */
    public float f357608q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f357609r;

    /* renamed from: s, reason: collision with root package name */
    public b f357610s;

    /* renamed from: t, reason: collision with root package name */
    public double f357611t;

    /* renamed from: u, reason: collision with root package name */
    public int f357612u;

    /* renamed from: v, reason: collision with root package name */
    public int f357613v;

    public class a extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
    }

    public interface c {
        void b(@InterfaceC42167x float f12, boolean z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockHandView(Context context, @P AttributeSet attributeSet) {
        int i12 = R.attr.materialClockStyle;
        super(context, attributeSet, i12);
        this.f357595d = new ValueAnimator();
        this.f357602k = new ArrayList();
        Paint paint = new Paint();
        this.f357605n = paint;
        this.f357606o = new RectF();
        this.f357613v = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i12, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f357593b = C49576a.c(context, R.attr.motionDurationLong2, 200);
        this.f357594c = C49576a.d(context, R.attr.motionEasingEmphasizedInterpolator, C43707b.f413880b);
        this.f357612u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.f357603l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.f357607p = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f357604m = r0.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(0.0f, false);
        this.f357600i = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(float f12, float f13) {
        int degrees = (int) Math.toDegrees(Math.atan2(f13 - (getHeight() / 2), f12 - (getWidth() / 2)));
        int i12 = degrees + 90;
        return i12 < 0 ? degrees + 450 : i12;
    }

    @r
    public final int b(int i12) {
        return i12 == 2 ? Math.round(this.f357612u * 0.66f) : this.f357612u;
    }

    public final void c(@InterfaceC42167x float f12, boolean z12) {
        ValueAnimator valueAnimator = this.f357595d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z12) {
            d(f12, false);
            return;
        }
        float f13 = this.f357608q;
        if (Math.abs(f13 - f12) > 180.0f) {
            if (f13 > 180.0f && f12 < 180.0f) {
                f12 += 360.0f;
            }
            if (f13 < 180.0f && f12 > 180.0f) {
                f13 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f13), Float.valueOf(f12));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f357593b);
        valueAnimator.setInterpolator(this.f357594c);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i12 = ClockHandView.f357592w;
                ClockHandView clockHandView = this.f357659a;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new a());
        valueAnimator.start();
    }

    public final void d(@InterfaceC42167x float f12, boolean z12) {
        float f13 = f12 % 360.0f;
        this.f357608q = f13;
        this.f357611t = Math.toRadians(f13 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fB2 = b(this.f357613v);
        float fCos = (((float) Math.cos(this.f357611t)) * fB2) + width;
        float fSin = (fB2 * ((float) Math.sin(this.f357611t))) + height;
        float f14 = this.f357603l;
        this.f357606o.set(fCos - f14, fSin - f14, fCos + f14, fSin + f14);
        Iterator it = this.f357602k.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(f13, z12);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f12 = width;
        float fB2 = b(this.f357613v);
        float fCos = (((float) Math.cos(this.f357611t)) * fB2) + f12;
        float f13 = height;
        float fSin = (fB2 * ((float) Math.sin(this.f357611t))) + f13;
        Paint paint = this.f357605n;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f357603l, paint);
        double dSin = Math.sin(this.f357611t);
        paint.setStrokeWidth(this.f357607p);
        canvas.drawLine(f12, f13, width + ((int) (Math.cos(this.f357611t) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f12, f13, this.f357604m, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        if (this.f357595d.isRunning()) {
            return;
        }
        c(this.f357608q, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i12 = (int) (x12 - this.f357597f);
                int i13 = (int) (y12 - this.f357598g);
                this.f357599h = (i13 * i13) + (i12 * i12) > this.f357600i;
                z13 = this.f357609r;
                z12 = actionMasked == 1;
                if (this.f357601j) {
                    this.f357613v = C49285a.a((float) (getWidth() / 2), (float) (getHeight() / 2), x12, y12) > ((float) b(2)) + O.b(12, getContext()) ? 1 : 2;
                }
                z14 = false;
            } else {
                z12 = false;
                z14 = false;
                z13 = false;
            }
        } else {
            this.f357597f = x12;
            this.f357598g = y12;
            this.f357599h = true;
            this.f357609r = false;
            z12 = false;
            z13 = false;
            z14 = true;
        }
        boolean z16 = this.f357609r;
        float fA2 = a(x12, y12);
        boolean z17 = this.f357608q != fA2;
        if (z14 && z17) {
            z15 = true;
        } else if (z17 || z13) {
            c(fA2, z12 && this.f357596e);
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z18 = z15 | z16;
        this.f357609r = z18;
        if (z18 && z12 && (bVar = this.f357610s) != null) {
            float fA3 = a(x12, y12);
            boolean z19 = this.f357599h;
            g gVar = (g) bVar;
            gVar.f357673f = true;
            TimeModel timeModel = gVar.f357670c;
            int i14 = timeModel.f357644f;
            int i15 = timeModel.f357643e;
            int i16 = timeModel.f357645g;
            TimePickerView timePickerView = gVar.f357669b;
            if (i16 == 10) {
                timePickerView.f357650d.c(gVar.f357672e, false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) androidx.core.content.d.getSystemService(timePickerView.getContext(), AccessibilityManager.class);
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    gVar.a(12, true);
                }
            } else {
                int iRound = Math.round(fA3);
                if (!z19) {
                    timeModel.e(((iRound + 15) / 30) * 5);
                    gVar.f357671d = timeModel.f357644f * 6;
                }
                timePickerView.f357650d.c(gVar.f357671d, z19);
            }
            gVar.f357673f = false;
            gVar.c();
            if (timeModel.f357644f != i14 || timeModel.f357643e != i15) {
                timePickerView.performHapticFeedback(4);
            }
        }
        return true;
    }
}
