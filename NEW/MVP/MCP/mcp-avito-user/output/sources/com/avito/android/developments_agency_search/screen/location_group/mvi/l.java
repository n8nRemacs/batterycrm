package com.avito.android.developments_agency_search.screen.location_group.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import com.avito.android.remote.model.SearchParams;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
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

/* compiled from: LocationGroupBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/mvi/l;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements com.avito.android.arch.mvi.b<LocationGroupInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_agency_search.screen.location_group.l f138197a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f138198b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138199c;

    /* compiled from: LocationGroupBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.location_group.mvi.LocationGroupBootstrap$produce$1", f = "LocationGroupBootstrap.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationGroupInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f138200q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f138201r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = l.this.new a(continuation);
            aVar.f138201r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LocationGroupInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f138200q;
            l lVar = l.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f138201r;
                if (lVar.f138199c) {
                    return G0.f406611a;
                }
                lVar.f138199c = true;
                LocationGroupInternalAction.UpdateSearchParams updateSearchParams = new LocationGroupInternalAction.UpdateSearchParams(lVar.f138198b);
                this.f138201r = interfaceC43172j;
                this.f138200q = 1;
                if (interfaceC43172j.emit(updateSearchParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f138201r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<LocationGroupInternalAction> interfaceC43160iA = lVar.f138197a.a(lVar.f138198b);
            this.f138201r = null;
            this.f138200q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public l(@Y61.k com.avito.android.developments_agency_search.screen.location_group.l lVar, @Y61.k LocationGroupArguments locationGroupArguments) {
        this.f138197a = lVar;
        this.f138198b = locationGroupArguments.f138039b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<LocationGroupInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
