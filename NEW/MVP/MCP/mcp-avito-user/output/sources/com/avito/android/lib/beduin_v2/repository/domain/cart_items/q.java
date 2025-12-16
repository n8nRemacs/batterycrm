package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartStorageWiper_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/q;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/p;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_auth-plugin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176573b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f176574a;

    /* compiled from: CartStorageWiper_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/q$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_auth-plugin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k dagger.internal.f fVar) {
        this.f176574a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service.short_task.j jVar = (com.avito.android.service.short_task.j) this.f176574a.get();
        f176573b.getClass();
        return new p(jVar);
    }
}
