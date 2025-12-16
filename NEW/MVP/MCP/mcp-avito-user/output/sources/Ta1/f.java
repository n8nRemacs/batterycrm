package ta1;

import Y41.l;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.G0;
import kotlin.jvm.internal.N;
import z91.s;

/* loaded from: classes9.dex */
public final class f extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar) {
        super(1);
        this.f439287l = iVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C91.a aVar = C91.a.f2014a;
            ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar = this.f439287l;
            iVar.getClass();
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            C91.a.f2015b = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            iVar.requireContext();
            s sVar = z91.e.f443908b;
            if (sVar == null) {
                throw new IllegalArgumentException("DI delegate is null");
            }
            W91.h hVarB = sVar.b();
            ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g.f436527i0.getClass();
            Aa1.b.a(hVarB, new ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g());
        }
        return G0.f406611a;
    }
}
