package com.avito.android.map.mvi;

import bY.InterfaceC25585b;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.map.mvi.entity.MapInternalAction;
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
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$8", f = "MapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31627p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C31612a f185290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25585b f185291r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31627p(C31612a c31612a, InterfaceC25585b interfaceC25585b, Continuation<? super C31627p> continuation) {
        super(2, continuation);
        this.f185290q = c31612a;
        this.f185291r = interfaceC25585b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C31627p(this.f185290q, this.f185291r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31627p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f185290q.f185007c, ((InterfaceC25585b.C25595k) this.f185291r).f57142a, null, null, 6);
        return G0.f406611a;
    }
}
