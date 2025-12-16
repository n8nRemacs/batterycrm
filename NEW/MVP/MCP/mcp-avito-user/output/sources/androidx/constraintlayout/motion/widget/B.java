package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.h;

/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
class B {

    /* renamed from: E, reason: collision with root package name */
    public static final float[][] f43710E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: F, reason: collision with root package name */
    public static final float[][] f43711F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A, reason: collision with root package name */
    public final float f43712A;

    /* renamed from: B, reason: collision with root package name */
    public final float f43713B;

    /* renamed from: C, reason: collision with root package name */
    public final int f43714C;

    /* renamed from: D, reason: collision with root package name */
    public final int f43715D;

    /* renamed from: a, reason: collision with root package name */
    public final int f43716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43718c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43720e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43721f;

    /* renamed from: g, reason: collision with root package name */
    public float f43722g;

    /* renamed from: h, reason: collision with root package name */
    public float f43723h;

    /* renamed from: i, reason: collision with root package name */
    public final int f43724i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f43725j;

    /* renamed from: k, reason: collision with root package name */
    public float f43726k;

    /* renamed from: l, reason: collision with root package name */
    public float f43727l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43728m = false;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f43729n = new float[2];

    /* renamed from: o, reason: collision with root package name */
    public final int[] f43730o = new int[2];

    /* renamed from: p, reason: collision with root package name */
    public float f43731p;

    /* renamed from: q, reason: collision with root package name */
    public float f43732q;

    /* renamed from: r, reason: collision with root package name */
    public final MotionLayout f43733r;

    /* renamed from: s, reason: collision with root package name */
    public final float f43734s;

    /* renamed from: t, reason: collision with root package name */
    public final float f43735t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f43736u;

    /* renamed from: v, reason: collision with root package name */
    public final float f43737v;

    /* renamed from: w, reason: collision with root package name */
    public final int f43738w;

    /* renamed from: x, reason: collision with root package name */
    public final float f43739x;

    /* renamed from: y, reason: collision with root package name */
    public final float f43740y;

    /* renamed from: z, reason: collision with root package name */
    public final float f43741z;

    public B(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f43716a = 0;
        this.f43717b = 0;
        this.f43718c = 0;
        this.f43719d = -1;
        this.f43720e = -1;
        this.f43721f = -1;
        this.f43722g = 0.5f;
        this.f43723h = 0.5f;
        this.f43724i = -1;
        this.f43725j = false;
        this.f43726k = 0.0f;
        this.f43727l = 1.0f;
        this.f43734s = 4.0f;
        this.f43735t = 1.2f;
        this.f43736u = true;
        this.f43737v = 1.0f;
        this.f43738w = 0;
        this.f43739x = 10.0f;
        this.f43740y = 10.0f;
        this.f43741z = 1.0f;
        this.f43712A = Float.NaN;
        this.f43713B = Float.NaN;
        this.f43714C = 0;
        this.f43715D = 0;
        this.f43733r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h.m.f44420q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 16) {
                this.f43719d = typedArrayObtainStyledAttributes.getResourceId(index, this.f43719d);
            } else if (index == 17) {
                int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f43716a);
                this.f43716a = i13;
                float[] fArr = f43710E[i13];
                this.f43723h = fArr[0];
                this.f43722g = fArr[1];
            } else if (index == 1) {
                int i14 = typedArrayObtainStyledAttributes.getInt(index, this.f43717b);
                this.f43717b = i14;
                if (i14 < 6) {
                    float[] fArr2 = f43711F[i14];
                    this.f43726k = fArr2[0];
                    this.f43727l = fArr2[1];
                } else {
                    this.f43727l = Float.NaN;
                    this.f43726k = Float.NaN;
                    this.f43725j = true;
                }
            } else if (index == 6) {
                this.f43734s = typedArrayObtainStyledAttributes.getFloat(index, this.f43734s);
            } else if (index == 5) {
                this.f43735t = typedArrayObtainStyledAttributes.getFloat(index, this.f43735t);
            } else if (index == 7) {
                this.f43736u = typedArrayObtainStyledAttributes.getBoolean(index, this.f43736u);
            } else if (index == 2) {
                this.f43737v = typedArrayObtainStyledAttributes.getFloat(index, this.f43737v);
            } else if (index == 3) {
                this.f43739x = typedArrayObtainStyledAttributes.getFloat(index, this.f43739x);
            } else if (index == 18) {
                this.f43720e = typedArrayObtainStyledAttributes.getResourceId(index, this.f43720e);
            } else if (index == 9) {
                this.f43718c = typedArrayObtainStyledAttributes.getInt(index, this.f43718c);
            } else if (index == 8) {
                this.f43738w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f43721f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f43724i = typedArrayObtainStyledAttributes.getResourceId(index, this.f43724i);
            } else if (index == 12) {
                this.f43740y = typedArrayObtainStyledAttributes.getFloat(index, this.f43740y);
            } else if (index == 13) {
                this.f43741z = typedArrayObtainStyledAttributes.getFloat(index, this.f43741z);
            } else if (index == 14) {
                this.f43712A = typedArrayObtainStyledAttributes.getFloat(index, this.f43712A);
            } else if (index == 15) {
                this.f43713B = typedArrayObtainStyledAttributes.getFloat(index, this.f43713B);
            } else if (index == 11) {
                this.f43714C = typedArrayObtainStyledAttributes.getInt(index, this.f43714C);
            } else if (index == 0) {
                this.f43715D = typedArrayObtainStyledAttributes.getInt(index, this.f43715D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i12 = this.f43721f;
        if (i12 == -1 || (viewFindViewById = viewGroup.findViewById(i12)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i12 = this.f43720e;
        if (i12 == -1 || (viewFindViewById = viewGroup.findViewById(i12)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z12) {
        float[][] fArr = f43710E;
        float[][] fArr2 = f43711F;
        if (z12) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f43716a];
        this.f43723h = fArr3[0];
        this.f43722g = fArr3[1];
        int i12 = this.f43717b;
        if (i12 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i12];
        this.f43726k = fArr4[0];
        this.f43727l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f43726k)) {
            return "rotation";
        }
        return this.f43726k + " , " + this.f43727l;
    }
}
