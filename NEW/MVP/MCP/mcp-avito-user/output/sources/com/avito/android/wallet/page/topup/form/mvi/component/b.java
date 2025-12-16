package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.C25543d;
import bP0.InterfaceC25540a;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36020m;
import com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TopUpFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/b;", "Lcom/avito/android/arch/mvi/a;", "LbP0/a;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "LbP0/d;", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC25540a, TopUpFormInternalAction, C25543d> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f328360d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36020m f328361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f328362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f328363c;

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/b$a;", "", "<init>", "()V", "", "CLICKS_THROTTLE_MS", "J", "INPUT_REBINDING_DELAY_MS", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$3", f = "TopUpFormActor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.wallet.page.topup.form.mvi.component.b$b, reason: collision with other inner class name */
    public static final class C10185b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TopUpFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328364q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328365r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C25543d f328367t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10185b(C25543d c25543d, Continuation<? super C10185b> continuation) {
            super(2, continuation);
            this.f328367t = c25543d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C10185b c10185b = b.this.new C10185b(this.f328367t, continuation);
            c10185b.f328365r = obj;
            return c10185b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TopUpFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C10185b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328364q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f328365r;
                b bVar = b.this;
                InterfaceC36020m interfaceC36020m = bVar.f328361a;
                C25543d c25543d = this.f328367t;
                if (interfaceC36020m.a(c25543d.f57064c).getSuccess()) {
                    TopUpFormInternalAction.SubmitTopUp submitTopUp = new TopUpFormInternalAction.SubmitTopUp(bVar.f328362b.i(c25543d.f57064c));
                    this.f328364q = 1;
                    if (interfaceC43172j.emit(submitTopUp, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$4", f = "TopUpFormActor.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TopUpFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328368q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328369r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25540a f328371t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C25543d f328372u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC25540a interfaceC25540a, C25543d c25543d, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f328371t = interfaceC25540a;
            this.f328372u = c25543d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f328371t, this.f328372u, continuation);
            cVar.f328369r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TopUpFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328368q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f328369r;
                InterfaceC25540a.C1999a c1999a = (InterfaceC25540a.C1999a) this.f328371t;
                int i13 = b.f328360d;
                b.this.getClass();
                ParameterSlot parameterSlotFindParameter = this.f328372u.f57064c.findParameter(c1999a.f57051a.f328302b);
                if (parameterSlotFindParameter instanceof IntParameter) {
                    EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
                    Long lValueOf = Long.valueOf(Long.parseLong(c1999a.f57051a.f328303c));
                    if (!L.f(editableParameter.getValue(), lValueOf)) {
                        editableParameter.setValue(lValueOf);
                        editableParameter.setError(null);
                    }
                }
                TopUpFormInternalAction.RebindContent rebindContent = new TopUpFormInternalAction.RebindContent(true);
                this.f328368q = 1;
                if (interfaceC43172j.emit(rebindContent, this) == coroutine_suspended) {
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

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$5", f = "TopUpFormActor.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TopUpFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328373q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328374r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25540a f328376t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C25543d f328377u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC25540a interfaceC25540a, C25543d c25543d, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f328376t = interfaceC25540a;
            this.f328377u = c25543d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = b.this.new d(this.f328376t, this.f328377u, continuation);
            dVar.f328374r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TopUpFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328373q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f328374r;
                InterfaceC25540a.b bVar = (InterfaceC25540a.b) this.f328376t;
                int i13 = b.f328360d;
                b bVar2 = b.this;
                bVar2.getClass();
                String str = bVar.f57052a.f328315b;
                ParametersTree parametersTree = this.f328377u.f57064c;
                ParameterSlot parameterSlotFindParameter = parametersTree.findParameter(str);
                if (parameterSlotFindParameter instanceof IntParameter) {
                    EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
                    Long lValueOf = Long.valueOf(Long.parseLong(bVar.f57053b));
                    if (!L.f(editableParameter.getValue(), lValueOf)) {
                        editableParameter.setValue(lValueOf);
                        editableParameter.setError(null);
                    }
                }
                parametersTree.applyPretendResult(bVar2.f328361a.a(parametersTree).getErrors());
                TopUpFormInternalAction.RebindContent rebindContent = new TopUpFormInternalAction.RebindContent(false, 1, null);
                this.f328373q = 1;
                if (interfaceC43172j.emit(rebindContent, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k InterfaceC36020m interfaceC36020m, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k R0 r02) {
        this.f328361a = interfaceC36020m;
        this.f328362b = interfaceC36134w1;
        this.f328363c = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.wallet.page.topup.form.mvi.component.d(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.wallet.page.topup.form.mvi.component.c.f328378l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TopUpFormInternalAction> b(@Y61.k InterfaceC25540a interfaceC25540a, @Y61.k C25543d c25543d) {
        if (interfaceC25540a instanceof InterfaceC25540a.c) {
            return C43175k.G(new C10185b(c25543d, null));
        }
        if (interfaceC25540a instanceof InterfaceC25540a.C1999a) {
            return C43175k.G(new c(interfaceC25540a, c25543d, null));
        }
        if (interfaceC25540a instanceof InterfaceC25540a.b) {
            return C43175k.G(new d(interfaceC25540a, c25543d, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
