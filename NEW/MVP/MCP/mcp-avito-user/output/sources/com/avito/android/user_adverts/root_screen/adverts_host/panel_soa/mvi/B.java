package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PanelSoaActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.PanelSoaActor$wrapWithAuthorization$1", f = "PanelSoaActor.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class B extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313492q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f313493r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35597a f313494s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C35597a c35597a, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f313494s = c35597a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        B b12 = new B(this.f313494s, continuation);
        b12.f313493r = obj;
        return b12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Boolean> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((B) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313492q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f313493r;
            Boolean boolBoxBoolean = Boxing.boxBoolean(this.f313494s.f313516b.b());
            this.f313492q = 1;
            if (interfaceC43172j.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
