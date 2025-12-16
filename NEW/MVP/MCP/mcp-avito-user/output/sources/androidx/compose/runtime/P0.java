package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Latch.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class P0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f38092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f38093m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(Q0 q02, kotlinx.coroutines.r rVar) {
        super(1);
        this.f38092l = q02;
        this.f38093m = rVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        Q0 q02 = this.f38092l;
        Object obj = q02.f38096a;
        kotlinx.coroutines.r rVar = this.f38093m;
        synchronized (obj) {
            q02.f38097b.remove(rVar);
        }
        return kotlin.G0.f406611a;
    }
}
