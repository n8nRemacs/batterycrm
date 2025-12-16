package L91;

import android.graphics.Bitmap;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class d extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar) {
        super(1);
        this.f9819l = nVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
        ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9819l;
        z zVarF5 = nVar.f5();
        if (bitmap != null) {
            zVarF5.le(bitmap, nVar.requireContext());
        }
        return G0.f406611a;
    }
}
