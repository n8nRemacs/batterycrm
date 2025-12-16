package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.motion.widget.w;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import androidx.core.view.J;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements J {

    /* renamed from: q0, reason: collision with root package name */
    public static boolean f43782q0;

    /* renamed from: A, reason: collision with root package name */
    public C22738d f43783A;

    /* renamed from: B, reason: collision with root package name */
    public int f43784B;

    /* renamed from: C, reason: collision with root package name */
    public int f43785C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f43786D;

    /* renamed from: E, reason: collision with root package name */
    public float f43787E;

    /* renamed from: F, reason: collision with root package name */
    public float f43788F;

    /* renamed from: G, reason: collision with root package name */
    public long f43789G;

    /* renamed from: H, reason: collision with root package name */
    public float f43790H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f43791I;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList<q> f43792J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList<q> f43793K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList<q> f43794L;

    /* renamed from: M, reason: collision with root package name */
    public CopyOnWriteArrayList<j> f43795M;

    /* renamed from: N, reason: collision with root package name */
    public int f43796N;

    /* renamed from: O, reason: collision with root package name */
    public long f43797O;

    /* renamed from: P, reason: collision with root package name */
    public float f43798P;

    /* renamed from: Q, reason: collision with root package name */
    public int f43799Q;

    /* renamed from: R, reason: collision with root package name */
    public float f43800R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f43801S;

    /* renamed from: T, reason: collision with root package name */
    public int f43802T;

    /* renamed from: U, reason: collision with root package name */
    public int f43803U;

    /* renamed from: V, reason: collision with root package name */
    public int f43804V;

    /* renamed from: W, reason: collision with root package name */
    public int f43805W;

    /* renamed from: a0, reason: collision with root package name */
    public int f43806a0;

    /* renamed from: b, reason: collision with root package name */
    public w f43807b;

    /* renamed from: b0, reason: collision with root package name */
    public int f43808b0;

    /* renamed from: c, reason: collision with root package name */
    public s f43809c;

    /* renamed from: c0, reason: collision with root package name */
    public float f43810c0;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f43811d;

    /* renamed from: d0, reason: collision with root package name */
    public final androidx.constraintlayout.core.motion.utils.g f43812d0;

    /* renamed from: e, reason: collision with root package name */
    public float f43813e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f43814e0;

    /* renamed from: f, reason: collision with root package name */
    public int f43815f;

    /* renamed from: f0, reason: collision with root package name */
    public i f43816f0;

    /* renamed from: g, reason: collision with root package name */
    public int f43817g;

    /* renamed from: g0, reason: collision with root package name */
    public J11.c f43818g0;

    /* renamed from: h, reason: collision with root package name */
    public int f43819h;

    /* renamed from: h0, reason: collision with root package name */
    public final Rect f43820h0;

    /* renamed from: i, reason: collision with root package name */
    public int f43821i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f43822i0;

    /* renamed from: j, reason: collision with root package name */
    public int f43823j;

    /* renamed from: j0, reason: collision with root package name */
    public k f43824j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f43825k;

    /* renamed from: k0, reason: collision with root package name */
    public final f f43826k0;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<View, p> f43827l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f43828l0;

    /* renamed from: m, reason: collision with root package name */
    public long f43829m;

    /* renamed from: m0, reason: collision with root package name */
    public final RectF f43830m0;

    /* renamed from: n, reason: collision with root package name */
    public float f43831n;

    /* renamed from: n0, reason: collision with root package name */
    public View f43832n0;

    /* renamed from: o, reason: collision with root package name */
    public float f43833o;

    /* renamed from: o0, reason: collision with root package name */
    public Matrix f43834o0;

    /* renamed from: p, reason: collision with root package name */
    public float f43835p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList<Integer> f43836p0;

    /* renamed from: q, reason: collision with root package name */
    public long f43837q;

    /* renamed from: r, reason: collision with root package name */
    public float f43838r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f43839s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f43840t;

    /* renamed from: u, reason: collision with root package name */
    public j f43841u;

    /* renamed from: v, reason: collision with root package name */
    public int f43842v;

    /* renamed from: w, reason: collision with root package name */
    public e f43843w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f43844x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.constraintlayout.motion.utils.b f43845y;

    /* renamed from: z, reason: collision with root package name */
    public final d f43846z;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f43847b;

        public a(View view) {
            this.f43847b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f43847b.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f43816f0.a();
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43849a;

        static {
            int[] iArr = new int[k.values().length];
            f43849a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43849a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43849a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43849a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class d extends s {

        /* renamed from: a, reason: collision with root package name */
        public float f43850a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        public float f43851b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f43852c;

        public d() {
        }

        @Override // androidx.constraintlayout.motion.widget.s
        public final float a() {
            return MotionLayout.this.f43813e;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f12) {
            float f13 = this.f43850a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f13 > 0.0f) {
                float f14 = this.f43852c;
                if (f13 / f14 < f12) {
                    f12 = f13 / f14;
                }
                motionLayout.f43813e = f13 - (f14 * f12);
                return ((f13 * f12) - (((f14 * f12) * f12) / 2.0f)) + this.f43851b;
            }
            float f15 = this.f43852c;
            if ((-f13) / f15 < f12) {
                f12 = (-f13) / f15;
            }
            motionLayout.f43813e = (f15 * f12) + f13;
            return (((f15 * f12) * f12) / 2.0f) + (f13 * f12) + this.f43851b;
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public float[] f43854a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f43855b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f43856c;

        /* renamed from: d, reason: collision with root package name */
        public Path f43857d;

        /* renamed from: e, reason: collision with root package name */
        public final Paint f43858e;

        /* renamed from: f, reason: collision with root package name */
        public final Paint f43859f;

        /* renamed from: g, reason: collision with root package name */
        public final Paint f43860g;

        /* renamed from: h, reason: collision with root package name */
        public final Paint f43861h;

        /* renamed from: i, reason: collision with root package name */
        public final Paint f43862i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f43863j;

        /* renamed from: k, reason: collision with root package name */
        public int f43864k;

        /* renamed from: l, reason: collision with root package name */
        public final Rect f43865l = new Rect();

        /* renamed from: m, reason: collision with root package name */
        public final int f43866m = 1;

        public e() {
            Paint paint = new Paint();
            this.f43858e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f43859f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f43860g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.f43861h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f43863j = new float[8];
            Paint paint5 = new Paint();
            this.f43862i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f43856c = new float[100];
            this.f43855b = new int[50];
        }

        public final void a(Canvas canvas, int i12, int i13, p pVar) {
            int width;
            int height;
            Paint paint;
            float f12;
            float f13;
            int i14;
            int[] iArr = this.f43855b;
            int i15 = 4;
            if (i12 == 4) {
                boolean z12 = false;
                boolean z13 = false;
                for (int i16 = 0; i16 < this.f43864k; i16++) {
                    int i17 = iArr[i16];
                    if (i17 == 1) {
                        z12 = true;
                    }
                    if (i17 == 0) {
                        z13 = true;
                    }
                }
                if (z12) {
                    float[] fArr = this.f43854a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f43860g);
                }
                if (z13) {
                    b(canvas);
                }
            }
            if (i12 == 2) {
                float[] fArr2 = this.f43854a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f43860g);
            }
            if (i12 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f43854a, this.f43858e);
            View view = pVar.f44006b;
            if (view != null) {
                width = view.getWidth();
                height = pVar.f44006b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i18 = 1;
            while (i18 < i13 - 1) {
                if (i12 == i15 && iArr[i18 - 1] == 0) {
                    i14 = i18;
                } else {
                    int i19 = i18 * 2;
                    float[] fArr3 = this.f43856c;
                    float f14 = fArr3[i19];
                    float f15 = fArr3[i19 + 1];
                    this.f43857d.reset();
                    this.f43857d.moveTo(f14, f15 + 10.0f);
                    this.f43857d.lineTo(f14 + 10.0f, f15);
                    this.f43857d.lineTo(f14, f15 - 10.0f);
                    this.f43857d.lineTo(f14 - 10.0f, f15);
                    this.f43857d.close();
                    int i22 = i18 - 1;
                    pVar.f44025u.get(i22);
                    Paint paint2 = this.f43862i;
                    if (i12 == i15) {
                        int i23 = iArr[i22];
                        if (i23 == 1) {
                            d(canvas, f14 - 0.0f, f15 - 0.0f);
                        } else if (i23 == 0) {
                            c(canvas, f14 - 0.0f, f15 - 0.0f);
                        } else {
                            if (i23 == 2) {
                                paint = paint2;
                                f12 = f15;
                                f13 = f14;
                                i14 = i18;
                                e(canvas, f14 - 0.0f, f15 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f43857d, paint);
                        }
                        paint = paint2;
                        f12 = f15;
                        f13 = f14;
                        i14 = i18;
                        canvas.drawPath(this.f43857d, paint);
                    } else {
                        paint = paint2;
                        f12 = f15;
                        f13 = f14;
                        i14 = i18;
                    }
                    if (i12 == 2) {
                        d(canvas, f13 - 0.0f, f12 - 0.0f);
                    }
                    if (i12 == 3) {
                        c(canvas, f13 - 0.0f, f12 - 0.0f);
                    }
                    if (i12 == 6) {
                        e(canvas, f13 - 0.0f, f12 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f43857d, paint);
                }
                i18 = i14 + 1;
                i15 = 4;
            }
            float[] fArr4 = this.f43854a;
            if (fArr4.length > 1) {
                float f16 = fArr4[0];
                float f17 = fArr4[1];
                Paint paint3 = this.f43859f;
                canvas.drawCircle(f16, f17, 8.0f, paint3);
                float[] fArr5 = this.f43854a;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f43854a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float fMin = Math.min(f12, f14);
            float fMax = Math.max(f13, f15);
            float fMax2 = Math.max(f12, f14);
            float fMax3 = Math.max(f13, f15);
            Paint paint = this.f43860g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f12, f14), Math.min(f13, f15), Math.min(f12, f14), Math.max(f13, f15), paint);
        }

        public final void c(Canvas canvas, float f12, float f13) {
            float[] fArr = this.f43854a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[fArr.length - 2];
            float f17 = fArr[fArr.length - 1];
            float fMin = Math.min(f14, f16);
            float fMax = Math.max(f15, f17);
            float fMin2 = f12 - Math.min(f14, f16);
            float fMax2 = Math.max(f15, f17) - f13;
            String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f16 - f14)) + 0.5d)) / 100.0f);
            Paint paint = this.f43861h;
            paint.getTextBounds(str, 0, str.length(), this.f43865l);
            Rect rect = this.f43865l;
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f13 - 20.0f, paint);
            float fMin3 = Math.min(f14, f16);
            Paint paint2 = this.f43860g;
            canvas.drawLine(f12, f13, fMin3, f13, paint2);
            String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f17 - f15)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), this.f43865l);
            canvas.drawText(str2, f12 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f12, f13, f12, Math.max(f15, f17), paint2);
        }

        public final void d(Canvas canvas, float f12, float f13) {
            float[] fArr = this.f43854a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[fArr.length - 2];
            float f17 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f14 - f16, f15 - f17);
            float f18 = f16 - f14;
            float f19 = f17 - f15;
            float f22 = (((f13 - f15) * f19) + ((f12 - f14) * f18)) / (fHypot * fHypot);
            float f23 = f14 + (f18 * f22);
            float f24 = f15 + (f22 * f19);
            Path path = new Path();
            path.moveTo(f12, f13);
            path.lineTo(f23, f24);
            float fHypot2 = (float) Math.hypot(f23 - f12, f24 - f13);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            Paint paint = this.f43861h;
            paint.getTextBounds(str, 0, str.length(), this.f43865l);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f43865l.width() / 2), -20.0f, paint);
            canvas.drawLine(f12, f13, f23, f24, this.f43860g);
        }

        public final void e(Canvas canvas, float f12, float f13, int i12, int i13) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) ((((f12 - (i12 / 2)) * 100.0f) / (motionLayout.getWidth() - i12)) + 0.5d)) / 100.0f);
            String string = sb2.toString();
            Paint paint = this.f43861h;
            paint.getTextBounds(string, 0, string.length(), this.f43865l);
            Rect rect = this.f43865l;
            canvas.drawText(string, ((f12 / 2.0f) - (rect.width() / 2)) + 0.0f, f13 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f43860g;
            canvas.drawLine(f12, f13, fMin, f13, paint2);
            String str = "" + (((int) ((((f13 - (i13 / 2)) * 100.0f) / (motionLayout.getHeight() - i13)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), this.f43865l);
            canvas.drawText(str, f12 + 5.0f, 0.0f - ((f13 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f12, f13, f12, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f43868a = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: b, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f43869b = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f43870c = null;

        /* renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f43871d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f43872e;

        /* renamed from: f, reason: collision with root package name */
        public int f43873f;

        public f() {
        }

        public static void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ArrayList<ConstraintWidget> arrayList = dVar.f43661u0;
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(dVar, dVar2);
            dVar2.f43661u0.clear();
            dVar2.j(dVar, map);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget aVar = next instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : next instanceof androidx.constraintlayout.core.widgets.f ? new androidx.constraintlayout.core.widgets.f() : next instanceof androidx.constraintlayout.core.widgets.e ? new androidx.constraintlayout.core.widgets.e() : next instanceof androidx.constraintlayout.core.widgets.j ? new androidx.constraintlayout.core.widgets.j() : next instanceof androidx.constraintlayout.core.widgets.g ? new androidx.constraintlayout.core.widgets.h() : new ConstraintWidget();
                dVar2.f43661u0.add(aVar);
                ConstraintWidget constraintWidget = aVar.f43424V;
                if (constraintWidget != null) {
                    ((androidx.constraintlayout.core.widgets.m) constraintWidget).f43661u0.remove(aVar);
                    aVar.G();
                }
                aVar.f43424V = dVar2;
                map.put(next, aVar);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                map.get(next2).j(next2, map);
            }
        }

        public static ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.f43444h0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.f43661u0;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget = arrayList.get(i12);
                if (constraintWidget.f43444h0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void a() {
            SparseArray sparseArray;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            motionLayout.f43827l.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = motionLayout.getChildAt(i12);
                p pVar = new p(childAt);
                int id2 = childAt.getId();
                iArr[i12] = id2;
                sparseArray2.put(id2, pVar);
                motionLayout.f43827l.put(childAt, pVar);
            }
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = motionLayout.getChildAt(i13);
                p pVar2 = motionLayout.f43827l.get(childAt2);
                if (pVar2 == null) {
                    sparseArray = sparseArray2;
                } else {
                    androidx.constraintlayout.widget.d dVar = this.f43870c;
                    n nVar = pVar2.f44012h;
                    v vVar = pVar2.f44010f;
                    if (dVar != null) {
                        ConstraintWidget constraintWidgetD = d(this.f43868a, childAt2);
                        if (constraintWidgetD != null) {
                            Rect rectG = MotionLayout.g(motionLayout, constraintWidgetD);
                            androidx.constraintlayout.widget.d dVar2 = this.f43870c;
                            int width = motionLayout.getWidth();
                            int height = motionLayout.getHeight();
                            int i14 = dVar2.f44261c;
                            if (i14 != 0) {
                                p.j(i14, width, height, rectG, pVar2.f44005a);
                            }
                            vVar.f44038d = 0.0f;
                            vVar.f44039e = 0.0f;
                            pVar2.i(vVar);
                            sparseArray = sparseArray2;
                            vVar.d(rectG.left, rectG.top, rectG.width(), rectG.height());
                            d.a aVarP = dVar2.p(pVar2.f44007c);
                            vVar.a(aVarP);
                            d.c cVar = aVarP.f44268d;
                            pVar2.f44016l = cVar.f44361g;
                            nVar.d(rectG, dVar2, i14, pVar2.f44007c);
                            pVar2.f43999C = aVarP.f44270f.f44382i;
                            pVar2.f44001E = cVar.f44364j;
                            pVar2.f44002F = cVar.f44363i;
                            Context context = pVar2.f44006b.getContext();
                            int i15 = cVar.f44366l;
                            pVar2.f44003G = i15 != -2 ? i15 != -1 ? i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 4 ? i15 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new o(androidx.constraintlayout.core.motion.utils.d.c(cVar.f44365k)) : AnimationUtils.loadInterpolator(context, cVar.f44367m);
                        } else {
                            sparseArray = sparseArray2;
                            if (motionLayout.f43842v != 0) {
                                C22737c.b();
                                C22737c.d(childAt2);
                                childAt2.getClass();
                            }
                        }
                    } else {
                        sparseArray = sparseArray2;
                    }
                    if (this.f43871d != null) {
                        ConstraintWidget constraintWidgetD2 = d(this.f43869b, childAt2);
                        if (constraintWidgetD2 != null) {
                            Rect rectG2 = MotionLayout.g(motionLayout, constraintWidgetD2);
                            androidx.constraintlayout.widget.d dVar3 = this.f43871d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i16 = dVar3.f44261c;
                            if (i16 != 0) {
                                p.j(i16, width2, height2, rectG2, pVar2.f44005a);
                                rectG2 = pVar2.f44005a;
                            }
                            v vVar2 = pVar2.f44011g;
                            vVar2.f44038d = 1.0f;
                            vVar2.f44039e = 1.0f;
                            pVar2.i(vVar2);
                            vVar2.d(rectG2.left, rectG2.top, rectG2.width(), rectG2.height());
                            vVar2.a(dVar3.p(pVar2.f44007c));
                            pVar2.f44013i.d(rectG2, dVar3, i16, pVar2.f44007c);
                        } else if (motionLayout.f43842v != 0) {
                            C22737c.b();
                            C22737c.d(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
                i13++;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray3 = sparseArray2;
            int i17 = 0;
            while (i17 < childCount) {
                SparseArray sparseArray4 = sparseArray3;
                p pVar3 = (p) sparseArray4.get(iArr[i17]);
                int i18 = pVar3.f44010f.f44046l;
                if (i18 != -1) {
                    p pVar4 = (p) sparseArray4.get(i18);
                    pVar3.f44010f.f(pVar4, pVar4.f44010f);
                    pVar3.f44011g.f(pVar4, pVar4.f44011g);
                }
                i17++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void b(int i12, int i13) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f43817g == motionLayout.getStartState()) {
                androidx.constraintlayout.core.widgets.d dVar = this.f43869b;
                androidx.constraintlayout.widget.d dVar2 = this.f43871d;
                motionLayout.resolveSystem(dVar, optimizationLevel, (dVar2 == null || dVar2.f44261c == 0) ? i12 : i13, (dVar2 == null || dVar2.f44261c == 0) ? i13 : i12);
                androidx.constraintlayout.widget.d dVar3 = this.f43870c;
                if (dVar3 != null) {
                    androidx.constraintlayout.core.widgets.d dVar4 = this.f43868a;
                    int i14 = dVar3.f44261c;
                    int i15 = i14 == 0 ? i12 : i13;
                    if (i14 == 0) {
                        i12 = i13;
                    }
                    motionLayout.resolveSystem(dVar4, optimizationLevel, i15, i12);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar5 = this.f43870c;
            if (dVar5 != null) {
                androidx.constraintlayout.core.widgets.d dVar6 = this.f43868a;
                int i16 = dVar5.f44261c;
                motionLayout.resolveSystem(dVar6, optimizationLevel, i16 == 0 ? i12 : i13, i16 == 0 ? i13 : i12);
            }
            androidx.constraintlayout.core.widgets.d dVar7 = this.f43869b;
            androidx.constraintlayout.widget.d dVar8 = this.f43871d;
            int i17 = (dVar8 == null || dVar8.f44261c == 0) ? i12 : i13;
            if (dVar8 == null || dVar8.f44261c == 0) {
                i12 = i13;
            }
            motionLayout.resolveSystem(dVar7, optimizationLevel, i17, i12);
        }

        public final void e(androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f43870c = dVar;
            this.f43871d = dVar2;
            this.f43868a = new androidx.constraintlayout.core.widgets.d();
            this.f43869b = new androidx.constraintlayout.core.widgets.d();
            androidx.constraintlayout.core.widgets.d dVar3 = this.f43868a;
            MotionLayout motionLayout = MotionLayout.this;
            b.InterfaceC1703b interfaceC1703b = ((ConstraintLayout) motionLayout).mLayoutWidget.f43595y0;
            dVar3.f43595y0 = interfaceC1703b;
            dVar3.f43593w0.f43506f = interfaceC1703b;
            androidx.constraintlayout.core.widgets.d dVar4 = this.f43869b;
            b.InterfaceC1703b interfaceC1703b2 = ((ConstraintLayout) motionLayout).mLayoutWidget.f43595y0;
            dVar4.f43595y0 = interfaceC1703b2;
            dVar4.f43593w0.f43506f = interfaceC1703b2;
            this.f43868a.f43661u0.clear();
            this.f43869b.f43661u0.clear();
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f43868a);
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f43869b);
            if (motionLayout.f43835p > 0.5d) {
                if (dVar != null) {
                    g(this.f43868a, dVar);
                }
                g(this.f43869b, dVar2);
            } else {
                g(this.f43869b, dVar2);
                if (dVar != null) {
                    g(this.f43868a, dVar);
                }
            }
            this.f43868a.f43596z0 = motionLayout.isRtl();
            androidx.constraintlayout.core.widgets.d dVar5 = this.f43868a;
            dVar5.f43592v0.c(dVar5);
            this.f43869b.f43596z0 = motionLayout.isRtl();
            androidx.constraintlayout.core.widgets.d dVar6 = this.f43869b;
            dVar6.f43592v0.c(dVar6);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i12 = layoutParams.width;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43476c;
                if (i12 == -2) {
                    this.f43868a.Q(dimensionBehaviour);
                    this.f43869b.Q(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    this.f43868a.R(dimensionBehaviour);
                    this.f43869b.R(dimensionBehaviour);
                }
            }
        }

        public final void f() {
            HashMap<View, p> map;
            MotionLayout motionLayout = MotionLayout.this;
            int i12 = motionLayout.f43821i;
            int i13 = motionLayout.f43823j;
            int mode = View.MeasureSpec.getMode(i12);
            int mode2 = View.MeasureSpec.getMode(i13);
            motionLayout.f43806a0 = mode;
            motionLayout.f43808b0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i12, i13);
            int i14 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i12, i13);
                motionLayout.f43802T = this.f43868a.u();
                motionLayout.f43803U = this.f43868a.o();
                motionLayout.f43804V = this.f43869b.u();
                int iO2 = this.f43869b.o();
                motionLayout.f43805W = iO2;
                motionLayout.f43801S = (motionLayout.f43802T == motionLayout.f43804V && motionLayout.f43803U == iO2) ? false : true;
            }
            int i15 = motionLayout.f43802T;
            int i16 = motionLayout.f43803U;
            int i17 = motionLayout.f43806a0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i15 = (int) ((motionLayout.f43810c0 * (motionLayout.f43804V - i15)) + i15);
            }
            int i18 = i15;
            int i19 = motionLayout.f43808b0;
            int i22 = (i19 == Integer.MIN_VALUE || i19 == 0) ? (int) ((motionLayout.f43810c0 * (motionLayout.f43805W - i16)) + i16) : i16;
            androidx.constraintlayout.core.widgets.d dVar = this.f43868a;
            motionLayout.resolveMeasuredDimension(i12, i13, i18, i22, dVar.f43584I0 || this.f43869b.f43584I0, dVar.f43585J0 || this.f43869b.f43585J0);
            int childCount = motionLayout.getChildCount();
            motionLayout.f43826k0.a();
            motionLayout.f43840t = true;
            SparseArray sparseArray = new SparseArray();
            int i23 = 0;
            while (true) {
                map = motionLayout.f43827l;
                if (i23 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i23);
                sparseArray.put(childAt.getId(), map.get(childAt));
                i23++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            w.b bVar = motionLayout.f43807b.f44055c;
            int i24 = bVar != null ? bVar.f44088p : -1;
            if (i24 != -1) {
                for (int i25 = 0; i25 < childCount; i25++) {
                    p pVar = map.get(motionLayout.getChildAt(i25));
                    if (pVar != null) {
                        pVar.f43998B = i24;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i26 = 0;
            for (int i27 = 0; i27 < childCount; i27++) {
                p pVar2 = map.get(motionLayout.getChildAt(i27));
                int i28 = pVar2.f44010f.f44046l;
                if (i28 != -1) {
                    sparseBooleanArray.put(i28, true);
                    iArr[i26] = pVar2.f44010f.f44046l;
                    i26++;
                }
            }
            if (motionLayout.f43794L != null) {
                for (int i29 = 0; i29 < i26; i29++) {
                    p pVar3 = map.get(motionLayout.findViewById(iArr[i29]));
                    if (pVar3 != null) {
                        motionLayout.f43807b.f(pVar3);
                    }
                }
                Iterator<q> it = motionLayout.f43794L.iterator();
                while (it.hasNext()) {
                    it.next().s(motionLayout, map);
                }
                for (int i32 = 0; i32 < i26; i32++) {
                    p pVar4 = map.get(motionLayout.findViewById(iArr[i32]));
                    if (pVar4 != null) {
                        pVar4.k(width, height, motionLayout.getNanoTime());
                    }
                }
            } else {
                for (int i33 = 0; i33 < i26; i33++) {
                    p pVar5 = map.get(motionLayout.findViewById(iArr[i33]));
                    if (pVar5 != null) {
                        motionLayout.f43807b.f(pVar5);
                        pVar5.k(width, height, motionLayout.getNanoTime());
                    }
                }
            }
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt2 = motionLayout.getChildAt(i34);
                p pVar6 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && pVar6 != null) {
                    motionLayout.f43807b.f(pVar6);
                    pVar6.k(width, height, motionLayout.getNanoTime());
                }
            }
            w.b bVar2 = motionLayout.f43807b.f44055c;
            float f12 = bVar2 != null ? bVar2.f44081i : 0.0f;
            if (f12 != 0.0f) {
                boolean z12 = ((double) f12) < 0.0d;
                float fAbs = Math.abs(f12);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i35 = 0; i35 < childCount; i35++) {
                    p pVar7 = map.get(motionLayout.getChildAt(i35));
                    if (!Float.isNaN(pVar7.f44016l)) {
                        for (int i36 = 0; i36 < childCount; i36++) {
                            p pVar8 = map.get(motionLayout.getChildAt(i36));
                            if (!Float.isNaN(pVar8.f44016l)) {
                                fMin = Math.min(fMin, pVar8.f44016l);
                                fMax = Math.max(fMax, pVar8.f44016l);
                            }
                        }
                        while (i14 < childCount) {
                            p pVar9 = map.get(motionLayout.getChildAt(i14));
                            if (!Float.isNaN(pVar9.f44016l)) {
                                pVar9.f44018n = 1.0f / (1.0f - fAbs);
                                if (z12) {
                                    pVar9.f44017m = fAbs - (((fMax - pVar9.f44016l) / (fMax - fMin)) * fAbs);
                                } else {
                                    pVar9.f44017m = fAbs - (((pVar9.f44016l - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i14++;
                        }
                        return;
                    }
                    v vVar = pVar7.f44011g;
                    float f13 = vVar.f44040f;
                    float f14 = vVar.f44041g;
                    float f15 = z12 ? f14 - f13 : f14 + f13;
                    fMin2 = Math.min(fMin2, f15);
                    fMax2 = Math.max(fMax2, f15);
                }
                while (i14 < childCount) {
                    p pVar10 = map.get(motionLayout.getChildAt(i14));
                    v vVar2 = pVar10.f44011g;
                    float f16 = vVar2.f44040f;
                    float f17 = vVar2.f44041g;
                    float f18 = z12 ? f17 - f16 : f17 + f16;
                    pVar10.f44018n = 1.0f / (1.0f - fAbs);
                    pVar10.f44017m = fAbs - (((f18 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i14++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.d dVar2) {
            d.a aVar;
            d.a aVar2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            e.a aVar3 = new e.a();
            sparseArray.clear();
            sparseArray.put(0, dVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), dVar);
            if (dVar2 != null && dVar2.f44261c != 0) {
                androidx.constraintlayout.core.widgets.d dVar3 = this.f43869b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z12 = MotionLayout.f43782q0;
                motionLayout.resolveSystem(dVar3, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            Iterator<ConstraintWidget> it = dVar.f43661u0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f43448j0 = true;
                sparseArray.put(next.f43444h0.getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.f43661u0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = next2.f43444h0;
                int id2 = view.getId();
                HashMap<Integer, d.a> map = dVar2.f44264f;
                if (map.containsKey(Integer.valueOf(id2)) && (aVar2 = map.get(Integer.valueOf(id2))) != null) {
                    aVar2.b(aVar3);
                }
                next2.S(dVar2.p(view.getId()).f44269e.f44316c);
                next2.P(dVar2.p(view.getId()).f44269e.f44318d);
                if (view instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar4 = (androidx.constraintlayout.widget.a) view;
                    int id3 = aVar4.getId();
                    HashMap<Integer, d.a> map2 = dVar2.f44264f;
                    if (map2.containsKey(Integer.valueOf(id3)) && (aVar = map2.get(Integer.valueOf(id3))) != null && (next2 instanceof androidx.constraintlayout.core.widgets.h)) {
                        aVar4.m(aVar, (androidx.constraintlayout.core.widgets.h) next2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).r();
                    }
                }
                aVar3.resolveLayoutDirection(motionLayout.getLayoutDirection());
                boolean z13 = MotionLayout.f43782q0;
                motionLayout.applyConstraintsFromLayoutParams(false, view, next2, aVar3, sparseArray);
                if (dVar2.p(view.getId()).f44267c.f44370c == 1) {
                    next2.f43446i0 = view.getVisibility();
                } else {
                    next2.f43446i0 = dVar2.p(view.getId()).f44267c.f44369b;
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.f43661u0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.l) {
                    androidx.constraintlayout.widget.a aVar5 = (androidx.constraintlayout.widget.a) next3.f43444h0;
                    androidx.constraintlayout.core.widgets.g gVar = (androidx.constraintlayout.core.widgets.g) next3;
                    aVar5.q(gVar, sparseArray);
                    androidx.constraintlayout.core.widgets.l lVar = (androidx.constraintlayout.core.widgets.l) gVar;
                    for (int i12 = 0; i12 < lVar.f43648v0; i12++) {
                        ConstraintWidget constraintWidget = lVar.f43647u0[i12];
                        if (constraintWidget != null) {
                            constraintWidget.f43409G = true;
                        }
                    }
                }
            }
        }
    }

    public interface g {
    }

    public static class h implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final h f43875b = new h();

        /* renamed from: a, reason: collision with root package name */
        public VelocityTracker f43876a;
    }

    public class i {

        /* renamed from: a, reason: collision with root package name */
        public float f43877a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f43878b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f43879c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f43880d = -1;

        public i() {
        }

        public final void a() {
            int i12 = this.f43879c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i12 != -1 || this.f43880d != -1) {
                if (i12 == -1) {
                    motionLayout.F(this.f43880d);
                } else {
                    int i13 = this.f43880d;
                    if (i13 == -1) {
                        motionLayout.B(i12);
                    } else {
                        motionLayout.C(i12, i13);
                    }
                }
                motionLayout.setState(k.f43883c);
            }
            if (Float.isNaN(this.f43878b)) {
                if (Float.isNaN(this.f43877a)) {
                    return;
                }
                motionLayout.setProgress(this.f43877a);
            } else {
                motionLayout.A(this.f43877a, this.f43878b);
                this.f43877a = Float.NaN;
                this.f43878b = Float.NaN;
                this.f43879c = -1;
                this.f43880d = -1;
            }
        }
    }

    public interface j {
        void a(int i12);

        void b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class k {

        /* renamed from: b, reason: collision with root package name */
        public static final k f43882b;

        /* renamed from: c, reason: collision with root package name */
        public static final k f43883c;

        /* renamed from: d, reason: collision with root package name */
        public static final k f43884d;

        /* renamed from: e, reason: collision with root package name */
        public static final k f43885e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ k[] f43886f;

        static {
            k kVar = new k("UNDEFINED", 0);
            f43882b = kVar;
            k kVar2 = new k("SETUP", 1);
            f43883c = kVar2;
            k kVar3 = new k("MOVING", 2);
            f43884d = kVar3;
            k kVar4 = new k("FINISHED", 3);
            f43885e = kVar4;
            f43886f = new k[]{kVar, kVar2, kVar3, kVar4};
        }

        public k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) f43886f.clone();
        }
    }

    public MotionLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43811d = null;
        this.f43813e = 0.0f;
        this.f43815f = -1;
        this.f43817g = -1;
        this.f43819h = -1;
        this.f43821i = 0;
        this.f43823j = 0;
        this.f43825k = true;
        this.f43827l = new HashMap<>();
        this.f43829m = 0L;
        this.f43831n = 1.0f;
        this.f43833o = 0.0f;
        this.f43835p = 0.0f;
        this.f43838r = 0.0f;
        this.f43840t = false;
        this.f43842v = 0;
        this.f43844x = false;
        this.f43845y = new androidx.constraintlayout.motion.utils.b();
        this.f43846z = new d();
        this.f43786D = false;
        this.f43791I = false;
        this.f43792J = null;
        this.f43793K = null;
        this.f43794L = null;
        this.f43795M = null;
        this.f43796N = 0;
        this.f43797O = -1L;
        this.f43798P = 0.0f;
        this.f43799Q = 0;
        this.f43800R = 0.0f;
        this.f43801S = false;
        this.f43812d0 = new androidx.constraintlayout.core.motion.utils.g();
        this.f43814e0 = false;
        this.f43818g0 = null;
        new HashMap();
        this.f43820h0 = new Rect();
        this.f43822i0 = false;
        this.f43824j0 = k.f43882b;
        this.f43826k0 = new f();
        this.f43828l0 = false;
        this.f43830m0 = new RectF();
        this.f43832n0 = null;
        this.f43834o0 = null;
        this.f43836p0 = new ArrayList<>();
        v(attributeSet);
    }

    public static Rect g(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        int iW2 = constraintWidget.w();
        Rect rect = motionLayout.f43820h0;
        rect.top = iW2;
        rect.left = constraintWidget.v();
        rect.right = constraintWidget.u() + rect.left;
        rect.bottom = constraintWidget.o() + rect.top;
        return rect;
    }

    public final void A(float f12, float f13) {
        if (!super.isAttachedToWindow()) {
            if (this.f43816f0 == null) {
                this.f43816f0 = new i();
            }
            i iVar = this.f43816f0;
            iVar.f43877a = f12;
            iVar.f43878b = f13;
            return;
        }
        setProgress(f12);
        setState(k.f43884d);
        this.f43813e = f13;
        if (f13 != 0.0f) {
            l(f13 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f12 == 0.0f || f12 == 1.0f) {
                return;
            }
            l(f12 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public final void B(int i12) {
        setState(k.f43883c);
        this.f43817g = i12;
        this.f43815f = -1;
        this.f43819h = -1;
        androidx.constraintlayout.widget.b bVar = this.mConstraintLayoutSpec;
        if (bVar != null) {
            float f12 = -1;
            bVar.b(f12, f12, i12);
        } else {
            w wVar = this.f43807b;
            if (wVar != null) {
                wVar.b(i12).c(this);
            }
        }
    }

    public final void C(int i12, int i13) {
        if (!super.isAttachedToWindow()) {
            if (this.f43816f0 == null) {
                this.f43816f0 = new i();
            }
            i iVar = this.f43816f0;
            iVar.f43879c = i12;
            iVar.f43880d = i13;
            return;
        }
        w wVar = this.f43807b;
        if (wVar != null) {
            this.f43815f = i12;
            this.f43819h = i13;
            wVar.o(i12, i13);
            this.f43826k0.e(this.f43807b.b(i12), this.f43807b.b(i13));
            z();
            this.f43835p = 0.0f;
            l(0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(float r16, float r17, int r18) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.D(float, float, int):void");
    }

    public final void E() {
        l(1.0f);
        this.f43818g0 = null;
    }

    public final void F(int i12) {
        androidx.constraintlayout.widget.k kVar;
        float f12;
        int iA2;
        if (!super.isAttachedToWindow()) {
            if (this.f43816f0 == null) {
                this.f43816f0 = new i();
            }
            this.f43816f0.f43880d = i12;
            return;
        }
        w wVar = this.f43807b;
        if (wVar != null && (kVar = wVar.f44054b) != null && (iA2 = kVar.a(-1, f12, this.f43817g, i12)) != -1) {
            i12 = iA2;
        }
        int i13 = this.f43817g;
        if (i13 == i12) {
            return;
        }
        if (this.f43815f == i12) {
            l(0.0f);
            return;
        }
        if (this.f43819h == i12) {
            l(1.0f);
            return;
        }
        this.f43819h = i12;
        if (i13 != -1) {
            C(i13, i12);
            l(1.0f);
            this.f43835p = 0.0f;
            E();
            return;
        }
        this.f43844x = false;
        this.f43838r = 1.0f;
        this.f43833o = 0.0f;
        this.f43835p = 0.0f;
        this.f43837q = getNanoTime();
        this.f43829m = getNanoTime();
        this.f43839s = false;
        this.f43809c = null;
        this.f43831n = this.f43807b.c() / 1000.0f;
        this.f43815f = -1;
        this.f43807b.o(-1, this.f43819h);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, p> map = this.f43827l;
        map.clear();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            map.put(childAt, new p(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.f43840t = true;
        androidx.constraintlayout.widget.d dVarB = this.f43807b.b(i12);
        f fVar = this.f43826k0;
        fVar.e(null, dVarB);
        z();
        fVar.a();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            p pVar = map.get(childAt2);
            if (pVar != null) {
                v vVar = pVar.f44010f;
                vVar.f44038d = 0.0f;
                vVar.f44039e = 0.0f;
                vVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                n nVar = pVar.f44012h;
                nVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                nVar.b(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f43794L != null) {
            for (int i16 = 0; i16 < childCount; i16++) {
                p pVar2 = map.get(getChildAt(i16));
                if (pVar2 != null) {
                    this.f43807b.f(pVar2);
                }
            }
            Iterator<q> it = this.f43794L.iterator();
            while (it.hasNext()) {
                it.next().s(this, map);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                p pVar3 = map.get(getChildAt(i17));
                if (pVar3 != null) {
                    pVar3.k(width, height, getNanoTime());
                }
            }
        } else {
            for (int i18 = 0; i18 < childCount; i18++) {
                p pVar4 = map.get(getChildAt(i18));
                if (pVar4 != null) {
                    this.f43807b.f(pVar4);
                    pVar4.k(width, height, getNanoTime());
                }
            }
        }
        w.b bVar = this.f43807b.f44055c;
        float f13 = bVar != null ? bVar.f44081i : 0.0f;
        if (f13 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i19 = 0; i19 < childCount; i19++) {
                v vVar2 = map.get(getChildAt(i19)).f44011g;
                float f14 = vVar2.f44041g + vVar2.f44040f;
                fMin = Math.min(fMin, f14);
                fMax = Math.max(fMax, f14);
            }
            for (int i22 = 0; i22 < childCount; i22++) {
                p pVar5 = map.get(getChildAt(i22));
                v vVar3 = pVar5.f44011g;
                float f15 = vVar3.f44040f;
                float f16 = vVar3.f44041g;
                pVar5.f44018n = 1.0f / (1.0f - f13);
                pVar5.f44017m = f13 - ((((f15 + f16) - fMin) * f13) / (fMax - fMin));
            }
        }
        this.f43833o = 0.0f;
        this.f43835p = 0.0f;
        this.f43840t = true;
        invalidate();
    }

    public final void G(int i12, androidx.constraintlayout.widget.d dVar) {
        w wVar = this.f43807b;
        if (wVar != null) {
            wVar.f44059g.put(i12, dVar);
        }
        this.f43826k0.e(this.f43807b.b(this.f43815f), this.f43807b.b(this.f43819h));
        z();
        if (this.f43817g == i12) {
            dVar.c(this);
        }
    }

    public final void H(int i12, View... viewArr) {
        w wVar = this.f43807b;
        if (wVar != null) {
            H h12 = wVar.f44069q;
            h12.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<F> it = h12.f43778b.iterator();
            while (it.hasNext()) {
                F next = it.next();
                if (next.f43743a == i12) {
                    for (View view : viewArr) {
                        if (next.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = h12.f43777a;
                        int currentState = motionLayout.getCurrentState();
                        if (next.f43747e == 2) {
                            next.a(h12, h12.f43777a, currentState, null, viewArr2);
                        } else if (currentState == -1) {
                            motionLayout.toString();
                        } else {
                            w wVar2 = motionLayout.f43807b;
                            androidx.constraintlayout.widget.d dVarB = wVar2 == null ? null : wVar2.b(currentState);
                            if (dVarB != null) {
                                next.a(h12, h12.f43777a, currentState, dVarB, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ac  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r35) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public int[] getConstraintSetIds() {
        w wVar = this.f43807b;
        if (wVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = wVar.f44059g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = sparseArray.keyAt(i12);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f43817g;
    }

    public ArrayList<w.b> getDefinedTransitions() {
        w wVar = this.f43807b;
        if (wVar == null) {
            return null;
        }
        return wVar.f44056d;
    }

    public C22738d getDesignTool() {
        if (this.f43783A == null) {
            this.f43783A = new C22738d();
        }
        return this.f43783A;
    }

    public int getEndState() {
        return this.f43819h;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f43835p;
    }

    public w getScene() {
        return this.f43807b;
    }

    public int getStartState() {
        return this.f43815f;
    }

    public float getTargetPosition() {
        return this.f43838r;
    }

    public Bundle getTransitionState() {
        if (this.f43816f0 == null) {
            this.f43816f0 = new i();
        }
        i iVar = this.f43816f0;
        MotionLayout motionLayout = MotionLayout.this;
        iVar.f43880d = motionLayout.f43819h;
        iVar.f43879c = motionLayout.f43815f;
        iVar.f43878b = motionLayout.getVelocity();
        iVar.f43877a = motionLayout.getProgress();
        i iVar2 = this.f43816f0;
        iVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", iVar2.f43877a);
        bundle.putFloat("motion.velocity", iVar2.f43878b);
        bundle.putInt("motion.StartState", iVar2.f43879c);
        bundle.putInt("motion.EndState", iVar2.f43880d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.f43807b != null) {
            this.f43831n = r0.c() / 1000.0f;
        }
        return (long) (this.f43831n * 1000.0f);
    }

    public float getVelocity() {
        return this.f43813e;
    }

    public final void l(float f12) {
        if (this.f43807b == null) {
            return;
        }
        float f13 = this.f43835p;
        float f14 = this.f43833o;
        if (f13 != f14 && this.f43839s) {
            this.f43835p = f14;
        }
        float f15 = this.f43835p;
        if (f15 == f12) {
            return;
        }
        this.f43844x = false;
        this.f43838r = f12;
        this.f43831n = r0.c() / 1000.0f;
        setProgress(this.f43838r);
        this.f43809c = null;
        this.f43811d = this.f43807b.e();
        this.f43839s = false;
        this.f43829m = getNanoTime();
        this.f43840t = true;
        this.f43833o = f15;
        this.f43835p = f15;
        invalidate();
    }

    public final void m() {
        w.b bVarS = s(R.id.collapse_transition);
        w wVar = this.f43807b;
        if (bVarS == wVar.f44055c) {
            Iterator it = wVar.i(this.f43817g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w.b bVar = (w.b) it.next();
                if (!bVar.f44087o) {
                    this.f43807b.f44055c = bVar;
                    break;
                }
            }
        }
        bVarS.f44087o = true;
    }

    public final void n(boolean z12) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            p pVar = this.f43827l.get(getChildAt(i12));
            if (pVar != null && "button".equals(C22737c.d(pVar.f44006b)) && pVar.f43997A != null) {
                int i13 = 0;
                while (true) {
                    m[] mVarArr = pVar.f43997A;
                    if (i13 < mVarArr.length) {
                        mVarArr[i13].g(pVar.f44006b, z12 ? -100.0f : 100.0f);
                        i13++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db A[PHI: r3
  0x00db: PHI (r3v16 float) = (r3v15 float), (r3v17 float), (r3v17 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(boolean r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.o(boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        w.b bVar;
        int i12;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        w wVar = this.f43807b;
        if (wVar != null && (i12 = this.f43817g) != -1) {
            androidx.constraintlayout.widget.d dVarB = wVar.b(i12);
            w wVar2 = this.f43807b;
            int i13 = 0;
            loop0: while (true) {
                SparseArray<androidx.constraintlayout.widget.d> sparseArray = wVar2.f44059g;
                if (i13 >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i13);
                SparseIntArray sparseIntArray = wVar2.f44061i;
                int i14 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i14 > 0) {
                    if (i14 == iKeyAt) {
                        break loop0;
                    }
                    int i15 = size - 1;
                    if (size < 0) {
                        break loop0;
                    }
                    i14 = sparseIntArray.get(i14);
                    size = i15;
                }
                wVar2.n(iKeyAt, this);
                i13++;
            }
            ArrayList<q> arrayList = this.f43794L;
            if (arrayList != null) {
                Iterator<q> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            if (dVarB != null) {
                dVarB.c(this);
            }
            this.f43815f = this.f43817g;
        }
        x();
        i iVar = this.f43816f0;
        if (iVar != null) {
            if (this.f43822i0) {
                post(new b());
                return;
            } else {
                iVar.a();
                return;
            }
        }
        w wVar3 = this.f43807b;
        if (wVar3 == null || (bVar = wVar3.f44055c) == null || bVar.f44086n != 4) {
            return;
        }
        E();
        setState(k.f43883c);
        setState(k.f43884d);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        this.f43814e0 = true;
        try {
            if (this.f43807b == null) {
                super.onLayout(z12, i12, i13, i14, i15);
                return;
            }
            int i16 = i14 - i12;
            int i17 = i15 - i13;
            if (this.f43784B != i16 || this.f43785C != i17) {
                z();
                o(true);
            }
            this.f43784B = i16;
            this.f43785C = i17;
        } finally {
            this.f43814e0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        boolean z12;
        if (this.f43807b == null) {
            super.onMeasure(i12, i13);
            return;
        }
        boolean z13 = true;
        boolean z14 = (this.f43821i == i12 && this.f43823j == i13) ? false : true;
        if (this.f43828l0) {
            this.f43828l0 = false;
            x();
            y();
            z14 = true;
        }
        if (this.mDirtyHierarchy) {
            z14 = true;
        }
        this.f43821i = i12;
        this.f43823j = i13;
        int iH2 = this.f43807b.h();
        w.b bVar = this.f43807b.f44055c;
        int i14 = bVar == null ? -1 : bVar.f44075c;
        f fVar = this.f43826k0;
        if ((!z14 && iH2 == fVar.f43872e && i14 == fVar.f43873f) || this.f43815f == -1) {
            if (z14) {
                super.onMeasure(i12, i13);
            }
            z12 = true;
        } else {
            super.onMeasure(i12, i13);
            fVar.e(this.f43807b.b(iH2), this.f43807b.b(i14));
            fVar.f();
            fVar.f43872e = iH2;
            fVar.f43873f = i14;
            z12 = false;
        }
        if (this.f43801S || z12) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iU2 = this.mLayoutWidget.u() + getPaddingRight() + getPaddingLeft();
            int iO2 = this.mLayoutWidget.o() + paddingBottom;
            int i15 = this.f43806a0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                iU2 = (int) ((this.f43810c0 * (this.f43804V - r1)) + this.f43802T);
                requestLayout();
            }
            int i16 = this.f43808b0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                iO2 = (int) ((this.f43810c0 * (this.f43805W - r2)) + this.f43803U);
                requestLayout();
            }
            setMeasuredDimension(iU2, iO2);
        }
        float fSignum = Math.signum(this.f43838r - this.f43835p);
        long nanoTime = getNanoTime();
        s sVar = this.f43809c;
        float interpolation = this.f43835p + (!(sVar instanceof androidx.constraintlayout.motion.utils.b) ? (((nanoTime - this.f43837q) * fSignum) * 1.0E-9f) / this.f43831n : 0.0f);
        if (this.f43839s) {
            interpolation = this.f43838r;
        }
        if ((fSignum <= 0.0f || interpolation < this.f43838r) && (fSignum > 0.0f || interpolation > this.f43838r)) {
            z13 = false;
        } else {
            interpolation = this.f43838r;
        }
        if (sVar != null && !z13) {
            interpolation = this.f43844x ? sVar.getInterpolation((nanoTime - this.f43829m) * 1.0E-9f) : sVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f43838r) || (fSignum <= 0.0f && interpolation <= this.f43838r)) {
            interpolation = this.f43838r;
        }
        this.f43810c0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f43811d;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            p pVar = this.f43827l.get(childAt);
            if (pVar != null) {
                pVar.h(interpolation, nanoTime2, childAt, this.f43812d0);
            }
        }
        if (this.f43801S) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@N View view, float f12, float f13, boolean z12) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@N View view, float f12, float f13) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // androidx.core.view.I
    public final void onNestedPreScroll(@N View view, int i12, int i13, @N int[] iArr, int i14) throws Resources.NotFoundException {
        w.b bVar;
        boolean z12;
        ?? r12;
        B b12;
        float f12;
        B b13;
        B b14;
        B b15;
        int i15;
        w wVar = this.f43807b;
        if (wVar == null || (bVar = wVar.f44055c) == null || (z12 = bVar.f44087o)) {
            return;
        }
        int i16 = -1;
        if (z12 || (b15 = bVar.f44084l) == null || (i15 = b15.f43720e) == -1 || view.getId() == i15) {
            w.b bVar2 = wVar.f44055c;
            if ((bVar2 == null || (b14 = bVar2.f44084l) == null) ? false : b14.f43736u) {
                B b16 = bVar.f44084l;
                if (b16 != null && (b16.f43738w & 4) != 0) {
                    i16 = i13;
                }
                float f13 = this.f43833o;
                if ((f13 == 1.0f || f13 == 0.0f) && view.canScrollVertically(i16)) {
                    return;
                }
            }
            B b17 = bVar.f44084l;
            if (b17 != null && (b17.f43738w & 1) != 0) {
                float f14 = i12;
                float f15 = i13;
                w.b bVar3 = wVar.f44055c;
                if (bVar3 == null || (b13 = bVar3.f44084l) == null) {
                    f12 = 0.0f;
                } else {
                    b13.f43733r.r(b13.f43719d, b13.f43733r.getProgress(), b13.f43723h, b13.f43722g, b13.f43729n);
                    float f16 = b13.f43726k;
                    float[] fArr = b13.f43729n;
                    if (f16 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f12 = (f14 * f16) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f12 = (f15 * b13.f43727l) / fArr[1];
                    }
                }
                float f17 = this.f43835p;
                if ((f17 <= 0.0f && f12 < 0.0f) || (f17 >= 1.0f && f12 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f18 = this.f43833o;
            long nanoTime = getNanoTime();
            float f19 = i12;
            this.f43787E = f19;
            float f22 = i13;
            this.f43788F = f22;
            this.f43790H = (float) ((nanoTime - this.f43789G) * 1.0E-9d);
            this.f43789G = nanoTime;
            w.b bVar4 = wVar.f44055c;
            if (bVar4 != null && (b12 = bVar4.f44084l) != null) {
                MotionLayout motionLayout = b12.f43733r;
                float progress = motionLayout.getProgress();
                if (!b12.f43728m) {
                    b12.f43728m = true;
                    motionLayout.setProgress(progress);
                }
                b12.f43733r.r(b12.f43719d, progress, b12.f43723h, b12.f43722g, b12.f43729n);
                float f23 = b12.f43726k;
                float[] fArr2 = b12.f43729n;
                if (Math.abs((b12.f43727l * fArr2[1]) + (f23 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f24 = b12.f43726k;
                float fMax = Math.max(Math.min(progress + (f24 != 0.0f ? (f19 * f24) / fArr2[0] : (f22 * b12.f43727l) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f18 != this.f43833o) {
                iArr[0] = i12;
                r12 = 1;
                iArr[1] = i13;
            } else {
                r12 = 1;
            }
            o(false);
            if (iArr[0] == 0 && iArr[r12] == 0) {
                return;
            }
            this.f43786D = r12;
        }
    }

    @Override // androidx.core.view.I
    public final void onNestedScroll(@N View view, int i12, int i13, int i14, int i15, int i16) {
    }

    @Override // androidx.core.view.I
    public final void onNestedScrollAccepted(@N View view, @N View view2, int i12, int i13) {
        this.f43789G = getNanoTime();
        this.f43790H = 0.0f;
        this.f43787E = 0.0f;
        this.f43788F = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i12) {
        B b12;
        w wVar = this.f43807b;
        if (wVar != null) {
            boolean zIsRtl = isRtl();
            wVar.f44068p = zIsRtl;
            w.b bVar = wVar.f44055c;
            if (bVar == null || (b12 = bVar.f44084l) == null) {
                return;
            }
            b12.c(zIsRtl);
        }
    }

    @Override // androidx.core.view.I
    public final boolean onStartNestedScroll(@N View view, @N View view2, int i12, int i13) {
        w.b bVar;
        B b12;
        w wVar = this.f43807b;
        return (wVar == null || (bVar = wVar.f44055c) == null || (b12 = bVar.f44084l) == null || (b12.f43738w & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.I
    public final void onStopNestedScroll(@N View view, int i12) throws Resources.NotFoundException {
        B b12;
        w wVar = this.f43807b;
        if (wVar != null) {
            float f12 = this.f43790H;
            if (f12 == 0.0f) {
                return;
            }
            float f13 = this.f43787E / f12;
            float f14 = this.f43788F / f12;
            w.b bVar = wVar.f44055c;
            if (bVar == null || (b12 = bVar.f44084l) == null) {
                return;
            }
            b12.f43728m = false;
            MotionLayout motionLayout = b12.f43733r;
            float progress = motionLayout.getProgress();
            b12.f43733r.r(b12.f43719d, progress, b12.f43723h, b12.f43722g, b12.f43729n);
            float f15 = b12.f43726k;
            float[] fArr = b12.f43729n;
            float f16 = f15 != 0.0f ? (f13 * f15) / fArr[0] : (f14 * b12.f43727l) / fArr[1];
            if (!Float.isNaN(f16)) {
                progress += f16 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z12 = progress != 1.0f;
                int i13 = b12.f43718c;
                if ((i13 != 3) && z12) {
                    motionLayout.D(((double) progress) >= 0.5d ? 1.0f : 0.0f, f16, i13);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r33) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof q) {
            q qVar = (q) view;
            if (this.f43795M == null) {
                this.f43795M = new CopyOnWriteArrayList<>();
            }
            this.f43795M.add(qVar);
            if (qVar.f44031j) {
                if (this.f43792J == null) {
                    this.f43792J = new ArrayList<>();
                }
                this.f43792J.add(qVar);
            }
            if (qVar.f44032k) {
                if (this.f43793K == null) {
                    this.f43793K = new ArrayList<>();
                }
                this.f43793K.add(qVar);
            }
            if (qVar instanceof androidx.constraintlayout.helper.widget.d) {
                if (this.f43794L == null) {
                    this.f43794L = new ArrayList<>();
                }
                this.f43794L.add(qVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<q> arrayList = this.f43792J;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<q> arrayList2 = this.f43793K;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p() {
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        CopyOnWriteArrayList<j> copyOnWriteArrayList2;
        if ((this.f43841u == null && ((copyOnWriteArrayList2 = this.f43795M) == null || copyOnWriteArrayList2.isEmpty())) || this.f43800R == this.f43833o) {
            return;
        }
        if (this.f43799Q != -1 && (copyOnWriteArrayList = this.f43795M) != null) {
            Iterator<j> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.f43799Q = -1;
        this.f43800R = this.f43833o;
        CopyOnWriteArrayList<j> copyOnWriteArrayList3 = this.f43795M;
        if (copyOnWriteArrayList3 != null) {
            Iterator<j> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i12) {
        this.mConstraintLayoutSpec = null;
    }

    public final void q() {
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        if ((this.f43841u != null || ((copyOnWriteArrayList = this.f43795M) != null && !copyOnWriteArrayList.isEmpty())) && this.f43799Q == -1) {
            this.f43799Q = this.f43817g;
            ArrayList<Integer> arrayList = this.f43836p0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) androidx.appcompat.app.r.j(1, arrayList)).intValue() : -1;
            int i12 = this.f43817g;
            if (iIntValue != i12 && i12 != -1) {
                arrayList.add(Integer.valueOf(i12));
            }
        }
        y();
        J11.c cVar = this.f43818g0;
        if (cVar != null) {
            cVar.run();
        }
    }

    public final void r(int i12, float f12, float f13, float f14, float[] fArr) throws Resources.NotFoundException {
        double[] dArr;
        View viewById = getViewById(i12);
        p pVar = this.f43827l.get(viewById);
        if (pVar == null) {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i12);
            return;
        }
        float[] fArr2 = pVar.f44026v;
        float fA2 = pVar.a(fArr2, f12);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = pVar.f44014j;
        int i13 = 0;
        if (bVarArr != null) {
            double d12 = fA2;
            bVarArr[0].f(d12, pVar.f44021q);
            pVar.f44014j[0].c(d12, pVar.f44020p);
            float f15 = fArr2[0];
            while (true) {
                dArr = pVar.f44021q;
                if (i13 >= dArr.length) {
                    break;
                }
                dArr[i13] = dArr[i13] * f15;
                i13++;
            }
            androidx.constraintlayout.core.motion.utils.a aVar = pVar.f44015k;
            if (aVar != null) {
                double[] dArr2 = pVar.f44020p;
                if (dArr2.length > 0) {
                    aVar.c(d12, dArr2);
                    pVar.f44015k.f(d12, pVar.f44021q);
                    int[] iArr = pVar.f44019o;
                    double[] dArr3 = pVar.f44021q;
                    double[] dArr4 = pVar.f44020p;
                    pVar.f44010f.getClass();
                    v.e(f13, f14, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = pVar.f44019o;
                double[] dArr5 = pVar.f44020p;
                pVar.f44010f.getClass();
                v.e(f13, f14, fArr, iArr2, dArr, dArr5);
            }
        } else {
            v vVar = pVar.f44011g;
            float f16 = vVar.f44040f;
            v vVar2 = pVar.f44010f;
            float f17 = f16 - vVar2.f44040f;
            float f18 = vVar.f44041g - vVar2.f44041g;
            float f19 = vVar.f44042h - vVar2.f44042h;
            float f22 = (vVar.f44043i - vVar2.f44043i) + f18;
            fArr[0] = ((f19 + f17) * f13) + ((1.0f - f13) * f17);
            fArr[1] = (f22 * f14) + ((1.0f - f14) * f18);
        }
        viewById.getY();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        w wVar;
        w.b bVar;
        if (!this.f43801S && this.f43817g == -1 && (wVar = this.f43807b) != null && (bVar = wVar.f44055c) != null) {
            int i12 = bVar.f44089q;
            if (i12 == 0) {
                return;
            }
            if (i12 == 2) {
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    this.f43827l.get(getChildAt(i13)).f44008d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final w.b s(int i12) {
        Iterator<w.b> it = this.f43807b.f44056d.iterator();
        while (it.hasNext()) {
            w.b next = it.next();
            if (next.f44073a == i12) {
                return next;
            }
        }
        return null;
    }

    public void setDebugMode(int i12) {
        this.f43842v = i12;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z12) {
        this.f43822i0 = z12;
    }

    public void setInteractionEnabled(boolean z12) {
        this.f43825k = z12;
    }

    public void setInterpolatedProgress(float f12) {
        if (this.f43807b != null) {
            setState(k.f43884d);
            Interpolator interpolatorE = this.f43807b.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(f12));
                return;
            }
        }
        setProgress(f12);
    }

    public void setOnHide(float f12) {
        ArrayList<q> arrayList = this.f43793K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f43793K.get(i12).setProgress(f12);
            }
        }
    }

    public void setOnShow(float f12) {
        ArrayList<q> arrayList = this.f43792J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f43792J.get(i12).setProgress(f12);
            }
        }
    }

    public void setProgress(float f12) {
        if (f12 >= 0.0f) {
            int i12 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        }
        if (!super.isAttachedToWindow()) {
            if (this.f43816f0 == null) {
                this.f43816f0 = new i();
            }
            this.f43816f0.f43877a = f12;
            return;
        }
        k kVar = k.f43885e;
        k kVar2 = k.f43884d;
        if (f12 <= 0.0f) {
            if (this.f43835p == 1.0f && this.f43817g == this.f43819h) {
                setState(kVar2);
            }
            this.f43817g = this.f43815f;
            if (this.f43835p == 0.0f) {
                setState(kVar);
            }
        } else if (f12 >= 1.0f) {
            if (this.f43835p == 0.0f && this.f43817g == this.f43815f) {
                setState(kVar2);
            }
            this.f43817g = this.f43819h;
            if (this.f43835p == 1.0f) {
                setState(kVar);
            }
        } else {
            this.f43817g = -1;
            setState(kVar2);
        }
        if (this.f43807b == null) {
            return;
        }
        this.f43839s = true;
        this.f43838r = f12;
        this.f43833o = f12;
        this.f43837q = -1L;
        this.f43829m = -1L;
        this.f43809c = null;
        this.f43840t = true;
        invalidate();
    }

    public void setScene(w wVar) {
        B b12;
        this.f43807b = wVar;
        boolean zIsRtl = isRtl();
        wVar.f44068p = zIsRtl;
        w.b bVar = wVar.f44055c;
        if (bVar != null && (b12 = bVar.f44084l) != null) {
            b12.c(zIsRtl);
        }
        z();
    }

    public void setStartState(int i12) {
        if (super.isAttachedToWindow()) {
            this.f43817g = i12;
            return;
        }
        if (this.f43816f0 == null) {
            this.f43816f0 = new i();
        }
        i iVar = this.f43816f0;
        iVar.f43879c = i12;
        iVar.f43880d = i12;
    }

    public void setState(k kVar) {
        k kVar2 = k.f43885e;
        if (kVar == kVar2 && this.f43817g == -1) {
            return;
        }
        k kVar3 = this.f43824j0;
        this.f43824j0 = kVar;
        k kVar4 = k.f43884d;
        if (kVar3 == kVar4 && kVar == kVar4) {
            p();
        }
        int iOrdinal = kVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && kVar == kVar2) {
                q();
                return;
            }
            return;
        }
        if (kVar == kVar4) {
            p();
        }
        if (kVar == kVar2) {
            q();
        }
    }

    public void setTransition(int i12) {
        if (this.f43807b != null) {
            w.b bVarS = s(i12);
            this.f43815f = bVarS.f44076d;
            this.f43819h = bVarS.f44075c;
            if (!super.isAttachedToWindow()) {
                if (this.f43816f0 == null) {
                    this.f43816f0 = new i();
                }
                i iVar = this.f43816f0;
                iVar.f43879c = this.f43815f;
                iVar.f43880d = this.f43819h;
                return;
            }
            int i13 = this.f43817g;
            float f12 = i13 == this.f43815f ? 0.0f : i13 == this.f43819h ? 1.0f : Float.NaN;
            w wVar = this.f43807b;
            wVar.f44055c = bVarS;
            B b12 = bVarS.f44084l;
            if (b12 != null) {
                b12.c(wVar.f44068p);
            }
            this.f43826k0.e(this.f43807b.b(this.f43815f), this.f43807b.b(this.f43819h));
            z();
            if (this.f43835p != f12) {
                if (f12 == 0.0f) {
                    n(true);
                    this.f43807b.b(this.f43815f).c(this);
                } else if (f12 == 1.0f) {
                    n(false);
                    this.f43807b.b(this.f43819h).c(this);
                }
            }
            this.f43835p = Float.isNaN(f12) ? 0.0f : f12;
            if (!Float.isNaN(f12)) {
                setProgress(f12);
            } else {
                C22737c.b();
                l(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i12) {
        w wVar = this.f43807b;
        if (wVar == null) {
            return;
        }
        w.b bVar = wVar.f44055c;
        if (bVar != null) {
            bVar.f44080h = Math.max(i12, 8);
        } else {
            wVar.f44062j = i12;
        }
    }

    public void setTransitionListener(j jVar) {
        this.f43841u = jVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f43816f0 == null) {
            this.f43816f0 = new i();
        }
        i iVar = this.f43816f0;
        iVar.getClass();
        iVar.f43877a = bundle.getFloat("motion.progress");
        iVar.f43878b = bundle.getFloat("motion.velocity");
        iVar.f43879c = bundle.getInt("motion.StartState");
        iVar.f43880d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f43816f0.a();
        }
    }

    public final void t(androidx.constraintlayout.utils.widget.f fVar, float f12, float f13) {
        androidx.constraintlayout.motion.utils.c cVar;
        float interpolation = this.f43835p;
        if (this.f43809c != null) {
            Math.signum(this.f43838r - interpolation);
            this.f43809c.getInterpolation(this.f43835p + 1.0E-5f);
            interpolation = this.f43809c.getInterpolation(this.f43835p);
        }
        s sVar = this.f43809c;
        if (sVar != null) {
            sVar.a();
        }
        p pVar = this.f43827l.get(fVar);
        fVar.getWidth();
        fVar.getHeight();
        float[] fArr = pVar.f44026v;
        float fA2 = pVar.a(fArr, interpolation);
        HashMap<String, androidx.constraintlayout.motion.utils.d> map = pVar.f44029y;
        androidx.constraintlayout.motion.utils.d dVar = map == null ? null : map.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map2 = pVar.f44029y;
        androidx.constraintlayout.motion.utils.d dVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map3 = pVar.f44029y;
        androidx.constraintlayout.motion.utils.d dVar3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map4 = pVar.f44029y;
        androidx.constraintlayout.motion.utils.d dVar4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> map5 = pVar.f44029y;
        androidx.constraintlayout.motion.utils.d dVar5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map6 = pVar.f44030z;
        androidx.constraintlayout.motion.utils.c cVar2 = map6 == null ? null : map6.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map7 = pVar.f44030z;
        androidx.constraintlayout.motion.utils.c cVar3 = map7 == null ? null : map7.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map8 = pVar.f44030z;
        androidx.constraintlayout.motion.utils.c cVar4 = map8 == null ? null : map8.get("rotation");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map9 = pVar.f44030z;
        androidx.constraintlayout.motion.utils.c cVar5 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> map10 = pVar.f44030z;
        androidx.constraintlayout.motion.utils.c cVar6 = map10 == null ? null : map10.get("scaleY");
        new androidx.constraintlayout.core.motion.utils.y();
        if (dVar3 != null) {
            cVar = cVar2;
            dVar3.f43327a.e(fA2);
            dVar3.a(fA2);
        } else {
            cVar = cVar2;
        }
        if (dVar != null) {
            dVar.f43327a.e(fA2);
        }
        if (dVar2 != null) {
            dVar2.f43327a.e(fA2);
        }
        if (dVar4 != null) {
            dVar4.f43327a.e(fA2);
        }
        if (dVar5 != null) {
            dVar5.f43327a.e(fA2);
        }
        if (cVar4 != null) {
            cVar4.b(fA2);
        }
        if (cVar != null) {
            cVar.b(fA2);
        }
        if (cVar3 != null) {
            cVar3.b(fA2);
        }
        if (cVar5 != null) {
            cVar5.b(fA2);
        }
        if (cVar6 != null) {
            cVar6.b(fA2);
        }
        androidx.constraintlayout.core.motion.utils.a aVar = pVar.f44015k;
        if (aVar != null) {
            double[] dArr = pVar.f44020p;
            if (dArr.length > 0) {
                double d12 = fA2;
                aVar.c(d12, dArr);
                pVar.f44015k.f(d12, pVar.f44021q);
                int[] iArr = pVar.f44019o;
                double[] dArr2 = pVar.f44021q;
                double[] dArr3 = pVar.f44020p;
                pVar.f44010f.getClass();
                v.e(f12, f13, null, iArr, dArr2, dArr3);
            }
            throw null;
        }
        if (pVar.f44014j == null) {
            float f14 = pVar.f44011g.f44040f;
            float f15 = pVar.f44010f.f44040f;
            throw null;
        }
        int i12 = 0;
        double dA2 = pVar.a(fArr, fA2);
        pVar.f44014j[0].f(dA2, pVar.f44021q);
        pVar.f44014j[0].c(dA2, pVar.f44020p);
        float f16 = fArr[0];
        while (true) {
            double[] dArr4 = pVar.f44021q;
            if (i12 >= dArr4.length) {
                int[] iArr2 = pVar.f44019o;
                double[] dArr5 = pVar.f44020p;
                pVar.f44010f.getClass();
                v.e(f12, f13, null, iArr2, dArr4, dArr5);
                throw null;
            }
            dArr4[i12] = dArr4[i12] * f16;
            i12++;
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C22737c.c(this.f43815f, context) + "->" + C22737c.c(this.f43819h, context) + " (pos:" + this.f43835p + " Dpos/Dt:" + this.f43813e;
    }

    public final boolean u(float f12, float f13, View view, MotionEvent motionEvent) {
        boolean z12;
        boolean zOnTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (u((r3.getLeft() + f12) - view.getScrollX(), (r3.getTop() + f13) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        if (!z12) {
            RectF rectF = this.f43830m0;
            rectF.set(f12, f13, (view.getRight() + f12) - view.getLeft(), (view.getBottom() + f13) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f14 = -f12;
                float f15 = -f13;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f14, f15);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f14, -f15);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f14, f15);
                    if (this.f43834o0 == null) {
                        this.f43834o0 = new Matrix();
                    }
                    matrix.invert(this.f43834o0);
                    motionEventObtain.transform(this.f43834o0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z12;
    }

    public final void v(AttributeSet attributeSet) {
        w wVar;
        w wVar2;
        f43782q0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44417n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z12 = true;
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 2) {
                    this.f43807b = new w(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f43817g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f43838r = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f43840t = true;
                } else if (index == 0) {
                    z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                } else if (index == 5) {
                    if (this.f43842v == 0) {
                        this.f43842v = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f43842v = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z12) {
                this.f43807b = null;
            }
        }
        if (this.f43842v != 0 && (wVar2 = this.f43807b) != null) {
            int iH2 = wVar2.h();
            w wVar3 = this.f43807b;
            androidx.constraintlayout.widget.d dVarB = wVar3.b(wVar3.h());
            C22737c.c(iH2, getContext());
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (dVarB.q(childAt.getId()) == null) {
                    C22737c.d(childAt);
                }
            }
            Integer[] numArr = (Integer[]) dVarB.f44264f.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                iArr[i14] = numArr[i14].intValue();
            }
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                C22737c.c(i16, getContext());
                findViewById(iArr[i15]);
                int i17 = dVarB.p(i16).f44269e.f44318d;
                int i18 = dVarB.p(i16).f44269e.f44316c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<w.b> it = this.f43807b.f44056d.iterator();
            while (it.hasNext()) {
                w.b next = it.next();
                w.b bVar = this.f43807b.f44055c;
                int i19 = next.f44076d;
                int i22 = next.f44075c;
                C22737c.c(i19, getContext());
                C22737c.c(i22, getContext());
                sparseIntArray.get(i19);
                sparseIntArray2.get(i22);
                sparseIntArray.put(i19, i22);
                sparseIntArray2.put(i22, i19);
                this.f43807b.b(i19);
                this.f43807b.b(i22);
            }
        }
        if (this.f43817g != -1 || (wVar = this.f43807b) == null) {
            return;
        }
        this.f43817g = wVar.h();
        this.f43815f = this.f43807b.h();
        w.b bVar2 = this.f43807b.f44055c;
        this.f43819h = bVar2 != null ? bVar2.f44075c : -1;
    }

    public final void w(int i12) {
        if (!super.isAttachedToWindow()) {
            this.f43817g = i12;
        }
        if (this.f43815f == i12) {
            setProgress(0.0f);
        } else if (this.f43819h == i12) {
            setProgress(1.0f);
        } else {
            C(i12, i12);
        }
    }

    public final void x() {
        w.b bVar;
        B b12;
        View viewFindViewById;
        View viewFindViewById2;
        w wVar = this.f43807b;
        if (wVar == null) {
            return;
        }
        if (wVar.a(this.f43817g, this)) {
            requestLayout();
            return;
        }
        int i12 = this.f43817g;
        KeyEvent.Callback callback = null;
        if (i12 != -1) {
            w wVar2 = this.f43807b;
            ArrayList<w.b> arrayList = wVar2.f44056d;
            Iterator<w.b> it = arrayList.iterator();
            while (it.hasNext()) {
                w.b next = it.next();
                if (next.f44085m.size() > 0) {
                    Iterator<w.b.a> it2 = next.f44085m.iterator();
                    while (it2.hasNext()) {
                        int i13 = it2.next().f44092c;
                        if (i13 != -1 && (viewFindViewById2 = findViewById(i13)) != null) {
                            viewFindViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            ArrayList<w.b> arrayList2 = wVar2.f44058f;
            Iterator<w.b> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                w.b next2 = it3.next();
                if (next2.f44085m.size() > 0) {
                    Iterator<w.b.a> it4 = next2.f44085m.iterator();
                    while (it4.hasNext()) {
                        int i14 = it4.next().f44092c;
                        if (i14 != -1 && (viewFindViewById = findViewById(i14)) != null) {
                            viewFindViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            Iterator<w.b> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                w.b next3 = it5.next();
                if (next3.f44085m.size() > 0) {
                    Iterator<w.b.a> it6 = next3.f44085m.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this, i12, next3);
                    }
                }
            }
            Iterator<w.b> it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                w.b next4 = it7.next();
                if (next4.f44085m.size() > 0) {
                    Iterator<w.b.a> it8 = next4.f44085m.iterator();
                    while (it8.hasNext()) {
                        it8.next().a(this, i12, next4);
                    }
                }
            }
        }
        if (!this.f43807b.p() || (bVar = this.f43807b.f44055c) == null || (b12 = bVar.f44084l) == null) {
            return;
        }
        int i15 = b12.f43719d;
        if (i15 != -1) {
            MotionLayout motionLayout = b12.f43733r;
            KeyEvent.Callback callbackFindViewById = motionLayout.findViewById(i15);
            if (callbackFindViewById == null) {
                C22737c.c(b12.f43719d, motionLayout.getContext());
            }
            callback = callbackFindViewById;
        }
        if (callback instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) callback;
            nestedScrollView.setOnTouchListener(new z());
            nestedScrollView.setOnScrollChangeListener(new A());
        }
    }

    public final void y() {
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        if (this.f43841u == null && ((copyOnWriteArrayList = this.f43795M) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f43836p0;
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            j jVar = this.f43841u;
            if (jVar != null) {
                jVar.a(next.intValue());
            }
            CopyOnWriteArrayList<j> copyOnWriteArrayList2 = this.f43795M;
            if (copyOnWriteArrayList2 != null) {
                Iterator<j> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().a(next.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public final void z() {
        this.f43826k0.f();
        invalidate();
    }

    @Override // androidx.core.view.J
    public final void onNestedScroll(@N View view, int i12, int i13, int i14, int i15, int i16, int[] iArr) {
        if (this.f43786D || i12 != 0 || i13 != 0) {
            iArr[0] = iArr[0] + i14;
            iArr[1] = iArr[1] + i15;
        }
        this.f43786D = false;
    }

    public void setTransition(w.b bVar) {
        B b12;
        w wVar = this.f43807b;
        wVar.f44055c = bVar;
        if (bVar != null && (b12 = bVar.f44084l) != null) {
            b12.c(wVar.f44068p);
        }
        setState(k.f43883c);
        int i12 = this.f43817g;
        w.b bVar2 = this.f43807b.f44055c;
        if (i12 == (bVar2 == null ? -1 : bVar2.f44075c)) {
            this.f43835p = 1.0f;
            this.f43833o = 1.0f;
            this.f43838r = 1.0f;
        } else {
            this.f43835p = 0.0f;
            this.f43833o = 0.0f;
            this.f43838r = 0.0f;
        }
        this.f43837q = (bVar.f44090r & 1) != 0 ? -1L : getNanoTime();
        int iH2 = this.f43807b.h();
        w wVar2 = this.f43807b;
        w.b bVar3 = wVar2.f44055c;
        int i13 = bVar3 != null ? bVar3.f44075c : -1;
        if (iH2 == this.f43815f && i13 == this.f43819h) {
            return;
        }
        this.f43815f = iH2;
        this.f43819h = i13;
        wVar2.o(iH2, i13);
        androidx.constraintlayout.widget.d dVarB = this.f43807b.b(this.f43815f);
        androidx.constraintlayout.widget.d dVarB2 = this.f43807b.b(this.f43819h);
        f fVar = this.f43826k0;
        fVar.e(dVarB, dVarB2);
        int i14 = this.f43815f;
        int i15 = this.f43819h;
        fVar.f43872e = i14;
        fVar.f43873f = i15;
        fVar.f();
        z();
    }

    public MotionLayout(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f43811d = null;
        this.f43813e = 0.0f;
        this.f43815f = -1;
        this.f43817g = -1;
        this.f43819h = -1;
        this.f43821i = 0;
        this.f43823j = 0;
        this.f43825k = true;
        this.f43827l = new HashMap<>();
        this.f43829m = 0L;
        this.f43831n = 1.0f;
        this.f43833o = 0.0f;
        this.f43835p = 0.0f;
        this.f43838r = 0.0f;
        this.f43840t = false;
        this.f43842v = 0;
        this.f43844x = false;
        this.f43845y = new androidx.constraintlayout.motion.utils.b();
        this.f43846z = new d();
        this.f43786D = false;
        this.f43791I = false;
        this.f43792J = null;
        this.f43793K = null;
        this.f43794L = null;
        this.f43795M = null;
        this.f43796N = 0;
        this.f43797O = -1L;
        this.f43798P = 0.0f;
        this.f43799Q = 0;
        this.f43800R = 0.0f;
        this.f43801S = false;
        this.f43812d0 = new androidx.constraintlayout.core.motion.utils.g();
        this.f43814e0 = false;
        this.f43818g0 = null;
        new HashMap();
        this.f43820h0 = new Rect();
        this.f43822i0 = false;
        this.f43824j0 = k.f43882b;
        this.f43826k0 = new f();
        this.f43828l0 = false;
        this.f43830m0 = new RectF();
        this.f43832n0 = null;
        this.f43834o0 = null;
        this.f43836p0 = new ArrayList<>();
        v(attributeSet);
    }
}
