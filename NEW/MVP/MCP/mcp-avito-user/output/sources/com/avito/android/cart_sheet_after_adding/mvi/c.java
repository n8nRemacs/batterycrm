package com.avito.android.cart_sheet_after_adding.mvi;

import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import gn.InterfaceC40710b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CartSheetAfterAddingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_sheet_after_adding.mvi.CartSheetAfterAddingActor$process$3", f = "CartSheetAfterAddingActor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CartSheetAfterAddingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f115356q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115357r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gn.e f115358s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40710b f115359t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC40710b interfaceC40710b, gn.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f115358s = eVar;
        this.f115359t = interfaceC40710b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f115359t, this.f115358s, continuation);
        cVar.f115357r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CartSheetAfterAddingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
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
            int r1 = r6.f115356q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r7)
            goto L86
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f115357r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            gn.e r1 = r6.f115358s
            gn.a r1 = r1.f396823f
            gn.a$a r1 = r1.f396789a
            gn.b r3 = r6.f115359t
            gn.b$e r3 = (gn.InterfaceC40710b.e) r3
            vn.b r3 = r3.f396801a
            if (r1 != 0) goto L30
            if (r3 != 0) goto L30
            goto L86
        L30:
            if (r1 == 0) goto L78
            if (r3 != 0) goto L35
            goto L78
        L35:
            com.avito.android.remote.model.text.AttributedText r4 = r3.getText()
            com.avito.android.remote.model.text.AttributedText r5 = r1.f396790a
            boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
            if (r4 == 0) goto L78
            java.util.List<com.avito.android.cart_sheet_after_adding.ui.components.B> r1 = r1.f396791b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r1.next()
            com.avito.android.cart_sheet_after_adding.ui.components.B r5 = (com.avito.android.cart_sheet_after_adding.ui.components.B) r5
            float r5 = r5.f115523a
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5)
            r4.add(r5)
            goto L54
        L6a:
            vn.b$a r1 = r3.getProgressBar()
            java.util.List r1 = r1.a()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L86
        L78:
            com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction$UpdateDiscountOnDelivery r1 = new com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction$UpdateDiscountOnDelivery
            r1.<init>(r3)
            r6.f115356q = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L86
            return r0
        L86:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_sheet_after_adding.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
