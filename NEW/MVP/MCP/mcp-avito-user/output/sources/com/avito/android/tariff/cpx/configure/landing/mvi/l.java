package com.avito.android.tariff.cpx.configure.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.landing.items.accordions_card.CpxConfigureLandingAccordionItem;
import com.avito.android.tariff.cpx.configure.landing.mvi.entity.CpxConfigureLandingInternalAction;
import com.avito.android.tariff.remote.model.cpx.Badge;
import com.avito.android.util.InterfaceC35863o4;
import eC0.C39989a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qB0.C47270a;
import qB0.C47271b;
import qB0.C47274e;
import uZ.C49004a;

/* compiled from: CpxConfigureLandingReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/configure/landing/mvi/entity/CpxConfigureLandingInternalAction;", "LqB0/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<CpxConfigureLandingInternalAction, C47274e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f296044b;

    /* compiled from: CpxConfigureLandingReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f296045a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f296046b;

        static {
            int[] iArr = new int[Badge.Type.values().length];
            try {
                iArr[Badge.Type.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Badge.Type.VIOLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Badge.Type.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Badge.Type.GRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Badge.Type.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Badge.Type.BLACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f296045a = iArr;
            int[] iArr2 = new int[Badge.Edge.values().length];
            try {
                iArr2[Badge.Edge.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Badge.Edge.FLAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Badge.Edge.PIPKA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Badge.Edge.PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Badge.Edge.ANTI_PYRAMID.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f296046b = iArr2;
        }
    }

    @Inject
    public l(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f296044b = interfaceC35863o4;
    }

    public static DockingBadgeEdgeType b(Badge.Edge edge) {
        int i12 = a.f296046b[edge.ordinal()];
        if (i12 == 1) {
            return DockingBadgeEdgeType.Square;
        }
        if (i12 == 2) {
            return DockingBadgeEdgeType.Flag;
        }
        if (i12 == 3) {
            return DockingBadgeEdgeType.Pipka;
        }
        if (i12 == 4) {
            return DockingBadgeEdgeType.Pyramid;
        }
        if (i12 == 5) {
            return DockingBadgeEdgeType.AntiPyramid;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C47274e a(CpxConfigureLandingInternalAction cpxConfigureLandingInternalAction, C47274e c47274e) {
        C42784z0 c42784z0;
        C47270a c47270a;
        List<eC0.b> listA;
        ArrayList arrayList;
        ArrayList arrayList2;
        DockingBadgeType.Predefined predefined;
        CpxConfigureLandingInternalAction cpxConfigureLandingInternalAction2 = cpxConfigureLandingInternalAction;
        C47274e c47274e2 = c47274e;
        int i12 = 0;
        int i13 = 10;
        if (!(cpxConfigureLandingInternalAction2 instanceof CpxConfigureLandingInternalAction.Content)) {
            if (cpxConfigureLandingInternalAction2 instanceof CpxConfigureLandingInternalAction.Error) {
                return C47274e.a(c47274e2, null, ((CpxConfigureLandingInternalAction.Error) cpxConfigureLandingInternalAction2).f296028b, false, 51);
            }
            boolean z12 = true;
            if (cpxConfigureLandingInternalAction2 instanceof CpxConfigureLandingInternalAction.Loading) {
                return C47274e.a(c47274e2, null, null, true, 51);
            }
            if (!(cpxConfigureLandingInternalAction2 instanceof CpxConfigureLandingInternalAction.OnAccordionClicked)) {
                return c47274e2;
            }
            List<com.avito.conveyor_item.a> list = c47274e2.f429096b;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a aVar : list) {
                if (aVar instanceof com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) {
                    com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a aVar2 = (com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a) aVar;
                    List<CpxConfigureLandingAccordionItem> list2 = aVar2.f295947d;
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
                    for (CpxConfigureLandingAccordionItem cpxConfigureLandingAccordionItem : list2) {
                        if (L.f(((CpxConfigureLandingInternalAction.OnAccordionClicked) cpxConfigureLandingInternalAction2).f296031b, cpxConfigureLandingAccordionItem.f295941b)) {
                            cpxConfigureLandingAccordionItem = new CpxConfigureLandingAccordionItem(cpxConfigureLandingAccordionItem.f295944e ^ z12, cpxConfigureLandingAccordionItem.f295942c, cpxConfigureLandingAccordionItem.f295941b, cpxConfigureLandingAccordionItem.f295943d);
                        }
                        arrayList4.add(cpxConfigureLandingAccordionItem);
                        z12 = true;
                    }
                    aVar = new com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a(aVar2.f295945b, aVar2.f295946c, arrayList4);
                }
                arrayList3.add(aVar);
                z12 = true;
            }
            return C47274e.a(c47274e2, arrayList3, null, false, 62);
        }
        ArrayList arrayList5 = new ArrayList();
        eC0.g gVar = ((CpxConfigureLandingInternalAction.Content) cpxConfigureLandingInternalAction2).f296027b;
        arrayList5.add(new com.avito.android.tariff.cpx.configure.landing.items.header.a(gVar.getHeader().getTitle(), gVar.getHeader().getDescription(), gVar.getHeader().getImage()));
        eC0.n info = gVar.getInfo();
        if (info != null) {
            arrayList5.add(new com.avito.android.tariff.cpx.configure.landing.items.info.a(info.getIcon(), info.getBackgroundColor(), info.getText()));
        }
        List<eC0.c> listC = gVar.c();
        if (listC != null) {
            for (Object obj : listC) {
                int i14 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                eC0.c cVar = (eC0.c) obj;
                String strG = AK.c.g(i12, "card_item_");
                List<eC0.u> listD = cVar.d();
                if (listD != null) {
                    List<eC0.u> list3 = listD;
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(list3, i13));
                    for (eC0.u uVar : list3) {
                        arrayList6.add(new com.avito.android.tariff.cpx.configure.landing.items.card.g(uVar.getText(), uVar.getBottomSpacer()));
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = null;
                }
                List<Badge> listA2 = cVar.a();
                if (listA2 != null) {
                    List<Badge> list4 = listA2;
                    ArrayList arrayList7 = new ArrayList(C42745f0.q(list4, i13));
                    for (Badge badge : list4) {
                        String title = badge.getTitle();
                        switch (a.f296045a[badge.getType().ordinal()]) {
                            case 1:
                                predefined = DockingBadgeType.Predefined.Green;
                                break;
                            case 2:
                                predefined = DockingBadgeType.Predefined.Violet;
                                break;
                            case 3:
                                predefined = DockingBadgeType.Predefined.Blue;
                                break;
                            case 4:
                                predefined = DockingBadgeType.Predefined.Gray;
                                break;
                            case 5:
                                predefined = DockingBadgeType.Predefined.Red;
                                break;
                            case 6:
                                predefined = DockingBadgeType.Predefined.Black;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        arrayList7.add(new DockingBadgeItem(title, predefined, b(badge.getLeftEndType()), b(badge.getRightEndType()), null, 16, null));
                    }
                    arrayList2 = arrayList7;
                } else {
                    arrayList2 = null;
                }
                arrayList5.add(new com.avito.android.tariff.cpx.configure.landing.items.card.a(strG, arrayList, arrayList2, cVar.getButton(), cVar.getImage()));
                i12 = i14;
                i13 = 10;
            }
        }
        C39989a accordion = gVar.getAccordion();
        AttributedText title2 = accordion != null ? accordion.getTitle() : null;
        C39989a accordion2 = gVar.getAccordion();
        if (accordion2 == null || (listA = accordion2.a()) == null) {
            c42784z0 = C42784z0.f406748b;
        } else {
            List<eC0.b> list5 = listA;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list5, 10));
            for (eC0.b bVar : list5) {
                arrayList8.add(new CpxConfigureLandingAccordionItem(bVar.getIsExpanded(), bVar.getTitle(), this.f296044b.a(), bVar.getValue()));
            }
            c42784z0 = arrayList8;
        }
        arrayList5.add(new com.avito.android.tariff.cpx.configure.landing.items.accordions_card.a("accordions_card_item_id", title2, c42784z0));
        ButtonAction button = gVar.getButton();
        uZ.d navBar = gVar.getNavBar();
        if (navBar != null) {
            Float progress = navBar.getProgress();
            C49004a button2 = navBar.getButton();
            c47270a = new C47270a(progress, button2 != null ? new C47271b(button2.getTitle(), button2.getDeeplink()) : null);
        } else {
            c47270a = null;
        }
        return new C47274e(arrayList5, button, null, false, c47270a, gVar.getTerms());
    }
}
