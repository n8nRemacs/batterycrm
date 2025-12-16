package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.z;
import com.yandex.div2.DivTabs;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class f extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f368779l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f368780m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DivTabs f368781n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, c cVar, DivTabs divTabs) {
        super(1);
        this.f368779l = zVar;
        this.f368780m = cVar;
        this.f368781n = divTabs;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        b divTabsAdapter = this.f368779l.getDivTabsAdapter();
        if (divTabsAdapter != null) {
            int size = this.f368781n.f372050o.size() - 1;
            int i12 = c.f368746k;
            this.f368780m.getClass();
            divTabsAdapter.f370461c.setDisabledScrollPages(zBooleanValue ? new LinkedHashSet() : C42745f0.O0(new kotlin.ranges.l(0, size, 1)));
        }
        return G0.f406611a;
    }
}
