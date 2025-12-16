package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Cj.InterfaceC13310a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CartMenuIconRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/w;", "", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31179w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC13310a> f176534a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f176535b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final F f176536c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f176537d;

    @Inject
    public C31179w(@Y61.k h31.e<InterfaceC13310a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k F f12, @Y61.k com.avito.android.account.E e12) {
        this.f176534a = eVar;
        this.f176535b = interfaceC35745a5;
        this.f176536c = f12;
        this.f176537d = e12;
    }

    @Y61.k
    public final AbstractC41768a a(@Y61.l Integer num) {
        String strA = this.f176537d.a();
        if (strA == null) {
            return C41823n.f402260b;
        }
        F f12 = this.f176536c;
        f12.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31182z(strA, num, f12));
    }
}
