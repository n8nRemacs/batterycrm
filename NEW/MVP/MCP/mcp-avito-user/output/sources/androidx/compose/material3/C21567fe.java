package androidx.compose.material3;

import Q.a;
import X.C16662s5;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SegmentedButton.kt */
@InterfaceC21537e7
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/fe;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21567fe {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C21567fe f36343a = new C21567fe();

    /* renamed from: b, reason: collision with root package name */
    public static final float f36344b;

    /* compiled from: SegmentedButton.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.fe$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(7);
            C21567fe.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    static {
        d0.O.f393198a.getClass();
        float f12 = d0.O.f393199b;
        f36344b = d0.O.f393200c;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1273041460);
        if ((i12 & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            int i13 = a.b.f13394a;
            C22293d c22293dD = C16662s5.f18100a;
            if (c22293dD == null) {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                C22293d.a aVar2 = new C22293d.a("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                C42784z0 c42784z0 = androidx.compose.ui.graphics.vector.U.f39811a;
                androidx.compose.ui.graphics.T.f39320b.getClass();
                androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(androidx.compose.ui.graphics.T.f39321c, null);
                androidx.compose.ui.graphics.m1.f39698b.getClass();
                androidx.compose.ui.graphics.n1.f39707b.getClass();
                int i14 = androidx.compose.ui.graphics.n1.f39709d;
                C22295f c22295f = new C22295f();
                c22295f.j(9.0f, 16.17f);
                c22295f.h(4.83f, 12.0f);
                c22295f.i(-1.42f, 1.41f);
                c22295f.h(9.0f, 19.0f);
                c22295f.h(21.0f, 7.0f);
                c22295f.i(-1.41f, -1.41f);
                c22295f.c();
                C22293d.a.c(aVar2, c22295f.f39885a, 0, k1Var, 1.0f, null, 1.0f, 1.0f, 0, i14, 1.0f, 14336);
                c22293dD = aVar2.d();
                C16662s5.f18100a = c22293dD;
            }
            C21991y8.b(c22293dD, null, C20588k2.o(androidx.compose.ui.v.f42878y1, f36344b), 0L, bE2, 48, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12);
        }
    }
}
