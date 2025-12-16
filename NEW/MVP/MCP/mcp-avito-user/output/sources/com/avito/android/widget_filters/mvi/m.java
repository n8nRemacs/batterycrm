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
@DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$process$$inlined$flatMapLatest$2", f = "WidgetFiltersActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class m extends SuspendLambda implements Y41.q<InterfaceC43172j<? super WidgetFiltersInternalAction>, a.C14639c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f330177q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f330178r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f330179s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f330180t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f330181u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Y41.a aVar, n nVar, Continuation continuation) {
        super(3, continuation);
        this.f330180t = nVar;
        this.f330181u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, a.C14639c c14639c, Continuation<? super G0> continuation) {
        m mVar = new m(this.f330181u, this.f330180t, continuation);
        mVar.f330178r = interfaceC43172j;
        mVar.f330179s = c14639c;
        return mVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f330177q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f330178r;
            a.C14639c c14639c = (a.C14639c) this.f330179s;
            Y41.a aVar = this.f330181u;
            com.avito.android.widget_filters.mvi.entity.c cVar = (com.avito.android.widget_filters.mvi.entity.c) aVar.invoke();
            WidgetFiltersInternalAction.UpdateCategory.ChangeCategorySelection changeCategorySelection = new WidgetFiltersInternalAction.UpdateCategory.ChangeCategorySelection(c14639c.f12239a, c14639c.f12241c);
            int i13 = ((com.avito.android.widget_filters.mvi.entity.c) aVar.invoke()).f330105l + 1;
            n nVar = this.f330180t;
            nVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new C36160d(changeCategorySelection, nVar, cVar, c14639c.f12240b, i13, null));
            this.f330177q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
