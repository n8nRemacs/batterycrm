package Ca1;

import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.view.SdkBioSelfieFrame;

/* loaded from: classes9.dex */
public final class B extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SdkBioSelfieFrame f2251l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(SdkBioSelfieFrame sdkBioSelfieFrame) {
        super(1);
        this.f2251l = sdkBioSelfieFrame;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return Integer.valueOf((int) this.f2251l.f436578g.measureText((String) obj));
    }
}
