package com.avito.android.mortgage_calculator.internal.mvi.mapper;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.akita.compose.component.docking_badge.m;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.CalculatorOfferDescriptionAction;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.DescriptionActionCalculationFieldUpdate;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.LimitsFailureAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.CalculatorField;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v10.C49139a;
import v10.C49140b;
import v10.C49141c;
import v10.n;
import v10.s;
import v10.t;
import v10.v;
import z10.C50349b;
import z10.C50350c;
import z10.InterfaceC50348a;
import z10.InterfaceC50351d;
import z10.InterfaceC50353f;

/* compiled from: OffersResponseMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/mapper/e;", "Lcom/avito/android/mortgage_calculator/internal/mvi/mapper/d;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.mortgage_calculator.internal.mvi.mapper.d {

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204666a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f204667b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f204668c;

        static {
            int[] iArr = new int[CalculatorOfferDescriptionAction.Type.values().length];
            try {
                iArr[CalculatorOfferDescriptionAction.Type.Navigation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalculatorOfferDescriptionAction.Type.CalculationUpdate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalculatorOfferDescriptionAction.Type.CalculationFieldUpdate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f204666a = iArr;
            int[] iArr2 = new int[LimitsFailureAction.FieldV2.values().length];
            try {
                iArr2[LimitsFailureAction.FieldV2.PropertyCost.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LimitsFailureAction.FieldV2.LandCost.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LimitsFailureAction.FieldV2.DownPayment.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LimitsFailureAction.FieldV2.Term.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LimitsFailureAction.FieldV2.MonthlyPayment.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LimitsFailureAction.FieldV2.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f204667b = iArr2;
            int[] iArr3 = new int[DescriptionActionCalculationFieldUpdate.FieldV2.values().length];
            try {
                iArr3[DescriptionActionCalculationFieldUpdate.FieldV2.PropertyCost.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DescriptionActionCalculationFieldUpdate.FieldV2.LandCost.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DescriptionActionCalculationFieldUpdate.FieldV2.DownPayment.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[DescriptionActionCalculationFieldUpdate.FieldV2.Term.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DescriptionActionCalculationFieldUpdate.FieldV2.MonthlyPayment.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[DescriptionActionCalculationFieldUpdate.FieldV2.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            f204668c = iArr3;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f204669l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1041834767);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarI = com.akita.compose.theme.re23.b.h(a13).i();
            a13.h();
            return iVarI;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f204670l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1798139430);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarF = com.akita.compose.theme.re23.b.h(a13).f();
            a13.h();
            return iVarF;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f204671l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(1812597561);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarE = com.akita.compose.theme.re23.b.h(a13).e();
            a13.h();
            return iVarE;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.mapper.e$e, reason: collision with other inner class name */
    public static final class C6103e extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f204672l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6103e(boolean z12) {
            super(2);
            this.f204672l = z12;
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(1128367256);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarK = com.akita.compose.theme.re23.b.h(a13).k();
            if (this.f204672l) {
                iVarK = com.akita.compose.component.docking_badge.i.a(iVarK, com.akita.compose.theme.re23.b.f63984b.f63851H1);
            }
            a13.h();
            return iVarK;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f204673l = new f();

        public f() {
            super(2);
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(444136951);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarH = com.akita.compose.theme.re23.b.h(a13).h();
            a13.h();
            return iVarH;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f204674l = new g();

        public g() {
            super(2);
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-240093354);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarO = com.akita.compose.theme.re23.b.h(a13).o();
            a13.h();
            return iVarO;
        }
    }

    /* compiled from: OffersResponseMapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/docking_badge/i;", "invoke", "(Landroidx/compose/runtime/A;I)Lcom/akita/compose/component/docking_badge/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements p<A, Integer, com.akita.compose.component.docking_badge.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f204675l = new h();

        public h() {
            super(2);
        }

        @Override // Y41.p
        public final com.akita.compose.component.docking_badge.i invoke(A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(-1334717190);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.docking_badge.i iVarK = com.akita.compose.theme.re23.b.h(a13).k();
            a13.h();
            return iVarK;
        }
    }

    @Inject
    public e() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static com.akita.compose.component.docking_badge.m b(String str) {
        switch (str.hashCode()) {
            case -1988810866:
                if (str.equals("antiPyramid")) {
                    return m.c.f61559b;
                }
                break;
            case -894674659:
                if (str.equals("square")) {
                    return m.e.f61565b;
                }
                break;
            case -106396336:
                if (str.equals("pyramid")) {
                    return m.d.f61562b;
                }
                break;
            case 3145580:
                if (str.equals("flag")) {
                    return m.b.f61556b;
                }
                break;
            case 106673453:
                if (str.equals("pipka")) {
                    return m.c.f61559b;
                }
                break;
        }
        return m.e.f61565b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p c(String str, boolean z12) {
        switch (str.hashCode()) {
            case -816343937:
                if (str.equals("violet")) {
                    return c.f204670l;
                }
                break;
            case 112785:
                if (str.equals("red")) {
                    return f.f204673l;
                }
                break;
            case 3027034:
                if (str.equals("blue")) {
                    return d.f204671l;
                }
                break;
            case 3181155:
                if (str.equals("gray")) {
                    return new C6103e(z12);
                }
                break;
            case 93818879:
                if (str.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
                    return g.f204674l;
                }
                break;
            case 98619139:
                if (str.equals("green")) {
                    return b.f204669l;
                }
                break;
        }
        return h.f204675l;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static p d(String str, String str2, boolean z12) {
        if (!L.f(str2, Constants.SMALL)) {
            return L.f(str2, "medium") ? c(str, z12) : c(str, z12);
        }
        switch (str.hashCode()) {
            case -816343937:
                if (str.equals("violet")) {
                    return com.avito.android.mortgage_calculator.internal.mvi.mapper.g.f204677l;
                }
                break;
            case 112785:
                if (str.equals("red")) {
                    return j.f204680l;
                }
                break;
            case 3027034:
                if (str.equals("blue")) {
                    return com.avito.android.mortgage_calculator.internal.mvi.mapper.h.f204678l;
                }
                break;
            case 3181155:
                if (str.equals("gray")) {
                    return new i(z12);
                }
                break;
            case 93818879:
                if (str.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
                    return k.f204681l;
                }
                break;
            case 98619139:
                if (str.equals("green")) {
                    return com.avito.android.mortgage_calculator.internal.mvi.mapper.f.f204676l;
                }
                break;
        }
        return l.f204682l;
    }

    @Override // com.avito.android.mortgage_calculator.internal.mvi.mapper.d
    @Y61.k
    public final C10.b a(@Y61.k C49139a c49139a) {
        LinkedHashMap linkedHashMap;
        Iterator it;
        C50349b c50349b;
        ArrayList arrayList;
        B10.b bVar;
        C50350c c50350c;
        InterfaceC50348a cVar;
        DeepLink noMatchLink;
        CalculatorField calculatorField;
        Iterator it2;
        String str;
        InterfaceC50353f dVar;
        InterfaceC50353f cVar2;
        CalculatorField calculatorField2;
        B10.b bVar2;
        AttributedText title = c49139a.getOffersSummary().getTitle();
        String banksImageUrl = c49139a.getOffersSummary().getBanksImageUrl();
        List<v10.d> listA = c49139a.a();
        v10.p offersTeaser = c49139a.getOffersTeaser();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = listA.iterator();
        while (it3.hasNext()) {
            v10.d dVar2 = (v10.d) it3.next();
            v10.i preview = dVar2.getPreview();
            if (preview.getSuccess() != null) {
                AttributedText title2 = preview.getTitle();
                v10.k success = preview.getSuccess();
                B10.e eVar = new B10.e(success.getOffer().getTitle(), success.getOffer().getValue());
                n discounts = success.getDiscounts();
                if (discounts != null) {
                    String title3 = discounts.getTitle();
                    List<C49140b> listA2 = discounts.a();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listA2, 10));
                    Iterator it4 = listA2.iterator();
                    while (it4.hasNext()) {
                        C49140b c49140b = (C49140b) it4.next();
                        arrayList3.add(new B10.a(b(c49140b.getRightCorner()), b(c49140b.getRightCorner()), d(c49140b.getPreset(), c49140b.getSize(), true), com.avito.android.printable_text.b.f(c49140b.getText())));
                        it4 = it4;
                        it3 = it3;
                        banksImageUrl = banksImageUrl;
                    }
                    it2 = it3;
                    str = banksImageUrl;
                    bVar2 = new B10.b(title3, arrayList3);
                } else {
                    it2 = it3;
                    str = banksImageUrl;
                    bVar2 = null;
                }
                List<v10.m> listA3 = success.a();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(listA3, 10));
                for (v10.m mVar : listA3) {
                    arrayList4.add(new B10.d(mVar.getTitle(), mVar.getValue()));
                }
                dVar = new InterfaceC50353f.d(title2, eVar, bVar2, arrayList4, success.getOffer().getHint());
            } else {
                it2 = it3;
                str = banksImageUrl;
                if (preview.getLimitsFailure() != null) {
                    AttributedText title4 = preview.getTitle();
                    s limitsFailure = preview.getLimitsFailure();
                    String hint = limitsFailure.getHint();
                    String text = limitsFailure.getAction().getText();
                    switch (a.f204667b[limitsFailure.getAction().getFieldV2().ordinal()]) {
                        case 1:
                            calculatorField2 = CalculatorField.f204610b;
                            break;
                        case 2:
                            calculatorField2 = CalculatorField.f204611c;
                            break;
                        case 3:
                            calculatorField2 = CalculatorField.f204613e;
                            break;
                        case 4:
                            calculatorField2 = CalculatorField.f204614f;
                            break;
                        case 5:
                            calculatorField2 = CalculatorField.f204612d;
                            break;
                        case 6:
                            calculatorField2 = CalculatorField.f204615g;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    CalculatorField calculatorField3 = calculatorField2;
                    long value = limitsFailure.getAction().getValue();
                    C49141c event = limitsFailure.getAction().getEvent();
                    String mortgageCriticalCase = event != null ? event.getMortgageCriticalCase() : null;
                    C49141c event2 = limitsFailure.getAction().getEvent();
                    cVar2 = new InterfaceC50353f.b(title4, hint, new A10.a(text, calculatorField3, mortgageCriticalCase, event2 != null ? event2.getButtonName() : null, value));
                } else if (preview.getNothingFound() != null) {
                    AttributedText title5 = preview.getTitle();
                    v10.j nothingFound = preview.getNothingFound();
                    cVar2 = new InterfaceC50353f.c(title5, nothingFound.getTitle(), nothingFound.getDescription());
                } else {
                    dVar = null;
                }
                dVar = cVar2;
            }
            InterfaceC50351d.a aVar = dVar == null ? null : new InterfaceC50351d.a(dVar, dVar2.getType());
            if (aVar != null) {
                arrayList2.add(aVar);
            }
            it3 = it2;
            banksImageUrl = str;
        }
        String str2 = banksImageUrl;
        ArrayList arrayList5 = new ArrayList(arrayList2);
        if (arrayList5.size() > 1) {
            arrayList5.add(new InterfaceC50351d.b(offersTeaser.getTitle(), offersTeaser.getImage(), new A10.b(offersTeaser.getAction().getDeeplink(), offersTeaser.getAction().getText())));
        }
        String title6 = c49139a.getProgramsStaticDescriptions().getTitle();
        List<v10.d> listA4 = c49139a.a();
        List<t> listA5 = c49139a.getProgramsStaticDescriptions().a();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : listA4) {
            String type = ((v10.d) obj).getType();
            Object objR = linkedHashMap2.get(type);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap2, type);
            }
            ((List) objR).add(obj);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(P0.f(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), ((v10.d) C42745f0.E((List) entry.getValue())).getDescription());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : listA5) {
            if (linkedHashMap3.get(((t) obj2).getType()) != null) {
                arrayList6.add(obj2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            t tVar = (t) it5.next();
            v10.f fVar = (v10.f) linkedHashMap3.get(tVar.getType());
            if (fVar != null) {
                String tabTitle = tVar.getTabTitle();
                if (fVar.getOffersSummary() == null && fVar.getOffer() == null && fVar.b() == null && fVar.getDiscounts() == null) {
                    linkedHashMap = linkedHashMap3;
                    it = it5;
                    c50350c = null;
                } else {
                    v10.h offersSummary = fVar.getOffersSummary();
                    AttributedText title7 = offersSummary != null ? offersSummary.getTitle() : null;
                    v10.h offersSummary2 = fVar.getOffersSummary();
                    String banksImageUrl2 = offersSummary2 != null ? offersSummary2.getBanksImageUrl() : null;
                    v10.e offer = fVar.getOffer();
                    z10.g gVar = offer != null ? new z10.g(offer.getTitle(), offer.getValue(), offer.getHint()) : null;
                    List<v10.m> listB = fVar.b();
                    if (listB != null) {
                        List<v10.m> list = listB;
                        ArrayList arrayList8 = new ArrayList(C42745f0.q(list, 10));
                        for (v10.m mVar2 : list) {
                            arrayList8.add(new B10.d(mVar2.getTitle(), mVar2.getValue()));
                        }
                        arrayList = arrayList8;
                    } else {
                        arrayList = null;
                    }
                    n discounts2 = fVar.getDiscounts();
                    if (discounts2 != null) {
                        String title8 = discounts2.getTitle();
                        List<C49140b> listA6 = discounts2.a();
                        ArrayList arrayList9 = new ArrayList(C42745f0.q(listA6, 10));
                        Iterator it6 = listA6.iterator();
                        while (it6.hasNext()) {
                            C49140b c49140b2 = (C49140b) it6.next();
                            arrayList9.add(new B10.a(b(c49140b2.getRightCorner()), b(c49140b2.getRightCorner()), d(c49140b2.getPreset(), c49140b2.getSize(), false), com.avito.android.printable_text.b.f(c49140b2.getText())));
                            it6 = it6;
                            linkedHashMap3 = linkedHashMap3;
                            it5 = it5;
                        }
                        linkedHashMap = linkedHashMap3;
                        it = it5;
                        bVar = new B10.b(title8, arrayList9);
                    } else {
                        linkedHashMap = linkedHashMap3;
                        it = it5;
                        bVar = null;
                    }
                    c50350c = new C50350c(title7, banksImageUrl2, gVar, arrayList, bVar);
                }
                String title9 = tVar.getConditions().getTitle();
                ArrayList arrayListC = C42745f0.C(tVar.getConditions().b());
                ArrayList arrayList10 = new ArrayList(C42745f0.q(arrayListC, 10));
                Iterator it7 = arrayListC.iterator();
                while (it7.hasNext()) {
                    v vVar = (v) it7.next();
                    arrayList10.add(new B10.e(vVar.getTitle(), vVar.getValue()));
                }
                B10.c cVar3 = new B10.c(title9, arrayList10);
                AttributedText description = tVar.getDescription();
                CalculatorOfferDescriptionAction action = fVar.getAction();
                int i12 = a.f204666a[action.getType().ordinal()];
                if (i12 == 1) {
                    String text2 = action.getText();
                    String hint2 = action.getHint();
                    v10.g navigation2 = action.getNavigation();
                    if (navigation2 == null || (noMatchLink = navigation2.getDeeplink()) == null) {
                        noMatchLink = new NoMatchLink();
                    }
                    cVar = new InterfaceC50348a.c(text2, hint2, noMatchLink);
                } else if (i12 == 2) {
                    cVar = new InterfaceC50348a.b(action.getText(), action.getHint());
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String text3 = action.getText();
                    String hint3 = action.getHint();
                    switch (a.f204668c[action.getCalculationFieldUpdate().getFieldV2().ordinal()]) {
                        case 1:
                            calculatorField = CalculatorField.f204610b;
                            break;
                        case 2:
                            calculatorField = CalculatorField.f204611c;
                            break;
                        case 3:
                            calculatorField = CalculatorField.f204613e;
                            break;
                        case 4:
                            calculatorField = CalculatorField.f204614f;
                            break;
                        case 5:
                            calculatorField = CalculatorField.f204612d;
                            break;
                        case 6:
                            calculatorField = CalculatorField.f204615g;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    CalculatorField calculatorField4 = calculatorField;
                    C49141c event3 = action.getCalculationFieldUpdate().getEvent();
                    String mortgageCriticalCase2 = event3 != null ? event3.getMortgageCriticalCase() : null;
                    C49141c event4 = action.getCalculationFieldUpdate().getEvent();
                    cVar = new InterfaceC50348a.C12940a(text3, hint3, calculatorField4, action.getCalculationFieldUpdate().getValue(), mortgageCriticalCase2, event4 != null ? event4.getButtonName() : null);
                }
                c50349b = new C50349b(tabTitle, c50350c, cVar3, description, cVar, tVar.getType());
            } else {
                linkedHashMap = linkedHashMap3;
                it = it5;
                c50349b = null;
            }
            if (c50349b != null) {
                arrayList7.add(c50349b);
            }
            linkedHashMap3 = linkedHashMap;
            it5 = it;
        }
        return new C10.b(title, str2, arrayList5, title6, arrayList7, c49139a.getPrimaryActionLink(), c49139a.getSecondaryActionLink(), new H10.a(c49139a.getSnippet().getMonthlyPayment()));
    }
}
