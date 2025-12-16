package Fc1;

import androidx.compose.runtime.C22039c2;

/* renamed from: Fc1.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13730t extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W7 f5826l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13730t(W7 w72) {
        super(2);
        this.f5826l = w72;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            int i12 = W7.f5285l;
            W7 w72 = this.f5826l;
            androidx.compose.runtime.B bE2 = a13.E(1957546530);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = w72.f5287h;
            N.a(gVar.indexOf(w72.f5288i), gVar, w72.f5289j, bE2, 64);
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new G7(w72, 8);
            }
        }
        return kotlin.G0.f406611a;
    }
}
