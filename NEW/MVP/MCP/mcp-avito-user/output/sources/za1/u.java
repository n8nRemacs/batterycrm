package Za1;

import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.RegisterForPushesResult;
import kotlin.Z;
import kotlin.jvm.internal.N;
import pb1.C47049a;

/* loaded from: classes9.dex */
public final class u extends N implements Y41.p<AidlResult<?>, T11.a, Z<? extends C47049a>> {

    /* renamed from: l, reason: collision with root package name */
    public static final u f20256l = new u();

    public u() {
        super(2);
    }

    @Override // Y41.p
    public final Z<? extends C47049a> invoke(AidlResult<?> aidlResult, T11.a aVar) {
        return Z.a(new C47049a((RegisterForPushesResult) aidlResult.f367015b, aVar));
    }
}
