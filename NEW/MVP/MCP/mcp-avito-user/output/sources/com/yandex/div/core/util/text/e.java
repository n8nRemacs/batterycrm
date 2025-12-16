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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/text/e;", "Lcom/yandex/div/core/util/text/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f367839a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.e f367840b;

    public e(@k View view, @k com.yandex.div.json.expressions.e eVar) {
        this.f367839a = view;
        this.f367840b = eVar;
    }

    @Override // com.yandex.div.core.util.text.c
    public final void a(@k Canvas canvas, @k Layout layout, int i12, int i13, int i14, int i15, @l C38600x7 c38600x7, @l AbstractC38582v7 abstractC38582v7) {
        int paragraphDirection = layout.getParagraphDirection(i12);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i12) : layout.getLineRight(i12);
        int iB2 = c.b(layout, i12);
        int iC2 = c.c(layout, i12);
        a aVar = new a(this.f367839a.getResources().getDisplayMetrics(), c38600x7, abstractC38582v7, canvas, this.f367840b);
        float f12 = i14;
        float f13 = iC2;
        float f14 = (int) lineLeft;
        float f15 = iB2;
        float[] fArr = new float[8];
        float[] fArr2 = aVar.f367831g;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        aVar.a(fArr, f12, f13, f14, f15);
        for (int i16 = i12 + 1; i16 < i13; i16++) {
            aVar.a(new float[8], (int) layout.getLineLeft(i16), c.c(layout, i16), (int) layout.getLineRight(i16), c.b(layout, i16));
        }
        float lineRight = paragraphDirection == -1 ? layout.getLineRight(i12) : layout.getLineLeft(i12);
        int iB3 = c.b(layout, i13);
        float f16 = (int) lineRight;
        float fC2 = c.c(layout, i13);
        float f17 = i15;
        float f18 = iB3;
        float[] fArr3 = new float[8];
        if (fArr2 != null) {
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = fArr2[2];
            fArr3[3] = fArr2[3];
            fArr3[4] = fArr2[4];
            fArr3[5] = fArr2[5];
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
        }
        aVar.a(fArr3, f16, fC2, f17, f18);
    }
}
