package da1;

import android.os.Handler;
import android.os.Looper;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* renamed from: da1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39690b extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393915l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39690b(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar) {
        super(1);
        this.f393915l = mVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        int i12 = 9;
        new Handler(Looper.getMainLooper()).post(new com.vk.id.captcha.web.h(i12, this.f393915l, (aa1.f) obj));
        return G0.f406611a;
    }
}
