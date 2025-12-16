package com.yandex.div.core.view2.divs;

import kotlin.Metadata;

/* compiled from: DivSeparatorBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "color", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class I1 extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.q f368101l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(com.yandex.div.core.view2.divs.widgets.q qVar) {
        super(1);
        this.f368101l = qVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Integer num) {
        this.f368101l.setDividerColor(num.intValue());
        return kotlin.G0.f406611a;
    }
}
