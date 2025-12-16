package com.avito.android.advert.item.sellersubscription;

import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC32897n0;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b;
import com.avito.android.remote.Q;
import com.avito.android.remote.model.SubscribeResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import io.reactivex.rxjava3.internal.operators.observable.T;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SellerSubscriptionInteractor.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/n;", "Lcom/avito/android/advert/item/sellersubscription/j;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/b;", "Lcom/avito/android/r0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements j, InterfaceC30576b, InterfaceC34162r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<Q> f79756a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I30.d f79757b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f79758c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f79759d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30576b f79760e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f79761f;

    @Inject
    public n(@Y61.k h31.e<Q> eVar, @Y61.k I30.d dVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k InterfaceC30576b interfaceC30576b) {
        this.f79756a = eVar;
        this.f79757b = dVar;
        this.f79758c = interfaceC35745a5;
        this.f79759d = interfaceC34162r0;
        this.f79760e = interfaceC30576b;
        SubscriptionSource subscriptionSource = SubscriptionSource.f90035c;
        this.f79761f = "item";
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b
    @Y61.l
    public final Object a(@Y61.k String str, boolean z12, @Y61.l SubscriptionSource subscriptionSource, @Y61.k Continuation<? super G0> continuation) {
        return this.f79760e.a(str, z12, subscriptionSource, continuation);
    }

    @Override // com.avito.android.advert.item.sellersubscription.j
    @Y61.k
    public final C41986s0 b(@Y61.k String str, boolean z12, @Y61.l SubscriptionSource subscriptionSource) {
        return new C41986s0(Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new l(this, subscriptionSource, str, z12, 0)).x0(this.f79758c.a())));
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b
    @Y61.l
    public final Object c(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource, @Y61.k Continuation<? super SubscribeResult> continuation) {
        return this.f79760e.c(str, subscriptionSource, continuation);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b
    @Y61.l
    public final Object d(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource, @Y61.k Continuation<? super G0> continuation) {
        return this.f79760e.d(str, subscriptionSource, continuation);
    }

    @Override // com.avito.android.advert.item.sellersubscription.j
    @Y61.k
    public final T e(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource) {
        return Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new k(this, subscriptionSource, str, 0)).x0(this.f79758c.a())).S();
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    public final InterfaceC43160i<G0> f() {
        return this.f79759d.f();
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    @InterfaceC42830m
    public final AbstractC41768a g(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.k String str) {
        return this.f79759d.g(bool, bool2, str);
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    public final I<Set<InterfaceC32897n0>> h() {
        return this.f79759d.h();
    }

    @Override // com.avito.android.InterfaceC34162r0
    public final void i() {
        this.f79759d.i();
    }

    @Override // com.avito.android.InterfaceC34162r0
    public final void j(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.k String str) {
        this.f79759d.j(bool, bool2, str);
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    @InterfaceC42830m
    public final io.reactivex.rxjava3.core.z<G0> k() {
        return this.f79759d.k();
    }

    @Override // com.avito.android.advert.item.sellersubscription.j
    @Y61.k
    public final C41986s0 l(@Y61.k String str, @Y61.l SubscriptionSource subscriptionSource) {
        return new C41986s0(Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new k(this, subscriptionSource, str, 1)).x0(this.f79758c.a())).d0(m.f79755b));
    }

    @Override // com.avito.android.InterfaceC34162r0
    @Y61.k
    public final Map<String, InterfaceC32897n0> m() {
        return this.f79759d.m();
    }
}
