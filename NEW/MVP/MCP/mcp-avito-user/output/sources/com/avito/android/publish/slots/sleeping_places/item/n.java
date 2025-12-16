package com.avito.android.publish.slots.sleeping_places.item;

import Y41.p;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SleepingPlacesSlotItemViewImplRedesigned.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f244918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectedBedType f244919m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, SelectedBedType selectedBedType) {
        super(1);
        this.f244918l = oVar;
        this.f244919m = selectedBedType;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        p<? super String, ? super Integer, G0> pVar = this.f244918l.f244927i;
        if (pVar != null) {
            pVar.invoke(this.f244919m.getStringId(), Integer.valueOf(iIntValue));
        }
        return G0.f406611a;
    }
}
