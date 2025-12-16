package kotlinx.coroutines.rx3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: RxObservable.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class G extends kotlin.jvm.internal.H implements Y41.q<I<?>, Object, Object, Object> {
    static {
        new G();
    }

    public G() {
        super(3, I.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // Y41.q
    public final Object invoke(I<?> i12, Object obj, Object obj2) {
        I<?> i13 = i12;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I.f412048g;
        IllegalStateException illegalStateExceptionF0 = i13.F0(obj);
        if (illegalStateExceptionF0 == null) {
            return i13;
        }
        throw illegalStateExceptionF0;
    }
}
