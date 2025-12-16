package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.X;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0010¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/scheduling/j;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public abstract class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public long f412174b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public k f412175c;

    public j(long j12, @Y61.k k kVar) {
        this.f412174b = j12;
        this.f412175c = kVar;
    }

    public j() {
        this(0L, n.f412184g);
    }
}
