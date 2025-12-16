package com.avito.android.mortgage.pre_approval.form.mvi;

import Y41.p;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import com.avito.android.select.Arguments;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PreApprovalFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.PreApprovalFormActor$selectOptionsClick$1", f = "PreApprovalFormActor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201853q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201854r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectItem f201855s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f201856t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SelectItem selectItem, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f201855s = selectItem;
        this.f201856t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f201855s, this.f201856t, continuation);
        aVar.f201854r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PreApprovalFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201853q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201854r;
            SelectItem selectItem = this.f201855s;
            ArrayList arrayList = selectItem.f201822d;
            boolean z12 = arrayList.size() > 10;
            PreApprovalFormInternalAction.SelectOptionsClick selectOptionsClick = new PreApprovalFormInternalAction.SelectOptionsClick(new Arguments(false, selectItem.f201820b, null, arrayList, C42745f0.V(selectItem.f201823e), this.f201856t, null, z12, false, false, false, false, true, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, z12, false, 0, null, null, -7867, 247, null));
            this.f201853q = 1;
            if (interfaceC43172j.emit(selectOptionsClick, this) == coroutine_suspended) {
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
