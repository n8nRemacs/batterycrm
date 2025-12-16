package Xa1;

import Y41.p;
import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.base.AidlResult;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class d extends N implements p<AidlResult<?>, T11.a, Z<? extends String>> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f18937l = new d();

    public d() {
        super(2);
    }

    @Override // Y41.p
    public final Z<? extends String> invoke(AidlResult<?> aidlResult, T11.a aVar) {
        return Z.a(((AuthTokenResult) aidlResult.f367015b).f367003b);
    }
}
