package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: ChangeBounds.java */
/* renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23494e extends L {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f54741B = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: C, reason: collision with root package name */
    public static final Property<k, PointF> f54742C;

    /* renamed from: D, reason: collision with root package name */
    public static final Property<k, PointF> f54743D;

    /* renamed from: E, reason: collision with root package name */
    public static final Property<View, PointF> f54744E;

    /* renamed from: F, reason: collision with root package name */
    public static final Property<View, PointF> f54745F;

    /* renamed from: G, reason: collision with root package name */
    public static final Property<View, PointF> f54746G;

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$a */
    public class a extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            l0 l0Var = h0.f54765a;
            throw null;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$b */
    public class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f54747a;

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f54747a);
            return new PointF(r0.left, r0.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f54747a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$c */
    public class c extends Property<k, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(k kVar, PointF pointF) {
            k kVar2 = kVar;
            PointF pointF2 = pointF;
            kVar2.getClass();
            kVar2.f54751a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            kVar2.f54752b = iRound;
            int i12 = kVar2.f54756f + 1;
            kVar2.f54756f = i12;
            if (i12 == kVar2.f54757g) {
                h0.a(kVar2.f54755e, kVar2.f54751a, iRound, kVar2.f54753c, kVar2.f54754d);
                kVar2.f54756f = 0;
                kVar2.f54757g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$d */
    public class d extends Property<k, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(k kVar, PointF pointF) {
            k kVar2 = kVar;
            PointF pointF2 = pointF;
            kVar2.getClass();
            kVar2.f54753c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            kVar2.f54754d = iRound;
            int i12 = kVar2.f54757g + 1;
            kVar2.f54757g = i12;
            if (kVar2.f54756f == i12) {
                h0.a(kVar2.f54755e, kVar2.f54751a, kVar2.f54752b, kVar2.f54753c, iRound);
                kVar2.f54756f = 0;
                kVar2.f54757g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    public class C1931e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            h0.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$f */
    public class f extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            h0.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$g */
    public class g extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            h0.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$h */
    public class h extends AnimatorListenerAdapter {
        private k mViewBounds;

        public h(k kVar) {
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$i */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f54748a;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f54748a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f54748a) {
                return;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            throw null;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$j */
    public class j extends P {

        /* renamed from: a, reason: collision with root package name */
        public boolean f54749a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f54750b;

        public j(ViewGroup viewGroup) {
            this.f54750b = viewGroup;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void a() {
            b0.a(this.f54750b, false);
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void b() {
            b0.a(this.f54750b, false);
            this.f54749a = true;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void c() {
            b0.a(this.f54750b, true);
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@j.N L l12) {
            if (!this.f54749a) {
                b0.a(this.f54750b, false);
            }
            l12.A(this);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.e$k */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public int f54751a;

        /* renamed from: b, reason: collision with root package name */
        public int f54752b;

        /* renamed from: c, reason: collision with root package name */
        public int f54753c;

        /* renamed from: d, reason: collision with root package name */
        public int f54754d;

        /* renamed from: e, reason: collision with root package name */
        public View f54755e;

        /* renamed from: f, reason: collision with root package name */
        public int f54756f;

        /* renamed from: g, reason: collision with root package name */
        public int f54757g;
    }

    static {
        new b(PointF.class, "boundsOrigin").f54747a = new Rect();
        f54742C = new c(PointF.class, "topLeft");
        f54743D = new d(PointF.class, "bottomRight");
        f54744E = new C1931e(PointF.class, "bottomRight");
        f54745F = new f(PointF.class, "topLeft");
        f54746G = new g(PointF.class, "position");
        new G();
    }

    public static void M(V v12) {
        View view = v12.f54717b;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = v12.f54716a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", v12.f54717b.getParent());
    }

    @Override // androidx.transition.L
    public final void f(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    public final void j(@j.N V v12) {
        M(v12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.L
    @j.P
    public final Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) {
        int i12;
        C23494e c23494e;
        ObjectAnimator objectAnimatorOfObject;
        if (v12 == null || v13 == null) {
            return null;
        }
        HashMap map = v12.f54716a;
        HashMap map2 = v13.f54716a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = v13.f54717b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i13 = rect.left;
        int i14 = rect2.left;
        int i15 = rect.top;
        int i16 = rect2.top;
        int i17 = rect.right;
        int i18 = rect2.right;
        int i19 = rect.bottom;
        int i22 = rect2.bottom;
        int i23 = i17 - i13;
        int i24 = i19 - i15;
        int i25 = i18 - i14;
        int i26 = i22 - i16;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i12 = 0;
        } else {
            i12 = (i13 == i14 && i15 == i16) ? 0 : 1;
            if (i17 != i18 || i19 != i22) {
                i12++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i12++;
        }
        if (i12 <= 0) {
            return null;
        }
        h0.a(view, i13, i15, i17, i19);
        if (i12 != 2) {
            c23494e = this;
            objectAnimatorOfObject = (i13 == i14 && i15 == i16) ? ObjectAnimator.ofObject(view, (Property<View, V>) f54744E, (TypeConverter) null, c23494e.f54687x.a(i17, i19, i18, i22)) : ObjectAnimator.ofObject(view, (Property<View, V>) f54745F, (TypeConverter) null, c23494e.f54687x.a(i13, i15, i14, i16));
        } else if (i23 == i25 && i24 == i26) {
            c23494e = this;
            objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) f54746G, (TypeConverter) null, c23494e.f54687x.a(i13, i15, i14, i16));
        } else {
            c23494e = this;
            k kVar = new k();
            kVar.f54755e = view;
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(kVar, (Property<k, V>) f54742C, (TypeConverter) null, c23494e.f54687x.a(i13, i15, i14, i16));
            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(kVar, (Property<k, V>) f54743D, (TypeConverter) null, c23494e.f54687x.a(i17, i19, i18, i22));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
            animatorSet.addListener(new h(kVar));
            objectAnimatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            b0.a(viewGroup4, true);
            c23494e.a(new j(viewGroup4));
        }
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.L
    @j.N
    public final String[] v() {
        return f54741B;
    }
}
