package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.graphics.C22771k;
import java.util.Objects;

/* compiled from: DisplayCutoutCompat.java */
/* renamed from: androidx.core.view.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22826j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f45077a;

    /* compiled from: DisplayCutoutCompat.java */
    @j.X
    /* renamed from: androidx.core.view.j$a */
    public static class a {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @j.X
    /* renamed from: androidx.core.view.j$b */
    public static class b {
    }

    /* compiled from: DisplayCutoutCompat.java */
    @j.X
    /* renamed from: androidx.core.view.j$c */
    public static class c {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @j.X
    /* renamed from: androidx.core.view.j$d */
    public static class d {
    }

    /* compiled from: DisplayCutoutCompat.java */
    @j.X
    /* renamed from: androidx.core.view.j$e */
    public static class e {
    }

    public C22826j(DisplayCutout displayCutout) {
        this.f45077a = displayCutout;
    }

    @j.N
    public final C22771k a() {
        return Build.VERSION.SDK_INT >= 30 ? C22771k.d(c.a(this.f45077a)) : C22771k.f44774e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22826j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f45077a, ((C22826j) obj).f45077a);
    }

    public final int hashCode() {
        return this.f45077a.hashCode();
    }

    @j.N
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f45077a + "}";
    }
}
