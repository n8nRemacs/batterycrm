package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.l;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: CircularFlow.java */
/* loaded from: classes.dex */
public class b extends l {

    /* renamed from: v, reason: collision with root package name */
    public static int f43667v;

    /* renamed from: w, reason: collision with root package name */
    public static float f43668w;

    /* renamed from: l, reason: collision with root package name */
    public ConstraintLayout f43669l;

    /* renamed from: m, reason: collision with root package name */
    public int f43670m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f43671n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f43672o;

    /* renamed from: p, reason: collision with root package name */
    public int f43673p;

    /* renamed from: q, reason: collision with root package name */
    public int f43674q;

    /* renamed from: r, reason: collision with root package name */
    public String f43675r;

    /* renamed from: s, reason: collision with root package name */
    public String f43676s;

    /* renamed from: t, reason: collision with root package name */
    public Float f43677t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f43678u;

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i12 = 0;
        this.f43674q = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i12);
            if (iIndexOf == -1) {
                t(str.substring(i12).trim());
                return;
            } else {
                t(str.substring(i12, iIndexOf).trim());
                i12 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i12 = 0;
        this.f43673p = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i12);
            if (iIndexOf == -1) {
                u(str.substring(i12).trim());
                return;
            } else {
                u(str.substring(i12, iIndexOf).trim());
                i12 = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f43671n, this.f43674q);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f43672o, this.f43673p);
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public final void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 33) {
                    this.f43670m = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f43675r = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f43676s = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f43668w));
                    this.f43677t = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == 31) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f43667v));
                    this.f43678u = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f43675r;
        if (str != null) {
            this.f43671n = new float[1];
            setAngles(str);
        }
        String str2 = this.f43676s;
        if (str2 != null) {
            this.f43672o = new int[1];
            setRadius(str2);
        }
        Float f12 = this.f43677t;
        if (f12 != null) {
            setDefaultAngle(f12.floatValue());
        }
        Integer num = this.f43678u;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f43669l = (ConstraintLayout) getParent();
        for (int i12 = 0; i12 < this.f44234c; i12++) {
            View viewById = this.f43669l.getViewById(this.f44233b[i12]);
            if (viewById != null) {
                int i13 = f43667v;
                float f13 = f43668w;
                int[] iArr = this.f43672o;
                HashMap<Integer, String> map = this.f44240i;
                if (iArr == null || i12 >= iArr.length) {
                    Integer num2 = this.f43678u;
                    if (num2 == null || num2.intValue() == -1) {
                        map.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f43673p++;
                        if (this.f43672o == null) {
                            this.f43672o = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f43672o = radius;
                        radius[this.f43673p - 1] = i13;
                    }
                } else {
                    i13 = iArr[i12];
                }
                float[] fArr = this.f43671n;
                if (fArr == null || i12 >= fArr.length) {
                    Float f14 = this.f43677t;
                    if (f14 == null || f14.floatValue() == -1.0f) {
                        map.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f43674q++;
                        if (this.f43671n == null) {
                            this.f43671n = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f43671n = angles;
                        angles[this.f43674q - 1] = f13;
                    }
                } else {
                    f13 = fArr[i12];
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) viewById.getLayoutParams();
                bVar.f44215s = f13;
                bVar.f44211q = this.f43670m;
                bVar.f44213r = i13;
                viewById.setLayoutParams(bVar);
            }
        }
        f();
    }

    public void setDefaultAngle(float f12) {
        f43668w = f12;
    }

    public void setDefaultRadius(int i12) {
        f43667v = i12;
    }

    public final void t(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f44235d == null || (fArr = this.f43671n) == null) {
            return;
        }
        if (this.f43674q + 1 > fArr.length) {
            this.f43671n = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f43671n[this.f43674q] = Integer.parseInt(str);
        this.f43674q++;
    }

    public final void u(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f44235d) == null || (iArr = this.f43672o) == null) {
            return;
        }
        if (this.f43673p + 1 > iArr.length) {
            this.f43672o = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f43672o[this.f43673p] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f43673p++;
    }
}
