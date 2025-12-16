package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: Semaphore.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class n extends H implements Y41.p<Long, q, q> {

    /* renamed from: b, reason: collision with root package name */
    public static final n f412278b = new n();

    public n() {
        super(2, p.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // Y41.p
    public final q invoke(Long l12, q qVar) {
        int i12 = p.f412281a;
        return new q(l12.longValue(), qVar, 0);
    }
}
