package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14777a;
import Pe0.InterfaceC14778b;
import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.screen.step.wizard.mvi.entity.WizardState;
import com.avito.android.remote.model.WizardParameter;
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
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WizardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LPe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.wizard.mvi.WizardActor$processItemClick$1", f = "WizardActor.kt", i = {}, l = {51, 55}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14778b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242520q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242521r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WizardState f242522s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f242523t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14777a.d f242524u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WizardState wizardState, d dVar, InterfaceC14777a.d dVar2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f242522s = wizardState;
        this.f242523t = dVar;
        this.f242524u = dVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f242522s, this.f242523t, this.f242524u, continuation);
        cVar.f242521r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14778b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<WizardParameter> children;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f242520q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return G0.f406611a;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f242521r;
        WizardState wizardState = this.f242522s;
        WizardParameter wizardParameter = wizardState.f242533d;
        if (wizardParameter != null && (children = wizardParameter.getChildren()) != null) {
            Iterator<T> it = children.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((WizardParameter) next).getNavigation().toString(), this.f242524u.f13193a)) {
                    break;
                }
            }
            WizardParameter wizardParameter2 = (WizardParameter) next;
            if (wizardParameter2 != null) {
                d dVar = this.f242523t;
                InterfaceC33535v interfaceC33535v = dVar.f242526b;
                String title = wizardParameter2.getTitle();
                String microCategoryId = wizardParameter2.getNavigation().getMicroCategoryId();
                int i13 = 1;
                for (WizardParameter parent = wizardParameter2.getParent(); parent != null; parent = parent.getParent()) {
                    i13++;
                }
                interfaceC33535v.i(i13, title, microCategoryId, "rubricator");
                DeepLink deeplink = wizardParameter2.getDeeplink();
                if (deeplink == null) {
                    this.f242520q = 2;
                    if (dVar.f242525a.a(wizardParameter2, wizardState.f242533d, false, interfaceC43172j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return G0.f406611a;
                }
                InterfaceC14778b.e eVar = new InterfaceC14778b.e(deeplink);
                this.f242520q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }
        return G0.f406611a;
    }
}
