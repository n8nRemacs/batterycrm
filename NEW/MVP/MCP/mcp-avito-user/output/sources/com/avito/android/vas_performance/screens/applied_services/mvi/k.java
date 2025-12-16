package com.avito.android.vas_performance.screens.applied_services.mvi;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.chips.C27332a;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.vas_performance.remote.model.applied.StickerState;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesInternalAction;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wZ.k;
import wZ.m;

/* compiled from: AppliedServicesReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesState;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements u<AppliedServicesInternalAction, AppliedServicesState> {
    @Inject
    public k() {
    }

    public static AppliedServicesState.a b(Action action) {
        String title = action.getTitle();
        DeepLink deepLink = action.getDeepLink();
        UniversalImage image = action.getImage();
        return new AppliedServicesState.a(title, deepLink, image != null ? m.a(image) : null);
    }

    @Override // com.avito.android.arch.mvi.u
    public final AppliedServicesState a(AppliedServicesInternalAction appliedServicesInternalAction, AppliedServicesState appliedServicesState) {
        AppliedServicesState.Section.a aVar;
        ArrayList arrayList;
        Object next;
        ArrayList arrayList2;
        AppliedServicesInternalAction appliedServicesInternalAction2 = appliedServicesInternalAction;
        AppliedServicesState appliedServicesState2 = appliedServicesState;
        if (appliedServicesInternalAction2 instanceof AppliedServicesInternalAction.Error) {
            return AppliedServicesState.a(appliedServicesState2, ((AppliedServicesInternalAction.Error) appliedServicesInternalAction2).f320273b, null, 30);
        }
        if (appliedServicesInternalAction2 instanceof AppliedServicesInternalAction.Loading) {
            return AppliedServicesState.a(appliedServicesState2, null, null, 28);
        }
        if (!(appliedServicesInternalAction2 instanceof AppliedServicesInternalAction.Content)) {
            if (!(appliedServicesInternalAction2 instanceof AppliedServicesInternalAction.RemovePlannedVas)) {
                return appliedServicesState2;
            }
            List<AppliedServicesState.Section> list = appliedServicesState2.f320283d;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (AppliedServicesState.Section section : list) {
                List<AppliedServicesState.Section.Item> list2 = section.f320290e;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : list2) {
                    if (!L.f(((AppliedServicesState.Section.Item) obj).f320294d, ((AppliedServicesInternalAction.RemovePlannedVas) appliedServicesInternalAction2).f320277b)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList3.add(new AppliedServicesState.Section(section.f320286a, section.f320287b, section.f320288c, section.f320289d, arrayList4));
            }
            return AppliedServicesState.a(appliedServicesState2, null, arrayList3, 27);
        }
        BL0.d dVar = ((AppliedServicesInternalAction.Content) appliedServicesInternalAction2).f320272b;
        List<BL0.b> listC = dVar.c();
        ArrayList arrayList5 = new ArrayList(C42745f0.q(listC, 10));
        for (BL0.b bVar : listC) {
            BL0.e banner = bVar.getBanner();
            if (banner != null) {
                String text = banner.getText();
                UniversalImage image = banner.getImage();
                wZ.l lVarA = image != null ? m.a(image) : null;
                k.a aVar2 = wZ.k.f441571d;
                UniversalColor backgroundColor = banner.getBackgroundColor();
                aVar2.getClass();
                aVar = new AppliedServicesState.Section.a(text, lVarA, k.a.a(backgroundColor));
            } else {
                aVar = null;
            }
            List<BL0.a> listD = bVar.d();
            if (listD != null) {
                List<BL0.a> list3 = listD;
                arrayList = new ArrayList(C42745f0.q(list3, 10));
                for (BL0.a aVar3 : list3) {
                    String title = aVar3.getTitle();
                    String description = aVar3.getDescription();
                    Image icon = aVar3.getIcon();
                    String planId = aVar3.getPlanId();
                    Action action = aVar3.getAction();
                    AppliedServicesState.a aVarB = action != null ? b(action) : null;
                    AppliedServicesState.Section.Item.State.a aVar4 = AppliedServicesState.Section.Item.State.f320299c;
                    String state = aVar3.getState();
                    aVar4.getClass();
                    Iterator it = ((AbstractC42738c) AppliedServicesState.Section.Item.State.f320303g).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((AppliedServicesState.Section.Item.State) next).f320304b.equals(state)) {
                            break;
                        }
                    }
                    AppliedServicesState.Section.Item.State state2 = (AppliedServicesState.Section.Item.State) next;
                    AppliedServicesState.Section.Item.State state3 = state2 == null ? AppliedServicesState.Section.Item.State.f320301e : state2;
                    Action itemAction = aVar3.getItemAction();
                    AppliedServicesState.a aVarB2 = itemAction != null ? b(itemAction) : null;
                    List<BL0.c> listH = aVar3.h();
                    if (listH != null) {
                        List<BL0.c> list4 = listH;
                        arrayList2 = new ArrayList(C42745f0.q(list4, 10));
                        for (BL0.c cVar : list4) {
                            arrayList2.add(new C27332a(cVar.getTitle(), cVar.getState() == StickerState.SELECTED, false, null, null, 24, null));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    arrayList.add(new AppliedServicesState.Section.Item(title, description, icon, planId, aVarB, state3, aVarB2, arrayList2 == null ? C42784z0.f406748b : arrayList2));
                }
            } else {
                arrayList = null;
            }
            List list5 = arrayList == null ? C42784z0.f406748b : arrayList;
            String title2 = bVar.getTitle();
            String description2 = bVar.getDescription();
            Action action2 = bVar.getAction();
            arrayList5.add(new AppliedServicesState.Section(title2, aVar, description2, action2 != null ? b(action2) : null, list5));
        }
        Action action3 = dVar.getAction();
        AppliedServicesState.a aVarB3 = action3 != null ? b(action3) : null;
        Action secondaryAction = dVar.getSecondaryAction();
        return new AppliedServicesState(null, false, arrayList5, aVarB3, secondaryAction != null ? b(secondaryAction) : null);
    }
}
