package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.WeakHashMap;

/* compiled from: ViewUtils.java */
/* loaded from: classes10.dex */
class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f54765a;

    /* renamed from: b, reason: collision with root package name */
    public static final Property<View, Float> f54766b;

    /* renamed from: c, reason: collision with root package name */
    public static final Property<View, Rect> f54767c;

    /* compiled from: ViewUtils.java */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(h0.f54765a.b(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f12) {
            h0.b(view, f12.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f54765a = new m0();
        } else {
            f54765a = new l0();
        }
        f54766b = new a(Float.class, "translationAlpha");
        f54767c = new b(Rect.class, "clipBounds");
    }

    public static void a(@j.N View view, int i12, int i13, int i14, int i15) {
        f54765a.g(view, i12, i13, i14, i15);
    }

    public static void b(@j.N View view, float f12) {
        f54765a.c(view, f12);
    }

    public static void c(@j.N View view, int i12) {
        f54765a.a(view, i12);
    }
}
