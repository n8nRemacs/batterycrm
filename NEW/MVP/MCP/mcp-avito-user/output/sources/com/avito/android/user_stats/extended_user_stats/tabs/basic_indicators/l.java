package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import androidx.view.C23038g0;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.i;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.P2;
import fW0.C40348a;
import fW0.q;
import fW0.s;
import fW0.u;
import fW0.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: BasicIndicatorsTabViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LfW0/f;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f317507b;

    public l(i iVar) {
        this.f317507b = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        i.b aVar;
        Float fValueOf;
        List<u> listA;
        String str;
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.l lVar;
        P2 p22 = (P2) obj;
        i iVar = this.f317507b;
        C23038g0<i.b> c23038g0 = iVar.f317424P;
        if (p22 instanceof P2.c) {
            aVar = i.b.c.f317430a;
        } else if (p22 instanceof P2.b) {
            fW0.f fVar = (fW0.f) ((P2.b) p22).f318720a;
            String title = fVar.getTabs().getBasicIndicators().getTitle();
            String str2 = "";
            if (title == null) {
                title = "";
            }
            String title2 = fVar.getTabs().getDynamics().getTitle();
            if (title2 == null) {
                title2 = "";
            }
            String title3 = fVar.getTabs().getSpendings().getTitle();
            if (title3 == null) {
                title3 = "";
            }
            List listU = C42745f0.U(title, title2, title3);
            ArrayList arrayList = new ArrayList();
            s funnel = fVar.getFunnel();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC35863o4 interfaceC35863o4 = iVar.f317423O;
            if (funnel != null && (listA = funnel.a()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (u uVar : listA) {
                    C40348a change = uVar.getChange();
                    if (change != null) {
                        str = str2;
                        lVar = new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.l(change.getValue(), change.getDescription(), change.getColor(), change.getDetailsLink());
                    } else {
                        str = str2;
                        lVar = null;
                    }
                    fW0.i conversion = uVar.getConversion();
                    arrayList3.add(new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.d(uVar.getTitle(), uVar.getCount(), uVar.getDescription(), lVar, conversion != null ? new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.a(conversion.getValue(), conversion.getDescriptionDeeplink()) : null, uVar.getToolTip()));
                    str2 = str;
                }
                String str3 = str2;
                String strA = interfaceC35863o4.a();
                String title4 = funnel.getTitle();
                if (title4 == null) {
                    title4 = str3;
                }
                arrayList2.add(new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.e(strA, title4, arrayList3));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.c(interfaceC35863o4.a()));
            List<fW0.j> listA2 = fVar.a();
            if (listA2 != null) {
                for (fW0.j jVar : listA2) {
                    i.f317419R.getClass();
                    ArrayList arrayList4 = new ArrayList();
                    List<fW0.l> listA3 = jVar.a();
                    if (listA3 != null) {
                        for (fW0.l lVar2 : listA3) {
                            arrayList4.add(new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.k(lVar2.getTitle(), lVar2.getValue()));
                        }
                    }
                    q extra = jVar.getExtra();
                    if (L.f(extra != null ? extra.getType() : null, "vasBonuses")) {
                        q extra2 = jVar.getExtra();
                        fValueOf = extra2 != null ? Float.valueOf(extra2.getValue()) : null;
                    } else {
                        fValueOf = null;
                    }
                    String strA2 = interfaceC35863o4.a();
                    String slug = jVar.getSlug();
                    String title5 = jVar.getSummary().getTitle();
                    String titleHint = jVar.getSummary().getTitleHint();
                    String subtitle = jVar.getSummary().getSubtitle();
                    y relative = jVar.getSummary().getRelative();
                    arrayList.add(new com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.c(strA2, slug, title5, subtitle, titleHint, relative != null ? relative.getValue() : 0.0d, jVar.getSummary().getValue(), fValueOf, arrayList4, null, false, false, 512, null));
                }
            }
            aVar = new i.b.C9850b(arrayList, listU, fVar.getUserMessage());
        } else {
            if (!(p22 instanceof P2.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new i.b.a(((P2.a) p22).f318719a.getF244063c());
        }
        c23038g0.postValue(aVar);
    }
}
