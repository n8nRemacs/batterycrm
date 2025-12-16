package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: RxScheduler.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*8\b\u0002\u0010\u0004\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "Task", "kotlinx-coroutines-rx3"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class O {
    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlinx.coroutines.o0] */
    public static final io.reactivex.rxjava3.disposables.d a(C43238h c43238h, Runnable runnable, long j12, Y41.l lVar) {
        CoroutineContext coroutineContext = c43238h.f411905b;
        l0.h hVar = new l0.h();
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(new com.avito.android.delivery_common.c(hVar, 2));
        Objects.requireNonNull(runnable, "run is null");
        Runnable runnable2 = (Runnable) lVar.invoke(new N(dVarE, coroutineContext, runnable));
        if (!kotlinx.coroutines.U.e(c43238h)) {
            return EmptyDisposable.f401988b;
        }
        if (j12 <= 0) {
            runnable2.run();
            return dVarE;
        }
        hVar.f406842b = C43131e0.d(coroutineContext).g(j12, runnable2, coroutineContext);
        return dVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.reactivex.rxjava3.disposables.d r4, kotlin.coroutines.CoroutineContext r5, java.lang.Runnable r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx3.L
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx3.L r0 = (kotlinx.coroutines.rx3.L) r0
            int r1 = r0.f412061s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412061s = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.L r0 = new kotlinx.coroutines.rx3.L
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f412060r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f412061s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.coroutines.CoroutineContext r5 = r0.f412059q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r4 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r7)
            boolean r4 = r4.getF318621e()
            if (r4 == 0) goto L41
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto L56
        L41:
            kotlinx.coroutines.rx3.M r4 = new kotlinx.coroutines.rx3.M     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            r0.f412059q = r5     // Catch: java.lang.Throwable -> L2b
            r0.f412061s = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = kotlinx.coroutines.K0.a(r4, r0)     // Catch: java.lang.Throwable -> L2b
            if (r4 != r1) goto L54
            goto L56
        L51:
            kotlinx.coroutines.rx3.C43294q.a(r5, r4)
        L54:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.O.b(io.reactivex.rxjava3.disposables.d, kotlin.coroutines.CoroutineContext, java.lang.Runnable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.k
    public static final U c(@Y61.k io.reactivex.rxjava3.core.H h12) {
        if (!(h12 instanceof C43280c)) {
            return new U(h12);
        }
        ((C43280c) h12).getClass();
        return null;
    }
}
