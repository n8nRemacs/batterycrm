package com.avito.android.checkout.mvi;

import com.avito.android.checkout.mvi.entity.CheckoutInternalAction;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wZ.C49578b;
import xo.C49974c;
import xo.InterfaceC49972a;

/* compiled from: CheckoutActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/checkout/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lxo/a;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "Lxo/c;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC49972a, CheckoutInternalAction, C49974c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.checkout.domain.j f118373a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v50.g f118374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f118375c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f118376d;

    @Inject
    public g(@Y61.k com.avito.android.checkout.domain.j jVar, @Y61.k v50.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k @com.avito.android.checkout.di.q String str) {
        this.f118373a = jVar;
        this.f118374b = gVar;
        this.f118375c = aVar;
        this.f118376d = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new c(this.f118374b.a(), null)), C43175k.G(new d(new a(new b(C40482a.b(this.f118375c))), null)), com.avito.android.arch.mvi.utils.h.e(c43197r1, e.f118356l, new f(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CheckoutInternalAction> b(@Y61.k InterfaceC49972a interfaceC49972a, @Y61.k C49974c c49974c) {
        C43210w c43210w;
        C49578b c49578b;
        if (interfaceC49972a instanceof InterfaceC49972a.C12879a) {
            return new C43210w(CheckoutInternalAction.CloseScreen.f118357b);
        }
        if (interfaceC49972a instanceof InterfaceC49972a.i) {
            return this.f118373a.a(this.f118376d);
        }
        if (interfaceC49972a instanceof InterfaceC49972a.c) {
            wZ.j jVar = c49974c.f442646b;
            return new C43210w(new CheckoutInternalAction.HandleDeeplink((jVar == null || (c49578b = jVar.f441570b) == null) ? null : c49578b.f441547b, null, 2, null));
        }
        if (interfaceC49972a instanceof InterfaceC49972a.e) {
            InterfaceC49972a.e eVar = (InterfaceC49972a.e) interfaceC49972a;
            c43210w = new C43210w(new CheckoutInternalAction.HandleDeeplink(eVar.f442628b, eVar.f442627a));
        } else if (interfaceC49972a instanceof InterfaceC49972a.b) {
            c43210w = new C43210w(new CheckoutInternalAction.HandleDeeplink(((InterfaceC49972a.b) interfaceC49972a).f442624a, null, 2, null));
        } else if (interfaceC49972a instanceof InterfaceC49972a.j) {
            InterfaceC49972a.j jVar2 = (InterfaceC49972a.j) interfaceC49972a;
            c43210w = new C43210w(new CheckoutInternalAction.ScreenLoadState(jVar2.f442634a, jVar2.f442635b));
        } else if (interfaceC49972a instanceof InterfaceC49972a.k) {
            c43210w = new C43210w(new CheckoutInternalAction.HandleDeeplink(((InterfaceC49972a.k) interfaceC49972a).f442636a, null, 2, null));
        } else if (interfaceC49972a instanceof InterfaceC49972a.f) {
            InterfaceC49972a.f fVar = (InterfaceC49972a.f) interfaceC49972a;
            c43210w = new C43210w(new CheckoutInternalAction.HandlePromoCodeDeeplink(fVar.f442629a, fVar.f442630b));
        } else {
            if (interfaceC49972a instanceof InterfaceC49972a.d) {
                return new C43210w(new CheckoutInternalAction.ScrollToPosition(C42745f0.J(c49974c.f442647c)));
            }
            if (interfaceC49972a instanceof InterfaceC49972a.g) {
                c43210w = new C43210w(new CheckoutInternalAction.PromoCodeInput(((InterfaceC49972a.g) interfaceC49972a).f442631a));
            } else {
                if (!(interfaceC49972a instanceof InterfaceC49972a.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new CheckoutInternalAction.PromoCodeLoadState(((InterfaceC49972a.h) interfaceC49972a).f442632a));
            }
        }
        return c43210w;
    }
}
