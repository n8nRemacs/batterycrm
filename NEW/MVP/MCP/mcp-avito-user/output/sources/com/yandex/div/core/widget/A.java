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
final class A extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f369230l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f369231m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f369232n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.e f369233o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f369234p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(int i12, n nVar, l0.f fVar, l0.e eVar, int i13) {
        super(1);
        this.f369230l = i12;
        this.f369231m = nVar;
        this.f369232n = fVar;
        this.f369233o = eVar;
        this.f369234p = i13;
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
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).width;
        int i13 = this.f369234p;
        n nVar = this.f369231m;
        if (i12 == -1) {
            if (this.f369230l > 0) {
                kotlin.reflect.n<Object>[] nVarArr = n.f369288u;
                nVar.getClass();
                float f12 = cVar.f370246d;
                int i14 = ((ViewGroup.MarginLayoutParams) cVar).width;
                float f13 = f12 > 0.0f ? f12 : i14 == -1 ? 1.0f : 0.0f;
                l0.f fVar = this.f369232n;
                int i15 = fVar.f406840b;
                l0.e eVar = this.f369233o;
                float f14 = eVar.f406839b;
                int i16 = (int) ((f13 * i15) / f14);
                if (f12 <= 0.0f) {
                    f12 = i14 == -1 ? 1.0f : 0.0f;
                }
                eVar.f406839b = f14 - f12;
                fVar.f406840b = i15 - i16;
                nVar.t(view2, i13, i16);
            } else {
                kotlin.reflect.n<Object>[] nVarArr2 = n.f369288u;
                nVar.t(view2, i13, 0);
            }
        }
        int iB2 = cVar.b() + view2.getMeasuredHeight();
        kotlin.reflect.n<Object>[] nVarArr3 = n.f369288u;
        nVar.x(i13, iB2);
        int i17 = nVar.f369293g;
        nVar.f369293g = Math.max(i17, cVar.a() + view2.getMeasuredWidth() + i17);
        nVar.w(view2);
        return G0.f406611a;
    }
}
