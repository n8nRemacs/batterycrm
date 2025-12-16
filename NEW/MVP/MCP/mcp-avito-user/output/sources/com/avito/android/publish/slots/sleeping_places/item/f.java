package com.avito.android.publish.slots.sleeping_places.item;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBottomSheetData;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesRules;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import vf0.C49325f;

/* compiled from: SleepingPlacesSlotItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/item/f;", "Lcom/avito/android/publish/slots/sleeping_places/item/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.publish.slots.sleeping_places.item.a> f244886b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f244887c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C49325f> f244888d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f244889e;

    /* compiled from: SleepingPlacesSlotItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "localId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.item.a f244890l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f244891m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.publish.slots.sleeping_places.item.a aVar, f fVar) {
            super(1);
            this.f244890l = aVar;
            this.f244891m = fVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            com.avito.android.publish.slots.sleeping_places.item.a aVar = this.f244890l;
            ArrayList arrayList = aVar.f244877i;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!L.f(((SelectedBedType) obj).getStringId(), str2)) {
                    arrayList2.add(obj);
                }
            }
            this.f244891m.f244886b.accept(com.avito.android.publish.slots.sleeping_places.item.a.a(aVar, arrayList2));
            return G0.f406611a;
        }
    }

    /* compiled from: SleepingPlacesSlotItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "bedTypeId", "", "localId", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Integer, String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.item.a f244892l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f244893m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.publish.slots.sleeping_places.item.a aVar, f fVar) {
            super(2);
            this.f244892l = aVar;
            this.f244893m = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, String str) {
            ArrayList arrayList;
            Object next;
            Integer num2 = num;
            String str2 = str;
            com.avito.android.publish.slots.sleeping_places.item.a aVar = this.f244892l;
            ArrayList arrayList2 = aVar.f244877i;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((SelectedBedType) obj).getId() != null) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(((SelectedBedType) it.next()).getId());
            }
            Iterator it2 = aVar.f244877i.iterator();
            while (true) {
                arrayList = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (L.f(((SelectedBedType) next).getStringId(), str2)) {
                    break;
                }
            }
            SelectedBedType selectedBedType = (SelectedBedType) next;
            Integer id2 = selectedBedType != null ? selectedBedType.getId() : null;
            SleepingPlacesBottomSheetData sleepingPlacesBottomSheetData = aVar.f244876h;
            List<SleepingPlacesBedType> options = sleepingPlacesBottomSheetData.getOptions();
            if (options != null) {
                arrayList = new ArrayList();
                for (Object obj2 : options) {
                    SleepingPlacesBedType sleepingPlacesBedType = (SleepingPlacesBedType) obj2;
                    if (arrayList4.contains(Integer.valueOf(sleepingPlacesBedType.getId()))) {
                        int id3 = sleepingPlacesBedType.getId();
                        if (id2 != null && id3 == id2.intValue()) {
                        }
                    }
                    arrayList.add(obj2);
                }
            }
            f fVar = this.f244893m;
            fVar.f244888d.accept(new C49325f(arrayList, sleepingPlacesBottomSheetData.getTitle(), aVar.f244873e, num2, new g(fVar, aVar, str2)));
            return G0.f406611a;
        }
    }

    /* compiled from: SleepingPlacesSlotItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "localId", "", DeliverySubsidiesSlotKt.AMOUNT, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<String, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.item.a f244894l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f244895m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.publish.slots.sleeping_places.item.a aVar, f fVar) {
            super(2);
            this.f244894l = aVar;
            this.f244895m = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(String str, Integer num) {
            Object next;
            String str2 = str;
            int iIntValue = num.intValue();
            com.avito.android.publish.slots.sleeping_places.item.a aVar = this.f244894l;
            Iterator it = aVar.f244877i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((SelectedBedType) next).getStringId(), str2)) {
                    break;
                }
            }
            SelectedBedType selectedBedType = (SelectedBedType) next;
            if (selectedBedType != null) {
                selectedBedType.setAmount(iIntValue);
            }
            this.f244895m.f244886b.accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SleepingPlacesSlotItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.sleeping_places.item.a f244896l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f244897m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.publish.slots.sleeping_places.item.a aVar, f fVar) {
            super(0);
            this.f244896l = aVar;
            this.f244897m = fVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.publish.slots.sleeping_places.item.a aVar = this.f244896l;
            this.f244897m.f244886b.accept(com.avito.android.publish.slots.sleeping_places.item.a.a(aVar, C42745f0.i0(new SelectedBedType(null, 0, null, null, null, 31, null), aVar.f244877i)));
            return G0.f406611a;
        }
    }

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<com.avito.android.publish.slots.sleeping_places.item.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244886b = cVar;
        this.f244887c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<C49325f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244888d = cVar2;
        this.f244889e = new C41981q0(cVar2);
    }

    public static void k(i iVar, List list, SleepingPlacesRules sleepingPlacesRules) {
        iVar.dg(sleepingPlacesRules.getMaxAmount(), list, list.size() > sleepingPlacesRules.getMinGroups());
        iVar.Q40(list.size() < sleepingPlacesRules.getMaxGroups());
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.e
    @Y61.k
    /* renamed from: A7, reason: from getter */
    public final C41981q0 getF244889e() {
        return this.f244889e;
    }

    public final void O(i iVar, com.avito.android.publish.slots.sleeping_places.item.a aVar) {
        iVar.e60(new a(aVar, this));
        iVar.Im(new b(aVar, this));
        iVar.VO(new c(aVar, this));
        iVar.Tg(new d(aVar, this));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        com.avito.android.publish.slots.sleeping_places.item.a aVar2 = (com.avito.android.publish.slots.sleeping_places.item.a) aVar;
        iVar.P70(aVar2.f244872d, aVar2.f244875g);
        iVar.O3(aVar2.f244873e);
        iVar.fV(aVar2.f244874f);
        k(iVar, aVar2.f244877i, aVar2.f244878j);
        O(iVar, aVar2);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.item.e
    @Y61.k
    /* renamed from: Z6, reason: from getter */
    public final C41981q0 getF244887c() {
        return this.f244887c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        com.avito.android.publish.slots.sleeping_places.item.a aVar2 = (com.avito.android.publish.slots.sleeping_places.item.a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.publish.slots.sleeping_places.item.d) {
                obj = obj2;
            }
        }
        com.avito.android.publish.slots.sleeping_places.item.d dVar = (com.avito.android.publish.slots.sleeping_places.item.d) (obj instanceof com.avito.android.publish.slots.sleeping_places.item.d ? obj : null);
        if (dVar != null) {
            List<SelectedBedType> list2 = dVar.f244885a;
            if (list2 != null) {
                k(iVar, list2, aVar2.f244878j);
            }
            O(iVar, aVar2);
            return;
        }
        iVar.P70(aVar2.f244872d, aVar2.f244875g);
        iVar.O3(aVar2.f244873e);
        iVar.fV(aVar2.f244874f);
        k(iVar, aVar2.f244877i, aVar2.f244878j);
        O(iVar, aVar2);
    }
}
