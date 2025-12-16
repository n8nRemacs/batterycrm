package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinImageModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {
    @l
    public static final float[] a(@k ImageStyle imageStyle, boolean z12) {
        float[] fArrA;
        if (imageStyle.getCorners() != null) {
            fArrA = Wh.d.a(imageStyle.getCorners());
        } else if (imageStyle.getCornerRadius() != null) {
            float[] fArr = new float[8];
            for (int i12 = 0; i12 < 8; i12++) {
                fArr[i12] = y6.b(imageStyle.getCornerRadius().intValue());
            }
            fArrA = fArr;
        } else {
            fArrA = null;
        }
        if (fArrA == null) {
            return null;
        }
        if (z12) {
            int length = fArrA.length;
            for (int i13 = 0; i13 < length; i13++) {
                fArrA[i13] = ((imageStyle.getBorder() != null ? y6.b(r3.getWidth()) : 0.0f) / 2.0f) + fArrA[i13];
            }
        }
        return fArrA;
    }
}
