package com.avito.android.saved_searches.presentation.items.chips;

import Fo0.InterfaceC13822a;
import Y41.l;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem;
import com.avito.android.saved_searches.presentation.items.chips.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchChipsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/h;", "LTV0/d;", "Lcom/avito/android/saved_searches/presentation/items/chips/j;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements TV0.d<j, SavedSearchChipsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC13822a, G0> f258475b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super InterfaceC13822a, G0> lVar) {
        this.f258475b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText attributedText;
        j jVar = (j) eVar;
        SavedSearchChipsItem savedSearchChipsItem = (SavedSearchChipsItem) aVar;
        SavedSearchData.Settings.SettingsDetails.Parameter f258450c = savedSearchChipsItem.getF258450c();
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> listG = f258450c.g();
        if (listG == null) {
            listG = C42784z0.f406748b;
        }
        List<String> listH = f258450c.h();
        if (listH == null) {
            listH = C42784z0.f406748b;
        }
        SelectStrategy selectStrategy = L.f(f258450c.getMultipleSelection(), Boolean.TRUE) ? SelectStrategy.f178717c : SelectStrategy.f178716b;
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> list = listG;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it.next()).getTitle());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (listH.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it2.next()).getTitle());
        }
        Map<String, AttributedText> mapE = f258450c.e();
        if (mapE != null) {
            String str = (String) C42745f0.G(listH);
            if (str == null) {
                str = "";
            }
            attributedText = mapE.get(str);
        } else {
            attributedText = null;
        }
        AttributedText attributedText2 = attributedText;
        c.a aVar2 = c.f258458i;
        String title = f258450c.getTitle();
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> listG2 = savedSearchChipsItem.getF258450c().g();
        if (listG2 == null) {
            listG2 = C42784z0.f406748b;
        }
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> list2 = listG2;
        List<String> listH2 = savedSearchChipsItem.getF258450c().h();
        if (listH2 == null) {
            listH2 = C42784z0.f406748b;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (listH2.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj2).getId())) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it3.next()).getTitle());
        }
        boolean z12 = savedSearchChipsItem instanceof SavedSearchChipsItem.Periodicity;
        g gVar = new g(arrayList5, L.f(savedSearchChipsItem.getF258450c().getMultipleSelection(), Boolean.TRUE) ? SelectStrategy.f178717c : SelectStrategy.f178716b, list2, z12, savedSearchChipsItem instanceof SavedSearchChipsItem.DayOfWeek, savedSearchChipsItem instanceof SavedSearchChipsItem.TimeOfDay, this);
        String f258451d = savedSearchChipsItem.getF258451d();
        aVar2.getClass();
        jVar.Bw(new c(title, selectStrategy, e.a(arrayList), e.a(arrayList3), attributedText2, gVar, z12, f258451d));
    }
}
