package androidx.view;

import X41.f;
import Y61.k;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;

/* compiled from: PausingDispatcher.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "Lkotlinx/coroutines/M;", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23044j0 extends M {

    /* renamed from: c, reason: collision with root package name */
    @f
    @k
    public final C23061s f46807c = new C23061s();

    @Override // kotlinx.coroutines.M
    public final void h(@k CoroutineContext coroutineContext, @k Runnable runnable) {
        C23061s c23061s = this.f46807c;
        c23061s.getClass();
        c cVar = C43262l0.f411945a;
        AbstractC43129d1 abstractC43129d1Y = K.f411877a.y();
        if (!abstractC43129d1Y.p(coroutineContext)) {
            if (!(c23061s.f46882b || !c23061s.f46881a)) {
                if (!c23061s.f46884d.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                c23061s.a();
                return;
            }
        }
        abstractC43129d1Y.h(coroutineContext, new J11.c(8, c23061s, runnable));
    }

    @Override // kotlinx.coroutines.M
    public final boolean p(@k CoroutineContext coroutineContext) {
        c cVar = C43262l0.f411945a;
        if (K.f411877a.y().p(coroutineContext)) {
            return true;
        }
        C23061s c23061s = this.f46807c;
        return !(c23061s.f46882b || !c23061s.f46881a);
    }
}
