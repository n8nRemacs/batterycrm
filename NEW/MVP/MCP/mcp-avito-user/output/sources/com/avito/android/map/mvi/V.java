package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MyLocationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MyLocationInteractorImpl$checkPermissionInSettings$2", f = "MyLocationInteractor.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class V extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184984q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f184986s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f184987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(b0 b0Var, Continuation continuation, boolean z12) {
        super(2, continuation);
        this.f184986s = z12;
        this.f184987t = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        V v12 = new V(this.f184987t, continuation, this.f184986s);
        v12.f184985r = obj;
        return v12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((V) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184984q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f184985r;
            MapInternalAction.GeoEnabledAndPermissionGranted geoEnabledAndPermissionGranted = new MapInternalAction.GeoEnabledAndPermissionGranted(this.f184986s, this.f184987t.f185023a.getF215135c());
            this.f184984q = 1;
            if (interfaceC43172j.emit(geoEnabledAndPermissionGranted, this) == coroutine_suspended) {
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
