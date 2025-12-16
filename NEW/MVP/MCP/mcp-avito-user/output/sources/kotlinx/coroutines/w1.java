package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/w1;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w1 f412301a = new w1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final ThreadLocal<AbstractC43300s0> f412302b = new ThreadLocal<>();

    @Y61.k
    public static AbstractC43300s0 a() {
        ThreadLocal<AbstractC43300s0> threadLocal = f412302b;
        AbstractC43300s0 abstractC43300s0 = threadLocal.get();
        if (abstractC43300s0 != null) {
            return abstractC43300s0;
        }
        C43256j c43256j = new C43256j(Thread.currentThread());
        threadLocal.set(c43256j);
        return c43256j;
    }
}
