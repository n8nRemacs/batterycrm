package Ca1;

import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.view.SdkBioPassportFrame;

/* loaded from: classes9.dex */
public final class q extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrame f2273l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SdkBioPassportFrame sdkBioPassportFrame) {
        super(1);
        this.f2273l = sdkBioPassportFrame;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return Integer.valueOf((int) this.f2273l.f436559q.measureText((String) obj));
    }
}
