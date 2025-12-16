package com.avito.android.realty_agency.checkerboard;

import Zh0.InterfaceC19559a;
import com.avito.android.realty_agency.checkerboard.CheckerboardActivity;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: CheckerboardActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.CheckerboardActivity$observeDeeplinkResult$1", f = "CheckerboardActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f250932q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CheckerboardActivity f250933r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CheckerboardActivity checkerboardActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f250933r = checkerboardActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f250933r, continuation);
        aVar.f250932q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f250932q;
        CheckerboardActivity.a aVar = CheckerboardActivity.f250899B;
        o oVarA2 = this.f250933r.a2();
        com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
        oVarA2.accept(new InterfaceC19559a.g(aVar2.f134521b, c43501a.f413261b));
        return G0.f406611a;
    }
}
