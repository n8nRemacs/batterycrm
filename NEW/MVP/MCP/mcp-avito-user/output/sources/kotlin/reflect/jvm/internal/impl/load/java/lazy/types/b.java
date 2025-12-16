package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Collections;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.B;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* compiled from: JavaTypeAttributes.kt */
@s0
/* loaded from: classes8.dex */
public final class b {
    public static a a(TypeUsage typeUsage, boolean z12, B b12, int i12) {
        boolean z13 = (i12 & 1) != 0 ? false : z12;
        boolean z14 = (i12 & 2) == 0;
        if ((i12 & 4) != 0) {
            b12 = null;
        }
        return new a(typeUsage, null, z14, z13, b12 != null ? Collections.singleton(b12) : null, null, 34, null);
    }
}
