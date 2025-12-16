package androidx.window.core;

import androidx.window.extensions.WindowExtensionsProvider;
import j.F;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: ExtensionsUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/j;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f55190a = new j();

    static {
        m0.f406844a.b(j.class).l0();
    }

    @F
    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            d.f55182a.getClass();
            return 0;
        } catch (UnsupportedOperationException unused2) {
            d.f55182a.getClass();
            return 0;
        }
    }
}
