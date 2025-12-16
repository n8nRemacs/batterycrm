package kotlin.reflect;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: KClasses.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class e {
    @kotlin.internal.h
    @InterfaceC42733c0
    @Y61.k
    public static final void a(@Y61.k d dVar, @Y61.l Object obj) {
        if (dVar.n0(obj)) {
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.p0());
    }
}
