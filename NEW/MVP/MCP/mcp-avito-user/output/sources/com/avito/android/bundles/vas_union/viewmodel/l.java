package com.avito.android.bundles.vas_union.viewmodel;

import Ek.C13496b;
import androidx.view.C23038g0;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: VasUnionViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/CommonTab;", NotificationOpenAtTab.TAB, "Lkotlin/G0;", "accept", "(Lcom/avito/android/lib/deprecated_design/tab/CommonTab;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f108728b;

    public l(a aVar) {
        this.f108728b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        CommonTab commonTab = (CommonTab) obj;
        a aVar = this.f108728b;
        C13496b c13496b = aVar.f108706P;
        if (c13496b == null) {
            c13496b = null;
        }
        com.avito.android.bundles.vas_union.item.tabs.b bVar = c13496b.f4211c;
        bVar.f108667b = commonTab;
        List<com.avito.conveyor_item.a> list = bVar.f108666a.get(commonTab);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        C13496b c13496b2 = aVar.f108706P;
        ArrayList arrayListKe = a.ke((c13496b2 != null ? c13496b2 : null).f4210b.f108670d, list);
        C23038g0<w> c23038g0 = aVar.f108705O;
        w value = c23038g0.getValue();
        if (value != null) {
            c23038g0.postValue(new w(value.f108742a, C42745f0.h0(arrayListKe, (List) aVar.f108707Q.getValue())));
        }
        aVar.me();
        com.avito.android.bundles.vas_union.item.tabs.f fVar = aVar.f108714X;
        if (fVar != null) {
            fVar.Ba();
        }
    }
}
