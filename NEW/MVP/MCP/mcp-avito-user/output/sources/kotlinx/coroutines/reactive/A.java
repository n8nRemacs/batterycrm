package kotlinx.coroutines.reactive;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReactiveFlow.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-reactive"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final h[] f411962a = (h[]) C43033p.D(C43033p.b(ServiceLoader.load(h.class, h.class.getClassLoader()).iterator())).toArray(new h[0]);

    @Y61.k
    public static final InterfaceC43160i a(@Y61.k AbstractC41777j abstractC41777j) {
        return new u(abstractC41777j, null, 0, null, 14, null);
    }
}
