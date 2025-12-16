package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public class m extends AbstractC22740f {

    /* renamed from: q, reason: collision with root package name */
    public float f43970q;

    /* renamed from: e, reason: collision with root package name */
    public String f43958e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f43959f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f43960g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f43961h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f43962i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f43963j = -1;

    /* renamed from: k, reason: collision with root package name */
    public View f43964k = null;

    /* renamed from: l, reason: collision with root package name */
    public float f43965l = 0.1f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43966m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f43967n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f43968o = true;

    /* renamed from: p, reason: collision with root package name */
    public float f43969p = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public boolean f43971r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f43972s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f43973t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f43974u = -1;

    /* renamed from: v, reason: collision with root package name */
    public RectF f43975v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public RectF f43976w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public HashMap<String, Method> f43977x = new HashMap<>();

    /* compiled from: KeyTrigger.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f43978a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f43978a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public m() {
        this.f43890d = new HashMap<>();
    }

    public static void i(RectF rectF, View view, boolean z12) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z12) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    /* renamed from: a */
    public final AbstractC22740f clone() {
        m mVar = new m();
        super.b(this);
        mVar.f43958e = this.f43958e;
        mVar.f43959f = this.f43959f;
        mVar.f43960g = this.f43960g;
        mVar.f43961h = this.f43961h;
        mVar.f43962i = this.f43962i;
        mVar.f43963j = this.f43963j;
        mVar.f43964k = this.f43964k;
        mVar.f43965l = this.f43965l;
        mVar.f43966m = this.f43966m;
        mVar.f43967n = this.f43967n;
        mVar.f43968o = this.f43968o;
        mVar.f43969p = this.f43969p;
        mVar.f43970q = this.f43970q;
        mVar.f43971r = this.f43971r;
        mVar.f43975v = this.f43975v;
        mVar.f43976w = this.f43976w;
        mVar.f43977x = this.f43977x;
        return mVar;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44413j);
        SparseIntArray sparseIntArray = a.f43978a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            SparseIntArray sparseIntArray2 = a.f43978a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f43960g = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f43961h = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f43958e = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f43965l = typedArrayObtainStyledAttributes.getFloat(index, this.f43965l);
                    break;
                case 6:
                    this.f43962i = typedArrayObtainStyledAttributes.getResourceId(index, this.f43962i);
                    break;
                case 7:
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
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f43887a);
                    this.f43887a = integer;
                    this.f43969p = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f43963j = typedArrayObtainStyledAttributes.getResourceId(index, this.f43963j);
                    break;
                case 10:
                    this.f43971r = typedArrayObtainStyledAttributes.getBoolean(index, this.f43971r);
                    break;
                case 11:
                    this.f43959f = typedArrayObtainStyledAttributes.getResourceId(index, this.f43959f);
                    break;
                case 12:
                    this.f43974u = typedArrayObtainStyledAttributes.getResourceId(index, this.f43974u);
                    break;
                case 13:
                    this.f43972s = typedArrayObtainStyledAttributes.getResourceId(index, this.f43972s);
                    break;
                case 14:
                    this.f43973t = typedArrayObtainStyledAttributes.getResourceId(index, this.f43973t);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r11, float r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.g(android.view.View, float):void");
    }

    public final void h(View view, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f43977x.containsKey(str)) {
                method = this.f43977x.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f43977x.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f43977x.put(str, null);
                    view.getClass();
                    C22737c.d(view);
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                view.getClass();
                C22737c.d(view);
                return;
            }
        }
        boolean z12 = str.length() == 1;
        if (!z12) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f43890d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z12 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f43890d.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    boolean z13 = constraintAttribute.f44135a;
                    String strF = constraintAttribute.f44136b;
                    if (!z13) {
                        strF = androidx.camera.camera2.internal.G.f("set", strF);
                    }
                    try {
                        switch (constraintAttribute.f44137c.ordinal()) {
                            case 0:
                            case 7:
                                cls.getMethod(strF, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f44138d));
                                break;
                            case 1:
                                cls.getMethod(strF, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f44139e));
                                break;
                            case 2:
                                cls.getMethod(strF, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f44142h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strF, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.f44142h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strF, CharSequence.class).invoke(view, constraintAttribute.f44140f);
                                break;
                            case 5:
                                cls.getMethod(strF, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f44141g));
                                break;
                            case 6:
                                cls.getMethod(strF, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f44139e));
                                break;
                        }
                    } catch (IllegalAccessException e12) {
                        e12.printStackTrace();
                    } catch (NoSuchMethodException e13) {
                        e13.getMessage();
                    } catch (InvocationTargetException e14) {
                        e14.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC22740f
    public final void c(HashSet<String> hashSet) {
    }
}
