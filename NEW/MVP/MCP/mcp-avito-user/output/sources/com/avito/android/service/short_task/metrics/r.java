package com.avito.android.service.short_task.metrics;

import com.avito.android.permissions.t;
import com.avito.android.serp.adapter.U;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionInfoProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/r;", "Lcom/avito/android/service/short_task/metrics/n;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f274094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I30.d f274095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f274096c;

    @Inject
    public r(@Y61.k com.avito.android.permissions.u uVar, @Y61.k I30.d dVar) {
        this.f274094a = uVar;
        this.f274095b = dVar;
        Q q12 = new Q("camera_permission", "android.permission.CAMERA");
        Q q13 = new Q("location_permission", "android.permission.ACCESS_FINE_LOCATION");
        com.avito.android.permissions.t.f215141z.getClass();
        this.f274096c = P0.g(q12, q13, new Q("photo_library_permission", t.a.f215144c));
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        return io.reactivex.rxjava3.core.z.W(new U(this, 2)).T(q.f274093b, Integer.MAX_VALUE);
    }
}
