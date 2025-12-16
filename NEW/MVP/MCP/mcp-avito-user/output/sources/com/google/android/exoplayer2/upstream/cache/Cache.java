package com.google.android.exoplayer2.upstream.cache;

import j.P;
import j.l0;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface Cache {

    public static class CacheException extends IOException {
    }

    public interface a {
        void a(f fVar);

        void b(q qVar, f fVar, f fVar2);

        void c(q qVar, f fVar);
    }

    @l0
    f a(long j12, long j13, String str);

    long b();

    l c(String str);

    @l0
    void d(String str, k kVar);

    long e(long j12, long j13, String str);

    @l0
    void f(String str);

    long g(long j12, long j13, String str);

    void h(f fVar);

    @P
    @l0
    f i(long j12, long j13, String str);
}
