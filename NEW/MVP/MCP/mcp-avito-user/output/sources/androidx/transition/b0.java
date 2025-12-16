package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes10.dex */
class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f54735a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Method f54736b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f54737c;

    public static void a(@j.N ViewGroup viewGroup, boolean z12) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z12);
        } else if (f54735a) {
            try {
                viewGroup.suppressLayout(z12);
            } catch (NoSuchMethodError unused) {
                f54735a = false;
            }
        }
    }
}
