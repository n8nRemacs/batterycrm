package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SellerRecallActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.client_room.seller_recall.mvi.SellerRecallActor$process$1", f = "SellerRecallActor.kt", i = {0, 0, 1, 1}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 32, 45}, m = "invokeSuspend", n = {"$this$flow", "validationSuccess", "$this$flow", "validationSuccess"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SellerRecallInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f119978q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f119979r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SellerRecallState f119980s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f119981t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SellerRecallState sellerRecallState, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f119980s = sellerRecallState;
        this.f119981t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f119980s, this.f119981t, continuation);
        aVar.f119979r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SellerRecallInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.f119978q
            r2 = 0
            r3 = 3
            r4 = 2
            com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState r5 = r13.f119980s
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            kotlin.C42729a0.b(r14)
            goto L90
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f119979r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L67
        L29:
            java.lang.Object r1 = r13.f119979r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r14)
            goto L50
        L31:
            kotlin.C42729a0.b(r14)
            java.lang.Object r14 = r13.f119979r
            r1 = r14
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            java.lang.String r14 = r5.f119997b
            kotlin.text.p r7 = com.avito.android.util.C5.f318568b
            boolean r14 = r7.e(r14)
            if (r14 != 0) goto L51
            com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction$ValidationPhoneFailure r14 = com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction.ValidationPhoneFailure.f119994b
            r13.f119979r = r1
            r13.f119978q = r6
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L50
            return r0
        L50:
            r6 = r2
        L51:
            java.lang.String r14 = r5.f119999d
            int r14 = r14.length()
            if (r14 != 0) goto L66
            com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction$ValidationReasonFailure r14 = com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction.ValidationReasonFailure.f119995b
            r13.f119979r = r1
            r13.f119978q = r4
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L67
            return r0
        L66:
            r2 = r6
        L67:
            if (r2 == 0) goto L90
            com.avito.android.comfortable_deal.client_room.seller_recall.mvi.b r14 = r13.f119981t
            com.avito.android.analytics.a r14 = r14.f119982a
            gp.a r2 = new gp.a
            java.lang.String r7 = r5.f119997b
            java.lang.String r8 = r5.f120000e
            java.lang.String r9 = r5.f119998c
            java.lang.String r10 = r5.f119999d
            java.lang.String r11 = r5.f120001f
            com.avito.android.comfortable_deal.client_room.model.PartnerStatus r12 = r5.f120002g
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.c(r2)
            com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction$SubmitSuccess r14 = com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction.SubmitSuccess.f119991b
            r2 = 0
            r13.f119979r = r2
            r13.f119978q = r3
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L90
            return r0
        L90:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.client_room.seller_recall.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
