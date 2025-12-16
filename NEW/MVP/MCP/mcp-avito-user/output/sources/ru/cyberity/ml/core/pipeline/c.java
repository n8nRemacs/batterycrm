package ru.cyberity.ml.core.pipeline;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: ResizeOp.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lru/cyberity/ml/core/pipeline/c;", "Lru/cyberity/ml/core/pipeline/core/c;", "Landroid/graphics/Bitmap;", "input", "a", "", "I", "targetWidth", "b", "targetHeight", "", "c", "Z", "filter", "d", "keepAspectRatio", "<init>", "(IIZZ)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c extends ru.cyberity.ml.core.pipeline.core.c<Bitmap, Bitmap> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int targetWidth;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int targetHeight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean filter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean keepAspectRatio;

    public c(int i12, int i13, boolean z12, boolean z13) {
        this.targetWidth = i12;
        this.targetHeight = i13;
        this.filter = z12;
        this.keepAspectRatio = z13;
    }

    @Override // ru.cyberity.ml.core.pipeline.core.c
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap b(@k Bitmap input) {
        if (!this.keepAspectRatio) {
            return Bitmap.createScaledBitmap(input, this.targetWidth, this.targetHeight, this.filter);
        }
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, input.getWidth(), input.getHeight()), new RectF(0.0f, 0.0f, this.targetWidth, this.targetHeight), Matrix.ScaleToFit.CENTER);
        return Bitmap.createBitmap(input, 0, 0, input.getWidth(), input.getHeight(), matrix, this.filter);
    }
}
