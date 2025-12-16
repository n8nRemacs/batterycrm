package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(D)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class W extends kotlin.jvm.internal.N implements Y41.l<Double, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f368256l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(View view) {
        super(1);
        this.f368256l = view;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Double d12) {
        float fDoubleValue = (float) d12.doubleValue();
        View view = this.f368256l;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.yandex.div.internal.widget.c cVar = layoutParams instanceof com.yandex.div.internal.widget.c ? (com.yandex.div.internal.widget.c) layoutParams : null;
        if (cVar != null && cVar.f370246d != fDoubleValue) {
            cVar.f370246d = fDoubleValue;
            view.requestLayout();
        }
        return kotlin.G0.f406611a;
    }
}
