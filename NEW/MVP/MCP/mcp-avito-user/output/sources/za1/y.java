package Za1;

import com.vk.push.core.test.TestPushPayload;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class y extends N implements Y41.p<com.vk.push.core.test.a, com.vk.push.core.base.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f20261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TestPushPayload f20262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, TestPushPayload testPushPayload) {
        super(2);
        this.f20261l = str;
        this.f20262m = testPushPayload;
    }

    @Override // Y41.p
    public final G0 invoke(com.vk.push.core.test.a aVar, com.vk.push.core.base.a aVar2) {
        aVar.u1(this.f20261l, this.f20262m, aVar2);
        return G0.f406611a;
    }
}
