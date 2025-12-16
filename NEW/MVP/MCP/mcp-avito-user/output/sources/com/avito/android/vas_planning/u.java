package com.avito.android.vas_planning;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.vas_planning.model.VasPlannerState;
import com.avito.android.vas_planning.model.VasPlanningItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/model/VasPlannerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class u extends N implements Y41.l<VasPlannerState, VasPlannerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f322546l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar) {
        super(1);
        this.f322546l = tVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.util.ArrayList] */
    @Override // Y41.l
    public final VasPlannerState invoke(VasPlannerState vasPlannerState) {
        VasPlannerState vasPlannerState2 = vasPlannerState;
        VasPlanningItem.VasPlanningDateTime vasPlanningDateTime = new VasPlanningItem.VasPlanningDateTime(com.avito.android.bxcontent.mvi.entity.f.k(this.f322546l.f322524M, new StringBuilder("dependent_item_")), false, null, null, true, true, 14, null);
        l0.h hVar = new l0.h();
        hVar.f406842b = new ArrayList();
        ArrayList arrayList = vasPlannerState2.f322418b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((VasPlanningItem) obj).getF322442c()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVarL = (VasPlanningItem) it.next();
            if (aVarL instanceof VasPlanningItem.VasPlanningRadioItem) {
                VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem = (VasPlanningItem.VasPlanningRadioItem) aVarL;
                if (vasPlanningRadioItem.f322435j) {
                    List<VasPlanningItem> list = vasPlanningRadioItem.f322436k;
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(list, 10));
                    for (com.avito.conveyor_item.a aVarL2 : list) {
                        if (aVarL2 instanceof VasPlanningItem.VasPlanningDateTime) {
                            aVarL2 = VasPlanningItem.VasPlanningDateTime.L((VasPlanningItem.VasPlanningDateTime) aVarL2, null, null, true, false, 15);
                        }
                        arrayList4.add(aVarL2);
                    }
                    ?? arrayList5 = new ArrayList(arrayList4);
                    hVar.f406842b = arrayList5;
                    arrayList5.add(vasPlanningDateTime);
                    aVarL = VasPlanningItem.VasPlanningRadioItem.L(vasPlanningRadioItem, false, (List) hVar.f406842b, 511);
                }
            }
            arrayList3.add(aVarL);
        }
        ArrayList arrayList6 = new ArrayList(arrayList3);
        arrayList6.addAll((Collection) hVar.f406842b);
        return VasPlannerState.a(vasPlannerState2, arrayList6, null, 6);
    }
}
