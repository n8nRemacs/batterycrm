package com.yandex.div.core.widget;

import android.view.View;
import android.view.ViewGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LinearContainerLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class t extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f369323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.f f369324m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n nVar, l0.f fVar) {
        super(1);
        this.f369323l = nVar;
        this.f369324m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        int i12 = this.f369324m.f406840b;
        n nVar = this.f369323l;
        boolean z12 = nVar.f369304r == 0;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        if (((ViewGroup.MarginLayoutParams) cVar).height == -1) {
            if (z12) {
                nVar.f369304r = Math.max(nVar.f369304r, cVar.b());
            } else {
                nVar.t(view2, i12, view2.getMeasuredWidth());
                nVar.x(i12, cVar.b() + view2.getMeasuredHeight());
            }
        }
        return G0.f406611a;
    }
}
