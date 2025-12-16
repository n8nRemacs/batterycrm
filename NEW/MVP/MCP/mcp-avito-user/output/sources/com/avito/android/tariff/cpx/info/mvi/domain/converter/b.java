package com.avito.android.tariff.cpx.info.mvi.domain.converter;

import UB0.g;
import UB0.i;
import UB0.j;
import UB0.m;
import UB0.n;
import UB0.o;
import UB0.p;
import UB0.q;
import UB0.r;
import UB0.s;
import UB0.t;
import UB0.u;
import UB0.v;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.generated.api.api_tariff_cpx_info_v_4.OkResponseSuccessCardsItem;
import com.avito.android.tariff.generated.api.api_tariff_cpx_info_v_4.OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem;
import com.avito.android.tariff.generated.api.api_tariff_cpx_info_v_4.OkResponseSuccessCardsItemContentItemItemTextIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import uB0.AbstractC48879g;
import uB0.C48873a;
import uB0.C48874b;
import uB0.C48875c;
import uB0.C48876d;
import uB0.C48877e;
import uB0.C48878f;
import uB0.C48880h;
import wB0.C49483c;
import wZ.C49578b;
import wZ.k;

/* compiled from: TariffCpxInfoConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/domain/converter/b;", "Lcom/avito/android/tariff/cpx/info/mvi/domain/converter/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff.cpx.info.mvi.domain.converter.a {

    /* compiled from: TariffCpxInfoConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f296704a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f296705b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f296706c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f296707d;

        static {
            int[] iArr = new int[OkResponseSuccessCardsItemContentItemItemTextIcon.Align.values().length];
            try {
                iArr[OkResponseSuccessCardsItemContentItemItemTextIcon.Align.AfterText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkResponseSuccessCardsItemContentItemItemTextIcon.Align.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OkResponseSuccessCardsItemContentItemItemTextIcon.Align.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f296704a = iArr;
            int[] iArr2 = new int[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.values().length];
            try {
                iArr2[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.Gray.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.Black.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.Red.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.Type.Blue.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f296705b = iArr2;
            int[] iArr3 = new int[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.StartEdge.values().length];
            try {
                iArr3[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.StartEdge.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.StartEdge.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.StartEdge.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.StartEdge.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.StartEdge.Square.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f296706c = iArr3;
            int[] iArr4 = new int[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.EndEdge.values().length];
            try {
                iArr4[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.EndEdge.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.EndEdge.Pipka.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.EndEdge.Pyramid.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.EndEdge.AntiPyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.EndEdge.Square.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            f296707d = iArr4;
        }
    }

    @Inject
    public b() {
    }

    public static k c(UB0.a aVar) {
        k.a aVar2 = k.f441571d;
        String valueName = aVar.getValueName();
        String value = aVar.getValue();
        String valueDark = aVar.getValueDark();
        aVar2.getClass();
        return k.a.b(valueName, value, valueDark);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // com.avito.android.tariff.cpx.info.mvi.domain.converter.a
    @Y61.k
    public final ArrayList a(@l o oVar) {
        List<q> listC;
        ?? arrayList;
        if (oVar == null || (listC = oVar.c()) == null) {
            listC = C42784z0.f406748b;
        }
        List<q> list = listC;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (q qVar : list) {
            AttributedText name = qVar.getName();
            String slug = qVar.getSlug();
            List<r> listA = qVar.a();
            if (listA != null) {
                List<r> list2 = listA;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                for (r rVar : list2) {
                    arrayList.add(new C49483c.b.a(new wZ.l(rVar.getIcon().getValue(), rVar.getIcon().getValueDark()), rVar.getName(), rVar.getDescription(), rVar.getUri(), rVar.getIsEnabled()));
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            arrayList2.add(new C49483c.b(name, arrayList, slug));
        }
        return arrayList2;
    }

    @Override // com.avito.android.tariff.cpx.info.mvi.domain.converter.a
    @Y61.k
    public final ArrayList b(@Y61.k UB0.c cVar, @Y61.k Map map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<s> listD;
        com.avito.android.tariff.cpx.info.items.level_header.b bVar;
        com.avito.android.tariff.cpx.info.items.level_header.a aVar;
        ArrayList arrayList3;
        Iterator it;
        int i12;
        k kVar;
        Integer num;
        String str;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it2;
        Iterator it3;
        int i13;
        k kVar2;
        Integer num2;
        String str2;
        C48877e c48877e;
        C48876d c48876d;
        C48873a c48873a;
        DockingBadgeType.Predefined predefined;
        DockingBadgeEdgeType dockingBadgeEdgeType;
        DockingBadgeEdgeType dockingBadgeEdgeType2;
        C48878f c48878f;
        C48880h c48880h;
        ArrayList arrayList6 = new ArrayList();
        String title = cVar.getTitle();
        AttributedText description = cVar.getDescription();
        v titleButton = cVar.getTitleButton();
        com.avito.android.tariff.cpx.info.items.header.b bVar2 = titleButton != null ? new com.avito.android.tariff.cpx.info.items.header.b(com.avito.android.lib.util.q.a(titleButton.getIconName()), titleButton.getUri()) : null;
        List<u> listD2 = cVar.d();
        int i14 = 10;
        if (listD2 != null) {
            List<u> list = listD2;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(list, 10));
            for (u uVar : list) {
                arrayList7.add(new com.avito.android.tariff.cpx.info.items.header.a(uVar.getHasDotNotification(), uVar.getIsSelected(), uVar.getTitle(), uVar.getUri()));
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        arrayList6.add(new com.avito.android.tariff.cpx.info.items.header.c("header_item", title, description, bVar2, arrayList));
        List<OkResponseSuccessCardsItem> listA = cVar.a();
        if (listA != null) {
            Iterator it4 = listA.iterator();
            int i15 = 0;
            while (it4.hasNext()) {
                Object next = it4.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                OkResponseSuccessCardsItem okResponseSuccessCardsItem = (OkResponseSuccessCardsItem) next;
                String strG = AK.c.g(i15, "card_item_");
                int i17 = 1;
                int i18 = okResponseSuccessCardsItem.getWidth() == OkResponseSuccessCardsItem.Width.Half ? 1 : 2;
                DeepLink uri = okResponseSuccessCardsItem.getUri();
                UB0.a color = okResponseSuccessCardsItem.getColor();
                k kVarC = color != null ? c(color) : null;
                Long bottomSpacer = okResponseSuccessCardsItem.getBottomSpacer();
                Integer numValueOf = bottomSpacer != null ? Integer.valueOf((int) bottomSpacer.longValue()) : null;
                List<g> listC = okResponseSuccessCardsItem.c();
                if (listC != null) {
                    List<g> list2 = listC;
                    ArrayList arrayList8 = new ArrayList(C42745f0.q(list2, i14));
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        g gVar = (g) it5.next();
                        j button = gVar.getItem().getButton();
                        C48874b c48874b = button != null ? new C48874b(new C49578b(button.getTitle(), button.getUri(), button.getStyle(), null, 8, null)) : null;
                        m text = gVar.getItem().getText();
                        if (text != null) {
                            AttributedText text2 = text.getText();
                            DeepLink uri2 = text.getUri();
                            OkResponseSuccessCardsItemContentItemItemTextIcon icon = text.getIcon();
                            if (icon != null) {
                                String iconName = icon.getIconName();
                                k kVarC2 = c(icon.getColor());
                                DeepLink uri3 = icon.getUri();
                                OkResponseSuccessCardsItemContentItemItemTextIcon.Align align = icon.getAlign();
                                it2 = it4;
                                int i19 = align == null ? -1 : a.f296704a[align.ordinal()];
                                AbstractC48879g abstractC48879g = i19 != i17 ? i19 != 2 ? i19 != 3 ? AbstractC48879g.c.f439858a : AbstractC48879g.c.f439858a : AbstractC48879g.b.f439857a : AbstractC48879g.a.f439856a;
                                n padding = icon.getPadding();
                                if (padding != null) {
                                    i13 = i16;
                                    kVar2 = kVarC;
                                    num2 = numValueOf;
                                    it3 = it5;
                                    str2 = strG;
                                    arrayList5 = arrayList6;
                                    c48880h = new C48880h((int) padding.getLeft(), (int) padding.getRight(), (int) padding.getTop(), (int) padding.getBottom());
                                } else {
                                    arrayList5 = arrayList6;
                                    it3 = it5;
                                    i13 = i16;
                                    kVar2 = kVarC;
                                    num2 = numValueOf;
                                    str2 = strG;
                                    c48880h = null;
                                }
                                c48878f = new C48878f(iconName, abstractC48879g, c48880h, kVarC2, uri3);
                            } else {
                                arrayList5 = arrayList6;
                                it2 = it4;
                                it3 = it5;
                                i13 = i16;
                                kVar2 = kVarC;
                                num2 = numValueOf;
                                str2 = strG;
                                c48878f = null;
                            }
                            c48877e = new C48877e(text2, uri2, c48878f);
                        } else {
                            arrayList5 = arrayList6;
                            it2 = it4;
                            it3 = it5;
                            i13 = i16;
                            kVar2 = kVarC;
                            num2 = numValueOf;
                            str2 = strG;
                            c48877e = null;
                        }
                        UB0.l progress = gVar.getItem().getProgress();
                        if (progress != null) {
                            float value = (float) progress.getValue();
                            k kVarC3 = c(progress.getFillColor());
                            UB0.a emptyColor = progress.getEmptyColor();
                            c48876d = new C48876d(value, kVarC3, emptyColor != null ? c(emptyColor) : null);
                        } else {
                            c48876d = null;
                        }
                        UB0.k dottedText = gVar.getItem().getDottedText();
                        C48875c c48875c = dottedText != null ? new C48875c(dottedText.getLeftText(), dottedText.getRightText()) : null;
                        i badgeItem = gVar.getItem().getBadgeItem();
                        if (badgeItem != null) {
                            List<OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem> listA2 = badgeItem.a();
                            ArrayList arrayList9 = new ArrayList(C42745f0.q(listA2, 10));
                            for (OkResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem okResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem : listA2) {
                                String title2 = okResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.getTitle();
                                switch (a.f296705b[okResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.getType().ordinal()]) {
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
                                int i22 = a.f296706c[okResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.getStartEdge().ordinal()];
                                if (i22 == 1) {
                                    dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                                } else if (i22 == 2) {
                                    dockingBadgeEdgeType = DockingBadgeEdgeType.Pipka;
                                } else if (i22 == 3) {
                                    dockingBadgeEdgeType = DockingBadgeEdgeType.Pyramid;
                                } else if (i22 == 4) {
                                    dockingBadgeEdgeType = DockingBadgeEdgeType.AntiPyramid;
                                } else {
                                    if (i22 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dockingBadgeEdgeType = DockingBadgeEdgeType.Square;
                                }
                                DockingBadgeEdgeType dockingBadgeEdgeType3 = dockingBadgeEdgeType;
                                int i23 = a.f296707d[okResponseSuccessCardsItemContentItemItemBadgeItemBadgesItem.getEndEdge().ordinal()];
                                if (i23 == 1) {
                                    dockingBadgeEdgeType2 = DockingBadgeEdgeType.Flag;
                                } else if (i23 == 2) {
                                    dockingBadgeEdgeType2 = DockingBadgeEdgeType.Pipka;
                                } else if (i23 == 3) {
                                    dockingBadgeEdgeType2 = DockingBadgeEdgeType.Pyramid;
                                } else if (i23 == 4) {
                                    dockingBadgeEdgeType2 = DockingBadgeEdgeType.AntiPyramid;
                                } else {
                                    if (i23 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dockingBadgeEdgeType2 = DockingBadgeEdgeType.Square;
                                }
                                arrayList9.add(new DockingBadgeItem(title2, predefined2, dockingBadgeEdgeType3, dockingBadgeEdgeType2, null, 16, null));
                            }
                            c48873a = new C48873a(arrayList9);
                        } else {
                            c48873a = null;
                        }
                        com.avito.android.tariff.cpx.info.items.card.j jVar = new com.avito.android.tariff.cpx.info.items.card.j(c48874b, c48877e, c48876d, c48875c, c48873a);
                        Long bottomSpacer2 = gVar.getBottomSpacer();
                        arrayList8.add(new com.avito.android.tariff.cpx.info.items.card.i(jVar, bottomSpacer2 != null ? Integer.valueOf((int) bottomSpacer2.longValue()) : null));
                        kVarC = kVar2;
                        i16 = i13;
                        strG = str2;
                        it4 = it2;
                        numValueOf = num2;
                        it5 = it3;
                        arrayList6 = arrayList5;
                        i17 = 1;
                    }
                    arrayList3 = arrayList6;
                    it = it4;
                    i12 = i16;
                    kVar = kVarC;
                    num = numValueOf;
                    str = strG;
                    arrayList4 = arrayList8;
                } else {
                    arrayList3 = arrayList6;
                    it = it4;
                    i12 = i16;
                    kVar = kVarC;
                    num = numValueOf;
                    str = strG;
                    arrayList4 = null;
                }
                arrayList6 = arrayList3;
                arrayList6.add(new com.avito.android.tariff.cpx.info.items.card.a(str, i18, uri, kVar, num, arrayList4));
                i15 = i12;
                it4 = it;
                i14 = 10;
            }
        }
        o level = cVar.getLevel();
        if (level != null) {
            String title3 = level.getTitle();
            t titleButton2 = level.getTitleButton();
            if (titleButton2 != null) {
                DeepLink uri4 = titleButton2.getUri();
                String title4 = titleButton2.getTitle();
                String icon2 = titleButton2.getIcon();
                Integer numA = icon2 != null ? com.avito.android.lib.util.q.a(icon2) : null;
                String style = titleButton2.getStyle();
                if (style == null) {
                    style = "";
                }
                bVar = new com.avito.android.tariff.cpx.info.items.level_header.b(f.d(style), uri4, numA, title4);
            } else {
                bVar = null;
            }
            AttributedText description2 = level.getDescription();
            p featureBanner = level.getFeatureBanner();
            if (featureBanner != null) {
                k.a aVar2 = k.f441571d;
                String valueName = featureBanner.getColor().getValueName();
                String value2 = featureBanner.getColor().getValue();
                String valueDark = featureBanner.getColor().getValueDark();
                aVar2.getClass();
                aVar = new com.avito.android.tariff.cpx.info.items.level_header.a(k.a.b(valueName, value2, valueDark), featureBanner.getText(), new wZ.l(featureBanner.getImage().getValue(), featureBanner.getImage().getValueDark()), featureBanner.getUri());
            } else {
                aVar = null;
            }
            arrayList6.add(new com.avito.android.tariff.cpx.info.items.level_header.c(title3, bVar, description2, aVar));
        }
        o level2 = cVar.getLevel();
        if (level2 == null || (listD = level2.d()) == null) {
            arrayList2 = null;
        } else {
            List<s> list3 = listD;
            arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (s sVar : list3) {
                arrayList2.add(new com.avito.android.tariff.cpx.info.items.filters_tabs.a(sVar.getTitle(), sVar.getGroupSlug(), ((Boolean) map.getOrDefault(sVar.getGroupSlug(), Boolean.valueOf(sVar.getIsActive()))).booleanValue()));
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            arrayList6.add(new com.avito.android.tariff.cpx.info.items.filters_tabs.b(arrayList2));
        }
        return arrayList6;
    }
}
