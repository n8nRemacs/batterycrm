package com.avito.android.saved_searches.presentation.settings.mvi;

import Fo0.InterfaceC13822a;
import com.avito.android.arch.mvi.a;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsInternalAction;
import com.avito.android.saved_searches.presentation.settings.mvi.entity.SavedSearchSettingsState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SavedSearchSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LFo0/a;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsInternalAction;", "Lcom/avito/android/saved_searches/presentation/settings/mvi/entity/SavedSearchSettingsState;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13822a, SavedSearchSettingsInternalAction, SavedSearchSettingsState> {
    @Inject
    public b() {
    }

    public static final boolean c(b bVar, SavedSearchData.Settings.SettingsDetails.Parameter parameter, SavedSearchData.Settings.SettingsDetails settingsDetails) {
        Object next;
        bVar.getClass();
        List<SavedSearchData.Settings.SettingsDetails.Parameter.Dependency> listC = parameter.c();
        if (listC == null) {
            return true;
        }
        for (SavedSearchData.Settings.SettingsDetails.Parameter.Dependency dependency : listC) {
            String id2 = dependency.getId();
            List<String> listC2 = dependency.c();
            Iterator it = C42756l.B(new SavedSearchData.Settings.SettingsDetails.Parameter[]{settingsDetails.getPeriodicity(), settingsDetails.getDayOfWeek(), settingsDetails.getTimeOfDay()}).iterator();
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
                if (listH != null) {
                    List<String> list = listH;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (listC2.contains((String) it2.next())) {
                                break;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SavedSearchSettingsInternalAction> b(InterfaceC13822a interfaceC13822a, SavedSearchSettingsState savedSearchSettingsState) {
        C43210w c43210w;
        InterfaceC13822a interfaceC13822a2 = interfaceC13822a;
        SavedSearchSettingsState savedSearchSettingsState2 = savedSearchSettingsState;
        if (interfaceC13822a2 instanceof InterfaceC13822a.C0303a) {
            return new C43210w(SavedSearchSettingsInternalAction.HandleBackButtonClick.f258764b);
        }
        if (interfaceC13822a2 instanceof InterfaceC13822a.b) {
            c43210w = new C43210w(new SavedSearchSettingsInternalAction.ChangeDayOfWeek(((InterfaceC13822a.b) interfaceC13822a2).f5982a));
        } else if (interfaceC13822a2 instanceof InterfaceC13822a.c) {
            InterfaceC13822a.c cVar = (InterfaceC13822a.c) interfaceC13822a2;
            c43210w = new C43210w(new SavedSearchSettingsInternalAction.RenderInitialData(cVar.f5983a, cVar.f5984b));
        } else if (interfaceC13822a2 instanceof InterfaceC13822a.d) {
            c43210w = new C43210w(new SavedSearchSettingsInternalAction.ChangePeriodicity(((InterfaceC13822a.d) interfaceC13822a2).f5985a));
        } else {
            if (interfaceC13822a2 instanceof InterfaceC13822a.e) {
                return C43175k.G(new a(savedSearchSettingsState2, this, null));
            }
            if (!(interfaceC13822a2 instanceof InterfaceC13822a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new SavedSearchSettingsInternalAction.ChangeTimeOfDay(((InterfaceC13822a.f) interfaceC13822a2).f5987a));
        }
        return c43210w;
    }
}
