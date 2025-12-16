package kotlinx.coroutines.internal;

import defpackage.hwd;
import defpackage.o7g;
import defpackage.sm6;
import defpackage.v74;
import defpackage.x74;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lx74;", "context", "", "threadContextElements", "(Lx74;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Lx74;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Lqqg;", "restoreThreadContext", "(Lx74;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlin/Function2;", "Lv74;", "countAll", "Lsm6;", "Lo7g;", "findOne", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final sm6 countAll = new hwd(6);
    private static final sm6 findOne = new hwd(7);
    private static final sm6 updateState = new a();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, v74 v74Var) {
        if (!(v74Var instanceof o7g)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? v74Var : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o7g findOne$lambda$1(o7g o7gVar, v74 v74Var) {
        if (o7gVar != null) {
            return o7gVar;
        }
        if (v74Var instanceof o7g) {
            return (o7g) v74Var;
        }
        return null;
    }

    public static final void restoreThreadContext(x74 x74Var, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(x74Var);
        } else {
            ((o7g) x74Var.fold(null, findOne)).restoreThreadContext(x74Var, obj);
        }
    }

    public static final Object threadContextElements(x74 x74Var) {
        return x74Var.fold(0, countAll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, v74 v74Var) {
        if (v74Var instanceof o7g) {
            o7g o7gVar = (o7g) v74Var;
            threadState.append(o7gVar, o7gVar.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(x74 x74Var, Object obj) {
        if (obj == null) {
            obj = threadContextElements(x74Var);
        }
        return obj == 0 ? NO_THREAD_ELEMENTS : obj instanceof Integer ? x74Var.fold(new ThreadState(x74Var, ((Number) obj).intValue()), updateState) : ((o7g) obj).updateThreadContext(x74Var);
    }
}
