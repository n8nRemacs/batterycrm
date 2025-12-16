package com.avito.android.cv_actualization.view.code_input;

import Cd.C13243a;
import Y41.p;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.code_input.JsxCvActualizationCodeInputFragment;
import com.avito.android.cv_actualization.view.code_input.di.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qt.AbstractC47436a;
import qt.b;
import qt.c;
import rt.C47718a;
import z1.AbstractC50339a;

/* compiled from: JsxCvActualizationCodeInputFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/JsxCvActualizationCodeInputFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsxCvActualizationCodeInputFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f131118A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public rt.b f131119n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f131120o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f131121p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f131122q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f131123r0;

    /* renamed from: s0, reason: collision with root package name */
    public Toolbar f131124s0;

    /* renamed from: t0, reason: collision with root package name */
    public TextView f131125t0;

    /* renamed from: u0, reason: collision with root package name */
    public ComponentContainer f131126u0;

    /* renamed from: v0, reason: collision with root package name */
    public Input f131127v0;

    /* renamed from: w0, reason: collision with root package name */
    public Button f131128w0;

    /* renamed from: x0, reason: collision with root package name */
    public Button f131129x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f131130y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f131131z0;

    /* renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f131117C0 = {m0.f406844a.e(new Y(JsxCvActualizationCodeInputFragment.class, "openParams", "getOpenParams()Lcom/avito/android/cv_actualization/view/code_input/JsxCvActualizationCodeInputOpenParams;", 0))};

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f131116B0 = new a(null);

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/JsxCvActualizationCodeInputFragment$a;", "", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/e;", "invoke", "()Lcom/avito/android/cv_actualization/view/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.cv_actualization.view.e> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cv_actualization.view.e invoke() {
            return (com.avito.android.cv_actualization.view.e) JsxCvActualizationCodeInputFragment.this.l1();
        }
    }

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.code_input.JsxCvActualizationCodeInputFragment$onViewCreated$4", f = "JsxCvActualizationCodeInputFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {
        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return JsxCvActualizationCodeInputFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super G0> continuation) {
            return ((c) create(num, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = JsxCvActualizationCodeInputFragment.f131116B0;
            JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = JsxCvActualizationCodeInputFragment.this;
            C47718a c47718aQ5 = jsxCvActualizationCodeInputFragment.q5();
            Input input = jsxCvActualizationCodeInputFragment.f131127v0;
            if (input == null) {
                input = null;
            }
            c47718aQ5.accept(new AbstractC47436a.C12337a(String.valueOf(input.m53getText())));
            return G0.f406611a;
        }
    }

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.code_input.JsxCvActualizationCodeInputFragment$onViewCreated$5", f = "JsxCvActualizationCodeInputFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<CharSequence, Continuation<? super G0>, Object> {
        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return JsxCvActualizationCodeInputFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(CharSequence charSequence, Continuation<? super G0> continuation) {
            return ((d) create(charSequence, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = JsxCvActualizationCodeInputFragment.f131116B0;
            JsxCvActualizationCodeInputFragment.this.q5().accept(AbstractC47436a.c.f429382a);
            return G0.f406611a;
        }
    }

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<qt.b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
        @Override // Y41.l
        public final G0 invoke(qt.b bVar) {
            qt.b bVar2 = bVar;
            JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = (JsxCvActualizationCodeInputFragment) this.receiver;
            a aVar = JsxCvActualizationCodeInputFragment.f131116B0;
            jsxCvActualizationCodeInputFragment.getClass();
            boolean zF2 = L.f(bVar2, b.e.f429388a);
            InterfaceC42726C interfaceC42726C = jsxCvActualizationCodeInputFragment.f131131z0;
            if (zF2) {
                ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).a1();
                ?? r02 = jsxCvActualizationCodeInputFragment.f131123r0;
                K2.d(r02 != 0 ? r02 : null, true);
            } else if (bVar2 instanceof b.a) {
                ((com.avito.android.cv_actualization.view.e) interfaceC42726C.getValue()).o0(((b.a) bVar2).f429384a);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                View view = jsxCvActualizationCodeInputFragment.f131123r0;
                com.avito.android.component.toast.c.b(cVar, view == null ? null : view, ((b.c) bVar2).f429386a, null, null, null, null, 0, null, null, false, false, null, null, 4094);
            } else if (L.f(bVar2, b.d.f429387a)) {
                Input input = jsxCvActualizationCodeInputFragment.f131127v0;
                if (input == null) {
                    input = null;
                }
                input.v();
                Input input2 = jsxCvActualizationCodeInputFragment.f131127v0;
                (input2 != null ? input2 : null).q();
            } else if (L.f(bVar2, b.C12338b.f429385a)) {
                ?? r03 = jsxCvActualizationCodeInputFragment.f131123r0;
                K2.d(r03 != 0 ? r03 : null, true);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<qt.c, G0> {
        @Override // Y41.l
        public final G0 invoke(qt.c cVar) {
            qt.c cVar2 = cVar;
            JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = (JsxCvActualizationCodeInputFragment) this.receiver;
            TextView textView = jsxCvActualizationCodeInputFragment.f131125t0;
            if (textView == null) {
                textView = null;
            }
            com.avito.android.util.text.j.c(textView, new AttributedText(jsxCvActualizationCodeInputFragment.requireContext().getString(R.string.jsx_cv_actualization_confirm_description, "{{phone_attr}}"), Collections.singletonList(new FontAttribute("phone_attr", cVar2.f429389b, com.avito.android.advert.item.delivery_suggests.l.u(null, "textH5"))), 0), null);
            ComponentContainer componentContainer = jsxCvActualizationCodeInputFragment.f131126u0;
            if (componentContainer == null) {
                componentContainer = null;
            }
            String strK0 = cVar2.f429391d.k0(componentContainer.getContext());
            if (strK0.length() > 0) {
                ComponentContainer componentContainer2 = jsxCvActualizationCodeInputFragment.f131126u0;
                if (componentContainer2 == null) {
                    componentContainer2 = null;
                }
                ComponentContainer.n(componentContainer2, strK0, 2);
            } else {
                ComponentContainer componentContainer3 = jsxCvActualizationCodeInputFragment.f131126u0;
                if (componentContainer3 == null) {
                    componentContainer3 = null;
                }
                componentContainer3.k();
            }
            Button button = jsxCvActualizationCodeInputFragment.f131128w0;
            if (button == null) {
                button = null;
            }
            c.a aVar = cVar2.f429390c;
            button.setEnabled(aVar.f429393a);
            Button button2 = jsxCvActualizationCodeInputFragment.f131128w0;
            Button button3 = button2 == null ? null : button2;
            if (button2 == null) {
                button2 = null;
            }
            button3.setText(aVar.f429394b.k0(button2.getContext()));
            if (cVar2.f429392e) {
                View view = jsxCvActualizationCodeInputFragment.f131130y0;
                D6.H(view != null ? view : null);
            } else {
                View view2 = jsxCvActualizationCodeInputFragment.f131130y0;
                D6.w(view2 != null ? view2 : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f131135l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f131135l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f131135l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JsxCvActualizationCodeInputFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f131137l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f131137l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f131137l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131138l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131138l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f131138l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131139l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131139l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f131139l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: JsxCvActualizationCodeInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lrt/a;", "kotlin.jvm.PlatformType", "invoke", "()Lrt/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<C47718a> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final C47718a invoke() {
            rt.b bVar = JsxCvActualizationCodeInputFragment.this.f131119n0;
            if (bVar == null) {
                bVar = null;
            }
            return (C47718a) bVar.get();
        }
    }

    public JsxCvActualizationCodeInputFragment() {
        super(R.layout.jsx_cv_actualization_code_input_fragment);
        this.f131121p0 = new io.reactivex.rxjava3.disposables.c();
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f131122q0 = new O0(m0.f406844a.b(C47718a.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f131131z0 = C42727D.c(new b());
        this.f131118A0 = new C35968w3(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f131120o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f131121p0.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.code_input_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f131123r0 = viewFindViewById;
        View viewFindViewById2 = requireView().findViewById(R.id.code_input_toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f131124s0 = (Toolbar) viewFindViewById2;
        View viewFindViewById3 = requireView().findViewById(R.id.code_input_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131125t0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = requireView().findViewById(R.id.code_input_field_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f131126u0 = (ComponentContainer) viewFindViewById4;
        View viewFindViewById5 = requireView().findViewById(R.id.code_input_field);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f131127v0 = (Input) viewFindViewById5;
        View viewFindViewById6 = requireView().findViewById(R.id.code_input_retry_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f131128w0 = (Button) viewFindViewById6;
        View viewFindViewById7 = requireView().findViewById(R.id.code_input_confirm_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f131129x0 = (Button) viewFindViewById7;
        View viewFindViewById8 = requireView().findViewById(R.id.code_input_progress);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f131130y0 = viewFindViewById8;
        Toolbar toolbar = this.f131124s0;
        if (toolbar == null) {
            toolbar = null;
        }
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_actualization.view.code_input.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationCodeInputFragment f131148c;

            {
                this.f131148c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = this.f131148c;
                switch (i12) {
                    case 0:
                        JsxCvActualizationCodeInputFragment.a aVar = JsxCvActualizationCodeInputFragment.f131116B0;
                        jsxCvActualizationCodeInputFragment.q5().accept(AbstractC47436a.b.f429381a);
                        break;
                    case 1:
                        JsxCvActualizationCodeInputFragment.a aVar2 = JsxCvActualizationCodeInputFragment.f131116B0;
                        jsxCvActualizationCodeInputFragment.q5().accept(AbstractC47436a.d.f429383a);
                        break;
                    default:
                        JsxCvActualizationCodeInputFragment.a aVar3 = JsxCvActualizationCodeInputFragment.f131116B0;
                        C47718a c47718aQ5 = jsxCvActualizationCodeInputFragment.q5();
                        Input input = jsxCvActualizationCodeInputFragment.f131127v0;
                        if (input == null) {
                            input = null;
                        }
                        c47718aQ5.accept(new AbstractC47436a.C12337a(String.valueOf(input.m53getText())));
                        break;
                }
            }
        });
        Button button = this.f131128w0;
        if (button == null) {
            button = null;
        }
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_actualization.view.code_input.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationCodeInputFragment f131148c;

            {
                this.f131148c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = this.f131148c;
                switch (i13) {
                    case 0:
                        JsxCvActualizationCodeInputFragment.a aVar = JsxCvActualizationCodeInputFragment.f131116B0;
                        jsxCvActualizationCodeInputFragment.q5().accept(AbstractC47436a.b.f429381a);
                        break;
                    case 1:
                        JsxCvActualizationCodeInputFragment.a aVar2 = JsxCvActualizationCodeInputFragment.f131116B0;
                        jsxCvActualizationCodeInputFragment.q5().accept(AbstractC47436a.d.f429383a);
                        break;
                    default:
                        JsxCvActualizationCodeInputFragment.a aVar3 = JsxCvActualizationCodeInputFragment.f131116B0;
                        C47718a c47718aQ5 = jsxCvActualizationCodeInputFragment.q5();
                        Input input = jsxCvActualizationCodeInputFragment.f131127v0;
                        if (input == null) {
                            input = null;
                        }
                        c47718aQ5.accept(new AbstractC47436a.C12337a(String.valueOf(input.m53getText())));
                        break;
                }
            }
        });
        Button button2 = this.f131129x0;
        if (button2 == null) {
            button2 = null;
        }
        final int i14 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_actualization.view.code_input.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationCodeInputFragment f131148c;

            {
                this.f131148c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = this.f131148c;
                switch (i14) {
                    case 0:
                        JsxCvActualizationCodeInputFragment.a aVar = JsxCvActualizationCodeInputFragment.f131116B0;
                        jsxCvActualizationCodeInputFragment.q5().accept(AbstractC47436a.b.f429381a);
                        break;
                    case 1:
                        JsxCvActualizationCodeInputFragment.a aVar2 = JsxCvActualizationCodeInputFragment.f131116B0;
                        jsxCvActualizationCodeInputFragment.q5().accept(AbstractC47436a.d.f429383a);
                        break;
                    default:
                        JsxCvActualizationCodeInputFragment.a aVar3 = JsxCvActualizationCodeInputFragment.f131116B0;
                        C47718a c47718aQ5 = jsxCvActualizationCodeInputFragment.q5();
                        Input input = jsxCvActualizationCodeInputFragment.f131127v0;
                        if (input == null) {
                            input = null;
                        }
                        c47718aQ5.accept(new AbstractC47436a.C12337a(String.valueOf(input.m53getText())));
                        break;
                }
            }
        });
        Input input = this.f131127v0;
        if (input == null) {
            input = null;
        }
        C43175k.K(new C43197r1(new c(null), y.a(com.avito.android.lib.design.input.n.a(input, 6))), C22984Q.a(getViewLifecycleOwner()));
        Input input2 = this.f131127v0;
        if (input2 == null) {
            input2 = null;
        }
        C43175k.K(new C43197r1(new d(null), y.a(com.avito.android.lib.design.input.n.e(input2))), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f131120o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f131120o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new e(1, this, JsxCvActualizationCodeInputFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputOneTimeEvent;)V", 0), new f(1, this, JsxCvActualizationCodeInputFragment.class, "renderState", "renderState(Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputState;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.cv_actualization.view.code_input.di.a.a();
        com.avito.android.cv_actualization.view.code_input.di.c cVar = (com.avito.android.cv_actualization.view.code_input.di.c) C29972i.a(C29972i.b(this), com.avito.android.cv_actualization.view.code_input.di.c.class);
        Resources resources = getResources();
        n<Object>[] nVarArr = f131117C0;
        n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f131118A0;
        JsxCvActualizationCodeInputOpenParams jsxCvActualizationCodeInputOpenParams = (JsxCvActualizationCodeInputOpenParams) c35968w3.getValue(this, nVar);
        JsxCvActualizationCodeInputOpenParams jsxCvActualizationCodeInputOpenParams2 = (JsxCvActualizationCodeInputOpenParams) c35968w3.getValue(this, nVarArr[0]);
        aVarA.a(cVar, this, resources, jsxCvActualizationCodeInputOpenParams.f131141b, jsxCvActualizationCodeInputOpenParams2.f131142c, s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f131120o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final C47718a q5() {
        return (C47718a) this.f131122q0.getValue();
    }
}
