package com.avito.android.service_order_map.serviceordermap.mvi;

import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderMapActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "action", "", "invoke", "(Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.l<com.avito.android.service_order_map.serviceordermap.mvi.entity.a, Long> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f278746l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Long invoke(com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar) {
        com.avito.android.service_order_map.serviceordermap.mvi.entity.a aVar2 = aVar;
        return Long.valueOf(aVar2 instanceof a.f ? true : aVar2 instanceof a.e ? 500L : 0L);
    }
}
