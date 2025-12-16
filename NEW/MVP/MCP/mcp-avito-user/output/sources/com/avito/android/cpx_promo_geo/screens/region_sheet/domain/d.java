package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RegionSheetSearchUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpx_promo_geo.screens.region_sheet.domain.RegionSheetSearchUseCase$invoke$1", f = "RegionSheetSearchUseCase.kt", i = {1}, l = {40, 107}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super RegionSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public c f128300q;

    /* renamed from: r, reason: collision with root package name */
    public String f128301r;

    /* renamed from: s, reason: collision with root package name */
    public int f128302s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f128303t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f128304u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f128305v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f128304u = str;
        this.f128305v = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f128305v, this.f128304u, continuation);
        dVar.f128303t = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RegionSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        kotlinx.coroutines.sync.a aVar;
        c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f128302s;
        String str = this.f128304u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f128303t;
            RegionSheetInternalAction.SearchValueChanged searchValueChanged = new RegionSheetInternalAction.SearchValueChanged(str);
            this.f128302s = 1;
            if (interfaceC43172j.emit(searchValueChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f128301r;
                cVar = this.f128300q;
                aVar = (kotlinx.coroutines.sync.a) this.f128303t;
                C42729a0.b(obj);
                try {
                    cVar.f128297e = str;
                    G0 g02 = G0.f406611a;
                    aVar.d(null);
                    return G0.f406611a;
                } catch (Throwable th2) {
                    aVar.d(null);
                    throw th2;
                }
            }
            C42729a0.b(obj);
        }
        c cVar2 = this.f128305v;
        aVar = cVar2.f128298f;
        this.f128303t = aVar;
        this.f128300q = cVar2;
        this.f128301r = str;
        this.f128302s = 2;
        if (aVar.b(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cVar = cVar2;
        cVar.f128297e = str;
        G0 g022 = G0.f406611a;
        aVar.d(null);
        return G0.f406611a;
    }
}
