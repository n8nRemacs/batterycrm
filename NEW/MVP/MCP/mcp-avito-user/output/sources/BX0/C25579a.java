package bX0;

import I41.h;
import android.graphics.Bitmap;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BlurPostProcessor.java */
@Nullsafe
/* renamed from: bX0.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C25579a extends com.facebook.imagepipeline.request.a {
    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @h
    public final com.facebook.cache.common.c a() {
        return null;
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void d(Bitmap bitmap) {
        if (!bitmap.isMutable()) {
            throw new IllegalArgumentException();
        }
        if (!(((float) bitmap.getHeight()) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        if (!(((float) bitmap.getWidth()) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void e(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.getClass();
        throw null;
    }
}
