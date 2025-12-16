package com.avito.android.avito_finance_user_profile.view.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pg.C47078d;
import pg.InterfaceC47075a;
import pg.InterfaceC47077c;

/* compiled from: AvitoFinanceBlockActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpg/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lpg/c;", "<anonymous>", "(Lpg/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avito_finance_user_profile.view.mvi.AvitoFinanceBlockActor$process$1", f = "AvitoFinanceBlockActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC47075a, Continuation<? super InterfaceC43160i<? extends InterfaceC47077c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f98043q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f98044r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C47078d> f98045s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Y41.a<C47078d> aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f98044r = gVar;
        this.f98045s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f98044r, this.f98045s, continuation);
        cVar.f98043q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC47075a interfaceC47075a, Continuation<? super InterfaceC43160i<? extends InterfaceC47077c>> continuation) {
        return ((c) create(interfaceC47075a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC47075a interfaceC47075a = (InterfaceC47075a) this.f98043q;
        this.f98045s.invoke();
        return this.f98044r.c(interfaceC47075a);
    }
}
