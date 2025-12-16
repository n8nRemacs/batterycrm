package com.avito.android.installmentsblock.mvi;

import aO.InterfaceC19796b;
import dO.InterfaceC39605a;
import dO.InterfaceC39606b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InstallmentsBlockActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdO/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.installmentsblock.mvi.InstallmentsBlockActor$process$1", f = "InstallmentsBlockActor.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC39606b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f172979q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f172980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39605a f172981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f172982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC39605a interfaceC39605a, d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f172981s = interfaceC39605a;
        this.f172982t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f172981s, this.f172982t, continuation);
        aVar.f172980r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC39606b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f172979q;
        InterfaceC39605a interfaceC39605a = this.f172981s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f172980r;
            InterfaceC39606b.C11026b c11026b = new InterfaceC39606b.C11026b(((InterfaceC39605a.d) interfaceC39605a).f393839a);
            this.f172979q = 1;
            if (interfaceC43172j.emit(c11026b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        InterfaceC19796b interfaceC19796b = this.f172982t.f172990a;
        if (interfaceC19796b != null) {
            String str = ((InterfaceC39605a.d) interfaceC39605a).f393839a;
            interfaceC19796b.a();
        }
        return G0.f406611a;
    }
}
