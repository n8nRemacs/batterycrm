package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes8.dex */
public final class r implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final r f408543a = new r();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.t
    @Y61.k
    public final O a(@Y61.k ProtoBuf.Type type, @Y61.k String str, @Y61.k Y y12, @Y61.k Y y13) {
        return !str.equals("kotlin.jvm.PlatformType") ? kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410162n, str, y12.toString(), y13.toString()) : type.k(JvmProtoBuf.f409151g) ? new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i(y12, y13, 0) : P.c(y12, y13);
    }
}
