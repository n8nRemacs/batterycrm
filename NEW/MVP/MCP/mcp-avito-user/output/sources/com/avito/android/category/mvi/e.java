package com.avito.android.category.mvi;

import Pn.InterfaceC14813a;
import com.avito.android.category.mvi.entity.CategoryInternalAction;
import com.avito.android.category.mvi.entity.CategoryState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.category.mvi.CategoryActor$processClick$1", f = "CategoryActor.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CategoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116663q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116664r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CategoryState f116665s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14813a.C0862a f116666t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CategoryState categoryState, InterfaceC14813a.C0862a c0862a, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f116665s = categoryState;
        this.f116666t = c0862a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f116665s, this.f116666t, continuation);
        eVar.f116664r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CategoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f116663q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f116664r;
            CategoryInternalAction.LoadingLinkStarted loadingLinkStarted = new CategoryInternalAction.LoadingLinkStarted(this.f116665s.f116679d, this.f116666t.f13274a.getF116487b());
            this.f116663q = 1;
            if (interfaceC43172j.emit(loadingLinkStarted, this) == coroutine_suspended) {
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
