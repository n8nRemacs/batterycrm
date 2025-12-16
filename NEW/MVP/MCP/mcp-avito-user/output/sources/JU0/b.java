package Ju0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingOrdersActionsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJu0/b;", "LJu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC14251a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f9172a;

    @Inject
    public b(@k l lVar) {
        this.f9172a = lVar;
    }

    @Override // Ju0.InterfaceC14251a
    public final void a(@k String str) {
        this.f9172a.putBoolean("service_orders_actions::".concat(str), true);
    }

    @Override // Ju0.InterfaceC14251a
    public final boolean b(@k String str) {
        return this.f9172a.c("service_orders_actions::".concat(str));
    }
}
