package com.avito.android.comfortable_deal.end_deal.interactor;

import Jp.InterfaceC14233a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.common.view.CommissionData;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import java.util.Map;
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

/* compiled from: EndDealInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/interactor/e;", "Lcom/avito/android/comfortable_deal/end_deal/interactor/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC14233a> f122198a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC39387a> f122199b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.end_deal.interactor.a f122200c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final EndDealArguments f122201d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.end_deal.mvi.validator.a f122202e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final R0 f122203f;

    /* compiled from: EndDealInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.interactor.EndDealInteractorImpl$calculateCommission$1", f = "EndDealInteractor.kt", i = {0, 1}, l = {103, 104, 109, 112}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122204q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f122205r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f122207t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f122207t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f122207t, continuation);
            aVar.f122205r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EndDealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f122204q
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
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.C42729a0.b(r13)
                goto Laa
            L22:
                java.lang.Object r1 = r12.f122205r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L65
            L2a:
                java.lang.Object r1 = r12.f122205r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L47
            L32:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f122205r
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$LoadingCommission r1 = com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction.LoadingCommission.f122318b
                r12.f122205r = r13
                r12.f122204q = r5
                java.lang.Object r1 = r13.emit(r1, r12)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r13
            L47:
                com.avito.android.comfortable_deal.end_deal.interactor.e r13 = com.avito.android.comfortable_deal.end_deal.interactor.e.this
                h31.e<Jp.a> r5 = r13.f122198a
                java.lang.Object r5 = r5.get()
                r6 = r5
                Jp.a r6 = (Jp.InterfaceC14233a) r6
                com.avito.android.comfortable_deal.end_deal.model.EndDealArguments r13 = r13.f122201d
                long r7 = r13.f122240b
                int r13 = r12.f122207t
                long r9 = (long) r13
                r12.f122205r = r1
                r12.f122204q = r4
                r11 = r12
                java.lang.Object r13 = r6.d(r7, r9, r11)
                if (r13 != r0) goto L65
                return r0
            L65:
                com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
                boolean r4 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L84
                com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
                java.lang.Object r13 = r13.getResult()
                Lp.a r13 = (Lp.C14426a) r13
                com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$CommissionLoaded r2 = new com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$CommissionLoaded
                r2.<init>(r13)
                r12.f122205r = r5
                r12.f122204q = r3
                java.lang.Object r13 = r1.emit(r2, r12)
                if (r13 != r0) goto Laa
                return r0
            L84:
                boolean r3 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lad
                com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
                com.avito.android.remote.error.ApiError r3 = r13.getError()
                java.lang.Throwable r13 = r13.getCause()
                com.avito.android.util.ApiException r13 = com.avito.android.util.C35936s.a(r3, r13)
                com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$CommissionLoadingFailure r3 = new com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$CommissionLoadingFailure
                com.avito.android.remote.error.ApiError r13 = com.avito.android.error.z.n(r13)
                r3.<init>(r13)
                r12.f122205r = r5
                r12.f122204q = r2
                java.lang.Object r13 = r1.emit(r3, r12)
                if (r13 != r0) goto Laa
                return r0
            Laa:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            Lad:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.interactor.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EndDealInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.interactor.EndDealInteractorImpl$loadInitial$1", f = "EndDealInteractor.kt", i = {0, 2}, l = {53, 55, 57, 60, 63}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122208q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f122209r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f122210s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e f122211t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, e eVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f122210s = z12;
            this.f122211t = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f122210s, this.f122211t, continuation);
            bVar.f122209r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EndDealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.interactor.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EndDealInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.interactor.EndDealInteractorImpl$submit$1", f = "EndDealInteractor.kt", i = {0, 1, 3}, l = {76, 84, 85, 88, 93, 97}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Map f122212q;

        /* renamed from: r, reason: collision with root package name */
        public CommissionData f122213r;

        /* renamed from: s, reason: collision with root package name */
        public int f122214s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f122215t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f122216u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e f122217v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Map<String, EndDealField> f122218w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ CommissionData f122219x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z12, e eVar, Map<String, ? extends EndDealField> map, CommissionData commissionData, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f122216u = z12;
            this.f122217v = eVar;
            this.f122218w = map;
            this.f122219x = commissionData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f122216u, this.f122217v, this.f122218w, this.f122219x, continuation);
            cVar.f122215t = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EndDealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x021c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 612
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.interactor.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k h31.e<InterfaceC14233a> eVar, @k h31.e<InterfaceC39387a> eVar2, @k com.avito.android.comfortable_deal.end_deal.interactor.a aVar, @k EndDealArguments endDealArguments, @k com.avito.android.comfortable_deal.end_deal.mvi.validator.a aVar2, @k R0 r02) {
        this.f122198a = eVar;
        this.f122199b = eVar2;
        this.f122200c = aVar;
        this.f122201d = endDealArguments;
        this.f122202e = aVar2;
        this.f122203f = r02;
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.d
    @k
    public final InterfaceC43160i<EndDealInternalAction> a(int i12) {
        return C43175k.I(this.f122203f.a(), C43175k.G(new a(i12, null)));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.d
    @k
    public final InterfaceC43160i<EndDealInternalAction> b(@k Map<String, ? extends EndDealField> map, @l CommissionData commissionData, boolean z12) {
        return C43175k.I(this.f122203f.a(), C43175k.G(new c(z12, this, map, commissionData, null)));
    }

    @Override // com.avito.android.comfortable_deal.end_deal.interactor.d
    @k
    public final InterfaceC43160i<EndDealInternalAction> c(boolean z12) {
        return C43175k.I(this.f122203f.a(), C43175k.G(new b(z12, this, null)));
    }
}
