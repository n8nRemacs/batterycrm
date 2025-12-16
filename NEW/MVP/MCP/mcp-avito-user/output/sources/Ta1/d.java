package ta1;

import Y41.l;
import android.os.Handler;
import android.os.Looper;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class d extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439285l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar) {
        super(1);
        this.f439285l = iVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        int i12 = 17;
        new Handler(Looper.getMainLooper()).post(new D.b(i12, this.f439285l, ((Boolean) obj).booleanValue()));
        return G0.f406611a;
    }
}
