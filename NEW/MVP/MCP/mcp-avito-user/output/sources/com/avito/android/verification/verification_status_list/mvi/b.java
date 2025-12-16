package com.avito.android.verification.verification_status_list.mvi;

import Y41.p;
import YM0.a;
import YM0.b;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StatusListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_status_list/mvi/entity/StatusListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_status_list.mvi.StatusListActor$process$2", f = "StatusListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super StatusListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ YM0.b f325786q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f325787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ YM0.a f325788s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(YM0.b bVar, c cVar, YM0.a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f325786q = bVar;
        this.f325787r = cVar;
        this.f325788s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f325786q, this.f325787r, this.f325788s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StatusListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        YM0.b bVar = this.f325786q;
        b.C1377b c1377b = bVar instanceof b.C1377b ? (b.C1377b) bVar : null;
        Map<String, String> mapC = c1377b != null ? c1377b.f19458c : null;
        if (mapC == null) {
            mapC = P0.c();
        }
        c cVar = this.f325787r;
        cVar.f325791c.c(new WM0.a(mapC));
        b.a.a(cVar.f325789a, ((a.C1376a) this.f325788s).f19452a, null, null, 6);
        return G0.f406611a;
    }
}
