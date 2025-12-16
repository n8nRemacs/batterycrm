package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Iw.C14165c;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LocationGroupActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.mvi.LocationGroupActor$process$1", f = "LocationGroupActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationGroupInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C14165c f138146q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f138147r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C14165c c14165c, j jVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f138146q = c14165c;
        this.f138147r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f138146q, this.f138147r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LocationGroupInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C14165c c14165c = this.f138146q;
        if (c14165c.f8625e) {
            return G0.f406611a;
        }
        c14165c.f8625e = true;
        this.f138147r.f138194b.a(new LocationGroupInternalAction.AnalyticsEvent.LocationGroupShown(c14165c.f8622b));
        return G0.f406611a;
    }
}
