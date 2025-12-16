package com.avito.android.tariff.cpx.levels.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.levels.mvi.entity.CpxLevelsInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: CpxLevelsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpx/levels/mvi/entity/CpxLevelsInternalAction;", "LHB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements u<CpxLevelsInternalAction, HB0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GB0.a f297152b;

    @Inject
    public p(@Y61.k GB0.a aVar) {
        this.f297152b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final HB0.c a(CpxLevelsInternalAction cpxLevelsInternalAction, HB0.c cVar) {
        Object obj;
        Object next;
        CpxLevelsInternalAction cpxLevelsInternalAction2 = cpxLevelsInternalAction;
        HB0.c cVar2 = cVar;
        if (cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.Loading) {
            return HB0.c.a(cVar2, null, null, null, null, null, null, null, true, false, 319);
        }
        if (!(cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.Content)) {
            if (cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.Error) {
                return HB0.c.a(cVar2, null, null, null, null, null, null, z.k(((CpxLevelsInternalAction.Error) cpxLevelsInternalAction2).f297126b), false, false, 319);
            }
            if (!(cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.LevelSelect)) {
                return cpxLevelsInternalAction2 instanceof CpxLevelsInternalAction.ProgressChanged ? HB0.c.a(cVar2, null, null, null, null, null, null, null, false, ((CpxLevelsInternalAction.ProgressChanged) cpxLevelsInternalAction2).f297130b, 255) : cVar2;
            }
            FB0.a aVar = (FB0.a) ((CpxLevelsInternalAction.LevelSelect) cpxLevelsInternalAction2).f297129b;
            List<com.avito.conveyor_item.a> list = cVar2.f6999g.get(Integer.valueOf(aVar.f4596c));
            if (list == null) {
                list = C42784z0.f406748b;
            }
            return HB0.c.a(cVar2, null, null, null, aVar, list, null, null, false, false, 487);
        }
        eC0.l lVar = ((CpxLevelsInternalAction.Content) cpxLevelsInternalAction2).f297125b;
        List<eC0.h> listC = lVar.c();
        GB0.a aVar2 = this.f297152b;
        ArrayList arrayListA = aVar2.a(listC);
        List list2 = arrayListA.size() > 1 ? arrayListA : C42784z0.f406748b;
        Iterator<T> it = lVar.c().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((eC0.h) next).getIsSelected()) {
                break;
            }
        }
        eC0.h hVar = (eC0.h) next;
        int id2 = hVar != null ? hVar.getId() : 1;
        Iterator it2 = arrayListA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((FB0.a) next2).f4596c == id2) {
                obj = next2;
                break;
            }
        }
        FB0.a aVar3 = (FB0.a) obj;
        List<eC0.j> listB = lVar.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it3 = arrayListA.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((FB0.a) it3.next()).f4596c));
        }
        LinkedHashMap linkedHashMapB = aVar2.b(arrayList, listB);
        String title = lVar.getTitle();
        AttributedText description = lVar.getDescription();
        List list3 = (List) linkedHashMapB.get(Integer.valueOf(id2));
        if (list3 == null) {
            list3 = C42784z0.f406748b;
        }
        return HB0.c.a(cVar2, title, description, list2, aVar3, list3, linkedHashMapB, null, false, false, 256);
    }
}
