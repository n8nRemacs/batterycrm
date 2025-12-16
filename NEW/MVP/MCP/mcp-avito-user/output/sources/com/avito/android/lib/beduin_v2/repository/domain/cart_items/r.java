package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReturnedFromOtherScreenObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/r;", "Landroidx/lifecycle/q;", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f176575b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f176576c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Y61.k Y41.a<G0> aVar) {
        this.f176575b = (N) aVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onCreate(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f176576c = false;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onPause(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f176576c = true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        if (this.f176576c) {
            this.f176575b.invoke();
        }
    }
}
