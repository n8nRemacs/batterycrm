package com.avito.android.job.cv_packages.mvi;

import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvPackageActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActor$process$4", f = "CvPackageActor.kt", i = {0}, l = {74, 75, 80}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CvPackageInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f174452q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174453r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ cQ.b f174454s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f174455t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cQ.b bVar, a aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f174454s = bVar;
        this.f174455t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f174454s, this.f174455t, continuation);
        eVar.f174453r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CvPackageInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f174452q
            r2 = 0
            com.avito.android.job.cv_packages.mvi.a r3 = r8.f174455t
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L29
            if (r1 == r6) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.C42729a0.b(r9)
            goto L7a
        L21:
            java.lang.Object r1 = r8.f174453r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L47
        L29:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f174453r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            cQ.b r9 = r8.f174454s
            boolean r7 = r9 instanceof cQ.b.c
            if (r7 == 0) goto L5c
            com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction$StartLoading r9 = new com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction$StartLoading
            r9.<init>()
            r8.f174453r = r1
            r8.f174452q = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L47
            return r0
        L47:
            com.avito.android.job.cv_packages.b r9 = r3.f174426b
            java.lang.String r4 = r3.f174429e
            java.lang.String r3 = r3.f174430f
            kotlinx.coroutines.flow.i r9 = r9.a(r4, r3)
            r8.f174453r = r2
            r8.f174452q = r5
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
            if (r9 != r0) goto L7a
            return r0
        L5c:
            boolean r5 = r9 instanceof cQ.b.C2044b
            if (r5 == 0) goto L6b
            com.avito.android.deeplink_handler.handler.composite.a r0 = r3.f174427c
            cQ.b$b r9 = (cQ.b.C2044b) r9
            com.avito.android.deep_linking.links.DeepLink r9 = r9.f57857a
            r1 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r9, r2, r2, r1)
            goto L7a
        L6b:
            boolean r9 = r9 instanceof cQ.b.a
            if (r9 == 0) goto L7a
            com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction$Exit r9 = com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction.Exit.f174456b
            r8.f174452q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L7a
            return r0
        L7a:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_packages.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
