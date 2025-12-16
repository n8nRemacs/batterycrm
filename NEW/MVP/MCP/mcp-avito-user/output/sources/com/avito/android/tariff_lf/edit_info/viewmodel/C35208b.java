package com.avito.android.tariff_lf.edit_info.viewmodel;

import aD0.C19759b;
import android.content.Context;
import cD0.C27008b;
import cD0.C27009c;
import cD0.C27011e;
import cD0.C27013g;
import cD0.C27014h;
import cD0.C27015i;
import cD0.C27016j;
import cD0.C27017k;
import cD0.C27021o;
import cD0.C27022p;
import cD0.C27023q;
import cD0.InterfaceC27010d;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.remote.model.edit.TariffAlertAction;
import com.avito.android.tariff.remote.model.edit.TariffBanner;
import com.avito.android.tariff_lf.edit_info.item.header.HeaderItem;
import fC0.C40276a;
import fC0.C40277b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: EditInfoConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/b;", "Lcom/avito/android/tariff_lf/edit_info/viewmodel/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.tariff_lf.edit_info.viewmodel.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35208b implements InterfaceC35207a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf.bar.i f299085a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f299086b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f299087c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f299088d;

    @Inject
    public C35208b(@Y61.k com.avito.android.tariff_lf.bar.i iVar, @Y61.k F f12, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Context context) {
        this.f299085a = iVar;
        this.f299086b = f12;
        this.f299087c = aVar;
        this.f299088d = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.InterfaceC35207a
    @Y61.k
    public final ZC0.f a(@Y61.k C27015i c27015i) {
        aD0.e eVar;
        ArrayList arrayList;
        aD0.d cVar;
        Iterator it;
        Iterator it2;
        com.avito.conveyor_item.a aVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<C27011e> listA = c27015i.a();
        int i12 = 10;
        ArrayList arrayList4 = new ArrayList(C42745f0.q(listA, 10));
        Iterator it3 = listA.iterator();
        int i13 = 0;
        while (true) {
            boolean zHasNext = it3.hasNext();
            Context context = this.f299088d;
            com.avito.android.util.text.a aVar2 = this.f299087c;
            if (!zHasNext) {
                Iterator<C27011e> it4 = c27015i.a().iterator();
                int i14 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    if (it4.next().getIsSelected()) {
                        break;
                    }
                    i14++;
                }
                int iMax = Math.max(i14, 0);
                QC0.a aVar3 = new QC0.a(c27015i.getTitle(), P0.p(arrayList4), (ZC0.a) ((Q) arrayList4.get(iMax)).f406619b);
                ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add((ZC0.a) ((Q) it5.next()).f406619b);
                }
                ZC0.e eVar2 = new ZC0.e(iMax, arrayList5);
                TariffBanner tariffBanner = c27015i.getTariffBanner();
                if (tariffBanner != null) {
                    int iA2 = this.f299086b.a(tariffBanner.getState());
                    String title = tariffBanner.getTitle();
                    CharSequence charSequenceC = aVar2.c(context, tariffBanner.getDescription());
                    List<TariffAlertAction> listA2 = tariffBanner.a();
                    if (listA2 != null) {
                        List<TariffAlertAction> list = listA2;
                        ArrayList arrayList6 = new ArrayList(C42745f0.q(list, 10));
                        for (TariffAlertAction tariffAlertAction : list) {
                            if (tariffAlertAction instanceof com.avito.android.tariff.remote.model.edit.a) {
                                com.avito.android.tariff.remote.model.edit.a aVar4 = (com.avito.android.tariff.remote.model.edit.a) tariffAlertAction;
                                cVar = new C19759b(aVar4.getTitle(), aVar4.getButtonStyle(), aVar4.getDeeplink());
                            } else if (tariffAlertAction instanceof com.avito.android.tariff.remote.model.edit.c) {
                                com.avito.android.tariff.remote.model.edit.c cVar2 = (com.avito.android.tariff.remote.model.edit.c) tariffAlertAction;
                                String title2 = cVar2.getTitle();
                                TariffAlertAction.ButtonStyle buttonStyle = cVar2.getButtonStyle();
                                C40277b tariffSheet = cVar2.getTariffSheet();
                                tariffSheet.getClass();
                                cVar = new aD0.f(title2, buttonStyle, new aD0.g(tariffSheet.getTitle(), b(tariffSheet.b()), tariffSheet.a()));
                            } else {
                                if (!(tariffAlertAction instanceof com.avito.android.tariff.remote.model.edit.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.avito.android.tariff.remote.model.edit.b bVar = (com.avito.android.tariff.remote.model.edit.b) tariffAlertAction;
                                cVar = new aD0.c(bVar.getTitle(), bVar.getButtonStyle(), null);
                                arrayList6.add(cVar);
                            }
                            arrayList6.add(cVar);
                        }
                        arrayList = arrayList6;
                    } else {
                        arrayList = null;
                    }
                    eVar = new aD0.e(iA2, title, charSequenceC, arrayList);
                } else {
                    eVar = null;
                }
                return new ZC0.f(aVar3, eVar, eVar2, c27015i.getUxFeedbackUri());
            }
            Object next = it3.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            C27011e c27011e = (C27011e) next;
            ZC0.a aVar5 = new ZC0.a(c27011e.getPeriodTitle().getText(), null, aVar2.c(context, c27011e.getPeriodTitle()), c27011e.getHasRedBadge(), i13);
            ArrayList arrayList7 = new ArrayList();
            String tariffTitle = c27011e.getTariffTitle();
            if (tariffTitle != null) {
                C27013g description = c27011e.getDescription();
                arrayList7.add(new HeaderItem("header", tariffTitle, description != null ? description.getTitle() : null));
            }
            List<C27008b> listD = c27011e.d();
            ArrayList arrayList8 = new ArrayList(C42745f0.q(listD, i12));
            int i16 = 0;
            for (Object obj : listD) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C27008b c27008b = (C27008b) obj;
                arrayList8.add(new com.avito.android.tariff_lf.edit_info.item.info.a(AK.c.g(i16, "info_item"), c27008b.getTitle(), c27008b.getDescription()));
                i16 = i17;
            }
            C42745f0.h(arrayList8, arrayList7);
            ButtonAction editButton = c27011e.getEditButton();
            if (editButton != null) {
                arrayList7.add(new com.avito.android.tariff_lf.edit_info.item.edit_button.a(editButton));
            }
            C27021o prolongation = c27011e.getProlongation();
            if (prolongation != null) {
                arrayList7.add(new com.avito.android.tariff_lf.edit_info.item.prolongation.a("prolongation_item", prolongation.getTitle(), null, prolongation.getDescription(), prolongation.getIsSwitchOn(), prolongation.getIsSwitchActive(), prolongation.getOffDescription()));
            }
            C27009c managerCallInfo = c27011e.getManagerCallInfo();
            if (managerCallInfo != null) {
                arrayList7.add(new com.avito.android.tariff_lf.edit_info.item.manager_call.c(managerCallInfo.getActionTitle(), managerCallInfo.getTitle(), b(Collections.singletonList(new AttributedText(managerCallInfo.getDescription(), C42784z0.f406748b, 0, 4, null))), managerCallInfo.getContactActionTitle(), managerCallInfo.getDeepLink()));
            }
            C27023q tariffUpsellInfo = c27011e.getTariffUpsellInfo();
            if (tariffUpsellInfo != null) {
                arrayList7.add(new com.avito.android.tariff_lf.edit_info.item.tools_header_item.a(tariffUpsellInfo.getTitle(), tariffUpsellInfo.getDescription()));
                C27022p banner = tariffUpsellInfo.getBanner();
                if (banner != null) {
                    arrayList7.add(new com.avito.android.tariff_lf.edit_info.item.banner.c(banner));
                }
            }
            arrayList7.add(new com.avito.android.tariff_lf.edit_info.item.package_title.a(c27011e.getPackagesTitle()));
            List<InterfaceC27010d> listF = c27011e.f();
            ArrayList arrayList9 = new ArrayList(C42745f0.q(listF, 10));
            Iterator it6 = listF.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                Object next2 = it6.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                InterfaceC27010d interfaceC27010d = (InterfaceC27010d) next2;
                String str = "package_" + i18 + '_' + i13;
                boolean z12 = interfaceC27010d instanceof C27017k;
                com.avito.android.tariff_lf.bar.i iVar = this.f299085a;
                if (z12) {
                    C27017k c27017k = (C27017k) interfaceC27010d;
                    List<C40276a> listC = c27017k.c();
                    if (listC != null) {
                        List<C40276a> list2 = listC;
                        it = it3;
                        it2 = it6;
                        ArrayList arrayList10 = new ArrayList(C42745f0.q(list2, 10));
                        for (Iterator it7 = list2.iterator(); it7.hasNext(); it7 = it7) {
                            C40276a c40276a = (C40276a) it7.next();
                            arrayList10.add(new TC0.a("micro_category", c40276a.getTitle(), c40276a.getSubcategories()));
                        }
                        arrayList3 = arrayList10;
                    } else {
                        it = it3;
                        it2 = it6;
                        arrayList3 = null;
                    }
                    String locations = c27017k.getLocations();
                    String title3 = c27017k.getBar().getTitle();
                    String subtitle = c27017k.getBar().getSubtitle();
                    float value = c27017k.getBar().getCurrentProgress().getValue();
                    ProgressState progressStateB = iVar.b(c27017k.getBar().getCurrentProgress().getState());
                    YB0.a description2 = c27017k.getBar().getDescription();
                    String title4 = description2 != null ? description2.getTitle() : null;
                    YB0.a description3 = c27017k.getBar().getDescription();
                    aVar = new com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a(str, arrayList3, locations, title3, subtitle, value, progressStateB, title4, iVar.a(description3 != null ? description3.getState() : null), c27017k.getUri());
                } else {
                    it = it3;
                    it2 = it6;
                    if (interfaceC27010d instanceof C27016j) {
                        C27016j c27016j = (C27016j) interfaceC27010d;
                        List<C40276a> listB = c27016j.b();
                        if (listB != null) {
                            List<C40276a> list3 = listB;
                            ArrayList arrayList11 = new ArrayList(C42745f0.q(list3, 10));
                            for (C40276a c40276a2 : list3) {
                                arrayList11.add(new TC0.a("micro_category", c40276a2.getTitle(), c40276a2.getSubcategories()));
                            }
                            arrayList2 = arrayList11;
                        } else {
                            arrayList2 = null;
                        }
                        aVar = new com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.a(c27016j.getUri(), str, c27016j.getLocations(), c27016j.getPlannedTitle() + ' ' + c27016j.getPlannedAmount(), arrayList2);
                    } else {
                        if (!(interfaceC27010d instanceof C27014h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        C27014h c27014h = (C27014h) interfaceC27010d;
                        sb2.append(c27014h.getTitle());
                        sb2.append(' ');
                        String subtitle2 = c27014h.getSubtitle();
                        if (subtitle2 == null) {
                            subtitle2 = "";
                        }
                        sb2.append(subtitle2);
                        String string = sb2.toString();
                        float value2 = c27014h.getBar().getCurrentProgress().getValue();
                        ProgressState progressStateB2 = iVar.b(c27014h.getBar().getCurrentProgress().getState());
                        YB0.a description4 = c27014h.getBar().getDescription();
                        String title5 = description4 != null ? description4.getTitle() : null;
                        YB0.a description5 = c27014h.getBar().getDescription();
                        aVar = new com.avito.android.tariff_lf.bar.a(str, string, null, title5, iVar.a(description5 != null ? description5.getState() : null), value2, progressStateB2);
                    }
                }
                arrayList9.add(aVar);
                i18 = i19;
                it3 = it;
                it6 = it2;
            }
            C42745f0.h(arrayList9, arrayList7);
            arrayList4.add(new Q(aVar5, arrayList7));
            i13 = i15;
            it3 = it3;
            i12 = 10;
        }
    }

    public final String b(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(this.f299087c.c(this.f299088d, (AttributedText) list.get(i12)));
            if (i12 != list.size() - 1) {
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
