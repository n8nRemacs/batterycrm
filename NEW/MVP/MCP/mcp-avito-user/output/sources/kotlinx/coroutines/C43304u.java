package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/u;", "Lkotlinx/coroutines/E;", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43304u extends E {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412297c = AtomicIntegerFieldUpdater.newUpdater(C43304u.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C43304u(@Y61.k r rVar, @Y61.l Throwable th2, boolean z12) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + rVar + " was cancelled normally");
        }
        super(th2, z12);
        this._resumed$volatile = 0;
    }
}
