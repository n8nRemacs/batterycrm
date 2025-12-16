package com.avito.android.publish.screen.step.select.mvi;

import Ne0.InterfaceC14566a;
import Ne0.InterfaceC14567b;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.select.mvi.SelectActor$process$4", f = "SelectActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14567b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f242193q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14566a f242194r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, InterfaceC14566a interfaceC14566a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f242193q = fVar;
        this.f242194r = interfaceC14566a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f242193q, this.f242194r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14567b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        f fVar = this.f242193q;
        SelectParameter selectParameterC = fVar.c();
        InterfaceC14566a interfaceC14566a = this.f242194r;
        if (selectParameterC != null) {
            selectParameterC.setValue(((InterfaceC14566a.f) interfaceC14566a).f11663a);
        }
        InterfaceC14566a.f fVar2 = (InterfaceC14566a.f) interfaceC14566a;
        DeepLink deepLink = fVar2.f11664b;
        Bundle bundle = new Bundle();
        bundle.putString("attrIdValue", fVar2.f11663a);
        fVar.f242202f.r6(bundle, deepLink, "submitting_select_request_key");
        return G0.f406611a;
    }
}
