package com.avito.android.suggest_institutes_bottom_sheet.ui;

import Cd.C13243a;
import Y41.p;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.suggest_institutes_bottom_sheet.SuggestInstituteArguments;
import com.avito.android.suggest_institutes_bottom_sheet.di.b;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.a;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.n;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.s;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.t;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.u;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import z1.AbstractC50339a;

/* compiled from: SuggestInstitutesDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/ui/SuggestInstitutesDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestInstitutesDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public u f292081h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f292082i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f292083j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f292084k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f292085l0;

    /* renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f292080n0 = {m0.f406844a.e(new Y(SuggestInstitutesDialogFragment.class, "arguments", "getArguments()Lcom/avito/android/suggest_institutes_bottom_sheet/SuggestInstituteArguments;", 0))};

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f292079m0 = new a(null);

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/ui/SuggestInstitutesDialogFragment$a;", "", "<init>", "()V", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.suggest_institutes_bottom_sheet.ui.SuggestInstitutesDialogFragment$onViewCreated$1", f = "SuggestInstitutesDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<CharSequence, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f292086q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = SuggestInstitutesDialogFragment.this.new b(continuation);
            bVar.f292086q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(CharSequence charSequence, Continuation<? super G0> continuation) {
            return ((b) create(charSequence, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            CharSequence charSequence = (CharSequence) this.f292086q;
            a aVar = SuggestInstitutesDialogFragment.f292079m0;
            ((t) SuggestInstitutesDialogFragment.this.f292082i0.getValue()).accept(new a.C8852a(charSequence.toString()));
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<com.avito.android.suggest_institutes_bottom_sheet.mvi.n, G0> {
        @Override // Y41.l
        public final G0 invoke(com.avito.android.suggest_institutes_bottom_sheet.mvi.n nVar) {
            com.avito.android.suggest_institutes_bottom_sheet.mvi.n nVar2 = nVar;
            SuggestInstitutesDialogFragment suggestInstitutesDialogFragment = (SuggestInstitutesDialogFragment) this.receiver;
            a aVar = SuggestInstitutesDialogFragment.f292079m0;
            suggestInstitutesDialogFragment.getClass();
            if (nVar2 instanceof n.a) {
                C22960s.a(C22777e.b(new Q("SELECTED_SUGGEST_INSTITUTE", ((n.a) nVar2).f292073a)), suggestInstitutesDialogFragment, "SUGGEST_INSTITUTES");
                suggestInstitutesDialogFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<s, G0> {
        @Override // Y41.l
        public final G0 invoke(s sVar) {
            com.avito.android.suggest_institutes_bottom_sheet.ui.c cVar = (com.avito.android.suggest_institutes_bottom_sheet.ui.c) this.receiver;
            cVar.getClass();
            cVar.f292096a.c(new UV0.c(sVar.f292077a));
            cVar.f292098c.A0(0);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SuggestInstitutesDialogFragment.f292079m0;
            ((t) SuggestInstitutesDialogFragment.this.f292082i0.getValue()).accept(a.b.f292030a);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Integer, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = SuggestInstitutesDialogFragment.f292079m0;
            ((t) SuggestInstitutesDialogFragment.this.f292082i0.getValue()).accept(new a.c(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f292090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f292090l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f292090l);
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
            return SuggestInstitutesDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f292092l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f292092l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f292092l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f292093l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f292093l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f292093l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f292094l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f292094l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f292094l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SuggestInstitutesDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<t> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = SuggestInstitutesDialogFragment.this.f292081h0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    public SuggestInstitutesDialogFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f292082i0 = new O0(m0.f406844a.b(t.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f292085l0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.suggest_institutes_bottom_sheet.di.a.a();
        com.avito.android.suggest_institutes_bottom_sheet.di.d dVar = (com.avito.android.suggest_institutes_bottom_sheet.di.d) C29972i.a(C29972i.b(this), com.avito.android.suggest_institutes_bottom_sheet.di.d.class);
        kotlin.reflect.n<Object>[] nVarArr = f292080n0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        C35968w3 c35968w3 = this.f292085l0;
        SuggestInstituteArguments suggestInstituteArguments = (SuggestInstituteArguments) c35968w3.getValue(this, nVar);
        aVarA.a(dVar, suggestInstituteArguments.f291982c, new f(), ((SuggestInstituteArguments) c35968w3.getValue(this, nVarArr[0])).f291983d).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, ((SuggestInstituteArguments) this.f292085l0.getValue(this, f292080n0[0])).f291981b, true, false, 10);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.setCanceledOnTouchOutside(true);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.suggest_institutes_dialog_fragment, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f292083j0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f292084k0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.suggest_institutes_bottom_sheet.ui.c cVar = new com.avito.android.suggest_institutes_bottom_sheet.ui.c(view, jVar, aVar, new e());
        C43175k.K(new C43197r1(new b(null), C43175k.n(cVar.f292100e, 600L)), C22984Q.a(getViewLifecycleOwner()));
        com.avito.android.arch.mvi.android.f.a((t) this.f292082i0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new c(1, this, SuggestInstitutesDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/SuggestInstitutesOneTimeEvent;)V", 0), new d(1, cVar, com.avito.android.suggest_institutes_bottom_sheet.ui.c.class, "render", "render(Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/SuggestInstitutesState;)V", 0));
    }
}
