package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/U0;", "Lkotlinx/coroutines/internal/E;", "Lkotlinx/coroutines/H0;", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/F0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class U0 extends kotlinx.coroutines.internal.E implements H0, InterfaceC43268o0, F0 {

    /* renamed from: e, reason: collision with root package name */
    public V0 f410722e;

    @Override // kotlinx.coroutines.F0
    @Y61.l
    /* renamed from: c */
    public final C43132e1 getList() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.E, kotlinx.coroutines.InterfaceC43268o0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V0 v02 = this.f410722e;
        if (v02 == null) {
            v02 = null;
        }
        while (true) {
            Object objJ0 = v02.j0();
            if (!(objJ0 instanceof U0)) {
                if (!(objJ0 instanceof F0) || ((F0) objJ0).getList() == null) {
                    return;
                }
                j();
                return;
            }
            if (objJ0 != this) {
                return;
            }
            C43273r0 c43273r0 = C43077a1.f410755g;
            do {
                atomicReferenceFieldUpdater = V0.f410723b;
                if (atomicReferenceFieldUpdater.compareAndSet(v02, objJ0, c43273r0)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(v02) == objJ0);
        }
    }

    @Override // kotlinx.coroutines.F0
    /* renamed from: isActive */
    public final boolean getF411961b() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.E
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(X.a(this));
        sb2.append("[job@");
        V0 v02 = this.f410722e;
        if (v02 == null) {
            v02 = null;
        }
        sb2.append(X.a(v02));
        sb2.append(']');
        return sb2.toString();
    }
}
