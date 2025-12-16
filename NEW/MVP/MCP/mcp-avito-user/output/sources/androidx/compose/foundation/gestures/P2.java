package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20318t;
import kotlin.Metadata;

/* compiled from: UpdatableAnimationState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class P2 extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N2 f27431l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f27432m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, kotlin.G0> f27433n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P2(N2 n22, float f12, Y41.l<? super Float, kotlin.G0> lVar) {
        super(1);
        this.f27431l = n22;
        this.f27432m = f12;
        this.f27433n = lVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Long l12) {
        long jC2;
        long jLongValue = l12.longValue();
        N2 n22 = this.f27431l;
        if (n22.f27387b == Long.MIN_VALUE) {
            n22.f27387b = jLongValue;
        }
        C20318t c20318t = new C20318t(n22.f27390e);
        if (this.f27432m == 0.0f) {
            C20318t c20318t2 = new C20318t(n22.f27390e);
            N2.f27384f.getClass();
            jC2 = n22.f27386a.b(c20318t2, N2.f27385g, n22.f27388c);
        } else {
            jC2 = kotlin.math.b.c((jLongValue - n22.f27387b) / r4);
        }
        long j12 = jC2;
        N2.f27384f.getClass();
        C20318t c20318t3 = N2.f27385g;
        float f12 = ((C20318t) n22.f27386a.e(j12, c20318t, c20318t3, n22.f27388c)).f26403a;
        n22.f27388c = (C20318t) n22.f27386a.c(j12, c20318t, c20318t3, n22.f27388c);
        n22.f27387b = jLongValue;
        float f13 = n22.f27390e - f12;
        n22.f27390e = f12;
        this.f27433n.invoke(Float.valueOf(f13));
        return kotlin.G0.f406611a;
    }
}
