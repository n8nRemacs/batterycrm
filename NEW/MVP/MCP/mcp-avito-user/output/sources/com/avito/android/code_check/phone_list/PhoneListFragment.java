package com.avito.android.code_check.phone_list;

import Cd.C13243a;
import Ro.InterfaceC15066a;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.single_line.SingleLineInputModel;
import com.avito.android.code_check.CodeCheckAbstractFragment;
import com.avito.android.code_check.phone_list.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: PhoneListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/phone_list/PhoneListFragment;", "Lcom/avito/android/code_check/CodeCheckAbstractFragment;", "<init>", "()V", "a", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PhoneListFragment extends CodeCheckAbstractFragment {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f118860F0;

    /* renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f118861G0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118862A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118863B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118864C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118865D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final O0 f118866E0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f118867s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public RecyclerView.l f118868t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public dagger.internal.u f118869u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public PhoneList f118870v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check.d f118871w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f118872x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118873y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118874z0;

    /* compiled from: PhoneListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/code_check/phone_list/PhoneListFragment$a;", "", "<init>", "()V", "", "ARGS_SCREEN_NAME", "Ljava/lang/String;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PhoneListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.code_check.phone_list.PhoneListFragment$a$a, reason: collision with other inner class name */
        public static final class C3465a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f118875l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3465a(String str) {
                super(1);
                this.f118875l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("code_check.phone_list.screen_name", this.f118875l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static PhoneListFragment a(@Y61.k String str) {
            PhoneListFragment phoneListFragment = new PhoneListFragment();
            C35966w1.a(phoneListFragment, -1, new C3465a(str));
            return phoneListFragment;
        }

        public a() {
        }
    }

    /* compiled from: PhoneListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRo/a;", "it", "Lkotlin/G0;", "invoke", "(LRo/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC15066a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15066a interfaceC15066a) {
            ((s) PhoneListFragment.this.f118866E0.getValue()).accept(interfaceC15066a);
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.code_check_public.a aVar;
            PhoneListFragment phoneListFragment = PhoneListFragment.this;
            PhoneList phoneList = phoneListFragment.f118870v0;
            if (phoneList == null) {
                phoneList = null;
            }
            PhoneList.a aVar2 = phoneList.f119304d.f119321g;
            if (aVar2 != null && (aVar = aVar2.f119313b) != null) {
                com.avito.android.code_check.p.a(phoneListFragment, aVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f118878l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f118878l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f118878l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PhoneListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f118880l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f118880l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f118880l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f118881l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f118881l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f118881l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f118882l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f118882l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f118882l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PhoneListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_list/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/code_check/phone_list/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<s> {
        public i() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final s invoke() {
            dagger.internal.u uVar = PhoneListFragment.this.f118869u0;
            if (uVar == null) {
                uVar = null;
            }
            return (s) uVar.get();
        }
    }

    static {
        Y y12 = new Y(PhoneListFragment.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f118861G0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(PhoneListFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneListFragment.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneListFragment.class, SingleLineInputModel.STYLE_SEARCH, "getSearch()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneListFragment.class, "progress", "getProgress()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneListFragment.class, "additionalButton", "getAdditionalButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f118860F0 = new a(null);
    }

    public PhoneListFragment() {
        super(R.layout.phone_list_fragment, R.id.phone_list_scroll, R.id.phone_list_nav_bar);
        this.f118873y0 = new C47313c(null, 1, null);
        this.f118874z0 = new C47313c(null, 1, null);
        this.f118862A0 = new C47313c(null, 1, null);
        this.f118863B0 = new C47313c(null, 1, null);
        this.f118864C0 = new C47313c(null, 1, null);
        this.f118865D0 = new C47313c(null, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f118866E0 = new O0(m0.f406844a.b(s.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x5(com.avito.android.code_check.phone_list.PhoneListFragment r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.avito.android.code_check.phone_list.f
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.code_check.phone_list.f r0 = (com.avito.android.code_check.phone_list.f) r0
            int r1 = r0.f118977s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f118977s = r1
            goto L1b
        L16:
            com.avito.android.code_check.phone_list.f r0 = new com.avito.android.code_check.phone_list.f
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f118975q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f118977s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.C42729a0.b(r6)
            goto L5d
        L34:
            kotlin.C42729a0.b(r6)
            com.avito.android.code_check.d r6 = r5.f118871w0
            if (r6 == 0) goto L3c
            goto L3d
        L3c:
            r6 = 0
        L3d:
            com.avito.android.code_check.g$a r6 = r6.R5()
            com.avito.android.code_check.g r2 = com.avito.android.code_check.g.this
            java.lang.String r4 = r6.f118832b
            java.io.Serializable r6 = r6.f118831a
            java.io.Serializable r6 = (java.io.Serializable) r6
            androidx.lifecycle.r0 r2 = r2.f118826E
            kotlinx.coroutines.flow.n2 r6 = r2.c(r4, r6)
            com.avito.android.code_check.phone_list.g r2 = new com.avito.android.code_check.phone_list.g
            r2.<init>(r5)
            r0.f118977s = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.phone_list.PhoneListFragment.x5(com.avito.android.code_check.phone_list.PhoneListFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c(new com.avito.android.code_check.phone_list.i(), (com.avito.android.code_check.phone_list.c) C29972i.a(C29972i.b(this), com.avito.android.code_check.phone_list.c.class), cv.c.b(this), com.avito.android.analytics.screens.s.c(this), requireArguments().getString("code_check.phone_list.screen_name"), new b(), new c(), null);
        this.f118867s0 = cVar.f118903p.get();
        this.f118868t0 = cVar.f118904q.get();
        this.f118869u0 = cVar.f118887D;
        this.f118870v0 = cVar.f118892e.get();
        com.avito.android.code_check.d dVarVj = cVar.f118888a.Vj();
        dagger.internal.t.c(dVarVj);
        this.f118871w0 = dVarVj;
        ScreenPerformanceTracker screenPerformanceTracker = cVar.f118911x.get();
        this.f118872x0 = screenPerformanceTracker;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            PhoneList phoneList = this.f118870v0;
            if (phoneList == null) {
                phoneList = null;
            }
            Y41.l<Phone, G0> lVar = phoneList.f119303c;
            if (lVar != null) {
                com.avito.android.code_check.d dVar = this.f118871w0;
                if (dVar == null) {
                    dVar = null;
                }
                String strA = dVar.G3().a();
                String strA2 = strA != null ? To.c.a(strA) : null;
                lVar.invoke(strA2 != null ? Phone.a(strA2) : null);
            }
        }
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    @Y61.k
    public final com.avito.android.code_check_public.screen.h q5() {
        PhoneList phoneList = this.f118870v0;
        if (phoneList != null) {
            return phoneList;
        }
        return null;
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    @Y61.k
    public final ScreenPerformanceTracker r5() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f118872x0;
        if (screenPerformanceTracker != null) {
            return screenPerformanceTracker;
        }
        return null;
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void s5() {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.code_check.phone_list.d(this, null), 3);
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void t5() {
        com.avito.android.lib.design.input.n.c(y5(), new com.avito.android.code_check.phone_list.e(this));
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void u5(@Y61.k View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.phone_list_recycler);
        com.avito.konveyor.adapter.d dVar = this.f118867s0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        C47313c c47313c = this.f118873y0;
        kotlin.reflect.n<Object>[] nVarArr = f118861G0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, recyclerView);
        TextView textView = (TextView) view.findViewById(R.id.phone_list_title);
        PhoneList phoneList = this.f118870v0;
        if (phoneList == null) {
            phoneList = null;
        }
        textView.setText(phoneList.f119304d.f119315a.k0(textView.getContext()));
        C47313c c47313c2 = this.f118874z0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, textView);
        Input input = (Input) view.findViewById(R.id.phone_list_search);
        PhoneList phoneList2 = this.f118870v0;
        if (phoneList2 == null) {
            phoneList2 = null;
        }
        PrintableText printableText = phoneList2.f119304d.f119319e;
        input.setHint(printableText != null ? printableText.k0(input.getContext()) : null);
        input.setInputType(8194);
        C47313c c47313c3 = this.f118863B0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, input);
        View viewFindViewById = view.findViewById(R.id.phone_list_progress);
        C47313c c47313c4 = this.f118864C0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[4];
        c47313c4.b(this, viewFindViewById);
        Button button = (Button) view.findViewById(R.id.phone_list_button);
        PhoneList phoneList3 = this.f118870v0;
        if (phoneList3 == null) {
            phoneList3 = null;
        }
        button.setVisibility(phoneList3.f119304d.f119322h == null ? 8 : 0);
        PhoneList phoneList4 = this.f118870v0;
        if (phoneList4 == null) {
            phoneList4 = null;
        }
        PhoneList.a aVar = phoneList4.f119304d.f119322h;
        if (aVar != null) {
            kotlin.reflect.n<Object> nVar5 = nVarArr[0];
            RecyclerView recyclerView2 = (RecyclerView) c47313c.a();
            RecyclerView.l lVar = this.f118868t0;
            if (lVar == null) {
                lVar = null;
            }
            recyclerView2.l(lVar, -1);
            button.setText(aVar.f119312a.k0(button.getContext()));
            button.setOnClickListener(new com.avito.android.body_condition.h(15, this, aVar));
        }
        C47313c c47313c5 = this.f118865D0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[5];
        c47313c5.b(this, button);
        PhoneList phoneList5 = this.f118870v0;
        if (phoneList5 == null) {
            phoneList5 = null;
        }
        com.avito.android.code_check_public.c<AttributedText> cVar = phoneList5.f119304d.f119318d;
        TextView textView2 = (TextView) view.findViewById(R.id.phone_list_subtitle);
        textView2.setVisibility(cVar == null ? 8 : 0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        if (cVar != null) {
            com.avito.android.util.text.j.c(textView2, cVar.k0(textView2.getContext()), null);
        }
        C47313c c47313c6 = this.f118862A0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        c47313c6.b(this, textView2);
    }

    public final Input y5() {
        C47313c c47313c = this.f118863B0;
        kotlin.reflect.n<Object> nVar = f118861G0[3];
        return (Input) c47313c.a();
    }
}
