package com.avito.android.map.mvi;

import bY.InterfaceC25585b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$14", f = "MapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31618g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C31612a f185254q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.map.mvi.entity.a f185255r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25585b f185256s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31618g(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, InterfaceC25585b interfaceC25585b, Continuation<? super C31618g> continuation) {
        super(2, continuation);
        this.f185254q = c31612a;
        this.f185255r = aVar;
        this.f185256s = interfaceC25585b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C31618g(this.f185254q, this.f185255r, this.f185256s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31618g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C31612a c31612a = this.f185254q;
        com.avito.android.map.analytics.a aVar = c31612a.f185008d;
        SearchParams searchParams = this.f185255r.f185151b;
        InterfaceC25585b.s sVar = (InterfaceC25585b.s) this.f185256s;
        aVar.l(searchParams, sVar.f57155a.getId());
        DeepLink onClick = sVar.f57155a.getOnClick();
        if (onClick != null) {
            b.a.a(c31612a.f185007c, onClick, null, null, 6);
        }
        return G0.f406611a;
    }
}
