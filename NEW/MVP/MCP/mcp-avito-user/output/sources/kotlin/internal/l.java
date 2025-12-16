package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformImplementations.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/internal/l;", "", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class l {

    /* compiled from: PlatformImplementations.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/internal/l$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.l
        public static final Method f406762a;

        static {
            Method method;
            new a();
            Method[] methods = Throwable.class.getMethods();
            int length = methods.length;
            int i12 = 0;
            while (true) {
                method = null;
                if (i12 >= length) {
                    break;
                }
                Method method2 = methods[i12];
                if (L.f(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if (L.f(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i12++;
            }
            f406762a = method;
            int length2 = methods.length;
            for (int i13 = 0; i13 < length2 && !L.f(methods[i13].getName(), "getSuppressed"); i13++) {
            }
        }
    }

    public void a(@Y61.k Throwable th2, @Y61.k Throwable th3) {
        Method method = a.f406762a;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }
}
