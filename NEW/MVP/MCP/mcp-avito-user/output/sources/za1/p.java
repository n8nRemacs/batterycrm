package Za1;

import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.base.AidlResult;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class p extends N implements Y41.p<AidlResult<?>, T11.a, Z<? extends String>> {

    /* renamed from: l, reason: collision with root package name */
    public static final p f20249l = new p();

    public p() {
        super(2);
    }

    @Override // Y41.p
    public final Z<? extends String> invoke(AidlResult<?> aidlResult, T11.a aVar) {
        AuthTokenResult authTokenResult = (AuthTokenResult) aidlResult.f367015b;
        int i12 = Z.f406624c;
        return Z.a(authTokenResult.f367003b);
    }
}
