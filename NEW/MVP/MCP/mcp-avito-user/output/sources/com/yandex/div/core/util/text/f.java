package com.yandex.div.core.util.text;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div2.AbstractC38582v7;
import com.yandex.div2.C38600x7;
import kotlin.Metadata;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/text/f;", "Lcom/yandex/div/core/util/text/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f367841a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.e f367842b;

    public f(@k View view, @k com.yandex.div.json.expressions.e eVar) {
        this.f367841a = view;
        this.f367842b = eVar;
    }

    @Override // com.yandex.div.core.util.text.c
    public final void a(@k Canvas canvas, @k Layout layout, int i12, int i13, int i14, int i15, @l C38600x7 c38600x7, @l AbstractC38582v7 abstractC38582v7) {
        int iC2 = c.c(layout, i12);
        int iB2 = c.b(layout, i12);
        int iMin = Math.min(i14, i15);
        int iMax = Math.max(i14, i15);
        a aVar = new a(this.f367841a.getResources().getDisplayMetrics(), c38600x7, abstractC38582v7, canvas, this.f367842b);
        aVar.a(aVar.f367831g, iMin, iC2, iMax, iB2);
    }
}
