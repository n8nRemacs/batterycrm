package Ez;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;

/* compiled from: NonFatalErrorCustomizer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEz/a;", "", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ez.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13546a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C13546a f4465a = new C13546a();

    @l
    public static Throwable a(@k Throwable th2) {
        while (true) {
            if ((th2 != null ? th2.getCause() : null) == null || L.f(th2.getCause(), th2)) {
                break;
            }
            th2 = th2.getCause();
        }
        return th2;
    }

    public static void b(@k Throwable th2) {
        Throwable thA = a(th2);
        if (thA == null) {
            return;
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StackTraceElement stackTraceElement = stackTrace.length == 0 ? null : stackTrace[0];
        if (stackTraceElement == null) {
            return;
        }
        thA.setStackTrace((StackTraceElement[]) C42756l.X(new StackTraceElement[]{stackTraceElement}, th2.getStackTrace()));
    }
}
