package VU0;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV1InMemoryRepositoryBundle.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"beduin-v1-in-memory_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @k
    public static final c a(@k z zVar, @k m mVar, boolean z12) throws BeduinPropertyException {
        String strL = mVar.l(zVar, "storageKey");
        m.f336868b.getClass();
        A a12 = new A(m.f336869c, null, 2, null);
        if (z12) {
            a12 = mVar.m(zVar, AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS);
        }
        return new c(strL, a12);
    }
}
