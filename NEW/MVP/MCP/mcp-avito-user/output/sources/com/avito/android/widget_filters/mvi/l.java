package com.avito.android.widget_filters.mvi;

import OP0.a;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$process$$inlined$flatMapLatest$1", f = "WidgetFiltersActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super WidgetFiltersInternalAction>, a.q, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f330173q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f330174r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f330175s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f330176t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Continuation continuation, n nVar) {
        super(3, continuation);
        this.f330176t = nVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, a.q qVar, Continuation<? super G0> continuation) {
        l lVar = new l(continuation, this.f330176t);
        lVar.f330174r = interfaceC43172j;
        lVar.f330175s = qVar;
        return lVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f330173q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f330174r;
            InterfaceC43160i interfaceC43160iA = this.f330176t.f330182a.a(((a.q) this.f330175s).f12261a);
            this.f330173q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
