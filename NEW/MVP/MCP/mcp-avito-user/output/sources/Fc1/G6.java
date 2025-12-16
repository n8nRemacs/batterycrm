package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;

/* loaded from: classes9.dex */
public final class G6 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f4980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4981m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C13623h f4982n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C13623h, kotlin.G0> f4983o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(v.a aVar, boolean z12, C13623h c13623h, Y41.l lVar, int i12) {
        super(2);
        this.f4980l = aVar;
        this.f4981m = z12;
        this.f4982n = c13623h;
        this.f4983o = lVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        C13623h c13623h = this.f4982n;
        Y41.l<C13623h, kotlin.G0> lVar = this.f4983o;
        H6.a(this.f4980l, this.f4981m, c13623h, lVar, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
