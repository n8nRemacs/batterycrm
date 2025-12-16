package com.avito.android.analytics;

import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.N0;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Analytics.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/g;", "Lcom/avito/android/analytics/a;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28455g implements InterfaceC28373a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<r<?>> f90173a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC28464o> f90175c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f90176d = new io.reactivex.rxjava3.disposables.c();

    /* JADX WARN: Multi-variable type inference failed */
    public C28455g(@Y61.k Set<? extends r<?>> set, boolean z12) {
        this.f90173a = set;
        this.f90174b = z12;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final r rVar = (r) it.next();
            this.f90176d.b(new N0(this.f90175c.T(C28401d.f89883b, Integer.MAX_VALUE).k0(rVar.i()).j0(rVar.getF91100h()), new C28375c(rVar)).v0(new l41.g() { // from class: com.avito.android.analytics.e
                @Override // l41.g
                public final void accept(Object obj) {
                    rVar.c((InterfaceC28464o) obj);
                }
            }, new l41.g() { // from class: com.avito.android.analytics.f
                @Override // l41.g
                public final void accept(Object obj) {
                    this.f90166b.getClass();
                    V2.f318762a.a("Analytics", "Failed to send analytics", (Throwable) obj);
                }
            }, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    @Override // com.avito.android.analytics.InterfaceC28373a
    public final void c(@Y61.k InterfaceC28464o interfaceC28464o) {
        if (this.f90174b && !(interfaceC28464o instanceof B)) {
            V2.f318762a.c("Analytics", interfaceC28464o.toString(), null);
        }
        this.f90175c.accept(interfaceC28464o);
    }
}
