package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CpxPromoV2Actor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processReload$1", f = "CpxPromoV2Actor.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6}, l = {351, 352, 355, 358, 361, 368, 376, 383, 387}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "cpxPromo", "$this$flow", "cpxPromo", "isAuto", "$this$flow", "cpxPromo", "selectedBudget", "isAuto", "$this$flow", "cpxPromo", "isAuto", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "L$0"})
/* loaded from: classes12.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public CpxPromoV2 f127722q;

    /* renamed from: r, reason: collision with root package name */
    public CpxPromoV2.Auto.Budget.Value.BudgetId f127723r;

    /* renamed from: s, reason: collision with root package name */
    public int f127724s;

    /* renamed from: t, reason: collision with root package name */
    public int f127725t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f127726u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f127727v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f127727v = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f127727v, continuation);
        kVar.f127726u = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
