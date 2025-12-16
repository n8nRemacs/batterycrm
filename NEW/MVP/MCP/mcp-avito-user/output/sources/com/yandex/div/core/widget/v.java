package com.yandex.div.core.widget;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LinearContainerLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "child", "", "i", "Lkotlin/G0;", "invoke", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class v extends N implements Y41.p<View, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f369327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f369328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f369329n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n nVar, int i12, l0.f fVar) {
        super(2);
        this.f369327l = nVar;
        this.f369328m = i12;
        this.f369329n = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(View view, Integer num) {
        View view2 = view;
        int iIntValue = num.intValue();
        kotlin.reflect.n<Object>[] nVarArr = n.f369288u;
        n nVar = this.f369327l;
        if (nVar.m(iIntValue)) {
            nVar.f369293g += nVar.f369298l;
        }
        float f12 = nVar.f369306t;
        d.a aVar = com.yandex.div.internal.widget.d.f370251b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        float f13 = cVar.f370245c;
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).height;
        if (f13 <= 0.0f) {
            f13 = i12 == -1 ? 1.0f : 0.0f;
        }
        nVar.f369306t = f13 + f12;
        int i13 = this.f369329n.f406840b;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
        int i14 = this.f369328m;
        boolean zE2 = F.e(i14);
        boolean zN2 = n.n(view2, i13);
        if (zE2 ? zN2 : ((ViewGroup.MarginLayoutParams) cVar2).width != -1) {
            nVar.r(view2, i14, i13, true, true);
        } else {
            if (!zE2) {
                nVar.f369305s.add(view2);
            }
            if (!zN2) {
                nVar.f369303q.add(view2);
            }
        }
        return G0.f406611a;
    }
}
