package mb1;

import Y61.k;
import Y61.l;
import java.util.UUID;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import nb1.C44374a;

/* loaded from: classes9.dex */
public final class e implements InterfaceC44046a {
    @Override // mb1.InterfaceC44046a
    @l
    public final Object c(@k String str, @k ContinuationImpl continuationImpl) {
        int i12 = Z.f406624c;
        return G0.f406611a;
    }

    @Override // mb1.InterfaceC44046a
    @l
    public final Object d(@k String str, @l W11.a aVar, @k Continuation<? super Z<C44374a>> continuation) {
        int i12 = Z.f406624c;
        return new C44374a(UUID.randomUUID().toString());
    }
}
