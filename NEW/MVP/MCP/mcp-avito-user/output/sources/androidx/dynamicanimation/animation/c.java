package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.C22823h0;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.c;
import java.util.ArrayList;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class c<T extends c<T>> implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final s f46024m;

    /* renamed from: n, reason: collision with root package name */
    public static final s f46025n;

    /* renamed from: o, reason: collision with root package name */
    public static final s f46026o;

    /* renamed from: p, reason: collision with root package name */
    public static final s f46027p;

    /* renamed from: q, reason: collision with root package name */
    public static final s f46028q;

    /* renamed from: r, reason: collision with root package name */
    public static final s f46029r;

    /* renamed from: s, reason: collision with root package name */
    public static final s f46030s;

    /* renamed from: a, reason: collision with root package name */
    public float f46031a;

    /* renamed from: b, reason: collision with root package name */
    public float f46032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46033c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f46034d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.f f46035e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46036f;

    /* renamed from: g, reason: collision with root package name */
    public float f46037g;

    /* renamed from: h, reason: collision with root package name */
    public float f46038h;

    /* renamed from: i, reason: collision with root package name */
    public long f46039i;

    /* renamed from: j, reason: collision with root package name */
    public final float f46040j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f46041k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f46042l;

    /* compiled from: DynamicAnimation.java */
    public static class a extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setY(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class b extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return C22823h0.s(view);
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            C22823h0.S(view, f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: androidx.dynamicanimation.animation.c$c, reason: collision with other inner class name */
    public static class C1783c extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setAlpha(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class d extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setScrollX((int) f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class e extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setScrollY((int) f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public class f extends androidx.dynamicanimation.animation.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.dynamicanimation.animation.g f46043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.dynamicanimation.animation.g gVar) {
            super("FloatValueHolder");
            this.f46043a = gVar;
        }

        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(Object obj) {
            return this.f46043a.f46046a;
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(Object obj, float f12) {
            this.f46043a.f46046a = f12;
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class g extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setTranslationX(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class h extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setTranslationY(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class i extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return C22823h0.q(view);
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            C22823h0.Q(view, f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class j extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setScaleX(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class k extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setScaleY(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class l extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setRotation(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class m extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setRotationX(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class n extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setRotationY(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class o extends s {
        @Override // androidx.dynamicanimation.animation.f
        public final float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.f
        public final void setValue(View view, float f12) {
            view.setX(f12);
        }
    }

    /* compiled from: DynamicAnimation.java */
    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public float f46044a;

        /* renamed from: b, reason: collision with root package name */
        public float f46045b;
    }

    /* compiled from: DynamicAnimation.java */
    public interface q {
        void a(c cVar, boolean z12, float f12, float f13);
    }

    /* compiled from: DynamicAnimation.java */
    public interface r {
        void a(float f12);
    }

    /* compiled from: DynamicAnimation.java */
    public static abstract class s extends androidx.dynamicanimation.animation.f<View> {
        public s(String str, g gVar) {
            super(str);
        }
    }

    static {
        new g("translationX", null);
        f46024m = new h("translationY", null);
        new i("translationZ", null);
        f46025n = new j("scaleX", null);
        f46026o = new k("scaleY", null);
        f46027p = new l("rotation", null);
        f46028q = new m("rotationX", null);
        f46029r = new n("rotationY", null);
        new o("x", null);
        new a("y", null);
        new b("z", null);
        f46030s = new C1783c("alpha", null);
        new d("scrollX", null);
        new e("scrollY", null);
    }

    public c(androidx.dynamicanimation.animation.g gVar) {
        this.f46031a = 0.0f;
        this.f46032b = Float.MAX_VALUE;
        this.f46033c = false;
        this.f46036f = false;
        this.f46037g = Float.MAX_VALUE;
        this.f46038h = -3.4028235E38f;
        this.f46039i = 0L;
        this.f46041k = new ArrayList<>();
        this.f46042l = new ArrayList<>();
        this.f46034d = null;
        this.f46035e = new f(gVar);
        this.f46040j = 1.0f;
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @RestrictTo
    public final boolean a(long j12) {
        long j13 = this.f46039i;
        if (j13 == 0) {
            this.f46039i = j12;
            f(this.f46032b);
            return false;
        }
        this.f46039i = j12;
        boolean zG2 = g(j12 - j13);
        float fMin = Math.min(this.f46032b, this.f46037g);
        this.f46032b = fMin;
        float fMax = Math.max(fMin, this.f46038h);
        this.f46032b = fMax;
        f(fMax);
        if (zG2) {
            e(false);
        }
        return zG2;
    }

    public final void b(q qVar) {
        ArrayList<q> arrayList = this.f46041k;
        if (arrayList.contains(qVar)) {
            return;
        }
        arrayList.add(qVar);
    }

    public final void c(r rVar) {
        if (this.f46036f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList<r> arrayList = this.f46042l;
        if (arrayList.contains(rVar)) {
            return;
        }
        arrayList.add(rVar);
    }

    public final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f46036f) {
            e(true);
        }
    }

    public final void e(boolean z12) {
        ArrayList<q> arrayList;
        int i12 = 0;
        this.f46036f = false;
        ThreadLocal<androidx.dynamicanimation.animation.a> threadLocal = androidx.dynamicanimation.animation.a.f46013f;
        if (threadLocal.get() == null) {
            threadLocal.set(new androidx.dynamicanimation.animation.a());
        }
        androidx.dynamicanimation.animation.a aVar = threadLocal.get();
        aVar.f46014a.remove(this);
        ArrayList<a.b> arrayList2 = aVar.f46015b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            aVar.f46018e = true;
        }
        this.f46039i = 0L;
        this.f46033c = false;
        while (true) {
            arrayList = this.f46041k;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i12) != null) {
                arrayList.get(i12).a(this, z12, this.f46032b, this.f46031a);
            }
            i12++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f12) {
        ArrayList<r> arrayList;
        this.f46035e.setValue(this.f46034d, f12);
        int i12 = 0;
        while (true) {
            arrayList = this.f46042l;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i12) != null) {
                arrayList.get(i12).a(this.f46032b);
            }
            i12++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public abstract boolean g(long j12);

    public <K> c(K k12, androidx.dynamicanimation.animation.f<K> fVar) {
        this.f46031a = 0.0f;
        this.f46032b = Float.MAX_VALUE;
        this.f46033c = false;
        this.f46036f = false;
        this.f46037g = Float.MAX_VALUE;
        this.f46038h = -Float.MAX_VALUE;
        this.f46039i = 0L;
        this.f46041k = new ArrayList<>();
        this.f46042l = new ArrayList<>();
        this.f46034d = k12;
        this.f46035e = fVar;
        if (fVar != f46027p && fVar != f46028q && fVar != f46029r) {
            if (fVar == f46030s) {
                this.f46040j = 0.00390625f;
                return;
            } else if (fVar != f46025n && fVar != f46026o) {
                this.f46040j = 1.0f;
                return;
            } else {
                this.f46040j = 0.00390625f;
                return;
            }
        }
        this.f46040j = 0.1f;
    }
}
