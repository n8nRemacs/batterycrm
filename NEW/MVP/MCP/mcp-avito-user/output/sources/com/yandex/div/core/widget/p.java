package com.yandex.div.core.widget;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LinearContainerLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "child", "", "i", "Lkotlin/G0;", "invoke", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class p extends N implements Y41.p<View, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f369311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Canvas f369312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, Canvas canvas) {
        super(2);
        this.f369311l = nVar;
        this.f369312m = canvas;
    }

    @Override // Y41.p
    public final G0 invoke(View view, Integer num) {
        View view2 = view;
        int iIntValue = num.intValue();
        kotlin.reflect.n<Object>[] nVarArr = n.f369288u;
        n nVar = this.f369311l;
        if (nVar.m(iIntValue)) {
            int top = view2.getTop();
            d.a aVar = com.yandex.div.internal.widget.d.f370251b;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            }
            int i12 = (top - ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams)).topMargin) - nVar.f369298l;
            nVar.f(this.f369312m, nVar.getPaddingLeft() + nVar.dividerPadding, i12, (nVar.getWidth() - nVar.getPaddingRight()) - nVar.dividerPadding, i12 + nVar.f369298l);
        }
        return G0.f406611a;
    }
}
