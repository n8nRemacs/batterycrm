package Za1;

import com.vk.push.core.base.AidlResult;
import com.vk.push.core.test.SendTestPushResult;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class z extends N implements Y41.p<AidlResult<?>, T11.a, Z<? extends SendTestPushResult>> {

    /* renamed from: l, reason: collision with root package name */
    public static final z f20263l = new z();

    public z() {
        super(2);
    }

    @Override // Y41.p
    public final Z<? extends SendTestPushResult> invoke(AidlResult<?> aidlResult, T11.a aVar) {
        return Z.a((SendTestPushResult) aidlResult.f367015b);
    }
}
