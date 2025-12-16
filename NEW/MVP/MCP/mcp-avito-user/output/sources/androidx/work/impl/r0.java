package androidx.work.impl;

import com.google.common.util.concurrent.D0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WorkerWrapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class r0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.work.F f55918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0<Object> f55919m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.work.F f12, D0<Object> d02) {
        super(1);
        this.f55918l = f12;
        this.f55919m = d02;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        if (th3 instanceof WorkerStoppedException) {
            this.f55918l.stop(((WorkerStoppedException) th3).f55553b);
        }
        this.f55919m.cancel(false);
        return G0.f406611a;
    }
}
