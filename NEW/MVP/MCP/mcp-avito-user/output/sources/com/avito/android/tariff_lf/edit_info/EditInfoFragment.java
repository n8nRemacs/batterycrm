package com.avito.android.tariff_lf.edit_info;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import aD0.C19758a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.tariff.remote.model.edit.TariffAlertAction;
import com.avito.android.tariff_lf.edit_info.EditInfoFragment;
import com.avito.android.tariff_lf.edit_info.h;
import com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffLink;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kv.C43501a;
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;

/* compiled from: EditInfoFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/EditInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden], DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes4.dex */
public final class EditInfoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: F0, reason: collision with root package name */
    @k
    public static final a f298742F0;

    /* renamed from: G0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f298743G0;

    /* renamed from: A0, reason: collision with root package name */
    @k
    public final C47313c f298744A0;

    /* renamed from: B0, reason: collision with root package name */
    @k
    public final C47313c f298745B0;

    /* renamed from: C0, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<ZC0.a> f298746C0;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public ZC0.b f298747D0;

    /* renamed from: E0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f298748E0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f298749n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f298750o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_lf.edit_info.viewmodel.k f298751p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f298752q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public RecyclerView.l f298753r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f298754s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f298755t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f298756u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f298757v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47312b f298758w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C47313c f298759x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final C47313c f298760y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final C47313c f298761z0;

    /* compiled from: EditInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/EditInfoFragment$a;", "", "<init>", "()V", "", "TABS_MARGIN_TOP_PROMO_BLOCK_NOT_EMPTY", "I", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f298762a;

        static {
            int[] iArr = new int[TariffAlertAction.ButtonStyle.values().length];
            try {
                iArr[TariffAlertAction.ButtonStyle.OUTLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TariffAlertAction.ButtonStyle.LINK_INCREASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f298762a = iArr;
        }
    }

    /* compiled from: EditInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            if ((interfaceC14249c instanceof PaymentSessionLink.b.C4013b) || (interfaceC14249c instanceof ConstructorTariffLink.a.b)) {
                com.avito.android.tariff_lf.edit_info.viewmodel.k kVar = EditInfoFragment.this.f298751p0;
                if (kVar == null) {
                    kVar = null;
                }
                kVar.O();
            }
        }
    }

    /* compiled from: EditInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.tariff_lf.edit_info.viewmodel.k kVar = EditInfoFragment.this.f298751p0;
            if (kVar == null) {
                kVar = null;
            }
            kVar.h0();
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(EditInfoFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f298743G0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(EditInfoFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(EditInfoFragment.class, "toolbarTitle", "getToolbarTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(EditInfoFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(EditInfoFragment.class, "tabLayout", "getTabLayout()Lcom/avito/android/lib/design/tab_layout/AvitoTabLayout;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(EditInfoFragment.class, "promoBlock", "getPromoBlock()Lcom/avito/android/lib/design/banner/Banner;", 0, n0Var)};
        f298742F0 = new a(null);
    }

    public EditInfoFragment() {
        super(0, 1, null);
        this.f298756u0 = new io.reactivex.rxjava3.disposables.c();
        this.f298758w0 = new C47312b(null, 1, null);
        this.f298759x0 = new C47313c(null, 1, null);
        this.f298760y0 = new C47313c(null, 1, null);
        this.f298761z0 = new C47313c(null, 1, null);
        this.f298744A0 = new C47313c(null, 1, null);
        this.f298745B0 = new C47313c(null, 1, null);
        this.f298746C0 = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @k
    public final Context m5(@k Context context, @l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        String string;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
            throw new IllegalStateException("checkout context must be set");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff_lf.edit_info.di.a.a().a(this, string, getResources(), (com.avito.android.tariff_lf.common.di.a) C29972i.a(C29972i.b(this), com.avito.android.tariff_lf.common.di.a.class), cv.c.b(this), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f298757v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f298754s0;
        if (aVar == null) {
            aVar = null;
        }
        C49166b.c(aVar, C49166b.a(this));
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar = this.f298751p0;
        if (kVar == null) {
            kVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f298755t0;
        if (set == null) {
            set = null;
        }
        kVar.a(set);
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f298754s0;
        this.f298756u0.b((aVar2 != null ? aVar2 : null).d9().t0(new c()));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f298757v0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.edit_info_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f298756u0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        n<Object>[] nVarArr = f298743G0;
        n<Object> nVar = nVarArr[0];
        C47312b c47312b = this.f298758w0;
        c47312b.b(this, recyclerView);
        n<Object> nVar2 = nVarArr[0];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.j jVar = this.f298749n0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        n<Object> nVar3 = nVarArr[0];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        RecyclerView.l lVar = this.f298753r0;
        if (lVar == null) {
            lVar = null;
        }
        recyclerView3.l(lVar, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        C47313c c47313c = this.f298759x0;
        n<Object> nVar4 = nVarArr[1];
        c47313c.b(this, toolbar);
        n<Object> nVar5 = nVarArr[1];
        ((Toolbar) c47313c.a()).setNavigationOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 28));
        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
        C47313c c47313c2 = this.f298760y0;
        n<Object> nVar6 = nVarArr[2];
        c47313c2.b(this, textView);
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_placeholder), R.id.recycler_view, null, 0, 0, 28, null);
        C47313c c47313c3 = this.f298761z0;
        n<Object> nVar7 = nVarArr[3];
        c47313c3.b(this, lVar2);
        q5().f231600j = new d();
        this.f298747D0 = new ZC0.b(this.f298746C0, view.getContext(), R.layout.period_tab);
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) view.findViewById(R.id.tabs_item);
        C47313c c47313c4 = this.f298744A0;
        n<Object> nVar8 = nVarArr[4];
        c47313c4.b(this, avitoTabLayout);
        com.avito.android.lib.deprecated_design.tab.l.d(s5(), this.f298747D0);
        s5().a(new e());
        Banner banner = (Banner) view.findViewById(R.id.promoBlock);
        C47313c c47313c5 = this.f298745B0;
        n<Object> nVar9 = nVarArr[5];
        c47313c5.b(this, banner);
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar = this.f298751p0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.getF299136c0().observe(getViewLifecycleOwner(), new h.a(new com.avito.android.tariff_lf.edit_info.d(this)));
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar2 = this.f298751p0;
        if (kVar2 == null) {
            kVar2 = null;
        }
        final int i12 = 0;
        kVar2.getF299137d0().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.tariff_lf.edit_info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditInfoFragment f298770c;

            {
                this.f298770c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                final int i13 = 1;
                final int i14 = 0;
                EditInfoFragment editInfoFragment = this.f298770c;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.android.recycler.data_aware.c cVar = editInfoFragment.f298750o0;
                            (cVar != null ? cVar : null).c(new UV0.c(list));
                            break;
                        } else {
                            EditInfoFragment.a aVar = EditInfoFragment.f298742F0;
                            break;
                        }
                    case 1:
                        ZC0.e eVar = (ZC0.e) obj;
                        EditInfoFragment.a aVar2 = EditInfoFragment.f298742F0;
                        if (eVar != null) {
                            editInfoFragment.f298746C0.f178156a = new UV0.c(eVar.f19980b);
                            ZC0.b bVar = editInfoFragment.f298747D0;
                            if (bVar != null) {
                                bVar.d();
                            }
                            c.i iVarJ = editInfoFragment.s5().j(eVar.f19981c);
                            if (iVarJ != null) {
                                iVarJ.b();
                                break;
                            }
                        }
                        break;
                    case 2:
                        final C19758a c19758a = (C19758a) obj;
                        EditInfoFragment.a aVar3 = EditInfoFragment.f298742F0;
                        if (c19758a != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(editInfoFragment.requireContext(), 0, 2, null);
                            View viewInflate = View.inflate(dVar.getContext(), R.layout.bottom_sheet_layout_info, null);
                            dVar.G(viewInflate, true);
                            com.avito.android.lib.design.bottom_sheet.j.c(dVar, c19758a.f20815a, true, 0, 0, 0, 120);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
                            Button button = (Button) viewInflate.findViewById(R.id.primary_button);
                            Button button2 = (Button) viewInflate.findViewById(R.id.secondary_button);
                            I5.a(textView2, c19758a.f20816b, false);
                            button.setAppearanceFromAttr(c19758a.f20821g);
                            com.avito.android.lib.design.button.b.a(button, c19758a.f20817c, false);
                            Integer num = c19758a.f20822h;
                            if (num != null) {
                                Button.g(button, C35835l0.h(num.intValue(), dVar.getContext()), null, false, null, 14);
                            }
                            com.avito.android.lib.design.button.b.a(button2, c19758a.f20818d, false);
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i14) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i13) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            com.avito.android.lib.util.g.a(dVar);
                            editInfoFragment.f298748E0 = dVar;
                            break;
                        }
                        break;
                    case 3:
                        if (obj != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = editInfoFragment.f298748E0;
                            if (dVar2 != null) {
                                dVar2.r();
                                break;
                            }
                        } else {
                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str != null) {
                            C47313c c47313c6 = editInfoFragment.f298760y0;
                            n<Object> nVar10 = EditInfoFragment.f298743G0[2];
                            ((TextView) c47313c6.a()).setText(str);
                            break;
                        } else {
                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                            break;
                        }
                }
            }
        });
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar3 = this.f298751p0;
        if (kVar3 == null) {
            kVar3 = null;
        }
        final int i13 = 1;
        kVar3.getF299140g0().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.tariff_lf.edit_info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditInfoFragment f298770c;

            {
                this.f298770c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                final int i132 = 1;
                final int i14 = 0;
                EditInfoFragment editInfoFragment = this.f298770c;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.android.recycler.data_aware.c cVar = editInfoFragment.f298750o0;
                            (cVar != null ? cVar : null).c(new UV0.c(list));
                            break;
                        } else {
                            EditInfoFragment.a aVar = EditInfoFragment.f298742F0;
                            break;
                        }
                    case 1:
                        ZC0.e eVar = (ZC0.e) obj;
                        EditInfoFragment.a aVar2 = EditInfoFragment.f298742F0;
                        if (eVar != null) {
                            editInfoFragment.f298746C0.f178156a = new UV0.c(eVar.f19980b);
                            ZC0.b bVar = editInfoFragment.f298747D0;
                            if (bVar != null) {
                                bVar.d();
                            }
                            c.i iVarJ = editInfoFragment.s5().j(eVar.f19981c);
                            if (iVarJ != null) {
                                iVarJ.b();
                                break;
                            }
                        }
                        break;
                    case 2:
                        final C19758a c19758a = (C19758a) obj;
                        EditInfoFragment.a aVar3 = EditInfoFragment.f298742F0;
                        if (c19758a != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(editInfoFragment.requireContext(), 0, 2, null);
                            View viewInflate = View.inflate(dVar.getContext(), R.layout.bottom_sheet_layout_info, null);
                            dVar.G(viewInflate, true);
                            com.avito.android.lib.design.bottom_sheet.j.c(dVar, c19758a.f20815a, true, 0, 0, 0, 120);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
                            Button button = (Button) viewInflate.findViewById(R.id.primary_button);
                            Button button2 = (Button) viewInflate.findViewById(R.id.secondary_button);
                            I5.a(textView2, c19758a.f20816b, false);
                            button.setAppearanceFromAttr(c19758a.f20821g);
                            com.avito.android.lib.design.button.b.a(button, c19758a.f20817c, false);
                            Integer num = c19758a.f20822h;
                            if (num != null) {
                                Button.g(button, C35835l0.h(num.intValue(), dVar.getContext()), null, false, null, 14);
                            }
                            com.avito.android.lib.design.button.b.a(button2, c19758a.f20818d, false);
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i14) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i132) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            com.avito.android.lib.util.g.a(dVar);
                            editInfoFragment.f298748E0 = dVar;
                            break;
                        }
                        break;
                    case 3:
                        if (obj != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = editInfoFragment.f298748E0;
                            if (dVar2 != null) {
                                dVar2.r();
                                break;
                            }
                        } else {
                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str != null) {
                            C47313c c47313c6 = editInfoFragment.f298760y0;
                            n<Object> nVar10 = EditInfoFragment.f298743G0[2];
                            ((TextView) c47313c6.a()).setText(str);
                            break;
                        } else {
                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                            break;
                        }
                }
            }
        });
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar4 = this.f298751p0;
        if (kVar4 == null) {
            kVar4 = null;
        }
        final int i14 = 2;
        kVar4.getF299142i0().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.tariff_lf.edit_info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditInfoFragment f298770c;

            {
                this.f298770c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                final int i132 = 1;
                final int i142 = 0;
                EditInfoFragment editInfoFragment = this.f298770c;
                switch (i14) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.android.recycler.data_aware.c cVar = editInfoFragment.f298750o0;
                            (cVar != null ? cVar : null).c(new UV0.c(list));
                            break;
                        } else {
                            EditInfoFragment.a aVar = EditInfoFragment.f298742F0;
                            break;
                        }
                    case 1:
                        ZC0.e eVar = (ZC0.e) obj;
                        EditInfoFragment.a aVar2 = EditInfoFragment.f298742F0;
                        if (eVar != null) {
                            editInfoFragment.f298746C0.f178156a = new UV0.c(eVar.f19980b);
                            ZC0.b bVar = editInfoFragment.f298747D0;
                            if (bVar != null) {
                                bVar.d();
                            }
                            c.i iVarJ = editInfoFragment.s5().j(eVar.f19981c);
                            if (iVarJ != null) {
                                iVarJ.b();
                                break;
                            }
                        }
                        break;
                    case 2:
                        final C19758a c19758a = (C19758a) obj;
                        EditInfoFragment.a aVar3 = EditInfoFragment.f298742F0;
                        if (c19758a != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(editInfoFragment.requireContext(), 0, 2, null);
                            View viewInflate = View.inflate(dVar.getContext(), R.layout.bottom_sheet_layout_info, null);
                            dVar.G(viewInflate, true);
                            com.avito.android.lib.design.bottom_sheet.j.c(dVar, c19758a.f20815a, true, 0, 0, 0, 120);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
                            Button button = (Button) viewInflate.findViewById(R.id.primary_button);
                            Button button2 = (Button) viewInflate.findViewById(R.id.secondary_button);
                            I5.a(textView2, c19758a.f20816b, false);
                            button.setAppearanceFromAttr(c19758a.f20821g);
                            com.avito.android.lib.design.button.b.a(button, c19758a.f20817c, false);
                            Integer num = c19758a.f20822h;
                            if (num != null) {
                                Button.g(button, C35835l0.h(num.intValue(), dVar.getContext()), null, false, null, 14);
                            }
                            com.avito.android.lib.design.button.b.a(button2, c19758a.f20818d, false);
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i142) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i132) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            com.avito.android.lib.util.g.a(dVar);
                            editInfoFragment.f298748E0 = dVar;
                            break;
                        }
                        break;
                    case 3:
                        if (obj != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = editInfoFragment.f298748E0;
                            if (dVar2 != null) {
                                dVar2.r();
                                break;
                            }
                        } else {
                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str != null) {
                            C47313c c47313c6 = editInfoFragment.f298760y0;
                            n<Object> nVar10 = EditInfoFragment.f298743G0[2];
                            ((TextView) c47313c6.a()).setText(str);
                            break;
                        } else {
                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                            break;
                        }
                }
            }
        });
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar5 = this.f298751p0;
        if (kVar5 == null) {
            kVar5 = null;
        }
        final int i15 = 3;
        kVar5.getF299143j0().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.tariff_lf.edit_info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditInfoFragment f298770c;

            {
                this.f298770c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                final int i132 = 1;
                final int i142 = 0;
                EditInfoFragment editInfoFragment = this.f298770c;
                switch (i15) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.android.recycler.data_aware.c cVar = editInfoFragment.f298750o0;
                            (cVar != null ? cVar : null).c(new UV0.c(list));
                            break;
                        } else {
                            EditInfoFragment.a aVar = EditInfoFragment.f298742F0;
                            break;
                        }
                    case 1:
                        ZC0.e eVar = (ZC0.e) obj;
                        EditInfoFragment.a aVar2 = EditInfoFragment.f298742F0;
                        if (eVar != null) {
                            editInfoFragment.f298746C0.f178156a = new UV0.c(eVar.f19980b);
                            ZC0.b bVar = editInfoFragment.f298747D0;
                            if (bVar != null) {
                                bVar.d();
                            }
                            c.i iVarJ = editInfoFragment.s5().j(eVar.f19981c);
                            if (iVarJ != null) {
                                iVarJ.b();
                                break;
                            }
                        }
                        break;
                    case 2:
                        final C19758a c19758a = (C19758a) obj;
                        EditInfoFragment.a aVar3 = EditInfoFragment.f298742F0;
                        if (c19758a != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(editInfoFragment.requireContext(), 0, 2, null);
                            View viewInflate = View.inflate(dVar.getContext(), R.layout.bottom_sheet_layout_info, null);
                            dVar.G(viewInflate, true);
                            com.avito.android.lib.design.bottom_sheet.j.c(dVar, c19758a.f20815a, true, 0, 0, 0, 120);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
                            Button button = (Button) viewInflate.findViewById(R.id.primary_button);
                            Button button2 = (Button) viewInflate.findViewById(R.id.secondary_button);
                            I5.a(textView2, c19758a.f20816b, false);
                            button.setAppearanceFromAttr(c19758a.f20821g);
                            com.avito.android.lib.design.button.b.a(button, c19758a.f20817c, false);
                            Integer num = c19758a.f20822h;
                            if (num != null) {
                                Button.g(button, C35835l0.h(num.intValue(), dVar.getContext()), null, false, null, 14);
                            }
                            com.avito.android.lib.design.button.b.a(button2, c19758a.f20818d, false);
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i142) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i132) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            com.avito.android.lib.util.g.a(dVar);
                            editInfoFragment.f298748E0 = dVar;
                            break;
                        }
                        break;
                    case 3:
                        if (obj != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = editInfoFragment.f298748E0;
                            if (dVar2 != null) {
                                dVar2.r();
                                break;
                            }
                        } else {
                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str != null) {
                            C47313c c47313c6 = editInfoFragment.f298760y0;
                            n<Object> nVar10 = EditInfoFragment.f298743G0[2];
                            ((TextView) c47313c6.a()).setText(str);
                            break;
                        } else {
                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                            break;
                        }
                }
            }
        });
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar6 = this.f298751p0;
        if (kVar6 == null) {
            kVar6 = null;
        }
        final int i16 = 4;
        kVar6.getF299139f0().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.tariff_lf.edit_info.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ EditInfoFragment f298770c;

            {
                this.f298770c = this;
            }

            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                final int i132 = 1;
                final int i142 = 0;
                EditInfoFragment editInfoFragment = this.f298770c;
                switch (i16) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            com.avito.android.recycler.data_aware.c cVar = editInfoFragment.f298750o0;
                            (cVar != null ? cVar : null).c(new UV0.c(list));
                            break;
                        } else {
                            EditInfoFragment.a aVar = EditInfoFragment.f298742F0;
                            break;
                        }
                    case 1:
                        ZC0.e eVar = (ZC0.e) obj;
                        EditInfoFragment.a aVar2 = EditInfoFragment.f298742F0;
                        if (eVar != null) {
                            editInfoFragment.f298746C0.f178156a = new UV0.c(eVar.f19980b);
                            ZC0.b bVar = editInfoFragment.f298747D0;
                            if (bVar != null) {
                                bVar.d();
                            }
                            c.i iVarJ = editInfoFragment.s5().j(eVar.f19981c);
                            if (iVarJ != null) {
                                iVarJ.b();
                                break;
                            }
                        }
                        break;
                    case 2:
                        final C19758a c19758a = (C19758a) obj;
                        EditInfoFragment.a aVar3 = EditInfoFragment.f298742F0;
                        if (c19758a != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(editInfoFragment.requireContext(), 0, 2, null);
                            View viewInflate = View.inflate(dVar.getContext(), R.layout.bottom_sheet_layout_info, null);
                            dVar.G(viewInflate, true);
                            com.avito.android.lib.design.bottom_sheet.j.c(dVar, c19758a.f20815a, true, 0, 0, 0, 120);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
                            Button button = (Button) viewInflate.findViewById(R.id.primary_button);
                            Button button2 = (Button) viewInflate.findViewById(R.id.secondary_button);
                            I5.a(textView2, c19758a.f20816b, false);
                            button.setAppearanceFromAttr(c19758a.f20821g);
                            com.avito.android.lib.design.button.b.a(button, c19758a.f20817c, false);
                            Integer num = c19758a.f20822h;
                            if (num != null) {
                                Button.g(button, C35835l0.h(num.intValue(), dVar.getContext()), null, false, null, 14);
                            }
                            com.avito.android.lib.design.button.b.a(button2, c19758a.f20818d, false);
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i142) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.c
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C19758a c19758a2 = c19758a;
                                    switch (i132) {
                                        case 0:
                                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar3 = c19758a2.f20819e;
                                            if (lVar3 != null) {
                                                lVar3.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                        default:
                                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                                            Y41.l<G0, G0> lVar4 = c19758a2.f20820f;
                                            if (lVar4 != null) {
                                                lVar4.invoke(G0.f406611a);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            com.avito.android.lib.util.g.a(dVar);
                            editInfoFragment.f298748E0 = dVar;
                            break;
                        }
                        break;
                    case 3:
                        if (obj != null) {
                            com.avito.android.lib.design.bottom_sheet.d dVar2 = editInfoFragment.f298748E0;
                            if (dVar2 != null) {
                                dVar2.r();
                                break;
                            }
                        } else {
                            EditInfoFragment.a aVar4 = EditInfoFragment.f298742F0;
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str != null) {
                            C47313c c47313c6 = editInfoFragment.f298760y0;
                            n<Object> nVar10 = EditInfoFragment.f298743G0[2];
                            ((TextView) c47313c6.a()).setText(str);
                            break;
                        } else {
                            EditInfoFragment.a aVar5 = EditInfoFragment.f298742F0;
                            break;
                        }
                }
            }
        });
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar7 = this.f298751p0;
        if (kVar7 == null) {
            kVar7 = null;
        }
        kVar7.k0().observe(getViewLifecycleOwner(), new h.a(new com.avito.android.tariff_lf.edit_info.e(this)));
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar8 = this.f298751p0;
        if (kVar8 == null) {
            kVar8 = null;
        }
        kVar8.getF299144k0().observe(getViewLifecycleOwner(), new h.a(new f(this)));
        com.avito.android.tariff_lf.edit_info.viewmodel.k kVar9 = this.f298751p0;
        if (kVar9 == null) {
            kVar9 = null;
        }
        kVar9.getF299141h0().observe(getViewLifecycleOwner(), new h.a(new g(this)));
        ScreenPerformanceTracker screenPerformanceTracker = this.f298757v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final com.avito.android.progress_overlay.l q5() {
        C47313c c47313c = this.f298761z0;
        n<Object> nVar = f298743G0[3];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final Banner r5() {
        C47313c c47313c = this.f298745B0;
        n<Object> nVar = f298743G0[5];
        return (Banner) c47313c.a();
    }

    public final AvitoTabLayout s5() {
        C47313c c47313c = this.f298744A0;
        n<Object> nVar = f298743G0[4];
        return (AvitoTabLayout) c47313c.a();
    }

    /* compiled from: EditInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_lf/edit_info/EditInfoFragment$e", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements c.f {
        public e() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@k c.i iVar) {
            com.avito.android.tariff_lf.edit_info.viewmodel.k kVar = EditInfoFragment.this.f298751p0;
            if (kVar == null) {
                kVar = null;
            }
            kVar.W7(iVar.f180895d);
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@l c.i iVar) {
        }
    }
}
