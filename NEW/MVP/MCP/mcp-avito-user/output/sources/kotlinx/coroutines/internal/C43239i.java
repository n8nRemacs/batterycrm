package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43239i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Collection<kotlinx.coroutines.N> f411909a = C43033p.D(C43033p.b(ServiceLoader.load(kotlinx.coroutines.N.class, kotlinx.coroutines.N.class.getClassLoader()).iterator()));
}
