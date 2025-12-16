package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;

/* compiled from: Atomic.kt */
@s0
@I0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/b;", "T", "Lkotlinx/coroutines/internal/S;", "<init>", "()V", "Lkotlinx/atomicfu/AtomicRef;", "", "_consensus", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43232b<T> extends S {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411892a = AtomicReferenceFieldUpdater.newUpdater(AbstractC43232b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C43231a.f411890a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.S
    @Y61.l
    public final Object a(@Y61.l Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411892a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        a0 a0Var = C43231a.f411890a;
        if (obj2 == a0Var) {
            Object objC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == a0Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, objC)) {
                        obj2 = objC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t12, @Y61.l Object obj);

    @Y61.l
    public abstract Object c(T t12);
}
