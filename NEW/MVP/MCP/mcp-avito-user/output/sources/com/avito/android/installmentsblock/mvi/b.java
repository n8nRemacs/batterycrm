package com.avito.android.installmentsblock.mvi;

import aO.InterfaceC19796b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsButton;
import com.huawei.hms.adapter.internal.AvailableCode;
import dO.InterfaceC39605a;
import dO.InterfaceC39606b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InstallmentsBlockActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdO/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.installmentsblock.mvi.InstallmentsBlockActor$process$2", f = "InstallmentsBlockActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC39606b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f172983q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f172984r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39605a f172985s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f172986t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC39605a interfaceC39605a, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f172985s = interfaceC39605a;
        this.f172986t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f172985s, this.f172986t, continuation);
        bVar.f172984r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC39606b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f172983q;
        InterfaceC39605a interfaceC39605a = this.f172985s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f172984r;
            DeepLink deepLink = ((InterfaceC39605a.C11025a) interfaceC39605a).f393836a.f172853e;
            if (deepLink != null) {
                InterfaceC39606b.a aVar = new InterfaceC39606b.a(deepLink);
                this.f172983q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        InterfaceC19796b interfaceC19796b = this.f172986t.f172990a;
        if (interfaceC19796b != null) {
            InstallmentsButton installmentsButton = ((InterfaceC39605a.C11025a) interfaceC39605a).f393836a;
            interfaceC19796b.b();
        }
        return G0.f406611a;
    }
}
