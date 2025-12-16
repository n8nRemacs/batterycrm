package zs;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreditPartnerTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzs/b;", "Lzs/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50621b implements InterfaceC50620a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28499v f444304a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28501x f444305b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o f444306c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public InterfaceC28483e f444307d;

    @Inject
    public C50621b(@k InterfaceC28499v interfaceC28499v, @k InterfaceC28501x interfaceC28501x, @k o oVar) {
        this.f444304a = interfaceC28499v;
        this.f444305b = interfaceC28501x;
        this.f444306c = oVar;
    }

    @Override // zs.InterfaceC50620a
    public final void a(long j12) {
        this.f444304a.a(j12);
    }

    @Override // zs.InterfaceC50620a
    public final void b() {
        InterfaceC28483e interfaceC28483e = this.f444307d;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f444307d = null;
    }

    @Override // zs.InterfaceC50620a
    public final void c(@k RuntimeException runtimeException) {
        InterfaceC28483e interfaceC28483e = this.f444307d;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, new J.a(runtimeException));
        }
        this.f444307d = null;
    }

    @Override // zs.InterfaceC50620a
    public final void d() {
        this.f444305b.b(-1L);
    }

    @Override // zs.InterfaceC50620a
    public final void e() {
        this.f444305b.start();
    }

    @Override // zs.InterfaceC50620a
    public final void f(@k String str) {
        C28484f c28484fH = this.f444306c.h(str);
        c28484fH.start();
        this.f444307d = c28484fH;
    }
}
