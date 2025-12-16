package Cz;

import Ez.C13546a;
import Y61.k;
import kotlin.Metadata;

/* compiled from: ErrorGroupParser.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_error-reporting_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13376a {
    @k
    public static final String a(@k Throwable th2) {
        StackTraceElement[] stackTrace;
        C13546a.f4465a.getClass();
        Throwable thA = C13546a.a(th2);
        if (thA == null || (stackTrace = thA.getStackTrace()) == null) {
            return "unknown";
        }
        StackTraceElement stackTraceElement = stackTrace.length == 0 ? null : stackTrace[0];
        if (stackTraceElement == null) {
            return "unknown";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + ", line=" + stackTraceElement.getLineNumber();
    }
}
