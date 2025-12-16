package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;

/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public class j extends k {

    /* renamed from: f, reason: collision with root package name */
    public String f43929f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f43930g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f43931h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f43932i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f43933j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f43934k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f43935l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f43936m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f43937n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public int f43938o = 0;

    /* compiled from: KeyPosition.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f43939a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43939a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    /* renamed from: a */
    public final AbstractC22740f clone() {
        j jVar = new j();
        super.b(this);
        jVar.f43929f = this.f43929f;
        jVar.f43930g = this.f43930g;
        jVar.f43931h = this.f43931h;
        jVar.f43932i = this.f43932i;
        jVar.f43933j = Float.NaN;
        jVar.f43934k = this.f43934k;
        jVar.f43935l = this.f43935l;
        jVar.f43936m = this.f43936m;
        jVar.f43937n = this.f43937n;
        return jVar;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44411h);
        SparseIntArray sparseIntArray = a.f43939a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            SparseIntArray sparseIntArray2 = a.f43939a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f43782q0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f43888b);
                        this.f43888b = resourceId;
                        if (resourceId == -1) {
                            this.f43889c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f43889c = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f43888b = typedArrayObtainStyledAttributes.getResourceId(index, this.f43888b);
                        break;
                    }
                case 2:
                    this.f43887a = typedArrayObtainStyledAttributes.getInt(index, this.f43887a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f43929f = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f43929f = androidx.constraintlayout.core.motion.utils.d.f43284c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f43940e = typedArrayObtainStyledAttributes.getInteger(index, this.f43940e);
                    break;
                case 5:
                    this.f43931h = typedArrayObtainStyledAttributes.getInt(index, this.f43931h);
                    break;
                case 6:
                    this.f43934k = typedArrayObtainStyledAttributes.getFloat(index, this.f43934k);
                    break;
                case 7:
                    this.f43935l = typedArrayObtainStyledAttributes.getFloat(index, this.f43935l);
                    break;
                case 8:
                    float f12 = typedArrayObtainStyledAttributes.getFloat(index, this.f43933j);
                    this.f43932i = f12;
                    this.f43933j = f12;
                    break;
                case 9:
                    this.f43938o = typedArrayObtainStyledAttributes.getInt(index, this.f43938o);
                    break;
                case 10:
                    this.f43930g = typedArrayObtainStyledAttributes.getInt(index, this.f43930g);
                    break;
                case 11:
                    this.f43932i = typedArrayObtainStyledAttributes.getFloat(index, this.f43932i);
                    break;
                case 12:
                    this.f43933j = typedArrayObtainStyledAttributes.getFloat(index, this.f43933j);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    public final void g(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f43929f = obj.toString();
                break;
            case "percentWidth":
                this.f43932i = AbstractC22740f.f((Number) obj);
                break;
            case "percentHeight":
                this.f43933j = AbstractC22740f.f((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f43931h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float f12 = AbstractC22740f.f((Number) obj);
                this.f43932i = f12;
                this.f43933j = f12;
                break;
            case "percentX":
                this.f43934k = AbstractC22740f.f((Number) obj);
                break;
            case "percentY":
                this.f43935l = AbstractC22740f.f((Number) obj);
                break;
        }
    }
}
