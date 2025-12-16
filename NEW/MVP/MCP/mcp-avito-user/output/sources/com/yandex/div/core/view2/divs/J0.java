package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38577v2;
import kotlin.Metadata;

/* compiled from: DivImageBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/J0;", "Lcom/yandex/div/core/Y;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class J0 extends com.yandex.div.core.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C38029k f368106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.i f368107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K0 f368108c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C38577v2 f368109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C38029k c38029k, K0 k02, com.yandex.div.core.view2.divs.widgets.i iVar, com.yandex.div.json.expressions.e eVar, C38577v2 c38577v2) {
        super(c38029k);
        this.f368106a = c38029k;
        this.f368107b = iVar;
        this.f368108c = k02;
        this.f368109d = c38577v2;
        this.f368110e = eVar;
    }

    @Override // v21.b
    public final void a() {
        this.f368107b.setImageUrl$div_release(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    @Override // v21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k v21.C49153a r10) {
        /*
            r9 = this;
            android.graphics.Bitmap r0 = r10.f440420a
            com.yandex.div.core.view2.divs.widgets.i r1 = r9.f368107b
            r1.setCurrentBitmapWithoutFilters$div_release(r0)
            com.yandex.div2.v2 r0 = r9.f368109d
            java.util.List<com.yandex.div2.j1> r2 = r0.f376748r
            com.yandex.div.json.expressions.e r3 = r9.f368110e
            com.yandex.div.core.view2.divs.K0 r4 = r9.f368108c
            com.yandex.div.core.view2.k r5 = r9.f368106a
            com.yandex.div.core.view2.divs.K0.a(r4, r1, r2, r5, r3)
            android.view.ViewPropertyAnimator r2 = r1.animate()
            r2.cancel()
            com.yandex.div.json.expressions.b<java.lang.Double> r2 = r0.f376737g
            java.lang.Object r2 = r2.a(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            double r4 = r2.doubleValue()
            float r2 = (float) r4
            com.yandex.div2.f1 r4 = r0.f376738h
            if (r4 == 0) goto L7b
            com.yandex.div.core.images.BitmapSource r5 = com.yandex.div.core.images.BitmapSource.f367561c
            com.yandex.div.core.images.BitmapSource r10 = r10.f440422c
            if (r10 != r5) goto L33
            goto L7b
        L33:
            com.yandex.div.json.expressions.b<java.lang.Long> r10 = r4.f374766b
            java.lang.Object r10 = r10.a(r3)
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
            com.yandex.div.json.expressions.b<com.yandex.div2.DivAnimationInterpolator> r10 = r4.f374767c
            java.lang.Object r10 = r10.a(r3)
            com.yandex.div2.DivAnimationInterpolator r10 = (com.yandex.div2.DivAnimationInterpolator) r10
            android.view.animation.Interpolator r10 = com.yandex.div.core.util.c.b(r10)
            com.yandex.div.json.expressions.b<java.lang.Double> r7 = r4.f374765a
            java.lang.Object r7 = r7.a(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            double r7 = r7.doubleValue()
            float r7 = (float) r7
            r1.setAlpha(r7)
            com.yandex.div.json.expressions.b<java.lang.Long> r4 = r4.f374768d
            java.lang.Object r4 = r4.a(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            long r7 = r4.longValue()
            android.view.ViewPropertyAnimator r4 = r1.animate()
            android.view.ViewPropertyAnimator r2 = r4.alpha(r2)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r5)
            android.view.ViewPropertyAnimator r10 = r2.setInterpolator(r10)
            r10.setStartDelay(r7)
            goto L7e
        L7b:
            r1.setAlpha(r2)
        L7e:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r2 = 2131366983(0x7f0a1447, float:1.8353875E38)
            r1.setTag(r2, r10)
            com.yandex.div.json.expressions.b<java.lang.Integer> r10 = r0.f376719G
            com.yandex.div.json.expressions.b<com.yandex.div2.DivBlendMode> r0 = r0.f376720H
            com.yandex.div.core.view2.divs.K0.c(r1, r3, r10, r0)
            r1.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.J0.b(v21.a):void");
    }
}
