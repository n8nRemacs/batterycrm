package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.M;

/* compiled from: Blocking.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/p;", "Lkotlinx/coroutines/M;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class p extends M {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final p f401150c = new p();

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        runnable.run();
    }

    @Override // kotlinx.coroutines.M
    public final boolean p(@Y61.k CoroutineContext coroutineContext) {
        return true;
    }
}
