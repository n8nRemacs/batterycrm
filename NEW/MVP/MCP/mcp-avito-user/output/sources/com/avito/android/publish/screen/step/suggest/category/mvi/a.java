package com.avito.android.publish.screen.step.suggest.category.mvi;

import Oe0.InterfaceC14679b;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestCategoryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LOe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.suggest.category.mvi.SuggestCategoryActor$onCategoryListItemClick$1", f = "SuggestCategoryActor.kt", i = {}, l = {69, 83, 85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14679b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242341q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242342r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Navigation f242343s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f242344t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Navigation navigation2, f fVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f242343s = navigation2;
        this.f242344t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f242343s, this.f242344t, continuation);
        aVar.f242342r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14679b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f242341q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f242342r;
            Navigation navigation2 = com.avito.android.publish.screen.step.suggest.category.data.d.f242282a;
            Navigation navigation3 = this.f242343s;
            boolean zF2 = L.f(navigation3, navigation2);
            f fVar = this.f242344t;
            if (zF2) {
                fVar.f242370c.M();
                Navigation previousNavigation = fVar.f242371d.getPreviousNavigation();
                if (previousNavigation == null) {
                    previousNavigation = fVar.f242368a.f231861Y.getNavigation();
                }
                InterfaceC14679b.d dVar = new InterfaceC14679b.d(previousNavigation);
                this.f242341q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                WizardParameter wizardParameter = (WizardParameter) C43033p.n(C43033p.y(new C42770s0(fVar.f242371d.g()), new g(navigation3)));
                if (wizardParameter == null) {
                    C0.Ge(fVar.f242368a, "clicked wizardParameter was not found in suggests list in " + interfaceC43172j, null, 6);
                    return G0.f406611a;
                }
                fVar.f242370c.i(1, wizardParameter.getTitle(), wizardParameter.getNavigation().getMicroCategoryId(), "suggest");
                if (wizardParameter.getHasChildren()) {
                    InterfaceC14679b.d dVar2 = new InterfaceC14679b.d(wizardParameter.getNavigation());
                    this.f242341q = 2;
                    if (interfaceC43172j.emit(dVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f242341q = 3;
                    if (f.c(fVar, wizardParameter, true, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
