package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import ML0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StickersEditReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "LML0/c;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<StickersEditInternalAction, ML0.c> {
    @Inject
    public l() {
    }

    @Y61.k
    public static ML0.c b(@Y61.k StickersEditInternalAction stickersEditInternalAction, @Y61.k ML0.c cVar) {
        c.f fVar;
        List<c.f> list;
        Object next;
        Object next2;
        if (stickersEditInternalAction instanceof StickersEditInternalAction.Error) {
            return ML0.c.a(cVar, false, false, z.l(((StickersEditInternalAction.Error) stickersEditInternalAction).f320806b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131065);
        }
        if (stickersEditInternalAction instanceof StickersEditInternalAction.Loading) {
            return ML0.c.a(cVar, false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131065);
        }
        if (stickersEditInternalAction instanceof StickersEditInternalAction.Content) {
            GL0.c cVar2 = ((StickersEditInternalAction.Content) stickersEditInternalAction).f320805b;
            Float progress = cVar2.getProgress();
            String title = cVar2.getTitle();
            AttributedText description = cVar2.getDescription();
            Image icon = cVar2.getIcon();
            int maxSelectedCount = cVar2.getMaxSelectedCount();
            GL0.b service = cVar2.getService();
            String title2 = service.getTitle();
            List<GL0.a> listA = service.a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            for (GL0.a aVar : listA) {
                arrayList.add(new c.f(aVar.getChangesCount(), aVar.getMessage()));
            }
            c.g gVar = new c.g(title2, arrayList);
            List<EL0.a> listJ = cVar2.j();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listJ, 10));
            for (EL0.a aVar2 : listJ) {
                arrayList2.add(new c.h(aVar2.getId(), aVar2.getTitle(), L.f(aVar2.getIsSelected(), Boolean.TRUE), aVar2.getDescriptionForSeller(), true));
            }
            String emptyActionTitle = cVar2.getEmptyActionTitle();
            String selectedActionTitle = cVar2.getSelectedActionTitle();
            String alertMessage = cVar2.getAlertMessage();
            Action action = cVar2.getAction();
            c.a aVar3 = action != null ? new c.a(action.getTitle(), action.getDeepLink()) : null;
            Iterator<T> it = gVar.f10632b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (((c.f) next2).f10629a == 0) {
                    break;
                }
            }
            c.f fVar2 = (c.f) next2;
            c.b bVar = new c.b(icon, gVar.f10631a, fVar2 != null ? fVar2.f10630b : null);
            List<EL0.a> listJ2 = cVar2.j();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listJ2) {
                if (L.f(((EL0.a) obj).getIsSelected(), Boolean.TRUE)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((EL0.a) it2.next()).getId());
            }
            return ML0.c.a(cVar, false, false, null, progress, title, description, icon, Integer.valueOf(maxSelectedCount), gVar, arrayList2, emptyActionTitle, selectedActionTitle, new c.d(emptyActionTitle, false, false, 2, null), new c.e(0, alertMessage), aVar3, bVar, C42745f0.P0(arrayList4), 1);
        }
        boolean z12 = stickersEditInternalAction instanceof StickersEditInternalAction.StickerSelected;
        c.d dVar = cVar.f10614n;
        if (!z12) {
            if (stickersEditInternalAction instanceof StickersEditInternalAction.ChangeButtonLoadingState) {
                return ML0.c.a(cVar, false, false, null, null, null, null, null, null, null, null, null, null, dVar != null ? c.d.a(dVar, null, ((StickersEditInternalAction.ChangeButtonLoadingState) stickersEditInternalAction).f320804b, false, 5) : null, null, null, null, null, 126975);
            }
            boolean z13 = stickersEditInternalAction instanceof StickersEditInternalAction.ShowAlertMessage;
            c.e eVar = cVar.f10615o;
            if (z13) {
                return ML0.c.a(cVar, false, false, null, null, null, null, null, null, null, null, null, null, null, eVar != null ? new c.e(eVar.f10627a, ((StickersEditInternalAction.ShowAlertMessage) stickersEditInternalAction).f320811b) : null, null, null, null, 122879);
            }
            if (stickersEditInternalAction instanceof StickersEditInternalAction.IncrementContinueClickCounter) {
                return ML0.c.a(cVar, false, false, null, null, null, null, null, null, null, null, null, null, null, eVar != null ? new c.e(eVar.f10627a + 1, eVar.f10628b) : null, null, null, null, 122879);
            }
            return cVar;
        }
        Iterable iterable = cVar.f10611k;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Set<String> setP0 = cVar.f10618r;
        if (setP0 == null) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : iterable) {
                if (((c.h) obj2).f10636d) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((c.h) it3.next()).f10633a);
            }
            setP0 = C42745f0.P0(arrayList6);
        }
        Set<String> set = setP0;
        Integer num = cVar.f10609i;
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Iterable<c.h> iterable2 = iterable;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : iterable2) {
            if (((c.h) obj3).f10636d) {
                arrayList7.add(obj3);
            }
        }
        ArrayList arrayList8 = new ArrayList(C42745f0.q(arrayList7, 10));
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            arrayList8.add(((c.h) it4.next()).f10633a);
        }
        Set setP02 = C42745f0.P0(arrayList8);
        String str = ((StickersEditInternalAction.StickerSelected) stickersEditInternalAction).f320812b;
        LinkedHashSet linkedHashSetE = setP02.contains(str) ? b1.e(setP02, str) : b1.i(setP02, str);
        int size = linkedHashSetE.size();
        ArrayList arrayList9 = new ArrayList(C42745f0.q(iterable2, 10));
        for (c.h hVar : iterable2) {
            boolean zContains = linkedHashSetE.contains(hVar.f10633a);
            arrayList9.add(new c.h(hVar.f10633a, hVar.f10634b, zContains, hVar.f10635c, zContains || size < iIntValue));
        }
        int iMax = Math.max(b1.f(linkedHashSetE, set).size(), b1.f(set, linkedHashSetE).size());
        c.g gVar2 = cVar.f10610j;
        if (gVar2 == null || (list = gVar2.f10632b) == null) {
            fVar = null;
        } else {
            Iterator<T> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                if (((c.f) next).f10629a == iMax) {
                    break;
                }
            }
            fVar = (c.f) next;
        }
        return ML0.c.a(cVar, false, false, null, null, null, null, null, null, null, arrayList9, null, null, dVar != null ? c.d.a(dVar, iMax == 0 ? cVar.f10612l : cVar.f10613m, false, iMax != 0, 2) : null, null, null, gVar2 != null ? new c.b(cVar.f10608h, gVar2.f10631a, fVar != null ? fVar.f10630b : null) : null, set, 28159);
    }

    @Override // com.avito.android.arch.mvi.u
    public final /* bridge */ /* synthetic */ ML0.c a(StickersEditInternalAction stickersEditInternalAction, ML0.c cVar) {
        return b(stickersEditInternalAction, cVar);
    }
}
