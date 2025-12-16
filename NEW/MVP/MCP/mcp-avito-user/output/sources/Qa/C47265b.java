package qA;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.analytics.screens.tracker.P;
import com.avito.android.analytics.screens.tracker.r;
import com.avito.android.extended_profile_adverts.di.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublicProfileAdvertsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqA/b;", "LqA/a;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qA.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47265b implements InterfaceC47264a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f429071a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f429072b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f429073c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f429074d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public InterfaceC28489k f429075e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public InterfaceC28483e f429076f;

    @Inject
    public C47265b(@k InterfaceC28499v interfaceC28499v, @k InterfaceC28501x interfaceC28501x, @k o oVar, @n.g @k String str) {
        this.f429071a = interfaceC28499v;
        this.f429072b = interfaceC28501x;
        this.f429073c = oVar;
        this.f429074d = str.concat("-advertisements");
    }

    @Override // qA.InterfaceC47264a
    public final void a(long j12) {
        this.f429071a.a(j12);
    }

    @Override // qA.InterfaceC47264a
    public final void b() {
        InterfaceC28489k interfaceC28489k = this.f429075e;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f429075e = null;
    }

    @Override // qA.InterfaceC47264a
    public final void c() {
        r rVarJ = this.f429073c.j(this.f429074d);
        rVarJ.start();
        this.f429075e = rVarJ;
    }

    @Override // qA.InterfaceC47264a
    public final void d() {
        this.f429072b.b(-1L);
    }

    @Override // qA.InterfaceC47264a
    public final void e() {
        this.f429072b.start();
    }

    @Override // qA.InterfaceC47264a
    public final void f() {
        C28484f c28484fH = this.f429073c.h(this.f429074d);
        c28484fH.start();
        this.f429076f = c28484fH;
    }

    @Override // qA.InterfaceC47264a
    public final void g(@k Throwable th2) {
        InterfaceC28483e interfaceC28483e = this.f429076f;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, new J.a(th2));
        }
        this.f429076f = null;
    }

    @Override // qA.InterfaceC47264a
    public final void h() {
        P pE2 = this.f429073c.e(this.f429074d);
        pE2.start();
        this.f429075e = pE2;
    }

    @Override // qA.InterfaceC47264a
    public final void i(@k Throwable th2) {
        InterfaceC28489k interfaceC28489k = this.f429075e;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(th2), 0L, 5);
        }
        this.f429075e = null;
    }

    @Override // qA.InterfaceC47264a
    public final void j() {
        InterfaceC28483e interfaceC28483e = this.f429076f;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f429076f = null;
    }

    @Override // qA.InterfaceC47264a
    public final void stop() {
        this.f429075e = null;
        this.f429076f = null;
    }
}
