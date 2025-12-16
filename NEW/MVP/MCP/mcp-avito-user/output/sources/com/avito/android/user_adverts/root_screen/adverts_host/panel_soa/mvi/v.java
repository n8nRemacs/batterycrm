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
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$updateSoaStats$$inlined$flatMapLatest$1", f = "PanelSoaActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class v extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MI0.b>, MI0.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313629q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f313630r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f313631s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35597a f313632t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C35597a c35597a, Continuation continuation) {
        super(3, continuation);
        this.f313632t = c35597a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super MI0.b> interfaceC43172j, MI0.b bVar, Continuation<? super G0> continuation) {
        v vVar = new v(this.f313632t, continuation);
        vVar.f313630r = interfaceC43172j;
        vVar.f313631s = bVar;
        return vVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i c43210w;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313629q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f313630r;
            MI0.b bVar = (MI0.b) this.f313631s;
            if (bVar instanceof b.m) {
                C35597a c35597a = this.f313632t;
                c43210w = C43175k.I(c35597a.f313519e.a(), new C43137a0(new y(bVar, null), new z(C43175k.G(new x(c35597a, null)), c35597a)));
            } else {
                c43210w = bVar instanceof b.j ? new C43210w(bVar) : new C43210w(b.d.f10561a);
            }
            this.f313629q = 1;
            if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
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
