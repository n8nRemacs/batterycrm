package Fc1;

import android.graphics.Bitmap;
import android.widget.ImageView;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.f6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13612f6 extends com.android.volley.toolbox.w {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.r f5507t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Object f5508u;

    public C13612f6(@Y61.k String str, @Y61.k kotlinx.coroutines.r rVar) {
        super(str, null, ImageView.ScaleType.FIT_CENTER, Bitmap.Config.RGB_565, new C13670m1(rVar, 1));
        this.f5507t = rVar;
        this.f5508u = new Object();
    }

    @Override // com.android.volley.toolbox.w, com.android.volley.Request
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void c(@Y61.k Bitmap bitmap) {
        kotlinx.coroutines.r rVar;
        synchronized (this.f5508u) {
            rVar = this.f5507t;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        int i12 = kotlin.Z.f406624c;
        rVar.resumeWith(bitmap);
    }
}
