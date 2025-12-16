package androidx.compose.foundation;

import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.Metadata;

/* compiled from: Canvas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20835r0 {

    /* compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.r0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f30064l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> f30065m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f30066n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Y41.l lVar, androidx.compose.ui.v vVar) {
            super(2);
            this.f30064l = vVar;
            this.f30065m = lVar;
            this.f30066n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f30066n | 1);
            androidx.compose.ui.v vVar = this.f30064l;
            C20835r0.a(iA2, this.f30065m, a12, vVar);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, @Y61.k androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-932836462);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            C20608p2.a(bE2, androidx.compose.ui.draw.o.b(vVar, lVar));
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, lVar, vVar);
        }
    }
}
