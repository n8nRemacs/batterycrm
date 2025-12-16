package com.avito.android.krop;

import android.widget.ImageView;
import com.avito.android.krop.util.ScaleAfterRotationStyle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* loaded from: classes14.dex */
public final /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f174838a;

    static {
        int[] iArr = new int[ScaleAfterRotationStyle.values().length];
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[0] = 3;
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f174838a = iArr2;
        iArr2[ImageView.ScaleType.CENTER.ordinal()] = 1;
        iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
        iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
        iArr2[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
    }
}
