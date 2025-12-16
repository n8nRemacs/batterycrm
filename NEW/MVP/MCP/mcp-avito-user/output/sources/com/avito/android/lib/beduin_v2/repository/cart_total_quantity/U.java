package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Lm.C14411b;
import bV0.C25569a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartTotalQuantityRepositoryClientImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLm/b;", "it", "Lkotlin/G0;", "invoke", "(LLm/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<C14411b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f176492l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U(Y41.l<? super C25569a, G0> lVar) {
        super(1);
        this.f176492l = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(C14411b c14411b) {
        Integer quantity = c14411b.getQuantity();
        this.f176492l.invoke(quantity != null ? new C25569a(quantity.intValue()) : null);
        return G0.f406611a;
    }
}
