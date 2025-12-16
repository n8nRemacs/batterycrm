package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f0 {
    public static final String a(Method method) {
        return method.getName() + C42756l.P(method.getParameterTypes(), "", "(", ")", e0.f407152l, 24) + C42892d.b(method.getReturnType());
    }
}
