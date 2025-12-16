package com.avito.android.vas_planning_checkout;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import jM0.InterfaceC42284a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanCheckoutViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/B;", "Landroidx/lifecycle/P0$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VasPlanCheckoutFragmentArgument f322746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.d f322748c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.k f322749d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.item.price.k f322750e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.g f322751f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.r f322752g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.n f322753h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322754i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42284a f322755j;

    @Inject
    public B(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument, @Y61.k com.avito.android.vas_planning_checkout.domain.d dVar, @Y61.k com.avito.android.vas_planning_checkout.domain.g gVar, @Y61.k com.avito.android.vas_planning_checkout.domain.k kVar, @Y61.k com.avito.android.vas_planning_checkout.domain.n nVar, @Y61.k com.avito.android.vas_planning_checkout.domain.r rVar, @Y61.k com.avito.android.vas_planning_checkout.item.price.k kVar2, @Y61.k InterfaceC42284a interfaceC42284a) {
        this.f322746a = vasPlanCheckoutFragmentArgument;
        this.f322747b = interfaceC35745a5;
        this.f322748c = dVar;
        this.f322749d = kVar;
        this.f322750e = kVar2;
        this.f322751f = gVar;
        this.f322752g = rVar;
        this.f322753h = nVar;
        this.f322754i = interfaceC28373a;
        this.f322755j = interfaceC42284a;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(E.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        com.avito.android.vas_planning_checkout.item.price.k kVar = this.f322750e;
        com.avito.android.vas_planning_checkout.domain.r rVar = this.f322752g;
        VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument = this.f322746a;
        InterfaceC35745a5 interfaceC35745a5 = this.f322747b;
        com.avito.android.vas_planning_checkout.domain.g gVar = this.f322751f;
        com.avito.android.vas_planning_checkout.domain.n nVar = this.f322753h;
        return new E(this.f322754i, interfaceC35745a5, vasPlanCheckoutFragmentArgument, this.f322748c, gVar, this.f322749d, nVar, rVar, kVar, this.f322755j);
    }
}
