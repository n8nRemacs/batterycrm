package com.avito.android.category_with_params.mvi;

import Y41.p;
import com.avito.android.category_with_params.entity.ListItem;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsInternalAction;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsState;
import com.huawei.hms.adapter.internal.AvailableCode;
import fo.InterfaceC40453a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoryWithParamsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.category_with_params.mvi.CategoryWithParamsActor$process$1", f = "CategoryWithParamsActor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super CategoryWithParamsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f117682q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f117683r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CategoryWithParamsState f117684s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40453a f117685t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CategoryWithParamsState categoryWithParamsState, InterfaceC40453a interfaceC40453a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f117684s = categoryWithParamsState;
        this.f117685t = interfaceC40453a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f117684s, this.f117685t, continuation);
        aVar.f117683r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CategoryWithParamsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f117682q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f117683r;
            List<ListItem> list = this.f117684s.f117696c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ListItem.Option) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((ListItem.Option) next).f117678d) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((ListItem.Option) it2.next()).f117676b);
            }
            CategoryWithParamsInternalAction.FinishScreenWithResult finishScreenWithResult = new CategoryWithParamsInternalAction.FinishScreenWithResult(arrayList3, ((InterfaceC40453a.InterfaceC11170a) this.f117685t).getF396076a());
            this.f117682q = 1;
            if (interfaceC43172j.emit(finishScreenWithResult, this) == coroutine_suspended) {
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
