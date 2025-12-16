package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import arrow.core.AbstractC23662a;
import cn.C27223b;
import cn.C27224c;
import cn.C27227f;
import com.avito.android.R;
import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35936s;
import dn.C39758a;
import gn.d;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements com.avito.android.arch.mvi.t<CartSheetAfterAddingInternalAction, gn.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C35792f5 f115411b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C39758a f115412c;

    @Inject
    public l(@Y61.k C35792f5 c35792f5, @Y61.k C39758a c39758a) {
        this.f115411b = c35792f5;
        this.f115412c = c39758a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final gn.d b(CartSheetAfterAddingInternalAction cartSheetAfterAddingInternalAction) {
        Throwable thA;
        gn.d fVar;
        gn.d c11228d;
        List<C27224c> listC;
        CartSheetAfterAddingInternalAction cartSheetAfterAddingInternalAction2 = cartSheetAfterAddingInternalAction;
        Map mapC = null;
        if (!(cartSheetAfterAddingInternalAction2 instanceof CartSheetAfterAddingInternalAction.ForOneTimeProducer)) {
            return null;
        }
        CartSheetAfterAddingInternalAction.ForOneTimeProducer forOneTimeProducer = (CartSheetAfterAddingInternalAction.ForOneTimeProducer) cartSheetAfterAddingInternalAction2;
        if (!(forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.ContentLoaded)) {
            if (forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.CloseScreen) {
                c11228d = d.a.f396804a;
            } else if (forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.OpenCart) {
                c11228d = new d.C11228d(new CartLink(this.f115411b.f318872a, this.f115412c.f394045a), null, null, 6, null);
            } else if (forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.UpdateScreenTitle) {
                fVar = new d.g(com.avito.android.printable_text.b.f(((CartSheetAfterAddingInternalAction.UpdateScreenTitle) cartSheetAfterAddingInternalAction2).f115380b));
            } else if (forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.OpenAdvertDetails) {
                CartSheetAfterAddingInternalAction.OpenAdvertDetails openAdvertDetails = (CartSheetAfterAddingInternalAction.OpenAdvertDetails) cartSheetAfterAddingInternalAction2;
                fVar = new d.c(openAdvertDetails.f115374b, openAdvertDetails.f115375c, openAdvertDetails.f115376d);
            } else if (forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.SetAnalyticsData) {
                fVar = new d.e(((CartSheetAfterAddingInternalAction.SetAnalyticsData) cartSheetAfterAddingInternalAction2).f115378b);
            } else {
                if (!(forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.ShowToastError)) {
                    if (!(forOneTimeProducer instanceof CartSheetAfterAddingInternalAction.DiscountOnDeliveryStatusLoadingFailed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC23662a<Throwable, ApiError> abstractC23662a = ((CartSheetAfterAddingInternalAction.DiscountOnDeliveryStatusLoadingFailed) cartSheetAfterAddingInternalAction2).f115372b.f90384a;
                    if (abstractC23662a instanceof AbstractC23662a.c) {
                        thA = C35936s.a((ApiError) ((AbstractC23662a.c) abstractC23662a).f56269b, null);
                    } else {
                        if (!(abstractC23662a instanceof AbstractC23662a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        thA = (Throwable) ((AbstractC23662a.b) abstractC23662a).f56268b;
                    }
                    return new d.f(com.avito.android.printable_text.b.c(R.string.cart_sheet_after_adding_discount_on_delivery_error, new Serializable[0]), thA, true);
                }
                fVar = new d.f(null, null, true);
            }
            return c11228d;
        }
        C27223b c27223b = ((CartSheetAfterAddingInternalAction.ContentLoaded) cartSheetAfterAddingInternalAction2).f115369b;
        C27227f recommendations = c27223b.getRecommendations();
        if (recommendations != null && (listC = recommendations.c()) != null) {
            List<C27224c> list = listC;
            int iF2 = P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (C27224c c27224c : list) {
                linkedHashMap.put(c27224c.getId(), c27224c.getStepper());
            }
            mapC = linkedHashMap;
        }
        if (mapC == null) {
            mapC = P0.c();
        }
        fVar = new d.b(P0.k(mapC, Collections.singletonMap(c27223b.getMainItem().getId(), c27223b.getMainItem().getStepper())));
        return fVar;
    }
}
