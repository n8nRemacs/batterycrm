package com.avito.android.saved_searches.presentation.settings.mvi;

import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchSettingsViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/k;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f258787a;

    @Inject
    public k(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f258787a = interfaceC35863o4;
    }

    public static boolean a(SavedSearchData.Settings.SettingsDetails.Parameter parameter, ArrayList arrayList) {
        Object next;
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Dependency> listC = parameter.c();
        if (listC == null) {
            return true;
        }
        for (SavedSearchData.Settings.SettingsDetails.Parameter.Dependency dependency : listC) {
            String id2 = dependency.getId();
            List<String> listC2 = dependency.c();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((SavedSearchData.Settings.SettingsDetails.Parameter) next).getId(), id2)) {
                    break;
                }
            }
            SavedSearchData.Settings.SettingsDetails.Parameter parameter2 = (SavedSearchData.Settings.SettingsDetails.Parameter) next;
            if (parameter2 != null) {
                List<String> listH = parameter2.h();
                if (listH == null) {
                    return false;
                }
                List<String> list = listH;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (listC2.contains((String) it2.next())) {
                            break;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
