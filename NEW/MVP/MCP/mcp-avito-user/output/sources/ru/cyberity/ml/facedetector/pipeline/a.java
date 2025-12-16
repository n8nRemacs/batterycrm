package ru.cyberity.ml.facedetector.pipeline;

import Y61.k;
import android.graphics.Bitmap;
import kotlin.Metadata;
import ru.cyberity.ml.core.pipeline.core.c;

/* compiled from: BitmapToFaceDetectorTensorBuffer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lru/cyberity/ml/facedetector/pipeline/a;", "Lru/cyberity/ml/core/pipeline/core/c;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/core/buffer/a;", "input", "a", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends c<Bitmap, ru.cyberity.ml.core.buffer.a> {
    @Override // ru.cyberity.ml.core.pipeline.core.c
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.ml.core.buffer.a b(@k Bitmap input) {
        int width = input.getWidth();
        int height = input.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        input.getPixels(iArr, 0, width, 0, 0, width, height);
        float[] fArr = new float[i12 * 3];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = iArr[i14];
            fArr[i13] = (((i15 >> 16) & 255) - 127.5f) / 127.5f;
            int i16 = i13 + 2;
            fArr[i13 + 1] = (((i15 >> 8) & 255) - 127.5f) / 127.5f;
            i13 += 3;
            fArr[i16] = ((i15 & 255) - 127.5f) / 127.5f;
        }
        return new ru.cyberity.ml.core.buffer.a(fArr, new int[]{height, width, 3});
    }
}
