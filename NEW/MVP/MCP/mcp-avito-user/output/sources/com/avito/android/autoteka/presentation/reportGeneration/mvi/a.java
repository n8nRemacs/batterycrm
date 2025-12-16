package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import Rf.AbstractC15037c;
import Rf.InterfaceC15035a;
import Sf.C15179a;
import Y41.p;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaReportGenerationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.mvi.AutotekaReportGenerationActor$process$1", f = "AutotekaReportGenerationActor.kt", i = {1}, l = {31, 33, 36, 34}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaReportGenerationInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C15179a f97782q;

    /* renamed from: r, reason: collision with root package name */
    public int f97783r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f97784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC15037c f97785t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15035a f97786u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f97787v;

    /* compiled from: AutotekaReportGenerationActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/autoteka/items/reportGenerationResponse/c;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.mvi.AutotekaReportGenerationActor$process$1$1", f = "AutotekaReportGenerationActor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.autoteka.presentation.reportGeneration.mvi.a$a, reason: collision with other inner class name */
    public static final class C2925a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<com.avito.android.autoteka.items.reportGenerationResponse.c>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97788q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ c f97789r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2925a(c cVar, Continuation<? super C2925a> continuation) {
            super(1, continuation);
            this.f97789r = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new C2925a(this.f97789r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<com.avito.android.autoteka.items.reportGenerationResponse.c>> continuation) {
            return ((C2925a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97788q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = this.f97789r;
                com.avito.android.autoteka.data.reportStatus.a aVar = cVar.f97792a;
                String usagePublicId = cVar.f97793b.getUsagePublicId();
                this.f97788q = 1;
                obj = aVar.a(usagePublicId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractC15037c abstractC15037c, InterfaceC15035a interfaceC15035a, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f97785t = abstractC15037c;
        this.f97786u = interfaceC15035a;
        this.f97787v = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f97785t, this.f97786u, this.f97787v, continuation);
        aVar.f97784s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaReportGenerationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f97783r
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L35
            if (r1 == r5) goto L31
            if (r1 == r4) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L31
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            Sf.a r1 = r9.f97782q
            java.lang.Object r3 = r9.f97784s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r10)
            goto L8b
        L28:
            java.lang.Object r1 = r9.f97784s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            r10 = r1
            goto L6d
        L31:
            kotlin.C42729a0.b(r10)
            goto La1
        L35:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f97784s
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            Rf.c r1 = r9.f97785t
            boolean r7 = r1 instanceof Rf.AbstractC15037c.b
            if (r7 == 0) goto La1
            Rf.c$b r1 = (Rf.AbstractC15037c.b) r1
            com.avito.android.remote.error.ApiError r1 = r1.f14544f
            boolean r1 = r1 instanceof com.avito.android.remote.error.ApiError.Unauthorized
            if (r1 == 0) goto L5d
            Rf.a r1 = r9.f97786u
            Rf.a$c r1 = (Rf.InterfaceC15035a.c) r1
            boolean r1 = r1.f14537a
            if (r1 == 0) goto L5d
            com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction$OpenAuthScreen r1 = com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction.OpenAuthScreen.f97808b
            r9.f97783r = r5
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto La1
            return r0
        L5d:
            com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction$Loading r1 = new com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction$Loading
            r1.<init>(r6, r5, r6)
            r9.f97784s = r10
            r9.f97783r = r4
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L6d
            return r0
        L6d:
            Sf.a r1 = new Sf.a
            r1.<init>()
            com.avito.android.util.coroutines.Delays[] r4 = com.avito.android.util.coroutines.Delays.f318856b
            com.avito.android.autoteka.presentation.reportGeneration.mvi.a$a r4 = new com.avito.android.autoteka.presentation.reportGeneration.mvi.a$a
            com.avito.android.autoteka.presentation.reportGeneration.mvi.c r5 = r9.f97787v
            r4.<init>(r5, r6)
            r9.f97784s = r10
            r9.f97782q = r1
            r9.f97783r = r3
            java.lang.Object r3 = com.avito.android.autoteka.helpers.f.a(r4, r9)
            if (r3 != r0) goto L88
            return r0
        L88:
            r8 = r3
            r3 = r10
            r10 = r8
        L8b:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            r1.getClass()
            com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction r10 = Sf.C15179a.a(r10)
            r9.f97784s = r6
            r9.f97782q = r6
            r9.f97783r = r2
            java.lang.Object r10 = r3.emit(r10, r9)
            if (r10 != r0) goto La1
            return r0
        La1:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.reportGeneration.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
