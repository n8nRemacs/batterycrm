package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.internal.C43243m;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/h0;", "T", "Lkotlinx/coroutines/internal/W;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.coroutines.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43226h0<T> extends kotlinx.coroutines.internal.W<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411856f = AtomicIntegerFieldUpdater.newUpdater(C43226h0.class, "_decision$volatile");

    @X41.f
    private volatile /* synthetic */ int _decision$volatile;

    public C43226h0() {
        throw null;
    }

    @Override // kotlinx.coroutines.internal.W, kotlinx.coroutines.V0
    public final void K(@Y61.l Object obj) {
        S(obj);
    }

    @Override // kotlinx.coroutines.internal.W, kotlinx.coroutines.V0
    public final void S(@Y61.l Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f411856f;
            int i12 = atomicIntegerFieldUpdater.get(this);
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C43243m.a(H.a(obj), IntrinsicsKt.intercepted(this.f411885e));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
