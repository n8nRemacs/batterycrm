package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/J1;", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J1 f27300a = new J1();

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/J1$a;", "Landroidx/compose/foundation/M1;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements androidx.compose.foundation.M1 {

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/J1$a$a", "Landroidx/compose/ui/v$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.J1$a$a, reason: collision with other inner class name */
        public static final class C1570a extends v.d {
        }

        static {
            new a();
        }

        @Override // androidx.compose.foundation.M1
        @Y61.k
        public final InterfaceC22419k N() {
            return new C1570a();
        }

        @Override // androidx.compose.foundation.M1
        public final boolean O() {
            return false;
        }

        @Override // androidx.compose.foundation.M1
        @Y61.l
        public final Object P(long j12, @Y61.k Y41.p<? super androidx.compose.ui.unit.B, ? super Continuation<? super androidx.compose.ui.unit.B>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
            Object objInvoke = pVar.invoke(androidx.compose.ui.unit.B.a(j12), continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
        }

        @Override // androidx.compose.foundation.M1
        public final long Q(long j12, int i12, @Y61.k Y41.l<? super l0.g, l0.g> lVar) {
            return lVar.invoke(l0.g.a(j12)).f413387a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.compose.foundation.gestures.T a(@Y61.l androidx.compose.runtime.A r4) {
        /*
            androidx.compose.animation.core.H r0 = androidx.compose.animation.x2.a(r4)
            boolean r1 = r4.B(r0)
            java.lang.Object r2 = r4.t()
            if (r1 != 0) goto L17
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L21
        L17:
            androidx.compose.foundation.gestures.T r2 = new androidx.compose.foundation.gestures.T
            r1 = 2
            r3 = 0
            r2.<init>(r0, r3, r1, r3)
            r4.H(r2)
        L21:
            androidx.compose.foundation.gestures.T r2 = (androidx.compose.foundation.gestures.T) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.J1.a(androidx.compose.runtime.A):androidx.compose.foundation.gestures.T");
    }
}
