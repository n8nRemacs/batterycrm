package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;

/* loaded from: classes9.dex */
public final class M5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5097l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M5(int i12) {
        super(2);
        this.f5097l = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f5097l | 1);
        androidx.compose.runtime.B bE2 = a12.E(2048673146);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            R3.a(C13692o5.f5722a, bE2, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new M5(iA2);
        }
        return kotlin.G0.f406611a;
    }
}
