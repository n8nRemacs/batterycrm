package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final a f44982a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    @j.X
    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final View f44983a;

        public a(@j.P View view) {
            this.f44983a = view;
        }

        public void a() {
            View view = this.f44983a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View viewFindViewById;
            View view = this.f44983a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new U(viewFindViewById, 0));
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    @j.X
    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public View f44984b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public WindowInsetsController f44985c;

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.X] */
        @Override // androidx.core.view.V.a
        public final void a() {
            WindowInsetsController windowInsetsController = this.f44985c;
            View view = this.f44984b;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.X
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i12) {
                    atomicBoolean.set((i12 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.V.a
        public final void b() {
            View view = this.f44984b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f44985c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class c {
    }

    public V(@j.N View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f44982a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f44984b = view;
        this.f44982a = bVar;
    }

    public final void a() {
        this.f44982a.a();
    }

    public final void b() {
        this.f44982a.b();
    }

    @j.X
    @Deprecated
    public V(@j.N WindowInsetsController windowInsetsController) {
        b bVar = new b(null);
        bVar.f44985c = windowInsetsController;
        this.f44982a = bVar;
    }
}
