package com.avito.android.publish.screen.step.select.mvi;

import Ne0.InterfaceC14566a;
import Ne0.InterfaceC14567b;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.select.mvi.SelectActor$process$3", f = "SelectActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14567b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f242191q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14566a f242192r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, InterfaceC14566a interfaceC14566a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f242191q = fVar;
        this.f242192r = interfaceC14566a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f242191q, this.f242192r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14567b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        f fVar = this.f242191q;
        SelectParameter selectParameterC = fVar.c();
        if (selectParameterC != null) {
            selectParameterC.setValue(((InterfaceC14566a.e) this.f242192r).f11662a);
        }
        fVar.f242198b.xe(null);
        return G0.f406611a;
    }
}
