package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ChangeTransform.java */
/* renamed from: androidx.transition.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23498i extends L {

    /* renamed from: E, reason: collision with root package name */
    public static final String[] f54768E = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: F, reason: collision with root package name */
    public static final Property<d, float[]> f54769F = new a(float[].class, "nonTranslations");

    /* renamed from: G, reason: collision with root package name */
    public static final Property<d, PointF> f54770G = new b(PointF.class, "translations");

    /* renamed from: H, reason: collision with root package name */
    public static final boolean f54771H = true;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f54772B = true;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f54773C = true;

    /* renamed from: D, reason: collision with root package name */
    public final Matrix f54774D = new Matrix();

    /* compiled from: ChangeTransform.java */
    /* renamed from: androidx.transition.i$a */
    public class a extends Property<d, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(d dVar, float[] fArr) {
            d dVar2 = dVar;
            float[] fArr2 = fArr;
            dVar2.getClass();
            System.arraycopy(fArr2, 0, dVar2.f54779c, 0, fArr2.length);
            dVar2.a();
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: androidx.transition.i$b */
    public class b extends Property<d, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(d dVar, PointF pointF) {
            d dVar2 = dVar;
            PointF pointF2 = pointF;
            dVar2.getClass();
            dVar2.f54780d = pointF2.x;
            dVar2.f54781e = pointF2.y;
            dVar2.a();
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: androidx.transition.i$c */
    public static class c extends P {

        /* renamed from: a, reason: collision with root package name */
        public View f54775a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC23508t f54776b;

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void a() {
            this.f54776b.setVisibility(4);
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void c() {
            this.f54776b.setVisibility(0);
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@j.N L l12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            l12.A(this);
            int i12 = Build.VERSION.SDK_INT;
            View view = this.f54775a;
            if (i12 == 28) {
                if (!C23510v.f54853h) {
                    try {
                        if (!C23510v.f54849d) {
                            try {
                                C23510v.f54848c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C23510v.f54849d = true;
                        }
                        Method declaredMethod = C23510v.f54848c.getDeclaredMethod("removeGhost", View.class);
                        C23510v.f54852g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C23510v.f54853h = true;
                }
                Method method = C23510v.f54852g;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e12) {
                        throw new RuntimeException(e12.getCause());
                    }
                }
            } else {
                int i13 = C23511w.f54855h;
                C23511w c23511w = (C23511w) view.getTag(R.id.ghost_view);
                if (c23511w != null) {
                    int i14 = c23511w.f54859e - 1;
                    c23511w.f54859e = i14;
                    if (i14 <= 0) {
                        ((C23509u) c23511w.getParent()).removeView(c23511w);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: androidx.transition.i$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f54777a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        public final View f54778b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f54779c;

        /* renamed from: d, reason: collision with root package name */
        public float f54780d;

        /* renamed from: e, reason: collision with root package name */
        public float f54781e;

        public d(View view, float[] fArr) {
            this.f54778b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f54779c = fArr2;
            this.f54780d = fArr2[2];
            this.f54781e = fArr2[5];
            a();
        }

        public final void a() {
            float f12 = this.f54780d;
            float[] fArr = this.f54779c;
            fArr[2] = f12;
            fArr[5] = this.f54781e;
            Matrix matrix = this.f54777a;
            matrix.setValues(fArr);
            h0.f54765a.d(this.f54778b, matrix);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: androidx.transition.i$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final float f54782a;

        /* renamed from: b, reason: collision with root package name */
        public final float f54783b;

        /* renamed from: c, reason: collision with root package name */
        public final float f54784c;

        /* renamed from: d, reason: collision with root package name */
        public final float f54785d;

        /* renamed from: e, reason: collision with root package name */
        public final float f54786e;

        /* renamed from: f, reason: collision with root package name */
        public final float f54787f;

        /* renamed from: g, reason: collision with root package name */
        public final float f54788g;

        /* renamed from: h, reason: collision with root package name */
        public final float f54789h;

        public e(View view) {
            this.f54782a = view.getTranslationX();
            this.f54783b = view.getTranslationY();
            this.f54784c = C22823h0.q(view);
            this.f54785d = view.getScaleX();
            this.f54786e = view.getScaleY();
            this.f54787f = view.getRotationX();
            this.f54788g = view.getRotationY();
            this.f54789h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.f54782a == this.f54782a && eVar.f54783b == this.f54783b && eVar.f54784c == this.f54784c && eVar.f54785d == this.f54785d && eVar.f54786e == this.f54786e && eVar.f54787f == this.f54787f && eVar.f54788g == this.f54788g && eVar.f54789h == this.f54789h;
        }

        public final int hashCode() {
            float f12 = this.f54782a;
            int iFloatToIntBits = (f12 != 0.0f ? Float.floatToIntBits(f12) : 0) * 31;
            float f13 = this.f54783b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f54784c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f54785d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f54786e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f54787f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0)) * 31;
            float f18 = this.f54788g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f18 != 0.0f ? Float.floatToIntBits(f18) : 0)) * 31;
            float f19 = this.f54789h;
            return iFloatToIntBits7 + (f19 != 0.0f ? Float.floatToIntBits(f19) : 0);
        }
    }

    public final void M(V v12) {
        View view = v12.f54717b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = v12.f54716a;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new e(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f54773C) {
            Matrix matrix2 = new Matrix();
            h0.f54765a.e((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // androidx.transition.L
    public final void f(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    public final void j(@j.N V v12) {
        M(v12);
        if (f54771H) {
            return;
        }
        ((ViewGroup) v12.f54717b.getParent()).startViewTransition(v12.f54717b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.transition.v] */
    @Override // androidx.transition.L
    @j.P
    public final Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) throws NoSuchMethodException, SecurityException {
        Object obj;
        HashMap map;
        ViewGroup viewGroup2;
        Animator animator;
        Animator animator2;
        int i12;
        C23511w c23510v;
        ArrayList arrayList;
        int i13;
        Class<ViewGroup> cls;
        Animator animator3;
        int i14;
        boolean z12;
        int iIntValue;
        C23509u c23509u;
        V vT2;
        if (v12 == null || v13 == null) {
            return null;
        }
        HashMap map2 = v12.f54716a;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        HashMap map3 = v13.f54716a;
        if (!map3.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeTransform:parent");
        ViewGroup viewGroup4 = (ViewGroup) map3.get("android:changeTransform:parent");
        boolean z13 = this.f54773C && (!(y(viewGroup3) && y(viewGroup4)) ? viewGroup3 == viewGroup4 : !((vT2 = t(viewGroup3, true)) == null || viewGroup4 != vT2.f54717b));
        Matrix matrix = (Matrix) map2.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map2.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map2.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map2.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z13) {
            Matrix matrix3 = (Matrix) map3.get("android:changeTransform:parentMatrix");
            v13.f54717b.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.f54774D;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map2.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map2.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map2.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map2.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map3.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = C23514z.f54864a;
        }
        if (matrix7 == null) {
            matrix7 = C23514z.f54864a;
        }
        Matrix matrix8 = matrix7;
        if (matrix6.equals(matrix8)) {
            obj = "android:changeTransform:parentMatrix";
            viewGroup2 = viewGroup3;
            map = map2;
            animator = null;
        } else {
            e eVar = (e) map3.get("android:changeTransform:transforms");
            View view = v13.f54717b;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            C22823h0.Q(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix8.getValues(fArr2);
            d dVar = new d(view, fArr);
            Property<d, float[]> property = f54769F;
            C23504o c23504o = new C23504o();
            c23504o.f54813a = new float[9];
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dVar, PropertyValuesHolder.ofObject(property, c23504o, fArr, fArr2), PropertyValuesHolder.ofObject(f54770G, (TypeConverter) null, this.f54687x.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            map = map2;
            viewGroup2 = viewGroup3;
            C23499j c23499j = new C23499j(this, z13, matrix8, view, eVar, dVar);
            animatorOfPropertyValuesHolder.addListener(c23499j);
            animatorOfPropertyValuesHolder.addPauseListener(c23499j);
            animator = animatorOfPropertyValuesHolder;
        }
        boolean z14 = f54771H;
        if (z13 && animator != null && this.f54772B) {
            View view2 = v13.f54717b;
            Matrix matrix9 = new Matrix((Matrix) map3.get(obj));
            h0.f54765a.f(viewGroup, matrix9);
            Class<ViewGroup> cls2 = ViewGroup.class;
            if (Build.VERSION.SDK_INT == 28) {
                if (!C23510v.f54851f) {
                    try {
                        if (!C23510v.f54849d) {
                            try {
                                C23510v.f54848c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C23510v.f54849d = true;
                        }
                        Method declaredMethod = C23510v.f54848c.getDeclaredMethod("addGhost", View.class, cls2, Matrix.class);
                        C23510v.f54850e = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C23510v.f54851f = true;
                }
                Method method = C23510v.f54850e;
                if (method != null) {
                    try {
                        c23510v = new C23510v((View) method.invoke(null, view2, viewGroup, matrix9));
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e12) {
                        throw new RuntimeException(e12.getCause());
                    }
                    animator2 = animator;
                } else {
                    c23510v = null;
                    animator2 = animator;
                }
            } else {
                int i15 = C23511w.f54855h;
                if (!(view2.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i16 = C23509u.f54845d;
                C23509u c23509u2 = (C23509u) viewGroup.getTag(R.id.ghost_view_holder);
                C23511w c23511w = (C23511w) view2.getTag(R.id.ghost_view);
                if (c23511w == null || (c23509u = (C23509u) c23511w.getParent()) == c23509u2) {
                    i12 = 0;
                } else {
                    i12 = c23511w.f54859e;
                    c23509u.removeView(c23511w);
                    c23511w = null;
                }
                if (c23511w == null) {
                    c23511w = new C23511w(view2);
                    c23511w.f54860f = matrix9;
                    if (c23509u2 == null) {
                        c23509u2 = new C23509u(viewGroup.getContext());
                        c23509u2.setClipChildren(false);
                        c23509u2.f54846b = viewGroup;
                        viewGroup.setTag(R.id.ghost_view_holder, c23509u2);
                        new Z(viewGroup).f54732a.add(c23509u2);
                        c23509u2.f54847c = true;
                    } else {
                        if (!c23509u2.f54847c) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup5 = c23509u2.f54846b;
                        new Z(viewGroup5).f54732a.remove(c23509u2);
                        new Z(viewGroup5).f54732a.add(c23509u2);
                    }
                    h0.a(c23509u2, c23509u2.getLeft(), c23509u2.getTop(), viewGroup.getWidth() + c23509u2.getLeft(), viewGroup.getHeight() + c23509u2.getTop());
                    h0.a(c23511w, c23511w.getLeft(), c23511w.getTop(), viewGroup.getWidth() + c23511w.getLeft(), viewGroup.getHeight() + c23511w.getTop());
                    ArrayList arrayList2 = new ArrayList();
                    C23509u.a(c23511w.f54858d, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int childCount = c23509u2.getChildCount() - 1;
                    int i17 = 0;
                    while (i17 <= childCount) {
                        int i18 = (i17 + childCount) / 2;
                        C23509u.a(((C23511w) c23509u2.getChildAt(i18)).f54858d, arrayList3);
                        if (arrayList2.isEmpty() || arrayList3.isEmpty()) {
                            arrayList = arrayList2;
                            i13 = childCount;
                        } else {
                            i13 = childCount;
                            if (arrayList2.get(0) != arrayList3.get(0)) {
                                arrayList = arrayList2;
                            } else {
                                int iMin = Math.min(arrayList2.size(), arrayList3.size());
                                int i19 = 1;
                                while (true) {
                                    if (i19 < iMin) {
                                        View view3 = (View) arrayList2.get(i19);
                                        arrayList = arrayList2;
                                        View view4 = (View) arrayList3.get(i19);
                                        if (view3 != view4) {
                                            ViewGroup viewGroup6 = (ViewGroup) view3.getParent();
                                            int childCount2 = viewGroup6.getChildCount();
                                            if (view3.getZ() != view4.getZ()) {
                                                animator3 = animator;
                                                cls = cls2;
                                                i14 = 1;
                                                if (view3.getZ() > view4.getZ()) {
                                                }
                                            } else {
                                                animator3 = animator;
                                                int i22 = 0;
                                                while (i22 < childCount2) {
                                                    int i23 = childCount2;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        iIntValue = viewGroup6.getChildDrawingOrder(i22);
                                                        cls = cls2;
                                                    } else {
                                                        if (!b0.f54737c) {
                                                            try {
                                                                Class cls3 = Integer.TYPE;
                                                                Method declaredMethod2 = cls2.getDeclaredMethod("getChildDrawingOrder", cls3, cls3);
                                                                b0.f54736b = declaredMethod2;
                                                                z12 = true;
                                                                try {
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused4) {
                                                                }
                                                            } catch (NoSuchMethodException unused5) {
                                                                z12 = true;
                                                            }
                                                            b0.f54737c = z12;
                                                        }
                                                        Method method2 = b0.f54736b;
                                                        if (method2 != null) {
                                                            try {
                                                                cls = cls2;
                                                                try {
                                                                    iIntValue = ((Integer) method2.invoke(viewGroup6, Integer.valueOf(viewGroup6.getChildCount()), Integer.valueOf(i22))).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused7) {
                                                            }
                                                        } else {
                                                            cls = cls2;
                                                            iIntValue = i22;
                                                        }
                                                    }
                                                    View childAt = viewGroup6.getChildAt(iIntValue);
                                                    if (childAt == view3) {
                                                        i14 = 1;
                                                    } else {
                                                        if (childAt == view4) {
                                                            break;
                                                        }
                                                        i22++;
                                                        childCount2 = i23;
                                                        cls2 = cls;
                                                    }
                                                }
                                            }
                                        } else {
                                            i19++;
                                            arrayList2 = arrayList;
                                            cls2 = cls2;
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        animator3 = animator;
                                        cls = cls2;
                                        i14 = 1;
                                        if (arrayList3.size() == iMin) {
                                        }
                                    }
                                    arrayList3.clear();
                                    arrayList2 = arrayList;
                                    animator = animator3;
                                    cls2 = cls;
                                }
                                childCount = i18 - i14;
                                arrayList3.clear();
                                arrayList2 = arrayList;
                                animator = animator3;
                                cls2 = cls;
                            }
                        }
                        animator3 = animator;
                        cls = cls2;
                        i14 = 1;
                        i17 = i18 + i14;
                        childCount = i13;
                        arrayList3.clear();
                        arrayList2 = arrayList;
                        animator = animator3;
                        cls2 = cls;
                    }
                    animator2 = animator;
                    if (i17 < 0 || i17 >= c23509u2.getChildCount()) {
                        c23509u2.addView(c23511w);
                    } else {
                        c23509u2.addView(c23511w, i17);
                    }
                    c23511w.f54859e = i12;
                } else {
                    animator2 = animator;
                    c23511w.f54860f = matrix9;
                }
                c23510v = c23511w;
                c23510v.f54859e++;
            }
            if (c23510v != null) {
                c23510v.a(v12.f54717b, (ViewGroup) map.get("android:changeTransform:parent"));
                L l12 = this;
                while (true) {
                    T t12 = l12.f54675l;
                    if (t12 == null) {
                        break;
                    }
                    l12 = t12;
                }
                c cVar = new c();
                cVar.f54775a = view2;
                cVar.f54776b = c23510v;
                l12.a(cVar);
                if (z14) {
                    View view5 = v12.f54717b;
                    if (view5 != v13.f54717b) {
                        h0.b(view5, 0.0f);
                    }
                    h0.b(view2, 1.0f);
                }
            }
        } else {
            animator2 = animator;
            if (!z14) {
                viewGroup2.endViewTransition(v12.f54717b);
            }
        }
        return animator2;
    }

    @Override // androidx.transition.L
    @j.N
    public final String[] v() {
        return f54768E;
    }
}
