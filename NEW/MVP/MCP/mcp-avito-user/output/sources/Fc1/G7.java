package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;

/* loaded from: classes9.dex */
public final class G7 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W7 f4984l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4985m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G7(W7 w72, int i12) {
        super(2);
        this.f4984l = w72;
        this.f4985m = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f4985m | 1);
        W7 w72 = this.f4984l;
        androidx.compose.runtime.B bE2 = a12.E(1957546530);
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = w72.f5287h;
        N.a(gVar.indexOf(w72.f5288i), gVar, w72.f5289j, bE2, 64);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new G7(w72, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
