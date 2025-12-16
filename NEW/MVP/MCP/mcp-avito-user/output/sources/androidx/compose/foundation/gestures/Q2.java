package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: UpdatableAnimationState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q2 extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N2 f27440l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, kotlin.G0> f27441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Q2(N2 n22, Y41.l<? super Float, kotlin.G0> lVar) {
        super(1);
        this.f27440l = n22;
        this.f27441m = lVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Long l12) {
        l12.longValue();
        N2 n22 = this.f27440l;
        float f12 = n22.f27390e;
        n22.f27390e = 0.0f;
        this.f27441m.invoke(Float.valueOf(f12));
        return kotlin.G0.f406611a;
    }
}
