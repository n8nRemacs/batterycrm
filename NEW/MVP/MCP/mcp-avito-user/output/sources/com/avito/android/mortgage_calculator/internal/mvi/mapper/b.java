package com.avito.android.mortgage_calculator.internal.mvi.mapper;

import F10.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.internal.items.DisclaimerDescription;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import u10.C48759a;
import u10.C48760b;
import u10.C48761c;
import u10.C48762d;
import u10.C48763e;
import x10.C49742a;
import y10.C50036a;
import y10.C50037b;
import y10.C50038c;

/* compiled from: InitialValuesResponseMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/mapper/b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/mapper/a;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage_calculator.internal.mvi.mapper.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CalculatorTabType f204664a;

    /* compiled from: InitialValuesResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalculatorTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalculatorTabType.a aVar = CalculatorTabType.f204618c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public b() {
        CalculatorTabType.f204618c.getClass();
        this.f204664a = CalculatorTabType.f204619d;
    }

    public static C50036a b(C48763e c48763e) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(c48763e.getTitle());
        List<C48762d> listC = c48763e.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (C48762d c48762d : listC) {
            arrayList.add(new C50036a.C12884a(c48762d.getStringValue(), c48762d.getValue(), c48762d.getValue() == c48763e.getInitial(), false, 8, null));
        }
        return new C50036a(printableTextF, arrayList);
    }

    @Override // com.avito.android.mortgage_calculator.internal.mvi.mapper.a
    @Y61.k
    public final C10.a a(@Y61.k C48759a c48759a) {
        C50037b c50037b;
        C50037b c50037b2;
        C50036a c50036aB;
        long locationId = c48759a.getLocationId();
        String purposeId = c48759a.getPurposeId();
        PrintableText printableTextF = com.avito.android.printable_text.b.f(c48759a.getTitle());
        C48760b byCost = c48759a.getByCost();
        long initial = byCost.getCost().getInitial();
        u10.f landCost = byCost.getLandCost();
        long initial2 = initial + (landCost != null ? landCost.getInitial() : 0L);
        long initial3 = byCost.getDownPayment().getInitial();
        long value = byCost.getDownPayment().getMin().getValue();
        long value2 = byCost.getDownPayment().getMax().getValue();
        float f12 = 100;
        float f13 = (initial3 / initial2) * f12;
        long jC2 = kotlin.math.b.c((value / f12) * r5);
        long jC3 = kotlin.math.b.c((value2 / f12) * r5);
        PrintableText printableTextF2 = com.avito.android.printable_text.b.f(byCost.getTabTitle());
        C50037b c50037b3 = new C50037b(com.avito.android.printable_text.b.f(byCost.getCost().getTitle()), null, null, new y10.f(byCost.getCost().getMin().getValue(), byCost.getCost().getMax().getValue()), new y10.e(String.valueOf(byCost.getCost().getInitial()), byCost.getCost().getInitial()));
        u10.f landCost2 = byCost.getLandCost();
        if (landCost2 != null) {
            c50037b = c50037b3;
            c50037b2 = new C50037b(com.avito.android.printable_text.b.f(landCost2.getTitle()), null, null, new y10.f(landCost2.getMin().getValue(), landCost2.getMax().getValue()), new y10.e(String.valueOf(landCost2.getInitial()), landCost2.getInitial()));
        } else {
            c50037b = c50037b3;
            c50037b2 = null;
        }
        C50037b c50037b4 = new C50037b(com.avito.android.printable_text.b.f(byCost.getDownPayment().getTitle()), new y10.d(new C50038c(com.avito.android.printable_text.b.f(byCost.getDownPayment().getMin().getStringValue()), byCost.getDownPayment().getMin().getValue()), new C50038c(com.avito.android.printable_text.b.f(byCost.getDownPayment().getMax().getStringValue()), byCost.getDownPayment().getMax().getValue()), f13), com.avito.android.mortgage_calculator.internal.utils.c.a(f13), new y10.f(jC2, jC3), new y10.e(String.valueOf(initial3), initial3));
        CalculatorTabType calculatorTabType = CalculatorTabType.f204620e;
        CalculatorTabType calculatorTabType2 = this.f204664a;
        a.b bVar = new a.b(printableTextF2, c50037b, c50037b2, c50037b4, calculatorTabType2 == calculatorTabType);
        C48761c byPayment = c48759a.getByPayment();
        a.C0271a c0271a = new a.C0271a(com.avito.android.printable_text.b.f(byPayment.getTabTitle()), new C50037b(com.avito.android.printable_text.b.f(byPayment.getMonthlyPayment().getTitle()), new y10.d(new C50038c(com.avito.android.printable_text.b.f(byPayment.getMonthlyPayment().getMin().getStringValue()), byPayment.getMonthlyPayment().getMin().getValue()), new C50038c(com.avito.android.printable_text.b.f(byPayment.getMonthlyPayment().getMax().getStringValue()), byPayment.getMonthlyPayment().getMax().getValue()), byPayment.getMonthlyPayment().getInitial()), null, new y10.f(byPayment.getMonthlyPayment().getMin().getValue(), byPayment.getMonthlyPayment().getMax().getValue()), new y10.e(String.valueOf(byPayment.getMonthlyPayment().getInitial()), byPayment.getMonthlyPayment().getInitial())), new C50037b(com.avito.android.printable_text.b.f(byPayment.getDownPayment().getTitle()), new y10.d(new C50038c(com.avito.android.printable_text.b.f(byPayment.getDownPayment().getMin().getStringValue()), byPayment.getDownPayment().getMin().getValue()), new C50038c(com.avito.android.printable_text.b.f(byPayment.getDownPayment().getMax().getStringValue()), byPayment.getDownPayment().getMax().getValue()), byPayment.getDownPayment().getInitial()), null, new y10.f(byPayment.getDownPayment().getMin().getValue(), byPayment.getDownPayment().getMax().getValue()), new y10.e(String.valueOf(byPayment.getDownPayment().getInitial()), byPayment.getDownPayment().getInitial())), calculatorTabType2 == CalculatorTabType.f204621f);
        C48760b byCost2 = c48759a.getByCost();
        C48761c byPayment2 = c48759a.getByPayment();
        int iOrdinal = calculatorTabType2.ordinal();
        if (iOrdinal == 0) {
            c50036aB = b(byCost2.getTerm());
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            c50036aB = b(byPayment2.getTerm());
        }
        C50036a c50036a = c50036aB;
        C49742a c49742a = new C49742a(com.avito.android.printable_text.b.f(c48759a.getPrimaryAction().getText()), c48759a.getPrimaryAction().getDeeplink(), false, false, false, 28, null);
        u10.g secondaryAction = c48759a.getSecondaryAction();
        C49742a c49742a2 = secondaryAction != null ? new C49742a(com.avito.android.printable_text.b.f(secondaryAction.getText()), secondaryAction.getDeeplink(), false, false, false, 28, null) : null;
        u10.j disclaimerV2 = c48759a.getDisclaimerV2();
        return new C10.a(locationId, purposeId, printableTextF, bVar, c0271a, c50036a, c49742a, c49742a2, disclaimerV2 != null ? new x10.b(new x10.c(disclaimerV2.getText().getText(), disclaimerV2.getText().getDescriptionAttrName()), new DisclaimerDescription(com.avito.android.printable_text.b.f(disclaimerV2.getDescription().getTitle()), disclaimerV2.getDescription().getText())) : null);
    }
}
