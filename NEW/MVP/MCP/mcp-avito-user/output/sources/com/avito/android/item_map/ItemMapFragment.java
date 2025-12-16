package com.avito.android.item_map;

import Ec.InterfaceC13473b;
import JM.h;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.S0;
import com.avito.android.B2;
import com.avito.android.C34160q2;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deal_confirmation.d;
import com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity;
import com.avito.android.di.C29972i;
import com.avito.android.important_addresses.ItemCoordinates;
import com.avito.android.item_map.di.c;
import com.avito.android.item_map.geo_zones.g;
import com.avito.android.item_map.view.InterfaceC31072i;
import com.avito.android.item_map.view.InterfaceC31074k;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.item_map.view.L;
import com.avito.android.item_map.view.S;
import com.avito.android.item_map.view.V;
import com.avito.android.location.find.o;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35853n2;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.V2;
import com.avito.android.webview.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pO.InterfaceC46983a;

/* compiled from: ItemMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\n\u000bB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/item_map/ItemMapFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/a;", "Lcom/avito/android/item_map/view/k$b;", "Lcom/avito/android/item_map/view/i;", "Lcom/avito/android/permissions/d$c;", "Lcom/avito/android/permissions/d$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "StoreFragment", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes14.dex */
public final class ItemMapFragment extends TabBaseFragment implements com.avito.android.ui.a, InterfaceC31074k.b, InterfaceC31072i, InterfaceC33034d.c, InterfaceC33034d.b, InterfaceC28477j.b {

    /* renamed from: V0, reason: collision with root package name */
    @k
    public static final a f173231V0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public C34160q2 f173232A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public Zd.b f173233B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.sheet.k f173234C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public o f173235D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public InterfaceC33034d f173236E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public L f173237F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public InterfaceC35945t1<String> f173238G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC35741a1 f173239H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f173240I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public d f173241J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public C35853n2 f173242K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f173243L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public m f173244M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public B2 f173245N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public h f173246O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public g f173247P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public InterfaceC46983a f173248Q0;

    /* renamed from: R0, reason: collision with root package name */
    @k
    public ItemMapState f173249R0;

    /* renamed from: S0, reason: collision with root package name */
    @l
    public V f173250S0;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public InterfaceC28265d f173251T0;

    /* renamed from: U0, reason: collision with root package name */
    @k
    public final NavigationState f173252U0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC31074k f173253t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.item_map.amenity.h f173254u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.item_map.routes.k f173255v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public AvitoMapAttachHelper f173256w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.data.a f173257x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC13473b f173258y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<RecyclerView.C> f173259z0;

    /* compiled from: ItemMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/item_map/ItemMapFragment$StoreFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
    public static final class StoreFragment extends Fragment implements InterfaceC28477j.a {

        /* renamed from: f0, reason: collision with root package name */
        @l
        public ItemMapState f173260f0;

        /* renamed from: g0, reason: collision with root package name */
        @l
        public Kundle f173261g0;

        /* renamed from: h0, reason: collision with root package name */
        @l
        public Kundle f173262h0;

        /* renamed from: i0, reason: collision with root package name */
        @l
        public Bundle f173263i0;

        /* renamed from: j0, reason: collision with root package name */
        @l
        public Kundle f173264j0;

        /* renamed from: k0, reason: collision with root package name */
        @l
        public Kundle f173265k0;

        @Override // androidx.fragment.app.Fragment
        public final void onCreate(@l Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }
    }

    /* compiled from: ItemMapFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/ItemMapFragment$a;", "", "<init>", "()V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.avito.android.item_map.ItemMapFragment a(@Y61.k com.avito.android.item_map.ItemMapArguments r46) {
            /*
                Method dump skipped, instructions count: 527
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_map.ItemMapFragment.a.a(com.avito.android.item_map.ItemMapArguments):com.avito.android.item_map.ItemMapFragment");
        }

        public a() {
        }
    }

    public ItemMapFragment() {
        super(0, 1, null);
        this.f173249R0 = new ItemMapState(null, null, null, null, false, null, false, null, null, 0.0f, null, null, false, null, false, null, false, false, null, null, null, null, null, null, null, false, null, null, 268435455, null);
        this.f173252U0 = new NavigationState(false, null, 2, null);
    }

    public final void D5(@k Coordinates coordinates) {
        C35853n2 c35853n2 = this.f173242K0;
        if (c35853n2 == null) {
            c35853n2 = null;
        }
        startActivity(c35853n2.k(coordinates));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.b
    public final void F0() {
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.b0(requireActivity());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void N0() {
        C35853n2 c35853n2 = this.f173242K0;
        if (c35853n2 == null) {
            c35853n2 = null;
        }
        startActivity(c35853n2.i());
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void d(@l String str) {
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.e1(str);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d.c
    public final void g1() {
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.S();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1) {
            if (i13 == -1) {
                InterfaceC28265d interfaceC28265d = this.f173251T0;
                if (interfaceC28265d == null) {
                    interfaceC28265d = null;
                }
                interfaceC28265d.k0(intent != null ? intent.getParcelableExtra("SuccessAuthResultData") : null);
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        DealConfirmationSheetActivity.f132774r.getClass();
        String stringExtra = intent != null ? intent.getStringExtra("result_key.message") : null;
        if (stringExtra != null) {
            d dVar = this.f173241J0;
            (dVar != null ? dVar : null).d(stringExtra);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        ItemMapState itemMapState;
        Kundle kundle;
        ItemCoordinates itemCoordinates;
        super.onCreate(bundle);
        Fragment fragmentH = getChildFragmentManager().H("store_fragment");
        StoreFragment storeFragment = fragmentH instanceof StoreFragment ? (StoreFragment) fragmentH : null;
        if (storeFragment == null) {
            H hE2 = getChildFragmentManager().e();
            hE2.j(0, new StoreFragment(), "store_fragment", 1);
            hE2.e();
        }
        if (storeFragment == null || (itemMapState = storeFragment.f173260f0) == null) {
            Bundle arguments = getArguments();
            itemMapState = arguments != null ? (ItemMapState) arguments.getParcelable("item_map_state") : null;
            if (itemMapState == null) {
                throw new IllegalArgumentException("State not provided");
            }
        }
        ItemMapState itemMapState2 = itemMapState;
        this.f173249R0 = itemMapState2;
        Kundle kundle2 = storeFragment != null ? storeFragment.f173261g0 : null;
        Kundle kundle3 = storeFragment != null ? storeFragment.f173262h0 : null;
        Bundle bundle2 = storeFragment != null ? storeFragment.f173263i0 : null;
        Kundle kundle4 = storeFragment != null ? storeFragment.f173264j0 : null;
        Kundle kundle5 = storeFragment != null ? storeFragment.f173265k0 : null;
        c.a aVarM8 = ((c.b) C29972i.a(C29972i.b(this), c.b.class)).M8();
        cv.d dVarD = cv.c.d(this);
        r rVarC = s.c(this);
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        BannerPageSource bannerPageSource = BannerPageSource.f87777c;
        Resources resources = getResources();
        S0 f42820b = getF42820b();
        AvitoMapPoint avitoMapPoint = itemMapState2.f173430c;
        if (avitoMapPoint != null) {
            kundle = kundle5;
            itemCoordinates = new ItemCoordinates(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude());
        } else {
            kundle = kundle5;
            itemCoordinates = null;
        }
        String str = itemMapState2.f173444q;
        if (str == null) {
            str = "map";
        }
        String str2 = itemMapState2.f173429b;
        if (str2 == null) {
            str2 = "";
        }
        Kundle kundle6 = kundle;
        Kundle kundle7 = kundle4;
        Bundle bundle3 = bundle2;
        Kundle kundle8 = kundle2;
        aVarM8.a(dVarD, rVarC, itemMapState2, this, activityC22955mRequireActivity, this, kundle2, itemMapState2.f173447t, kundle3, itemMapState2.f173448u, resources, f42820b, itemCoordinates, new JM.a(itemMapState2.f173427B, str, str2)).a(this);
        if (kundle7 != null) {
            h hVar = this.f173246O0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.g0(kundle7);
        }
        com.avito.android.item_map.amenity.h hVar2 = this.f173254u0;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.f0(kundle8);
        InterfaceC28265d interfaceC28265d = this.f173251T0;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.b(bundle3);
        g gVar = this.f173247P0;
        if (gVar == null) {
            gVar = null;
        }
        gVar.f0(kundle6);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.item_map_fragment, viewGroup, false);
        L l12 = this.f173237F0;
        L l13 = l12 != null ? l12 : null;
        RecyclerView.Adapter<RecyclerView.C> adapter = this.f173259z0;
        if (adapter == null) {
            adapter = null;
        }
        S s5 = (S) adapter;
        com.avito.android.lib.deprecated_design.dialog.a aVar = this.f173240I0;
        com.avito.android.lib.deprecated_design.dialog.a aVar2 = aVar != null ? aVar : null;
        InterfaceC35945t1<String> interfaceC35945t1 = this.f173238G0;
        InterfaceC35945t1<String> interfaceC35945t12 = interfaceC35945t1 != null ? interfaceC35945t1 : null;
        InterfaceC35741a1 interfaceC35741a1 = this.f173239H0;
        InterfaceC35741a1 interfaceC35741a12 = interfaceC35741a1 != null ? interfaceC35741a1 : null;
        InterfaceC28265d interfaceC28265d = this.f173251T0;
        InterfaceC28265d interfaceC28265d2 = interfaceC28265d != null ? interfaceC28265d : null;
        d dVar = this.f173241J0;
        d dVar2 = dVar != null ? dVar : null;
        Zd.b bVar = this.f173233B0;
        Zd.b bVar2 = bVar != null ? bVar : null;
        com.avito.android.deal_confirmation.sheet.k kVar = this.f173234C0;
        com.avito.android.deal_confirmation.sheet.k kVar2 = kVar != null ? kVar : null;
        C35853n2 c35853n2 = this.f173242K0;
        C35853n2 c35853n22 = c35853n2 != null ? c35853n2 : null;
        com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f173243L0;
        com.avito.android.deeplink_handler.handler.composite.a aVar4 = aVar3 != null ? aVar3 : null;
        ItemMapState itemMapState = this.f173249R0;
        B2 b22 = this.f173245N0;
        B2 b23 = b22 != null ? b22 : null;
        com.avito.android.autoteka.data.a aVar5 = this.f173257x0;
        com.avito.android.autoteka.data.a aVar6 = aVar5 != null ? aVar5 : null;
        AvitoMapAttachHelper avitoMapAttachHelper = this.f173256w0;
        V v12 = new V(viewInflate, l13, s5, aVar2, interfaceC35945t12, interfaceC35741a12, interfaceC28265d2, dVar2, bVar2, kVar2, c35853n22, aVar4, this, itemMapState, b23, aVar6, avitoMapAttachHelper != null ? avitoMapAttachHelper : null);
        this.f173250S0 = v12;
        AvitoMapAttachHelper avitoMapAttachHelper2 = this.f173256w0;
        if (avitoMapAttachHelper2 == null) {
            avitoMapAttachHelper2 = null;
        }
        avitoMapAttachHelper2.setMapAttachedListener(v12);
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.d(v12);
        com.avito.android.item_map.amenity.h hVar = this.f173254u0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.a(v12);
        com.avito.android.item_map.routes.k kVar3 = this.f173255v0;
        if (kVar3 == null) {
            kVar3 = null;
        }
        kVar3.a(v12);
        g gVar = this.f173247P0;
        if (gVar == null) {
            gVar = null;
        }
        gVar.a(v12);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        androidx.appcompat.app.l lVar;
        InterfaceC33034d interfaceC33034d = this.f173236E0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.e0();
        com.avito.android.item_map.routes.k kVar = this.f173255v0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.I();
        com.avito.android.item_map.amenity.h hVar = this.f173254u0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.I();
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.e0();
        InterfaceC31074k interfaceC31074k2 = this.f173253t0;
        if (interfaceC31074k2 == null) {
            interfaceC31074k2 = null;
        }
        interfaceC31074k2.c();
        InterfaceC28265d interfaceC28265d = this.f173251T0;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.e0();
        d dVar = this.f173241J0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        V v12 = this.f173250S0;
        if (v12 != null && (lVar = v12.f173566V) != null) {
            lVar.dismiss();
        }
        h hVar2 = this.f173246O0;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.e0();
        g gVar = this.f173247P0;
        (gVar != null ? gVar : null).I();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.f173249R0.f173441n) {
            o oVar = this.f173235D0;
            if (oVar == null) {
                oVar = null;
            }
            oVar.c(requireContext());
        }
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        (interfaceC31074k != null ? interfaceC31074k : null).b();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f173249R0.f173441n) {
            o oVar = this.f173235D0;
            if (oVar == null) {
                oVar = null;
            }
            oVar.a(requireContext());
        }
        InterfaceC28265d interfaceC28265d = this.f173251T0;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.nb("map");
        InterfaceC28265d interfaceC28265d2 = this.f173251T0;
        if (interfaceC28265d2 == null) {
            interfaceC28265d2 = null;
        }
        interfaceC28265d2.db();
        d dVar = this.f173241J0;
        (dVar != null ? dVar : null).onResume();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Fragment fragmentH = getChildFragmentManager().H("store_fragment");
        StoreFragment storeFragment = fragmentH instanceof StoreFragment ? (StoreFragment) fragmentH : null;
        if (storeFragment != null) {
            InterfaceC31074k interfaceC31074k = this.f173253t0;
            if (interfaceC31074k == null) {
                interfaceC31074k = null;
            }
            storeFragment.f173260f0 = interfaceC31074k.d0();
            com.avito.android.item_map.amenity.h hVar = this.f173254u0;
            if (hVar == null) {
                hVar = null;
            }
            storeFragment.f173261g0 = hVar.d0();
            com.avito.android.item_map.routes.k kVar = this.f173255v0;
            if (kVar == null) {
                kVar = null;
            }
            storeFragment.f173262h0 = kVar.d0();
            InterfaceC28265d interfaceC28265d = this.f173251T0;
            if (interfaceC28265d == null) {
                interfaceC28265d = null;
            }
            storeFragment.f173263i0 = interfaceC28265d.H();
            h hVar2 = this.f173246O0;
            if (hVar2 == null) {
                hVar2 = null;
            }
            storeFragment.f173264j0 = hVar2.f0();
            g gVar = this.f173247P0;
            storeFragment.f173265k0 = (gVar != null ? gVar : null).d0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33034d interfaceC33034d = this.f173236E0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.f(this, this, this);
        View view = getView();
        if (view != null) {
            InterfaceC33034d interfaceC33034d2 = this.f173236E0;
            if (interfaceC33034d2 == null) {
                interfaceC33034d2 = null;
            }
            interfaceC33034d2.e(view);
        }
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.f(this);
        InterfaceC31074k interfaceC31074k2 = this.f173253t0;
        (interfaceC31074k2 != null ? interfaceC31074k2 : null).e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33034d interfaceC33034d = this.f173236E0;
        if (interfaceC33034d == null) {
            interfaceC33034d = null;
        }
        interfaceC33034d.a();
        InterfaceC31074k interfaceC31074k = this.f173253t0;
        if (interfaceC31074k == null) {
            interfaceC31074k = null;
        }
        interfaceC31074k.c0();
        InterfaceC31074k interfaceC31074k2 = this.f173253t0;
        (interfaceC31074k2 != null ? interfaceC31074k2 : null).a();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            AvitoMapAttachHelper avitoMapAttachHelper = this.f173256w0;
            if (avitoMapAttachHelper == null) {
                avitoMapAttachHelper = null;
            }
            avitoMapAttachHelper.attachView(R.id.map, view, getChildFragmentManager());
        } catch (Exception e12) {
            V2.f318762a.e("Can't init yandex maps due to " + e12.getLocalizedMessage(), null);
            V v12 = this.f173250S0;
            if (v12 != null) {
                GoogleAvitoMapAttachHelper googleAvitoMapAttachHelper = new GoogleAvitoMapAttachHelper();
                this.f173256w0 = googleAvitoMapAttachHelper;
                googleAvitoMapAttachHelper.setMapAttachedListener(v12);
                AvitoMapAttachHelper avitoMapAttachHelper2 = this.f173256w0;
                if (avitoMapAttachHelper2 == null) {
                    avitoMapAttachHelper2 = null;
                }
                avitoMapAttachHelper2.attachView(R.id.map, view, getChildFragmentManager());
            }
        }
        ItemMapState.GeoZonesRequest geoZonesRequest = this.f173249R0.f173452y;
        if (geoZonesRequest != null) {
            g gVar = this.f173247P0;
            (gVar != null ? gVar : null).b(geoZonesRequest);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF255843z0() {
        return this.f173252U0;
    }
}
