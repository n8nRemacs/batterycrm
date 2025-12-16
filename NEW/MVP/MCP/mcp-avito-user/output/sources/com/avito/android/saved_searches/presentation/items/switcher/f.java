package com.avito.android.saved_searches.presentation.items.switcher;

import androidx.compose.ui.platform.C22491k0;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchSwitcherPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/switcher/f;", "LTV0/d;", "Lcom/avito/android/saved_searches/presentation/items/switcher/i;", "Lcom/avito/android/saved_searches/presentation/items/switcher/SavedSearchSwitcherItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements TV0.d<i, SavedSearchSwitcherItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f258566b;

    @Inject
    public f(@Y61.k c cVar) {
        this.f258566b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        SavedSearchData.Settings.SettingsDetails settingsDetails;
        SavedSearchData.Settings.SettingsDetails settingsDetails2;
        i iVar = (i) eVar;
        SavedSearchSwitcherItem savedSearchSwitcherItem = (SavedSearchSwitcherItem) aVar;
        SavedSearchData.Settings.Push push = savedSearchSwitcherItem.f258547c;
        String strK = null;
        if (push != null) {
            String icon = push.getIcon();
            String title = push.getTitle();
            if (L.f(push.getValue(), Boolean.TRUE) && (settingsDetails2 = push.getSettingsDetails()) != null) {
                strK = k(settingsDetails2);
            }
            String str2 = strK;
            Boolean value = push.getValue();
            iVar.e50(icon, title, value != null ? value.booleanValue() : false, str2, savedSearchSwitcherItem.f258549e);
            return;
        }
        SavedSearchData.Settings.Email email = savedSearchSwitcherItem.f258548d;
        if (email != null) {
            String icon2 = email.getIcon();
            String title2 = email.getTitle();
            Boolean value2 = email.getValue();
            Boolean bool = Boolean.TRUE;
            if (L.f(value2, bool)) {
                str = email.getEmail() + " · ";
            } else {
                str = null;
            }
            if (L.f(email.getValue(), bool) && (settingsDetails = email.getSettingsDetails()) != null) {
                strK = k(settingsDetails);
            }
            String str3 = strK;
            Boolean value3 = email.getValue();
            iVar.ZE(icon2, title2, str, str3, value3 != null ? value3.booleanValue() : false, savedSearchSwitcherItem.f258549e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v15, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r4v16, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final String k(SavedSearchData.Settings.SettingsDetails settingsDetails) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        SavedSearchData.Settings.SettingsDetails.Parameter periodicity = settingsDetails.getPeriodicity();
        List<String> listH = periodicity != null ? periodicity.h() : null;
        SavedSearchData.Settings.SettingsDetails.Parameter periodicity2 = settingsDetails.getPeriodicity();
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> listG = periodicity2 != null ? periodicity2.g() : null;
        SavedSearchData.Settings.SettingsDetails.Parameter dayOfWeek = settingsDetails.getDayOfWeek();
        List<String> listH2 = dayOfWeek != null ? dayOfWeek.h() : null;
        SavedSearchData.Settings.SettingsDetails.Parameter dayOfWeek2 = settingsDetails.getDayOfWeek();
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> listG2 = dayOfWeek2 != null ? dayOfWeek2.g() : null;
        SavedSearchData.Settings.SettingsDetails.Parameter timeOfDay = settingsDetails.getTimeOfDay();
        List<String> listH3 = timeOfDay != null ? timeOfDay.h() : null;
        SavedSearchData.Settings.SettingsDetails.Parameter timeOfDay2 = settingsDetails.getTimeOfDay();
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> listG3 = timeOfDay2 != null ? timeOfDay2.g() : null;
        if (listG != null) {
            arrayList = new ArrayList();
            for (Object obj : listG) {
                if (listH != null ? listH.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj).getId()) : false) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (listG2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : listG2) {
                if (listH2 != null ? listH2.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj2).getId()) : false) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (listG3 != null) {
            arrayList3 = new ArrayList();
            for (Object obj3 : listG3) {
                if (listH3 != null ? listH3.contains(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj3).getId()) : false) {
                    arrayList3.add(obj3);
                }
            }
        } else {
            arrayList3 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (arrayList != null) {
            int i12 = 0;
            for (Object obj4 : arrayList) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                SavedSearchData.Settings.SettingsDetails.Parameter.Option option = (SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj4;
                String detailedTitle = option.getDetailedTitle();
                if (detailedTitle == null) {
                    detailedTitle = option.getTitle();
                }
                sb2.append(detailedTitle.toLowerCase(Locale.ROOT));
                if (arrayList.size() - 1 > i12) {
                    sb2.append(", ");
                }
                i12 = i13;
            }
        }
        if (O2.a(arrayList) && (O2.a(arrayList2) || O2.a(arrayList3))) {
            sb2.append(" · ");
        }
        if (listG2 != null) {
            List<SavedSearchData.Settings.SettingsDetails.Parameter.Option> list = listG2;
            arrayList4 = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it.next()).getTitle());
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = C42784z0.f406748b;
        }
        if (arrayList2 != null) {
            arrayList5 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) it2.next()).getTitle());
            }
        } else {
            arrayList5 = 0;
        }
        if (arrayList5 == 0) {
            arrayList5 = C42784z0.f406748b;
        }
        Set setP0 = C42745f0.P0((Iterable) arrayList4);
        Set setP02 = C42745f0.P0((Iterable) arrayList5);
        this.f258566b.getClass();
        Set<String> set = setP0;
        ArrayList arrayList6 = new ArrayList(C42745f0.q(set, 10));
        for (String str : set) {
            arrayList6.add(new Q(str, Boolean.valueOf(setP02.contains(str))));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList6.iterator();
        int i14 = -1;
        int i15 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                C42745f0.H0();
                throw null;
            }
            Q q12 = (Q) next;
            String str2 = (String) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            Q q13 = (Q) C42745f0.K(i16, arrayList6);
            Boolean bool = q13 != null ? (Boolean) q13.f406620c : null;
            if (i15 > i14) {
                if (zBooleanValue) {
                    if (zBooleanValue && L.f(bool, Boolean.FALSE)) {
                        linkedHashSet.add(str2);
                    } else if (zBooleanValue) {
                        int i17 = i15;
                        while (true) {
                            int i18 = i17 + 1;
                            Q q14 = (Q) C42745f0.K(i18, arrayList6);
                            if (q14 == null || !((Boolean) q14.f406620c).booleanValue()) {
                                break;
                            }
                            i17 = i18;
                        }
                        if (i17 - i14 > 2) {
                            StringBuilder sbB = C22491k0.b(str2, '-');
                            Q q15 = (Q) C42745f0.K(i17, arrayList6);
                            sbB.append(q15 != null ? (String) q15.f406619b : null);
                            linkedHashSet.add(sbB.toString());
                            i15 = i17;
                        } else {
                            linkedHashSet.add(str2);
                        }
                    }
                    i14 = i15;
                } else {
                    i14 = i15;
                }
            }
            i15 = i16;
        }
        StringBuilder sb3 = new StringBuilder();
        int i19 = 0;
        for (Object obj5 : linkedHashSet) {
            int i22 = i19 + 1;
            if (i19 < 0) {
                C42745f0.H0();
                throw null;
            }
            sb3.append(((String) obj5).toLowerCase(Locale.ROOT));
            if (linkedHashSet.size() - 1 > i19) {
                sb3.append(", ");
            }
            i19 = i22;
        }
        sb2.append(sb3.toString());
        if (O2.a(arrayList2) && O2.a(arrayList3)) {
            sb2.append(" · ");
        }
        if (arrayList3 != null) {
            int i23 = 0;
            for (Object obj6 : arrayList3) {
                int i24 = i23 + 1;
                if (i23 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                sb2.append(((SavedSearchData.Settings.SettingsDetails.Parameter.Option) obj6).getTitle().toLowerCase(Locale.ROOT));
                if (arrayList3.size() - 1 > i23) {
                    sb2.append(", ");
                }
                i23 = i24;
            }
        }
        String string = sb2.toString();
        if (string.length() == 0) {
            return null;
        }
        return string;
    }
}
