package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyCycle.java */
/* renamed from: androidx.constraintlayout.motion.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22742h extends AbstractC22740f {

    /* renamed from: e, reason: collision with root package name */
    public int f43907e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f43908f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f43909g = null;

    /* renamed from: h, reason: collision with root package name */
    public float f43910h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f43911i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f43912j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f43913k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public int f43914l = -1;

    /* renamed from: m, reason: collision with root package name */
    public float f43915m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f43916n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f43917o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f43918p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f43919q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f43920r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f43921s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    public float f43922t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    public float f43923u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    public float f43924v = Float.NaN;

    /* renamed from: w, reason: collision with root package name */
    public float f43925w = Float.NaN;

    /* compiled from: KeyCycle.java */
    /* renamed from: androidx.constraintlayout.motion.widget.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f43926a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43926a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public C22742h() {
        this.f43890d = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    /* renamed from: a */
    public final AbstractC22740f clone() {
        C22742h c22742h = new C22742h();
        super.b(this);
        c22742h.f43907e = this.f43907e;
        c22742h.f43908f = this.f43908f;
        c22742h.f43909g = this.f43909g;
        c22742h.f43910h = this.f43910h;
        c22742h.f43911i = this.f43911i;
        c22742h.f43912j = this.f43912j;
        c22742h.f43913k = this.f43913k;
        c22742h.f43914l = this.f43914l;
        c22742h.f43915m = this.f43915m;
        c22742h.f43916n = this.f43916n;
        c22742h.f43917o = this.f43917o;
        c22742h.f43918p = this.f43918p;
        c22742h.f43919q = this.f43919q;
        c22742h.f43920r = this.f43920r;
        c22742h.f43921s = this.f43921s;
        c22742h.f43922t = this.f43922t;
        c22742h.f43923u = this.f43923u;
        c22742h.f43924v = this.f43924v;
        c22742h.f43925w = this.f43925w;
        return c22742h;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void c(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f43915m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f43916n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f43917o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f43919q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f43920r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f43921s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f43922t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f43918p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43923u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f43924v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f43925w)) {
            hashSet.add("translationZ");
        }
        if (this.f43890d.size() > 0) {
            Iterator<String> it = this.f43890d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44410g);
        SparseIntArray sparseIntArray = a.f43926a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            SparseIntArray sparseIntArray2 = a.f43926a;
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
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f43907e = typedArrayObtainStyledAttributes.getInteger(index, this.f43907e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f43909g = typedArrayObtainStyledAttributes.getString(index);
                        this.f43908f = 7;
                        break;
                    } else {
                        this.f43908f = typedArrayObtainStyledAttributes.getInt(index, this.f43908f);
                        break;
                    }
                case 6:
                    this.f43910h = typedArrayObtainStyledAttributes.getFloat(index, this.f43910h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f43911i = typedArrayObtainStyledAttributes.getDimension(index, this.f43911i);
                        break;
                    } else {
                        this.f43911i = typedArrayObtainStyledAttributes.getFloat(index, this.f43911i);
                        break;
                    }
                case 8:
                    this.f43914l = typedArrayObtainStyledAttributes.getInt(index, this.f43914l);
                    break;
                case 9:
                    this.f43915m = typedArrayObtainStyledAttributes.getFloat(index, this.f43915m);
                    break;
                case 10:
                    this.f43916n = typedArrayObtainStyledAttributes.getDimension(index, this.f43916n);
                    break;
                case 11:
                    this.f43917o = typedArrayObtainStyledAttributes.getFloat(index, this.f43917o);
                    break;
                case 12:
                    this.f43919q = typedArrayObtainStyledAttributes.getFloat(index, this.f43919q);
                    break;
                case 13:
                    this.f43920r = typedArrayObtainStyledAttributes.getFloat(index, this.f43920r);
                    break;
                case 14:
                    this.f43918p = typedArrayObtainStyledAttributes.getFloat(index, this.f43918p);
                    break;
                case 15:
                    this.f43921s = typedArrayObtainStyledAttributes.getFloat(index, this.f43921s);
                    break;
                case 16:
                    this.f43922t = typedArrayObtainStyledAttributes.getFloat(index, this.f43922t);
                    break;
                case 17:
                    this.f43923u = typedArrayObtainStyledAttributes.getDimension(index, this.f43923u);
                    break;
                case 18:
                    this.f43924v = typedArrayObtainStyledAttributes.getDimension(index, this.f43924v);
                    break;
                case 19:
                    this.f43925w = typedArrayObtainStyledAttributes.getDimension(index, this.f43925w);
                    break;
                case 20:
                    this.f43913k = typedArrayObtainStyledAttributes.getFloat(index, this.f43913k);
                    break;
                case 21:
                    this.f43912j = typedArrayObtainStyledAttributes.getFloat(index, this.f43912j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    public final void g(HashMap<String, androidx.constraintlayout.motion.utils.c> map) {
        androidx.constraintlayout.motion.utils.c cVar;
        float f12;
        androidx.constraintlayout.motion.utils.c cVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f43890d.get(str.substring(7));
                if (constraintAttribute != null) {
                    if (constraintAttribute.f44137c == ConstraintAttribute.AttributeType.f44144c && (cVar = map.get(str)) != null) {
                        cVar.e(this.f43887a, this.f43908f, this.f43909g, this.f43914l, this.f43910h, this.f43911i, this.f43912j, constraintAttribute.a(), constraintAttribute);
                    }
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f12 = this.f43919q;
                        break;
                    case "rotationY":
                        f12 = this.f43920r;
                        break;
                    case "translationX":
                        f12 = this.f43923u;
                        break;
                    case "translationY":
                        f12 = this.f43924v;
                        break;
                    case "translationZ":
                        f12 = this.f43925w;
                        break;
                    case "progress":
                        f12 = this.f43913k;
                        break;
                    case "scaleX":
                        f12 = this.f43921s;
                        break;
                    case "scaleY":
                        f12 = this.f43922t;
                        break;
                    case "rotation":
                        f12 = this.f43917o;
                        break;
                    case "elevation":
                        f12 = this.f43916n;
                        break;
                    case "transitionPathRotate":
                        f12 = this.f43918p;
                        break;
                    case "alpha":
                        f12 = this.f43915m;
                        break;
                    case "waveOffset":
                        f12 = this.f43911i;
                        break;
                    case "wavePhase":
                        f12 = this.f43912j;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f12 = Float.NaN;
                        break;
                }
                float f13 = f12;
                if (!Float.isNaN(f13) && (cVar2 = map.get(str)) != null) {
                    cVar2.d(this.f43887a, this.f43908f, this.f43909g, this.f43914l, this.f43910h, this.f43911i, this.f43912j, f13);
                }
            }
        }
    }
}
