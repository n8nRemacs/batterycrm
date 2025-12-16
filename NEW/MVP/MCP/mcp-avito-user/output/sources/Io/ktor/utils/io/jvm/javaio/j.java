package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;

/* compiled from: Pollers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final ThreadLocal<i<Thread>> f401129a = new ThreadLocal<>();

    @X41.i
    @Y61.k
    public static final i<Thread> a() {
        i<Thread> iVar = f401129a.get();
        return iVar == null ? c.f401111a : iVar;
    }
}
