package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.view.AbstractC22993a;
import androidx.view.C22985S;
import androidx.view.C23060r0;
import androidx.view.C23066u0;
import androidx.view.C23074y0;
import androidx.view.C23485c;
import androidx.view.C23486d;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;
import z1.C50343e;

/* compiled from: NavBackStackEntry.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/navigation/u;", "Landroidx/lifecycle/P;", "Landroidx/lifecycle/T0;", "Landroidx/lifecycle/B;", "Landroidx/savedstate/e;", "a", "b", "c", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23395u implements InterfaceC22983P, T0, InterfaceC22969B, InterfaceC23487e {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f53180p = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Context f53181b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public C23317W f53182c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Bundle f53183d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public Lifecycle.State f53184e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final InterfaceC23294I0 f53185f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f53186g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Bundle f53187h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C22985S f53188i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C23486d f53189j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f53190k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53191l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53192m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public Lifecycle.State f53193n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final C23074y0 f53194o;

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/u$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.u$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static C23395u a(a aVar, Context context, C23317W c23317w, Bundle bundle, Lifecycle.State state, InterfaceC23294I0 interfaceC23294I0) {
            String string = UUID.randomUUID().toString();
            aVar.getClass();
            return new C23395u(context, c23317w, bundle, state, interfaceC23294I0, string, null, null);
        }

        public a() {
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/u$b;", "Landroidx/lifecycle/a;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.u$b */
    public static final class b extends AbstractC22993a {
        @Override // androidx.view.AbstractC22993a
        @k
        public final <T extends M0> T create(@k String str, @k Class<T> cls, @k C23060r0 c23060r0) {
            return new c(c23060r0);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/u$c;", "Landroidx/lifecycle/M0;", "Landroidx/lifecycle/r0;", "handle", "<init>", "(Landroidx/lifecycle/r0;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.u$c */
    public static final class c extends M0 {

        /* renamed from: E, reason: collision with root package name */
        @k
        public final C23060r0 f53195E;

        public c(@k C23060r0 c23060r0) {
            this.f53195E = c23060r0;
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/y0;", "invoke", "()Landroidx/lifecycle/y0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.u$d */
    public static final class d extends N implements Y41.a<C23074y0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final C23074y0 invoke() {
            C23395u c23395u = C23395u.this;
            Context context = c23395u.f53181b;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            return new C23074y0(applicationContext instanceof Application ? (Application) applicationContext : null, c23395u, c23395u.a());
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/r0;", "invoke", "()Landroidx/lifecycle/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.u$e */
    public static final class e extends N implements Y41.a<C23060r0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final C23060r0 invoke() {
            C23395u c23395u = C23395u.this;
            if (!c23395u.f53190k) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (c23395u.f53188i.f46705d != Lifecycle.State.f46679b) {
                return ((c) new P0(c23395u, new b(c23395u, null)).a(c.class)).f53195E;
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public /* synthetic */ C23395u(Context context, C23317W c23317w, Bundle bundle, Lifecycle.State state, InterfaceC23294I0 interfaceC23294I0, String str, Bundle bundle2, C42822w c42822w) {
        this(context, c23317w, bundle, state, interfaceC23294I0, str, bundle2);
    }

    @l
    public final Bundle a() {
        Bundle bundle = this.f53183d;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @RestrictTo
    public final void b(@k Lifecycle.State state) {
        this.f53193n = state;
        c();
    }

    @RestrictTo
    public final void c() {
        if (!this.f53190k) {
            C23486d c23486d = this.f53189j;
            c23486d.a();
            this.f53190k = true;
            if (this.f53185f != null) {
                C23066u0.b(this);
            }
            c23486d.b(this.f53187h);
        }
        int iOrdinal = this.f53184e.ordinal();
        int iOrdinal2 = this.f53193n.ordinal();
        C22985S c22985s = this.f53188i;
        if (iOrdinal < iOrdinal2) {
            c22985s.h(this.f53184e);
        } else {
            c22985s.h(this.f53193n);
        }
    }

    public final boolean equals(@l Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof C23395u)) {
            return false;
        }
        C23395u c23395u = (C23395u) obj;
        if (!L.f(this.f53186g, c23395u.f53186g) || !L.f(this.f53182c, c23395u.f53182c) || !L.f(this.f53188i, c23395u.f53188i) || !L.f(this.f53189j.f54434b, c23395u.f53189j.f54434b)) {
            return false;
        }
        Bundle bundle = this.f53183d;
        Bundle bundle2 = c23395u.f53183d;
        if (!L.f(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!L.f(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.view.InterfaceC22969B
    @k
    public final AbstractC50339a getDefaultViewModelCreationExtras() {
        C50343e c50343e = new C50343e(null, 1, null);
        Context context = this.f53181b;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c50343e.b(P0.a.f46696g, application);
        }
        c50343e.b(C23066u0.f46894a, this);
        c50343e.b(C23066u0.f46895b, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            c50343e.b(C23066u0.f46896c, bundleA);
        }
        return c50343e;
    }

    @Override // androidx.view.InterfaceC22969B
    @k
    public final P0.c getDefaultViewModelProviderFactory() {
        return this.f53194o;
    }

    @Override // androidx.view.InterfaceC22983P
    @k
    public final Lifecycle getLifecycle() {
        return this.f53188i;
    }

    @Override // androidx.view.InterfaceC23487e
    @k
    public final C23485c getSavedStateRegistry() {
        return this.f53189j.f54434b;
    }

    @Override // androidx.view.T0
    @k
    /* renamed from: getViewModelStore */
    public final S0 getF42820b() {
        if (!this.f53190k) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f53188i.f46705d == Lifecycle.State.f46679b) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        InterfaceC23294I0 interfaceC23294I0 = this.f53185f;
        if (interfaceC23294I0 != null) {
            return interfaceC23294I0.xb(this.f53186g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f53182c.hashCode() + (this.f53186g.hashCode() * 31);
        Bundle bundle = this.f53183d;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i12 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i12 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f53189j.f54434b.hashCode() + ((this.f53188i.hashCode() + (iHashCode * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C23395u.class.getSimpleName());
        sb2.append("(" + this.f53186g + ')');
        sb2.append(" destination=");
        sb2.append(this.f53182c);
        return sb2.toString();
    }

    public C23395u(Context context, C23317W c23317w, Bundle bundle, Lifecycle.State state, InterfaceC23294I0 interfaceC23294I0, String str, Bundle bundle2) {
        this.f53181b = context;
        this.f53182c = c23317w;
        this.f53183d = bundle;
        this.f53184e = state;
        this.f53185f = interfaceC23294I0;
        this.f53186g = str;
        this.f53187h = bundle2;
        this.f53188i = new C22985S(this, true);
        C23486d.f54432d.getClass();
        this.f53189j = C23486d.a.a(this);
        InterfaceC42726C interfaceC42726CC = C42727D.c(new d());
        this.f53191l = interfaceC42726CC;
        this.f53192m = C42727D.c(new e());
        this.f53193n = Lifecycle.State.f46680c;
        this.f53194o = (C23074y0) interfaceC42726CC.getValue();
    }

    public /* synthetic */ C23395u(Context context, C23317W c23317w, Bundle bundle, Lifecycle.State state, InterfaceC23294I0 interfaceC23294I0, String str, Bundle bundle2, int i12, C42822w c42822w) {
        this(context, c23317w, (i12 & 4) != 0 ? null : bundle, (i12 & 8) != 0 ? Lifecycle.State.f46681d : state, (i12 & 16) != 0 ? null : interfaceC23294I0, (i12 & 32) != 0 ? UUID.randomUUID().toString() : str, (i12 & 64) != 0 ? null : bundle2);
    }

    public /* synthetic */ C23395u(C23395u c23395u, Bundle bundle, int i12, C42822w c42822w) {
        this(c23395u, (i12 & 2) != 0 ? c23395u.a() : bundle);
    }

    @RestrictTo
    public C23395u(@k C23395u c23395u, @l Bundle bundle) {
        this(c23395u.f53181b, c23395u.f53182c, bundle, c23395u.f53184e, c23395u.f53185f, c23395u.f53186g, c23395u.f53187h);
        this.f53184e = c23395u.f53184e;
        b(c23395u.f53193n);
    }
}
