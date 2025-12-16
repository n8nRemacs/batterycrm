package com.avito.android.advert.item.ownership_cost;

import Hq0.C14021c;
import Pk0.InterfaceC14796a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OwnershipCostInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/d;", "Lcom/avito/android/advert/item/ownership_cost/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC14796a> f77877a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f77878b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f77879c;

    @Inject
    public d(@k com.avito.android.remote.error.f fVar, @k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f77877a = eVar;
        this.f77878b = interfaceC35745a5;
        this.f77879c = fVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.a
    @k
    public final L0 a(@k String str, @l String str2, @l String str3) {
        return new F(new C14021c(2, str, this, str2, str3)).x0(this.f77878b.a()).d0(b.f77875b).r0(P2.c.f318721a).m0(new c(this));
    }
}
