package com.avito.android.visual_rubricator.element;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;

/* compiled from: VisualRubricatorWidgetElementView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/element/a;", "Lcom/facebook/drawee/drawable/s$a;", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends s.a {
    @Override // com.facebook.drawee.drawable.s.a
    public final void b(@Y61.k Matrix matrix, @Y61.k Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
        float fWidth = (rect.width() - (i12 * f15)) + rect.left;
        float f16 = rect.top;
        matrix.setScale(f15, f15);
        matrix.postTranslate(fWidth + 0.5f, f16 + 0.5f);
    }

    @Y61.k
    public final String toString() {
        return "fit_y1";
    }
}
