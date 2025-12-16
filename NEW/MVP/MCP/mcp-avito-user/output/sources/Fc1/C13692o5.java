package Fc1;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;

/* renamed from: Fc1.o5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13692o5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22096n f5722a = new C22096n(790624531, a.f5723l, false);

    @kotlin.jvm.internal.s0
    /* renamed from: Fc1.o5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f5723l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C13614g c13614gA = ((I6) a13.o(S3.f5172a)).a();
                String str = c13614gA != null ? c13614gA.f5511a : null;
                if (str != null) {
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    float f12 = 56;
                    androidx.compose.ui.v vVarF = C20588k2.f(C20588k2.t(androidx.compose.foundation.layout.R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 0.0f, 0.0f, 24, 7), f12), f12);
                    kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                    C13705q0.a(str, "", vVarF, null, null, a13, 384, 504);
                }
            }
            return kotlin.G0.f406611a;
        }
    }
}
