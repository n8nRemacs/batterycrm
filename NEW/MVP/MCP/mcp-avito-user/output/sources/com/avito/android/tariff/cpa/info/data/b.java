package com.avito.android.tariff.cpa.info.data;

import Y61.k;
import androidx.compose.runtime.internal.P;
import bC0.C25493b;
import bC0.C25494c;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpa.info.ui.items.alert.AlertItem;
import com.avito.android.tariff.remote.model.edit.TariffAlertAction;
import com.avito.android.tariff.remote.model.edit.TariffBanner;
import dC0.AbstractC39559a;
import dC0.C39560b;
import dC0.C39562d;
import dC0.C39563e;
import dC0.C39564f;
import dC0.C39565g;
import dC0.C39566h;
import dC0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CpaInfoMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/data/b;", "Lcom/avito/android/tariff/cpa/info/data/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f294624a;

    @Inject
    public b(@k e eVar) {
        this.f294624a = eVar;
    }

    @Override // com.avito.android.tariff.cpa.info.data.a
    @k
    public final ArrayList a(@k AbstractC39559a.b bVar) {
        com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.a aVar;
        ButtonAction button;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        i infoBanner = bVar.getInfoBanner();
        TariffBanner alert = bVar.getAlert();
        if (alert != null) {
            AlertItem.CornersStyle cornersStyle = infoBanner == null ? AlertItem.CornersStyle.f294796d : AlertItem.CornersStyle.f294794b;
            String title = alert.getTitle();
            AttributedText description = alert.getDescription();
            TariffBanner.IconType iconType = alert.getIconType();
            e eVar = this.f294624a;
            Integer numB = eVar.b(iconType);
            int iA2 = eVar.a(alert.getState());
            List<TariffAlertAction> listA = alert.a();
            if (listA != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : listA) {
                    if (obj instanceof com.avito.android.tariff.remote.model.edit.a) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((com.avito.android.tariff.remote.model.edit.a) next).getButtonStyle() == TariffAlertAction.ButtonStyle.OUTLINE) {
                        arrayList4.add(next);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            arrayList2.add(new AlertItem("alert_item", title, description, numB, iA2, cornersStyle, arrayList));
        }
        if (infoBanner != null) {
            arrayList2.add(new AlertItem("info_banner_item", infoBanner.getTitle(), infoBanner.getDescription(), null, R.attr.bannerViolet, bVar.getAlert() == null ? AlertItem.CornersStyle.f294796d : AlertItem.CornersStyle.f294795c, null));
        }
        C25494c balanceInfo = bVar.getBalanceInfo();
        C25493b advanceRefill = bVar.getAdvanceRefill();
        String title2 = balanceInfo.getTitle();
        String value = balanceInfo.getValue();
        ButtonAction refillButton = balanceInfo.getRefillButton();
        arrayList2.add(new com.avito.android.tariff.cpa.info.ui.items.balance_info.b("balance_info_item", title2, value, refillButton != null ? refillButton.getTitle() : null, new com.avito.android.tariff.cpa.info.ui.items.balance_info.a(advanceRefill != null ? advanceRefill.getTitle() : null, (advanceRefill == null || (button = advanceRefill.getButton()) == null) ? null : button.getTitle()), false));
        AttributedText thresholdInfo = bVar.getThresholdInfo();
        if (thresholdInfo != null) {
            arrayList2.add(new com.avito.android.tariff.cpa.info.ui.items.info.a("threshold_info_item", thresholdInfo));
        }
        C39562d statistics = bVar.getStatistics();
        if (statistics != null) {
            arrayList2.add(new com.avito.android.tariff.cpa.info.ui.items.statistics_info.a(statistics.getTitle(), statistics.getActions(), statistics.getSpentAmount()));
        }
        AttributedText extraInfo = bVar.getExtraInfo();
        if (extraInfo != null) {
            arrayList2.add(new com.avito.android.tariff.cpa.info.ui.items.info.a("extra_info_item", extraInfo));
        }
        C39560b level = bVar.getLevel();
        if (level != null) {
            arrayList2.add(new com.avito.android.tariff.cpa.info.ui.items.level_info.a("levelInfoItem", level.getTitle(), level.getDescription(), level.getButton(), false));
        }
        C39563e cpxLevel = bVar.getCpxLevel();
        if (cpxLevel != null) {
            ArrayList arrayList5 = new ArrayList();
            String title3 = cpxLevel.getTitle();
            AttributedText description2 = cpxLevel.getDescription();
            C39564f titleButton = cpxLevel.getTitleButton();
            if (titleButton != null) {
                String title4 = titleButton.getTitle();
                String icon = titleButton.getIcon();
                Integer numA = icon != null ? q.a(icon) : null;
                String style = titleButton.getStyle();
                aVar = new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.a(style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPrimarySmall, titleButton.getDeeplink(), numA, title4);
            } else {
                aVar = null;
            }
            arrayList5.add(new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.b("cpxLevelInfoHeaderItem", title3, description2, aVar, false, 16, null));
            int i12 = 0;
            for (Object obj2 : cpxLevel.b()) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C39566h c39566h = (C39566h) obj2;
                AttributedText attributedTextB = c39566h.getName();
                arrayList5.add(attributedTextB != null ? new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.a(AK.c.g(i12, "cpxLevelInfoToolsHeaderItem_"), attributedTextB, false, 4, null) : null);
                int i14 = 0;
                for (Object obj3 : c39566h.a()) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    C39565g c39565g = (C39565g) obj3;
                    arrayList5.add(new com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.a("cpxLevelInfoToolItem_" + i12 + '_' + i14, c39565g.getName(), c39565g.getDescription(), c39565g.getIcon(), c39565g.getDeeplink(), c39565g.getIsEnabled(), false, 64, null));
                    i14 = i15;
                }
                i12 = i13;
            }
            C42745f0.h(C42745f0.C(arrayList5), arrayList2);
        }
        return arrayList2;
    }
}
