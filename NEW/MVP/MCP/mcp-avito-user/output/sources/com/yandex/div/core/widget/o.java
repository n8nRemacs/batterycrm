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
final class o extends N implements Y41.p<View, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f369308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f369309m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Canvas f369310n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, boolean z12, Canvas canvas) {
        super(2);
        this.f369308l = nVar;
        this.f369309m = z12;
        this.f369310n = canvas;
    }

    @Override // Y41.p
    public final G0 invoke(View view, Integer num) {
        int i12;
        View view2 = view;
        int iIntValue = num.intValue();
        kotlin.reflect.n<Object>[] nVarArr = n.f369288u;
        n nVar = this.f369308l;
        if (nVar.m(iIntValue)) {
            if (this.f369309m) {
                int right = view2.getRight();
                d.a aVar = com.yandex.div.internal.widget.d.f370251b;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                i12 = right + ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams)).rightMargin;
            } else {
                int left = view2.getLeft();
                d.a aVar2 = com.yandex.div.internal.widget.d.f370251b;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                i12 = (left - ((ViewGroup.MarginLayoutParams) ((com.yandex.div.internal.widget.c) layoutParams2)).leftMargin) - nVar.f369297k;
            }
            int i13 = i12;
            nVar.f(this.f369310n, i13, nVar.getPaddingTop() + nVar.dividerPadding, i13 + nVar.f369297k, (nVar.getHeight() - nVar.getPaddingBottom()) - nVar.dividerPadding);
        }
        return G0.f406611a;
    }
}
