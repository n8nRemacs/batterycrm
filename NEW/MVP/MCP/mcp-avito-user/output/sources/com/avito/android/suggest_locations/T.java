package com.avito.android.suggest_locations;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Location;
import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import com.avito.android.suggest_locations.analytics.FromBlock;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import nF.C44245a;
import sA0.InterfaceC48020a;

/* compiled from: SuggestLocationsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/T;", "Lcom/avito/android/suggest_locations/z;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class T implements InterfaceC35160z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35144i f292168a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48020a f292169b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f292170c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f292171d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f292172e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f292173f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f292174g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f292175h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final PublishIntentFactory.SuggestLocationsFlowType f292176i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f292177j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f292178k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Boolean f292179l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C44245a f292180m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f292181n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public d0 f292182o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public SuggestLocationsFragment f292183p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f292184q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f292185r = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public String f292186s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public SuggestLocationItem f292187t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public List<SuggestLocationItem> f292188u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public List<AddressSuggestion> f292189v;

    @Inject
    public T(@Y61.k InterfaceC35144i interfaceC35144i, @Y61.k InterfaceC48020a interfaceC48020a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @com.avito.android.suggest_locations.di.g @Y61.l String str, @com.avito.android.suggest_locations.di.c @Y61.l String str2, @Y61.l @com.avito.android.suggest_locations.di.i Integer num, @com.avito.android.suggest_locations.di.k boolean z12, @Y61.l @com.avito.android.suggest_locations.di.a String str3, @Y61.k @com.avito.android.suggest_locations.di.e PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, @com.avito.android.suggest_locations.di.f @Y61.l String str4, @com.avito.android.suggest_locations.di.w boolean z13, @Y61.l @com.avito.android.suggest_locations.di.h Boolean bool, @Y61.k C44245a c44245a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l Kundle kundle) {
        this.f292168a = interfaceC35144i;
        this.f292169b = interfaceC48020a;
        this.f292170c = interfaceC35745a5;
        this.f292171d = str;
        this.f292172e = str2;
        this.f292173f = num;
        this.f292174g = z12;
        this.f292175h = str3;
        this.f292176i = suggestLocationsFlowType;
        this.f292177j = str4;
        this.f292178k = z13;
        this.f292179l = bool;
        this.f292180m = c44245a;
        this.f292181n = screenPerformanceTracker;
        this.f292186s = "";
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f292188u = c42784z0;
        this.f292189v = c42784z0;
        if (kundle != null) {
            List<SuggestLocationItem> listE = kundle.e("key_suggests");
            if (listE != null) {
                this.f292188u = listE;
                d0 d0Var = this.f292182o;
                if (d0Var != null) {
                    d0Var.f(listE);
                }
            }
            String strG = kundle.g("key_query");
            if (strG != null) {
                this.f292186s = strG;
            }
        }
    }

    public static final void c(T t12, SuggestLocationItem suggestLocationItem) {
        Location location;
        t12.getClass();
        String str = suggestLocationItem.f292214b;
        SuggestLocationItem.From from = suggestLocationItem.f292216d;
        Location location2 = new Location(str, suggestLocationItem.f292215c, false, false, false, false, null, from != null ? new Location.From(from.f292219b, from.f292220c, from.f292221d) : null, false, null, null, from != null ? from.f292219b : null, 1916, null);
        if (t12.f292177j != null) {
            location = location2;
            location.setForcedLocationForRecommendation(Boolean.TRUE);
        } else {
            location = location2;
        }
        SuggestLocationsFragment suggestLocationsFragment = t12.f292183p;
        if (suggestLocationsFragment != null) {
            K2.e(suggestLocationsFragment);
            suggestLocationsFragment.G5();
            com.avito.android.util.architecture_components.D<Location> d12 = suggestLocationsFragment.f292143E0;
            if (d12.hasActiveObservers()) {
                d12.setValue(location);
                return;
            }
            if (!(suggestLocationsFragment.l1() instanceof SuggestLocationsActivity)) {
                Intent intent = new Intent();
                intent.putExtra("location", location);
                suggestLocationsFragment.B5(-1, intent);
                suggestLocationsFragment.r5();
                return;
            }
            ActivityC22955m activityC22955mL1 = suggestLocationsFragment.l1();
            if (activityC22955mL1 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("location", location);
                activityC22955mL1.setResult(-1, intent2);
            }
            ActivityC22955m activityC22955mL12 = suggestLocationsFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.finish();
            }
        }
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35160z
    public final void a(@Y61.k SuggestLocationsFragment suggestLocationsFragment) {
        this.f292183p = suggestLocationsFragment;
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35160z
    public final void b(@Y61.k d0 d0Var) {
        io.reactivex.rxjava3.core.z zVarM;
        io.reactivex.rxjava3.core.z zVarM2;
        G0 g02;
        this.f292182o = d0Var;
        this.f292169b.b(this.f292173f, this.f292172e, this.f292171d, this.f292177j);
        com.avito.android.suggest_locations.adapter.e eVar = d0Var.f292266g;
        io.reactivex.rxjava3.subjects.e eVar2 = eVar.f292243j;
        InterfaceC35745a5 interfaceC35745a5 = this.f292170c;
        I0 i0J0 = eVar2.j0(interfaceC35745a5.e());
        E e12 = new E(this);
        l41.g<? super Throwable> gVar = F.f292107b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(e12, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f292185r;
        cVar.b(dVarV0);
        cVar.b(eVar.f292244k.T(new H(this), Integer.MAX_VALUE).j0(interfaceC35745a5.e()).v0(new I(this), new J(d0Var), interfaceC43543a));
        X x12 = d0Var.f292268i;
        cVar.b((x12 != null ? x12.d() : io.reactivex.rxjava3.core.z.M(new Exception("searchView is null"))).q0(1L).y(400L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).v0(new K(this), L.f292113b, interfaceC43543a));
        if (x12 == null || (zVarM = x12.c()) == null) {
            zVarM = io.reactivex.rxjava3.core.z.M(new Exception("searchView is null"));
        }
        cVar.b(zVarM.j0(interfaceC35745a5.e()).v0(new M(this), N.f292115b, interfaceC43543a));
        if (x12 == null || (zVarM2 = x12.b()) == null) {
            zVarM2 = io.reactivex.rxjava3.core.z.M(new Exception("searchView is null"));
        }
        cVar.b(zVarM2.j0(interfaceC35745a5.e()).v0(new A(this), B.f292103b, interfaceC43543a));
        cVar.b(d0Var.f292263d.j0(interfaceC35745a5.e()).v0(new C(this), D.f292105b, interfaceC43543a));
        if (this.f292188u.isEmpty()) {
            String str = this.f292175h;
            if (str != null) {
                this.f292186s = str;
                if (x12 != null) {
                    x12.a(str);
                }
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                d("");
            }
        }
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35160z
    public final void c0() {
        this.f292184q.e();
        this.f292183p = null;
    }

    public final void d(@Y61.k String str) {
        C42007e c42007eC;
        ScreenPerformanceTracker.a.b(this.f292181n, null, 3);
        boolean z12 = this.f292174g;
        io.reactivex.rxjava3.disposables.c cVar = this.f292184q;
        InterfaceC35144i interfaceC35144i = this.f292168a;
        InterfaceC35745a5 interfaceC35745a5 = this.f292170c;
        if (!z12) {
            if (!this.f292178k) {
                c42007eC = interfaceC35144i.c(this.f292179l, str, this.f292171d);
            } else if (str.length() == 0) {
                return;
            } else {
                c42007eC = interfaceC35144i.a(str);
            }
            cVar.b(c42007eC.s(interfaceC35745a5.e()).x(new S(this), io.reactivex.rxjava3.internal.functions.a.f401996f));
            return;
        }
        int length = str.length();
        PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = this.f292176i;
        if (length == 0 && !kotlin.jvm.internal.L.f(suggestLocationsFlowType, PublishIntentFactory.SuggestLocationsFlowType.Historical.f231997b)) {
            d0 d0Var = this.f292182o;
            if (d0Var != null) {
                d0Var.e(C42784z0.f406748b);
                return;
            }
            return;
        }
        C44245a c44245a = this.f292180m;
        c44245a.getClass();
        kotlin.reflect.n<Object> nVar = C44245a.f414956i[4];
        if (((Boolean) c44245a.f414961f.a().invoke()).booleanValue()) {
            cVar.b(interfaceC35144i.b(str).s(interfaceC35745a5.e()).x(new O(this), io.reactivex.rxjava3.internal.functions.a.f401996f));
        } else {
            cVar.b(interfaceC35144i.d(str, kotlin.jvm.internal.L.f(suggestLocationsFlowType, PublishIntentFactory.SuggestLocationsFlowType.Region.f231998b) ? "locality" : null).s(interfaceC35745a5.e()).x(new P(this), new Q(this)));
        }
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35160z
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("key_suggests", this.f292188u);
        kundle.m("key_query", this.f292186s);
        return kundle;
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35160z
    public final void e0() {
        this.f292185r.e();
        this.f292182o = null;
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35160z
    public final void i0() {
        String str = this.f292186s;
        FromBlock fromBlock = FromBlock.f292253c;
        String str2 = this.f292172e;
        String str3 = this.f292171d;
        this.f292169b.a(str2, str3, str, fromBlock, this.f292173f, str3, this.f292177j);
    }
}
