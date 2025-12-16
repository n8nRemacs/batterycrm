package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.sync.d;

/* compiled from: Mutex.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class c extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f412254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d.a f412255m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d.a aVar) {
        super(1);
        this.f412254l = dVar;
        this.f412255m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f412256h;
        this.f412255m.getClass();
        d dVar = this.f412254l;
        atomicReferenceFieldUpdater.set(dVar, null);
        dVar.d(null);
        return G0.f406611a;
    }
}
