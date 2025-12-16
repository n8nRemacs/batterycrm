package com.avito.android.tariff_cpt.configure.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction;
import com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c;
import com.avito.android.tariff_cpt.generated.api.api_tariff_cpt_configure_levels_v_2.ApiTariffCptConfigureLevelsV2Badge;
import com.avito.android.tariff_cpt.generated.api.api_tariff_cpt_configure_levels_v_2.ApiTariffCptConfigureLevelsV2DockingBadge;
import iC0.C41267a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import qC0.C47281c;
import vC0.C49193a;
import vC0.C49194b;
import vC0.C49195c;

/* compiled from: TariffCptConfigureLevelsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "LqC0/c;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements u<TariffCptConfigureLevelsInternalAction, C47281c> {

    /* compiled from: TariffCptConfigureLevelsReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f297925a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f297926b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f297927c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f297928d;

        static {
            int[] iArr = new int[ApiTariffCptConfigureLevelsV2Badge.BadgeStyle.values().length];
            try {
                iArr[ApiTariffCptConfigureLevelsV2Badge.BadgeStyle.Red.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTariffCptConfigureLevelsV2Badge.BadgeStyle.Black.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f297925a = iArr;
            int[] iArr2 = new int[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.values().length];
            try {
                iArr2[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.Gray.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.Black.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.Red.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiTariffCptConfigureLevelsV2DockingBadge.DockingBadgeStyle.Blue.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f297926b = iArr2;
            int[] iArr3 = new int[ApiTariffCptConfigureLevelsV2DockingBadge.LeftEndType.values().length];
            try {
                iArr3[ApiTariffCptConfigureLevelsV2DockingBadge.LeftEndType.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiTariffCptConfigureLevelsV2DockingBadge.LeftEndType.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiTariffCptConfigureLevelsV2DockingBadge.LeftEndType.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ApiTariffCptConfigureLevelsV2DockingBadge.LeftEndType.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ApiTariffCptConfigureLevelsV2DockingBadge.LeftEndType.Square.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f297927c = iArr3;
            int[] iArr4 = new int[ApiTariffCptConfigureLevelsV2DockingBadge.RightEndType.values().length];
            try {
                iArr4[ApiTariffCptConfigureLevelsV2DockingBadge.RightEndType.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ApiTariffCptConfigureLevelsV2DockingBadge.RightEndType.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ApiTariffCptConfigureLevelsV2DockingBadge.RightEndType.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ApiTariffCptConfigureLevelsV2DockingBadge.RightEndType.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ApiTariffCptConfigureLevelsV2DockingBadge.RightEndType.Square.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            f297928d = iArr4;
        }
    }

    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47281c a(TariffCptConfigureLevelsInternalAction tariffCptConfigureLevelsInternalAction, C47281c c47281c) {
        c.C9103c c9103c;
        c.b bVar;
        ArrayList arrayList;
        DockingBadgeType.Predefined predefined;
        DockingBadgeEdgeType dockingBadgeEdgeType;
        DockingBadgeEdgeType dockingBadgeEdgeType2;
        int i12;
        TariffCptConfigureLevelsInternalAction tariffCptConfigureLevelsInternalAction2 = tariffCptConfigureLevelsInternalAction;
        C47281c c47281c2 = c47281c;
        int i13 = 10;
        if (!(tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.Content)) {
            if (tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.Error) {
                return C47281c.a(c47281c2, null, null, null, false, false, ((TariffCptConfigureLevelsInternalAction.Error) tariffCptConfigureLevelsInternalAction2).f297896b, false, 31);
            }
            if (tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.Loading.ScreenLoading) {
                return C47281c.a(c47281c2, null, null, null, false, false, null, true, 31);
            }
            if (!(tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.Loading.LevelButtonLoading)) {
                return tariffCptConfigureLevelsInternalAction2 instanceof TariffCptConfigureLevelsInternalAction.Loading.NextButtonLoading ? C47281c.a(c47281c2, null, null, null, ((TariffCptConfigureLevelsInternalAction.Loading.NextButtonLoading) tariffCptConfigureLevelsInternalAction2).f297903b, false, null, false, 119) : c47281c2;
            }
            TariffCptConfigureLevelsInternalAction.Loading.LevelButtonLoading levelButtonLoading = (TariffCptConfigureLevelsInternalAction.Loading.LevelButtonLoading) tariffCptConfigureLevelsInternalAction2;
            List<com.avito.conveyor_item.a> list = c47281c2.f429120c;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a dVar : list) {
                if (dVar instanceof com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.d) {
                    com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.d dVar2 = (com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.d) dVar;
                    List<com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c> list2 = dVar2.f297950c;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                    for (com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c cVar : list2) {
                        if (cVar.getF78384b() == levelButtonLoading.f297902c) {
                            cVar = new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c(cVar.f297965b, cVar.f297966c, cVar.f297967d, cVar.f297968e, cVar.f297969f, cVar.f297970g, cVar.f297971h, levelButtonLoading.f297901b);
                        }
                        arrayList3.add(cVar);
                    }
                    dVar = new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.d(dVar2.f297949b, arrayList3);
                }
                arrayList2.add(dVar);
            }
            return C47281c.a(c47281c2, null, arrayList2, null, false, levelButtonLoading.f297901b, null, false, 109);
        }
        ArrayList arrayList4 = new ArrayList();
        vC0.g gVar = ((TariffCptConfigureLevelsInternalAction.Content) tariffCptConfigureLevelsInternalAction2).f297895b;
        arrayList4.add(new com.avito.android.tariff_cpt.configure.levels.ui.items.header.a(gVar.getTitle(), gVar.getDescription()));
        List<vC0.e> listC = gVar.c();
        ArrayList arrayList5 = new ArrayList(C42745f0.q(listC, 10));
        int i14 = 0;
        for (Object obj : listC) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            vC0.e eVar = (vC0.e) obj;
            String strG = AK.c.g(i14, "level_item");
            AttributedText title = eVar.getTitle();
            C49193a button = eVar.getButton();
            C41267a c41267a = button != null ? new C41267a(button.getTitle(), button.getUri(), button.getStyle(), button.getIsEnabled()) : null;
            List<vC0.d> listA = eVar.a();
            ArrayList arrayList6 = new ArrayList(C42745f0.q(listA, i13));
            for (vC0.d dVar3 : listA) {
                vC0.h icon = dVar3.getIcon();
                arrayList6.add(new c.a(icon != null ? new iC0.f(icon.getValue(), icon.getValueDark()) : null, dVar3.getTitle()));
            }
            vC0.f otherAdvantages = eVar.getOtherAdvantages();
            if (otherAdvantages != null) {
                vC0.h icon2 = otherAdvantages.getIcon();
                c9103c = new c.C9103c(icon2 != null ? new iC0.f(icon2.getValue(), icon2.getValueDark()) : null, otherAdvantages.getTitle(), otherAdvantages.getUri());
            } else {
                c9103c = null;
            }
            ApiTariffCptConfigureLevelsV2Badge badge = eVar.getBadge();
            if (badge != null) {
                String title2 = badge.getTitle();
                int i16 = a.f297925a[badge.getBadgeStyle().ordinal()];
                if (i16 == 1) {
                    i12 = R.attr.badgeTextRedL;
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.badgeTextBlackL;
                }
                bVar = new c.b(title2, i12);
            } else {
                bVar = null;
            }
            List<ApiTariffCptConfigureLevelsV2DockingBadge> listD = eVar.d();
            if (listD != null) {
                List<ApiTariffCptConfigureLevelsV2DockingBadge> list3 = listD;
                ArrayList arrayList7 = new ArrayList(C42745f0.q(list3, 10));
                for (ApiTariffCptConfigureLevelsV2DockingBadge apiTariffCptConfigureLevelsV2DockingBadge : list3) {
                    String title3 = apiTariffCptConfigureLevelsV2DockingBadge.getTitle();
                    switch (a.f297926b[apiTariffCptConfigureLevelsV2DockingBadge.getDockingBadgeStyle().ordinal()]) {
                        case 1:
                            predefined = DockingBadgeType.Predefined.Green;
                            break;
                        case 2:
                            predefined = DockingBadgeType.Predefined.Violet;
                            break;
                        case 3:
                            predefined = DockingBadgeType.Predefined.Gray;
                            break;
                        case 4:
                            predefined = DockingBadgeType.Predefined.Black;
                            break;
                        case 5:
                            predefined = DockingBadgeType.Predefined.Red;
                            break;
                        case 6:
                            predefined = DockingBadgeType.Predefined.Blue;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    DockingBadgeType.Predefined predefined2 = predefined;
                    int i17 = a.f297927c[apiTariffCptConfigureLevelsV2DockingBadge.getLeftEndType().ordinal()];
                    if (i17 == 1) {
                        dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                    } else if (i17 == 2) {
                        dockingBadgeEdgeType = DockingBadgeEdgeType.Pipka;
                    } else if (i17 == 3) {
                        dockingBadgeEdgeType = DockingBadgeEdgeType.Pyramid;
                    } else if (i17 == 4) {
                        dockingBadgeEdgeType = DockingBadgeEdgeType.AntiPyramid;
                    } else {
                        if (i17 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dockingBadgeEdgeType = DockingBadgeEdgeType.Square;
                    }
                    int i18 = a.f297928d[apiTariffCptConfigureLevelsV2DockingBadge.getRightEndType().ordinal()];
                    if (i18 == 1) {
                        dockingBadgeEdgeType2 = DockingBadgeEdgeType.Flag;
                    } else if (i18 == 2) {
                        dockingBadgeEdgeType2 = DockingBadgeEdgeType.Pipka;
                    } else if (i18 == 3) {
                        dockingBadgeEdgeType2 = DockingBadgeEdgeType.Pyramid;
                    } else if (i18 == 4) {
                        dockingBadgeEdgeType2 = DockingBadgeEdgeType.AntiPyramid;
                    } else {
                        if (i18 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dockingBadgeEdgeType2 = DockingBadgeEdgeType.Square;
                    }
                    arrayList7.add(new DockingBadgeItem(title3, predefined2, dockingBadgeEdgeType, dockingBadgeEdgeType2, null, 16, null));
                }
                arrayList = arrayList7;
            } else {
                arrayList = null;
            }
            arrayList5.add(new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.level_card.c(strG, title, c41267a, arrayList6, c9103c, bVar, arrayList, false, 128, null));
            i14 = i15;
            i13 = 10;
        }
        iC0.d dVar4 = null;
        arrayList4.add(new com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.d("levels_item", arrayList5));
        C49195c navbar = gVar.getNavbar();
        if (navbar != null) {
            Double progress = navbar.getProgress();
            Float fValueOf = progress != null ? Float.valueOf((float) progress.doubleValue()) : null;
            C49194b button2 = navbar.getButton();
            dVar4 = new iC0.d(fValueOf, button2 != null ? new C41267a(button2.getTitle(), button2.getUri(), button2.getStyle(), button2.getIsEnabled()) : null);
        }
        return C47281c.a(c47281c2, dVar4, arrayList4, new C41267a(gVar.getButton().getTitle(), gVar.getButton().getUri(), gVar.getButton().getStyle(), gVar.getButton().getIsEnabled()), false, false, null, false, 24);
    }
}
