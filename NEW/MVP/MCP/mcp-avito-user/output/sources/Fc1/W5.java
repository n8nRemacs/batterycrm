package Fc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;

/* loaded from: classes9.dex */
public final class W5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22096n f5281a = new C22096n(630209513, a.f5282l, false);

    @kotlin.jvm.internal.s0
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f5282l = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            String str;
            androidx.compose.ui.v vVarD;
            D2 d2C;
            N7 n7H;
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                I6 i62 = (I6) a13.o(S3.f5172a);
                InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) a13.o(C13707q2.f5762a);
                C13709q4 c13709q4 = (C13709q4) a13.o(C13767x0.f5879a);
                int iOrdinal = i62.d().ordinal();
                if (iOrdinal == 0) {
                    a13.I(-423868241);
                    String value = i62.getValue();
                    str = value != null ? value : "";
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    vVarD = C20588k2.d(androidx.compose.foundation.layout.R1.m(androidx.compose.ui.v.f42878y1, 6, 0.0f, 0.0f, 24, 6), 1.0f);
                    d2C = interfaceC13779y3.c();
                    n7H = interfaceC13779y3.h();
                } else if (iOrdinal != 1) {
                    a13.I(-423867313);
                    a13.O();
                } else {
                    a13.I(-423867768);
                    String value2 = i62.getValue();
                    str = value2 != null ? value2 : "";
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    vVarD = C20588k2.d(androidx.compose.foundation.layout.R1.m(androidx.compose.ui.v.f42878y1, 6, 0.0f, 0.0f, 24, 6), 1.0f);
                    d2C = interfaceC13779y3.j();
                    n7H = interfaceC13779y3.n();
                }
                V2.a(str, vVarD, d2C, n7H, interfaceC13779y3.y(), c13709q4.f5768b, a13, 0);
                a13.O();
            }
            return kotlin.G0.f406611a;
        }
    }
}
