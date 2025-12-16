package L91;

import android.os.Handler;
import android.os.Looper;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class a extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9816l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar) {
        super(1);
        this.f9816l = nVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        new Handler(Looper.getMainLooper()).post(new J11.c(2, this.f9816l, (R91.b) obj));
        return G0.f406611a;
    }
}
