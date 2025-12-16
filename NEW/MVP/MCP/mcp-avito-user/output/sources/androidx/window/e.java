package androidx.window;

import Y61.k;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeWindowExtensionsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/e;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ClassLoader f55209a;

    /* compiled from: SafeWindowExtensionsProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            e eVar = e.this;
            boolean z12 = false;
            Method declaredMethod = eVar.f55209a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class<?> clsLoadClass = eVar.f55209a.loadClass("androidx.window.extensions.WindowExtensions");
            androidx.window.reflection.b.f55350a.getClass();
            if (androidx.window.reflection.b.a(declaredMethod, clsLoadClass) && Modifier.isPublic(declaredMethod.getModifiers())) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    public e(@k ClassLoader classLoader) {
        this.f55209a = classLoader;
    }

    public final boolean a() {
        androidx.window.reflection.b bVar = androidx.window.reflection.b.f55350a;
        d dVar = new d(this);
        bVar.getClass();
        try {
            dVar.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        return androidx.window.reflection.b.d(new a());
    }
}
