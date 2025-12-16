package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Executors.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/m1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class m1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43315z0 f411949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f411950c;

    public m1(@Y61.k C43315z0 c43315z0, @Y61.k r rVar) {
        this.f411949b = c43315z0;
        this.f411950c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f411950c.B(this.f411949b, kotlin.G0.f406611a);
    }
}
