package io.ktor.network.util;

import Y61.k;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;

/* compiled from: Pools.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-network"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final io.ktor.utils.io.pool.f f400275a;

    static {
        new io.ktor.utils.io.pool.f(4096, 4096);
        f400275a = new io.ktor.utils.io.pool.f(2048, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }
}
