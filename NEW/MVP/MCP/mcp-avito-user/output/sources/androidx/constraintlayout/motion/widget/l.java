package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.f;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public class l extends AbstractC22740f {

    /* renamed from: e, reason: collision with root package name */
    public int f43941e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f43942f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f43943g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f43944h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f43945i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f43946j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f43947k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f43948l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f43949m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f43950n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f43951o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f43952p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f43953q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public int f43954r = 0;

    /* renamed from: s, reason: collision with root package name */
    public float f43955s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    public float f43956t = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f43957a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43957a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public l() {
        this.f43890d = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    /* renamed from: a */
    public final AbstractC22740f clone() {
        l lVar = new l();
        super.b(this);
        lVar.f43941e = this.f43941e;
        lVar.f43954r = this.f43954r;
        lVar.f43955s = this.f43955s;
        lVar.f43956t = this.f43956t;
        lVar.f43953q = this.f43953q;
        lVar.f43942f = this.f43942f;
        lVar.f43943g = this.f43943g;
        lVar.f43944h = this.f43944h;
        lVar.f43947k = this.f43947k;
        lVar.f43945i = this.f43945i;
        lVar.f43946j = this.f43946j;
        lVar.f43948l = this.f43948l;
        lVar.f43949m = this.f43949m;
        lVar.f43950n = this.f43950n;
        lVar.f43951o = this.f43951o;
        lVar.f43952p = this.f43952p;
        return lVar;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void c(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f43942f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f43943g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f43944h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f43945i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f43946j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f43950n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f43951o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f43952p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f43947k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f43948l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f43949m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f43953q)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44412i);
        SparseIntArray sparseIntArray = a.f43957a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            SparseIntArray sparseIntArray2 = a.f43957a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f43942f = typedArrayObtainStyledAttributes.getFloat(index, this.f43942f);
                    break;
                case 2:
                    this.f43943g = typedArrayObtainStyledAttributes.getDimension(index, this.f43943g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f43944h = typedArrayObtainStyledAttributes.getFloat(index, this.f43944h);
                    break;
                case 5:
                    this.f43945i = typedArrayObtainStyledAttributes.getFloat(index, this.f43945i);
                    break;
                case 6:
                    this.f43946j = typedArrayObtainStyledAttributes.getFloat(index, this.f43946j);
                    break;
                case 7:
                    this.f43948l = typedArrayObtainStyledAttributes.getFloat(index, this.f43948l);
                    break;
                case 8:
                    this.f43947k = typedArrayObtainStyledAttributes.getFloat(index, this.f43947k);
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
                    this.f43941e = typedArrayObtainStyledAttributes.getInteger(index, this.f43941e);
                    break;
                case 14:
                    this.f43949m = typedArrayObtainStyledAttributes.getFloat(index, this.f43949m);
                    break;
                case 15:
                    this.f43950n = typedArrayObtainStyledAttributes.getDimension(index, this.f43950n);
                    break;
                case 16:
                    this.f43951o = typedArrayObtainStyledAttributes.getDimension(index, this.f43951o);
                    break;
                case 17:
                    this.f43952p = typedArrayObtainStyledAttributes.getDimension(index, this.f43952p);
                    break;
                case 18:
                    this.f43953q = typedArrayObtainStyledAttributes.getFloat(index, this.f43953q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f43954r = 7;
                        break;
                    } else {
                        this.f43954r = typedArrayObtainStyledAttributes.getInt(index, this.f43954r);
                        break;
                    }
                case 20:
                    this.f43955s = typedArrayObtainStyledAttributes.getFloat(index, this.f43955s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f43956t = typedArrayObtainStyledAttributes.getDimension(index, this.f43956t);
                        break;
                    } else {
                        this.f43956t = typedArrayObtainStyledAttributes.getFloat(index, this.f43956t);
                        break;
                    }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void e(HashMap<String, Integer> map) {
        if (this.f43941e == -1) {
            return;
        }
        if (!Float.isNaN(this.f43942f)) {
            map.put("alpha", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43943g)) {
            map.put("elevation", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43944h)) {
            map.put("rotation", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43945i)) {
            map.put("rotationX", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43946j)) {
            map.put("rotationY", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43950n)) {
            map.put("translationX", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43951o)) {
            map.put("translationY", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43952p)) {
            map.put("translationZ", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43947k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43948l)) {
            map.put("scaleX", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43948l)) {
            map.put("scaleY", Integer.valueOf(this.f43941e));
        }
        if (!Float.isNaN(this.f43953q)) {
            map.put("progress", Integer.valueOf(this.f43941e));
        }
        if (this.f43890d.size() > 0) {
            Iterator<String> it = this.f43890d.keySet().iterator();
            while (it.hasNext()) {
                map.put(androidx.camera.camera2.internal.G.f("CUSTOM,", it.next()), Integer.valueOf(this.f43941e));
            }
        }
    }

    public final void g(HashMap<String, androidx.constraintlayout.motion.utils.f> map) {
        for (String str : map.keySet()) {
            androidx.constraintlayout.motion.utils.f fVar = map.get(str);
            if (fVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f43945i)) {
                                break;
                            } else {
                                fVar.b(this.f43945i, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "rotationY":
                            if (Float.isNaN(this.f43946j)) {
                                break;
                            } else {
                                fVar.b(this.f43946j, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "translationX":
                            if (Float.isNaN(this.f43950n)) {
                                break;
                            } else {
                                fVar.b(this.f43950n, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "translationY":
                            if (Float.isNaN(this.f43951o)) {
                                break;
                            } else {
                                fVar.b(this.f43951o, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "translationZ":
                            if (Float.isNaN(this.f43952p)) {
                                break;
                            } else {
                                fVar.b(this.f43952p, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "progress":
                            if (Float.isNaN(this.f43953q)) {
                                break;
                            } else {
                                fVar.b(this.f43953q, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "scaleX":
                            if (Float.isNaN(this.f43948l)) {
                                break;
                            } else {
                                fVar.b(this.f43948l, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "scaleY":
                            if (Float.isNaN(this.f43949m)) {
                                break;
                            } else {
                                fVar.b(this.f43949m, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "rotation":
                            if (Float.isNaN(this.f43944h)) {
                                break;
                            } else {
                                fVar.b(this.f43944h, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "elevation":
                            if (Float.isNaN(this.f43943g)) {
                                break;
                            } else {
                                fVar.b(this.f43943g, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f43947k)) {
                                break;
                            } else {
                                fVar.b(this.f43947k, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                        case "alpha":
                            if (Float.isNaN(this.f43942f)) {
                                break;
                            } else {
                                fVar.b(this.f43942f, this.f43955s, this.f43956t, this.f43887a, this.f43954r);
                                break;
                            }
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f43890d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        f.b bVar = (f.b) fVar;
                        int i12 = this.f43887a;
                        float f12 = this.f43955s;
                        int i13 = this.f43954r;
                        float f13 = this.f43956t;
                        bVar.f43705l.append(i12, constraintAttribute);
                        bVar.f43706m.append(i12, new float[]{f12, f13});
                        bVar.f43356b = Math.max(bVar.f43356b, i13);
                    }
                }
            }
        }
    }
}
