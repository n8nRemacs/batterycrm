package com.avito.android.historical_suggests.suggest.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.mvi.HistoricalSuggestsActor$process$2", f = "HistoricalSuggestsActor.kt", i = {0}, l = {34, 39}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super HistoricalSuggestsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f162126q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f162127r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49216a f162128s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f162129t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC49216a interfaceC49216a, c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f162128s = interfaceC49216a;
        this.f162129t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f162128s, this.f162129t, continuation);
        bVar.f162127r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HistoricalSuggestsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f162126q
            r3 = 2
            r4 = 1
            r5 = 0
            vI.a r6 = r0.f162128s
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            kotlin.C42729a0.b(r21)
            goto L96
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.Object r2 = r0.f162127r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r21)
            r4 = r21
            goto L59
        L2a:
            kotlin.C42729a0.b(r21)
            java.lang.Object r2 = r0.f162127r
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            r7 = r6
            vI.a$d r7 = (vI.InterfaceC49216a.d) r7
            com.avito.android.remote.model.category_parameters.AddressParameter$Value r8 = r7.f440652a
            com.avito.android.remote.model.category_parameters.AddressParameter$Value$PublishValueSellerAddressData r8 = r8.getAddressData()
            if (r8 == 0) goto L41
            java.lang.String r8 = r8.getId()
            goto L42
        L41:
            r8 = r5
        L42:
            if (r8 != 0) goto L84
            com.avito.android.historical_suggests.suggest.mvi.c r8 = r0.f162129t
            com.avito.android.historical_suggests.suggest.usecase.i r8 = r8.f162131b
            com.avito.android.remote.model.category_parameters.AddressParameter$Value r7 = r7.f440652a
            java.lang.String r7 = r7.getJsonWebToken()
            r0.f162127r = r2
            r0.f162126q = r4
            java.lang.Object r4 = r8.a(r7, r0)
            if (r4 != r1) goto L59
            return r1
        L59:
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            vI.a$d r6 = (vI.InterfaceC49216a.d) r6
            com.avito.android.remote.model.category_parameters.AddressParameter$Value r4 = r6.f440652a
            if (r9 == 0) goto L71
            com.avito.android.remote.model.category_parameters.AddressParameter$Value$PublishValueSellerAddressData r6 = new com.avito.android.remote.model.category_parameters.AddressParameter$Value$PublishValueSellerAddressData
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r8 = 0
            r10 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r17 = r6
            goto L73
        L71:
            r17 = r5
        L73:
            r18 = 15
            r19 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r10 = r4
            com.avito.android.remote.model.category_parameters.AddressParameter$Value r4 = com.avito.android.remote.model.category_parameters.AddressParameter.Value.copy$default(r10, r11, r13, r15, r16, r17, r18, r19)
            goto L86
        L84:
            com.avito.android.remote.model.category_parameters.AddressParameter$Value r4 = r7.f440652a
        L86:
            com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction$c r6 = new com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction$c
            r6.<init>(r4)
            r0.f162127r = r5
            r0.f162126q = r3
            java.lang.Object r2 = r2.emit(r6, r0)
            if (r2 != r1) goto L96
            return r1
        L96:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.historical_suggests.suggest.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
