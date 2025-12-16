package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: Mutex.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class f extends H implements Y41.q<d, Object, Object, Object> {
    static {
        new f();
    }

    public f() {
        super(3, d.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // Y41.q
    public final Object invoke(d dVar, Object obj, Object obj2) {
        d dVar2 = dVar;
        dVar2.getClass();
        if (!L.f(obj2, j.f412268b)) {
            return dVar2;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }
}
