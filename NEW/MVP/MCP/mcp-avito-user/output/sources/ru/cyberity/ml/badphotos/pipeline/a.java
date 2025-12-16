package ru.cyberity.ml.badphotos.pipeline;

import Y61.k;
import android.content.Context;
import kotlin.Metadata;
import ru.cyberity.ml.core.pipeline.a;
import ru.cyberity.ml.core.pipeline.core.c;

/* compiled from: BitmapToBadPhotosDetectorTensorBuffer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/ml/badphotos/pipeline/a;", "Lru/cyberity/ml/core/pipeline/core/c;", "Lru/cyberity/ml/core/pipeline/a$a;", "Lru/cyberity/ml/core/buffer/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "input", "a", "(Lru/cyberity/ml/core/pipeline/a$a;)Lru/cyberity/ml/core/buffer/a;", "Landroid/content/Context;", "()Landroid/content/Context;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends c<a.C12572a, ru.cyberity.ml.core.buffer.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Context context;

    public a(@k Context context) {
        this.context = context;
    }

    @Override // ru.cyberity.ml.core.pipeline.core.c
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.ml.core.buffer.a b(@k a.C12572a input) {
        int width = input.getWidth();
        int height = input.getHeight();
        int[] pixels = input.getPixels();
        float[] fArr = new float[width * height * 3];
        int length = pixels.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            fArr[i14] = ((pixels[i13] >> 16) & 255) / 255.0f;
            i13++;
            i14++;
        }
        int length2 = pixels.length;
        int i15 = 0;
        while (i15 < length2) {
            fArr[i14] = ((pixels[i15] >> 8) & 255) / 255.0f;
            i15++;
            i14++;
        }
        int length3 = pixels.length;
        while (i12 < length3) {
            fArr[i14] = (pixels[i12] & 255) / 255.0f;
            i12++;
            i14++;
        }
        return new ru.cyberity.ml.core.buffer.a(fArr, new int[]{1, 3, height, width});
    }
}
