package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import A3.a;
import com.avito.android.service.short_task.ShortTask;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CartStorageAuthPlugin.kt */
@Singleton
@C11.a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/i;", "LA3/b;", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_auth-plugin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f176561a;

    @Inject
    public i(@Y61.k p pVar) {
        this.f176561a = pVar;
    }

    public final void a(@Y61.k A3.a aVar) {
        if ((aVar instanceof a.InterfaceC0003a.c) || (aVar instanceof a.b)) {
            p pVar = this.f176561a;
            pVar.getClass();
            pVar.f176572a.c(m.class, ShortTask.NetworkState.f274023b, false, false, false, false, 0L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
        }
    }

    @Override // A3.b
    public final void d(@Y61.k a.InterfaceC0003a.C0004a c0004a) {
        a(c0004a);
    }

    @Override // A3.b
    public final void e(@Y61.k a.InterfaceC0003a.c cVar) {
        a(cVar);
    }

    @Override // A3.b
    public final void i(@Y61.k a.b bVar) {
        a(bVar);
    }

    @Override // A3.b
    public final void l(@Y61.k a.InterfaceC0003a.b bVar) {
        a(bVar);
    }

    @Override // A3.b
    public final void p(@Y61.k a.InterfaceC0003a.d dVar) {
        a(dVar);
    }

    @Override // A3.b
    public final void m(@Y61.l Boolean bool, @Y61.k String str) {
    }
}
