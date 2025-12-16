package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;

/* renamed from: Fc1.u3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13743u3 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f5848l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.g f5849m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f5850n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13743u3(InterfaceC22196w1 interfaceC22196w1, androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar, InterfaceC22204y1 interfaceC22204y1, int i12) {
        super(2);
        this.f5848l = interfaceC22196w1;
        this.f5849m = gVar;
        this.f5850n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(455);
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = this.f5849m;
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f5850n;
        C13752v3.a(this.f5848l, gVar, interfaceC22204y1, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
