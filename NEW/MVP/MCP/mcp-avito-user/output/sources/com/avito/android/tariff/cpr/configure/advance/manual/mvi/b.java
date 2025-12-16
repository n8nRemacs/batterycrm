package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import Y41.p;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction;
import fB0.InterfaceC40274a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CprConfigureAdvanceManualActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LfB0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff/cpr/configure/advance/manual/mvi/entity/CprConfigureAdvanceManualInternalAction;", "<anonymous>", "(LfB0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.mvi.CprConfigureAdvanceManualActor$process$1", f = "CprConfigureAdvanceManualActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC40274a, Continuation<? super InterfaceC43160i<? extends CprConfigureAdvanceManualInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f295402q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f295403r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<fB0.c> f295404s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<fB0.c> aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f295403r = cVar;
        this.f295404s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f295403r, this.f295404s, continuation);
        bVar.f295402q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC40274a interfaceC40274a, Continuation<? super InterfaceC43160i<? extends CprConfigureAdvanceManualInternalAction>> continuation) {
        return ((b) create(interfaceC40274a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f295403r.b((InterfaceC40274a) this.f295402q, this.f295404s.invoke());
    }
}
