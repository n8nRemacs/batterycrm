package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view;

import Y41.p;
import Y61.k;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacProblemsBottomSheetScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.IacProblemsBottomSheetScreenKt$IacProblemsBottomSheetScreen$1$2", f = "IacProblemsBottomSheetScreen.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f168950q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f168951r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<eM.b> f168952s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l lVar, InterfaceC43172j<? super eM.b> interfaceC43172j, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f168951r = lVar;
        this.f168952s = interfaceC43172j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new g(this.f168951r, this.f168952s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f168950q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<eM.b> events = this.f168951r.getEvents();
            this.f168950q = 1;
            if (events.collect(this.f168952s, this) == coroutine_suspended) {
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
