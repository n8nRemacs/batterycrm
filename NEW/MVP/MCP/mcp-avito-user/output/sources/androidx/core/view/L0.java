package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.o1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f44970a;

    /* compiled from: WindowInsetsControllerCompat.java */
    @j.X
    public static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final Window f44971a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final V f44972b;

        public a(@j.N Window window, @j.N V v12) {
            this.f44971a = window;
            this.f44972b = v12;
        }

        @Override // androidx.core.view.L0.g
        public final void a(int i12) {
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i12 & i13) != 0) {
                    if (i13 == 1) {
                        h(4);
                    } else if (i13 == 2) {
                        h(2);
                    } else if (i13 == 8) {
                        this.f44972b.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.L0.g
        public final void f() {
            this.f44971a.getDecorView().setTag(356039078, 2);
            i(2048);
            h(4096);
        }

        @Override // androidx.core.view.L0.g
        public final void g(int i12) {
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i12 & i13) != 0) {
                    if (i13 == 1) {
                        i(4);
                        this.f44971a.clearFlags(1024);
                    } else if (i13 == 2) {
                        i(2);
                    } else if (i13 == 8) {
                        this.f44972b.b();
                    }
                }
            }
        }

        public final void h(int i12) {
            View decorView = this.f44971a.getDecorView();
            decorView.setSystemUiVisibility(i12 | decorView.getSystemUiVisibility());
        }

        public final void i(int i12) {
            View decorView = this.f44971a.getDecorView();
            decorView.setSystemUiVisibility((~i12) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @j.X
    public static class b extends a {
        @Override // androidx.core.view.L0.g
        public final boolean c() {
            return (this.f44971a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.L0.g
        public final void e(boolean z12) {
            if (!z12) {
                i(8192);
                return;
            }
            Window window = this.f44971a;
            window.clearFlags(67108864);
            window.addFlags(BeduinInputModel.MIN_TEXT_VERSION);
            h(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @j.X
    public static class c extends b {
        @Override // androidx.core.view.L0.g
        public final boolean b() {
            return (this.f44971a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.L0.g
        public final void d(boolean z12) {
            if (!z12) {
                i(16);
                return;
            }
            Window window = this.f44971a;
            window.clearFlags(134217728);
            window.addFlags(BeduinInputModel.MIN_TEXT_VERSION);
            h(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @j.X
    public static class e extends d {
        @Override // androidx.core.view.L0.d, androidx.core.view.L0.g
        public final void f() {
            this.f44973a.setSystemBarsBehavior(2);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @j.X
    public static class f extends e {
        @Override // androidx.core.view.L0.d, androidx.core.view.L0.g
        public final boolean b() {
            return (this.f44973a.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.L0.d, androidx.core.view.L0.g
        public final boolean c() {
            return (this.f44973a.getSystemBarsAppearance() & 8) != 0;
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public interface h {
    }

    @j.X
    @Deprecated
    public L0(@j.N WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44970a = new f(windowInsetsController, new V(windowInsetsController));
        } else {
            this.f44970a = new d(windowInsetsController, new V(windowInsetsController));
        }
    }

    public final void a(int i12) {
        this.f44970a.a(i12);
    }

    public final boolean b() {
        return this.f44970a.b();
    }

    public final boolean c() {
        return this.f44970a.c();
    }

    public final void d(boolean z12) {
        this.f44970a.d(z12);
    }

    public final void e(boolean z12) {
        this.f44970a.e(z12);
    }

    public final void f() {
        this.f44970a.f();
    }

    public final void g(int i12) {
        this.f44970a.g(i12);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @j.X
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f44973a;

        /* renamed from: b, reason: collision with root package name */
        public final V f44974b;

        /* renamed from: c, reason: collision with root package name */
        public final Window f44975c;

        public d(@j.N Window window, @j.N V v12) {
            this(window.getInsetsController(), v12);
            this.f44975c = window;
        }

        @Override // androidx.core.view.L0.g
        public final void a(int i12) {
            if ((i12 & 8) != 0) {
                this.f44974b.a();
            }
            this.f44973a.hide(i12 & (-9));
        }

        @Override // androidx.core.view.L0.g
        public boolean b() {
            this.f44973a.setSystemBarsAppearance(0, 0);
            return (this.f44973a.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.L0.g
        public boolean c() {
            this.f44973a.setSystemBarsAppearance(0, 0);
            return (this.f44973a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.L0.g
        public final void d(boolean z12) {
            Window window = this.f44975c;
            if (z12) {
                if (window != null) {
                    h(16);
                }
                this.f44973a.setSystemBarsAppearance(16, 16);
            } else {
                if (window != null) {
                    i(16);
                }
                this.f44973a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.L0.g
        public final void e(boolean z12) {
            Window window = this.f44975c;
            if (z12) {
                if (window != null) {
                    h(8192);
                }
                this.f44973a.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    i(8192);
                }
                this.f44973a.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.L0.g
        public void f() {
            Window window = this.f44975c;
            if (window == null) {
                this.f44973a.setSystemBarsBehavior(2);
                return;
            }
            window.getDecorView().setTag(356039078, 2);
            i(2048);
            h(4096);
        }

        @Override // androidx.core.view.L0.g
        public final void g(int i12) {
            if ((i12 & 8) != 0) {
                this.f44974b.b();
            }
            this.f44973a.show(i12 & (-9));
        }

        public final void h(int i12) {
            View decorView = this.f44975c.getDecorView();
            decorView.setSystemUiVisibility(i12 | decorView.getSystemUiVisibility());
        }

        public final void i(int i12) {
            View decorView = this.f44975c.getDecorView();
            decorView.setSystemUiVisibility((~i12) & decorView.getSystemUiVisibility());
        }

        public d(@j.N WindowInsetsController windowInsetsController, @j.N V v12) {
            new o1();
            this.f44973a = windowInsetsController;
            this.f44974b = v12;
        }
    }

    public L0(@j.N Window window, @j.N View view) {
        V v12 = new V(view);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 35) {
            this.f44970a = new f(window, v12);
        } else if (i12 >= 30) {
            this.f44970a = new d(window, v12);
        } else {
            this.f44970a = new c(window, v12);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class g {
        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public void f() {
        }

        public void a(int i12) {
        }

        public void d(boolean z12) {
        }

        public void e(boolean z12) {
        }

        public void g(int i12) {
        }
    }
}
