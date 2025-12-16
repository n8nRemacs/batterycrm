package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Ib extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Float f32787l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32788m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f32789n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ib(long j12, Y41.p pVar, Float f12) {
        super(2);
        this.f32787l = f12;
        this.f32788m = pVar;
        this.f32789n = j12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f32788m;
            Float f12 = this.f32787l;
            if (f12 != null) {
                a13.C(-1177895124);
                androidx.compose.runtime.S.a(C21427z2.f34423a.b(f12), pVar, a13, 8);
                a13.h();
            } else {
                a13.C(-1177696538);
                androidx.compose.runtime.S.a(C21427z2.f34423a.b(Float.valueOf(androidx.compose.ui.graphics.T.e(this.f32789n))), pVar, a13, 8);
                a13.h();
            }
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
