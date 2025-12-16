package ha1;

import android.graphics.Rect;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class l extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.p f397245l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar) {
        super(1);
        this.f397245l = pVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar = this.f397245l;
        pVar.i5();
        if (w.ke() == ru.mts.biometry.sdk.feature.document.ml.c.f436445b) {
            rect.top -= rect.height() / 2;
            rect.bottom = (rect.height() / 6) + rect.bottom;
        }
        pVar.getClass();
        R91.j jVarJ5 = pVar.j5();
        jVarJ5.getClass();
        jVarJ5.f14153l = rect;
        jVarJ5.f14146e.getClass();
        return G0.f406611a;
    }
}
