package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartMenuIconStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/F;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f176446a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31158a f176447b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f176448c = C42727D.c(a.f176449l);

    /* compiled from: CartMenuIconStorage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Gson> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f176449l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Gson invoke() {
            return new Gson();
        }
    }

    @Inject
    public F(@Y61.k AK0.l lVar, @Y61.k InterfaceC31158a interfaceC31158a) {
        this.f176446a = lVar;
        this.f176447b = interfaceC31158a;
    }
}
