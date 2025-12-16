package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.C22808a;
import androidx.core.view.C22814d;
import androidx.core.view.G0;
import androidx.core.view.J0;
import androidx.core.view.accessibility.f;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22823h0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, A0> f45055a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f45056b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f45057c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f45058d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final C22813c0 f45059e = new C22813c0();

    /* renamed from: f, reason: collision with root package name */
    public static final a f45060f = new a();

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.h0$b */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f45062a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f45063b;

        /* renamed from: c, reason: collision with root package name */
        public final int f45064c;

        /* renamed from: d, reason: collision with root package name */
        public final int f45065d;

        public b() {
            throw null;
        }

        public b(int i12, Class<T> cls, int i13, int i14) {
            this.f45062a = i12;
            this.f45063b = cls;
            this.f45065d = i13;
            this.f45064c = i14;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t12);

        public final T c(View view) {
            if (Build.VERSION.SDK_INT >= this.f45064c) {
                return a(view);
            }
            T t12 = (T) view.getTag(this.f45062a);
            if (this.f45063b.isInstance(t12)) {
                return t12;
            }
            return null;
        }

        public final void d(View view, T t12) {
            if (Build.VERSION.SDK_INT >= this.f45064c) {
                b(view, t12);
                return;
            }
            if (e(c(view), t12)) {
                C22808a c22808aF = C22823h0.f(view);
                if (c22808aF == null) {
                    c22808aF = new C22808a();
                }
                C22823h0.C(view, c22808aF);
                view.setTag(this.f45062a, t12);
                C22823h0.u(view, this.f45065d);
            }
        }

        public boolean e(T t12, T t13) {
            return !t13.equals(t12);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$c */
    public static class c {
        private c() {
        }

        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$d */
    public static class d {

        /* compiled from: ViewCompat.java */
        /* renamed from: androidx.core.view.h0$d$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public J0 f45066a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f45067b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ M f45068c;

            public a(View view, M m12) {
                this.f45067b = view;
                this.f45068c = m12;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                J0 j0S = J0.s(view, windowInsets);
                int i12 = Build.VERSION.SDK_INT;
                M m12 = this.f45068c;
                if (i12 < 30) {
                    d.a(windowInsets, this.f45067b);
                    if (j0S.equals(this.f45066a)) {
                        return m12.h(view, j0S).r();
                    }
                }
                this.f45066a = j0S;
                J0 j0H = m12.h(view, j0S);
                if (i12 >= 30) {
                    return j0H.r();
                }
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                c.c(view);
                return j0H.r();
            }
        }

        private d() {
        }

        public static void a(@j.N WindowInsets windowInsets, @j.N View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static J0 b(@j.N View view, @j.N J0 j02, @j.N Rect rect) {
            WindowInsets windowInsetsR = j02.r();
            if (windowInsetsR != null) {
                return J0.s(view, view.computeSystemWindowInsets(windowInsetsR, rect));
            }
            rect.setEmpty();
            return j02;
        }

        public static boolean c(View view, int i12, int i13, int i14, int i15, int[] iArr) {
            return view.dispatchNestedScroll(i12, i13, i14, i15, iArr);
        }

        public static ColorStateList d(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode e(View view) {
            return view.getBackgroundTintMode();
        }

        public static float f(View view) {
            return view.getElevation();
        }

        public static String g(View view) {
            return view.getTransitionName();
        }

        public static float h(View view) {
            return view.getTranslationZ();
        }

        public static float i(@j.N View view) {
            return view.getZ();
        }

        public static boolean j(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void k(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void l(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void m(View view, float f12) {
            view.setElevation(f12);
        }

        public static void n(View view, boolean z12) {
            view.setNestedScrollingEnabled(z12);
        }

        public static void o(@j.N View view, @j.P M m12) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, m12);
            }
            if (m12 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, m12));
            }
        }

        public static void p(View view, String str) {
            view.setTransitionName(str);
        }

        public static void q(View view, float f12) {
            view.setTranslationZ(f12);
        }

        public static void r(@j.N View view, float f12) {
            view.setZ(f12);
        }

        public static boolean s(View view, int i12) {
            return view.startNestedScroll(i12);
        }

        public static void t(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$e */
    public static class e {
        private e() {
        }

        @j.P
        public static J0 a(@j.N View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            J0 j0S = J0.s(null, rootWindowInsets);
            J0.l lVar = j0S.f44940a;
            lVar.t(j0S);
            lVar.d(view.getRootView());
            return j0S;
        }

        public static void b(@j.N View view, int i12, int i13) {
            view.setScrollIndicators(i12, i13);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$f */
    public static class f {
        private f() {
        }

        public static void a(@j.N View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$g */
    public static class g {
        private g() {
        }

        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i12) {
            view.setImportantForAutofill(i12);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$h */
    public static class h {
        private h() {
        }

        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z12) {
            view.setAccessibilityHeading(z12);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z12) {
            view.setScreenReaderFocusable(z12);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$i */
    public static class i {
        private i() {
        }

        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(@j.N View view, @j.N Context context, @j.N int[] iArr, @j.P AttributeSet attributeSet, @j.N TypedArray typedArray, int i12, int i13) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i12, i13);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$j */
    public static class j {
        private j() {
        }

        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        @j.P
        public static L0 b(@j.N View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new L0(windowInsetsController);
            }
            return null;
        }

        public static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$k */
    public static final class k {
        private k() {
        }

        @j.P
        public static String[] a(@j.N View view) {
            return view.getReceiveContentMimeTypes();
        }

        @j.P
        public static C22814d b(@j.N View view, @j.N C22814d c22814d) {
            ContentInfo contentInfoF = c22814d.f45033a.f();
            Objects.requireNonNull(contentInfoF);
            ContentInfo contentInfoE = C22812c.e(contentInfoF);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoE);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoE ? c22814d : new C22814d(new C22814d.f(contentInfoPerformReceiveContent));
        }
    }

    /* compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.h0$l */
    public @interface l {
    }

    /* compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.h0$m */
    public @interface m {
    }

    /* compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.h0$n */
    public @interface n {
    }

    /* compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.h0$o */
    public @interface o {
    }

    /* compiled from: ViewCompat.java */
    @j.X
    /* renamed from: androidx.core.view.h0$p */
    public static final class p implements OnReceiveContentListener {
        @j.P
        public final ContentInfo onReceiveContent(@j.N View view, @j.N ContentInfo contentInfo) {
            new C22814d.f(contentInfo);
            throw null;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.h0$q */
    public interface q {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.h0$r */
    public @interface r {
    }

    /* compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.view.h0$s */
    public @interface s {
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.h0$t */
    public static class t {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f45069d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public WeakHashMap<View, Boolean> f45070a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f45071b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f45072c = null;

        public static boolean b(@j.N View view, @j.N KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        @j.P
        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f45070a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewA != null) {
                            return viewA;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    @Deprecated
    public C22823h0() {
    }

    public static void A(@j.N View view) {
        c.c(view);
    }

    public static void B(@j.N View view, @j.N @SuppressLint({"ContextFirst"}) Context context, @j.N int[] iArr, @j.P AttributeSet attributeSet, @j.N TypedArray typedArray, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.b(view, context, iArr, attributeSet, typedArray, i12, 0);
        }
    }

    public static void C(@j.N View view, @j.P C22808a c22808a) {
        if (c22808a == null && (g(view) instanceof C22808a.C1751a)) {
            c22808a = new C22808a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c22808a == null ? null : c22808a.f44992b);
    }

    @j.j0
    public static void D(@j.N View view, boolean z12) {
        new C22821g0(R.id.tag_accessibility_heading, Boolean.class, 0, 28).d(view, Boolean.valueOf(z12));
    }

    @j.j0
    public static void E(@j.N View view, @j.P CharSequence charSequence) {
        new C22817e0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view, charSequence);
        a aVar = f45060f;
        if (charSequence == null) {
            aVar.f45061b.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.f45061b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static void F(@j.N View view, @j.P ColorStateList colorStateList) {
        d.k(view, colorStateList);
    }

    public static void G(@j.N View view, @j.P PorterDuff.Mode mode) {
        d.l(view, mode);
    }

    public static void H(@j.N View view, float f12) {
        d.m(view, f12);
    }

    public static void I(@j.N ViewGroup viewGroup, int i12) {
        g.b(viewGroup, i12);
    }

    public static void J(@j.N View view, boolean z12) {
        d.n(view, z12);
    }

    public static void K(@j.N View view, @j.P M m12) {
        d.o(view, m12);
    }

    public static void L(@j.N ViewGroup viewGroup, @j.P Q q12) {
        f.a(viewGroup, q12 != null ? q12.f44979a : null);
    }

    @j.j0
    public static void M(@j.N View view, boolean z12) {
        new C22815d0(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).d(view, Boolean.valueOf(z12));
    }

    public static void N(@j.N ViewGroup viewGroup, int i12) {
        e.b(viewGroup, i12, 3);
    }

    @j.j0
    public static void O(@j.N View view, @j.P CharSequence charSequence) {
        new C22819f0(R.id.tag_state_description, CharSequence.class, 64, 30).d(view, charSequence);
    }

    public static void P(@j.N View view, @j.P String str) {
        d.p(view, str);
    }

    public static void Q(@j.N View view, float f12) {
        d.q(view, f12);
    }

    public static void R(@j.N View view, @j.P G0.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new G0.d.a(bVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = G0.c.f44909e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (bVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener aVar = new G0.c.a(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    public static void S(@j.N View view, float f12) {
        d.r(view, f12);
    }

    public static void T(@j.N ViewGroup viewGroup) {
        d.s(viewGroup, 1);
    }

    public static void U(@j.N ViewGroup viewGroup) {
        d.t(viewGroup);
    }

    @j.N
    @Deprecated
    public static A0 a(@j.N View view) {
        if (f45055a == null) {
            f45055a = new WeakHashMap<>();
        }
        A0 a02 = f45055a.get(view);
        if (a02 != null) {
            return a02;
        }
        A0 a03 = new A0(view);
        f45055a.put(view, a03);
        return a03;
    }

    @j.N
    public static void b(@j.N View view, @j.N J0 j02, @j.N Rect rect) {
        d.b(view, j02, rect);
    }

    @j.N
    public static J0 c(@j.N View view, @j.N J0 j02) {
        WindowInsets windowInsetsR = j02.r();
        if (windowInsetsR != null) {
            WindowInsets windowInsetsA = c.a(view, windowInsetsR);
            if (!windowInsetsA.equals(windowInsetsR)) {
                return J0.s(view, windowInsetsA);
            }
        }
        return j02;
    }

    public static void d(@j.N ViewGroup viewGroup) {
        d.c(viewGroup, 0, 0, 1, 0, null);
    }

    @j.j0
    public static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = t.f45069d;
        t tVar = (t) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (tVar == null) {
            tVar = new t();
            view.setTag(R.id.tag_unhandled_key_event_manager, tVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = tVar.f45070a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = t.f45069d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (tVar.f45070a == null) {
                            tVar.f45070a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = t.f45069d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                tVar.f45070a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    tVar.f45070a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = tVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (tVar.f45071b == null) {
                    tVar.f45071b = new SparseArray<>();
                }
                tVar.f45071b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    @j.P
    public static C22808a f(@j.N View view) {
        View.AccessibilityDelegate accessibilityDelegateG = g(view);
        if (accessibilityDelegateG == null) {
            return null;
        }
        return accessibilityDelegateG instanceof C22808a.C1751a ? ((C22808a.C1751a) accessibilityDelegateG).f44993a : new C22808a(accessibilityDelegateG);
    }

    @j.P
    public static View.AccessibilityDelegate g(@j.N View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (f45057c) {
            return null;
        }
        if (f45056b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f45056b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f45057c = true;
                return null;
            }
        }
        try {
            Object obj = f45056b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f45057c = true;
            return null;
        }
    }

    @j.j0
    @j.P
    public static CharSequence h(@j.N View view) {
        return new C22817e0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view);
    }

    public static ArrayList i(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    @j.P
    public static ColorStateList j(@j.N View view) {
        return d.d(view);
    }

    @j.P
    public static PorterDuff.Mode k(@j.N View view) {
        return d.e(view);
    }

    public static float l(@j.N View view) {
        return d.f(view);
    }

    @SuppressLint({"InlinedApi"})
    public static int m(@j.N RecyclerView recyclerView) {
        return g.a(recyclerView);
    }

    @j.P
    public static String[] n(@j.N AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @j.P
    public static J0 o(@j.N View view) {
        return e.a(view);
    }

    @j.P
    public static String p(@j.N View view) {
        return d.g(view);
    }

    public static float q(@j.N View view) {
        return d.h(view);
    }

    @j.P
    @Deprecated
    public static L0 r(@j.N View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new L0(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static float s(@j.N View view) {
        return d.i(view);
    }

    public static boolean t(@j.N View view) {
        return d.j(view);
    }

    public static void u(View view, int i12) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z12 = h(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z12) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z12 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i12);
                if (z12) {
                    accessibilityEventObtain.getText().add(h(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i12 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i12);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i12);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(h(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @j.N
    public static J0 v(@j.N View view, @j.N J0 j02) {
        WindowInsets windowInsetsR = j02.r();
        if (windowInsetsR != null) {
            WindowInsets windowInsetsB = c.b(view, windowInsetsR);
            if (!windowInsetsB.equals(windowInsetsR)) {
                return J0.s(view, windowInsetsB);
            }
        }
        return j02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.P
    public static C22814d w(@j.N View view, @j.N C22814d c22814d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c22814d);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, c22814d);
        }
        N n12 = (N) view.getTag(R.id.tag_on_receive_content_listener);
        O o12 = f45059e;
        if (n12 == null) {
            if (view instanceof O) {
                o12 = (O) view;
            }
            return o12.onReceiveContent(c22814d);
        }
        C22814d c22814dA = n12.a(view, c22814d);
        if (c22814dA == null) {
            return null;
        }
        if (view instanceof O) {
            o12 = (O) view;
        }
        return o12.onReceiveContent(c22814dA);
    }

    public static void x(@j.N View view, int i12) {
        y(view, i12);
        u(view, 0);
    }

    public static void y(View view, int i12) {
        ArrayList arrayListI = i(view);
        for (int i13 = 0; i13 < arrayListI.size(); i13++) {
            if (((f.a) arrayListI.get(i13)).a() == i12) {
                arrayListI.remove(i13);
                return;
            }
        }
    }

    public static void z(@j.N View view, @j.N f.a aVar, @j.P androidx.core.view.accessibility.i iVar) {
        if (iVar == null) {
            x(view, aVar.a());
            return;
        }
        f.a aVar2 = new f.a(null, aVar.f45018b, null, iVar, aVar.f45019c);
        C22808a c22808aF = f(view);
        if (c22808aF == null) {
            c22808aF = new C22808a();
        }
        C(view, c22808aF);
        y(view, aVar2.a());
        i(view).add(aVar2);
        u(view, 0);
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: androidx.core.view.h0$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f45061b = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f45061b.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z12 = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z12) {
                        C22823h0.u(key, z12 ? 16 : 32);
                        entry.setValue(Boolean.valueOf(z12));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
