package com.avito.android.analytics.event;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowSerpScreenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/Z0;", "LQc/f;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Z0 implements Qc.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qc.g f90007b;

    public Z0(@Y61.k Map<String, String> map) {
        this.f90007b = Qc.h.a("SearchResults", map);
    }

    @Override // Qc.f
    @Y61.k
    /* renamed from: getName */
    public final String getF13936b() {
        return this.f90007b.f13936b;
    }

    @Override // Qc.f
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f90007b.f13937c;
    }
}
