package com.yandex.div.core.view2.divs.tabs;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.internal.widget.tabs.o;
import com.yandex.div.internal.widget.tabs.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedTab", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class g extends N implements Y41.l<Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f368782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f368783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, z zVar) {
        super(1);
        this.f368782l = cVar;
        this.f368783m = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(Long l12) {
        m mVar;
        int i12;
        long jLongValue = l12.longValue();
        this.f368782l.f368756j = Long.valueOf(jLongValue);
        b divTabsAdapter = this.f368783m.getDivTabsAdapter();
        if (divTabsAdapter != null && (mVar = divTabsAdapter.f368745w) != null) {
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            o oVar = mVar.f368814a;
            if (oVar.getCurrentItem() != i12) {
                oVar.x(i12, true);
            }
        }
        return G0.f406611a;
    }
}
