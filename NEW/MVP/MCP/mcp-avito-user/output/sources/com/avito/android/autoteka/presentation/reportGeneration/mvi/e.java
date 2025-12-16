package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import Sf.C15179a;
import Y41.p;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaReportGenerationBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.arch.mvi.b<AutotekaReportGenerationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.reportStatus.a f97796a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReportGenerationDetails f97797b;

    /* compiled from: AutotekaReportGenerationBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.mvi.AutotekaReportGenerationBootstrap$produce$1", f = "AutotekaReportGenerationBootstrap.kt", i = {0}, l = {19, 22, 20}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutotekaReportGenerationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C15179a f97798q;

        /* renamed from: r, reason: collision with root package name */
        public int f97799r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f97800s;

        /* compiled from: AutotekaReportGenerationBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/autoteka/items/reportGenerationResponse/c;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.mvi.AutotekaReportGenerationBootstrap$produce$1$1", f = "AutotekaReportGenerationBootstrap.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.autoteka.presentation.reportGeneration.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C2926a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<com.avito.android.autoteka.items.reportGenerationResponse.c>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f97802q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ e f97803r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2926a(e eVar, Continuation<? super C2926a> continuation) {
                super(1, continuation);
                this.f97803r = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new C2926a(this.f97803r, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super TypedResult<com.avito.android.autoteka.items.reportGenerationResponse.c>> continuation) {
                return ((C2926a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f97802q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e eVar = this.f97803r;
                    com.avito.android.autoteka.data.reportStatus.a aVar = eVar.f97796a;
                    String usagePublicId = eVar.f97797b.getUsagePublicId();
                    this.f97802q = 1;
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f97800s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaReportGenerationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[RETURN] */
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
                int r1 = r8.f97799r
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L31
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r9)
                goto L7c
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                Sf.a r1 = r8.f97798q
                java.lang.Object r3 = r8.f97800s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r9)
                goto L66
            L28:
                java.lang.Object r1 = r8.f97800s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                r9 = r1
                goto L48
            L31:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f97800s
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction$Loading r1 = new com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction$Loading
                r1.<init>(r5, r4, r5)
                r8.f97800s = r9
                r8.f97799r = r4
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L48
                return r0
            L48:
                Sf.a r1 = new Sf.a
                r1.<init>()
                com.avito.android.util.coroutines.Delays[] r4 = com.avito.android.util.coroutines.Delays.f318856b
                com.avito.android.autoteka.presentation.reportGeneration.mvi.e$a$a r4 = new com.avito.android.autoteka.presentation.reportGeneration.mvi.e$a$a
                com.avito.android.autoteka.presentation.reportGeneration.mvi.e r6 = com.avito.android.autoteka.presentation.reportGeneration.mvi.e.this
                r4.<init>(r6, r5)
                r8.f97800s = r9
                r8.f97798q = r1
                r8.f97799r = r3
                java.lang.Object r3 = com.avito.android.autoteka.helpers.f.a(r4, r8)
                if (r3 != r0) goto L63
                return r0
            L63:
                r7 = r3
                r3 = r9
                r9 = r7
            L66:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                r1.getClass()
                com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction r9 = Sf.C15179a.a(r9)
                r8.f97800s = r5
                r8.f97798q = r5
                r8.f97799r = r2
                java.lang.Object r9 = r3.emit(r9, r8)
                if (r9 != r0) goto L7c
                return r0
            L7c:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.reportGeneration.mvi.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.autoteka.data.reportStatus.a aVar, @Y61.k ReportGenerationDetails reportGenerationDetails) {
        this.f97796a = aVar;
        this.f97797b = reportGenerationDetails;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AutotekaReportGenerationInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
