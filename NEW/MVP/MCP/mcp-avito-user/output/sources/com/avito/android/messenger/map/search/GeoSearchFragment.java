package com.avito.android.messenger.map.search;

import Cd.C13243a;
import KY.a;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.map.search.di.b;
import com.avito.android.messenger.map.search.q;
import com.avito.android.messenger.map.search.z;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import z1.AbstractC50339a;

/* compiled from: GeoSearchFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/map/search/GeoSearchFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class GeoSearchFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f196484B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196485A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public q f196486n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f196487o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f196488p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f196489q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C47743i f196490r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f196491s0;

    /* renamed from: t0, reason: collision with root package name */
    public B f196492t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f196493u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f196494v0;

    /* renamed from: w0, reason: collision with root package name */
    public d f196495w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public GeoPoint f196496x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public GeoPoint f196497y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f196498z0;

    /* compiled from: GeoSearchFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/map/search/GeoSearchFragment$a;", "", "<init>", "()V", "", "KEY_CENTER_POINT", "Ljava/lang/String;", "KEY_CHANNEL_ID", "KEY_INITIAL_QUERY", "KEY_ITEM_LOCATION", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GeoSearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C47733d> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = GeoSearchFragment.this.f196490r0;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: LiveDatas.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "ru/avito/messenger/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC23040h0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                GeoSearchFragment geoSearchFragment = GeoSearchFragment.this;
                K2.e(geoSearchFragment);
                ActivityC22955m activityC22955mL1 = geoSearchFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            }
        }
    }

    /* compiled from: GeoSearchFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/map/search/GeoSearchFragment$d", "Lcom/avito/android/messenger/map/search/q$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements q.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f196501b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final z.b.a f196502c = z.b.a.f196624a;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final a.c.C0577a f196503d = a.c.C0577a.f9512a;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final b.a<List<com.avito.android.messenger.map.search.adapter.a>> f196504e = new b.a<>();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final C42784z0 f196505f = C42784z0.f406748b;

        public d(String str) {
            this.f196501b = str;
        }

        @Override // com.avito.android.messenger.map.search.z.c
        /* renamed from: a */
        public final a.c getF196611e() {
            return this.f196503d;
        }

        @Override // com.avito.android.messenger.map.search.q.a
        public final com.avito.android.mvi.b b() {
            return this.f196504e;
        }

        @Override // com.avito.android.messenger.map.search.q.a
        @Y61.k
        public final List<com.avito.android.messenger.map.search.adapter.a> c() {
            return this.f196505f;
        }

        @Override // com.avito.android.messenger.map.search.z.c
        /* renamed from: d */
        public final boolean getF196610d() {
            return false;
        }

        @Override // com.avito.android.messenger.map.search.z.c
        @Y61.k
        /* renamed from: getQuery, reason: from getter */
        public final String getF196501b() {
            return this.f196501b;
        }

        @Y61.k
        public final String toString() {
            return C43066x.F0("GeoSearchPresenter.State(\n        |   query=" + this.f196501b + ",\n        |   listState=" + this.f196502c + ",\n        |   searchIsInProgress=false,\n        |   connectionErrorIndicatorState=" + this.f196503d + ",\n        |   searchSuggests=" + this.f196504e + ",\n        |   favoritePlaces=" + this.f196505f + "\n        |)");
        }

        @Override // com.avito.android.messenger.map.search.z.c
        /* renamed from: yd */
        public final z.b getF196609c() {
            return this.f196502c;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f196506l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f196506l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f196506l);
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
            return GeoSearchFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f196508l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f196508l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f196508l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f196509l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f196509l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f196509l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f196510l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f196510l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f196510l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public GeoSearchFragment() {
        super(0, 1, null);
        e eVar = new e(new b());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f196491s0 = new O0(m0.f406844a.b(C47733d.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f196485A0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(R.layout.messenger_geo_search_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f196489q0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("GeoSearchFragment");
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f196489q0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("GeoSearchFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((C47733d) this.f196491s0.getValue()).f430743J.observe(getViewLifecycleOwner(), new c());
        q qVar = this.f196486n0;
        if (qVar == null) {
            qVar = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = qVar.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32533d(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f196485A0;
        cVar.b(dVarT0);
        q qVar2 = this.f196486n0;
        if (qVar2 == null) {
            qVar2 = null;
        }
        qVar2.getF196598b0().observe(getViewLifecycleOwner(), new C32531b(this));
        q qVar3 = this.f196486n0;
        if (qVar3 == null) {
            qVar3 = null;
        }
        qVar3.getF196597a0().observe(getViewLifecycleOwner(), new C32532c(this));
        B b12 = this.f196492t0;
        if (b12 == null) {
            b12 = null;
        }
        cVar.b(b12.f196477k.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32534e(this)));
        if (this.f196498z0) {
            String str = this.f196494v0;
            if (str == null) {
                str = null;
            }
            if (C43066x.K(str)) {
                return;
            }
            B b13 = this.f196492t0;
            if (b13 == null) {
                b13 = null;
            }
            String str2 = this.f196494v0;
            String str3 = str2 != null ? str2 : null;
            Input input = b13.f196472f;
            Input.t(input, str3, false, 6);
            input.setSelection(str3.length());
            input.v();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f196485A0.e();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC31873b(this, 8));
        com.avito.konveyor.adapter.h hVar = this.f196487o0;
        if (hVar == null) {
            hVar = null;
        }
        com.avito.konveyor.a aVar = this.f196488p0;
        this.f196492t0 = new B(view, aVar != null ? aVar : null, hVar);
        this.f196498z0 = bundle == null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) throws Resources.NotFoundException {
        String string;
        Bundle arguments = getArguments();
        this.f196493u0 = arguments != null ? arguments.getString("channel_id") : null;
        Bundle arguments2 = getArguments();
        this.f196496x0 = arguments2 != null ? (GeoPoint) arguments2.getParcelable("center_point") : null;
        Bundle arguments3 = getArguments();
        this.f196497y0 = arguments3 != null ? (GeoPoint) arguments3.getParcelable("item_location") : null;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string = arguments4.getString("initial_query")) == null) {
            string = "";
        }
        this.f196494v0 = string;
        this.f196495w0 = new d(string);
        b.a aVarA = com.avito.android.messenger.map.search.di.a.a();
        String str = this.f196493u0;
        String str2 = str == null ? null : str;
        GeoPoint geoPoint = this.f196496x0;
        GeoPoint geoPoint2 = this.f196497y0;
        String string2 = getResources().getString(R.string.messenger_geo_search_error_indicator_message);
        String string3 = getResources().getString(R.string.messenger_geo_search_error_indicator_action_name);
        d dVar = this.f196495w0;
        d dVar2 = dVar == null ? null : dVar;
        com.avito.android.messenger.map.search.di.c cVar = (com.avito.android.messenger.map.search.di.c) C29972i.a(C29972i.b(this), com.avito.android.messenger.map.search.di.c.class);
        int i12 = com.avito.android.messenger.map.search.di.d.f196558a;
        aVarA.a(this, str2, geoPoint, geoPoint2, string2, string3, dVar2, cVar).a(this);
    }
}
