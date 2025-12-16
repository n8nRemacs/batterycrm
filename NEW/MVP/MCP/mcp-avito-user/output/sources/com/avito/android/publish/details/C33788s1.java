package com.avito.android.publish.details;

import com.avito.android.category_parameters.f;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PublishDetailsSlotManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/f;", "refreshType", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.s1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33788s1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33794u1 f234921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<com.avito.android.category_parameters.j<? extends Slot<?>>> f234922c;

    /* JADX WARN: Multi-variable type inference failed */
    public C33788s1(C33794u1 c33794u1, Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set) {
        this.f234921b = c33794u1;
        this.f234922c = set;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC33535v interfaceC33535v;
        com.avito.android.category_parameters.f fVar = (com.avito.android.category_parameters.f) obj;
        boolean z12 = fVar instanceof f.b;
        C33794u1 c33794u1 = this.f234921b;
        if (z12) {
            InterfaceC33535v interfaceC33535v2 = c33794u1.f235040c;
            SlotType slotType = fVar.f117642a;
            interfaceC33535v2.H(slotType.getStrValue());
            InterfaceC33678b interfaceC33678b = c33794u1.f235041d.get();
            PublishDetailsFlowTracker.FlowContext flowContextA = com.avito.android.publish.details.analytics.d.a(slotType);
            if (flowContextA == null) {
                flowContextA = PublishDetailsFlowTracker.FlowContext.f233436b;
            }
            interfaceC33678b.B9(flowContextA);
            return;
        }
        if (fVar instanceof f.a) {
            f.a aVar = (f.a) fVar;
            c33794u1.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<com.avito.android.category_parameters.j<? extends Slot<?>>> it = this.f234922c.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC33535v = c33794u1.f235040c;
                if (!zHasNext) {
                    break;
                }
                com.avito.android.category_parameters.j<? extends Slot<?>> next = it.next();
                com.avito.android.category_parameters.f fVarE = next.e(aVar.f117643b);
                if (fVarE instanceof f.b) {
                    interfaceC33535v.H(next.g().getSlotType().getStrValue());
                    PublishDetailsFlowTracker.FlowContext flowContextA2 = com.avito.android.publish.details.analytics.d.a(fVarE.f117642a);
                    if (flowContextA2 != null) {
                        arrayList.add(flowContextA2);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            interfaceC33535v.E0();
            InterfaceC33678b interfaceC33678b2 = c33794u1.f235041d.get();
            PublishDetailsFlowTracker.FlowContext[] flowContextArr = (PublishDetailsFlowTracker.FlowContext[]) arrayList.toArray(new PublishDetailsFlowTracker.FlowContext[0]);
            interfaceC33678b2.B9((PublishDetailsFlowTracker.FlowContext[]) Arrays.copyOf(flowContextArr, flowContextArr.length));
        }
    }
}
