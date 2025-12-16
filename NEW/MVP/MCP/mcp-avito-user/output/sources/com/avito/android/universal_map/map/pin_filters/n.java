package com.avito.android.universal_map.map.pin_filters;

import com.avito.android.universal_map.map.pin_filters.g;
import java.util.List;
import kotlin.C42829l0;
import kotlin.Metadata;

/* compiled from: UniversalMapPinFiltersViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/l0;", "", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/l0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f305769b;

    public n(o oVar) {
        this.f305769b = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        List list = (List) c42829l0.f406871b;
        List list2 = (List) c42829l0.f406872c;
        List list3 = (List) c42829l0.f406873d;
        o oVar = this.f305769b;
        oVar.f305785X.setValue(new g.a.b(oVar.f305780S.getF103350r(), list, oVar.f305781T.getF103350r(), list2, oVar.f305782U.getF103350r(), list3));
    }
}
