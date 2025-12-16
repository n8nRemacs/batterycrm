package bX0;

import I41.h;
import android.graphics.Bitmap;
import com.facebook.cache.common.j;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: RoundedCornersPostprocessor.java */
@Nullsafe
/* renamed from: bX0.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C25583e extends com.facebook.imagepipeline.request.a {

    /* renamed from: c, reason: collision with root package name */
    @h
    public j f57112c;

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @h
    public final com.facebook.cache.common.c a() {
        if (this.f57112c == null) {
            this.f57112c = new j("RoundedCornersPostprocessor");
        }
        return this.f57112c;
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void d(Bitmap bitmap) {
        int iMin = Math.min(bitmap.getHeight(), bitmap.getWidth());
        NativeRoundingFilter.a(bitmap, iMin / 2, iMin / 3, iMin / 4, iMin / 5);
    }
}
