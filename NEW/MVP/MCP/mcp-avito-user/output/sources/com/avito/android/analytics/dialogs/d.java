package com.avito.android.analytics.dialogs;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.g;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.analytics.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import javax.inject.Inject;
import javax.inject.Singleton;
import kj0.C42700a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ErrorDialogsAnalytics.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/dialogs/d;", "Lcom/avito/android/analytics/dialogs/a;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.analytics.dialogs.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f89888a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f89889b;

    /* compiled from: ErrorDialogsAnalytics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/toast/g$a;", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/toast/g$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<g.a, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(g.a aVar) {
            Object objInvoke;
            g.a aVar2 = aVar;
            g.b.a aVar3 = g.b.a.f125262a;
            g.b bVar = aVar2.f125261b;
            if (!L.f(bVar, aVar3)) {
                if (!(bVar instanceof g.b.C3721b)) {
                    throw new NoWhenBranchMatchedException();
                }
                g.b.C3721b c3721b = (g.b.C3721b) bVar;
                d dVar = d.this;
                dVar.getClass();
                b bVar2 = new b(dVar);
                c cVar = new c(dVar);
                Throwable th2 = c3721b.f125263a;
                if (th2 != null) {
                    objInvoke = bVar2.invoke(th2);
                } else {
                    ApiError apiError = c3721b.f125264b;
                    objInvoke = apiError != null ? cVar.invoke(apiError) : null;
                }
                C34244a c34244a = (C34244a) objInvoke;
                if (c34244a == null) {
                    V2.f318762a.g("NetworkErrorsBinding", "Failed to bind exception with high-level error while showing error dialog");
                }
                dVar.f89889b.c(new C42700a(false, aVar2.f125260a, c34244a, null, null));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k n nVar, @k InterfaceC28373a interfaceC28373a) {
        this.f89888a = nVar;
        this.f89889b = interfaceC28373a;
    }

    @Override // com.avito.android.analytics.dialogs.a
    public final void a() {
        g gVar = g.f125258a;
        a aVar = new a();
        gVar.getClass();
        if (g.f125259b != null) {
            throw new IllegalArgumentException("Multiple subscribers are not supported.");
        }
        g.f125259b = aVar;
    }
}
