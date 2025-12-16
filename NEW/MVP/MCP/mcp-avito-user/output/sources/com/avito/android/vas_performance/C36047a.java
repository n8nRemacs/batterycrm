package com.avito.android.vas_performance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.vas_performance.remote.model.applied.StickerState;
import com.avito.android.vas_performance.ui.items.applied_services.AppliedServiceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/a;", "Lcom/avito/android/vas_performance/c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_performance.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36047a implements InterfaceC36049c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f319854a;

    @Inject
    public C36047a(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f319854a = interfaceC35863o4;
    }

    @Override // com.avito.android.vas_performance.InterfaceC36049c
    @Y61.k
    public final ArrayList a(@Y61.k BL0.d dVar) {
        Iterator<BL0.b> it;
        Iterator<BL0.a> it2;
        AppliedServiceItem.State state;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator<BL0.b> it3 = dVar.c().iterator();
        while (it3.hasNext()) {
            BL0.b next = it3.next();
            InterfaceC35863o4 interfaceC35863o4 = this.f319854a;
            arrayList2.add(new com.avito.android.vas_performance.ui.items.title.b(interfaceC35863o4.a(), next.getTitle()));
            BL0.e banner = next.getBanner();
            if (banner != null) {
                arrayList2.add(new com.avito.android.vas_performance.ui.items.banner.c(banner.getText(), banner.getImage(), banner.getBackgroundColor()));
            }
            String description = next.getDescription();
            if (description != null) {
                arrayList2.add(new com.avito.android.vas_performance.ui.items.info.a(interfaceC35863o4.a(), description));
            }
            Action action = next.getAction();
            if (action != null) {
                arrayList2.add(new com.avito.android.vas_performance.ui.items.info_action.a(interfaceC35863o4.a(), action.getTitle(), action.getDeepLink()));
            }
            List<BL0.a> listD = next.d();
            if (listD == null) {
                listD = C42784z0.f406748b;
            }
            Iterator<BL0.a> it4 = listD.iterator();
            while (it4.hasNext()) {
                BL0.a next2 = it4.next();
                String id2 = next2.getId();
                String title = next2.getTitle();
                String description2 = next2.getDescription();
                Image icon = next2.getIcon();
                String planId = next2.getPlanId();
                Action action2 = next2.getAction();
                AppliedServiceItem.State.a aVar = AppliedServiceItem.State.f321558c;
                String state2 = next2.getState();
                aVar.getClass();
                AppliedServiceItem.State[] stateArrValues = AppliedServiceItem.State.values();
                int length = stateArrValues.length;
                int i12 = 0;
                while (true) {
                    it = it3;
                    if (i12 >= length) {
                        it2 = it4;
                        state = null;
                        break;
                    }
                    state = stateArrValues[i12];
                    it2 = it4;
                    if (state.f321564b.equals(state2)) {
                        break;
                    }
                    i12++;
                    it3 = it;
                    it4 = it2;
                }
                if (state == null) {
                    state = AppliedServiceItem.State.f321561f;
                }
                AppliedServiceItem.State state3 = state;
                Action itemAction = next2.getItemAction();
                List<BL0.c> listH = next2.h();
                if (listH != null) {
                    List<BL0.c> list = listH;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                    for (BL0.c cVar : list) {
                        arrayList3.add(new com.avito.android.vas_performance.ui.items.stickers.a(interfaceC35863o4.a(), cVar.getTitle(), Boolean.valueOf(cVar.getState() == StickerState.SELECTED), null, 8, null));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                arrayList2.add(new AppliedServiceItem(id2, title, description2, icon, planId, action2, state3, itemAction, arrayList));
                it3 = it;
                it4 = it2;
            }
        }
        return arrayList2;
    }
}
