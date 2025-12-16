package com.avito.android.autoteka.presentation.report.mvi;

import Bf.C13142a;
import Y41.p;
import com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaReportActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.report.mvi.AutotekaReportActor$process$2", f = "AutotekaReportActor.kt", i = {0, 0}, l = {53, 54}, m = "invokeSuspend", n = {"$this$flow", "reportItem"}, s = {"L$0", "L$1"})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaReportInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C13142a.b f97708q;

    /* renamed from: r, reason: collision with root package name */
    public int f97709r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f97710s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Pf.c f97711t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f97712u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Pf.c cVar, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f97711t = cVar;
        this.f97712u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f97711t, this.f97712u, continuation);
        bVar.f97710s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaReportInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f97709r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r8)
            goto L6c
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            Bf.a$b r1 = r7.f97708q
            java.lang.Object r3 = r7.f97710s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r8)
            goto L53
        L24:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f97710s
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            Pf.c r1 = r7.f97711t
            boolean r4 = r1 instanceof Pf.c.d
            if (r4 == 0) goto L6c
            Pf.c$d r1 = (Pf.c.d) r1
            Bf.a r1 = r1.f13224e
            Bf.a$b r1 = r1.f1582e
            if (r1 == 0) goto L6c
            com.avito.android.autoteka.presentation.report.mvi.d r4 = r7.f97712u
            com.avito.android.autoteka.data.i r5 = r4.f97717a
            com.avito.android.autoteka.deeplinks.ReportDetails r4 = r4.f97718b
            java.lang.String r4 = r4.getReportPublicId()
            r7.f97710s = r8
            r7.f97708q = r1
            r7.f97709r = r3
            java.lang.Object r3 = r5.a(r4, r7)
            if (r3 != r0) goto L50
            return r0
        L50:
            r6 = r3
            r3 = r8
            r8 = r6
        L53:
            java.io.InputStream r8 = (java.io.InputStream) r8
            if (r8 == 0) goto L6c
            com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction$DownloadPdf r4 = new com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction$DownloadPdf
            java.lang.String r1 = r1.f1585a
            r4.<init>(r8, r1)
            r8 = 0
            r7.f97710s = r8
            r7.f97708q = r8
            r7.f97709r = r2
            java.lang.Object r8 = r3.emit(r4, r7)
            if (r8 != r0) goto L6c
            return r0
        L6c:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.report.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
