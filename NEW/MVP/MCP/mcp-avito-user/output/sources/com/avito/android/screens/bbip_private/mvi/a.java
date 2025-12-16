package com.avito.android.screens.bbip_private.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.screens.bbip_private.mvi.entity.BbipPrivateInternalAction;
import hh.InterfaceC40933a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rp0.C47707c;
import rp0.InterfaceC47705a;

/* compiled from: BbipPrivateActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_private/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lrp0/a;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lrp0/c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC47705a, BbipPrivateInternalAction, C47707c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f260560a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private.domain.a f260561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final qp0.c f260562c;

    /* compiled from: BbipPrivateActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.mvi.BbipPrivateActor$process$1", f = "BbipPrivateActor.kt", i = {0}, l = {91, 94}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.screens.bbip_private.mvi.a$a, reason: collision with other inner class name */
    public static final class C7811a extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260563q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260564r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47705a f260565s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7811a(InterfaceC47705a interfaceC47705a, Continuation<? super C7811a> continuation) {
            super(2, continuation);
            this.f260565s = interfaceC47705a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7811a c7811a = new C7811a(this.f260565s, continuation);
            c7811a.f260564r = obj;
            return c7811a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7811a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260563q;
            InterfaceC47705a interfaceC47705a = this.f260565s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f260564r;
                BbipPrivateInternalAction.BudgetClicked budgetClicked = new BbipPrivateInternalAction.BudgetClicked(((InterfaceC47705a.b) interfaceC47705a).f430229a);
                this.f260564r = interfaceC43172j;
                this.f260563q = 1;
                if (interfaceC43172j.emit(budgetClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f260564r;
                C42729a0.b(obj);
            }
            if (((InterfaceC47705a.b) interfaceC47705a).f430229a.f260649o) {
                BbipPrivateInternalAction.ScrollToScreenTop scrollToScreenTop = BbipPrivateInternalAction.ScrollToScreenTop.f260606b;
                this.f260564r = null;
                this.f260563q = 2;
                if (interfaceC43172j.emit(scrollToScreenTop, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private/mvi/entity/BbipPrivateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private.mvi.BbipPrivateActor$process$2", f = "BbipPrivateActor.kt", i = {0}, l = {99, 102}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260566q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260567r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47705a f260568s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC47705a interfaceC47705a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f260568s = interfaceC47705a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f260568s, continuation);
            bVar.f260567r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260566q;
            InterfaceC47705a interfaceC47705a = this.f260568s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f260567r;
                BbipPrivateInternalAction.BudgetWidgetClicked budgetWidgetClicked = new BbipPrivateInternalAction.BudgetWidgetClicked(((InterfaceC47705a.c) interfaceC47705a).f430230a);
                this.f260567r = interfaceC43172j;
                this.f260566q = 1;
                if (interfaceC43172j.emit(budgetWidgetClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f260567r;
                C42729a0.b(obj);
            }
            if (((InterfaceC47705a.c) interfaceC47705a).f430230a.f260753p) {
                BbipPrivateInternalAction.ScrollToScreenTop scrollToScreenTop = BbipPrivateInternalAction.ScrollToScreenTop.f260606b;
                this.f260567r = null;
                this.f260566q = 2;
                if (interfaceC43172j.emit(scrollToScreenTop, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@InterfaceC40933a @Y61.k String str, @Y61.k com.avito.android.screens.bbip_private.domain.a aVar, @Y61.k qp0.c cVar) {
        this.f260560a = str;
        this.f260561b = aVar;
        this.f260562c = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new c(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.screens.bbip_private.mvi.b.f260569l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BbipPrivateInternalAction> b(@Y61.k InterfaceC47705a interfaceC47705a, @Y61.k C47707c c47707c) {
        String str;
        ButtonAction button;
        if (interfaceC47705a instanceof InterfaceC47705a.C12395a) {
            return new C43210w(BbipPrivateInternalAction.CloseScreen.f260588b);
        }
        boolean z12 = interfaceC47705a instanceof InterfaceC47705a.h;
        String str2 = c47707c.f430251f;
        com.avito.android.screens.bbip_private.domain.a aVar = this.f260561b;
        if (z12) {
            if (c47707c.f430254i) {
                return C43175k.w();
            }
            if (str2 == null) {
                str2 = this.f260560a;
            }
            return aVar.a(str2);
        }
        boolean z13 = interfaceC47705a instanceof InterfaceC47705a.i;
        qp0.c cVar = this.f260562c;
        List<com.avito.conveyor_item.a> list = c47707c.f430248c;
        if (z13) {
            return aVar.c(cVar.b(str2, list));
        }
        if (interfaceC47705a instanceof InterfaceC47705a.f) {
            uZ.e eVar = c47707c.f430247b;
            if (eVar != null && (button = eVar.getButton()) != null) {
                deeplink = button.getDeeplink();
            }
            return new C43210w(new BbipPrivateInternalAction.HandleDeeplink(deeplink));
        }
        if (interfaceC47705a instanceof InterfaceC47705a.j) {
            ButtonAction buttonAction = c47707c.f430249d;
            return new C43210w(new BbipPrivateInternalAction.HandleDeeplink(buttonAction != null ? buttonAction.getDeeplink() : null));
        }
        if (interfaceC47705a instanceof InterfaceC47705a.g) {
            return c47707c.f430255j ? C43175k.w() : aVar.b(cVar.c(str2, list), ((InterfaceC47705a.g) interfaceC47705a).f430235a, c47707c.f430258m);
        }
        if (interfaceC47705a instanceof InterfaceC47705a.d) {
            InterfaceC47705a.d dVar = (InterfaceC47705a.d) interfaceC47705a;
            DeepLink deepLink = dVar.f430231a;
            return (!dVar.f430232b || (str = c47707c.f430259n) == null) ? new C43210w(new BbipPrivateInternalAction.HandleDeeplink(deepLink)) : new C43207v(new BbipPrivateInternalAction[]{new BbipPrivateInternalAction.ShowMnzUxFeedback(str), new BbipPrivateInternalAction.HandleDeeplink(deepLink)});
        }
        if (interfaceC47705a instanceof InterfaceC47705a.e) {
            return new C43210w(new BbipPrivateInternalAction.DurationClicked(((InterfaceC47705a.e) interfaceC47705a).f430233a));
        }
        if (interfaceC47705a instanceof InterfaceC47705a.b) {
            return C43175k.G(new C7811a(interfaceC47705a, null));
        }
        if (interfaceC47705a instanceof InterfaceC47705a.c) {
            return C43175k.G(new b(interfaceC47705a, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
