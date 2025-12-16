package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import cn.C27223b;
import cn.C27224c;
import cn.C27225d;
import cn.C27226e;
import cn.C27227f;
import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.cart_sheet_after_adding.ui.O;
import com.avito.android.cart_sheet_after_adding.ui.Q;
import com.avito.android.cart_sheet_after_adding.ui.components.B;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import gn.C40709a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import vn.C49355b;

/* compiled from: CartSheetAfterAddingReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lgn/e;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements com.avito.android.arch.mvi.u<CartSheetAfterAddingInternalAction, gn.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_similar_items.formatter.a f115416b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_sheet_after_adding.domain.b f115417c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f115418d;

    @Inject
    public n(@Y61.k com.avito.android.cart_similar_items.formatter.a aVar, @Y61.k com.avito.android.cart_sheet_after_adding.domain.b bVar) {
        this.f115416b = aVar;
        this.f115417c = bVar;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        this.f115418d = new DecimalFormat("##.#", decimalFormatSymbols);
    }

    public static C40709a.C11226a b(C49355b c49355b) {
        if (c49355b == null) {
            return null;
        }
        AttributedText text = c49355b.getText();
        List<Float> listA = c49355b.getProgressBar().a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            if (0.0f > fFloatValue || fFloatValue > 1.0f) {
                throw new IllegalArgumentException("Progress values must be in range [0f; 1f]");
            }
            arrayList.add(B.a(fFloatValue));
        }
        return new C40709a.C11226a(text, arrayList);
    }

    @Override // com.avito.android.arch.mvi.u
    public final gn.e a(CartSheetAfterAddingInternalAction cartSheetAfterAddingInternalAction, gn.e eVar) {
        gn.e eVarA;
        ArrayList arrayList;
        List<gn.i> list;
        long fullPrice;
        PrintableText printableText;
        gn.g gVar;
        gn.h hVar;
        Iterator it;
        long jFloor;
        PrintableText printableText2;
        gn.g gVar2;
        O o12;
        CartSheetAfterAddingInternalAction cartSheetAfterAddingInternalAction2 = cartSheetAfterAddingInternalAction;
        gn.e eVar2 = eVar;
        if (!(cartSheetAfterAddingInternalAction2 instanceof CartSheetAfterAddingInternalAction.ForReducer)) {
            return eVar2;
        }
        CartSheetAfterAddingInternalAction.ForReducer forReducer = (CartSheetAfterAddingInternalAction.ForReducer) cartSheetAfterAddingInternalAction2;
        if (forReducer instanceof CartSheetAfterAddingInternalAction.ContentLoaded) {
            C27223b c27223b = ((CartSheetAfterAddingInternalAction.ContentLoaded) cartSheetAfterAddingInternalAction2).f115369b;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(c27223b.getScreenTitle());
            C27225d mainItem = c27223b.getMainItem();
            Integer discountPercents = mainItem.getDiscountPercents();
            com.avito.android.cart_sheet_after_adding.domain.b bVar = this.f115417c;
            if (discountPercents != null) {
                long fullPrice2 = mainItem.getFullPrice();
                int iIntValue = discountPercents.intValue();
                bVar.getClass();
                fullPrice = (long) Math.floor((1 - (iIntValue / 100.0f)) * fullPrice2);
            } else {
                fullPrice = mainItem.getFullPrice();
            }
            int value = mainItem.getStepper().getValue();
            Long lValueOf = discountPercents != null ? Long.valueOf(mainItem.getFullPrice() * value) : null;
            String id2 = mainItem.getId();
            gn.f fVar = new gn.f(mainItem.getImage());
            Long lValueOf2 = Long.valueOf(value * fullPrice);
            com.avito.android.cart_similar_items.formatter.a aVar = this.f115416b;
            String strA = aVar.a(lValueOf2);
            String strA2 = lValueOf != null ? aVar.a(lValueOf) : null;
            String strA3 = aVar.a(Long.valueOf(fullPrice));
            Integer discountPercents2 = mainItem.getDiscountPercents();
            String title = mainItem.getTitle();
            String multiItemParams = mainItem.getMultiItemParams();
            String name = mainItem.getSeller().getName();
            Integer maxValue = mainItem.getStepper().getMaxValue();
            gn.g gVar3 = new gn.g(id2, fVar, strA, strA2, strA3, discountPercents2, title, multiItemParams, name, new Stepper(value, maxValue != null ? maxValue.intValue() : Integer.MAX_VALUE, null, null, false, 28, null));
            C27227f recommendations = c27223b.getRecommendations();
            if (recommendations != null) {
                PrintableText printableTextF2 = com.avito.android.printable_text.b.f(recommendations.getFeedTitle());
                List<C27224c> listC = recommendations.c();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
                Iterator it2 = listC.iterator();
                while (it2.hasNext()) {
                    C27224c c27224c = (C27224c) it2.next();
                    Integer discountPercents3 = c27224c.getDiscountPercents();
                    if (discountPercents3 == null) {
                        jFloor = c27224c.getFullPrice();
                        it = it2;
                    } else {
                        long fullPrice3 = c27224c.getFullPrice();
                        int iIntValue2 = discountPercents3.intValue();
                        bVar.getClass();
                        it = it2;
                        jFloor = (long) Math.floor((1 - (iIntValue2 / 100.0f)) * fullPrice3);
                    }
                    C27226e c27226eA = C27226e.a(c27224c.getFullPrice());
                    if (discountPercents3 == null) {
                        c27226eA = null;
                    }
                    String id3 = c27224c.getId();
                    gn.f fVar2 = new gn.f(c27224c.getImage());
                    String strA4 = aVar.a(Long.valueOf(jFloor));
                    String strA5 = aVar.a(c27226eA != null ? Long.valueOf(c27226eA.f58135a) : null);
                    String title2 = c27224c.getTitle();
                    String name2 = c27224c.getSeller().getName();
                    C27224c.a.C2063a reviews = c27224c.getSeller().getReviews();
                    if (reviews != null) {
                        printableText2 = printableTextF;
                        gVar2 = gVar3;
                        o12 = new O(this.f115418d.format(reviews.getRating()), "(" + reviews.getReviewsCount() + ')');
                    } else {
                        printableText2 = printableTextF;
                        gVar2 = gVar3;
                        o12 = null;
                    }
                    Q q12 = new Q(name2, o12);
                    int value2 = c27224c.getStepper().getValue();
                    Integer maxValue2 = c27224c.getStepper().getMaxValue();
                    arrayList2.add(new gn.i(id3, fVar2, strA4, strA5, title2, q12, new Stepper(value2, maxValue2 != null ? maxValue2.intValue() : Integer.MAX_VALUE, null, null, false, 28, null)));
                    printableTextF = printableText2;
                    it2 = it;
                    gVar3 = gVar2;
                }
                printableText = printableTextF;
                gVar = gVar3;
                hVar = new gn.h(printableTextF2, arrayList2);
            } else {
                printableText = printableTextF;
                gVar = gVar3;
                hVar = null;
            }
            eVarA = gn.e.a(eVar2, printableText, gVar, hVar, null, new C40709a(b(c27223b.getBottomForm().getDiscountOnDelivery())), 8);
        } else if (forReducer instanceof CartSheetAfterAddingInternalAction.UpdateStocks) {
            gn.g gVar4 = eVar2.f396820c;
            String str = gVar4.f396825a;
            Map<String, Stepper> map = ((CartSheetAfterAddingInternalAction.UpdateStocks) cartSheetAfterAddingInternalAction2).f115381b;
            gn.g gVar5 = new gn.g(gVar4.f396825a, gVar4.f396826b, gVar4.f396827c, gVar4.f396828d, gVar4.f396829e, gVar4.f396830f, gVar4.f396831g, gVar4.f396832h, gVar4.f396833i, map.get(str));
            gn.h hVar2 = eVar2.f396821d;
            if (hVar2 == null || (list = hVar2.f396836b) == null) {
                arrayList = null;
            } else {
                List<gn.i> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (gn.i iVar : list2) {
                    arrayList.add(new gn.i(iVar.f396837a, iVar.f396838b, iVar.f396839c, iVar.f396840d, iVar.f396841e, iVar.f396842f, map.get(iVar.f396837a)));
                }
            }
            eVarA = gn.e.a(eVar2, null, gVar5, hVar2 != null ? new gn.h(hVar2.f396835a, arrayList) : null, null, null, 25);
        } else if (forReducer instanceof CartSheetAfterAddingInternalAction.UpdateDiscountOnDelivery) {
            C40709a.C11226a c11226aB = b(((CartSheetAfterAddingInternalAction.UpdateDiscountOnDelivery) cartSheetAfterAddingInternalAction2).f115379b);
            eVar2.f396823f.getClass();
            eVarA = gn.e.a(eVar2, null, null, null, null, new C40709a(c11226aB), 15);
        } else {
            if (!(forReducer instanceof CartSheetAfterAddingInternalAction.SetAnalyticsData)) {
                throw new NoWhenBranchMatchedException();
            }
            eVarA = gn.e.a(eVar2, null, null, null, ((CartSheetAfterAddingInternalAction.SetAnalyticsData) cartSheetAfterAddingInternalAction2).f115378b, null, 23);
        }
        return eVarA;
    }
}
