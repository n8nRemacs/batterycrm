package com.avito.android.lib.beduin_v2.beduin_item;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.avito.component.items_controller.i;
import kotlin.AbstractC40048c;
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
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.beduin_item.BeduinItemsStateKt$itemsControllerStates$$inlined$flatMapLatest$1", f = "BeduinItemsState.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
public final class d extends SuspendLambda implements q<InterfaceC43172j<? super i.a>, AbstractC40048c.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f175446q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f175447r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f175448s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super i.a> interfaceC43172j, AbstractC40048c.a aVar, Continuation<? super G0> continuation) {
        d dVar = new d(3, continuation);
        dVar.f175447r = interfaceC43172j;
        dVar.f175448s = aVar;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f175446q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f175447r;
            InterfaceC43160i interfaceC43160iD = C43175k.d(new e((AbstractC40048c.a) this.f175448s, null));
            this.f175446q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
