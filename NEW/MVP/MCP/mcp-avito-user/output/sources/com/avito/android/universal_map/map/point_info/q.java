package com.avito.android.universal_map.map.point_info;

import com.avito.android.universal_map.map.point_info.g;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfoViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072Z\u0010\u0006\u001aV\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/l0;", "", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/l0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f305873b;

    public q(s sVar) {
        this.f305873b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        List list = (List) c42829l0.f406871b;
        List list2 = (List) c42829l0.f406872c;
        List list3 = (List) c42829l0.f406873d;
        s sVar = this.f305873b;
        if (sVar.f305888V == null) {
            return;
        }
        sVar.f305892Z.setValue(new g.a.C9392a(new g.a.C9392a.C9393a(sVar.f305884R.getF103350r(), list, sVar.f305885S.getF103350r(), list2, sVar.f305886T.getF103350r(), list3), new P2.b(G0.f406611a)));
    }
}
