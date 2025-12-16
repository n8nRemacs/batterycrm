package Pq;

import Y61.k;
import com.avito.android.C29640d;
import com.avito.android.J;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.event.r;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sc.C48156e;

/* compiled from: ComparisonAnalyticInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPq/b;", "LPq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14827b implements InterfaceC14826a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f13329a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C29640d f13330b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C48156e f13331c = C48156e.f437918a;

    @Inject
    public C14827b(@k InterfaceC28373a interfaceC28373a, @k C29640d c29640d) {
        this.f13329a = interfaceC28373a;
        this.f13330b = c29640d;
    }

    @Override // Pq.InterfaceC14826a
    public final void a(@k String str, @k String str2) {
        this.f13329a.c(new i1(this.f13330b, this.f13329a, 0L, (TreeClickStreamParent) null, str, "comparison", (Integer) null, "comparison", str2, (String) null, 512, (C42822w) null));
        this.f13331c.a();
    }

    @Override // Pq.InterfaceC14826a
    public final void b(@k String str) {
        J j12 = new J(str, null, 2, null);
        r.f90128e.getClass();
        this.f13329a.c(new r(j12, null));
        this.f13331c.a();
    }
}
