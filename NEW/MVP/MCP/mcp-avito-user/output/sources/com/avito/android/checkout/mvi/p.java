package com.avito.android.checkout.mvi;

import android.os.Parcelable;
import com.avito.android.arch.mvi.u;
import com.avito.android.checkout.data.CheckoutPromoCodeState;
import com.avito.android.checkout.data.CheckoutResponse;
import com.avito.android.checkout.mvi.entity.CheckoutInternalAction;
import com.avito.android.checkout.ui.items.promocode.CheckoutPromoCodeItem;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wZ.C49579c;
import xo.C49974c;

/* compiled from: CheckoutReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "Lxo/c;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements u<CheckoutInternalAction, C49974c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.checkout.data.a f118396b;

    @Inject
    public p(@Y61.k com.avito.android.checkout.data.a aVar) {
        this.f118396b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49974c a(CheckoutInternalAction checkoutInternalAction, C49974c c49974c) {
        wZ.j jVar;
        p pVar;
        Object next;
        ArrayList arrayList;
        CheckoutPromoCodeState checkoutPromoCodeState;
        com.avito.android.checkout.ui.items.service.a aVar;
        CheckoutInternalAction checkoutInternalAction2 = checkoutInternalAction;
        C49974c c49974c2 = c49974c;
        if (checkoutInternalAction2 instanceof CheckoutInternalAction.Loading) {
            return C49974c.a(c49974c2, null, null, null, null, null, true, false, 15);
        }
        int i12 = 10;
        if (!(checkoutInternalAction2 instanceof CheckoutInternalAction.Content)) {
            if (checkoutInternalAction2 instanceof CheckoutInternalAction.Error) {
                return C49974c.a(c49974c2, null, null, null, null, ((CheckoutInternalAction.Error) checkoutInternalAction2).f118359b, false, false, 15);
            }
            if (checkoutInternalAction2 instanceof CheckoutInternalAction.ScreenLoadState) {
                CheckoutInternalAction.ScreenLoadState screenLoadState = (CheckoutInternalAction.ScreenLoadState) checkoutInternalAction2;
                return C49974c.a(c49974c2, null, null, null, screenLoadState.f118369c, null, false, screenLoadState.f118368b, 55);
            }
            boolean z12 = checkoutInternalAction2 instanceof CheckoutInternalAction.PromoCodeLoadState;
            List<com.avito.conveyor_item.a> list = c49974c2.f442647c;
            if (z12) {
                List<com.avito.conveyor_item.a> list2 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (TV0.a aVarA : list2) {
                    if (aVarA instanceof CheckoutPromoCodeItem) {
                        aVarA = CheckoutPromoCodeItem.a((CheckoutPromoCodeItem) aVarA, null, ((CheckoutInternalAction.PromoCodeLoadState) checkoutInternalAction2).f118367b, 255);
                    }
                    arrayList2.add(aVarA);
                }
                return C49974c.a(c49974c2, null, arrayList2, null, null, null, false, false, 125);
            }
            if (!(checkoutInternalAction2 instanceof CheckoutInternalAction.PromoCodeInput)) {
                return c49974c2;
            }
            List<com.avito.conveyor_item.a> list3 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
            for (TV0.a aVarA2 : list3) {
                if (aVarA2 instanceof CheckoutPromoCodeItem) {
                    Parcelable.Creator<CheckoutPromoCodeState> creator = CheckoutPromoCodeState.CREATOR;
                    aVarA2 = CheckoutPromoCodeItem.a((CheckoutPromoCodeItem) aVarA2, ((CheckoutInternalAction.PromoCodeInput) checkoutInternalAction2).f118366b, false, 455);
                }
                arrayList3.add(aVarA2);
            }
            return C49974c.a(c49974c2, null, arrayList3, null, null, null, false, false, 125);
        }
        CheckoutResponse checkoutResponse = ((CheckoutInternalAction.Content) checkoutInternalAction2).f118358b;
        CheckoutResponse.c cVar = checkoutResponse.f118147e;
        if (cVar != null) {
            ButtonAction buttonAction = cVar.f118181a;
            pVar = this;
            jVar = new wZ.j(cVar.f118182b, buttonAction != null ? C49579c.a(buttonAction) : null);
        } else {
            jVar = null;
            pVar = this;
        }
        pVar.f118396b.getClass();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new com.avito.android.checkout.ui.items.header.a(checkoutResponse.f118151i));
        ArrayList<CheckoutResponse.b> arrayList5 = checkoutResponse.f118150h;
        Iterator it = arrayList5.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CheckoutResponse.b) next).f118170a != null) {
                break;
            }
        }
        boolean z13 = next != null;
        for (CheckoutResponse.b bVar : arrayList5) {
            String str = "key_checkout_service" + bVar.f118174e;
            UniversalImage universalImage = bVar.f118171b;
            wZ.l lVarA = universalImage != null ? wZ.m.a(universalImage) : null;
            CheckoutResponse.b.a aVar2 = bVar.f118170a;
            if (aVar2 != null) {
                CheckoutResponse.b.a.C3437a c3437a = aVar2.f118177a;
                aVar = new com.avito.android.checkout.ui.items.service.a(c3437a.f118180b, c3437a.f118179a, aVar2.f118178b);
            } else {
                aVar = null;
            }
            arrayList4.add(new com.avito.android.checkout.ui.items.service.b(str, lVarA, bVar.f118175f, bVar.f118173d, aVar, !z13, bVar.f118172c, bVar.f118176g));
        }
        CheckoutResponse.CheckoutPromocode checkoutPromocode = checkoutResponse.f118149g;
        if (checkoutPromocode != null) {
            int iOrdinal = checkoutPromocode.f118155d.ordinal();
            if (iOrdinal == 0) {
                checkoutPromoCodeState = CheckoutPromoCodeState.f118138b;
            } else if (iOrdinal == 1) {
                checkoutPromoCodeState = CheckoutPromoCodeState.f118139c;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                checkoutPromoCodeState = CheckoutPromoCodeState.f118140d;
            }
            CheckoutPromoCodeState checkoutPromoCodeState2 = checkoutPromoCodeState;
            ButtonAction buttonAction2 = checkoutPromocode.f118152a;
            arrayList4.add(new CheckoutPromoCodeItem(checkoutPromocode.f118156e, checkoutPromocode.f118154c, checkoutPromocode.f118157f, checkoutPromoCodeState2, checkoutPromocode.f118153b, new CheckoutPromoCodeItem.Button(buttonAction2.getTitle(), buttonAction2.getDeeplink(), buttonAction2.getStyle(), buttonAction2.isEnabled()), !z13, false));
        }
        int i13 = 0;
        for (Object obj : checkoutResponse.f118148f) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            CheckoutResponse.a aVar3 = (CheckoutResponse.a) obj;
            String strG = AK.c.g(i13, "key_checkout_price");
            AttributedText attributedText = aVar3.f118166d;
            Object obj2 = aVar3.f118163a;
            if (obj2 != null) {
                Iterable<CheckoutResponse.a.C3436a> iterable = (Iterable) obj2;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(iterable, i12));
                for (CheckoutResponse.a.C3436a c3436a : iterable) {
                    arrayList6.add(new com.avito.android.checkout.ui.items.price.j(c3436a.f118169b, c3436a.f118168a));
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            arrayList4.add(new com.avito.android.checkout.ui.items.price.a(strG, attributedText, aVar3.f118165c, aVar3.f118164b, arrayList, !z13, aVar3.f118167e));
            i13 = i14;
            i12 = 10;
        }
        MnzFloatingFooter mnzFloatingFooter = checkoutResponse.f118144b;
        ButtonAction buttonAction3 = checkoutResponse.f118146d;
        return C49974c.a(c49974c2, jVar, arrayList4, mnzFloatingFooter != null ? wZ.g.a(wZ.h.b(mnzFloatingFooter), null, buttonAction3 != null ? C49579c.a(buttonAction3) : null, 15) : new wZ.g(null, checkoutResponse.f118143a, C49579c.a(checkoutResponse.f118145c), null, buttonAction3 != null ? C49579c.a(buttonAction3) : null), null, null, false, false, 8);
    }
}
