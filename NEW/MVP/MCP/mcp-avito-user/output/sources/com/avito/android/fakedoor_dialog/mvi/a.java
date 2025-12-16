package com.avito.android.fakedoor_dialog.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mC.InterfaceC43944b;

/* compiled from: FakeDoorDialogActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LmC/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.fakedoor_dialog.mvi.FakeDoorDialogActor$process$1", f = "FakeDoorDialogActor.kt", i = {0, 1}, l = {35, 36, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC43944b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f155122q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f155123r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ mC.d f155124s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f155125t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FakeDoorDialogLink.DialogButton f155126u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mC.d dVar, b bVar, FakeDoorDialogLink.DialogButton dialogButton, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f155124s = dVar;
        this.f155125t = bVar;
        this.f155126u = dialogButton;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f155124s, this.f155125t, this.f155126u, continuation);
        aVar.f155123r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC43944b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f155122q;
        FakeDoorDialogLink.DialogButton dialogButton = this.f155126u;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f155123r;
            if (this.f155124s.f414396b == C42745f0.J(this.f155125t.f155127a.f155102d)) {
                InterfaceC43944b.a aVar = InterfaceC43944b.a.f414392a;
                this.f155123r = interfaceC43172j;
                this.f155122q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (dialogButton.getAction() == null) {
                InterfaceC43944b.c cVar = InterfaceC43944b.c.f414394a;
                this.f155123r = interfaceC43172j;
                this.f155122q = 2;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f155123r;
            C42729a0.b(obj);
        }
        DeepLink action = dialogButton.getAction();
        if (action != null) {
            InterfaceC43944b.C11818b c11818b = new InterfaceC43944b.C11818b(action);
            this.f155123r = null;
            this.f155122q = 3;
            if (interfaceC43172j.emit(c11818b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
