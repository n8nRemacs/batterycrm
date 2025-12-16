package com.avito.android.seller_promotions.mvi;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yn.C50271a;

/* compiled from: SellerPromotionsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$itemUpdates$3$1", f = "SellerPromotionsActor.kt", i = {0, 1, 2, 2, 4, 4, 5, 5, 6, 6}, l = {238, 239, 240, 245, 249, 250, 251, 252}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.seller_promotions.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34674e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SellerPromotionsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult f267948q;

    /* renamed from: r, reason: collision with root package name */
    public int f267949r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f267950s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34670a f267951t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<C50271a> f267952u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f267953v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f267954w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34674e(C34670a c34670a, List<C50271a> list, Y41.a<G0> aVar, Y41.a<G0> aVar2, Continuation<? super C34674e> continuation) {
        super(2, continuation);
        this.f267951t = c34670a;
        this.f267952u = list;
        this.f267953v = aVar;
        this.f267954w = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34674e c34674e = new C34674e(this.f267951t, this.f267952u, this.f267953v, this.f267954w, continuation);
        c34674e.f267950s = obj;
        return c34674e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SellerPromotionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34674e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0140 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_promotions.mvi.C34674e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
