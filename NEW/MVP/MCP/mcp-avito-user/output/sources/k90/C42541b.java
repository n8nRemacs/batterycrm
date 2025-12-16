package k90;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceListUxFeedbackStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk90/b;", "Lk90/a;", "_avito_price-list-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k90.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42541b implements InterfaceC42540a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f406112a;

    @Inject
    public C42541b(@k l lVar) {
        this.f406112a = lVar;
    }

    @Override // k90.InterfaceC42540a
    public final boolean a() {
        return this.f406112a.getBoolean("price_list_ux_feedback_show_pref_key", true);
    }

    @Override // k90.InterfaceC42540a
    public final void b() {
        this.f406112a.putBoolean("price_list_ux_feedback_show_pref_key", false);
    }
}
