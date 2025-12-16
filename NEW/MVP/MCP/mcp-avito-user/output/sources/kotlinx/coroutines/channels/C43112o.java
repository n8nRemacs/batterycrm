package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final /* synthetic */ class C43112o extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, Object, Object, Object> {
    static {
        new C43112o();
    }

    public C43112o() {
        super(3, C43108m.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // Y41.q
    public final Object invoke(C43108m<?> c43108m, Object obj, Object obj2) throws Throwable {
        C43108m<?> c43108m2 = c43108m;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C43108m.f410934e;
        c43108m2.getClass();
        if (obj2 != C43122v.f411013l) {
            return obj2;
        }
        if (c43108m2.u() == null) {
            return null;
        }
        throw c43108m2.x();
    }
}
