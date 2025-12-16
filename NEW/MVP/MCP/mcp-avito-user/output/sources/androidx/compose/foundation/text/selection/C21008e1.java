package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Q2;
import androidx.compose.ui.text.input.C22636b;
import androidx.compose.ui.text.input.InterfaceC22645k;
import androidx.compose.ui.text.input.L;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextPreparedSelection.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/e1;", "Landroidx/compose/foundation/text/selection/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21008e1 extends AbstractC21016i<C21008e1> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.W f31976h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Q2 f31977i;

    public C21008e1(@Y61.k androidx.compose.ui.text.input.W w12, @Y61.k androidx.compose.ui.text.input.L l12, @Y61.l Q2 q22, @Y61.k C1 c12) {
        super(w12.f42383a, w12.f42384b, q22 != null ? q22.f30513a : null, l12, c12, null);
        this.f31976h = w12;
        this.f31977i = q22;
    }

    @Y61.l
    public final List<InterfaceC22645k> n(@Y61.k Y41.l<? super C21008e1, ? extends InterfaceC22645k> lVar) {
        if (!androidx.compose.ui.text.v0.d(this.f32038f)) {
            return C42745f0.U(new C22636b("", 0), new androidx.compose.ui.text.input.V(androidx.compose.ui.text.v0.g(this.f32038f), androidx.compose.ui.text.v0.g(this.f32038f)));
        }
        InterfaceC22645k interfaceC22645kInvoke = lVar.invoke(this);
        if (interfaceC22645kInvoke != null) {
            return Collections.singletonList(interfaceC22645kInvoke);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(androidx.compose.foundation.text.Q2 r8, int r9) {
        /*
            r7 = this;
            androidx.compose.ui.layout.A r0 = r8.f30514b
            if (r0 == 0) goto L11
            androidx.compose.ui.layout.A r1 = r8.f30515c
            if (r1 == 0) goto Le
            r2 = 1
            l0.j r0 = r1.P(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L18
        L11:
            l0.j$a r0 = l0.j.f413388e
            r0.getClass()
            l0.j r0 = l0.j.f413389f
        L18:
            androidx.compose.ui.text.input.W r1 = r7.f31976h
            long r1 = r1.f42384b
            androidx.compose.ui.text.v0$a r3 = androidx.compose.ui.text.v0.f42734b
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            androidx.compose.ui.text.input.L r2 = r7.f32036d
            int r1 = r2.b(r1)
            androidx.compose.ui.text.o0 r8 = r8.f30513a
            l0.j r1 = r8.c(r1)
            long r5 = r0.g()
            long r5 = r5 & r3
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r9 = (float) r9
            float r0 = r0 * r9
            float r9 = r1.f413391b
            float r0 = r0 + r9
            float r9 = r1.f413390a
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r5 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r9
            r9 = 32
            long r5 = r5 << r9
            long r0 = r0 & r3
            long r0 = r0 | r5
            l0.g$a r9 = l0.g.f413384b
            androidx.compose.ui.text.G r8 = r8.f42527b
            int r8 = r8.g(r0)
            int r8 = r2.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C21008e1.o(androidx.compose.foundation.text.Q2, int):int");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21008e1(androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12, Q2 q22, C1 c12, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            androidx.compose.ui.text.input.L.f42358a.getClass();
            l12 = L.a.f42360b;
        }
        this(w12, l12, q22, (i12 & 8) != 0 ? new C1() : c12);
    }
}
