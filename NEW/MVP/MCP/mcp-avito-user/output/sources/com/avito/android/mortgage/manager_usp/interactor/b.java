package com.avito.android.mortgage.manager_usp.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.manager_usp.model.ManagerUspArguments;
import com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import h31.e;
import i00.InterfaceC41203a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import x00.InterfaceC49712a;

/* compiled from: ManagerUspInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/interactor/b;", "Lcom/avito/android/mortgage/manager_usp/interactor/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.manager_usp.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ManagerUspArguments f200396a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49712a f200397b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.manager_usp.mapper.a f200398c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e<InterfaceC41203a> f200399d;

    /* compiled from: ManagerUspInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.manager_usp.interactor.ManagerUspInteractorImpl$loadData$1", f = "ManagerUspInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 41}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ManagerUspInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f200400q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f200401r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f200401r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ManagerUspInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
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
                int r1 = r7.f200400q
                r2 = 3
                r3 = 2
                r4 = 1
                com.avito.android.mortgage.manager_usp.interactor.b r5 = com.avito.android.mortgage.manager_usp.interactor.b.this
                if (r1 == 0) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r8)
                goto Lba
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f200401r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L63
            L28:
                java.lang.Object r1 = r7.f200401r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L48
            L30:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f200401r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction$Loading r1 = new com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction$Loading
                r1.<init>()
                r7.f200401r = r8
                r7.f200400q = r4
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L47
                return r0
            L47:
                r1 = r8
            L48:
                h31.e<i00.a> r8 = r5.f200399d
                java.lang.Object r8 = r8.get()
                i00.a r8 = (i00.InterfaceC41203a) r8
                com.avito.android.mortgage.manager_usp.model.ManagerUspArguments r4 = r5.f200396a
                java.lang.String r6 = r4.f200410c
                r7.f200401r = r1
                r7.f200400q = r3
                java.lang.String r3 = r4.f200409b
                java.lang.String r4 = r4.f200411d
                java.lang.Object r8 = r8.g(r6, r3, r4, r7)
                if (r8 != r0) goto L63
                return r0
            L63:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L9f
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                p00.a r8 = (p00.C44968a) r8
                p00.c r3 = r8.getAction()
                r4 = 0
                if (r3 == 0) goto L7d
                com.avito.android.deep_linking.links.DeepLink r3 = r3.getUri()
                goto L7e
            L7d:
                r3 = r4
            L7e:
                if (r3 == 0) goto L89
                x00.a r3 = r5.f200397b
                com.avito.android.mortgage.manager_usp.model.ManagerUspArguments r6 = r5.f200396a
                java.lang.String r6 = r6.f200410c
                r3.a(r6)
            L89:
                com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction$Content r3 = new com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction$Content
                com.avito.android.mortgage.manager_usp.mapper.a r5 = r5.f200398c
                z00.f r8 = r5.a(r8)
                r3.<init>(r8)
                r7.f200401r = r4
                r7.f200400q = r2
                java.lang.Object r8 = r1.emit(r3, r7)
                if (r8 != r0) goto Lba
                return r0
            L9f:
                boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Lbd
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r0 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r0, r8)
                com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction$Error r0 = new com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction$Error
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r0.<init>(r8)
            Lba:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lbd:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.manager_usp.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k ManagerUspArguments managerUspArguments, @k InterfaceC49712a interfaceC49712a, @k com.avito.android.mortgage.manager_usp.mapper.a aVar, @k e<InterfaceC41203a> eVar) {
        this.f200396a = managerUspArguments;
        this.f200397b = interfaceC49712a;
        this.f200398c = aVar;
        this.f200399d = eVar;
    }

    @Override // com.avito.android.mortgage.manager_usp.interactor.a
    @k
    public final InterfaceC43160i<ManagerUspInternalAction> O() {
        return C43175k.G(new a(null));
    }
}
