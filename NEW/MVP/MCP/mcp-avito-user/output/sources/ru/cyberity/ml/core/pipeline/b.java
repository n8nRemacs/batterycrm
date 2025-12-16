package ru.cyberity.ml.core.pipeline;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Metadata;

/* compiled from: ResizeImageWithCropOrPadOp.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lru/cyberity/ml/core/pipeline/b;", "Lru/cyberity/ml/core/pipeline/core/c;", "Landroid/graphics/Bitmap;", "input", "a", "", "I", "targetWidth", "b", "targetHeight", "<init>", "(II)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.ml.core.pipeline.core.c<Bitmap, Bitmap> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int targetWidth;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int targetHeight;

    public b(int i12, int i13) {
        this.targetWidth = i12;
        this.targetHeight = i13;
    }

    @Override // ru.cyberity.ml.core.pipeline.core.c
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap b(@k Bitmap input) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int width = input.getWidth();
        int height = input.getHeight();
        int i18 = this.targetWidth;
        int i19 = 0;
        if (i18 > width) {
            i15 = (i18 - width) / 2;
            i14 = i15 + width;
            i13 = width;
            i12 = 0;
        } else {
            i12 = (width - i18) / 2;
            i13 = i12 + i18;
            i14 = i18;
            i15 = 0;
        }
        int i22 = this.targetHeight;
        if (i22 > height) {
            i17 = (i22 - height) / 2;
            i16 = i17 + height;
        } else {
            int i23 = (height - i22) / 2;
            i19 = i23;
            height = i23 + i22;
            i16 = i22;
            i17 = 0;
        }
        Rect rect = new Rect(i12, i19, i13, height);
        Rect rect2 = new Rect(i15, i17, i14, i16);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.targetWidth, this.targetHeight, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(input, rect, rect2, (Paint) null);
        return bitmapCreateBitmap;
    }
}
