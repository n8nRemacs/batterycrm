package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MyLocationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/MapInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/map/mvi/entity/MapInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MyLocationInteractorImpl$isPermissionsGrantedDialog$3", f = "MyLocationInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class Y extends SuspendLambda implements Y41.p<MapInternalAction, Continuation<? super InterfaceC43160i<? extends MapInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f184996q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f184997r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f184998s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(b0 b0Var, Continuation continuation, boolean z12) {
        super(2, continuation);
        this.f184997r = b0Var;
        this.f184998s = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Y y12 = new Y(this.f184997r, continuation, this.f184998s);
        y12.f184996q = obj;
        return y12;
    }

    @Override // Y41.p
    public final Object invoke(MapInternalAction mapInternalAction, Continuation<? super InterfaceC43160i<? extends MapInternalAction>> continuation) {
        return ((Y) create(mapInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MapInternalAction mapInternalAction = (MapInternalAction) this.f184996q;
        boolean zF2 = kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.IsPermissionGranted.f185082b);
        boolean z12 = this.f184998s;
        b0 b0Var = this.f184997r;
        if (zF2) {
            return b0Var.a(z12);
        }
        if (!kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.IsRequestRationale.f185083b)) {
            return C43175k.w();
        }
        if (z12) {
            return C43175k.w();
        }
        return new C43152f0(new Z(C43175k.I(b0Var.f185024b.b(), kotlinx.coroutines.rx3.y.a(b0Var.f185023a.c().F()))), new a0(3, null));
    }
}
