package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.view.View;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.X;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f367754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f367755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DivTooltip f367756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C38029k f367757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.util.h f367758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f367759g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC38330g f367760h;

    public e(View view, View view2, DivTooltip divTooltip, C38029k c38029k, com.yandex.div.core.util.h hVar, g gVar, AbstractC38330g abstractC38330g) {
        this.f367754b = view;
        this.f367755c = view2;
        this.f367756d = divTooltip;
        this.f367757e = c38029k;
        this.f367758f = hVar;
        this.f367759g = gVar;
        this.f367760h = abstractC38330g;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        C38029k c38029k = this.f367757e;
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        View view2 = this.f367754b;
        View view3 = this.f367755c;
        DivTooltip divTooltip = this.f367756d;
        Point pointB = h.b(view2, view3, divTooltip, expressionResolver);
        boolean zA2 = h.a(c38029k, view2, pointB);
        g gVar = this.f367759g;
        if (!zA2) {
            gVar.c(divTooltip.f372140e);
            return;
        }
        this.f367758f.update(pointB.x, pointB.y, view2.getWidth(), view2.getHeight());
        X x12 = gVar.f367765c;
        AbstractC38330g abstractC38330g = this.f367760h;
        x12.d(c38029k, null, abstractC38330g, C37931a.u(abstractC38330g.a()));
        x12.d(c38029k, view2, abstractC38330g, C37931a.u(abstractC38330g.a()));
        gVar.f367764b.getClass();
    }
}
