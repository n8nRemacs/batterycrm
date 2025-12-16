package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction;
import com.avito.android.util.ApiException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ItemPriceHistoryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.item_price_history.presentation.mvi.ItemPriceHistoryActor$process$1", f = "ItemPriceHistoryActor.kt", i = {0, 1, 3, 3}, l = {41, 43, 46, 50, 51}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "error"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ItemPriceHistoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ApiException f173777q;

    /* renamed from: r, reason: collision with root package name */
    public int f173778r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f173779s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f173780t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EO.c f173781u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ EO.a f173782v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, EO.c cVar2, EO.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f173780t = cVar;
        this.f173781u = cVar2;
        this.f173782v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f173780t, this.f173781u, this.f173782v, continuation);
        aVar.f173779s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ItemPriceHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_price_history.presentation.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
