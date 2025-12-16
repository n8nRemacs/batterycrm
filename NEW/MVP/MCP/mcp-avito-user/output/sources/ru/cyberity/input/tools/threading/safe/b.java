package ru.cyberity.input.tools.threading.safe;

import Y61.k;
import j.k0;
import kotlin.Metadata;
import ru.cyberity.log.a;

/* compiled from: Safe.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lru/cyberity/fingerprint/tools/threading/safe/b;", "", "<init>", "()V", "Lkotlin/G0;", "d", "a", "", "b", "()Z", "c", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "runningInsideSafeWithTimeout", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f436062a = new b();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ThreadLocal<Boolean> runningInsideSafeWithTimeout = new ThreadLocal<>();

    private b() {
    }

    @k0
    public final void a() {
        runningInsideSafeWithTimeout.remove();
    }

    @k0
    public final boolean b() {
        Boolean bool = runningInsideSafeWithTimeout.get();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @k0
    public final void c() {
        ru.cyberity.log.b.b(a.f436064a, "Safe", "logIllegalSafeWithTimeoutUsage", new IllegalStateException("logIllegalSafeWithTimeoutUsage"));
    }

    @k0
    public final void d() {
        runningInsideSafeWithTimeout.set(Boolean.TRUE);
    }
}
