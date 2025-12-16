package W6;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrderRequestTooltipStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW6/b;", "LW6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f17747a;

    @Inject
    public b(@k l lVar) {
        this.f17747a = lVar;
    }

    @Override // W6.a
    public final boolean a() {
        return this.f17747a.c("service_order_request_tooltip_was_shown");
    }

    @Override // W6.a
    public final void b() {
        this.f17747a.putBoolean("service_order_request_tooltip_was_shown", true);
    }
}
