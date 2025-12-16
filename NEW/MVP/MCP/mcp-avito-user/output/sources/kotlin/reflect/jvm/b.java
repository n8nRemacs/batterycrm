package kotlin.reflect.jvm;

import X41.i;
import Y61.k;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.jvm.internal.i0;

/* compiled from: KCallablesJvm.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.C] */
    public static final boolean a(@k N n12) {
        Field field;
        if (n12 instanceof j) {
            N<?> nC2 = i0.c(n12);
            field = nC2 != null ? (Field) nC2.f407042l.getValue() : null;
            if (!(field != null ? field.isAccessible() : true)) {
                return false;
            }
            Method methodB = e.b(n12.getGetter());
            if (!(methodB != null ? methodB.isAccessible() : true)) {
                return false;
            }
            Method methodB2 = e.b(((j) n12).c());
            if (!(methodB2 != null ? methodB2.isAccessible() : true)) {
                return false;
            }
        } else {
            N<?> nC3 = i0.c(n12);
            field = nC3 != null ? (Field) nC3.f407042l.getValue() : null;
            if (!(field != null ? field.isAccessible() : true)) {
                return false;
            }
            Method methodB3 = e.b(n12.getGetter());
            if (!(methodB3 != null ? methodB3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
