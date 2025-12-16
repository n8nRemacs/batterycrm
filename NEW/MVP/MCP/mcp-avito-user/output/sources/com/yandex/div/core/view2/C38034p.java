package com.yandex.div.core.view2;

import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivTransitionSelector;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: Div2View.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/g;", "div", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/g;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38034p extends kotlin.jvm.internal.N implements Y41.l<AbstractC38330g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42754k<DivTransitionSelector> f369172l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38034p(C42754k<DivTransitionSelector> c42754k) {
        super(1);
        this.f369172l = c42754k;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC38330g abstractC38330g) {
        if (abstractC38330g instanceof AbstractC38330g.o) {
            this.f369172l.removeLast();
        }
        return G0.f406611a;
    }
}
