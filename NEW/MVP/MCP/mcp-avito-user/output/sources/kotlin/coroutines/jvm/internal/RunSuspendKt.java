package kotlin.coroutines.jvm.internal;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;

/* compiled from: RunSuspend.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "block", "runSuspend", "(LY41/l;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RunSuspendKt {
    @InterfaceC42733c0
    public static final void runSuspend(@k l<? super Continuation<? super G0>, ? extends Object> lVar) {
        RunSuspend runSuspend = new RunSuspend();
        ContinuationKt.startCoroutine(lVar, runSuspend);
        runSuspend.await();
    }
}
