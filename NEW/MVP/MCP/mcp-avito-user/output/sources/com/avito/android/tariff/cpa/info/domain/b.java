package com.avito.android.tariff.cpa.info.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpaInfoInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/domain/b;", "Lcom/avito/android/tariff/cpa/info/domain/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff.cpa.info.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WB0.a f294692a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f294693b;

    /* compiled from: CpaInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpa.info.domain.CpaInfoInteractorImpl$getCpaInfo$1", f = "CpaInfoInteractor.kt", i = {0, 1, 2}, l = {AvailableCode.HMS_IS_SPOOF, 30, 34, 36, 41, 46}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CpaInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f294694q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f294695r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f294697t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f294697t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f294697t, continuation);
            aVar.f294695r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CpaInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f294694q
                com.avito.android.tariff.cpa.info.domain.b r2 = com.avito.android.tariff.cpa.info.domain.b.this
                r3 = 0
                switch(r1) {
                    case 0: goto L31;
                    case 1: goto L29;
                    case 2: goto L21;
                    case 3: goto L19;
                    case 4: goto L14;
                    case 5: goto L14;
                    case 6: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L14:
                kotlin.C42729a0.b(r6)
                goto Lc7
            L19:
                java.lang.Object r1 = r5.f294695r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L7d
            L21:
                java.lang.Object r1 = r5.f294695r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L58
            L29:
                java.lang.Object r1 = r5.f294695r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L4a
            L31:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f294695r
                r1 = r6
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$MainLoading r6 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$MainLoading
                r6.<init>()
                r5.f294695r = r1
                r4 = 1
                r5.f294694q = r4
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L4a
                return r0
            L4a:
                WB0.a r6 = r2.f294692a
                r5.f294695r = r1
                r4 = 2
                r5.f294694q = r4
                java.lang.Object r6 = r6.p(r5)
                if (r6 != r0) goto L58
                return r0
            L58:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r4 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto Lac
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                dC0.a r6 = (dC0.AbstractC39559a) r6
                boolean r4 = r6 instanceof dC0.AbstractC39559a.b
                if (r4 == 0) goto L91
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$MainContent r4 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$MainContent
                dC0.a$b r6 = (dC0.AbstractC39559a.b) r6
                r4.<init>(r6)
                r5.f294695r = r1
                r6 = 3
                r5.f294694q = r6
                java.lang.Object r6 = r1.emit(r4, r5)
                if (r6 != r0) goto L7d
                return r0
            L7d:
                boolean r6 = r5.f294697t
                if (r6 == 0) goto Lc7
                kotlinx.coroutines.flow.i r6 = r2.c()
                r5.f294695r = r3
                r2 = 4
                r5.f294694q = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.C43175k.u(r5, r6, r1)
                if (r6 != r0) goto Lc7
                return r0
            L91:
                boolean r2 = r6 instanceof dC0.AbstractC39559a.C11016a
                if (r2 == 0) goto Lc7
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$Redirect r2 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$Redirect
                dC0.a$a r6 = (dC0.AbstractC39559a.C11016a) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.getDeeplink()
                r2.<init>(r6)
                r5.f294695r = r3
                r6 = 5
                r5.f294694q = r6
                java.lang.Object r6 = r1.emit(r2, r5)
                if (r6 != r0) goto Lc7
                return r0
            Lac:
                boolean r2 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc7
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$MainError r2 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$MainError
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r6 = r6.getError()
                r2.<init>(r6)
                r5.f294695r = r3
                r6 = 6
                r5.f294694q = r6
                java.lang.Object r6 = r1.emit(r2, r5)
                if (r6 != r0) goto Lc7
                return r0
            Lc7:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpa.info.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CpaInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpa.info.domain.CpaInfoInteractorImpl$getCpaInfoWithDelay$1", f = "CpaInfoInteractor.kt", i = {0, 1, 2, 3}, l = {53, 54, 55, 56, 59, 60, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.tariff.cpa.info.domain.b$b, reason: collision with other inner class name */
    public static final class C8955b extends SuspendLambda implements p<InterfaceC43172j<? super CpaInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f294698q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f294699r;

        public C8955b(Continuation<? super C8955b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8955b c8955b = b.this.new C8955b(continuation);
            c8955b.f294699r = obj;
            return c8955b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CpaInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8955b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpa.info.domain.b.C8955b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CpaInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpa.info.domain.CpaInfoInteractorImpl$sendCpaRefill$1", f = "CpaInfoInteractor.kt", i = {0, 1}, l = {71, 72, 73, 74}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f294701q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f294702r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f294704t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f294704t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f294704t, continuation);
            cVar.f294702r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f294701q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L94
            L22:
                java.lang.Object r1 = r6.f294702r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L5b
            L2a:
                java.lang.Object r1 = r6.f294702r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f294702r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillLoading r1 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillLoading
                r1.<init>()
                r6.f294702r = r7
                r6.f294701q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.tariff.cpa.info.domain.b r7 = com.avito.android.tariff.cpa.info.domain.b.this
                WB0.a r7 = r7.f294692a
                r6.f294702r = r1
                r6.f294701q = r4
                java.lang.String r4 = r6.f294704t
                java.lang.Object r7 = r7.q(r4, r6)
                if (r7 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7a
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillContent r2 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillContent
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                bC0.f r7 = (bC0.f) r7
                r2.<init>(r7)
                r6.f294702r = r5
                r6.f294701q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto L94
                return r0
            L7a:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L94
                com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillError r3 = new com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction$RefillError
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r3.<init>(r7)
                r6.f294702r = r5
                r6.f294701q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L94
                return r0
            L94:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpa.info.domain.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k WB0.a aVar, @k R0 r02) {
        this.f294692a = aVar;
        this.f294693b = r02;
    }

    @Override // com.avito.android.tariff.cpa.info.domain.a
    @k
    public final InterfaceC43160i<CpaInfoInternalAction> a(@k String str) {
        return C43175k.I(this.f294693b.a(), C43175k.G(new c(str, null)));
    }

    @Override // com.avito.android.tariff.cpa.info.domain.a
    @k
    public final InterfaceC43160i<CpaInfoInternalAction> b(boolean z12) {
        return C43175k.I(this.f294693b.a(), C43175k.G(new a(z12, null)));
    }

    @Override // com.avito.android.tariff.cpa.info.domain.a
    @k
    public final InterfaceC43160i<CpaInfoInternalAction> c() {
        return C43175k.I(this.f294693b.a(), C43175k.G(new C8955b(null)));
    }
}
