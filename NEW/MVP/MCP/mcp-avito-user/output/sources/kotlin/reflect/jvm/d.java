package kotlin.reflect.jvm;

import X41.i;
import Y61.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.T;
import kotlin.reflect.jvm.internal.X;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.r;
import kotlin.reflect.s;

/* compiled from: KTypesJvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final kotlin.reflect.d<?> a(@k kotlin.reflect.g gVar) {
        InterfaceC42851d interfaceC42851d;
        if (gVar instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) gVar;
        }
        if (!(gVar instanceof s)) {
            throw new X("Cannot calculate JVM erasure for type: " + gVar);
        }
        List<r> upperBounds = ((s) gVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC42853f interfaceC42853fB = ((T) ((r) next)).f407060b.H0().b();
            interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
            if (interfaceC42851d != null && interfaceC42851d.getKind() != ClassKind.f407414c && interfaceC42851d.getKind() != ClassKind.f407417f) {
                interfaceC42851d = next;
                break;
            }
        }
        r rVar = (r) interfaceC42851d;
        if (rVar == null) {
            rVar = (r) C42745f0.G(upperBounds);
        }
        return rVar != null ? b(rVar) : m0.f406844a.b(Object.class);
    }

    @k
    public static final kotlin.reflect.d<?> b(@k r rVar) {
        kotlin.reflect.g f406862b = rVar.getF406862b();
        if (f406862b != null) {
            return a(f406862b);
        }
        throw new X("Cannot calculate JVM erasure for type: " + rVar);
    }
}
