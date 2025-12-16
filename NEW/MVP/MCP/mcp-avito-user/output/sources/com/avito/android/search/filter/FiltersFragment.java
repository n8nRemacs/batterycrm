package com.avito.android.search.filter;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C22823h0;
import androidx.core.view.G0;
import androidx.fragment.app.ActivityC22955m;
import cE.C27025b;
import com.avito.android.I1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.FiltersScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Radius;
import com.avito.android.search.filter.FiltersFragment;
import com.avito.android.search.filter.InterfaceC34566e0;
import com.avito.android.search.filter.di.e;
import com.avito.android.search.filter.location_filter.ResultArguments;
import com.avito.android.select.Arguments;
import com.avito.android.select.ResetResult;
import com.avito.android.select.SelectResult;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.A6;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lD.C43617a;
import oW.InterfaceC44697a;

/* compiled from: FiltersFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/search/filter/FiltersFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/search/filter/e0$b;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "Lcom/avito/android/bottom_sheet_group/v;", "Lcom/avito/android/select/group_clearance_select/f;", "<init>", "()V", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersFragment extends TabBaseFragment implements InterfaceC34566e0.b, com.avito.android.ui.a, com.avito.android.ui.fragments.c, InterfaceC33034d.b, InterfaceC33034d.c, InterfaceC28477j.b, com.avito.android.select.p, com.avito.android.bottom_sheet_group.v, com.avito.android.select.group_clearance_select.f {

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final a f261828O0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.new_metro.j f261829A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f261830B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f261831C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.guests_selector.d f261832D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f261833E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.search.filter.tracker.a f261834F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f261835G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.search.filter.adapter.double_input.u f261836H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f261837I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public Zp0.d f261838J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f261839K0;

    /* renamed from: L0, reason: collision with root package name */
    public k1 f261840L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final Handler f261841M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f261842N0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC34566e0 f261843t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public FiltersInteractor f261844u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C27025b f261845v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public C43617a f261846w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.C0 f261847x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public I1 f261848y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f261849z0;

    /* compiled from: FiltersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/FiltersFragment$a;", "", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: FiltersFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.search.filter.FiltersFragment$a$a, reason: collision with other inner class name */
        public static final class C7830a extends kotlin.jvm.internal.N implements Y41.l<Bundle, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ FiltersArguments f261850l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7830a(FiltersArguments filtersArguments) {
                super(1);
                this.f261850l = filtersArguments;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(Bundle bundle) {
                bundle.putParcelable("filters_arguments", this.f261850l);
                return kotlin.G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static FiltersFragment a(@Y61.k FiltersArguments filtersArguments) {
            FiltersFragment filtersFragment = new FiltersFragment();
            C35966w1.a(filtersFragment, -1, new C7830a(filtersArguments));
            return filtersFragment;
        }

        public a() {
        }
    }

    public FiltersFragment() {
        super(0, 1, null);
        this.f261841M0 = new Handler(Looper.getMainLooper());
        this.f261842N0 = new NavigationState(false, null, 2, null);
    }

    public final void D5(@Y61.k Arguments arguments) {
        com.avito.android.select.bottom_sheet.c.a(this, arguments).show(getParentFragmentManager(), "TAG_SELECT_BOTTOM_SHEET");
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f261838J0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        FiltersInteractor filtersInteractor = this.f261844u0;
        if (filtersInteractor == null) {
            filtersInteractor = null;
        }
        filtersInteractor.e(requireActivity());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f261837I0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.search.filter.InterfaceC34566e0.b
    public final void Y1(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f261839K0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, "filters_fr_deep_link_req_key", null, 4);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        FiltersInteractor filtersInteractor = this.f261844u0;
        if (filtersInteractor == null) {
            filtersInteractor = null;
        }
        filtersInteractor.d(str);
    }

    @Override // com.avito.android.bottom_sheet_group.v
    public final void f(@Y61.k String str, @Y61.k Map<String, ? extends Set<String>> map) {
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.f(str, map);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final a.i f5() {
        return new C34556d1(requireView(), requireActivity());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        FiltersInteractor filtersInteractor = this.f261844u0;
        if (filtersInteractor == null) {
            filtersInteractor = null;
        }
        k1 k1Var = this.f261840L0;
        View view = (k1Var != null ? k1Var : null).f263369a;
        filtersInteractor.S();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.i0();
        return false;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.j(str, str2, list);
    }

    @Override // com.avito.android.select.group_clearance_select.f
    public final void l(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Map map) {
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.l(str, str2, str3, str4, map);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.select.group_clearance_select.f
    public final void n(@Y61.k String str, @Y61.k String str2) {
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.n(str, str2);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        SelectResult selectResult;
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1) {
            Handler handler = this.f261841M0;
            Object obj = null;
            if (i12 == 1) {
                if (intent != null) {
                    obj = (Location) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location"));
                }
                handler.post(new RunnableC28882d(29, this, obj));
                return;
            }
            if (i12 != 2) {
                if (i12 != 4) {
                    return;
                }
                if (intent != null) {
                    obj = (Radius) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_RADIUS_RESULT", Radius.class) : intent.getParcelableExtra("EXTRA_RADIUS_RESULT"));
                }
                handler.post(new RunnableC34589p(2, this, obj));
                return;
            }
            if (intent != null) {
                selectResult = (SelectResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("select_result", SelectResult.class) : intent.getParcelableExtra("select_result"));
            } else {
                selectResult = null;
            }
            if (selectResult != null) {
                handler.post(new RunnableC34589p(0, this, selectResult));
            }
            if (intent != null) {
                obj = (ResetResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_clear_result", ResetResult.class) : intent.getParcelableExtra("extra_clear_result"));
            }
            if (obj != null) {
                handler.post(new RunnableC34589p(1, this, obj));
            }
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        getChildFragmentManager().p0("location_filter_request_key", this, new androidx.fragment.app.C() { // from class: com.avito.android.search.filter.q
            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                FiltersFragment.a aVar = FiltersFragment.f261828O0;
                ResultArguments resultArguments = (ResultArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("location_filter_result_key", ResultArguments.class) : bundle2.getParcelable("location_filter_result_key"));
                FiltersFragment filtersFragment = this.f263793b;
                FiltersInteractor filtersInteractor = filtersFragment.f261844u0;
                if (filtersInteractor == null) {
                    filtersInteractor = null;
                }
                filtersInteractor.n(resultArguments != null ? resultArguments.f263458c : null);
                InterfaceC34566e0 interfaceC34566e0 = filtersFragment.f261843t0;
                if (interfaceC34566e0 == null) {
                    interfaceC34566e0 = null;
                }
                interfaceC34566e0.u(resultArguments != null ? resultArguments.f263459d : false);
                InterfaceC34566e0 interfaceC34566e02 = filtersFragment.f261843t0;
                (interfaceC34566e02 != null ? interfaceC34566e02 : null).a();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.search.filter.tracker.a aVar = this.f261834F0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.e();
        return layoutInflater.inflate(R.layout.filters, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        k1 k1Var = this.f261840L0;
        if (k1Var == null) {
            k1Var = null;
        }
        k1Var.f263378j.removeCallbacksAndMessages(null);
        o1 o1Var = k1Var.f263377i;
        A6.a(o1Var.f263739a.getViewTreeObserver(), new p1(o1Var));
        k1Var.f263374f.setOnClickListener(null);
        k1Var.f263375g.setOnClickListener(null);
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.e0();
        com.avito.android.search.filter.adapter.double_input.u uVar = this.f261836H0;
        if (uVar == null) {
            uVar = null;
        }
        uVar.onCleared();
        InterfaceC33034d interfaceC33034d = this.f261835G0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        this.f261841M0.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        FiltersInteractor filtersInteractor = this.f261844u0;
        if (filtersInteractor == null) {
            filtersInteractor = null;
        }
        filtersInteractor.b();
        FiltersInteractor filtersInteractor2 = this.f261844u0;
        (filtersInteractor2 != null ? filtersInteractor2 : null).c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FiltersInteractor filtersInteractor = this.f261844u0;
        if (filtersInteractor == null) {
            filtersInteractor = null;
        }
        filtersInteractor.a(requireContext());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.d0();
        z5(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33034d interfaceC33034d = this.f261835G0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
        View view = getView();
        if (view != null) {
            InterfaceC33034d interfaceC33034d2 = this.f261835G0;
            if (interfaceC33034d2 == null) {
                interfaceC33034d2 = null;
            }
            interfaceC33034d2.e(view);
        }
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        (interfaceC34566e0 != null ? interfaceC34566e0 : null).q(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33034d interfaceC33034d = this.f261835G0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        (interfaceC34566e0 != null ? interfaceC34566e0 : null).c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        ActivityC22955m activityC22955mL1;
        Window window;
        View decorView;
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f261849z0;
        if (jVar == null) {
            jVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f261833E0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        k1 k1Var = new k1(view, jVar, interfaceC28373a);
        this.f261840L0 = k1Var;
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.r(k1Var);
        com.avito.android.search.filter.tracker.a aVar = this.f261834F0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.d();
        com.avito.android.C0 c02 = this.f261847x0;
        com.avito.android.C0 c03 = c02 != null ? c02 : null;
        c03.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.C0.f67235e[0];
        if (!((Boolean) c03.f67236b.a().invoke()).booleanValue() || (activityC22955mL1 = l1()) == null || (window = activityC22955mL1.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        C22823h0.R(decorView, new b(decorView, this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            FiltersArguments filtersArguments = (FiltersArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("filters_arguments", FiltersArguments.class) : arguments.getParcelable("filters_arguments"));
            if (filtersArguments != null) {
                boolean z12 = bundle == null;
                Bundle bundle2 = (!z12 ? this : null) != null ? ((com.avito.android.search.filter.di.n) C29972i.a(C29972i.b(this), com.avito.android.search.filter.di.n.class)).Je().f263290a : null;
                Kundle kundle = (!z12 ? this : null) != null ? ((com.avito.android.search.filter.di.n) C29972i.a(C29972i.b(this), com.avito.android.search.filter.di.n.class)).Je().f263291b : null;
                com.avito.android.analytics.screens.D.f90335a.getClass();
                com.avito.android.analytics.screens.F fA2 = D.a.a();
                e.a aVarA = com.avito.android.search.filter.di.a.a();
                aVarA.j((com.avito.android.search.filter.di.n) C29972i.a(C29972i.b(this), com.avito.android.search.filter.di.n.class));
                aVarA.a(cv.c.b(this));
                aVarA.f((InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class));
                aVarA.q(bundle2);
                aVarA.v(filtersArguments.f261822e);
                aVarA.t(z12);
                aVarA.k(filtersArguments.f261825h);
                aVarA.b(getResources());
                aVarA.d(requireActivity());
                aVarA.g(this);
                aVarA.p(this);
                aVarA.w(this);
                aVarA.c(com.avito.android.analytics.screens.s.c(this));
                aVarA.o(filtersArguments.f261819b);
                aVarA.m(filtersArguments.f261823f);
                aVarA.i(filtersArguments.f261820c);
                aVarA.r(filtersArguments.f261824g);
                aVarA.l(filtersArguments.f261821d);
                aVarA.h(kundle);
                aVarA.x(filtersArguments.f261826i);
                aVarA.e(this);
                aVarA.s(FiltersScreen.f90358d);
                aVarA.n(filtersArguments.f261827j);
                aVarA.u(K2.h(requireActivity()));
                aVarA.build().a(this);
                com.avito.android.search.filter.tracker.a aVar = this.f261834F0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.a(fA2.b());
                com.avito.android.search.filter.tracker.a aVar2 = this.f261834F0;
                (aVar2 != null ? aVar2 : null).l(g5(), this);
                return;
            }
        }
        throw new IllegalArgumentException("FilterArguments must be specified");
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
        InterfaceC34566e0 interfaceC34566e0 = this.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.s(new ResetResult(str));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF220240E0() {
        return this.f261842N0;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    /* compiled from: FiltersFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/search/filter/FiltersFragment$b", "Landroidx/core/view/G0$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends G0.b {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f261851d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ FiltersFragment f261852e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, FiltersFragment filtersFragment) {
            super(0);
            this.f261851d = view;
            this.f261852e = filtersFragment;
        }

        @Override // androidx.core.view.G0.b
        public final void b(@Y61.k androidx.core.view.G0 g02) {
            androidx.core.view.J0 j0O = C22823h0.o(this.f261851d);
            boolean zP2 = j0O != null ? j0O.p(8) : false;
            InterfaceC34566e0 interfaceC34566e0 = this.f261852e.f261843t0;
            if (interfaceC34566e0 == null) {
                interfaceC34566e0 = null;
            }
            interfaceC34566e0.p(zP2);
        }

        @Override // androidx.core.view.G0.b
        @Y61.k
        public final androidx.core.view.J0 d(@Y61.k androidx.core.view.J0 j02, @Y61.k List<androidx.core.view.G0> list) {
            return j02;
        }
    }
}
