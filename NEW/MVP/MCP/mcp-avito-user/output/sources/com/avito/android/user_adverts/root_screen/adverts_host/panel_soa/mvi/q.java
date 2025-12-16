package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import MI0.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$processOpenSoaInfo$$inlined$flatMapLatest$1", f = "PanelSoaActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MI0.b>, MI0.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313613q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f313614r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f313615s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super MI0.b> interfaceC43172j, MI0.b bVar, Continuation<? super G0> continuation) {
        q qVar = new q(3, continuation);
        qVar.f313614r = interfaceC43172j;
        qVar.f313615s = bVar;
        return qVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313613q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f313614r;
            MI0.b bVar = (MI0.b) this.f313615s;
            InterfaceC43160i c43207v = bVar instanceof b.g ? new C43207v(new MI0.b[]{new b.e(((b.g) bVar).f10565a), bVar}) : new C43210w(bVar);
            this.f313613q = 1;
            if (C43175k.u(this, c43207v, interfaceC43172j) == coroutine_suspended) {
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
