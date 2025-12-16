package androidx.compose.ui.input.pointer;

import androidx.compose.material3.Wf;
import androidx.compose.ui.v;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22340s f40198a = new C22340s(C42784z0.f406748b, null);

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.p f40199b;

        public a(Y41.p pVar) {
            this.f40199b = pVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof PointerInputEventHandler) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(getFunctionDelegate(), ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f40199b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(K k12, Continuation continuation) {
            return this.f40199b.invoke(k12, continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42830m
    public static final g0 a(Y41.p pVar) {
        g0 g0Var = new g0(null, null, null, c0.f40202b);
        g0Var.f40233s = (SuspendLambda) pVar;
        return g0Var;
    }

    @Y61.k
    public static final g0 b(@Y61.k PointerInputEventHandler pointerInputEventHandler) {
        return new g0(null, null, null, pointerInputEventHandler);
    }

    @InterfaceC42830m
    public static final androidx.compose.ui.v c(v.a aVar, Wf wf2, androidx.compose.foundation.interaction.m mVar, Y41.p pVar) {
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(wf2, mVar, null, new a(pVar), 4, null);
        aVar.getClass();
        return suspendPointerInputElement;
    }

    @Y61.k
    public static final androidx.compose.ui.v e(@Y61.k androidx.compose.ui.v vVar, @Y61.l Object obj, @Y61.k PointerInputEventHandler pointerInputEventHandler) {
        return vVar.d0(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }
}
