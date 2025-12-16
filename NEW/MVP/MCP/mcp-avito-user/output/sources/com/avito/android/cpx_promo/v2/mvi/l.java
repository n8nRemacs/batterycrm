package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
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
@DebugMetadata(c = "com.avito.android.cpx_promo.v2.mvi.CpxPromoV2Actor$processSegmentedControlChange$1", f = "CpxPromoV2Actor.kt", i = {0, 1, 2, 3}, l = {223, 224, 231, 243, 250}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CpxPromoV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f127728q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f127729r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f127730s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.i f127731t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CpxPromoV2State f127732u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, a.i iVar, CpxPromoV2State cpxPromoV2State, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f127730s = mVar;
        this.f127731t = iVar;
        this.f127732u = cpxPromoV2State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f127730s, this.f127731t, this.f127732u, continuation);
        lVar.f127729r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxPromoV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
