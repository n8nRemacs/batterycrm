package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.remote.model.MarkersFeatures;
import com.avito.android.remote.model.SearchParams;
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

/* compiled from: MapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$4", f = "MapActor.kt", i = {}, l = {116, 118}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31625n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f185284q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f185285r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.map.mvi.entity.a f185286s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C31612a f185287t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31625n(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f185286s = aVar;
        this.f185287t = c31612a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31625n c31625n = new C31625n(this.f185287t, this.f185286s, continuation);
        c31625n.f185285r = obj;
        return c31625n;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31625n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f185284q;
        if (i12 != 0) {
            if (i12 == 1) {
            } else if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        } else {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f185285r;
            com.avito.android.map.mvi.entity.a aVar = this.f185286s;
            a.C5436a.C5437a c5437a = aVar.f185164o.f185180e;
            if (c5437a != null) {
                MarkersFeatures markersFeatures = aVar.f185153d;
                Boolean boolIsBeduinPinItems = markersFeatures != null ? markersFeatures.isBeduinPinItems() : null;
                SearchParams searchParams = aVar.f185151b;
                int i13 = C31612a.f185004g;
                InterfaceC43160i interfaceC43160iC = this.f185287t.c(boolIsBeduinPinItems, c5437a, true, searchParams, 0, aVar.f185169t);
                this.f185285r = interfaceC43160iC;
                this.f185284q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                kotlinx.coroutines.flow.internal.m mVarE = C31612a.e(this.f185287t, aVar, 12);
                this.f185284q = 2;
                if (C43175k.u(this, mVarE, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
