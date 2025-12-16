package com.avito.android.messenger.map.viewing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.di.C29972i;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.map.viewing.di.b;
import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lW.C43692b;

/* compiled from: PlatformMapFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/map/viewing/PlatformMapFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/messenger/map/e;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class PlatformMapFragment extends BaseFragment implements com.avito.android.messenger.map.e, InterfaceC33034d.c, InterfaceC33034d.b, InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f196793y0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    public com.avito.android.messenger.map.viewing.view.f f196794n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f196795o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public y f196796p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public AvitoMapAttachHelper f196797q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C33035e f196798r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.p f196799s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C43692b f196800t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f196801u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f196802v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196803w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f196804x0;

    /* compiled from: PlatformMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/map/viewing/PlatformMapFragment$a;", "", "<init>", "()V", "", "INITIAL_GEO_MARKERS_KEY", "Ljava/lang/String;", "LOCK_BOTTOM_SHEET_KEY", "MARKERS_REQUEST_KEY", "TAG", "TITLE_KEY", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PlatformMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ActivityC22955m activityC22955mL1 = PlatformMapFragment.this.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    public PlatformMapFragment() {
        super(0, 1, null);
        this.f196803w0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        y yVar = this.f196796p0;
        if (yVar == null) {
            yVar = null;
        }
        C33035e c33035e = this.f196798r0;
        yVar.x((c33035e != null ? c33035e : null).f215114a.getF215135c());
    }

    @Override // com.avito.android.messenger.map.e
    public final void L2() {
        if (!this.f196804x0) {
            V2.f318762a.i("PlatformMapFragment", "onLocationEnabled() && requestLocationWhenItsEnabled == false => do nothing", null);
            return;
        }
        V2.f318762a.i("PlatformMapFragment", "onLocationEnabled() && requestLocationWhenItsEnabled == true => presenter.myLocationButtonClicked()", null);
        y yVar = this.f196796p0;
        if (yVar == null) {
            yVar = null;
        }
        C33035e c33035e = this.f196798r0;
        yVar.x((c33035e != null ? c33035e : null).f215114a.getF215135c());
        this.f196804x0 = false;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f196795o0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        if (str != null) {
            C43692b c43692b = this.f196800t0;
            if (c43692b == null) {
                c43692b = null;
            }
            c43692b.f(null, str);
            com.avito.android.messenger.map.viewing.view.f fVar = this.f196794n0;
            L5.a((fVar != null ? fVar : null).f196895p, R.string.location_not_found, 0).show();
        }
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        C43692b c43692b = this.f196800t0;
        if (c43692b == null) {
            c43692b = null;
        }
        c43692b.f(null, "PERMISSION DENIED");
        C33035e c33035e = this.f196798r0;
        this.f196803w0.b((c33035e != null ? c33035e : null).h());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(R.layout.messenger_platform_map_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.avito.android.messenger.map.viewing.view.f fVar = this.f196794n0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f196884e = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C33035e c33035e = this.f196798r0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.f215119f = null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        com.avito.android.messenger.map.viewing.view.f fVar = this.f196794n0;
        if (fVar == null) {
            fVar = null;
        }
        AvitoMap avitoMap = fVar.f196884e;
        if (avitoMap != null) {
            avitoMap.onLowMemory();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f196802v0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("PlatformMapFragment");
        super.onPause();
        C43692b c43692b = this.f196800t0;
        if (c43692b == null) {
            c43692b = null;
        }
        c43692b.g();
        com.avito.android.location.find.p pVar = this.f196799s0;
        (pVar != null ? pVar : null).c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.location.find.p pVar = this.f196799s0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.a(requireContext());
        InterfaceC32572u interfaceC32572u = this.f196802v0;
        (interfaceC32572u != null ? interfaceC32572u : null).a("PlatformMapFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        bundle.putBoolean("request_location_when_its_enabled", this.f196804x0);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C33035e c33035e = this.f196798r0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.f(this, this, this);
        y yVar = this.f196796p0;
        if (yVar == null) {
            yVar = null;
        }
        yVar.D6().observe(getViewLifecycleOwner(), new C32552e(this));
        y yVar2 = this.f196796p0;
        if (yVar2 == null) {
            yVar2 = null;
        }
        yVar2.f6().observe(getViewLifecycleOwner(), new C32553f(this));
        y yVar3 = this.f196796p0;
        if (yVar3 == null) {
            yVar3 = null;
        }
        yVar3.c1().observe(getViewLifecycleOwner(), new C32554g(this));
        com.avito.android.messenger.map.viewing.view.f fVar = this.f196794n0;
        if (fVar == null) {
            fVar = null;
        }
        com.jakewharton.rxrelay3.b<Boolean> bVar = fVar.f196890k;
        InterfaceC35745a5 interfaceC35745a5 = this.f196801u0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        io.reactivex.rxjava3.core.z<R> zVarU = bVar.j0(interfaceC35745a5.e()).N(C32559l.f196850b).z0(1L).u(new m(this));
        InterfaceC35745a5 interfaceC35745a52 = this.f196801u0;
        if (interfaceC35745a52 == null) {
            interfaceC35745a52 = null;
        }
        I0 i0J0 = zVarU.j0(interfaceC35745a52.e());
        InterfaceC35745a5 interfaceC35745a53 = this.f196801u0;
        if (interfaceC35745a53 == null) {
            interfaceC35745a53 = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = i0J0.x0(interfaceC35745a53.e()).t0(new n(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f196803w0;
        cVar.b(dVarT0);
        com.avito.android.messenger.map.viewing.view.f fVar2 = this.f196794n0;
        if (fVar2 == null) {
            fVar2 = null;
        }
        com.jakewharton.rxrelay3.c<com.avito.android.messenger.map.viewing.view.a> cVar2 = fVar2.f196892m;
        InterfaceC35745a5 interfaceC35745a54 = this.f196801u0;
        if (interfaceC35745a54 == null) {
            interfaceC35745a54 = null;
        }
        cVar.b(cVar2.j0(interfaceC35745a54.e()).t0(new o(this)));
        com.avito.android.messenger.map.viewing.view.f fVar3 = this.f196794n0;
        if (fVar3 == null) {
            fVar3 = null;
        }
        com.jakewharton.rxrelay3.c<G0> cVar3 = fVar3.f196893n;
        InterfaceC35745a5 interfaceC35745a55 = this.f196801u0;
        if (interfaceC35745a55 == null) {
            interfaceC35745a55 = null;
        }
        cVar.b(cVar3.j0(interfaceC35745a55.e()).t0(new p(this)));
        com.avito.android.messenger.map.viewing.view.f fVar4 = this.f196794n0;
        if (fVar4 == null) {
            fVar4 = null;
        }
        com.jakewharton.rxrelay3.c<AvitoMapCameraPosition> cVar4 = fVar4.f196896q;
        InterfaceC35745a5 interfaceC35745a56 = this.f196801u0;
        if (interfaceC35745a56 == null) {
            interfaceC35745a56 = null;
        }
        cVar.b(cVar4.j0(interfaceC35745a56.e()).t0(new q(this)));
        com.avito.android.messenger.map.viewing.view.f fVar5 = this.f196794n0;
        if (fVar5 == null) {
            fVar5 = null;
        }
        com.jakewharton.rxrelay3.c<G0> cVar5 = fVar5.f196897r;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar5.getClass();
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        A1 a1C0 = cVar5.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a57 = this.f196801u0;
        if (interfaceC35745a57 == null) {
            interfaceC35745a57 = null;
        }
        cVar.b(a1C0.j0(interfaceC35745a57.e()).v0(new C32555h(this), new C32556i(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
        com.avito.android.messenger.map.viewing.view.f fVar6 = this.f196794n0;
        if (fVar6 == null) {
            fVar6 = null;
        }
        io.reactivex.rxjava3.core.z<G0> zVar = fVar6.f196898s;
        zVar.getClass();
        A1 a1C02 = zVar.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a58 = this.f196801u0;
        if (interfaceC35745a58 == null) {
            interfaceC35745a58 = null;
        }
        cVar.b(a1C02.j0(interfaceC35745a58.e()).t0(new C32557j(this)));
        com.avito.android.messenger.map.viewing.view.f fVar7 = this.f196794n0;
        if (fVar7 == null) {
            fVar7 = null;
        }
        io.reactivex.rxjava3.core.z<BottomSheet.d> zVar2 = fVar7.f196887h.f196461o;
        zVar2.getClass();
        cVar.b(zVar2.D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new C32558k(this)));
        com.avito.android.messenger.map.viewing.view.f fVar8 = this.f196794n0;
        AvitoMap avitoMap = (fVar8 != null ? fVar8 : null).f196884e;
        if (avitoMap != null) {
            avitoMap.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C33035e c33035e = this.f196798r0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.a();
        this.f196803w0.e();
        com.avito.android.messenger.map.viewing.view.f fVar = this.f196794n0;
        if (fVar == null) {
            fVar = null;
        }
        AvitoMap avitoMap = fVar.f196884e;
        if (avitoMap != null) {
            AvitoMap.DefaultImpls.onStop$default(avitoMap, false, 1, null);
        }
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("title")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        boolean z12 = arguments2 != null ? arguments2.getBoolean("lock_bottom_sheet", false) : false;
        View viewFindViewById = view.findViewById(R.id.navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        NavBar.e(navBar, string, 0, 6);
        navBar.c(R.attr.ic_close24, new b());
        AvitoMapAttachHelper avitoMapAttachHelper = this.f196797q0;
        if (avitoMapAttachHelper == null) {
            avitoMapAttachHelper = null;
        }
        this.f196794n0 = new com.avito.android.messenger.map.viewing.view.f(view, z12, avitoMapAttachHelper, getParentFragmentManager());
        this.f196804x0 = bundle != null ? bundle.getBoolean("request_location_when_its_enabled") : false;
        C33035e c33035e = this.f196798r0;
        (c33035e != null ? c33035e : null).f215119f = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        Parcelable[] parcelableArray = arguments != null ? arguments.getParcelableArray("initial_pins") : null;
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray == null) {
            parcelableArray = new Parcelable[0];
        }
        Bundle arguments2 = getArguments();
        MarkersRequest markersRequest = arguments2 != null ? (MarkersRequest) arguments2.getParcelable("markers_request") : null;
        MarkersRequest markersRequest2 = markersRequest != null ? markersRequest : null;
        int length = parcelableArray.length;
        GeoMarker[] geoMarkerArr = new GeoMarker[length];
        for (int i12 = 0; i12 < length; i12++) {
            geoMarkerArr[i12] = parcelableArray[i12];
        }
        b.a aVarA = com.avito.android.messenger.map.viewing.di.a.a();
        aVarA.g((com.avito.android.messenger.map.viewing.di.c) C29972i.a(C29972i.b(this), com.avito.android.messenger.map.viewing.di.c.class));
        aVarA.a(cv.c.b(this));
        aVarA.h(this);
        aVarA.d(requireActivity());
        aVarA.e(getParentFragmentManager());
        aVarA.b(getResources());
        aVarA.f(geoMarkerArr);
        aVarA.c(markersRequest2);
        aVarA.build().a(this);
    }
}
