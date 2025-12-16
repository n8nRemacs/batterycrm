package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* compiled from: Slide.java */
/* loaded from: classes10.dex */
public class J extends o0 {

    /* renamed from: E, reason: collision with root package name */
    public static final DecelerateInterpolator f54653E = new DecelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    public static final AccelerateInterpolator f54654F = new AccelerateInterpolator();

    /* renamed from: G, reason: collision with root package name */
    public static final a f54655G = new a();

    /* renamed from: H, reason: collision with root package name */
    public static final b f54656H = new b();

    /* renamed from: I, reason: collision with root package name */
    public static final c f54657I = new c();

    /* renamed from: J, reason: collision with root package name */
    public static final d f54658J = new d();

    /* renamed from: K, reason: collision with root package name */
    public static final e f54659K = new e();

    /* renamed from: L, reason: collision with root package name */
    public static final f f54660L = new f();

    /* renamed from: D, reason: collision with root package name */
    public g f54661D = f54660L;

    /* compiled from: Slide.java */
    public class a extends h {
        public a() {
            super(null);
        }

        @Override // androidx.transition.J.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class b extends h {
        public b() {
            super(null);
        }

        @Override // androidx.transition.J.g
        public final float a(View view, ViewGroup viewGroup) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class c extends i {
        public c() {
            super(null);
        }

        @Override // androidx.transition.J.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // androidx.transition.J.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class e extends h {
        public e() {
            super(null);
        }

        @Override // androidx.transition.J.g
        public final float a(View view, ViewGroup viewGroup) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    public class f extends i {
        public f() {
            super(null);
        }

        @Override // androidx.transition.J.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    public interface g {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    /* compiled from: Slide.java */
    public static abstract class h implements g {
        public h() {
        }

        @Override // androidx.transition.J.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* compiled from: Slide.java */
    public static abstract class i implements g {
        public i() {
        }

        @Override // androidx.transition.J.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* compiled from: Slide.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface j {
    }

    public J() {
        T(80);
    }

    @Override // androidx.transition.o0
    @j.P
    public final Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        if (v13 == null) {
            return null;
        }
        int[] iArr = (int[]) v13.f54716a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return X.a(view, v13, iArr[0], iArr[1], this.f54661D.a(view, viewGroup), this.f54661D.b(view, viewGroup), translationX, translationY, f54653E, this);
    }

    @Override // androidx.transition.o0
    @j.P
    public final Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        if (v12 == null) {
            return null;
        }
        int[] iArr = (int[]) v12.f54716a.get("android:slide:screenPosition");
        return X.a(view, v12, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f54661D.a(view, viewGroup), this.f54661D.b(view, viewGroup), f54654F, this);
    }

    public final void T(int i12) {
        if (i12 == 3) {
            this.f54661D = f54655G;
        } else if (i12 == 5) {
            this.f54661D = f54658J;
        } else if (i12 == 48) {
            this.f54661D = f54657I;
        } else if (i12 == 80) {
            this.f54661D = f54660L;
        } else if (i12 == 8388611) {
            this.f54661D = f54656H;
        } else {
            if (i12 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f54661D = f54659K;
        }
        I i13 = new I();
        i13.f54652c = i12;
        this.f54685v = i13;
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void f(@j.N V v12) {
        o0.M(v12);
        int[] iArr = new int[2];
        v12.f54717b.getLocationOnScreen(iArr);
        v12.f54716a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@j.N V v12) {
        o0.M(v12);
        int[] iArr = new int[2];
        v12.f54717b.getLocationOnScreen(iArr);
        v12.f54716a.put("android:slide:screenPosition", iArr);
    }

    public J(int i12) {
        T(i12);
    }
}
