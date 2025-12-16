package com.avito.android.bundles.vas_union.viewmodel;

import Ek.C13496b;
import androidx.view.C23038g0;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: VasUnionViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/tabs/a;", NotificationOpenAtTab.TAB, "Lkotlin/G0;", "accept", "(Lcom/avito/android/bundles/vas_union/item/tabs/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f108732b;

    public p(a aVar) {
        this.f108732b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.bundles.vas_union.item.tabs.f fVar;
        com.avito.android.bundles.vas_union.item.tabs.a aVar = (com.avito.android.bundles.vas_union.item.tabs.a) obj;
        a aVar2 = this.f108732b;
        C13496b c13496b = aVar2.f108706P;
        com.avito.android.bundles.vas_union.item.tabs.b bVar = (c13496b == null ? null : c13496b).f4211c;
        if (c13496b == null) {
            c13496b = null;
        }
        c13496b.f4210b.f108670d = aVar.f108664a;
        List<com.avito.conveyor_item.a> list = bVar.f108666a.get(bVar.f108667b);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        C13496b c13496b2 = aVar2.f108706P;
        if (c13496b2 == null) {
            c13496b2 = null;
        }
        ArrayList arrayListKe = a.ke(c13496b2.f4210b.f108670d, list);
        C23038g0<w> c23038g0 = aVar2.f108705O;
        w value = c23038g0.getValue();
        if (value != null) {
            c23038g0.postValue(new w(value.f108742a, C42745f0.h0(arrayListKe, (List) aVar2.f108707Q.getValue())));
        }
        C13496b c13496b3 = aVar2.f108706P;
        if ((c13496b3 != null ? c13496b3 : null).f4210b.f108668b.size() < 2 || (fVar = aVar2.f108714X) == null) {
            return;
        }
        fVar.Ba();
    }
}
