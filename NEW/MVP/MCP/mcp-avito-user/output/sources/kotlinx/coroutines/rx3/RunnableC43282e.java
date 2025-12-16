package kotlinx.coroutines.rx3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: Runnable.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "kotlinx/coroutines/n1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlinx.coroutines.rx3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43282e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43280c f412088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f412089c;

    public RunnableC43282e(C43280c c43280c, Y41.l lVar) {
        this.f412088b = c43280c;
        this.f412089c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = C43280c.f412079d;
        this.f412088b.getClass();
        C43259k.d(null, null, null, new C43281d(this.f412089c, null), 3);
    }
}
