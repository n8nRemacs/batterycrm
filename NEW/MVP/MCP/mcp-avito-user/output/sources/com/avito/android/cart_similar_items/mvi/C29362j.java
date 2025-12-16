package com.avito.android.cart_similar_items.mvi;

import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import mn.InterfaceC44105e;

/* compiled from: CartSimilarItemsActor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lmn/e;", "acc", "action", "<anonymous>", "(Ljava/util/List;Lmn/e;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_similar_items.mvi.CartSimilarItemsActor$logQuantityChanges$1", f = "CartSimilarItemsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.cart_similar_items.mvi.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29362j extends SuspendLambda implements Y41.q<List<InterfaceC44105e>, InterfaceC44105e, Continuation<? super List<InterfaceC44105e>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f116074q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC44105e f116075r;

    public C29362j() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(List<InterfaceC44105e> list, InterfaceC44105e interfaceC44105e, Continuation<? super List<InterfaceC44105e>> continuation) {
        C29362j c29362j = new C29362j(3, continuation);
        c29362j.f116074q = list;
        c29362j.f116075r = interfaceC44105e;
        return c29362j.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = this.f116074q;
        list.add(this.f116075r);
        return list;
    }
}
