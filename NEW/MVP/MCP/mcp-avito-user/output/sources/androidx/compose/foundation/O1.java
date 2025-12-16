package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.runtime.C22032b0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* compiled from: Overscroll.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22032b0 f26808a = new C22032b0(a.f26809l);

    /* compiled from: Overscroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/P;", "Landroidx/compose/foundation/N1;", "invoke", "(Landroidx/compose/runtime/P;)Landroidx/compose/foundation/N1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.runtime.P, N1> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f26809l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final N1 invoke(androidx.compose.runtime.P p12) {
            androidx.compose.runtime.P p13 = p12;
            androidx.compose.foundation.layout.V1 v12 = C21088x.f32297b;
            Context context = (Context) p13.i(AndroidCompositionLocals_androidKt.f41069b);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) p13.i(androidx.compose.ui.platform.Q0.f41199h);
            K1 k12 = (K1) p13.i(L1.f26772a);
            if (k12 == null) {
                return null;
            }
            return new C20531j(context, dVar, k12.f26751a, k12.f26752b, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.M1 a(@Y61.l androidx.compose.runtime.A r3) {
        /*
            r0 = 282942128(0x10dd5ab0, float:8.7308856E-29)
            r3.C(r0)
            androidx.compose.runtime.b0 r0 = androidx.compose.foundation.O1.f26808a
            java.lang.Object r0 = r3.o(r0)
            androidx.compose.foundation.N1 r0 = (androidx.compose.foundation.N1) r0
            if (r0 != 0) goto L15
            r3.h()
            r3 = 0
            return r3
        L15:
            boolean r1 = r3.B(r0)
            java.lang.Object r2 = r3.t()
            if (r1 != 0) goto L28
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L2f
        L28:
            androidx.compose.foundation.h r2 = r0.a()
            r3.H(r2)
        L2f:
            androidx.compose.foundation.M1 r2 = (androidx.compose.foundation.M1) r2
            r3.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.O1.a(androidx.compose.runtime.A):androidx.compose.foundation.M1");
    }
}
