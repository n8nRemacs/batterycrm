package com.avito.android.publish.slots.sleeping_places.item;

import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SleepingPlacesSlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "bedId", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f244898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f244899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f244900n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, a aVar, String str) {
        super(1);
        this.f244898l = fVar;
        this.f244899m = aVar;
        this.f244900n = str;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Object next;
        int iIntValue = num.intValue();
        f fVar = this.f244898l;
        fVar.getClass();
        a aVar = this.f244899m;
        List<SleepingPlacesBedType> options = aVar.f244876h.getOptions();
        String title = null;
        if (options != null) {
            Iterator<T> it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SleepingPlacesBedType) next).getId() == iIntValue) {
                    break;
                }
            }
            SleepingPlacesBedType sleepingPlacesBedType = (SleepingPlacesBedType) next;
            if (sleepingPlacesBedType != null) {
                title = sleepingPlacesBedType.getTitle();
            }
        }
        ArrayList<SelectedBedType> arrayList = aVar.f244877i;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (SelectedBedType selectedBedTypeCopy$default : arrayList) {
            if (L.f(selectedBedTypeCopy$default.getStringId(), this.f244900n)) {
                selectedBedTypeCopy$default = SelectedBedType.copy$default(selectedBedTypeCopy$default, Integer.valueOf(iIntValue), 0, null, title, null, 22, null);
            }
            arrayList2.add(selectedBedTypeCopy$default);
        }
        fVar.f244886b.accept(a.a(aVar, arrayList2));
        return G0.f406611a;
    }
}
