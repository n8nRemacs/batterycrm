package com.avito.android.lib.beduin_v2.feature.tracker;

import com.avito.android.C29270c0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.DesignAppScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: BeduinFeatureAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/tracker/d;", "Lcom/avito/android/lib/beduin_v2/feature/tracker/c;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f176372a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f176373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f176374c = Collections.singletonList(DesignAppScreen.f90340d.f90471b);

    @Inject
    public d(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C29270c0 c29270c0) {
        this.f176372a = interfaceC28373a;
        this.f176373b = c29270c0;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.tracker.c
    public final void a(@Y61.k ZS.b bVar) {
        String str = bVar.f20168a;
        if (this.f176374c.contains(str)) {
            return;
        }
        ArrayList arrayList = bVar.f20172e;
        if (arrayList.isEmpty()) {
            return;
        }
        C29270c0 c29270c0 = this.f176373b;
        c29270c0.getClass();
        n<Object> nVar = C29270c0.f113263t[7];
        if (((Boolean) c29270c0.f113271i.a().invoke()).booleanValue()) {
            this.f176372a.c(new l(str, bVar.f20169b, arrayList));
        }
    }

    @Override // com.avito.android.lib.beduin_v2.feature.tracker.c
    public final void b(@Y61.k ZS.b bVar) {
        String str = bVar.f20168a;
        if (this.f176374c.contains(str)) {
            return;
        }
        this.f176372a.c(new m(str));
    }
}
