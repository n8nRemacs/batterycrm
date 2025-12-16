package androidx.compose.material;

import androidx.compose.runtime.C22143q0;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Jb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f32808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Float f32809m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32810n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jb(long j12, Y41.p pVar, Float f12) {
        super(2);
        this.f32808l = j12;
        this.f32809m = f12;
        this.f32810n = pVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22143q0 c22143q0 = A2.f32335a;
            long j12 = this.f32808l;
            androidx.compose.runtime.S.a(c22143q0.b(androidx.compose.ui.graphics.T.a(j12)), androidx.compose.runtime.internal.r.c(-1132188434, new Ib(j12, this.f32810n, this.f32809m), a13), a13, 56);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
