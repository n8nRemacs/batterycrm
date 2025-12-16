package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import Y41.p;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.entity.IacProblemsBottomSheetInternalAction;
import eM.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacProblemsBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/mvi/entity/IacProblemsBottomSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.IacProblemsBottomSheetActor$onItemClicked$1", f = "IacProblemsBottomSheetActor.kt", i = {0, 1}, l = {49, 50, 51, 55, 56, 57, 58, 59, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super IacProblemsBottomSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f168904q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f168905r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c.b f168906s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f168907t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c.b bVar, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f168906s = bVar;
        this.f168907t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f168906s, this.f168907t, continuation);
        aVar.f168905r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacProblemsBottomSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
