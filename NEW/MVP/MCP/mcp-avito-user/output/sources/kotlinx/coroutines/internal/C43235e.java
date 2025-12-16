package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConcurrentLinkedList.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "Lkotlin/S;", "name", "cur", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILY41/l;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43235e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a0 f411894a = new a0("CLOSED");

    @Y61.k
    public static final <S extends X<S>> Object a(@Y61.k S s5, long j12, @Y61.k Y41.p<? super Long, ? super S, ? extends S> pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (s5.f411887d >= j12 && !s5.d()) {
                return s5;
            }
            Object obj = AbstractC43236f.f411896b.get(s5);
            a0 a0Var = f411894a;
            if (obj == a0Var) {
                return a0Var;
            }
            S sInvoke = (S) ((AbstractC43236f) obj);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s5.f411887d + 1), s5);
                do {
                    atomicReferenceFieldUpdater = AbstractC43236f.f411896b;
                    if (atomicReferenceFieldUpdater.compareAndSet(s5, null, sInvoke)) {
                        if (s5.d()) {
                            s5.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(s5) == null);
            }
            s5 = sInvoke;
        }
    }
}
