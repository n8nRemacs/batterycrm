package androidx.compose.ui.layout;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class X0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f40424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f40425m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Z0, C22712b, InterfaceC22367j0> f40426n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f40427o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Y0 y02, androidx.compose.ui.v vVar, Y41.p pVar, int i12) {
        super(2);
        this.f40424l = y02;
        this.f40425m = vVar;
        this.f40426n = pVar;
        this.f40427o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f40427o | 1);
        Y41.p<Z0, C22712b, InterfaceC22367j0> pVar = this.f40426n;
        V0.b(this.f40424l, this.f40425m, pVar, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
