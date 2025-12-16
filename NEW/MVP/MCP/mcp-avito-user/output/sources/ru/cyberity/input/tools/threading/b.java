package ru.cyberity.input.tools.threading;

import Y61.k;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: SharedExecutor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\"\u0010\u0006\u001a\u00020\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0003\u001a\u0004\b\u0004\u0010\u0002\"\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljava/util/concurrent/ThreadPoolExecutor;", "a", "()Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "b", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "sharedExecutor", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    private static ThreadPoolExecutor f436059a = a();

    @k
    public static final ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    @k
    public static final ThreadPoolExecutor b() {
        return f436059a;
    }
}
