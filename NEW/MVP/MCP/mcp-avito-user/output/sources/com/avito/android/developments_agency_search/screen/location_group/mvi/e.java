package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Iw.C14165c;
import Iw.InterfaceC14163a;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.remote.model.SearchParams;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LocationGroupActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.mvi.LocationGroupActor$process$5", f = "LocationGroupActor.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationGroupInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138161q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138162r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C14165c f138163s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14163a f138164t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f138165u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C14165c c14165c, InterfaceC14163a interfaceC14163a, j jVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f138163s = c14165c;
        this.f138164t = interfaceC14163a;
        this.f138165u = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f138163s, this.f138164t, this.f138165u, continuation);
        eVar.f138162r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LocationGroupInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138161q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138162r;
            C14165c c14165c = this.f138163s;
            SearchParams searchParams = c14165c.f8622b;
            List<String> list = ((InterfaceC14163a.c) this.f138164t).f8610a;
            if (list.isEmpty()) {
                list = null;
            }
            searchParams.setDistrictId(list);
            InterfaceC43160i<LocationGroupInternalAction> interfaceC43160iA = this.f138165u.f138193a.a(c14165c.f8622b);
            this.f138161q = 1;
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
