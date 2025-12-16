package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.fmp.calculator.AdvertDetailsFmpCalculatorItem;
import com.avito.android.remote.fmp.FmpButtonClick;
import com.avito.android.remote.fmp.FmpCalculatorButton;
import com.avito.android.remote.fmp.FmpLoanPeriod;
import com.avito.android.remote.fmp.FmpPaymentTitle;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.fmp.ButtonClick;
import com.avito.android.remote.model.fmp.CalculatorButton;
import com.avito.android.remote.model.fmp.Fmp;
import com.avito.android.remote.model.fmp.FmpCalculator;
import com.avito.android.remote.model.fmp.LoanPeriod;
import com.avito.android.remote.model.fmp.PaymentTitle;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsFmpCalculatorItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/z1;", "Lcom/avito/android/advert/item/blocks/items_factories/y1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.z1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28088z1 implements InterfaceC28082y1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74087a;

    @Inject
    public C28088z1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74087a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28082y1
    @Y61.l
    public final AdvertDetailsFmpCalculatorItem a(@Y61.k AdvertDetails advertDetails) {
        FmpCalculator calculator;
        ArrayList arrayList;
        FmpCalculatorButton fmpCalculatorButton;
        FmpButtonClick fmpButtonClick;
        Fmp fmp = advertDetails.getFmp();
        if (fmp == null || (calculator = fmp.getCalculator()) == null) {
            return null;
        }
        AttributedText title = calculator.getTitle();
        AttributedText promoTitle = calculator.getPromoTitle();
        String inputValue = calculator.getInputValue();
        Integer minLoanValue = calculator.getMinLoanValue();
        Integer maxLoanValue = calculator.getMaxLoanValue();
        String inputDescription = calculator.getInputDescription();
        List<LoanPeriod> loanPeriods = calculator.getLoanPeriods();
        if (loanPeriods != null) {
            List<LoanPeriod> list = loanPeriods;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (LoanPeriod loanPeriod : list) {
                String strValueOf = String.valueOf(loanPeriod.getTitle());
                Integer value = loanPeriod.getValue();
                Boolean boolIsSelected = loanPeriod.isSelected();
                arrayList.add(new FmpLoanPeriod(strValueOf, value, Boolean.valueOf(boolIsSelected != null ? boolIsSelected.booleanValue() : false)));
            }
        } else {
            arrayList = null;
        }
        PaymentTitle paymentTitle = calculator.getPaymentTitle();
        FmpPaymentTitle fmpPaymentTitle = paymentTitle != null ? new FmpPaymentTitle(paymentTitle.getLeftPart(), paymentTitle.getRightPart(), paymentTitle.getIcon()) : null;
        CalculatorButton button = calculator.getButton();
        if (button != null) {
            String text = button.getText();
            String style = button.getStyle();
            ButtonClick onClick = button.getOnClick();
            if (onClick != null) {
                String deeplink = onClick.getDeeplink();
                List<FmpAnalyticsEvent> analytics = onClick.getAnalytics();
                fmpButtonClick = new FmpButtonClick(deeplink, analytics != null ? B1.a(analytics) : null);
            } else {
                fmpButtonClick = null;
            }
            fmpCalculatorButton = new FmpCalculatorButton(text, style, fmpButtonClick);
        } else {
            fmpCalculatorButton = null;
        }
        Integer promoPeriod = calculator.getPromoPeriod();
        List<FmpAnalyticsEvent> onChipsClicked = calculator.getOnChipsClicked();
        ArrayList arrayListA = onChipsClicked != null ? B1.a(onChipsClicked) : null;
        List<FmpAnalyticsEvent> onAppear = calculator.getOnAppear();
        return new AdvertDetailsFmpCalculatorItem(title, promoTitle, inputValue, minLoanValue, maxLoanValue, inputDescription, arrayList, fmpPaymentTitle, fmpCalculatorButton, onAppear != null ? B1.a(onAppear) : null, arrayListA, calculator.getLegal(), calculator.getRate(), promoPeriod, 0L, null, this.f74087a.a(), null, null, 442368, null);
    }
}
