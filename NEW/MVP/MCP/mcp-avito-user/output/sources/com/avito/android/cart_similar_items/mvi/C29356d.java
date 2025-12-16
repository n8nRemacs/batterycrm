package com.avito.android.cart_similar_items.mvi;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import un.C49079a;

/* compiled from: CartSimilarItemsActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lun/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lun/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$itemUpdates$2", f = "CartSimilarItemsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.cart_similar_items.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29356d extends SuspendLambda implements Y41.p<C49079a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f116015q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f116016r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29356d(LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f116016r = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29356d c29356d = new C29356d(this.f116016r, continuation);
        c29356d.f116015q = obj;
        return c29356d;
    }

    @Override // Y41.p
    public final Object invoke(C49079a c49079a, Continuation<? super G0> continuation) {
        return ((C29356d) create(c49079a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C49079a c49079a = (C49079a) this.f116015q;
        String str = c49079a.f440278a;
        C42784z0 c42784z0 = C42784z0.f406748b;
        LinkedHashMap linkedHashMap = this.f116016r;
        linkedHashMap.put(c49079a.f440278a, C42745f0.i0(c49079a, (List) linkedHashMap.getOrDefault(str, c42784z0)));
        return G0.f406611a;
    }
}
