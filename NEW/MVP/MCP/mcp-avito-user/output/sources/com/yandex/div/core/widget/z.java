package com.yandex.div.core.widget;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: LinearContainerLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "child", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class z extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f369360l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f369361m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f369362n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.e f369363o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f369364p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f369365q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i12, n nVar, l0.f fVar, l0.e eVar, int i13, int i14) {
        super(1);
        this.f369360l = i12;
        this.f369361m = nVar;
        this.f369362n = fVar;
        this.f369363o = eVar;
        this.f369364p = i13;
        this.f369365q = i14;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        d.a aVar = com.yandex.div.internal.widget.d.f370251b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).height;
        int i13 = this.f369364p;
        n nVar = this.f369361m;
        if (i12 == -1) {
            int i14 = this.f369360l;
            int i15 = this.f369365q;
            if (i14 > 0) {
                kotlin.reflect.n<Object>[] nVarArr = n.f369288u;
                nVar.getClass();
                float f12 = cVar.f370245c;
                int i16 = ((ViewGroup.MarginLayoutParams) cVar).height;
                float f13 = f12 > 0.0f ? f12 : i16 == -1 ? 1.0f : 0.0f;
                l0.f fVar = this.f369362n;
                int i17 = fVar.f406840b;
                l0.e eVar = this.f369363o;
                float f14 = eVar.f406839b;
                int i18 = (int) ((f13 * i17) / f14);
                if (f12 <= 0.0f) {
                    f12 = i16 == -1 ? 1.0f : 0.0f;
                }
                eVar.f406839b = f14 - f12;
                fVar.f406840b = i17 - i18;
                nVar.u(i13, i15, i18, view2);
            } else if (nVar.f369303q.contains(view2)) {
                nVar.u(i13, i15, 0, view2);
            }
        }
        int iA2 = cVar.a() + view2.getMeasuredWidth();
        kotlin.reflect.n<Object>[] nVarArr2 = n.f369288u;
        nVar.x(i13, iA2);
        int i19 = nVar.f369293g;
        nVar.f369293g = Math.max(i19, cVar.b() + view2.getMeasuredHeight() + i19);
        return G0.f406611a;
    }
}
