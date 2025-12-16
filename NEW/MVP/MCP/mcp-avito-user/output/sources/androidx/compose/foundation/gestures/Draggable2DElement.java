package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Draggable2D.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/gestures/R0;", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Draggable2DElement extends AbstractC22430p0<R0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<androidx.compose.ui.input.pointer.C, Boolean> f27218b;

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "", "invoke", "(Landroidx/compose/ui/input/pointer/C;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27219l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.pointer.C c12) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Draggable2D.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f27218b = a.f27219l;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new R0(f27218b, false, null, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        R0 r02 = (R0) dVar;
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = f27218b;
        r02.getClass();
        r02.v2(lVar, false, null, null, !kotlin.jvm.internal.L.f(null, null));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
