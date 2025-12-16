package com.avito.android.rating_ui.lmm_summary;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem;
import com.avito.android.rating_ui.lmm_summary.button.RatingLLMSummaryButtonItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import xh0.InterfaceC49945a;
import xh0.InterfaceC49946b;

/* compiled from: RatingLLMSummaryPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/f;", "Lcom/avito/android/rating_ui/lmm_summary/c;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f250092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f250093c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k @InterfaceC49946b l<? super DeepLink, G0> lVar, @InterfaceC49945a @k l<? super DeepLink, G0> lVar2) {
        this.f250092b = lVar;
        this.f250093c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.avito.android.rating_ui.lmm_summary.h] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ?? arrayList;
        ?? r92 = (h) eVar;
        BaseRatingLLMSummaryItem baseRatingLLMSummaryItem = (BaseRatingLLMSummaryItem) aVar;
        r92.setTitle(baseRatingLLMSummaryItem.getF250053b().f250064b);
        DeepLink deepLink = baseRatingLLMSummaryItem.getF250053b().f250065c;
        int i13 = 0;
        r92.To(new d(deepLink, this), deepLink != null);
        r92.j50();
        List<BaseRatingLLMSummaryItem.Section> listW = baseRatingLLMSummaryItem.W();
        if (listW != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listW) {
                BaseRatingLLMSummaryItem.Section section = (BaseRatingLLMSummaryItem.Section) obj;
                if (section.f250062b != null && section.f250063c != null) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                BaseRatingLLMSummaryItem.Section section2 = (BaseRatingLLMSummaryItem.Section) next;
                String str = section2.f250062b;
                List<BaseRatingLLMSummaryItem.Section> listW2 = baseRatingLLMSummaryItem.W();
                r92.sX(str, section2.f250063c, listW2 != null && i14 == listW2.size() - 1);
                i14 = i15;
            }
        }
        if (!baseRatingLLMSummaryItem.getF250057f()) {
            r92.Du(baseRatingLLMSummaryItem.getF250056e().f250060b, baseRatingLLMSummaryItem.getF250056e().f250061c);
            return;
        }
        List<BaseRatingLLMSummaryItem.Button> listF = baseRatingLLMSummaryItem.f();
        if (listF != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listF) {
                BaseRatingLLMSummaryItem.Button button = (BaseRatingLLMSummaryItem.Button) obj2;
                if (button.f250058b != null && button.f250059c != null) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i16 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                BaseRatingLLMSummaryItem.Button button2 = (BaseRatingLLMSummaryItem.Button) next2;
                arrayList.add(new RatingLLMSummaryButtonItem(AK.c.g(i13, "llm_button:"), button2.f250058b, button2.f250059c));
                i13 = i16;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        r92.v70(new e(baseRatingLLMSummaryItem, r92, this), arrayList);
    }
}
