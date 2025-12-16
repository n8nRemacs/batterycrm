package kotlin;

import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: DeepRecursive.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*r\b\u0002\u0010\u0005\"5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¢\u0006\u0002\b\u000425\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/Function3;", "Lkotlin/j;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/w;", "DeepRecursiveFunctionBlock", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.i, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class Function3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object f406756a;

    static {
        int i12 = Z.f406624c;
        f406756a = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @K0
    @InterfaceC42733c0
    public static final Object a(@Y61.k C42794h c42794h, G0 g02) {
        Object objInvoke;
        C42828l c42828l = new C42828l(null);
        c42828l.f406867b = c42794h.f406755a;
        c42828l.f406868c = g02;
        c42828l.f406869d = c42828l;
        Object obj = f406756a;
        c42828l.f406870e = obj;
        while (true) {
            Object obj2 = c42828l.f406870e;
            Continuation<Object> continuation = c42828l.f406869d;
            if (continuation == null) {
                C42729a0.b(obj2);
                return obj2;
            }
            int i12 = Z.f406624c;
            if (kotlin.jvm.internal.L.f(obj, obj2)) {
                try {
                    Y41.q<? super AbstractC42799j<?, ?>, Object, ? super Continuation<Object>, ? extends Object> qVar = c42828l.f406867b;
                    G0 g03 = c42828l.f406868c;
                    if (qVar instanceof BaseContinuationImpl) {
                        kotlin.jvm.internal.v0.e(3, qVar);
                        objInvoke = qVar.invoke(c42828l, g03, continuation);
                    } else {
                        objInvoke = IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(qVar, c42828l, g03, continuation);
                    }
                    if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        continuation.resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    int i13 = Z.f406624c;
                    continuation.resumeWith(new Z.b(th2));
                }
            } else {
                c42828l.f406870e = obj;
                continuation.resumeWith(obj2);
            }
        }
    }
}
