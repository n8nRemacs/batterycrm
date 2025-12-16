package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/B1;", "U", "T", "Lkotlinx/coroutines/internal/W;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class B1<U, T extends U> extends kotlinx.coroutines.internal.W<T> implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    public final long f410675f;

    public B1(long j12, @Y61.k Continuation<? super U> continuation) {
        super(continuation, continuation.getF411447c());
        this.f410675f = j12;
    }

    @Override // kotlinx.coroutines.V0
    @Y61.k
    public final String r0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.r0());
        sb2.append("(timeMillis=");
        return androidx.appcompat.app.r.u(sb2, this.f410675f, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f410748d
            kotlinx.coroutines.c0 r0 = kotlinx.coroutines.C43131e0.d(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.InterfaceC43134f0
            if (r1 == 0) goto Ld
            kotlinx.coroutines.f0 r0 = (kotlinx.coroutines.InterfaceC43134f0) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r4.f410675f
            if (r0 == 0) goto L1f
            kotlin.time.e$a r3 = kotlin.time.e.f410651c
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.f410633e
            kotlin.time.g.h(r1, r3)
            java.lang.String r0 = r0.d()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = androidx.compose.ui.graphics.colorspace.e.i(r1, r0, r3)
        L27:
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            r1.<init>(r0, r4)
            r4.U(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.B1.run():void");
    }
}
