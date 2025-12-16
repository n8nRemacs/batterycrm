package com.avito.android.location_list;

import Fc1.D3;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.location_list.analytics.FromBlock;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SimpleLocation;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.jakewharton.rxbinding4.widget.C37750f0;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;
import lW.InterfaceC43691a;
import okhttp3.internal.http2.Http2;
import rW.InterfaceC47603a;

/* compiled from: LocationListPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/a0;", "Lcom/avito/android/location_list/T;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a0 implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f181901a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47603a f181902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f181903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f181904d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final S f181905e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.find.l f181906f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.fragments.c f181907g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f181908h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f181909i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f181910j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Location f181911k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Location f181912l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f181913m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f181914n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f181915o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33034d f181916p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f181917q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f181918r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f181919s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public k0 f181920t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public LocationListFragment f181921u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public String f181922v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Location f181923w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public List<Location> f181924x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public List<Location> f181925y;

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            a0 a0Var = a0.this;
            a0Var.getClass();
            if (!(p22 instanceof P2.b)) {
                if (!(p22 instanceof P2.c)) {
                    if (p22 instanceof P2.a) {
                        a0Var.w(((P2.a) p22).f318719a);
                        return;
                    }
                    return;
                } else {
                    k0 k0Var = a0Var.f181920t;
                    if (k0Var != null) {
                        k0Var.f182061h.k(null);
                        D6.w(k0Var.f182055b.findViewById(R.id.content));
                        return;
                    }
                    return;
                }
            }
            T t12 = ((P2.b) p22).f318720a;
            List<Location> list = (List) t12;
            a0Var.y(a0Var.o(list, null));
            k0 k0Var2 = a0Var.f181920t;
            if (k0Var2 != null) {
                k0Var2.f182061h.j();
            }
            k0 k0Var3 = a0Var.f181920t;
            if (k0Var3 != null) {
                K2.i(k0Var3.f182059f);
            }
            if (kotlin.jvm.internal.L.f(t12, a0Var.f181925y)) {
                return;
            }
            k0 k0Var4 = a0Var.f181920t;
            if (k0Var4 != null) {
                k0Var4.c();
            }
            a0Var.f181925y = list;
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f181927b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super P2<? super Location>, G0> lVar) {
            this.f181927b = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f181927b.invoke((P2) obj);
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f181928b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("LocationListPresenter", "loadSelectedLocation error: " + ((Throwable) obj));
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a0 a0Var = a0.this;
            a0.n(a0Var, (P2) obj, a0Var.p());
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f181930b = new e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("LocationListPresenter", "loadTopLocations error: " + ((Throwable) obj));
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            a0 a0Var = a0.this;
            if (str.equals(a0Var.f181922v)) {
                return;
            }
            a0Var.r(str);
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f181932b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a0 a0Var = a0.this;
            a0Var.r(a0Var.f181922v);
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f181934b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a0 a0Var = a0.this;
            if (a0Var.f181915o) {
                Location location = a0Var.f181911k;
                a0Var.f181902b.b(a0Var.f181914n, location != null ? location.getId() : null, a0Var.f181922v, FromBlock.f181942e);
            }
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
            a0Var.f181917q.e("profile");
            a0Var.f181919s.b(a0Var.f181916p.g());
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f181936b = new k<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f181938c;

        public l(k0 k0Var) {
            this.f181938c = k0Var;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a0 a0Var = a0.this;
            if (a0Var.f181912l == null && a0Var.f181915o) {
                Location location = a0Var.f181911k;
                a0Var.f181902b.b(a0Var.f181914n, location != null ? location.getId() : null, a0Var.f181922v, FromBlock.f181940c);
            }
            this.f181938c.b();
            a0Var.f181907g.i0();
        }
    }

    /* compiled from: LocationListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final m<T> f181939b = new m<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public a0(@Y61.k G g12, @Y61.k InterfaceC47603a interfaceC47603a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l Bundle bundle, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k S s5, @Y61.k com.avito.android.location.find.l lVar, @Y61.k com.avito.android.ui.fragments.c cVar, @Y61.k String str, boolean z12, boolean z13, @Y61.l Location location, @Y61.l Location location2, boolean z14, @Y61.l String str2, boolean z15, @Y61.k InterfaceC33034d interfaceC33034d, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f181901a = g12;
        this.f181902b = interfaceC47603a;
        this.f181903c = interfaceC35745a5;
        this.f181904d = aVar;
        this.f181905e = s5;
        this.f181906f = lVar;
        this.f181907g = cVar;
        this.f181908h = str;
        this.f181909i = z12;
        this.f181910j = z13;
        this.f181911k = location;
        this.f181912l = location2;
        this.f181913m = z14;
        this.f181914n = str2;
        this.f181915o = z15;
        this.f181916p = interfaceC33034d;
        this.f181917q = interfaceC43691a;
        this.f181918r = screenPerformanceTracker;
        this.f181919s = new io.reactivex.rxjava3.disposables.c();
        this.f181922v = "";
        if (bundle != null) {
            this.f181909i = bundle.getBoolean("hasRegion");
            this.f181910j = bundle.getBoolean("showWholeLocations");
            int i12 = Build.VERSION.SDK_INT;
            this.f181911k = (Location) (i12 >= 34 ? (Parcelable) bundle.getParcelable("selectedLocation", Location.class) : bundle.getParcelable("selectedLocation"));
            this.f181912l = (Location) (i12 >= 34 ? (Parcelable) bundle.getParcelable("parentLocation", Location.class) : bundle.getParcelable("parentLocation"));
            this.f181923w = (Location) (i12 >= 34 ? (Parcelable) bundle.getParcelable("topLocation", Location.class) : bundle.getParcelable("topLocation"));
            String string = bundle.getString("searchQuery");
            this.f181922v = string != null ? string : "";
            this.f181924x = bundle.getParcelableArrayList("locations");
        }
        if (this.f181912l == null && z15) {
            Location location3 = this.f181911k;
            interfaceC47603a.a(str2, location3 != null ? location3.getId() : null);
        }
    }

    public static final void n(a0 a0Var, P2 p22, C31518l c31518l) {
        a0Var.getClass();
        if (p22 instanceof P2.b) {
            List<Location> list = (List) ((P2.b) p22).f318720a;
            a0Var.f181924x = list;
            if (list != null) {
                a0Var.y(a0Var.o(list, c31518l));
            }
            k0 k0Var = a0Var.f181920t;
            if (k0Var != null) {
                k0Var.f182061h.j();
            }
            k0 k0Var2 = a0Var.f181920t;
            if (k0Var2 != null) {
                K2.i(k0Var2.f182059f);
            }
            k0 k0Var3 = a0Var.f181920t;
            if (k0Var3 != null) {
                k0Var3.c();
                return;
            }
            return;
        }
        if (p22 instanceof P2.c) {
            k0 k0Var4 = a0Var.f181920t;
            if (k0Var4 != null) {
                k0Var4.f182061h.k(null);
                D6.w(k0Var4.f182055b.findViewById(R.id.content));
                return;
            }
            return;
        }
        if (p22 instanceof P2.a) {
            if (!(((P2.a) p22).f318719a instanceof ApiError.NetworkIOError)) {
                k0 k0Var5 = a0Var.f181920t;
                if (k0Var5 != null) {
                    k0Var5.f182061h.j();
                    return;
                }
                return;
            }
            k0 k0Var6 = a0Var.f181920t;
            if (k0Var6 != null) {
                k0Var6.f182061h.a("");
                D6.w(k0Var6.f182055b.findViewById(R.id.content));
            }
        }
    }

    @Override // com.avito.android.location_list.T
    public final void S() {
        this.f181917q.f(null, "PERMISSION DENIED");
        this.f181919s.b(this.f181916p.h());
    }

    @Override // com.avito.android.location_list.T
    public final void a(@Y61.k Context context) {
        this.f181906f.a(context);
    }

    @Override // com.avito.android.location_list.T
    public final void b() {
        this.f181917q.g();
    }

    @Override // com.avito.android.location_list.T
    public final void c(@Y61.k Context context) {
        this.f181906f.c(context);
    }

    @Override // com.avito.android.location_list.T
    public final void d(@Y61.l String str) {
        if (str != null) {
            this.f181917q.f(null, str);
            k0 k0Var = this.f181920t;
            if (k0Var != null) {
                k0Var.d();
            }
        }
    }

    @Override // com.avito.android.location_list.InterfaceC31509c
    public final void e(@Y61.k Location location) {
        ActivityC22955m activityC22955mL1;
        if (this.f181915o) {
            this.f181902b.b(this.f181914n, location.getId(), this.f181922v, FromBlock.f181943f);
        }
        this.f181905e.Z(location);
        k0 k0Var = this.f181920t;
        if (k0Var != null) {
            k0Var.b();
        }
        LocationListFragment locationListFragment = this.f181921u;
        if (locationListFragment == null || (activityC22955mL1 = locationListFragment.l1()) == null) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // com.avito.android.location_list.T
    public final void f() {
        this.f181921u = null;
    }

    @Override // com.avito.android.location_list.T
    public final void g(@Y61.k k0 k0Var) {
        this.f181920t = k0Var;
        boolean z12 = this.f181909i;
        Toolbar toolbar = k0Var.f182058e;
        if (z12) {
            toolbar.setNavigationIcon(R.drawable.ic_close_24_blue);
        } else {
            toolbar.setNavigationIcon(R.drawable.ic_back_24_blue);
        }
        x();
        this.f181925y = this.f181901a.f(this.f181922v);
    }

    @Override // com.avito.android.location_list.T
    @Y61.k
    public final Bundle getState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hasRegion", this.f181909i);
        bundle.putBoolean("showWholeLocations", this.f181910j);
        bundle.putParcelable("selectedLocation", this.f181911k);
        bundle.putParcelable("parentLocation", this.f181912l);
        bundle.putParcelable("topLocation", this.f181923w);
        bundle.putString("searchQuery", this.f181922v);
        com.avito.android.util.G.e("locations", bundle, this.f181924x);
        return bundle;
    }

    @Override // com.avito.android.location_list.m0
    public final void h(@Y61.k String str) {
        Location location;
        Object next;
        ActivityC22955m activityC22955mL1;
        Location location2 = this.f181923w;
        boolean zF2 = kotlin.jvm.internal.L.f(location2 != null ? location2.getId() : null, str);
        Location location3 = this.f181912l;
        if (zF2) {
            location = this.f181923w;
        } else {
            if (kotlin.jvm.internal.L.f(location3 != null ? location3.getId() : null, str)) {
                location = location3;
            } else {
                List<Location> listF = C43066x.K(this.f181922v) ? this.f181924x : this.f181901a.f(this.f181922v);
                if (listF != null) {
                    Iterator<T> it = listF.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (kotlin.jvm.internal.L.f(((Location) next).getId(), str)) {
                                break;
                            }
                        }
                    }
                    location = (Location) next;
                } else {
                    location = null;
                }
            }
        }
        if (location != null) {
            boolean zEquals = location.equals(this.f181923w);
            S s5 = this.f181905e;
            if (!zEquals && !location.equals(this.f181912l) && location.getHasChildren()) {
                s5.i1(location);
                return;
            }
            if ((!location.equals(this.f181923w) && !location.equals(this.f181912l)) || this.f181912l == null) {
                location3 = location;
            }
            if (this.f181915o) {
                this.f181902b.b(this.f181914n, location3 != null ? location3.getId() : null, this.f181922v, FromBlock.f181941d);
            }
            s5.Z(location3);
            k0 k0Var = this.f181920t;
            if (k0Var != null) {
                k0Var.b();
            }
            LocationListFragment locationListFragment = this.f181921u;
            if (locationListFragment == null || (activityC22955mL1 = locationListFragment.l1()) == null) {
                return;
            }
            activityC22955mL1.finish();
        }
    }

    @Override // com.avito.android.location_list.T
    public final void i() {
        r(this.f181922v);
    }

    @Override // com.avito.android.location_list.T
    public final void j(@Y61.k ActivityC22955m activityC22955m) {
        k0 k0Var = this.f181920t;
        if (k0Var != null) {
            ProgressDialog progressDialog = k0Var.f182062i;
            if (progressDialog == null) {
                androidx.appcompat.app.m mVar = k0Var.f182060g;
                k0Var.f182062i = ProgressDialog.show(mVar, null, mVar.getString(R.string.detecting), true, true, new D3(k0Var, 12));
            } else {
                com.avito.android.lib.util.g.a(progressDialog);
            }
        }
        io.reactivex.rxjava3.core.z zVarB = this.f181906f.b(activityC22955m, (4 & 2) == 0, (4 & 4) == 0);
        U u12 = new U(this);
        V v12 = new V(this);
        zVarB.getClass();
        this.f181919s.b(zVarB.v0(u12, v12, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.location_list.T
    public final void k(@Y61.k LocationListFragment locationListFragment) {
        this.f181921u = locationListFragment;
    }

    @Override // com.avito.android.location_list.T
    public final void l() {
        k0 k0Var = this.f181920t;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // com.avito.android.location_list.T
    public final void m() {
        this.f181919s.e();
        this.f181920t = null;
    }

    public final UV0.c<C31518l> o(List<Location> list, C31518l c31518l) {
        ArrayList arrayList = new ArrayList(C42784z0.f406748b);
        Iterator<T> it = list.iterator();
        while (true) {
            String f119974b = null;
            if (!it.hasNext()) {
                break;
            }
            Location location = (Location) it.next();
            String id2 = location.getId();
            String f119974b2 = location.getF119974b();
            SimpleLocation parent = location.getParent();
            if (parent != null) {
                f119974b = parent.getF119974b();
            }
            C31518l c31518l2 = new C31518l(id2, f119974b2, f119974b, false, 8, null);
            c31518l2.f182072e = q(c31518l2.f182069b);
            arrayList.add(c31518l2);
        }
        if (this.f181910j) {
            if (c31518l != null) {
                c31518l.f182072e = q(c31518l.f182069b);
                G0 g02 = G0.f406611a;
            } else {
                c31518l = null;
            }
            if (c31518l != null) {
                arrayList.add(0, c31518l);
            }
        }
        return new UV0.c<>(arrayList);
    }

    public final C31518l p() {
        Location location = this.f181923w;
        if (location == null) {
            return null;
        }
        String id2 = location.getId();
        String f119974b = location.getF119974b();
        SimpleLocation parent = location.getParent();
        return new C31518l(id2, f119974b, parent != null ? parent.getF119974b() : null, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.String r3) {
        /*
            r2 = this;
            com.avito.android.remote.model.Location r0 = r2.f181911k
            r1 = 0
            if (r0 == 0) goto La
            java.lang.String r0 = r0.getId()
            goto Lb
        La:
            r0 = r1
        Lb:
            boolean r0 = kotlin.jvm.internal.L.f(r0, r3)
            if (r0 != 0) goto L39
            com.avito.android.remote.model.Location r0 = r2.f181912l
            if (r0 != 0) goto L3f
            com.avito.android.location_list.l r0 = r2.p()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.f182069b
            goto L1f
        L1e:
            r0 = r1
        L1f:
            boolean r0 = kotlin.jvm.internal.L.f(r0, r3)
            if (r0 != 0) goto L3f
            com.avito.android.remote.model.Location r0 = r2.f181911k
            if (r0 == 0) goto L33
            com.avito.android.remote.model.SimpleLocation r0 = r0.getParent()
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.getId()
        L33:
            boolean r3 = kotlin.jvm.internal.L.f(r1, r3)
            if (r3 == 0) goto L3f
        L39:
            boolean r3 = r2.f181913m
            if (r3 != 0) goto L3f
            r3 = 1
            goto L40
        L3f:
            r3 = 0
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location_list.a0.q(java.lang.String):boolean");
    }

    public final void r(String str) {
        String id2;
        if (C43066x.K(str)) {
            this.f181922v = "";
            Location location = this.f181911k;
            if (location != null) {
                SimpleLocation parent = location.getParent();
                id2 = parent != null ? parent.getId() : null;
                if (id2 == null || C43066x.K(id2)) {
                    u(new Z(this));
                    return;
                }
            }
            s();
            return;
        }
        this.f181922v = str;
        Location location2 = this.f181911k;
        if (location2 != null) {
            SimpleLocation parent2 = location2.getParent();
            id2 = parent2 != null ? parent2.getId() : null;
            if (id2 == null || C43066x.K(id2)) {
                u(new d0(this));
                return;
            }
        }
        t();
    }

    public final void s() {
        String id2;
        C31518l c31518l;
        List<Location> list = this.f181924x;
        Location location = this.f181912l;
        if (list == null) {
            io.reactivex.rxjava3.disposables.c cVar = this.f181919s;
            InterfaceC35745a5 interfaceC35745a5 = this.f181903c;
            G g12 = this.f181901a;
            if (location != null) {
                cVar.b(g12.a(location).j0(interfaceC35745a5.e()).v0(new X(this), Y.f181898b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                return;
            } else if (this.f181923w == null) {
                cVar.b(g12.e().j0(interfaceC35745a5.e()).v0(new b0(this), c0.f181948b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                return;
            } else {
                v();
                return;
            }
        }
        if (location == null) {
            c31518l = p();
        } else {
            if (location == null || (id2 = location.getId()) == null) {
                id2 = "stub";
            }
            c31518l = new C31518l(id2, this.f181908h, null, false, 8, null);
        }
        y(o(list, c31518l));
        k0 k0Var = this.f181920t;
        if (k0Var != null) {
            k0Var.f182061h.j();
        }
        k0 k0Var2 = this.f181920t;
        if (k0Var2 != null) {
            K2.i(k0Var2.f182059f);
        }
    }

    public final void t() {
        this.f181924x = null;
        io.reactivex.rxjava3.disposables.c cVar = this.f181919s;
        cVar.e();
        x();
        cVar.b(this.f181901a.d(this.f181922v).j0(this.f181903c.e()).t0(new a()));
    }

    public final void u(Y41.l<? super P2<? super Location>, G0> lVar) {
        String id2;
        Location location = this.f181911k;
        if (location == null || (id2 = location.getId()) == null) {
            return;
        }
        this.f181919s.b(this.f181901a.b(id2).j0(this.f181903c.e()).v0(new b(lVar), c.f181928b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void v() {
        this.f181919s.b(this.f181901a.g().j0(this.f181903c.e()).v0(new d(), e.f181930b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void w(ApiError apiError) {
        if (apiError instanceof ApiError.NetworkIOError) {
            k0 k0Var = this.f181920t;
            if (k0Var != null) {
                k0Var.f182061h.a("");
                D6.w(k0Var.f182055b.findViewById(R.id.content));
                return;
            }
            return;
        }
        if (!(apiError instanceof ApiError.NotFound)) {
            k0 k0Var2 = this.f181920t;
            if (k0Var2 != null) {
                k0Var2.f182061h.a("");
                D6.w(k0Var2.f182055b.findViewById(R.id.content));
                return;
            }
            return;
        }
        y(new UV0.c<>(C42784z0.f406748b));
        k0 k0Var3 = this.f181920t;
        if (k0Var3 != null) {
            k0Var3.f182061h.j();
        }
        k0 k0Var4 = this.f181920t;
        if (k0Var4 != null) {
            K2.i(k0Var4.f182059f);
        }
    }

    public final void x() {
        k0 k0Var = this.f181920t;
        if (k0Var == null) {
            return;
        }
        B0 b0D0 = C37750f0.c(k0Var.f182059f).q0(1L).K(new i0(k0Var)).d0(new l41.o() { // from class: com.avito.android.location_list.j0
            @Override // l41.o
            public final Object apply(Object obj) {
                return String.valueOf((CharSequence) obj);
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f181903c;
        I0 i0J0 = b0D0.y(600L, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e());
        f fVar = new f();
        l41.g<? super Throwable> gVar = g.f181932b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(fVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f181919s;
        cVar.b(dVarV0);
        cVar.b(k0Var.f182066m.j0(interfaceC35745a5.e()).v0(new h(), i.f181934b, interfaceC43543a));
        cVar.b(k0Var.f182067n.j0(interfaceC35745a5.e()).v0(new j(), k.f181936b, interfaceC43543a));
        cVar.b(k0Var.f182068o.j0(interfaceC35745a5.e()).v0(new l(k0Var), m.f181939b, interfaceC43543a));
    }

    public final void y(UV0.c<C31518l> cVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f181918r;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        this.f181904d.c(cVar);
        k0 k0Var = this.f181920t;
        if (k0Var != null) {
            RecyclerView recyclerView = k0Var.f182056c;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            com.avito.konveyor.adapter.j jVar = k0Var.f182063j;
            if (adapter == null) {
                recyclerView.setAdapter(jVar);
            }
            jVar.notifyDataSetChanged();
        }
        if (cVar.f16399b.isEmpty()) {
            k0 k0Var2 = this.f181920t;
            if (k0Var2 != null) {
                D6.H(k0Var2.f182057d);
                D6.w(k0Var2.f182056c);
            }
        } else {
            k0 k0Var3 = this.f181920t;
            if (k0Var3 != null) {
                D6.H(k0Var3.f182056c);
                D6.w(k0Var3.f182057d);
            }
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    public /* synthetic */ a0(G g12, InterfaceC47603a interfaceC47603a, InterfaceC35745a5 interfaceC35745a5, Bundle bundle, com.avito.konveyor.adapter.a aVar, S s5, com.avito.android.location.find.l lVar, com.avito.android.ui.fragments.c cVar, String str, boolean z12, boolean z13, Location location, Location location2, boolean z14, String str2, boolean z15, InterfaceC33034d interfaceC33034d, InterfaceC43691a interfaceC43691a, ScreenPerformanceTracker screenPerformanceTracker, int i12, C42822w c42822w) {
        this(g12, interfaceC47603a, interfaceC35745a5, bundle, aVar, s5, lVar, cVar, str, (i12 & 512) != 0 ? false : z12, (i12 & 1024) != 0 ? false : z13, (i12 & 2048) != 0 ? null : location, (i12 & 4096) != 0 ? null : location2, (i12 & 8192) != 0 ? false : z14, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str2, (i12 & 32768) != 0 ? false : z15, interfaceC33034d, interfaceC43691a, screenPerformanceTracker);
    }
}
