package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Iw.C14165c;
import Iw.InterfaceC14163a;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LocationGroupActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.mvi.LocationGroupActor$process$3", f = "LocationGroupActor.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationGroupInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138152q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138153r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C14165c f138154s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14163a f138155t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f138156u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C14165c c14165c, InterfaceC14163a interfaceC14163a, j jVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f138154s = c14165c;
        this.f138155t = interfaceC14163a;
        this.f138156u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f138154s, this.f138155t, this.f138156u, continuation);
        cVar.f138153r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LocationGroupInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138152q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138153r;
            C14165c c14165c = this.f138154s;
            SearchParams searchParams = c14165c.f8622b;
            InterfaceC14163a.d dVar = (InterfaceC14163a.d) this.f138155t;
            searchParams.setLocationId(String.valueOf(dVar.f8611a.getId()));
            int size = dVar.f8611a.a().size();
            SearchParams searchParams2 = c14165c.f8622b;
            if (size == 2) {
                searchParams2.setArea(new Area(new Coordinates(dVar.f8611a.a().get(0).get(0).doubleValue(), dVar.f8611a.a().get(0).get(1).doubleValue()), new Coordinates(dVar.f8611a.a().get(1).get(0).doubleValue(), dVar.f8611a.a().get(1).get(1).doubleValue())));
            } else {
                searchParams2.setArea(null);
            }
            InterfaceC43160i<LocationGroupInternalAction> interfaceC43160iA = this.f138156u.f138193a.a(searchParams2);
            this.f138152q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
