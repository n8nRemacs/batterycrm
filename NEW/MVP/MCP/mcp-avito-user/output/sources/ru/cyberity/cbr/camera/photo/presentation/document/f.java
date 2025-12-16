package ru.cyberity.cbr.camera.photo.presentation.document;

import Y61.k;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/graphics/Rect;", "", "scaleX", "scaleY", "a", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {
    @k
    public static final Rect a(@k Rect rect, float f12, float f13) {
        RectF rectF = new RectF(rect);
        return new Rect((int) (rectF.left * f12), (int) (rectF.top * f13), (int) (rectF.right * f12), (int) (rectF.bottom * f13));
    }
}
