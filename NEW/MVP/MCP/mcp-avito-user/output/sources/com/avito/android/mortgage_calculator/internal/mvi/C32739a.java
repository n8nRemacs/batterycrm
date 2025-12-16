package com.avito.android.mortgage_calculator.internal.mvi;

import D10.a;
import F10.a;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.deeplink.MortgageLandingLink;
import com.avito.android.mortgage.deeplink.PreApprovalFormLink;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.CalculatorField;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import y10.C50036a;
import y10.C50037b;

/* compiled from: CalculatorActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "LE10/c;", "a", "b", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32739a implements com.avito.android.arch.mvi.a<com.avito.android.mortgage_calculator.internal.mvi.entity.b, CalculatorInternalAction, E10.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.internal.mvi.builder.d f204468a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.internal.mvi.entity.d f204469b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.internal.analytics.a f204470c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f204471d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.internal.mvi.domain.b f204472e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.internal.mvi.domain.e f204473f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.data.a f204474g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_calculator.data.g f204475h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f204476i;

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a$a;", "", "a", "b", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$a$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$a$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC6093a {

        /* compiled from: CalculatorActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a$a$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6094a implements InterfaceC6093a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6094a f204477a = new C6094a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6094a);
            }

            public final int hashCode() {
                return -1780954839;
            }

            @Y61.k
            public final String toString() {
                return "PassThrough";
            }
        }

        /* compiled from: CalculatorActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a$a$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC6093a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f204478a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2019479716;
            }

            @Y61.k
            public final String toString() {
                return "Process";
            }
        }
    }

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a$b;", "", "a", "b", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$b$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$b$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$b */
    public interface b {

        /* compiled from: CalculatorActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a$b$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C6095a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6095a f204479a = new C6095a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6095a);
            }

            public final int hashCode() {
                return -544727784;
            }

            @Y61.k
            public final String toString() {
                return "PathThrough";
            }
        }

        /* compiled from: CalculatorActor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/a$b$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6096b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6096b f204480a = new C6096b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6096b);
            }

            public final int hashCode() {
                return 975929102;
            }

            @Y61.k
            public final String toString() {
                return "ProcessLatest";
            }
        }
    }

    /* compiled from: CalculatorActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$c */
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[CalculatorField.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalculatorField calculatorField = CalculatorField.f204610b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CalculatorField calculatorField2 = CalculatorField.f204610b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CalculatorField calculatorField3 = CalculatorField.f204610b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CalculatorField calculatorField4 = CalculatorField.f204610b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CalculatorField calculatorField5 = CalculatorField.f204610b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$flowWithMutablePrivateStateAndDeeplinkRebuild$1", f = "CalculatorActor.kt", i = {0}, l = {709}, m = "invokeSuspend", n = {"previousState"}, s = {"L$0"})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$d */
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f204481q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f204482r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.utils.n<D10.a, ?, D10.c> f204483s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ D10.c f204484t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f204485u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C32739a f204486v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.avito.android.arch.mvi.utils.n<D10.a, ?, D10.c> nVar, D10.c cVar, Y41.q<? super InterfaceC43172j<? super CalculatorInternalAction>, ? super com.avito.android.arch.mvi.utils.l<D10.a>, ? super Continuation<? super G0>, ? extends Object> qVar, C32739a c32739a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f204483s = nVar;
            this.f204484t = cVar;
            this.f204485u = (SuspendLambda) qVar;
            this.f204486v = c32739a;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f204483s, this.f204484t, this.f204485u, this.f204486v, continuation);
            dVar.f204482r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            D10.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f204481q;
            D10.c cVar = this.f204484t;
            com.avito.android.arch.mvi.utils.n<D10.a, ?, D10.c> nVar = this.f204483s;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204482r;
                D10.a aVar2 = (D10.a) nVar.a(cVar).getValue();
                o.a aVarA = nVar.a(cVar);
                this.f204482r = aVar2;
                this.f204481q = 1;
                if (this.f204485u.invoke(interfaceC43172j, aVarA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (D10.a) this.f204482r;
                C42729a0.b(obj);
            }
            D10.a aVarG = (D10.a) nVar.a(cVar).getValue();
            boolean z12 = (kotlin.jvm.internal.L.f(aVarG.b(), aVar.b()) && kotlin.jvm.internal.L.f(aVarG.f2846c, aVar.f2846c)) ? false : true;
            DeepLink deepLink = aVar.f2849f;
            DeepLink deepLink2 = aVarG.f2849f;
            boolean zF2 = kotlin.jvm.internal.L.f(deepLink2, deepLink);
            DeepLink deepLink3 = aVar.f2850g;
            DeepLink deepLink4 = aVarG.f2850g;
            boolean z13 = zF2 && kotlin.jvm.internal.L.f(deepLink4, deepLink3);
            C32739a c32739a = this.f204486v;
            if (z12 && z13) {
                c32739a.getClass();
                aVarG = C32739a.g(D10.a.a(aVarG, null, null, null, null, 0L, C32739a.f(deepLink2, aVarG), deepLink4 != null ? C32739a.f(deepLink4, aVarG) : null, null, null, null, null, null, null, null, 16287));
                nVar.a(cVar).setValue(aVarG);
            }
            com.avito.android.mortgage_calculator.data.a aVar3 = c32739a.f204474g;
            DeepLink deepLink5 = aVarG.f2849f;
            String str = aVarG.f2853j;
            aVar3.b(deepLink5, str);
            c32739a.f204474g.a(aVarG.f2850g, str);
            c32739a.f204475h.b(aVarG.f2851h, str);
            return G0.f406611a;
        }
    }

    /* compiled from: CalculatorActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$7", f = "CalculatorActor.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f204487q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f204488r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E10.c f204489s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(E10.c cVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f204489s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f204489s, continuation);
            eVar.f204488r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f204487q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204488r;
                x10.b bVar = this.f204489s.f3692q;
                if (bVar != null) {
                    CalculatorInternalAction.OpenDisclaimer openDisclaimer = new CalculatorInternalAction.OpenDisclaimer(bVar.f442086b);
                    this.f204487q = 1;
                    if (interfaceC43172j.emit(openDisclaimer, this) == coroutine_suspended) {
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

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$8", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$f */
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C32739a f204490q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ E10.c f204491r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(E10.c cVar, C32739a c32739a, Continuation continuation) {
            super(2, continuation);
            this.f204490q = c32739a;
            this.f204491r = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f204491r, this.f204490q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f204490q.f204470c.c(this.f204491r);
            return G0.f406611a;
        }
    }

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$9", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.a$g */
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C32739a f204492q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ E10.c f204493r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(E10.c cVar, C32739a c32739a, Continuation continuation) {
            super(2, continuation);
            this.f204492q = c32739a;
            this.f204493r = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new g(this.f204493r, this.f204492q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f204492q.f204470c.l(this.f204493r);
            return G0.f406611a;
        }
    }

    @Inject
    public C32739a(@Y61.k com.avito.android.mortgage_calculator.internal.mvi.builder.d dVar, @Y61.k com.avito.android.mortgage_calculator.internal.mvi.entity.d dVar2, @Y61.k com.avito.android.mortgage_calculator.internal.analytics.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.mortgage_calculator.internal.mvi.domain.b bVar, @Y61.k com.avito.android.mortgage_calculator.internal.mvi.domain.e eVar, @Y61.k com.avito.android.mortgage_calculator.data.a aVar2, @Y61.k com.avito.android.mortgage_calculator.data.g gVar) {
        this.f204468a = dVar;
        this.f204469b = dVar2;
        this.f204470c = aVar;
        this.f204471d = r02;
        this.f204472e = bVar;
        this.f204473f = eVar;
        this.f204474g = aVar2;
        this.f204475h = gVar;
        a.C0143a c0143a = D10.a.f2843o;
        E10.c cVarA = dVar.a();
        c0143a.getClass();
        D10.a aVarA = a.C0143a.a(cVarA);
        DeepLink deepLink = aVarA.f2849f;
        String str = aVarA.f2853j;
        aVar2.b(deepLink, str);
        aVar2.a(aVarA.f2850g, str);
        gVar.b(null, str);
        com.avito.android.arch.mvi.utils.n.f92111a.getClass();
        this.f204476i = new com.avito.android.arch.mvi.utils.o(aVarA);
    }

    public static final D10.a c(C32739a c32739a, D10.a aVar, CalculatorField calculatorField, long j12) {
        c32739a.getClass();
        int iOrdinal = calculatorField.ordinal();
        if (iOrdinal == 0) {
            a.b bVar = aVar.f2844a;
            return D10.a.a(aVar, a.b.c(bVar, bVar.f4480b.d(j12), null, null, false, 29), null, null, null, 0L, null, null, null, null, null, null, null, null, null, 16382);
        }
        if (iOrdinal == 1) {
            a.b bVar2 = aVar.f2844a;
            C50037b c50037b = bVar2.f4481c;
            return D10.a.a(aVar, a.b.c(bVar2, null, c50037b != null ? c50037b.d(j12) : null, null, false, 27), null, null, null, 0L, null, null, null, null, null, null, null, null, null, 16382);
        }
        if (iOrdinal == 2) {
            a.C0271a c0271a = aVar.f2845b;
            return D10.a.a(aVar, null, a.C0271a.c(c0271a, c0271a.f4475b.d(j12), null, false, 13), null, null, 0L, null, null, null, null, null, null, null, null, null, 16381);
        }
        if (iOrdinal == 3) {
            a.C0271a c0271a2 = aVar.f2845b;
            if (c0271a2.f4477d) {
                return D10.a.a(aVar, null, a.C0271a.c(aVar.f2845b, null, c0271a2.f4476c.d(j12), false, 11), null, null, 0L, null, null, null, null, null, null, null, null, null, 16381);
            }
            a.b bVar3 = aVar.f2844a;
            if (bVar3.f4483e) {
                return D10.a.a(aVar, a.b.c(aVar.f2844a, null, null, bVar3.f4482d.d(j12), false, 23), null, null, null, 0L, null, null, null, null, null, null, null, null, null, 16382);
            }
            return aVar;
        }
        if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        C50036a c50036a = aVar.f2846c;
        List<C50036a.C12884a> list = c50036a.f442837b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C50036a.C12884a c12884a : list) {
            arrayList.add(c12884a.f442839c == j12 ? C50036a.C12884a.a(c12884a, true) : C50036a.C12884a.a(c12884a, false));
        }
        return D10.a.a(aVar, null, null, new C50036a(c50036a.f442836a, arrayList), null, 0L, null, null, null, null, null, null, null, null, null, 16379);
    }

    public static DeepLink f(DeepLink deepLink, D10.a aVar) {
        C50037b c50037b;
        y10.e eVar;
        C50037b c50037b2;
        y10.e eVar2;
        C50037b c50037b3;
        y10.e eVar3;
        C50037b c50037b4;
        y10.e eVar4;
        boolean z12 = deepLink instanceof MortgageLandingLink;
        long j12 = aVar.f2848e;
        C50036a c50036a = aVar.f2846c;
        Integer numValueOf = null;
        if (z12) {
            MortgageLandingLink mortgageLandingLink = (MortgageLandingLink) deepLink;
            a.b bVarA = F10.b.a(aVar.b());
            Integer numValueOf2 = (bVarA == null || (c50037b4 = bVarA.f4480b) == null || (eVar4 = c50037b4.f442846e) == null) ? null : Integer.valueOf((int) eVar4.f442853b);
            a.b bVarA2 = F10.b.a(aVar.b());
            if (bVarA2 != null && (c50037b3 = bVarA2.f4480b) != null && (eVar3 = c50037b3.f442846e) != null) {
                numValueOf = Integer.valueOf((int) eVar3.f442853b);
            }
            return MortgageLandingLink.a(mortgageLandingLink, numValueOf2, numValueOf, Integer.valueOf((int) aVar.b().getF4482d().f442846e.f442853b), String.valueOf(j12), aVar.f2847d, Integer.valueOf((int) c50036a.a()), null, null, null, null, null, 16777089);
        }
        if (!(deepLink instanceof PreApprovalFormLink)) {
            return deepLink;
        }
        PreApprovalFormLink preApprovalFormLink = (PreApprovalFormLink) deepLink;
        a.b bVarA3 = F10.b.a(aVar.b());
        Integer numValueOf3 = (bVarA3 == null || (c50037b2 = bVarA3.f4480b) == null || (eVar2 = c50037b2.f442846e) == null) ? null : Integer.valueOf((int) eVar2.f442853b);
        a.b bVarA4 = F10.b.a(aVar.b());
        if (bVarA4 != null && (c50037b = bVarA4.f4480b) != null && (eVar = c50037b.f442846e) != null) {
            numValueOf = Integer.valueOf((int) eVar.f442853b);
        }
        Integer num = numValueOf;
        int i12 = (int) aVar.b().getF4482d().f442846e.f442853b;
        int iA2 = (int) c50036a.a();
        return new PreApprovalFormLink(numValueOf3, num, Integer.valueOf(i12), Integer.valueOf(iA2), preApprovalFormLink.f198768k, aVar.f2847d, String.valueOf(j12), preApprovalFormLink.f198765h, preApprovalFormLink.f198766i, preApprovalFormLink.f198767j, preApprovalFormLink.f198769l, preApprovalFormLink.f198770m);
    }

    public static D10.a g(D10.a aVar) {
        DeepLink deepLinkA = aVar.f2849f;
        if (deepLinkA instanceof MortgageLandingLink) {
            deepLinkA = MortgageLandingLink.a((MortgageLandingLink) deepLinkA, null, null, null, null, null, null, null, aVar.f2854k, aVar.f2856m, aVar.f2855l, aVar.f2847d + '_' + aVar.b().getF4484f().f204624b, 15892479);
        }
        return D10.a.a(aVar, null, null, null, null, 0L, deepLinkA, null, null, null, null, null, null, null, null, 16351);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        this.f204469b.getClass();
        return C43175k.I(this.f204471d.c(), C43175k.C(new w(this, null), C43175k.C(new C32760v(this, null), com.avito.android.arch.mvi.utils.h.a(C43175k.C(new C32758t(this, null), C43175k.C(new C32757s(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(C43175k.N(c43197r1, C43175k.N(new com.avito.android.mortgage_calculator.internal.mvi.entity.c(this.f204476i.f92113b))), r.f204699l))), C32759u.f204709l))));
    }

    public final InterfaceC43160i<CalculatorInternalAction> d(com.avito.android.arch.mvi.utils.n<D10.a, ?, D10.c> nVar, D10.c cVar, Y41.q<? super InterfaceC43172j<? super CalculatorInternalAction>, ? super com.avito.android.arch.mvi.utils.l<D10.a>, ? super Continuation<? super G0>, ? extends Object> qVar) {
        return C43175k.G(new d(nVar, cVar, qVar, this, null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CalculatorInternalAction> b(@Y61.k com.avito.android.mortgage_calculator.internal.mvi.entity.b bVar, @Y61.k E10.c cVar) {
        boolean z12 = bVar instanceof b.C32744a;
        com.avito.android.arch.mvi.utils.n<D10.a, ?, D10.c> nVar = this.f204476i;
        if (z12) {
            b.C32744a c32744a = (b.C32744a) bVar;
            return d(nVar, c32744a, new C32742d(c32744a, this, null));
        }
        if (bVar instanceof b.t) {
            b.t tVar = (b.t) bVar;
            return d(nVar, tVar, new F(tVar, null));
        }
        if (bVar instanceof b.q) {
            b.q qVar = (b.q) bVar;
            return d(nVar, qVar, new D(qVar, this, null));
        }
        if (bVar instanceof b.C6098b) {
            return C43175k.G(new C32747h(new C32743e(this, null), nVar, (b.C6098b) bVar, null));
        }
        if (bVar instanceof b.A) {
            b.A a12 = (b.A) bVar;
            return d(nVar, a12, new M(a12, null));
        }
        if (bVar instanceof b.x) {
            b.x xVar = (b.x) bVar;
            return d(nVar, xVar, new J(xVar, null));
        }
        if (bVar instanceof b.y) {
            b.y yVar = (b.y) bVar;
            return d(nVar, yVar, new K(yVar, null));
        }
        if (bVar instanceof b.z) {
            b.z zVar = (b.z) bVar;
            return d(nVar, zVar, new L(zVar, null));
        }
        if (bVar instanceof b.v) {
            b.v vVar = (b.v) bVar;
            return d(nVar, vVar, new H(vVar, null));
        }
        if (bVar instanceof b.w) {
            b.w wVar = (b.w) bVar;
            return d(nVar, wVar, new I(this, wVar, null));
        }
        if (bVar instanceof b.u) {
            b.u uVar = (b.u) bVar;
            return d(nVar, uVar, new G(uVar, this, null));
        }
        if (bVar instanceof b.r) {
            b.r rVar = (b.r) bVar;
            return C43175k.G(new C32747h(new E(this, rVar, null), nVar, rVar, null));
        }
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            return d(nVar, dVar, new C32740b(this, dVar, null));
        }
        if (bVar instanceof b.p) {
            return C43175k.G(new C32747h(new C(3, null), nVar, (b.p) bVar, null));
        }
        if (bVar instanceof b.n) {
            return C43175k.G(new C32755p(((b.n) bVar).f204584b, this, cVar, null));
        }
        if (bVar instanceof b.j) {
            return C43175k.G(new C32753n(cVar, this, null));
        }
        if (bVar instanceof b.c) {
            return C43175k.G(new C32745f(cVar, this, null));
        }
        if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            return d(nVar, eVar, new C32748i(cVar, this, eVar, null));
        }
        if (bVar instanceof b.f) {
            b.f fVar = (b.f) bVar;
            return d(nVar, fVar, new C32749j(cVar, this, fVar, null));
        }
        if (bVar instanceof b.g) {
            return C43175k.G(new C32750k((b.g) bVar, this, cVar, null));
        }
        if (bVar instanceof b.o) {
            return C43175k.G(new C32756q(cVar, this, null));
        }
        if (bVar instanceof b.h) {
            return C43175k.G(new C32751l(cVar, this, null));
        }
        if (bVar instanceof b.i) {
            return C43175k.G(new C32752m(cVar, null));
        }
        if (bVar instanceof b.m) {
            return C43175k.G(new e(cVar, null));
        }
        if (bVar instanceof b.l) {
            return C43175k.G(new f(cVar, this, null));
        }
        if (bVar instanceof b.k) {
            b.k kVar = (b.k) bVar;
            return C43175k.G(new C32747h(new C32754o(this, cVar, kVar, null), nVar, kVar, null));
        }
        if (bVar instanceof b.s) {
            return C43175k.G(new g(cVar, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
