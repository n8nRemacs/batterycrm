package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;

/* loaded from: classes9.dex */
public final class M4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f5093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5094m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f5095n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5096o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(androidx.compose.ui.v vVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f5093l = vVar;
        this.f5094m = z12;
        this.f5095n = c22096n;
        this.f5096o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f5096o | 1);
        C22096n c22096n = this.f5095n;
        N4.a(this.f5093l, this.f5094m, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
