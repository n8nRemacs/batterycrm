package com.avito.android.verification.verification_form_builder.mvi;

import TM0.a;
import TM0.c;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FormBuilderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction$SetButtonLoading;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_form_builder.mvi.FormBuilderActor$handleLinkLoadingRender$1", f = "FormBuilderActor.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FormBuilderInternalAction.SetButtonLoading>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325426q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325427r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TM0.c f325428s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.c f325429t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TM0.c cVar, a.c cVar2, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f325428s = cVar;
        this.f325429t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f325428s, this.f325429t, continuation);
        dVar.f325427r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FormBuilderInternalAction.SetButtonLoading> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        FormBuilderScreenData formBuilderScreenData;
        List<com.avito.conveyor_item.a> list;
        a.c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325426q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325427r;
            TM0.c cVar2 = this.f325428s;
            Object obj2 = null;
            c.b bVar = cVar2 instanceof c.b ? (c.b) cVar2 : null;
            if (bVar != null && (formBuilderScreenData = bVar.f15624b) != null && (list = formBuilderScreenData.f325354e) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    cVar = this.f325429t;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
                    if ((aVar instanceof ButtonItem) && L.f(((ButtonItem) aVar).f323903d, cVar.f15612a)) {
                        obj2 = next;
                        break;
                    }
                }
                com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) obj2;
                if (aVar2 != null) {
                    FormBuilderInternalAction.SetButtonLoading setButtonLoading = new FormBuilderInternalAction.SetButtonLoading(aVar2.getF281526b(), cVar.f15613b);
                    this.f325426q = 1;
                    if (interfaceC43172j.emit(setButtonLoading, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
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
