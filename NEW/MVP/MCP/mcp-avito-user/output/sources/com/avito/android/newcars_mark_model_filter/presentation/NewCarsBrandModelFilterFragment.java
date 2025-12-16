package com.avito.android.newcars_mark_model_filter.presentation;

import Cd.C13243a;
import Y41.p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import m30.C43870a;
import m30.C43871b;
import n30.InterfaceC44177c;
import o30.InterfaceC44575a;
import o30.b;
import z1.AbstractC50339a;

/* compiled from: NewCarsBrandModelFilterFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/NewCarsBrandModelFilterFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NewCarsBrandModelFilterFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f207276u0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f207277h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.newcars_mark_model_filter.presentation.i f207278i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final O0 f207279j0;

    /* renamed from: k0, reason: collision with root package name */
    public androidx.appcompat.view.d f207280k0;

    /* renamed from: l0, reason: collision with root package name */
    public Button f207281l0;

    /* renamed from: m0, reason: collision with root package name */
    public Input f207282m0;

    /* renamed from: n0, reason: collision with root package name */
    public SpinnerOverlay f207283n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f207284o0;

    /* renamed from: p0, reason: collision with root package name */
    public RecyclerView f207285p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.newcars_mark_model_filter.presentation.recycler.model.e f207286q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.e f207287r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f207288s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.newcars_mark_model_filter.analytics.b f207289t0;

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/NewCarsBrandModelFilterFragment$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "root", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.brands_models_recycler);
            NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = NewCarsBrandModelFilterFragment.this;
            com.avito.konveyor.adapter.d dVar = newCarsBrandModelFilterFragment.f207277h0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            newCarsBrandModelFilterFragment.f207285p0 = recyclerView;
            Input input = (Input) view2.findViewById(R.id.search_input);
            com.avito.android.lib.design.input.n.c(input, new com.avito.android.newcars_mark_model_filter.presentation.b(newCarsBrandModelFilterFragment));
            newCarsBrandModelFilterFragment.f207282m0 = input;
            input.setHint(R.string.new_cars_brandmodel_brand);
            newCarsBrandModelFilterFragment.f207283n0 = (SpinnerOverlay) view2.findViewById(R.id.spinner_overlay);
            newCarsBrandModelFilterFragment.f207284o0 = (TextView) view2.findViewById(R.id.nothing_found_textview);
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<o30.b, G0> {
        public final void f(@Y61.k o30.b bVar) {
            NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = (NewCarsBrandModelFilterFragment) this.receiver;
            a aVar = NewCarsBrandModelFilterFragment.f207276u0;
            newCarsBrandModelFilterFragment.getClass();
            if (bVar instanceof b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = newCarsBrandModelFilterFragment.f207288s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.a) bVar).f419346a, null, null, 6);
                newCarsBrandModelFilterFragment.dismiss();
                return;
            }
            if (bVar instanceof b.C12162b) {
                Dialog dialog = newCarsBrandModelFilterFragment.getDialog();
                com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                if (dVar != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    Throwable th2 = ((b.C12162b) bVar).f419347a;
                    com.avito.android.component.toast.c.d(cVar, dVar, com.avito.android.printable_text.b.f(String.valueOf(th2.getMessage())), th2 instanceof ApiException ? C42784z0.f406748b : Collections.singletonList(new c.a.C3719a(newCarsBrandModelFilterFragment.getString(R.string.new_cars_brandmodel_update), false, null, new com.avito.android.newcars_mark_model_filter.presentation.a(newCarsBrandModelFilterFragment), 6, null)), new f.c(th2), 0, ToastBarPosition.f181046d, 938);
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(o30.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<o30.c, G0> {
        @Override // Y41.l
        public final G0 invoke(o30.c cVar) {
            o30.c cVar2 = cVar;
            NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = (NewCarsBrandModelFilterFragment) this.receiver;
            com.avito.konveyor.adapter.d dVar = newCarsBrandModelFilterFragment.f207277h0;
            if (dVar == null) {
                dVar = null;
            }
            com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = new com.avito.android.inline_filters.dialog.group.item.double_input.e(newCarsBrandModelFilterFragment, 15);
            List<TV0.a> list = cVar2.f419352d;
            dVar.l(list, eVar);
            if (!list.isEmpty() || cVar2.f419358j) {
                TextView textView = newCarsBrandModelFilterFragment.f207284o0;
                if (textView == null) {
                    textView = null;
                }
                textView.setVisibility(8);
            } else {
                TextView textView2 = newCarsBrandModelFilterFragment.f207284o0;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setVisibility(0);
                TextView textView3 = newCarsBrandModelFilterFragment.f207284o0;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(newCarsBrandModelFilterFragment.getString(R.string.new_cars_brandmodel_nothing_found, cVar2.f419356h));
            }
            Dialog dialog = newCarsBrandModelFilterFragment.getDialog();
            com.avito.android.lib.design.bottom_sheet.d dVar2 = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
            boolean z12 = cVar2.f419359k;
            if (dVar2 != null) {
                newCarsBrandModelFilterFragment.g5(dVar2, z12, cVar2.f419360l);
            }
            if (z12) {
                Input input = newCarsBrandModelFilterFragment.f207282m0;
                if (input == null) {
                    input = null;
                }
                input.setHint(R.string.new_cars_brandmodel_brand);
            } else {
                Input input2 = newCarsBrandModelFilterFragment.f207282m0;
                if (input2 == null) {
                    input2 = null;
                }
                input2.setHint(R.string.new_cars_brandmodel_model);
            }
            if (cVar2.f419357i) {
                SpinnerOverlay spinnerOverlay = newCarsBrandModelFilterFragment.f207283n0;
                if (spinnerOverlay == null) {
                    spinnerOverlay = null;
                }
                D6.H(spinnerOverlay);
                Button button = newCarsBrandModelFilterFragment.f207281l0;
                (button != null ? button : null).setLoading(true);
            } else {
                SpinnerOverlay spinnerOverlay2 = newCarsBrandModelFilterFragment.f207283n0;
                if (spinnerOverlay2 == null) {
                    spinnerOverlay2 = null;
                }
                D6.w(spinnerOverlay2);
                Button button2 = newCarsBrandModelFilterFragment.f207281l0;
                (button2 != null ? button2 : null).setLoading(false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment$onCreateDialog$2$3", f = "NewCarsBrandModelFilterFragment.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207291q;

        /* compiled from: NewCarsBrandModelFilterFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.presentation.NewCarsBrandModelFilterFragment$onCreateDialog$2$3$1", f = "NewCarsBrandModelFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f207293q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ NewCarsBrandModelFilterFragment f207294r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f207294r = newCarsBrandModelFilterFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f207294r, continuation);
                aVar.f207293q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f207293q;
                a aVar = NewCarsBrandModelFilterFragment.f207276u0;
                NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = this.f207294r;
                C43259k.d(t12, null, null, new com.avito.android.newcars_mark_model_filter.presentation.d(newCarsBrandModelFilterFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.newcars_mark_model_filter.presentation.e(newCarsBrandModelFilterFragment, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return NewCarsBrandModelFilterFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207291q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = NewCarsBrandModelFilterFragment.this;
                a aVar = new a(newCarsBrandModelFilterFragment, null);
                this.f207291q = 1;
                if (C23056p0.b(newCarsBrandModelFilterFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f207295l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(0);
            this.f207295l = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f207295l.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = NewCarsBrandModelFilterFragment.f207276u0;
            NewCarsBrandModelFilterFragment.this.f5().accept(InterfaceC44575a.b.f419340a);
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = NewCarsBrandModelFilterFragment.this;
            Input input = newCarsBrandModelFilterFragment.f207282m0;
            if (input == null) {
                input = null;
            }
            Input.t(input, "", false, 6);
            newCarsBrandModelFilterFragment.f5().accept(InterfaceC44575a.d.f419341a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f207298l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f207298l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f207298l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return NewCarsBrandModelFilterFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f207300l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f207300l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f207300l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f207301l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f207301l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f207301l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f207302l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f207302l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f207302l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: NewCarsBrandModelFilterFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/newcars_mark_model_filter/presentation/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.newcars_mark_model_filter.presentation.h> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.newcars_mark_model_filter.presentation.h invoke() {
            com.avito.android.newcars_mark_model_filter.presentation.i iVar = NewCarsBrandModelFilterFragment.this.f207278i0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.newcars_mark_model_filter.presentation.h) iVar.get();
        }
    }

    @Inject
    public NewCarsBrandModelFilterFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f207279j0 = new O0(m0.f406844a.b(com.avito.android.newcars_mark_model_filter.presentation.h.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        ((InterfaceC44177c.b) C29972i.a(C29972i.b(this), InterfaceC44177c.b.class)).J9().a(cv.c.d(this)).a(this);
    }

    public final com.avito.android.newcars_mark_model_filter.presentation.h f5() {
        return (com.avito.android.newcars_mark_model_filter.presentation.h) this.f207279j0.getValue();
    }

    public final void g5(com.avito.android.lib.design.bottom_sheet.d dVar, boolean z12, boolean z13) {
        dVar.L(z12 ? getString(R.string.new_cars_brandmodel_brand) : getString(R.string.new_cars_brandmodel_model), z12 ? null : getString(R.string.new_cars_brandmodel_search_filters_reset), true, true);
        dVar.w(z13);
        androidx.appcompat.view.d dVar2 = this.f207280k0;
        dVar.z(C35835l0.m(dVar2 != null ? dVar2 : null, z12 ? R.attr.ic_close20 : R.attr.ic_arrowBack24, R.attr.black));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.N(true);
        if (z12) {
            dVar.R(new f(dVar));
        } else {
            dVar.P(new g());
            dVar.R(new h());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.newcars_mark_model_filter.analytics.b bVar = this.f207289t0;
        C42822w c42822w = null;
        if (bVar == null) {
            bVar = null;
        }
        bVar.getClass();
        bVar.f207254a.c(new C43871b());
        this.f207280k0 = new androidx.appcompat.view.d(getContext(), R.style.Theme_DesignSystem_Re23);
        androidx.appcompat.view.d dVar = this.f207280k0;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(dVar, 0, 2, c42822w);
        dVar2.B(R.layout.new_cars_brandmodel_select_content, R.layout.new_cars_brandmodel_select_footer, new b(), new com.avito.android.newcars_mark_model_filter.presentation.c(this), false);
        dVar2.K(true);
        g5(dVar2, f5().getState().getValue().f419359k, false);
        com.avito.android.arch.mvi.android.f.a(f5(), this, Lifecycle.State.f46682e, new c(1, this, NewCarsBrandModelFilterFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterOneTimeEvent;)V", 0), new d(1, this, NewCarsBrandModelFilterFragment.class, "render", "render(Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterState;)V", 0));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(null), 3);
        return dVar2;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.newcars_mark_model_filter.analytics.b bVar = this.f207289t0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.getClass();
        bVar.f207254a.c(new C43870a());
    }
}
