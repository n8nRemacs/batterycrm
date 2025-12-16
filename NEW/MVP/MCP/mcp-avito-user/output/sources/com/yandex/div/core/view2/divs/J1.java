package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivSeparator;
import kotlin.Metadata;

/* compiled from: DivSeparatorBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "orientation", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class J1 extends kotlin.jvm.internal.N implements Y41.l<DivSeparator.DelimiterStyle.Orientation, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.q f368111l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(com.yandex.div.core.view2.divs.widgets.q qVar) {
        super(1);
        this.f368111l = qVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DivSeparator.DelimiterStyle.Orientation orientation) {
        this.f368111l.setHorizontal(orientation == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
        return kotlin.G0.f406611a;
    }
}
