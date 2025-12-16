package kotlin.reflect.jvm.internal.impl.utils;

import Y61.k;
import Y61.l;

/* loaded from: classes8.dex */
public class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f410347a = new a();

    public static class WrappedProcessCanceledException extends RuntimeException {
    }

    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f410348a;

        public b(Throwable th2, a aVar) {
            if (th2 == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper", "<init>"));
            }
            this.f410348a = th2;
        }

        public final String toString() {
            return this.f410348a.toString();
        }
    }

    public static /* synthetic */ void a(int i12) {
        String str = (i12 == 1 || i12 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 1 || i12 == 2) ? 2 : 3];
        if (i12 == 1 || i12 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i12 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i12 == 1 || i12 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i12 != 1 && i12 != 2) {
            if (i12 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i12 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @k
    public static Object b(@k Throwable th2) {
        return new b(th2, null);
    }

    @l
    public static void c(@l Object obj) throws Throwable {
        if (obj instanceof b) {
            throw ((b) obj).f410348a;
        }
    }
}
