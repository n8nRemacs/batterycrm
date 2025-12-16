package Ba1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class u implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.g f1543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j f1544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.h f1545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f1546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f1547f;

    public u(l0.g gVar, InterfaceC43172j interfaceC43172j, l0.h hVar, T t12, CoroutineContext coroutineContext) {
        this.f1543b = gVar;
        this.f1544c = interfaceC43172j;
        this.f1545d = hVar;
        this.f1546e = t12;
        this.f1547f = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, kotlinx.coroutines.a0] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r17, kotlin.coroutines.Continuation r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof Ba1.t
            if (r2 == 0) goto L17
            r2 = r1
            Ba1.t r2 = (Ba1.t) r2
            int r3 = r2.f1542t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f1542t = r3
            goto L1c
        L17:
            Ba1.t r2 = new Ba1.t
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f1540r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f1542t
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L38
            if (r4 != r6) goto L30
            Ba1.u r2 = r2.f1539q
            kotlin.C42729a0.b(r1)
            goto L5d
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            long r7 = android.os.SystemClock.uptimeMillis()
            kotlin.jvm.internal.l0$g r4 = r0.f1543b
            long r9 = r4.f406841b
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 >= 0) goto L69
            r1 = 200(0xc8, float:2.8E-43)
            long r9 = (long) r1
            long r7 = r7 + r9
            r4.f406841b = r7
            r2.f1539q = r0
            r2.f1542t = r6
            kotlinx.coroutines.flow.j r1 = r0.f1544c
            r11 = r17
            java.lang.Object r1 = r1.emit(r11, r2)
            if (r1 != r3) goto L5c
            return r3
        L5c:
            r2 = r0
        L5d:
            kotlin.jvm.internal.l0$h r1 = r2.f1545d
            T r1 = r1.f406842b
            kotlinx.coroutines.a0 r1 = (kotlinx.coroutines.InterfaceC43076a0) r1
            if (r1 == 0) goto L93
            r1.c(r5)
            goto L93
        L69:
            r11 = r17
            kotlin.jvm.internal.l0$h r1 = r0.f1545d
            T r2 = r1.f406842b
            kotlinx.coroutines.a0 r2 = (kotlinx.coroutines.InterfaceC43076a0) r2
            if (r2 == 0) goto L76
            r2.c(r5)
        L76:
            kotlinx.coroutines.scheduling.c r2 = kotlinx.coroutines.C43262l0.f411945a
            Ba1.s r13 = new Ba1.s
            kotlin.coroutines.CoroutineContext r12 = r0.f1547f
            kotlinx.coroutines.flow.j r14 = r0.f1544c
            r15 = 0
            r3 = r13
            r5 = r7
            r7 = r9
            r9 = r12
            r10 = r14
            r11 = r17
            r12 = r15
            r3.<init>(r4, r5, r7, r9, r10, r11, r12)
            r3 = 2
            kotlinx.coroutines.T r4 = r0.f1546e
            kotlinx.coroutines.a0 r2 = kotlinx.coroutines.C43259k.b(r4, r2, r13, r3)
            r1.f406842b = r2
        L93:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ba1.u.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
