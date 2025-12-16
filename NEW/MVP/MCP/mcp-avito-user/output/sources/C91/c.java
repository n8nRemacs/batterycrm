package C91;

import Y41.p;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public h f2022q;

    /* renamed from: r, reason: collision with root package name */
    public Object f2023r;

    /* renamed from: s, reason: collision with root package name */
    public int f2024s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f2025t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f2026u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f2026u = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f2026u, continuation);
        cVar.f2025t = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC43172j) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|46|(1:(1:(1:(1:7)(2:8|9))(9:10|11|29|30|31|38|(1:42)|43|(1:45)))(10:13|14|23|(2:25|(1:27)(2:28|29))|30|31|38|(2:40|42)|43|(0)))(1:16)|50|(2:51|17)|48|19|(1:21)(14:22|23|(0)|30|31|38|(0)|43|(0)|50|(1:17)|48|19|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:23:0x0060, B:25:0x006a, B:29:0x007d, B:30:0x007f, B:11:0x002d, B:14:0x003b), top: B:46:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:0: B:17:0x0047->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c0 -> B:17:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f2024s
            r2 = 3
            r3 = 2
            r4 = 1
            C91.h r5 = r10.f2026u
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L31
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r10.f2025t
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L47
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.Object r1 = r10.f2023r
            ru.mts.biometry.api.entity.state.ApiIdentificationState r1 = (ru.mts.biometry.api.entity.state.ApiIdentificationState) r1
            C91.h r6 = r10.f2022q
            java.lang.Object r7 = r10.f2025t
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L85
            goto L7d
        L31:
            java.lang.Object r1 = r10.f2023r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            C91.h r6 = r10.f2022q
            java.lang.Object r7 = r10.f2025t
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L85
            goto L60
        L3f:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f2025t
            kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            r1 = r11
        L47:
            ru.mts.biometry.sdk.feature.main.entity.b r11 = C91.a.f2017d
            if (r11 == 0) goto L47
            int r11 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L89
            ru.mts.biometry.api.d r11 = r5.f2037a     // Catch: java.lang.Throwable -> L89
            r10.f2025t = r1     // Catch: java.lang.Throwable -> L89
            r10.f2022q = r5     // Catch: java.lang.Throwable -> L89
            r10.f2023r = r1     // Catch: java.lang.Throwable -> L89
            r10.f2024s = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r11 = r11.a(r10)     // Catch: java.lang.Throwable -> L89
            if (r11 != r0) goto L5e
            return r0
        L5e:
            r7 = r1
            r6 = r5
        L60:
            ru.mts.biometry.api.entity.state.ApiIdentificationState r11 = (ru.mts.biometry.api.entity.state.ApiIdentificationState) r11     // Catch: java.lang.Throwable -> L85
            ru.mts.biometry.api.entity.state.ApiIdentificationState r8 = r6.f2042f     // Catch: java.lang.Throwable -> L85
            boolean r8 = kotlin.jvm.internal.L.f(r11, r8)     // Catch: java.lang.Throwable -> L85
            if (r8 != 0) goto L7f
            C91.h.a(r11)     // Catch: java.lang.Throwable -> L85
            r10.f2025t = r7     // Catch: java.lang.Throwable -> L85
            r10.f2022q = r6     // Catch: java.lang.Throwable -> L85
            r10.f2023r = r11     // Catch: java.lang.Throwable -> L85
            r10.f2024s = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r1.emit(r11, r10)     // Catch: java.lang.Throwable -> L85
            if (r1 != r0) goto L7c
            return r0
        L7c:
            r1 = r11
        L7d:
            r6.f2042f = r1     // Catch: java.lang.Throwable -> L85
        L7f:
            kotlin.G0 r11 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L85
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L85
        L83:
            r1 = r7
            goto L94
        L85:
            r11 = move-exception
            goto L8b
        L87:
            r7 = r1
            goto L8b
        L89:
            r11 = move-exception
            goto L87
        L8b:
            int r1 = kotlin.Z.f406624c
            kotlin.Z$b r1 = new kotlin.Z$b
            r1.<init>(r11)
            r11 = r1
            goto L83
        L94:
            java.lang.Throwable r11 = kotlin.Z.b(r11)
            r6 = 0
            if (r11 == 0) goto Laf
            boolean r11 = r11 instanceof java.util.concurrent.CancellationException
            if (r11 != 0) goto Laf
            W91.h r11 = r5.f2039c
            ru.mts.biometry.sdk.base.p r7 = Ba1.y.b(r6)
            W91.e r8 = new W91.e
            java.lang.String r9 = "ERROR_SCREEN"
            r8.<init>(r7, r9)
            r11.c(r8)
        Laf:
            r5.getClass()
            r10.f2025t = r1
            r10.f2022q = r6
            r10.f2023r = r6
            r10.f2024s = r2
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r6, r10)
            if (r11 != r0) goto L47
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C91.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
