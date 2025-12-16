package com.avito.android.advert.item.fmp.calculator;

import Y41.p;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.fmp.FmpCalculatorButton;
import com.avito.android.remote.fmp.FmpLoanPeriod;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFmpCalculatorView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/calculator/k;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface k extends TV0.e {

    /* compiled from: AdvertDetailsFmpCalculatorView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ac(@Y61.k Y41.l<? super String, G0> lVar);

    void Cs(@Y61.l FormatterType formatterType);

    void E1(@Y61.k Y41.l<? super Integer, G0> lVar);

    void Fu(@Y61.l Integer num, @Y61.l Double d12, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l AttributedText attributedText3, @Y61.l AttributedText attributedText4);

    void N50();

    void Qb(@Y61.k p<? super Boolean, ? super String, G0> pVar);

    void Y(@Y61.k Y41.a<G0> aVar);

    void a5(@Y61.l List<FmpLoanPeriod> list);

    void dH();

    void nJ(@Y61.l FmpCalculatorButton fmpCalculatorButton);

    void sk(@Y61.l String str);

    void te(@Y61.l String str);

    void x4(@Y61.l AttributedText attributedText);
}
