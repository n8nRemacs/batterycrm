package com.avito.android.analytics.start;

import Ec.C13472a;
import Y61.k;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.RunnableC22211b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28421j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.statsd.y;
import com.avito.android.time.c;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationWarmStartTimeAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/start/a;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f91021a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashSet f91022b = new LinkedHashSet();

    /* compiled from: ApplicationWarmStartTimeAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.start.a$a, reason: collision with other inner class name */
    public static final class C2685a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Activity f91024m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2685a(Activity activity) {
            super(0);
            this.f91024m = activity;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.ui.activity.a aVar = (com.avito.android.ui.activity.a) this.f91024m;
            a aVar2 = a.this;
            aVar2.getClass();
            c.f301452a.getClass();
            long jA2 = c.f301453b.a() - aVar.f304537b;
            C13472a c13472a = C13472a.f4111a;
            String simpleName = aVar.getClass().getSimpleName();
            c13472a.getClass();
            y.c cVar = new y.c("application_start.warm.time.".concat(simpleName), Long.valueOf(jA2), null);
            InterfaceC28373a interfaceC28373a = aVar2.f91021a;
            interfaceC28373a.c(cVar);
            interfaceC28373a.c(new C28421j(new r(aVar, (Long) null, (String) null, 6, (C42822w) null).f90694a, aVar2.f91022b.size() == 1, jA2));
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a) {
        this.f91021a = interfaceC28373a;
    }

    public final void a(@k Activity activity) {
        int iIdentityHashCode = System.identityHashCode(activity);
        LinkedHashSet linkedHashSet = this.f91022b;
        if (linkedHashSet.contains(Integer.valueOf(iIdentityHashCode))) {
            return;
        }
        linkedHashSet.add(Integer.valueOf(iIdentityHashCode));
        if (activity instanceof com.avito.android.ui.activity.a) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC22211b(5, new C2685a(activity)));
        }
    }
}
