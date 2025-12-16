package com.avito.android.seller_promotions.mvi;

import Oq0.InterfaceC14727a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: SellerPromotionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LOq0/a;", "acc", "action", "<anonymous>", "(Ljava/util/List;LOq0/a;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.seller_promotions.mvi.SellerPromotionsActor$logQuantityChanges$1", f = "SellerPromotionsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.seller_promotions.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34678i extends SuspendLambda implements Y41.q<List<InterfaceC14727a>, InterfaceC14727a, Continuation<? super List<InterfaceC14727a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f268007q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC14727a f268008r;

    public C34678i() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(List<InterfaceC14727a> list, InterfaceC14727a interfaceC14727a, Continuation<? super List<InterfaceC14727a>> continuation) {
        C34678i c34678i = new C34678i(3, continuation);
        c34678i.f268007q = list;
        c34678i.f268008r = interfaceC14727a;
        return c34678i.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = this.f268007q;
        list.add(this.f268008r);
        return list;
    }
}
