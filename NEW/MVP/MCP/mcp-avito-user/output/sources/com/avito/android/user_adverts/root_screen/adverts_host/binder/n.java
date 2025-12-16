package com.avito.android.user_adverts.root_screen.adverts_host.binder;

import BI0.d;
import II0.d;
import MI0.d;
import TI0.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.JobOnboardingButton;
import com.avito.android.user_adverts.root_screen.adverts_host.TabItem;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: HostViewStateBinder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class n extends C42801a implements Y41.t<TI0.c, BI0.d, II0.d, MI0.d, EI0.a, Continuation<? super HostViewState>, Object>, SuspendFunction {
    @Override // Y41.t
    public final Object invoke(TI0.c cVar, BI0.d dVar, II0.d dVar2, MI0.d dVar3, EI0.a aVar, Continuation<? super HostViewState> continuation) {
        com.avito.android.analytics.screens.mvi.q bVar;
        HostViewState.d dVar4;
        JobOnboardingButton jobOnboardingButton;
        int i12;
        HostViewState.AppBarContent appBarContent;
        boolean z12;
        kotlin.collections.builders.b bVar2;
        TI0.c cVar2 = cVar;
        BI0.d dVar5 = dVar;
        II0.d dVar6 = dVar2;
        MI0.d dVar7 = dVar3;
        EI0.a aVar2 = aVar;
        com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g gVar = (com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g) this.receiver;
        gVar.getClass();
        c.b bVar3 = cVar2.f15561j;
        if (bVar3 instanceof c.b.a) {
            c.b.a aVar3 = (c.b.a) bVar3;
            HostViewState.e eVar = new HostViewState.e(aVar3.f15565a, true);
            List<TabItem> list = aVar3.f15569e;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                TabItem tabItem = (TabItem) it.next();
                PrintableText printableTextF = com.avito.android.printable_text.b.f(tabItem.f312285b);
                Integer num = tabItem.f312287d;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                arrayList.add(new HostViewState.g(iIntValue, printableTextF, tabItem.f312286c));
            }
            UI0.a aVar4 = cVar2.f15555d;
            HostViewState.h hVar = new HostViewState.h(aVar4.f16331b, aVar4.f16330a);
            int i13 = aVar3.f15568d;
            HostViewState.i iVar = new HostViewState.i(arrayList, hVar, String.valueOf(i13));
            boolean z13 = dVar5 instanceof d.C0052d;
            InterfaceC42726C interfaceC42726C = gVar.f312470b;
            InterfaceC42726C interfaceC42726C2 = gVar.f312471c;
            if (z13 && ((d.C0052d) dVar5).f1324a) {
                dVar4 = new HostViewState.d(false, false, (String) interfaceC42726C2.getValue());
            } else {
                dVar4 = new HostViewState.d(true, true, ((String) interfaceC42726C.getValue()) + i13);
            }
            d.a aVar5 = dVar6.f8103b;
            HostViewState.f fVar = ((aVar5 instanceof d.a.b) && (jobOnboardingButton = ((d.a.b) aVar5).f8110e) != null) ? new HostViewState.f(jobOnboardingButton.getTitle(), jobOnboardingButton.getDeeplink()) : null;
            if (z13 && ((d.C0052d) dVar5).f1324a) {
                HostViewState.AppBarContent.ExpandType expandType = HostViewState.AppBarContent.ExpandType.f312969d;
                String str = (String) interfaceC42726C2.getValue();
                i12 = 0;
                appBarContent = new HostViewState.AppBarContent(expandType, false, str);
            } else {
                i12 = 0;
                appBarContent = null;
            }
            if (appBarContent == null) {
                d.a.b bVarA = II0.e.a(aVar5);
                if (bVarA != null && (bVar2 = bVarA.f8117l) != null) {
                    ListIterator listIterator = bVar2.listIterator(i12);
                    while (listIterator.hasNext()) {
                        PanelConfigItem panelConfigItem = (PanelConfigItem) listIterator.next();
                        if (panelConfigItem instanceof PanelConfigItem.a) {
                            ((PanelConfigItem.a) panelConfigItem).getClass();
                        }
                    }
                }
                d.a aVar6 = dVar7.f10579c;
                d.a.c cVar3 = aVar6 instanceof d.a.c ? (d.a.c) aVar6 : null;
                appBarContent = (cVar3 == null || !cVar3.f10583a.f9898d) ? null : new HostViewState.AppBarContent(HostViewState.AppBarContent.ExpandType.f312968c, true, (String) gVar.f312473e.getValue());
                if (appBarContent == null) {
                    if (aVar2 instanceof com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j) {
                        com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j jVar = (com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j) aVar2;
                        if (jVar instanceof j.h ? true : jVar instanceof j.i ? true : jVar instanceof j.d) {
                            i12 = 1;
                        } else {
                            if (!(jVar instanceof j.a ? true : jVar instanceof j.b ? true : jVar instanceof j.c ? true : jVar instanceof j.e ? true : jVar instanceof j.f ? true : jVar instanceof j.g ? true : jVar instanceof j.C9607j)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (i12 != 0) {
                            z12 = true;
                            appBarContent = new HostViewState.AppBarContent(HostViewState.AppBarContent.ExpandType.f312968c, true, ((String) gVar.f312474f.getValue()) + aVar2.getPriority());
                        } else {
                            z12 = true;
                            appBarContent = null;
                        }
                    } else {
                        appBarContent = null;
                        z12 = true;
                    }
                    if (appBarContent == null) {
                        appBarContent = new HostViewState.AppBarContent(HostViewState.AppBarContent.ExpandType.f312967b, z12, (String) interfaceC42726C.getValue());
                    }
                }
            }
            bVar = new HostViewState.a.C9588a(eVar, iVar, dVar4, fVar, appBarContent);
        } else if (bVar3 instanceof c.b.C1059b) {
            bVar = new HostViewState.a.b(((c.b.C1059b) bVar3).f15571a);
        } else if (bVar3 instanceof c.b.C1060c) {
            bVar = HostViewState.a.c.f312978b;
        } else if (bVar3 instanceof c.b.e) {
            bVar = HostViewState.j.f312998b;
        } else {
            if (!(bVar3 instanceof c.b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = HostViewState.b.f312979b;
        }
        bVar.setPerfTrackerParams(cVar2.getPerfTrackerParams());
        return bVar;
    }
}
