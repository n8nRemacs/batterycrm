package com.avito.android.mortgage.landing.mvi.builder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.Offer;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.api.model.landing.LandingHeader;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.expandable_block.ExpandableBlockItem;
import com.avito.android.mortgage.landing.list.items.faq_title.FaqTitleItem;
import com.avito.android.mortgage.landing.list.items.programs.ProgramsItem;
import com.avito.android.mortgage.landing.list.items.steps.StepsItem;
import com.avito.android.mortgage.landing.list.items.steps_title.StepsTitleItem;
import com.avito.android.mortgage.landing.mvi.entity.BottomState;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import com.avito.android.mortgage.landing.mvi.entity.LandingViewHeader;
import com.avito.android.mortgage.landing.mvi.entity.LandingViewState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u0;

/* compiled from: LandingViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/builder/h;", "Lcom/avito/android/mortgage/landing/mvi/builder/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f200096a;

    @Inject
    public h(@k e eVar) {
        this.f200096a = eVar;
    }

    @Override // com.avito.android.mortgage.landing.mvi.builder.g
    @k
    public final LandingState a(@k LandingState landingState) {
        h hVar;
        LandingViewHeader landingViewHeader;
        BottomState content;
        OffersResult offersResult;
        LandingViewState content2;
        LandingViewState landingViewState;
        Map<String, LandingItem> map = landingState.f200227c;
        boolean zIsEmpty = map.isEmpty();
        boolean z12 = landingState.f200235k;
        if (zIsEmpty && !z12) {
            landingViewState = LandingViewState.Error.f200250b;
        } else {
            if (!map.isEmpty() || !z12) {
                LandingHeader landingHeader = landingState.f200226b;
                if (landingHeader != null) {
                    landingViewHeader = new LandingViewHeader(landingHeader.getImage(), landingHeader.e(), landingHeader.getSubtitle(), landingHeader.getPrimaryAction(), landingHeader.getSecondaryAction());
                    hVar = this;
                } else {
                    hVar = this;
                    landingViewHeader = null;
                }
                hVar.f200096a.getClass();
                LandingItem landingItem = map.get("mortgageProgram");
                ProgramsItem programsItem = landingItem instanceof ProgramsItem ? (ProgramsItem) landingItem : null;
                if (programsItem == null || programsItem.f199881e.size() <= 1) {
                    programsItem = null;
                }
                t0 t0Var = new t0(27);
                t0Var.a(map.get("titleId"));
                t0Var.a(map.get("subtitleId"));
                t0Var.a(map.get("regionId"));
                t0Var.a(map.get("purposeId"));
                t0Var.a(map.get("propertyCost"));
                t0Var.a(map.get("landCost"));
                t0Var.a(map.get("houseCost"));
                t0Var.a(map.get("downPayment"));
                t0Var.a(map.get("creditTerm"));
                t0Var.a(programsItem);
                t0Var.a(map.get("employmentTitle"));
                t0Var.a(map.get("landingBorrowerAge"));
                t0Var.a(map.get("occupation"));
                t0Var.a(map.get("businessAge"));
                t0Var.a(map.get("totalExperience"));
                t0Var.a(map.get("currentExperience"));
                t0Var.a(map.get("selfEmployedExperience"));
                t0Var.a(map.get("proofOfIncome"));
                t0Var.a(map.get("bankPayrollId"));
                t0Var.a(map.get("bankSalaryId"));
                t0Var.a(map.get("banksPreferred"));
                t0Var.a(map.get("managerUspBanner"));
                t0Var.a(map.get("actionBanner"));
                t0Var.a(map.get("stepsBanner"));
                LandingItem landingItem2 = map.get("stepsBanner");
                StepsTitleItem stepsTitleItem = landingItem2 instanceof StepsTitleItem ? (StepsTitleItem) landingItem2 : null;
                List<StepsItem> list = stepsTitleItem != null ? stepsTitleItem.f200000d : null;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                t0Var.b(list.toArray(new StepsItem[0]));
                t0Var.a(map.get("faqTitle"));
                LandingItem landingItem3 = map.get("faqTitle");
                FaqTitleItem faqTitleItem = landingItem3 instanceof FaqTitleItem ? (FaqTitleItem) landingItem3 : null;
                List<ExpandableBlockItem> list2 = faqTitleItem != null ? faqTitleItem.f199721d : null;
                if (list2 == null) {
                    list2 = C42784z0.f406748b;
                }
                t0Var.b(list2.toArray(new ExpandableBlockItem[0]));
                ArrayList<Object> arrayList = t0Var.f406850a;
                ArrayList arrayListB = C42756l.B(arrayList.toArray(new LandingItem[arrayList.size()]));
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    LandingItem landingItemN = (LandingItem) it.next();
                    if (z12) {
                        landingItemN = landingItemN.N();
                    }
                    arrayList2.add(landingItemN);
                }
                if (landingState.f200237m) {
                    content = BottomState.Placeholders.f200156b;
                } else if (landingState.f200238n || (offersResult = landingState.f200229e) == null || offersResult.c().isEmpty()) {
                    content = BottomState.NothingFound.f200155b;
                } else {
                    Iterator<T> it2 = offersResult.c().iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    double rate = ((Offer) it2.next()).getRate();
                    while (it2.hasNext()) {
                        rate = Math.min(rate, ((Offer) it2.next()).getRate());
                    }
                    String strA = com.avito.android.mortgage.landing.utils.a.a(rate);
                    Iterator<T> it3 = offersResult.c().iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int payment = ((Offer) it3.next()).getPayment();
                    while (it3.hasNext()) {
                        int payment2 = ((Offer) it3.next()).getPayment();
                        if (payment > payment2) {
                            payment = payment2;
                        }
                    }
                    u0 u0Var = u0.f406856a;
                    String strReplace = String.format(Locale.getDefault(), "%,d", Arrays.copyOf(new Object[]{Integer.valueOf(payment)}, 1)).replace(',', ' ');
                    List<Offer> listC = offersResult.c();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it4 = listC.iterator();
                    while (it4.hasNext()) {
                        String icon = ((Offer) it4.next()).getBank().getIcon();
                        if (icon != null) {
                            arrayList3.add(icon);
                        }
                    }
                    content = new BottomState.Content(strA, strReplace, arrayList3);
                }
                content2 = new LandingViewState.Content(landingViewHeader, arrayList2, content);
                return LandingState.a(landingState, null, null, false, null, null, null, null, null, null, false, false, false, false, null, null, content2, 32767);
            }
            landingViewState = LandingViewState.Loading.f200251b;
        }
        content2 = landingViewState;
        return LandingState.a(landingState, null, null, false, null, null, null, null, null, null, false, false, false, false, null, null, content2, 32767);
    }
}
