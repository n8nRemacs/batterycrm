package com.avito.android.search.filter.location_filter;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.GeoFiltersScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.search.filter.location_filter.di.j;
import com.avito.android.search.filter.location_filter.f;
import com.avito.android.select.SelectResult;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import oW.InterfaceC44697a;
import ur.InterfaceC49101b;

/* compiled from: LocationFiltersDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/search/filter/location_filter/LocationFiltersDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/search/filter/location_filter/f$b;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationFiltersDialogFragment extends BaseDialogFragment implements com.avito.android.ui.a, f.b, InterfaceC33034d.b, InterfaceC33034d.c, InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public InteractorState f263439h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f263440i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f263441j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f263442k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public f f263443l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f263444m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f263445n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f263446o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.new_metro.j f263447p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.new_districts.e f263448q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.suggest_addresses.g f263449r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f263450s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.search.filter.tracker.a f263451t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f263452u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final Handler f263453v0;

    /* renamed from: w0, reason: collision with root package name */
    public u f263454w0;

    /* compiled from: LocationFiltersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f263455l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            return G0.f406611a;
        }
    }

    /* compiled from: LocationFiltersDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f263456l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            return G0.f406611a;
        }
    }

    public LocationFiltersDialogFragment() {
        super(0, 1, null);
        this.f263453v0 = new Handler(Looper.getMainLooper());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e(requireActivity());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f263444m0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.d(str);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        u uVar = this.f263454w0;
        fVar.h((uVar != null ? uVar : null).getF263694a());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = this.f263442k0;
        final Location location = null;
        final Location location2 = null;
        ArrayList parcelableArrayListExtra = null;
        SelectResult selectResult = null;
        Radius radius = null;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(i12, i13, intent);
        if (i13 == -1) {
            Handler handler = this.f263453v0;
            if (i12 == 1) {
                if (intent != null) {
                    location = (Location) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location"));
                }
                final int i14 = 0;
                handler.post(new Runnable(this) { // from class: com.avito.android.search.filter.location_filter.b

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ LocationFiltersDialogFragment f263468c;

                    {
                        this.f263468c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                f fVar = this.f263468c.f263443l0;
                                if (fVar == null) {
                                    fVar = null;
                                }
                                fVar.m(location);
                                break;
                            default:
                                f fVar2 = this.f263468c.f263443l0;
                                if (fVar2 == null) {
                                    fVar2 = null;
                                }
                                fVar2.l(location);
                                break;
                        }
                    }
                });
                return;
            }
            if (i12 == 2) {
                if (intent != null) {
                    radius = (Radius) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_RADIUS_RESULT", Radius.class) : intent.getParcelableExtra("EXTRA_RADIUS_RESULT"));
                }
                handler.post(new RunnableC34589p(7, this, radius));
                return;
            }
            if (i12 == 3) {
                if (intent != null) {
                    selectResult = (SelectResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("select_result", SelectResult.class) : intent.getParcelableExtra("select_result"));
                }
                if (selectResult != null) {
                    handler.post(new RunnableC34589p(6, this, selectResult));
                    return;
                }
                return;
            }
            if (i12 == 4) {
                if (intent != null) {
                    parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("suggest_addresses", SuggestAddress.class) : intent.getParcelableArrayListExtra("suggest_addresses");
                }
                handler.post(new RunnableC34589p(5, this, parcelableArrayListExtra));
            } else {
                if (i12 != 5) {
                    return;
                }
                if (intent != null) {
                    location2 = (Location) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location"));
                }
                final int i15 = 1;
                handler.post(new Runnable(this) { // from class: com.avito.android.search.filter.location_filter.b

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ LocationFiltersDialogFragment f263468c;

                    {
                        this.f263468c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                f fVar = this.f263468c.f263443l0;
                                if (fVar == null) {
                                    fVar = null;
                                }
                                fVar.m(location2);
                                break;
                            default:
                                f fVar2 = this.f263468c.f263443l0;
                                if (fVar2 == null) {
                                    fVar2 = null;
                                }
                                fVar2.l(location2);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        Kundle kundle;
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        Arguments arguments = (Arguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("location_filters_args", Arguments.class) : bundleRequireArguments.getParcelable("location_filters_args"));
        if (arguments == null) {
            throw new IllegalStateException("Need arguments");
        }
        boolean z12 = bundle == null;
        Bundle bundle2 = z12 ? Bundle.EMPTY : ((com.avito.android.search.filter.di.n) C29972i.a(C29972i.b(this), com.avito.android.search.filter.di.n.class)).Je().f263292c;
        if (z12) {
            InteractorState interactorState = this.f263439h0;
            Kundle kundle2 = new Kundle();
            kundle2.j(interactorState != null ? interactorState.f263432b : null, "location_info");
            kundle2.j(interactorState != null ? interactorState.f263433c : null, "top_location");
            kundle2.j(interactorState != null ? interactorState.f263434d : null, "parameters_tree");
            kundle2.j(interactorState != null ? interactorState.f263435e : null, ServiceTransportationWidget.LocationField.COORDINATES);
            kundle2.h(interactorState != null ? interactorState.f263437g : null, "last_updates_form");
            kundle2.j(interactorState != null ? interactorState.f263436f : null, "last_counter_and_map_button");
            kundle2.j(interactorState != null ? interactorState.f263438h : null, "last_override_params");
            kundle = kundle2;
        } else {
            kundle = ((com.avito.android.search.filter.di.n) C29972i.a(C29972i.b(this), com.avito.android.search.filter.di.n.class)).Je().f263293d;
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        j.a aVarA = com.avito.android.search.filter.location_filter.di.a.a();
        com.avito.android.search.filter.di.n nVar = (com.avito.android.search.filter.di.n) C29972i.a(C29972i.b(this), com.avito.android.search.filter.di.n.class);
        InterfaceC44697a interfaceC44697a = (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Resources resources = getResources();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        com.avito.android.analytics.screens.r rVarB = com.avito.android.analytics.screens.s.b(this);
        SearchParams searchParams = arguments.f263428b;
        aVarA.a(nVar, interfaceC39417aB, interfaceC44697a, bundle2, kundle, resources, activityC22955mRequireActivity, this, this, rVarB, searchParams, searchParams.getArea(), this, arguments.f263430d, GeoFiltersScreen.f90361d, K2.h(requireActivity()), arguments.f263431e).a(this);
        com.avito.android.search.filter.tracker.a aVar = this.f263451t0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a(fA2.b());
        com.avito.android.search.filter.tracker.a aVar2 = this.f263451t0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.l(d5(), this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        u vVar;
        com.avito.android.search.filter.tracker.a aVar = this.f263451t0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.e();
        com.avito.android.deeplink_handler.view.d dVar = this.f263442k0;
        (dVar != null ? dVar : null).b(this, b5(), c5(), new com.avito.android.deeplink_handler.view.impl.h(requireActivity()), new d.a(this));
        Context contextA = com.avito.android.lib.deprecated_design.f.a(requireContext(), Theme.AVITO_RE_23.getResName());
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(contextA, R.style.Re23_BottomSheet_Default);
        dVar2.B(R.layout.location_filter_dialog, R.layout.main_button, a.f263455l, b.f263456l, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar2, getResources().getString(R.string.search_filter_where_to_search), true, true, 2);
        dVar2.setCancelable(true);
        dVar2.setCanceledOnTouchOutside(true);
        dVar2.S(C35835l0.g(contextA).y);
        dVar2.K(true);
        InterfaceC49101b interfaceC49101b = this.f263452u0;
        if (interfaceC49101b == null) {
            interfaceC49101b = null;
        }
        if (interfaceC49101b.c()) {
            ViewGroup viewGroup = (ViewGroup) dVar2.findViewById(R.id.bottom_sheet);
            com.avito.konveyor.adapter.j jVar = this.f263440i0;
            if (jVar == null) {
                jVar = null;
            }
            InterfaceC28373a interfaceC28373a = this.f263450s0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            vVar = new com.avito.android.search.filter.location_filter.a(viewGroup, jVar, interfaceC28373a, (Button) dVar2.findViewById(R.id.main_button));
        } else {
            ViewGroup viewGroup2 = (ViewGroup) dVar2.findViewById(R.id.bottom_sheet);
            com.avito.konveyor.adapter.j jVar2 = this.f263440i0;
            if (jVar2 == null) {
                jVar2 = null;
            }
            InterfaceC28373a interfaceC28373a2 = this.f263450s0;
            if (interfaceC28373a2 == null) {
                interfaceC28373a2 = null;
            }
            vVar = new v(viewGroup2, jVar2, interfaceC28373a2, (Button) dVar2.findViewById(R.id.main_button));
        }
        this.f263454w0 = vVar;
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.i(vVar);
        f fVar2 = this.f263443l0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        fVar2.n(this);
        com.avito.android.search.filter.tracker.a aVar2 = this.f263451t0;
        (aVar2 != null ? aVar2 : null).d();
        return dVar2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e0();
        InterfaceC33034d interfaceC33034d = this.f263441j0;
        (interfaceC33034d != null ? interfaceC33034d : null).e0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        SearchParams searchParamsF = fVar.f();
        f fVar2 = this.f263443l0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        ParametersTreeWithAdditional parametersTreeWithAdditionalP = fVar2.p();
        f fVar3 = this.f263443l0;
        bundle.putParcelable("location_filter_result_key", new ResultArguments(searchParamsF, parametersTreeWithAdditionalP, (fVar3 != null ? fVar3 : null).k()));
        G0 g02 = G0.f406611a;
        parentFragmentManager.o0(bundle, "location_filter_request_key");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.b();
        f fVar2 = this.f263443l0;
        (fVar2 != null ? fVar2 : null).c(requireContext());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(requireContext());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = this.f263443l0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.d0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33034d interfaceC33034d = this.f263441j0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
        View view = getView();
        if (view != null) {
            InterfaceC33034d interfaceC33034d2 = this.f263441j0;
            if (interfaceC33034d2 == null) {
                interfaceC33034d2 = null;
            }
            interfaceC33034d2.e(view);
        }
        f fVar = this.f263443l0;
        (fVar != null ? fVar : null).n(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33034d interfaceC33034d = this.f263441j0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
        f fVar = this.f263443l0;
        (fVar != null ? fVar : null).c0();
        super.onStop();
    }
}
