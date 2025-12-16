package pk;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.BrandspaceScreen;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.F;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.analytics.screens.tracker.K;
import com.avito.android.analytics.screens.tracker.MultipleCoreContentsNotAllowedException;
import com.avito.android.analytics.screens.tracker.P;
import com.avito.android.memory.consumption.f;
import com.avito.android.ui.fragments.TabBaseFragment;
import dj.InterfaceC39736a;
import dj.InterfaceC39737b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandspaceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lpk/c;", "Lpk/b;", "Ldj/b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47105c implements InterfaceC47104b, InterfaceC39737b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39737b f428745a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f428746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f428747c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28499v f428748d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28501x f428749e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final F f428750f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public InterfaceC28489k f428751g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public InterfaceC28483e f428752h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public InterfaceC28489k f428753i;

    public C47105c(@k InterfaceC28481c interfaceC28481c, @k r rVar, @k BrandspaceScreen brandspaceScreen, @k InterfaceC39737b interfaceC39737b) throws MultipleCoreContentsNotAllowedException {
        this.f428745a = interfaceC39737b;
        new C47103a();
        K kB2 = interfaceC28481c.b(brandspaceScreen, rVar);
        H.c cVar = H.a.f90737a;
        InterfaceC28501x interfaceC28501xC = kB2.c(cVar);
        this.f428749e = interfaceC28501xC;
        o oVarA = kB2.a();
        this.f428747c = oVarA;
        InterfaceC28499v interfaceC28499vB = kB2.b(cVar);
        this.f428748d = interfaceC28499vB;
        interfaceC39737b.g(brandspaceScreen);
        this.f428750f = new F(interfaceC28499vB, interfaceC28501xC, oVarA, "brandspace-beduin");
    }

    @Override // pk.InterfaceC47104b
    public final void B() {
        P pE2 = this.f428747c.e("brandspace-beduin");
        pE2.start();
        this.f428751g = pE2;
    }

    @Override // dj.InterfaceC39737b
    @k
    public final InterfaceC39736a F() {
        return this.f428745a.F();
    }

    @Override // pj.InterfaceC47100c
    public final void J(@k String str, @k J j12) {
        InterfaceC28489k interfaceC28489k = this.f428753i;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, j12, 0L, 5);
        }
        this.f428753i = null;
    }

    @Override // pk.InterfaceC47104b
    public final void N() {
        J.b bVar = J.b.f90385a;
        InterfaceC28489k interfaceC28489k = this.f428751g;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, bVar, 0L, 5);
        }
        this.f428751g = null;
        C28484f c28484fH = this.f428747c.h("brandspace-beduin");
        c28484fH.start();
        this.f428752h = c28484fH;
    }

    @Override // pk.InterfaceC47104b
    public final void a(long j12) {
        this.f428748d.a(j12);
    }

    @Override // pk.InterfaceC47104b
    public final void d() {
        this.f428749e.b(-1L);
    }

    @Override // pk.InterfaceC47104b
    public final void e() {
        this.f428749e.start();
    }

    @Override // dj.InterfaceC39737b
    public final void g(@k Screen screen) {
        this.f428745a.g(screen);
    }

    @Override // pj.InterfaceC47100c
    public final void h(@k String str) {
        P pE2 = this.f428747c.e(str);
        pE2.start();
        this.f428753i = pE2;
    }

    @Override // pk.InterfaceC47104b
    public final void m(@k f.a aVar, @k TabBaseFragment tabBaseFragment) {
        this.f428750f.c(tabBaseFragment, aVar);
    }

    @Override // pk.InterfaceC47104b
    public final void p() {
        InterfaceC28483e interfaceC28483e = this.f428752h;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f428752h = null;
    }

    @Override // pk.InterfaceC47104b
    @k
    /* renamed from: r, reason: from getter */
    public final F getF428750f() {
        return this.f428750f;
    }

    @Override // pk.InterfaceC47104b
    public final void v(@k J.a aVar) {
        InterfaceC28489k interfaceC28489k = this.f428751g;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, aVar, 0L, 5);
        }
        this.f428751g = null;
        C28484f c28484fH = this.f428747c.h("brandspace-beduin");
        c28484fH.start();
        this.f428752h = c28484fH;
    }
}
