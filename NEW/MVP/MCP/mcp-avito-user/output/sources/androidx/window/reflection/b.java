package androidx.window.reflection;

import X41.n;
import Y61.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectionUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/reflection/b;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f55350a = new b();

    public static boolean a(@k Method method, @k Class cls) {
        return method.getReturnType().equals(cls);
    }

    public static boolean b(@k Constructor constructor) {
        return Modifier.isPublic(constructor.getModifiers());
    }

    public static boolean c(@k Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    @n
    public static final boolean d(@k Y41.a aVar) {
        try {
            return ((Boolean) aVar.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
