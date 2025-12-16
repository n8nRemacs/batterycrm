package com.avito.android.vas_union.ui.items.tabs;

import Y41.l;
import com.avito.android.vas_union.ui.items.tabs.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionV2TabsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f323251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f323252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, f fVar) {
        super(1);
        this.f323251l = cVar;
        this.f323252m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        c.a aVar = (c.a) C42745f0.K(num.intValue(), this.f323251l.f323247c);
        if (aVar != null) {
            this.f323252m.f323253b.invoke(aVar);
        }
        return G0.f406611a;
    }
}
