package com.avito.android.map.mvi;

import bY.InterfaceC25585b;
import com.avito.android.map.mvi.entity.MapInternalAction;
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

/* compiled from: MapActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$11", f = "MapActor.kt", i = {0}, l = {294, 295}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.map.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31615d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f185040q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f185041r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31612a f185042s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.map.mvi.entity.a f185043t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25585b f185044u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31615d(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, InterfaceC25585b interfaceC25585b, Continuation<? super C31615d> continuation) {
        super(2, continuation);
        this.f185042s = c31612a;
        this.f185043t = aVar;
        this.f185044u = interfaceC25585b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31615d c31615d = new C31615d(this.f185042s, this.f185043t, this.f185044u, continuation);
        c31615d.f185041r = obj;
        return c31615d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31615d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f185040q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f185041r;
            int i13 = C31612a.f185004g;
            C31612a c31612a = this.f185042s;
            c31612a.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new r(c31612a, this.f185043t, null));
            this.f185041r = interfaceC43172j;
            this.f185040q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f185041r;
            C42729a0.b(obj);
        }
        InterfaceC25585b.m mVar = (InterfaceC25585b.m) this.f185044u;
        MapInternalAction.LocationLoaded locationLoaded = new MapInternalAction.LocationLoaded(mVar.f57144a, mVar.f57146c, mVar.f57145b);
        this.f185041r = null;
        this.f185040q = 2;
        if (interfaceC43172j.emit(locationLoaded, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
