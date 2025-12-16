package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: StackTraceRecovery.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f411889a = 0;

    static {
        Object bVar;
        Object bVar2;
        new _COROUTINE.a();
        _COROUTINE.a.a();
        try {
            int i12 = kotlin.Z.f406624c;
            bVar = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th2) {
            int i13 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (kotlin.Z.b(bVar) != null) {
            bVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            bVar2 = Z.class.getCanonicalName();
        } catch (Throwable th3) {
            int i14 = kotlin.Z.f406624c;
            bVar2 = new Z.b(th3);
        }
        if (kotlin.Z.b(bVar2) != null) {
            bVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
