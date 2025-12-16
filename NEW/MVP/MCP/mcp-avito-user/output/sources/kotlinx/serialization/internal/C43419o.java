package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.internal.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43419o {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f412899a;

    static {
        boolean z12;
        try {
            Class.forName("java.lang.ClassValue");
            z12 = true;
        } catch (Throwable unused) {
            z12 = false;
        }
        f412899a = z12;
    }

    @Y61.k
    public static final <T> Q0<T> a(@Y61.k Y41.l<? super kotlin.reflect.d<?>, ? extends KSerializer<T>> lVar) {
        return f412899a ? new C43426s(lVar) : new A(lVar);
    }

    @Y61.k
    public static final <T> B0<T> b(@Y61.k Y41.p<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.r>, ? extends KSerializer<T>> pVar) {
        return f412899a ? new C43430u(pVar) : new B(pVar);
    }
}
