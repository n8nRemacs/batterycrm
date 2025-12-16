package com.avito.android.publish.details.auto_description;

import Y41.p;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.blueprints.input.C28876a;
import com.avito.android.items.ItemWithState;
import com.avito.android.llm.ui.a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.V0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.auto_description.e.c;
import com.avito.android.remote.model.AIDescription;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36026p;
import com.avito.android.validation.n1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import l41.o;
import yc.C50213a;

/* compiled from: AutoDescriptionDelegate.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/auto_description/e;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/details/auto_description/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends M0 implements com.avito.android.publish.details.auto_description.a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final V0 f233502E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final S0 f233503J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f233504K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f233505L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f233506M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36026p f233507N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C50213a f233508O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public ItemDetailsView f233509P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f233510Q = new io.reactivex.rxjava3.disposables.i(0);

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C43238h f233511R;

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f233512l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a.C5343a f233513m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.C5343a c5343a, e eVar) {
            super(1);
            this.f233512l = eVar;
            this.f233513m = c5343a;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ItemDetailsView itemDetailsView = this.f233512l.f233509P;
            if (itemDetailsView != null) {
                itemDetailsView.k(this.f233513m.f181682a.getLoadingOverlay().getErrorTitle());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/validation/n1;", "results", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<List<? extends n1>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.C5343a f233514l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f233515m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a.C5343a c5343a, e eVar) {
            super(1);
            this.f233514l = c5343a;
            this.f233515m = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends n1> list) {
            a.C5343a c5343a;
            Object next;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c5343a = this.f233514l;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((n1) next).f319402a, c5343a.f181683b.getF212582h())) {
                    break;
                }
            }
            com.avito.conveyor_item.a aVar = c5343a.f181683b;
            if ((((n1) next) instanceof n1.c) && (aVar instanceof ItemWithState)) {
                ((ItemWithState) aVar).O0(new ItemWithState.State.Normal(null, 1, null));
            }
            this.f233515m.f233505L.B9(new PublishDetailsFlowTracker.FlowContext[0]);
            return G0.f406611a;
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.details.auto_description.AutoDescriptionViewModel$beautifyDescription$call$1$job$1", f = "AutoDescriptionDelegate.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f233516q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ K<String> f233518s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K<String> k12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f233518s = k12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new c(this.f233518s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            e eVar = e.this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f233516q;
            K<String> k12 = this.f233518s;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    V0 v02 = eVar.f233502E;
                    S0 s02 = eVar.f233503J;
                    long jIntValue = s02.U().getCategoryId() != null ? r2.intValue() : -1L;
                    CategoryParameters categoryParametersC0 = s02.C0();
                    this.f233516q = 1;
                    obj = v02.f(categoryParametersC0, jIntValue, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                TypedResult typedResult = (TypedResult) obj;
                if (typedResult instanceof TypedResult.Error) {
                    Throwable cause = ((TypedResult.Error) typedResult).getCause();
                    if (cause == null) {
                        cause = new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null);
                    }
                    k12.onError(cause);
                } else if (typedResult instanceof TypedResult.Success) {
                    k12.onSuccess(((TypedResult.Success) typedResult).getResult());
                }
            } catch (Exception e12) {
                if (!k12.i()) {
                    k12.onError(e12);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f233519b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.C5343a f233520c;

        public d(a.C5343a c5343a, e eVar) {
            this.f233519b = eVar;
            this.f233520c = c5343a;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e eVar = this.f233519b;
            ItemDetailsView itemDetailsView = eVar.f233509P;
            if (itemDetailsView != null) {
                a.C5343a c5343a = this.f233520c;
                itemDetailsView.c(new com.avito.android.publish.details.auto_description.f(eVar), c5343a.f181682a.getLoadingOverlay().getCancelButtonTitle(), c5343a.f181682a.getLoadingOverlay().getProcessTitle());
            }
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "", "Lcom/avito/android/validation/n1;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.auto_description.e$e, reason: collision with other inner class name */
    public static final class C7084e<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.C5343a f233522c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f233523d;

        public C7084e(a.C5343a c5343a, String str) {
            this.f233522c = c5343a;
            this.f233523d = str;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) obj;
            int length = str.length();
            a.C5343a c5343a = this.f233522c;
            e eVar = e.this;
            if (length == 0) {
                ItemDetailsView itemDetailsView = eVar.f233509P;
                if (itemDetailsView != null) {
                    itemDetailsView.k(c5343a.f181682a.getLoadingOverlay().getErrorTitle());
                }
                return I.q(C42784z0.f406748b);
            }
            InterfaceC33535v interfaceC33535v = eVar.f233504K;
            String str2 = this.f233523d;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC33535v.F(str2, str);
            c5343a.f181684c.invoke(str);
            ParametersTree parametersTreeWa = eVar.f233503J.wa();
            com.avito.conveyor_item.a aVar = c5343a.f181683b;
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(aVar.getF212582h()) : null;
            CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
            if (charParameter != null) {
                charParameter.setValue(str);
            }
            ItemDetailsView itemDetailsView2 = eVar.f233509P;
            if (itemDetailsView2 != null) {
                itemDetailsView2.q1();
            }
            return eVar.f233507N.h(aVar.getF212582h());
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f233524b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28876a f233525c;

        public f(C28876a c28876a, e eVar) {
            this.f233524b = eVar;
            this.f233525c = c28876a;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e eVar = this.f233524b;
            ItemDetailsView itemDetailsView = eVar.f233509P;
            if (itemDetailsView != null) {
                C28876a c28876a = this.f233525c;
                itemDetailsView.c(new com.avito.android.publish.details.auto_description.g(eVar), c28876a.f105931a.getCancelButtonTitle(), c28876a.f105931a.getLoadingTitle());
            }
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/AIDescription;", "it", "Lio/reactivex/rxjava3/core/O;", "", "Lcom/avito/android/validation/n1;", "apply", "(Lcom/avito/android/remote/model/AIDescription;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f233526b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28876a f233527c;

        public g(C28876a c28876a, e eVar) {
            this.f233526b = eVar;
            this.f233527c = c28876a;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // l41.o
        public final Object apply(Object obj) {
            AIDescription aIDescription = (AIDescription) obj;
            String description = aIDescription.getDescription();
            C28876a c28876a = this.f233527c;
            e eVar = this.f233526b;
            if (description == null || description.length() == 0) {
                String errorMessage = aIDescription.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "generated description is null or empty";
                }
                eVar.f233504K.d(errorMessage);
                ItemDetailsView itemDetailsView = eVar.f233509P;
                if (itemDetailsView != null) {
                    itemDetailsView.k(c28876a.f105931a.getErrorTitle());
                }
                return I.q(C42784z0.f406748b);
            }
            ?? r02 = c28876a.f105935e;
            String description2 = aIDescription.getDescription();
            if (description2 == null) {
                description2 = "";
            }
            r02.invoke(description2);
            eVar.f233504K.P(String.valueOf(aIDescription.getDescription()));
            ParametersTree parametersTreeWa = eVar.f233503J.wa();
            ItemWithState itemWithState = c28876a.f105934d;
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(itemWithState.getF212582h()) : null;
            CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
            if (charParameter != null) {
                charParameter.setValue(aIDescription.getDescription());
            }
            ItemDetailsView itemDetailsView2 = eVar.f233509P;
            if (itemDetailsView2 != null) {
                itemDetailsView2.q1();
            }
            return eVar.f233507N.h(itemWithState.getF212582h());
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/validation/n1;", "results", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C28876a f233528b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f233529c;

        public h(C28876a c28876a, e eVar) {
            this.f233528b = c28876a;
            this.f233529c = eVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28876a c28876a;
            T next;
            Iterator<T> it = ((List) obj).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c28876a = this.f233528b;
                if (!zHasNext) {
                    next = (T) null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((n1) next).f319402a, c28876a.f105934d.getF212582h())) {
                        break;
                    }
                }
            }
            if (next instanceof n1.c) {
                c28876a.f105934d.O0(new ItemWithState.State.Normal(null, 1, null));
            }
            this.f233529c.f233505L.B9(new PublishDetailsFlowTracker.FlowContext[0]);
        }
    }

    /* compiled from: AutoDescriptionDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f233530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28876a f233531c;

        public i(C28876a c28876a, e eVar) {
            this.f233530b = eVar;
            this.f233531c = c28876a;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e eVar = this.f233530b;
            eVar.f233504K.d(String.valueOf(((Throwable) obj).getMessage()));
            ItemDetailsView itemDetailsView = eVar.f233509P;
            if (itemDetailsView != null) {
                itemDetailsView.k(this.f233531c.f105931a.getErrorTitle());
            }
        }
    }

    @Inject
    public e(@Y61.k V0 v02, @Y61.k S0 s02, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36026p interfaceC36026p, @Y61.k C50213a c50213a, @Y61.k R0 r02) {
        this.f233502E = v02;
        this.f233503J = s02;
        this.f233504K = interfaceC33535v;
        this.f233505L = interfaceC33678b;
        this.f233506M = interfaceC35745a5;
        this.f233507N = interfaceC36026p;
        this.f233508O = c50213a;
        this.f233511R = U.a(r02.a());
    }

    @Override // com.avito.android.publish.details.auto_description.a
    public final void X7(@Y61.k a.C5343a c5343a) {
        CategoryParameters categoryParametersC0 = this.f233503J.C0();
        ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter(c5343a.f181683b.getF212582h()) : null;
        CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
        this.f233510Q.a(A1.e(new C42006d(new M() { // from class: com.avito.android.publish.details.auto_description.c
            @Override // io.reactivex.rxjava3.core.M
            public final void j(K k12) {
                e eVar = this.f233500b;
                final N0 n0D = C43259k.d(eVar.f233511R, null, null, eVar.new c(k12, null), 3);
                k12.f(new l41.f() { // from class: com.avito.android.publish.details.auto_description.d
                    @Override // l41.f
                    public final void cancel() {
                        ((kotlinx.coroutines.V0) n0D).c(null);
                    }
                });
            }
        }).s(this.f233506M.e()).j(new d(c5343a, this)).n(new C7084e(c5343a, charParameter != null ? charParameter.getValue() : null)), new a(c5343a, this), new b(c5343a, this)));
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        ItemDetailsView itemDetailsView = this.f233509P;
        if (itemDetailsView != null) {
            itemDetailsView.q1();
        }
        this.f233509P = null;
        this.f233510Q.a(null);
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
        this.f233509P = itemDetailsView;
        itemDetailsView.q1();
    }

    @Override // com.avito.android.publish.details.auto_description.a
    public final void w3(@Y61.k C28876a c28876a) {
        S0 s02 = this.f233503J;
        I<AIDescription> i12 = this.f233502E.i(s02.C0(), this.f233508O.b(), String.valueOf(s02.U().getCategoryId()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f233506M;
        this.f233510Q.a(i12.g(c28876a.f105933c, timeUnit, interfaceC35745a5.c()).s(interfaceC35745a5.e()).j(new f(c28876a, this)).n(new g(c28876a, this)).x(new h(c28876a, this), new i(c28876a, this)));
    }
}
