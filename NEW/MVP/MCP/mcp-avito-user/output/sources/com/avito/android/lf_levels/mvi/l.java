package com.avito.android.lf_levels.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.lf_levels.mvi.entity.LfLevelsInternalAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import tR.C48597a;
import vR.InterfaceC49255a;
import yR.C50162a;
import yR.C50164c;

/* compiled from: LfLevelsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lf_levels/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "LwR/c;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<LfLevelsInternalAction, wR.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49255a f175396b;

    @Inject
    public l(@Y61.k InterfaceC49255a interfaceC49255a) {
        this.f175396b = interfaceC49255a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final wR.c a(LfLevelsInternalAction lfLevelsInternalAction, wR.c cVar) {
        Object obj;
        Object next;
        LfLevelsInternalAction lfLevelsInternalAction2 = lfLevelsInternalAction;
        wR.c cVar2 = cVar;
        if (lfLevelsInternalAction2 instanceof LfLevelsInternalAction.Loading) {
            return wR.c.a(cVar2, null, null, null, null, null, null, null, true, false, 319);
        }
        if (!(lfLevelsInternalAction2 instanceof LfLevelsInternalAction.Content)) {
            if (lfLevelsInternalAction2 instanceof LfLevelsInternalAction.Error) {
                return wR.c.a(cVar2, null, null, null, null, null, null, z.k(((LfLevelsInternalAction.Error) lfLevelsInternalAction2).f175379b), false, false, 319);
            }
            if (!(lfLevelsInternalAction2 instanceof LfLevelsInternalAction.LevelSelect)) {
                return lfLevelsInternalAction2 instanceof LfLevelsInternalAction.ProgressChanged ? wR.c.a(cVar2, null, null, null, null, null, null, null, false, ((LfLevelsInternalAction.ProgressChanged) lfLevelsInternalAction2).f175383b, 255) : cVar2;
            }
            C48597a c48597a = (C48597a) ((LfLevelsInternalAction.LevelSelect) lfLevelsInternalAction2).f175382b;
            List<com.avito.conveyor_item.a> list = cVar2.f441451g.get(Integer.valueOf(c48597a.f439253c));
            if (list == null) {
                list = C42784z0.f406748b;
            }
            return wR.c.a(cVar2, null, null, null, c48597a, list, null, null, false, false, 487);
        }
        yR.e eVar = ((LfLevelsInternalAction.Content) lfLevelsInternalAction2).f175378b;
        List<C50162a> listC = eVar.c();
        InterfaceC49255a interfaceC49255a = this.f175396b;
        ArrayList arrayListA = interfaceC49255a.a(listC);
        Iterator<T> it = eVar.c().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C50162a) next).getIsSelected()) {
                break;
            }
        }
        C50162a c50162a = (C50162a) next;
        int id2 = c50162a != null ? c50162a.getId() : 1;
        Iterator it2 = arrayListA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((C48597a) next2).f439253c == id2) {
                obj = next2;
                break;
            }
        }
        C48597a c48597a2 = (C48597a) obj;
        List<C50164c> listB = eVar.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it3 = arrayListA.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((C48597a) it3.next()).f439253c));
        }
        LinkedHashMap linkedHashMapB = interfaceC49255a.b(arrayList, listB);
        String title = eVar.getTitle();
        AttributedText description = eVar.getDescription();
        List list2 = (List) linkedHashMapB.get(Integer.valueOf(id2));
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        return wR.c.a(cVar2, title, description, arrayListA, c48597a2, list2, linkedHashMapB, null, false, false, 256);
    }
}
