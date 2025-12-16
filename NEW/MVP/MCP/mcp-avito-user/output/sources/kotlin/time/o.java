package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.time.r;

/* compiled from: MonoTimeSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/time/o;", "Lkotlin/time/r$c;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class o implements r.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f410656a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final long f410657b = System.nanoTime();

    public static long a() {
        return System.nanoTime() - f410657b;
    }

    @Y61.k
    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
