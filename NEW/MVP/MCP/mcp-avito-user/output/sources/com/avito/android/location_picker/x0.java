package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import com.avito.android.location_picker.providers.InterfaceC31565b;
import com.avito.android.location_picker.providers.InterfaceC31569f;
import com.avito.android.location_picker.view.C31589k;
import com.avito.android.location_picker.view.InterfaceC31579a;
import com.avito.android.location_picker.view.InterfaceC31580b;
import com.avito.android.location_picker.view.InterfaceC31581c;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.maybe.C41925t;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.observable.C41953h;
import io.reactivex.rxjava3.internal.operators.observable.I1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import l41.InterfaceC43543a;
import l41.InterfaceC43544b;
import lW.InterfaceC43691a;
import nF.C44245a;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/x0;", "Lcom/avito/android/location_picker/a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x0 implements InterfaceC31532a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LocationPickerState f182807a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31579a f182808b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31581c f182809c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31580b f182810d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31564a f182811e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f182812f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33034d f182813g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.location_picker.providers.w f182814h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f182815i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.providers.C f182816j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31569f f182817k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31565b f182818l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f182819m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f182820n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.analytics.a f182821o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.job.a f182822p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location_picker.job.f f182823q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f182824r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C44245a f182825s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f182826t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f182827u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final LocationFlowType f182828v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public LocationPickerFragment f182829w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<LocationPickerState> f182830x = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Y41.l<LocationPickerState, io.reactivex.rxjava3.core.z<Y41.l<LocationPickerState, LocationPickerState>>> f182831y = new a();

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Y41.p<LocationPickerState, Throwable, LocationPickerState> f182832z = b.f182834l;

    /* compiled from: LocationPickerBinder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a(\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00000\u00030\u0002¢\u0006\u0002\b\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", "currentState", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/Function1;", "Lkotlin/S;", "name", VoiceInfo.STATE, "Lj41/e;", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, io.reactivex.rxjava3.core.z<Y41.l<? super LocationPickerState, ? extends LocationPickerState>>> {
        public a() {
            super(1);
        }

        public static final io.reactivex.rxjava3.core.z a(x0 x0Var) {
            return x0Var.f182811e.b().z(x0Var.f182812f.a()).r(new N(x0Var)).F();
        }

        @Override // Y41.l
        public final io.reactivex.rxjava3.core.z<Y41.l<? super LocationPickerState, ? extends LocationPickerState>> invoke(LocationPickerState locationPickerState) {
            io.reactivex.rxjava3.internal.operators.observable.L0 l02;
            LocationPickerState locationPickerState2 = locationPickerState;
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB = T0.b(locationPickerState2.f182376u);
            x0 x0Var = x0.this;
            C31545g0 c31545g0 = new C31545g0(x0Var, locationPickerState2);
            qVarB.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(qVarB, c31545g0), C31547h0.f182404l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G2 = x0.g(x0Var, T0.b(locationPickerState2.e()).g(new C31538d(locationPickerState2)).q(), new C31540e(x0Var));
            io.reactivex.rxjava3.internal.operators.mixed.q qVar = new io.reactivex.rxjava3.internal.operators.mixed.q(T0.b(locationPickerState2.e()).g(new C31548i(locationPickerState2)), new C31550j(x0Var, locationPickerState2));
            C31552k c31552k = C31552k.f182421l;
            C31554l c31554l = new C31554l(x0Var);
            x0Var.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0M0 = qVar.d0(new z0(c31554l)).m0(new B0(c31552k));
            RadiusViewState radiusViewState = locationPickerState2.f182375t;
            boolean z12 = radiusViewState.f182383d;
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB2 = T0.b(z12 || (z12 && radiusViewState.f182389j));
            O o12 = new O(x0Var, locationPickerState2);
            qVarB2.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G3 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(qVarB2, o12), new P(x0Var));
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB3 = T0.b(locationPickerState2.c());
            C31534b c31534b = new C31534b(x0Var, locationPickerState2);
            qVarB3.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G4 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(qVarB3, c31534b), C31536c.f182223l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G5 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(T0.b(locationPickerState2.f182378w.f182343d).g(new C31542f(locationPickerState2)), new C31544g(x0Var, locationPickerState2)), C31546h.f182403l);
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB4 = T0.b(locationPickerState2.d());
            InterfaceC43544b interfaceC43544b = C31555l0.f182424b;
            Objects.requireNonNull(interfaceC43544b, "onEvent is null");
            C41925t c41925t = new C41925t(qVarB4, interfaceC43544b);
            l41.g gVar = C31557m0.f182426b;
            l41.g<Object> gVar2 = io.reactivex.rxjava3.internal.functions.a.f401994d;
            Objects.requireNonNull(gVar, "onError is null");
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G6 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.maybe.g0(c41925t, gVar2, gVar2, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a), new C31561o0(x0Var)).y0(new C31563p0(x0Var, locationPickerState2)), new C31571q0(locationPickerState2));
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB5 = T0.b(locationPickerState2.d());
            C31574s0 c31574s0 = new C31574s0(x0Var);
            qVarB5.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G7 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(qVarB5, c31574s0).y0(new u0(x0Var, locationPickerState2)), new v0(locationPickerState2));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G8 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.mixed.q(T0.b(x0Var.f182826t).h(new C31556m(locationPickerState2)), new C31558n(x0Var, locationPickerState2)), C31560o.f182430l);
            InterfaceC31581c interfaceC31581c = x0Var.f182809c;
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G9 = x0.g(x0Var, interfaceC31581c.getF182679P().N(Z.f182192b), C31533a0.f182193l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G10 = x0.g(x0Var, io.reactivex.rxjava3.core.z.c0(locationPickerState2.f182363h).N(H.f182131b).T(new I(x0Var), Integer.MAX_VALUE), new J(x0Var));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G11 = x0.g(x0Var, interfaceC31581c.l(), C31539d0.f182226l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l03 = l0G6;
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G12 = x0.g(x0Var, interfaceC31581c.getF182680Q(), new C31537c0(x0Var));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G13 = x0.g(x0Var, interfaceC31581c.getF182666C(), E.f182104l);
            io.reactivex.rxjava3.subjects.e f182673j = interfaceC31581c.getF182673J();
            C31551j0 c31551j0 = new C31551j0(x0Var);
            f182673j.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G14 = x0.g(x0Var, new C41936b0(f182673j, c31551j0), new C31553k0(x0Var));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G15 = x0.g(x0Var, interfaceC31581c.w(), W.f182189l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G16 = x0.g(x0Var, interfaceC31581c.getF182670G().d0(new F(x0Var)), G.f182129l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G17 = x0.g(x0Var, T0.b(locationPickerState2.f()).j(new C31605z(x0Var)).q(), A.f182095l);
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB6 = T0.b(locationPickerState2.f182371p);
            B b12 = new B(x0Var);
            qVarB6.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G18 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.maybe.H(qVarB6, b12).q(), C.f182100l);
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB7 = T0.b(locationPickerState2.f182379x);
            Q q12 = new Q(x0Var);
            qVarB7.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G19 = x0.g(x0Var, new io.reactivex.rxjava3.internal.operators.maybe.H(qVarB7, q12).g(S.f182184b).q(), T.f182186l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G20 = x0.g(x0Var, T0.b(locationPickerState2.f182380y).j(new C31603x(x0Var)).q(), C31604y.f182835l);
            io.reactivex.rxjava3.core.q<kotlin.G0> qVarB8 = T0.b(locationPickerState2.f182372q);
            C31573s c31573s = new C31573s(x0Var, locationPickerState2);
            qVarB8.getClass();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0M02 = new io.reactivex.rxjava3.internal.operators.mixed.q(qVarB8, c31573s).m0(new C31577u(x0Var));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G21 = x0.g(x0Var, interfaceC31581c.g(), C31535b0.f182222l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G22 = x0.g(x0Var, interfaceC31581c.getF182723y().C0(300L, TimeUnit.MILLISECONDS, x0Var.f182812f.c()), C31570q.f182489l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G23 = x0.g(x0Var, interfaceC31581c.getF182724z(), new C31602w(x0Var));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G24 = x0.g(x0Var, interfaceC31581c.F(), D.f182102l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G25 = x0.g(x0Var, interfaceC31581c.getF182721w(), X.f182190l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G26 = x0.g(x0Var, interfaceC31581c.getF182722x(), C31543f0.f182398l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G27 = x0.g(x0Var, interfaceC31581c.v(), C31562p.f182432l);
            io.reactivex.rxjava3.core.z<kotlin.G0> zVarS = interfaceC31581c.s();
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G28 = null;
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G29 = zVarS != null ? x0.g(x0Var, zVarS, C31541e0.f182340l) : null;
            if (x0Var.f182827u) {
                l02 = l0G29;
                l0G28 = x0.g(x0Var, interfaceC31581c.getF182672I(), V.f182188l);
            } else {
                l02 = l0G29;
            }
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G30 = x0.g(x0Var, interfaceC31581c.t(), new U(x0Var));
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G31 = x0.g(x0Var, interfaceC31581c.getF182667D(), w0.f182805l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G32 = x0.g(x0Var, interfaceC31581c.getF182668E(), C31578v.f182505l);
            io.reactivex.rxjava3.internal.operators.observable.L0 l0G33 = x0.g(x0Var, interfaceC31581c.getF182720v(), new Y(x0Var));
            C44245a c44245a = x0Var.f182825s;
            c44245a.getClass();
            kotlin.reflect.n<Object> nVar = C44245a.f414956i[2];
            if (((Boolean) c44245a.f414959d.a().invoke()).booleanValue()) {
                l03 = l0G7;
            }
            return io.reactivex.rxjava3.core.z.X(C42756l.B(new io.reactivex.rxjava3.core.z[]{l0G2, l0M0, l0G4, l03, l0G11, l0G12, l0G14, l0G13, l0G10, l0G16, l0G18, l0G20, l0G19, l0G17, l0G15, l0M02, l0G21, l0G9, l0G22, l0G23, l0G24, l0G25, l0G26, l0G27, l0G3, l02, l0G28, l0G30, l0G8, l0G31, l0G32, l0G33, l0G, l0G5})).T(io.reactivex.rxjava3.internal.functions.a.f401991a, Integer.MAX_VALUE);
        }
    }

    /* compiled from: LocationPickerBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "error", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, Throwable, LocationPickerState> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f182834l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final LocationPickerState invoke(LocationPickerState locationPickerState, Throwable th2) {
            LocationPickerState locationPickerState2 = locationPickerState;
            Throwable th3 = th2;
            V2.f318762a.a("DEFAULT_TAG", "LocationPickerBinder", th3);
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, th3.getMessage(), false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
        }
    }

    @Inject
    public x0(@Y61.k LocationPickerState locationPickerState, @Y61.k InterfaceC31579a interfaceC31579a, @Y61.k InterfaceC31581c interfaceC31581c, @Y61.k InterfaceC31580b interfaceC31580b, @Y61.k InterfaceC31564a interfaceC31564a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33034d interfaceC33034d, @Y61.l com.avito.android.location_picker.providers.w wVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k com.avito.android.location_picker.providers.C c12, @Y61.k InterfaceC31569f interfaceC31569f, @Y61.k InterfaceC31565b interfaceC31565b, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k O0 o02, @Y61.k com.avito.android.location_picker.analytics.a aVar, @Y61.k com.avito.android.location_picker.job.a aVar2, @Y61.k com.avito.android.location_picker.job.f fVar, @Y61.k com.avito.android.util.C c13, @Y61.k C44245a c44245a, @com.avito.android.location_picker.di.x boolean z12, @com.avito.android.location_picker.di.b boolean z13, @Y61.k LocationFlowType locationFlowType) {
        this.f182807a = locationPickerState;
        this.f182808b = interfaceC31579a;
        this.f182809c = interfaceC31581c;
        this.f182810d = interfaceC31580b;
        this.f182811e = interfaceC31564a;
        this.f182812f = interfaceC35745a5;
        this.f182813g = interfaceC33034d;
        this.f182814h = wVar;
        this.f182815i = interfaceC43691a;
        this.f182816j = c12;
        this.f182817k = interfaceC31569f;
        this.f182818l = interfaceC31565b;
        this.f182819m = searchParamsConverter;
        this.f182820n = o02;
        this.f182821o = aVar;
        this.f182822p = aVar2;
        this.f182823q = fVar;
        this.f182824r = c13;
        this.f182825s = c44245a;
        this.f182826t = z12;
        this.f182827u = z13;
        this.f182828v = locationFlowType;
    }

    public static final ArrayList e(x0 x0Var, List list, String str) {
        x0Var.getClass();
        List<Radius> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Radius radius : list2) {
            radius.setActive(kotlin.jvm.internal.L.f(radius.getId(), str));
            arrayList.add(radius);
        }
        return arrayList;
    }

    public static final AvitoMapPoint f(x0 x0Var, Coordinates coordinates) {
        x0Var.getClass();
        return new AvitoMapPoint(coordinates.getLatitude(), coordinates.getLongitude(), null, 4, null);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.L0 g(x0 x0Var, io.reactivex.rxjava3.core.z zVar, Y41.p pVar) {
        Y41.p<LocationPickerState, Throwable, LocationPickerState> pVar2 = x0Var.f182832z;
        x0Var.getClass();
        return zVar.d0(new z0(pVar)).m0(new B0(pVar2));
    }

    @Override // com.avito.android.location_picker.InterfaceC31532a
    public final void a() {
        this.f182829w = null;
        this.f182810d.onStop();
    }

    @Override // com.avito.android.location_picker.InterfaceC31532a
    public final void b() {
        this.f182815i.g();
    }

    @Override // com.avito.android.location_picker.InterfaceC31532a
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c c() {
        com.jakewharton.rxrelay3.b f182678o = this.f182809c.getF182678O();
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = io.reactivex.rxjava3.core.z.F0(5L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(C0.f182101b);
        InterfaceC35745a5 interfaceC35745a5 = this.f182812f;
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = b0D0.j0(interfaceC35745a5.e());
        f182678o.getClass();
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J02 = new I1(new C41953h(new io.reactivex.rxjava3.core.E[]{f182678o, i0J0}, null), interfaceC35745a5.e()).y0(new E0(this)).j0(interfaceC35745a5.e());
        com.jakewharton.rxrelay3.b<LocationPickerState> bVar = this.f182830x;
        return new io.reactivex.rxjava3.disposables.c(i0J02.t0(bVar), C31589k.a(this.f182808b, bVar, this.f182820n));
    }

    @Override // com.avito.android.location_picker.InterfaceC31532a
    public final void d(@Y61.k LocationPickerFragment locationPickerFragment) {
        this.f182829w = locationPickerFragment;
        this.f182810d.onStart();
    }

    @Override // com.avito.android.location_picker.InterfaceC31532a
    public final void destroy() {
        this.f182810d.e();
    }

    @Override // com.avito.android.location_picker.InterfaceC31532a
    @Y61.l
    public final LocationPickerState f0() {
        return this.f182830x.f364266b.get();
    }
}
