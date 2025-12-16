package jR;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.leasing_calculator.analytics.events.ApplicationFormOpenSource;
import com.avito.android.leasing_calculator.m;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kR.C42621a;
import kR.C42622b;
import kR.d;
import kR.e;
import kR.f;
import kR.g;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: LeasingCalculatorAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjR/b;", "LjR/a;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42299b implements InterfaceC42298a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f405612a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f405613b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m f405614c;

    @Inject
    public C42299b(@k InterfaceC28373a interfaceC28373a, @k E e12, @k m mVar) {
        this.f405612a = interfaceC28373a;
        this.f405613b = e12;
        this.f405614c = mVar;
    }

    @Override // jR.InterfaceC42298a
    public final void a() {
        LinkedHashMap linkedHashMapG = g(this.f405613b.a(), null);
        if (linkedHashMapG == null) {
            return;
        }
        h(new f(linkedHashMapG));
    }

    @Override // jR.InterfaceC42298a
    public final void b() {
        LinkedHashMap linkedHashMapG;
        String strA = this.f405613b.a();
        if (strA == null || (linkedHashMapG = g(strA, null)) == null) {
            return;
        }
        h(new C42621a(linkedHashMapG));
    }

    @Override // jR.InterfaceC42298a
    public final void c() {
        LinkedHashMap linkedHashMapG = g(this.f405613b.a(), null);
        if (linkedHashMapG == null) {
            return;
        }
        h(new d(linkedHashMapG));
    }

    @Override // jR.InterfaceC42298a
    public final void d() {
        LinkedHashMap linkedHashMapG = g(this.f405613b.a(), null);
        if (linkedHashMapG == null) {
            return;
        }
        h(new g(linkedHashMapG));
    }

    @Override // jR.InterfaceC42298a
    public final void e(@l ApplicationFormOpenSource applicationFormOpenSource) {
        LinkedHashMap linkedHashMapG;
        String strA = this.f405613b.a();
        if (strA == null || (linkedHashMapG = g(strA, applicationFormOpenSource.f175094b)) == null) {
            return;
        }
        h(new C42622b(linkedHashMapG));
    }

    @Override // jR.InterfaceC42298a
    public final void f() {
        LinkedHashMap linkedHashMapG = g(this.f405613b.a(), null);
        if (linkedHashMapG == null) {
            return;
        }
        h(new e(linkedHashMapG));
    }

    public final LinkedHashMap g(String str, String str2) {
        String f175119e;
        String f175117c;
        m mVar = this.f405614c;
        String f175118d = mVar.getF175118d();
        if (f175118d == null || (f175119e = mVar.getF175119e()) == null || (f175117c = mVar.getF175117c()) == null) {
            return null;
        }
        LinkedHashMap linkedHashMapJ = P0.j(new Q("cid", f175118d), new Q("mcid", f175119e), new Q("iid", f175117c));
        if (str != null && !C43066x.K(str)) {
            linkedHashMapJ.put("uid", str);
        }
        if (str2 != null && !C43066x.K(str2)) {
            linkedHashMapJ.put("from_source", str2);
        }
        return linkedHashMapJ;
    }

    public final void h(com.avito.android.analytics.provider.clickstream.a aVar) {
        this.f405612a.c(aVar);
    }
}
