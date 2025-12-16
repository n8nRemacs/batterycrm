package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.e4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13601e4 {

    /* renamed from: Fc1.e4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f5486l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i12) {
            super(2);
            this.f5486l = str;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C13601e4.a(this.f5486l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(975248062);
        int i13 = (bE2.B(str) ? 4 : 2) | i12;
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            float f12 = 24;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C13698p2.a(str, androidx.compose.foundation.layout.R1.m(aVar, f12, f12, f12, 0.0f, 8), interfaceC13779y3.j(), interfaceC13779y3.h(), null, bE2, i13 & 14, 16);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(str, i12);
    }
}
