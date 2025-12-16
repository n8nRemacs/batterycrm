package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.android.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public e f44904a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    @j.X
    public static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f44909e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final androidx.interpolator.view.animation.a f44910f = new androidx.interpolator.view.animation.a();

        /* renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f44911g = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat.java */
        @j.X
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f44912a;

            /* renamed from: b, reason: collision with root package name */
            public J0 f44913b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.G0$c$a$a, reason: collision with other inner class name */
            public class C1749a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ G0 f44914a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ J0 f44915b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ J0 f44916c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f44917d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f44918e;

                public C1749a(G0 g02, J0 j02, J0 j03, int i12, View view) {
                    this.f44914a = g02;
                    this.f44915b = j02;
                    this.f44916c = j03;
                    this.f44917d = i12;
                    this.f44918e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f12;
                    G0 g02;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    G0 g03 = this.f44914a;
                    g03.f44904a.d(animatedFraction);
                    float fB2 = g03.f44904a.b();
                    PathInterpolator pathInterpolator = c.f44909e;
                    J0 j02 = this.f44915b;
                    J0.b bVar = new J0.b(j02);
                    int i12 = 1;
                    while (i12 <= 256) {
                        int i13 = this.f44917d & i12;
                        J0.l lVar = j02.f44940a;
                        if (i13 == 0) {
                            bVar.b(i12, lVar.g(i12));
                            f12 = fB2;
                            g02 = g03;
                        } else {
                            C22771k c22771kG = lVar.g(i12);
                            C22771k c22771kG2 = this.f44916c.f44940a.g(i12);
                            int i14 = (int) (((c22771kG.f44775a - c22771kG2.f44775a) * r10) + 0.5d);
                            int i15 = (int) (((c22771kG.f44776b - c22771kG2.f44776b) * r10) + 0.5d);
                            f12 = fB2;
                            int i16 = (int) (((c22771kG.f44777c - c22771kG2.f44777c) * r10) + 0.5d);
                            float f13 = (c22771kG.f44778d - c22771kG2.f44778d) * (1.0f - fB2);
                            g02 = g03;
                            bVar.b(i12, J0.n(c22771kG, i14, i15, i16, (int) (f13 + 0.5d)));
                        }
                        i12 <<= 1;
                        fB2 = f12;
                        g03 = g02;
                    }
                    c.g(this.f44918e, bVar.f44941a.b(), Collections.singletonList(g03));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ G0 f44919a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f44920b;

                public b(View view, G0 g02) {
                    this.f44919a = g02;
                    this.f44920b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    G0 g02 = this.f44919a;
                    g02.f44904a.d(1.0f);
                    c.e(this.f44920b, g02);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.G0$c$a$c, reason: collision with other inner class name */
            public class RunnableC1750c implements Runnable {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f44921b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ G0 f44922c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f44923d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f44924e;

                public RunnableC1750c(View view, G0 g02, a aVar, ValueAnimator valueAnimator) {
                    this.f44921b = view;
                    this.f44922c = g02;
                    this.f44923d = aVar;
                    this.f44924e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.f44921b, this.f44922c, this.f44923d);
                    this.f44924e.start();
                }
            }

            public a(@j.N View view, @j.N b bVar) {
                this.f44912a = bVar;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                J0 j0A = C22823h0.e.a(view);
                this.f44913b = j0A != null ? new J0.b(j0A).f44941a.b() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                J0.l lVar;
                if (!view.isLaidOut()) {
                    this.f44913b = J0.s(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                J0 j0S = J0.s(view, windowInsets);
                if (this.f44913b == null) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    this.f44913b = C22823h0.e.a(view);
                }
                if (this.f44913b == null) {
                    this.f44913b = j0S;
                    return c.i(view, windowInsets);
                }
                b bVarJ = c.j(view);
                if (bVarJ != null && Objects.equals(bVarJ.f44907b, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                J0 j02 = this.f44913b;
                int i12 = 1;
                int i13 = 0;
                while (true) {
                    lVar = j0S.f44940a;
                    if (i12 > 256) {
                        break;
                    }
                    if (!lVar.g(i12).equals(j02.f44940a.g(i12))) {
                        i13 |= i12;
                    }
                    i12 <<= 1;
                }
                if (i13 == 0) {
                    return c.i(view, windowInsets);
                }
                J0 j03 = this.f44913b;
                G0 g02 = new G0(i13, (i13 & 8) != 0 ? lVar.g(8).f44778d > j03.f44940a.g(8).f44778d ? c.f44909e : c.f44910f : c.f44911g, 160L);
                g02.f44904a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(g02.f44904a.a());
                C22771k c22771kG = lVar.g(i13);
                C22771k c22771kG2 = j03.f44940a.g(i13);
                int iMin = Math.min(c22771kG.f44775a, c22771kG2.f44775a);
                int i14 = c22771kG.f44776b;
                int i15 = c22771kG2.f44776b;
                int iMin2 = Math.min(i14, i15);
                int i16 = c22771kG.f44777c;
                int i17 = c22771kG2.f44777c;
                int iMin3 = Math.min(i16, i17);
                int i18 = c22771kG.f44778d;
                int i19 = i13;
                int i22 = c22771kG2.f44778d;
                a aVar = new a(C22771k.b(iMin, iMin2, iMin3, Math.min(i18, i22)), C22771k.b(Math.max(c22771kG.f44775a, c22771kG2.f44775a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i22)));
                c.f(view, g02, windowInsets, false);
                duration.addUpdateListener(new C1749a(g02, j0S, j03, i19, view));
                duration.addListener(new b(view, g02));
                P.b(view, new RunnableC1750c(view, g02, aVar, duration));
                this.f44913b = j0S;
                return c.i(view, windowInsets);
            }
        }

        public static void e(@j.N View view, @j.N G0 g02) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.b(g02);
                if (bVarJ.f44908c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    e(viewGroup.getChildAt(i12), g02);
                }
            }
        }

        public static void f(View view, G0 g02, WindowInsets windowInsets, boolean z12) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.f44907b = windowInsets;
                if (!z12) {
                    bVarJ.c(g02);
                    z12 = bVarJ.f44908c == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    f(viewGroup.getChildAt(i12), g02, windowInsets, z12);
                }
            }
        }

        public static void g(@j.N View view, @j.N J0 j02, @j.N List<G0> list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                j02 = bVarJ.d(j02, list);
                if (bVarJ.f44908c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    g(viewGroup.getChildAt(i12), j02, list);
                }
            }
        }

        public static void h(View view, G0 g02, a aVar) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.e(g02, aVar);
                if (bVarJ.f44908c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    h(viewGroup.getChildAt(i12), g02, aVar);
                }
            }
        }

        @j.N
        public static WindowInsets i(@j.N View view, @j.N WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @j.P
        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f44912a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    @j.X
    public static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        @j.N
        public final WindowInsetsAnimation f44925e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @j.X
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final b f44926a;

            /* renamed from: b, reason: collision with root package name */
            public List<G0> f44927b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList<G0> f44928c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, G0> f44929d;

            public a(@j.N b bVar) {
                super(bVar.f44908c);
                this.f44929d = new HashMap<>();
                this.f44926a = bVar;
            }

            @j.N
            public final G0 a(@j.N WindowInsetsAnimation windowInsetsAnimation) {
                G0 g02 = this.f44929d.get(windowInsetsAnimation);
                if (g02 == null) {
                    g02 = new G0(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        g02.f44904a = new d(windowInsetsAnimation);
                    }
                    this.f44929d.put(windowInsetsAnimation, g02);
                }
                return g02;
            }

            public final void onEnd(@j.N WindowInsetsAnimation windowInsetsAnimation) {
                this.f44926a.b(a(windowInsetsAnimation));
                this.f44929d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(@j.N WindowInsetsAnimation windowInsetsAnimation) {
                this.f44926a.c(a(windowInsetsAnimation));
            }

            @j.N
            public final WindowInsets onProgress(@j.N WindowInsets windowInsets, @j.N List<WindowInsetsAnimation> list) {
                ArrayList<G0> arrayList = this.f44928c;
                if (arrayList == null) {
                    ArrayList<G0> arrayList2 = new ArrayList<>(list.size());
                    this.f44928c = arrayList2;
                    this.f44927b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationJ = W.j(list.get(size));
                    G0 g0A = a(windowInsetsAnimationJ);
                    g0A.f44904a.d(windowInsetsAnimationJ.getFraction());
                    this.f44928c.add(g0A);
                }
                return this.f44926a.d(J0.s(null, windowInsets), this.f44927b).r();
            }

            @j.N
            public final WindowInsetsAnimation.Bounds onStart(@j.N WindowInsetsAnimation windowInsetsAnimation, @j.N WindowInsetsAnimation.Bounds bounds) {
                a aVarE = this.f44926a.e(a(windowInsetsAnimation), new a(bounds));
                aVarE.getClass();
                W.k();
                return W.h(aVarE.f44905a.e(), aVarE.f44906b.e());
            }
        }

        public d(@j.N WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f44925e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.G0.e
        public final long a() {
            return this.f44925e.getDurationMillis();
        }

        @Override // androidx.core.view.G0.e
        public final float b() {
            return this.f44925e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.G0.e
        public final int c() {
            return this.f44925e.getTypeMask();
        }

        @Override // androidx.core.view.G0.e
        public final void d(float f12) {
            this.f44925e.setFraction(f12);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f44930a;

        /* renamed from: b, reason: collision with root package name */
        public float f44931b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final Interpolator f44932c;

        /* renamed from: d, reason: collision with root package name */
        public final long f44933d;

        public e(int i12, @j.P Interpolator interpolator, long j12) {
            this.f44930a = i12;
            this.f44932c = interpolator;
            this.f44933d = j12;
        }

        public long a() {
            return this.f44933d;
        }

        public float b() {
            Interpolator interpolator = this.f44932c;
            return interpolator != null ? interpolator.getInterpolation(this.f44931b) : this.f44931b;
        }

        public int c() {
            return this.f44930a;
        }

        public void d(float f12) {
            this.f44931b = f12;
        }
    }

    public G0(int i12, @j.P Interpolator interpolator, long j12) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f44904a = new d(W.i(i12, interpolator, j12));
        } else {
            this.f44904a = new c(i12, interpolator, j12);
        }
    }

    public final long a() {
        return this.f44904a.a();
    }

    public final float b() {
        return this.f44904a.b();
    }

    public final int c() {
        return this.f44904a.c();
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C22771k f44905a;

        /* renamed from: b, reason: collision with root package name */
        public final C22771k f44906b;

        public a(@j.N C22771k c22771k, @j.N C22771k c22771k2) {
            this.f44905a = c22771k;
            this.f44906b = c22771k2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f44905a + " upper=" + this.f44906b + "}";
        }

        @j.X
        public a(@j.N WindowInsetsAnimation.Bounds bounds) {
            this.f44905a = C22771k.d(bounds.getLowerBound());
            this.f44906b = C22771k.d(bounds.getUpperBound());
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public WindowInsets f44907b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44908c;

        /* compiled from: WindowInsetsAnimationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }

        public b(int i12) {
            this.f44908c = i12;
        }

        @j.N
        public abstract J0 d(@j.N J0 j02, @j.N List<G0> list);

        public void b(@j.N G0 g02) {
        }

        public void c(@j.N G0 g02) {
        }

        @j.N
        public a e(@j.N G0 g02, @j.N a aVar) {
            return aVar;
        }
    }
}
