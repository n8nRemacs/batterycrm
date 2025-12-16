package FE0;

import Y61.k;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.resource.bitmap.AbstractC36364h;
import com.google.android.renderscript.Toolkit;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: BlurTransformation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFE0/a;", "Lcom/bumptech/glide/load/resource/bitmap/h;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC36364h {

    /* renamed from: b, reason: collision with root package name */
    public int f4652b;

    @Override // com.bumptech.glide.load.h
    public final void b(@k MessageDigest messageDigest) {
        messageDigest.update("blur transformation".getBytes(C43047d.f410589b));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC36364h
    @k
    public final Bitmap c(@k e eVar, @k Bitmap bitmap, int i12, int i13) {
        return Toolkit.a(Toolkit.f358945a, bitmap, this.f4652b);
    }
}
