package L91;

import android.graphics.Rect;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9830l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar) {
        super(1);
        this.f9830l = nVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
        ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9830l;
        nVar.f5();
        if (z.ke() == ru.mts.biometry.sdk.feature.document.ml.c.f436445b) {
            rect.top -= rect.height() / 2;
            rect.bottom = (rect.height() / 6) + rect.bottom;
        }
        nVar.getClass();
        R91.j jVarE5 = nVar.e5();
        jVarE5.getClass();
        jVarE5.f14153l = rect;
        jVarE5.f14146e.getClass();
        return G0.f406611a;
    }
}
