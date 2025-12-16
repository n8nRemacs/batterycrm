package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.InterfaceC14016a;
import Y41.p;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EndDealActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.mvi.EndDealActor$process$1", f = "EndDealActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122284q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122285r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Hp.c f122286s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14016a f122287t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Hp.c cVar, InterfaceC14016a interfaceC14016a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f122286s = cVar;
        this.f122287t = interfaceC14016a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f122286s, this.f122287t, continuation);
        aVar.f122285r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EndDealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[RETURN] */
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
            int r1 = r8.f122284q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r9)
            goto L80
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f122285r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            Hp.c r1 = r8.f122286s
            java.util.Map<java.lang.String, com.avito.android.comfortable_deal.end_deal.model.EndDealField> r1 = r1.f7737g
            r3 = 0
            Hp.a r4 = r8.f122287t
            if (r1 == 0) goto L34
            r5 = r4
            Hp.a$g r5 = (Hp.InterfaceC14016a.g) r5
            java.lang.String r5 = r5.f7716a
            java.lang.Object r1 = r1.get(r5)
            com.avito.android.comfortable_deal.end_deal.model.EndDealField r1 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField) r1
            goto L35
        L34:
            r1 = r3
        L35:
            boolean r5 = r1 instanceof com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipGroup
            if (r5 == 0) goto L3c
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipGroup r1 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipGroup) r1
            goto L3d
        L3c:
            r1 = r3
        L3d:
            if (r1 == 0) goto L6b
            java.util.List<com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipGroup$Chip> r1 = r1.f122261d
            if (r1 == 0) goto L6b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r1.next()
            r6 = r5
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipGroup$Chip r6 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipGroup.Chip) r6
            java.lang.String r6 = r6.f122263c
            r7 = r4
            Hp.a$g r7 = (Hp.InterfaceC14016a.g) r7
            java.lang.String r7 = r7.f7717b
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            if (r6 == 0) goto L49
            r3 = r5
        L64:
            com.avito.android.comfortable_deal.end_deal.model.EndDealField$ChipGroup$Chip r3 = (com.avito.android.comfortable_deal.end_deal.model.EndDealField.ChipGroup.Chip) r3
            if (r3 == 0) goto L6b
            boolean r1 = r3.f122265e
            goto L6c
        L6b:
            r1 = 0
        L6c:
            com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$UpdateChipValue r3 = new com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$UpdateChipValue
            Hp.a$g r4 = (Hp.InterfaceC14016a.g) r4
            java.lang.String r5 = r4.f7716a
            java.lang.String r4 = r4.f7717b
            r3.<init>(r5, r4, r1)
            r8.f122284q = r2
            java.lang.Object r9 = r9.emit(r3, r8)
            if (r9 != r0) goto L80
            return r0
        L80:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
