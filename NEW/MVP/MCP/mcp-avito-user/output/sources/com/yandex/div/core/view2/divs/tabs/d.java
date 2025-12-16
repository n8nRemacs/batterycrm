package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivTabsBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class d extends N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f368770l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z zVar) {
        super(1);
        this.f368770l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        b divTabsAdapter = this.f368770l.getDivTabsAdapter();
        if (divTabsAdapter != null) {
            divTabsAdapter.d();
        }
        return G0.f406611a;
    }
}
