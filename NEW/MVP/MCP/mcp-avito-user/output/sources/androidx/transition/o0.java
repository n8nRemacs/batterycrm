package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.C23490a;
import androidx.transition.L;
import com.avito.android.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* compiled from: Visibility.java */
/* loaded from: classes10.dex */
public abstract class o0 extends L {

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f54814C = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: B, reason: collision with root package name */
    public int f54815B = 3;

    /* compiled from: Visibility.java */
    public class a extends P {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f54816a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f54817b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f54818c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f54816a = viewGroup;
            this.f54817b = view;
            this.f54818c = view2;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void a() {
            Z z12 = new Z(this.f54816a);
            z12.f54732a.remove(this.f54817b);
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void c() {
            View view = this.f54817b;
            if (view.getParent() == null) {
                new Z(this.f54816a).f54732a.add(view);
            } else {
                o0.this.cancel();
            }
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@j.N L l12) {
            this.f54818c.setTag(R.id.save_overlay_view, null);
            Z z12 = new Z(this.f54816a);
            z12.f54732a.remove(this.f54817b);
            l12.A(this);
        }
    }

    /* compiled from: Visibility.java */
    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    /* compiled from: Visibility.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f54826a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f54827b;

        /* renamed from: c, reason: collision with root package name */
        public int f54828c;

        /* renamed from: d, reason: collision with root package name */
        public int f54829d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f54830e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f54831f;
    }

    public static void M(V v12) {
        Integer numValueOf = Integer.valueOf(v12.f54717b.getVisibility());
        HashMap map = v12.f54716a;
        map.put("android:visibility:visibility", numValueOf);
        map.put("android:visibility:parent", v12.f54717b.getParent());
        int[] iArr = new int[2];
        v12.f54717b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.transition.o0.d N(androidx.transition.V r8, androidx.transition.V r9) {
        /*
            androidx.transition.o0$d r0 = new androidx.transition.o0$d
            r0.<init>()
            r1 = 0
            r0.f54826a = r1
            r0.f54827b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f54716a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f54828c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f54830e = r6
            goto L33
        L2f:
            r0.f54828c = r3
            r0.f54830e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f54716a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f54829d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f54831f = r2
            goto L56
        L52:
            r0.f54829d = r3
            r0.f54831f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f54828c
            int r9 = r0.f54829d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f54830e
            android.view.ViewGroup r4 = r0.f54831f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f54827b = r1
            r0.f54826a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f54827b = r2
            r0.f54826a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f54831f
            if (r8 != 0) goto L81
            r0.f54827b = r1
            r0.f54826a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f54830e
            if (r8 != 0) goto L9f
            r0.f54827b = r2
            r0.f54826a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f54829d
            if (r8 != 0) goto L95
            r0.f54827b = r2
            r0.f54826a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f54828c
            if (r8 != 0) goto L9f
            r0.f54827b = r1
            r0.f54826a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o0.N(androidx.transition.V, androidx.transition.V):androidx.transition.o0$d");
    }

    @j.P
    public Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        return null;
    }

    @j.P
    public Animator P(ViewGroup viewGroup, V v12, int i12, V v13, int i13) {
        if ((this.f54815B & 1) != 1 || v13 == null) {
            return null;
        }
        if (v12 == null) {
            View view = (View) v13.f54717b.getParent();
            if (N(t(view, false), w(view, false)).f54826a) {
                return null;
            }
        }
        return O(viewGroup, v13.f54717b, v12, v13);
    }

    @j.P
    public Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator R(android.view.ViewGroup r20, androidx.transition.V r21, int r22, androidx.transition.V r23, int r24) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.o0.R(android.view.ViewGroup, androidx.transition.V, int, androidx.transition.V, int):android.animation.Animator");
    }

    public final void S(int i12) {
        if ((i12 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f54815B = i12;
    }

    @Override // androidx.transition.L
    public void f(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    public void j(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    @j.P
    public final Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) {
        d dVarN = N(v12, v13);
        if (!dVarN.f54826a) {
            return null;
        }
        if (dVarN.f54830e == null && dVarN.f54831f == null) {
            return null;
        }
        return dVarN.f54827b ? P(viewGroup, v12, dVarN.f54828c, v13, dVarN.f54829d) : R(viewGroup, v12, dVarN.f54828c, v13, dVarN.f54829d);
    }

    @Override // androidx.transition.L
    @j.P
    public final String[] v() {
        return f54814C;
    }

    @Override // androidx.transition.L
    public final boolean x(@j.P V v12, @j.P V v13) {
        if (v12 == null && v13 == null) {
            return false;
        }
        if (v12 != null && v13 != null && v13.f54716a.containsKey("android:visibility:visibility") != v12.f54716a.containsKey("android:visibility:visibility")) {
            return false;
        }
        d dVarN = N(v12, v13);
        if (dVarN.f54826a) {
            return dVarN.f54828c == 0 || dVarN.f54829d == 0;
        }
        return false;
    }

    /* compiled from: Visibility.java */
    public static class b extends AnimatorListenerAdapter implements L.f, C23490a.InterfaceC1930a {

        /* renamed from: a, reason: collision with root package name */
        public final View f54820a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54821b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f54822c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f54824e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f54825f = false;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f54823d = true;

        public b(View view, int i12) {
            this.f54820a = view;
            this.f54821b = i12;
            this.f54822c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // androidx.transition.L.f
        public final void a() {
            f(false);
        }

        @Override // androidx.transition.L.f
        public final void c() {
            f(true);
        }

        @Override // androidx.transition.L.f
        public final void e(@j.N L l12) {
            if (!this.f54825f) {
                h0.c(this.f54820a, this.f54821b);
                ViewGroup viewGroup = this.f54822c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            l12.A(this);
        }

        public final void f(boolean z12) {
            ViewGroup viewGroup;
            if (!this.f54823d || this.f54824e == z12 || (viewGroup = this.f54822c) == null) {
                return;
            }
            this.f54824e = z12;
            b0.a(viewGroup, z12);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f54825f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f54825f) {
                h0.c(this.f54820a, this.f54821b);
                ViewGroup viewGroup = this.f54822c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f54825f) {
                return;
            }
            h0.c(this.f54820a, this.f54821b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f54825f) {
                return;
            }
            h0.c(this.f54820a, 0);
        }

        @Override // androidx.transition.L.f
        public final void b() {
        }

        @Override // androidx.transition.L.f
        public final void d(@j.N L l12) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
