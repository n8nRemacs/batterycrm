package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C43242l;

/* compiled from: DebugStrings.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class X {
    @Y61.k
    public static final String a(@Y61.k Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @Y61.k
    public static final String b(@Y61.k Continuation<?> continuation) {
        Object bVar;
        if (continuation instanceof C43242l) {
            return continuation.toString();
        }
        try {
            int i12 = kotlin.Z.f406624c;
            bVar = continuation + '@' + a(continuation);
        } catch (Throwable th2) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (kotlin.Z.b(bVar) != null) {
            bVar = continuation.getClass().getName() + '@' + a(continuation);
        }
        return (String) bVar;
    }
}
