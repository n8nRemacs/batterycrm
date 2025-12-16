package ha1;

import android.os.Handler;
import android.os.Looper;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class j extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.p f397243l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar) {
        super(1);
        this.f397243l = pVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        new Handler(Looper.getMainLooper()).post(new com.vk.id.captcha.web.h(20, this.f397243l, (R91.b) obj));
        return G0.f406611a;
    }
}
