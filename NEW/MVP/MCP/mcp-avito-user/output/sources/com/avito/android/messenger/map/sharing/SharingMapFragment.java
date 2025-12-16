package com.avito.android.messenger.map.sharing;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.U0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.map.sharing.di.b;
import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggest;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lW.C43692b;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import z1.AbstractC50339a;

/* compiled from: SharingMapFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/map/sharing/SharingMapFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/messenger/map/e;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class SharingMapFragment extends BaseFragment implements com.avito.android.messenger.map.e, InterfaceC33034d.c, InterfaceC33034d.b, InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f196687G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196688A0;

    /* renamed from: B0, reason: collision with root package name */
    public String f196689B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public MessageBody.Location f196690C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public AvitoMapPoint f196691D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f196692E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f196693F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public w f196694n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.F f196695o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public U0 f196696p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f196697q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.p f196698r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public C33035e f196699s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C43692b f196700t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f196701u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f196702v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f196703w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public C47743i f196704x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final O0 f196705y0;

    /* renamed from: z0, reason: collision with root package name */
    public L f196706z0;

    /* compiled from: SharingMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/map/sharing/SharingMapFragment$a;", "", "<init>", "()V", "", "KEY_CHANNEL_ID", "Ljava/lang/String;", "KEY_INITIAL_POSITION", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SharingMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/avito_map/AvitoMapAttachHelper;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<AvitoMapAttachHelper> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final AvitoMapAttachHelper invoke() {
            U0 u02 = SharingMapFragment.this.f196696p0;
            if (u02 == null) {
                u02 = null;
            }
            return u02.v().invoke().booleanValue() ? new YandexAvitoMapAttachHelper(false, 1, null) : new GoogleAvitoMapAttachHelper();
        }
    }

    /* compiled from: SharingMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C47733d> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = SharingMapFragment.this.f196704x0;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: SharingMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ActivityC22955m activityC22955mL1 = SharingMapFragment.this.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f196710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f196710l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f196710l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SharingMapFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f196712l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f196712l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f196712l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f196713l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f196713l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f196713l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f196714l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f196714l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f196714l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public SharingMapFragment() {
        super(0, 1, null);
        e eVar = new e(new c());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f196705y0 = new O0(m0.f406844a.b(C47733d.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f196688A0 = new io.reactivex.rxjava3.disposables.c();
        this.f196692E0 = C42727D.c(new b());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        w wVar = this.f196694n0;
        if (wVar == null) {
            wVar = null;
        }
        C33035e c33035e = this.f196699s0;
        if (c33035e == null) {
            c33035e = null;
        }
        wVar.x(c33035e.f215114a.getF215135c());
        InterfaceC28373a interfaceC28373a = this.f196697q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        String str = this.f196689B0;
        interfaceC28373a.c(new com.avito.android.messenger.analytics.C(str != null ? str : null));
    }

    @Override // com.avito.android.messenger.map.e
    public final void L2() {
        if (!this.f196693F0) {
            V2.f318762a.i("SharingMapFragment", "onLocationEnabled() && requestLocationWhenItsEnabled == false => do nothing", null);
            return;
        }
        V2.f318762a.i("SharingMapFragment", "onLocationEnabled() && requestLocationWhenItsEnabled == true => presenter.myLocationButtonClicked()", null);
        w wVar = this.f196694n0;
        if (wVar == null) {
            wVar = null;
        }
        C33035e c33035e = this.f196699s0;
        wVar.x((c33035e != null ? c33035e : null).f215114a.getF215135c());
        this.f196693F0 = false;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        InterfaceC35845m2 interfaceC35845m2 = this.f196701u0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@Y61.l String str) {
        if (str != null) {
            C43692b c43692b = this.f196700t0;
            if (c43692b == null) {
                c43692b = null;
            }
            c43692b.f(null, str);
            L l12 = this.f196706z0;
            L5.a((l12 != null ? l12 : null).f196670e, R.string.location_not_found, 0).show();
        }
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        C43692b c43692b = this.f196700t0;
        if (c43692b == null) {
            c43692b = null;
        }
        c43692b.f(null, "PERMISSION DENIED");
        C33035e c33035e = this.f196699s0;
        this.f196688A0.b((c33035e != null ? c33035e : null).h());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (i13 != -1 || i12 != 1) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        GeoSearchSuggest geoSearchSuggest = intent != null ? (GeoSearchSuggest) intent.getParcelableExtra("selected_suggest") : null;
        if (geoSearchSuggest != null) {
            w wVar = this.f196694n0;
            (wVar != null ? wVar : null).l5(geoSearchSuggest);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(@Y61.k Menu menu, @Y61.k MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.messenger_sharing_map, menu);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        setHasOptionsMenu(true);
        return (ViewGroup) layoutInflater.inflate(R.layout.messenger_sharing_map_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        L l12 = this.f196706z0;
        if (l12 == null) {
            l12 = null;
        }
        l12.f196669d = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C33035e c33035e = this.f196699s0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.f215119f = null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        L l12 = this.f196706z0;
        if (l12 == null) {
            l12 = null;
        }
        AvitoMap avitoMap = l12.f196669d;
        if (avitoMap != null) {
            avitoMap.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.messenger_menu_geo_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        InterfaceC28373a interfaceC28373a = this.f196697q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        String str = this.f196689B0;
        if (str == null) {
            str = null;
        }
        interfaceC28373a.c(new com.avito.android.messenger.analytics.D(str, "geo_search"));
        com.avito.android.messenger.F f12 = this.f196695o0;
        if (f12 == null) {
            f12 = null;
        }
        String str2 = this.f196689B0;
        if (str2 == null) {
            str2 = null;
        }
        AvitoMapPoint avitoMapPoint = this.f196691D0;
        GeoPoint geoPoint = avitoMapPoint != null ? new GeoPoint(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude()) : null;
        MessageBody.Location location = this.f196690C0;
        startActivityForResult(f12.l(str2, "", geoPoint, location != null ? new GeoPoint(location.getLatitude(), location.getLongitude()) : null), 1);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f196703w0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("SharingMapFragment");
        super.onPause();
        C43692b c43692b = this.f196700t0;
        if (c43692b == null) {
            c43692b = null;
        }
        c43692b.g();
        com.avito.android.location.find.p pVar = this.f196698r0;
        (pVar != null ? pVar : null).c(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        com.avito.android.location.find.p pVar = this.f196698r0;
        if (pVar == null) {
            pVar = null;
        }
        pVar.a(requireContext());
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f196703w0;
        (interfaceC32572u != null ? interfaceC32572u : null).a("SharingMapFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        bundle.putBoolean("request_location_when_its_enabled", this.f196693F0);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C33035e c33035e = this.f196699s0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.f(this, this, this);
        View view = getView();
        if (view != null) {
            C33035e c33035e2 = this.f196699s0;
            if (c33035e2 == null) {
                c33035e2 = null;
            }
            c33035e2.f215119f = view;
        }
        ((C47733d) this.f196705y0.getValue()).f430743J.observe(getViewLifecycleOwner(), new C32538d(this));
        w wVar = this.f196694n0;
        if (wVar == null) {
            wVar = null;
        }
        wVar.getF196762b0().observe(getViewLifecycleOwner(), new C32539e(this));
        w wVar2 = this.f196694n0;
        if (wVar2 == null) {
            wVar2 = null;
        }
        wVar2.getF196763c0().observe(getViewLifecycleOwner(), new C32540f(this));
        w wVar3 = this.f196694n0;
        if (wVar3 == null) {
            wVar3 = null;
        }
        wVar3.getF196764d0().observe(getViewLifecycleOwner(), new C32541g(this));
        L l12 = this.f196706z0;
        if (l12 == null) {
            l12 = null;
        }
        com.jakewharton.rxrelay3.d<Boolean> dVar = l12.f196674i;
        InterfaceC35745a5 interfaceC35745a5 = this.f196702v0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        io.reactivex.rxjava3.core.z<R> zVarU = dVar.j0(interfaceC35745a5.e()).N(C32546l.f196745b).z0(1L).u(new C32547m(this));
        InterfaceC35745a5 interfaceC35745a52 = this.f196702v0;
        if (interfaceC35745a52 == null) {
            interfaceC35745a52 = null;
        }
        I0 i0J0 = zVarU.j0(interfaceC35745a52.e());
        InterfaceC35745a5 interfaceC35745a53 = this.f196702v0;
        if (interfaceC35745a53 == null) {
            interfaceC35745a53 = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = i0J0.x0(interfaceC35745a53.e()).t0(new n(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f196688A0;
        cVar.b(dVarT0);
        L l13 = this.f196706z0;
        if (l13 == null) {
            l13 = null;
        }
        com.jakewharton.rxrelay3.d<AvitoMapCameraPosition> dVar2 = l13.f196675j;
        InterfaceC35745a5 interfaceC35745a54 = this.f196702v0;
        if (interfaceC35745a54 == null) {
            interfaceC35745a54 = null;
        }
        cVar.b(dVar2.j0(interfaceC35745a54.e()).t0(new o(this)));
        L l14 = this.f196706z0;
        if (l14 == null) {
            l14 = null;
        }
        com.jakewharton.rxrelay3.d<G0> dVar3 = l14.f196676k;
        InterfaceC35745a5 interfaceC35745a55 = this.f196702v0;
        if (interfaceC35745a55 == null) {
            interfaceC35745a55 = null;
        }
        cVar.b(dVar3.j0(interfaceC35745a55.e()).t0(new p(this)));
        L l15 = this.f196706z0;
        if (l15 == null) {
            l15 = null;
        }
        com.jakewharton.rxrelay3.d<G0> dVar4 = l15.f196677l;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dVar4.getClass();
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        A1 a1C0 = dVar4.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a56 = this.f196702v0;
        if (interfaceC35745a56 == null) {
            interfaceC35745a56 = null;
        }
        cVar.b(a1C0.j0(interfaceC35745a56.e()).v0(new C32542h(this), new C32543i(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
        L l16 = this.f196706z0;
        if (l16 == null) {
            l16 = null;
        }
        io.reactivex.rxjava3.core.z<G0> zVar = l16.f196678m;
        zVar.getClass();
        A1 a1C02 = zVar.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a57 = this.f196702v0;
        if (interfaceC35745a57 == null) {
            interfaceC35745a57 = null;
        }
        cVar.b(a1C02.j0(interfaceC35745a57.e()).t0(new C32544j(this)));
        L l17 = this.f196706z0;
        if (l17 == null) {
            l17 = null;
        }
        io.reactivex.rxjava3.core.z<G0> zVar2 = l17.f196679n;
        zVar2.getClass();
        A1 a1C03 = zVar2.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a58 = this.f196702v0;
        if (interfaceC35745a58 == null) {
            interfaceC35745a58 = null;
        }
        cVar.b(a1C03.j0(interfaceC35745a58.e()).t0(new C32545k(this)));
        L l18 = this.f196706z0;
        AvitoMap avitoMap = (l18 != null ? l18 : null).f196669d;
        if (avitoMap != null) {
            avitoMap.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C33035e c33035e = this.f196699s0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.a();
        this.f196688A0.e();
        L l12 = this.f196706z0;
        if (l12 == null) {
            l12 = null;
        }
        AvitoMap avitoMap = l12.f196669d;
        if (avitoMap != null) {
            AvitoMap.DefaultImpls.onStop$default(avitoMap, false, 1, null);
        }
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.navbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        NavBar.e(navBar, navBar.getResources().getString(R.string.messenger_shared_location_map_view_title), 0, 6);
        navBar.c(R.attr.ic_close24, new d());
        this.f196706z0 = new L(view, (AvitoMapAttachHelper) this.f196692E0.getValue(), getParentFragmentManager());
        this.f196693F0 = bundle != null ? bundle.getBoolean("request_location_when_its_enabled") : false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) throws Resources.NotFoundException {
        Bundle arguments = getArguments();
        this.f196689B0 = arguments != null ? arguments.getString("channel_id") : null;
        Bundle arguments2 = getArguments();
        MessageBody.Location location = arguments2 != null ? (MessageBody.Location) arguments2.getParcelable("initial_position") : null;
        this.f196690C0 = location;
        MessageBody.Location location2 = location == null ? new MessageBody.Location(0.0d, 0.0d, getString(R.string.messenger_sharing_map_default_initial_location_title), null, null, 24, null) : location;
        this.f196691D0 = new AvitoMapPoint(location2.getLatitude(), location2.getLongitude(), null, 4, null);
        b.a aVarA = com.avito.android.messenger.map.sharing.di.a.a();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        String string = getResources().getString(R.string.messenger_share_map_address_not_found_title);
        String string2 = getResources().getString(R.string.messenger_share_map_address_not_found_error_message);
        String string3 = getResources().getString(R.string.messenger_once_again);
        com.avito.android.messenger.map.sharing.di.c cVar = (com.avito.android.messenger.map.sharing.di.c) C29972i.a(C29972i.b(this), com.avito.android.messenger.map.sharing.di.c.class);
        int i12 = com.avito.android.messenger.map.sharing.di.d.f196737a;
        aVarA.a(this, this, activityC22955mRequireActivity, location2, string, string2, string3, cVar).a(this);
    }
}
