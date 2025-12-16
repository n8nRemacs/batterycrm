package com.avito.android.mortgage_calculator;

import android.content.Context;
import android.widget.TextView;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.mortgage_calculator.internal.items.DisclaimerDescription;
import com.avito.android.mortgage_calculator.internal.mvi.entity.g;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import w10.DialogC49422a;

/* compiled from: MortgageCalculatorView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.MortgageCalculatorView$collectEvents$1", f = "MortgageCalculatorView.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class G extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204042q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MortgageCalculatorView f204043r;

    /* compiled from: MortgageCalculatorView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.MortgageCalculatorView$collectEvents$1$1", f = "MortgageCalculatorView.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f204044q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ MortgageCalculatorView f204045r;

        /* compiled from: MortgageCalculatorView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.G$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6087a implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MortgageCalculatorView f204046b;

            public C6087a(MortgageCalculatorView mortgageCalculatorView) {
                this.f204046b = mortgageCalculatorView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                com.avito.android.mortgage_calculator.internal.mvi.entity.g gVar = (com.avito.android.mortgage_calculator.internal.mvi.entity.g) obj;
                int i12 = MortgageCalculatorView.f204050h;
                MortgageCalculatorView mortgageCalculatorView = this.f204046b;
                if (gVar instanceof g.a) {
                    b.a.a(mortgageCalculatorView.getDeeplinkHandler$_avito_mortgage_calculator_util().get(), ((g.a) gVar).f204607a, null, null, 6);
                } else if (gVar instanceof g.b) {
                    DisclaimerDescription disclaimerDescription = ((g.b) gVar).f204608a;
                    Context context = mortgageCalculatorView.getContext();
                    DialogC49422a dialogC49422a = new DialogC49422a(context, 0, 2, null);
                    com.avito.android.lib.design.bottom_sheet.d.M(dialogC49422a, disclaimerDescription.f204389b.k0(context), true, false, 10);
                    TextView textView = new TextView(context);
                    int iB2 = y6.b(16);
                    textView.setPadding(iB2, iB2, iB2, iB2);
                    textView.setTextAppearance(C35835l0.j(R.attr.textM20, context));
                    com.avito.android.util.text.j.c(textView, disclaimerDescription.f204390c, null);
                    dialogC49422a.setContentView(textView);
                    com.avito.android.lib.util.g.a(dialogC49422a);
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f204046b, MortgageCalculatorView.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MortgageCalculatorView mortgageCalculatorView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f204045r = mortgageCalculatorView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f204045r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f204044q;
            if (i12 == 0) {
                C42729a0.b(obj);
                MortgageCalculatorView mortgageCalculatorView = this.f204045r;
                InterfaceC43160i<com.avito.android.mortgage_calculator.internal.mvi.entity.g> events = mortgageCalculatorView.getViewModel().getEvents();
                C6087a c6087a = new C6087a(mortgageCalculatorView);
                this.f204044q = 1;
                if (events.collect(c6087a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(MortgageCalculatorView mortgageCalculatorView, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f204043r = mortgageCalculatorView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new G(this.f204043r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((G) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204042q;
        if (i12 == 0) {
            C42729a0.b(obj);
            MortgageCalculatorView mortgageCalculatorView = this.f204043r;
            InterfaceC22983P lifecycleOwner = mortgageCalculatorView.getLifecycleOwner();
            if (lifecycleOwner != null) {
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(mortgageCalculatorView, null);
                this.f204042q = 1;
                if (C23056p0.b(lifecycleOwner, state, aVar, this) == coroutine_suspended) {
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
