package bX0;

import I41.h;
import android.graphics.Bitmap;
import com.facebook.cache.common.j;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: RoundAsCirclePostprocessor.java */
@Nullsafe
/* renamed from: bX0.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C25581c extends com.facebook.imagepipeline.request.a {

    /* renamed from: c, reason: collision with root package name */
    @h
    public j f57108c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57109d = true;

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.d
    @h
    public final com.facebook.cache.common.c a() {
        if (this.f57108c == null) {
            if (this.f57109d) {
                this.f57108c = new j("RoundAsCirclePostprocessor#AntiAliased");
            } else {
                this.f57108c = new j("RoundAsCirclePostprocessor");
            }
        }
        return this.f57108c;
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void d(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, this.f57109d);
    }
}
