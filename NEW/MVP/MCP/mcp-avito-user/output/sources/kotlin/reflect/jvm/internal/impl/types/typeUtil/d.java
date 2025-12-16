package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import Y41.l;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.types.C42980h0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.Q;
import u51.t;

/* compiled from: TypeUtils.kt */
/* loaded from: classes8.dex */
final class d extends N implements l<J0, Boolean> {
    static {
        new d();
    }

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(J0 j02) {
        J0 j03 = j02;
        return Boolean.valueOf((j03 instanceof C42980h0) || (j03.H0() instanceof t) || Q.a(j03));
    }
}
