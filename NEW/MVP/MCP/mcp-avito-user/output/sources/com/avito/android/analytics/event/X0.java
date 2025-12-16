package com.avito.android.analytics.event;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowProfileScreenEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/event/X0;", "LQc/f;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class X0 implements Qc.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qc.g f90003b = Qc.h.a("Profile", kotlin.collections.P0.c());

    @Override // Qc.f
    @Y61.k
    /* renamed from: getName */
    public final String getF13936b() {
        return this.f90003b.f13936b;
    }

    @Override // Qc.f
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f90003b.f13937c;
    }
}
