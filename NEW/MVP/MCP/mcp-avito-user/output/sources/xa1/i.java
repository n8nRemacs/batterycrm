package Xa1;

import Y41.p;
import com.vk.push.core.auth.AuthorizedResult;
import com.vk.push.core.base.AidlResult;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class i extends N implements p<AidlResult<?>, T11.a, Z<? extends Boolean>> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f18944l = new i();

    public i() {
        super(2);
    }

    @Override // Y41.p
    public final Z<? extends Boolean> invoke(AidlResult<?> aidlResult, T11.a aVar) {
        AuthorizedResult authorizedResult = (AuthorizedResult) aidlResult.f367015b;
        int i12 = Z.f406624c;
        return Z.a(Boolean.valueOf(authorizedResult.f367004b));
    }
}
