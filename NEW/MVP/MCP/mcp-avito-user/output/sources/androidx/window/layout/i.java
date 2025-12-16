package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j.k0;
import kotlin.Metadata;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/i;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClassLoader f55327a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.window.core.e f55328b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.window.e f55329c;

    public i(@Y61.k ClassLoader classLoader, @Y61.k androidx.window.core.e eVar) {
        this.f55327a = classLoader;
        this.f55328b = eVar;
        this.f55329c = new androidx.window.e(classLoader);
    }

    @Y61.l
    public final WindowLayoutComponent a() {
        boolean zB2 = false;
        if (this.f55329c.a() && androidx.window.reflection.b.d(new h(this)) && androidx.window.reflection.b.d(new e(this))) {
            androidx.window.core.j.f55190a.getClass();
            int iA2 = androidx.window.core.j.a();
            if (iA2 == 1) {
                zB2 = b();
            } else if (2 <= iA2 && iA2 <= Integer.MAX_VALUE && b() && androidx.window.reflection.b.d(new g(this))) {
                zB2 = true;
            }
        }
        if (!zB2) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @k0
    public final boolean b() {
        return androidx.window.reflection.b.d(new f(this));
    }
}
