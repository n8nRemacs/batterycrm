package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyAttributes.java */
/* renamed from: androidx.constraintlayout.motion.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22741g extends AbstractC22740f {

    /* renamed from: e, reason: collision with root package name */
    public int f43891e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f43892f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f43893g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f43894h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f43895i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f43896j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f43897k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f43898l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f43899m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f43900n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f43901o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f43902p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f43903q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f43904r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f43905s = Float.NaN;

    /* compiled from: KeyAttributes.java */
    /* renamed from: androidx.constraintlayout.motion.widget.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f43906a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43906a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public C22741g() {
        this.f43890d = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    /* renamed from: a */
    public final AbstractC22740f clone() {
        C22741g c22741g = new C22741g();
        super.b(this);
        c22741g.f43891e = this.f43891e;
        c22741g.f43892f = this.f43892f;
        c22741g.f43893g = this.f43893g;
        c22741g.f43894h = this.f43894h;
        c22741g.f43895i = this.f43895i;
        c22741g.f43896j = this.f43896j;
        c22741g.f43897k = this.f43897k;
        c22741g.f43898l = this.f43898l;
        c22741g.f43899m = this.f43899m;
        c22741g.f43900n = this.f43900n;
        c22741g.f43901o = this.f43901o;
        c22741g.f43902p = this.f43902p;
        c22741g.f43903q = this.f43903q;
        c22741g.f43904r = this.f43904r;
        c22741g.f43905s = this.f43905s;
        return c22741g;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void c(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f43892f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f43893g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f43894h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f43895i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f43896j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f43897k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f43898l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f43902p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f43903q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f43904r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f43899m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43900n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f43901o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f43905s)) {
            hashSet.add("progress");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44409f);
        SparseIntArray sparseIntArray = a.f43906a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            SparseIntArray sparseIntArray2 = a.f43906a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f43892f = typedArrayObtainStyledAttributes.getFloat(index, this.f43892f);
                    break;
                case 2:
                    this.f43893g = typedArrayObtainStyledAttributes.getDimension(index, this.f43893g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f43894h = typedArrayObtainStyledAttributes.getFloat(index, this.f43894h);
                    break;
                case 5:
                    this.f43895i = typedArrayObtainStyledAttributes.getFloat(index, this.f43895i);
                    break;
                case 6:
                    this.f43896j = typedArrayObtainStyledAttributes.getFloat(index, this.f43896j);
                    break;
                case 7:
                    this.f43900n = typedArrayObtainStyledAttributes.getFloat(index, this.f43900n);
                    break;
                case 8:
                    this.f43899m = typedArrayObtainStyledAttributes.getFloat(index, this.f43899m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f43887a = typedArrayObtainStyledAttributes.getInt(index, this.f43887a);
                    break;
                case 13:
                    this.f43891e = typedArrayObtainStyledAttributes.getInteger(index, this.f43891e);
                    break;
                case 14:
                    this.f43901o = typedArrayObtainStyledAttributes.getFloat(index, this.f43901o);
                    break;
                case 15:
                    this.f43902p = typedArrayObtainStyledAttributes.getDimension(index, this.f43902p);
                    break;
                case 16:
                    this.f43903q = typedArrayObtainStyledAttributes.getDimension(index, this.f43903q);
                    break;
                case 17:
                    this.f43904r = typedArrayObtainStyledAttributes.getDimension(index, this.f43904r);
                    break;
                case 18:
                    this.f43905s = typedArrayObtainStyledAttributes.getFloat(index, this.f43905s);
                    break;
                case 19:
                    this.f43897k = typedArrayObtainStyledAttributes.getDimension(index, this.f43897k);
                    break;
                case 20:
                    this.f43898l = typedArrayObtainStyledAttributes.getDimension(index, this.f43898l);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void e(HashMap<String, Integer> map) {
        if (this.f43891e == -1) {
            return;
        }
        if (!Float.isNaN(this.f43892f)) {
            map.put("alpha", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43893g)) {
            map.put("elevation", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43894h)) {
            map.put("rotation", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43895i)) {
            map.put("rotationX", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43896j)) {
            map.put("rotationY", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43897k)) {
            map.put("transformPivotX", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43898l)) {
            map.put("transformPivotY", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43902p)) {
            map.put("translationX", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43903q)) {
            map.put("translationY", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43904r)) {
            map.put("translationZ", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43899m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43900n)) {
            map.put("scaleX", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43901o)) {
            map.put("scaleY", Integer.valueOf(this.f43891e));
        }
        if (!Float.isNaN(this.f43905s)) {
            map.put("progress", Integer.valueOf(this.f43891e));
        }
        if (this.f43890d.size() > 0) {
            Iterator<String> it = this.f43890d.keySet().iterator();
            while (it.hasNext()) {
                map.put(androidx.camera.camera2.internal.G.f("CUSTOM,", it.next()), Integer.valueOf(this.f43891e));
            }
        }
    }

    public final void g(Object obj, String str) {
        this.f43892f = AbstractC22740f.f(Float.valueOf(0.0f));
    }
}
